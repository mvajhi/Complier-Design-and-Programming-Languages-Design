grammar SOACT;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.utils.*;
    import main.ast.nodes.statements.*;
    import main.ast.nodes.expression.value.*;
    import java.util.ArrayList;
}

soact returns [Soact soactRet]:
    { $soactRet = new Soact();
      $soactRet.setLine(1);}
    (
    a = actorDec { $soactRet.addActorDec($a.actorDecRet); } |
    r = record { $soactRet.addRecordNode($r.recordNodeRet); }
    )*
    m = main {$soactRet.setMain($m.mainRet);}
;

record returns [RecordNode recordNodeRet]:
    rec = RECORD
    id = IDENTIFIER
    { Identifier identifier = Identifier.createId($id.text ,$id.line);
    $recordNodeRet = new RecordNode(identifier, $rec.line);}
    LBRACE
    (
    var = init {$recordNodeRet.addVar($var.varRet);}
    SEMICOLON
    )+
    RBRACE
;

actorDec returns [ActorDec actorDecRet]:
    def = ACTOR
    id = IDENTIFIER
    { $actorDecRet = new ActorDec(Identifier.createId($id.text ,$id.line), $def.line); }
    LBRACE
    (c = customPrimitive{$actorDecRet.addCustomPrimitive($c.cpRet);})*
    (v = actorVars {$actorDecRet.setActorVars($v.argRet.vars);
                    $actorDecRet.setAccessExpressions($v.argRet.accessLevels);})?
    (cs = constructor{$actorDecRet.setConstructor($cs.constructorRet);})?
    (h = msgHandler{$actorDecRet.addHandler($h.handlerRet);})*
    RBRACE
;

customPrimitive returns [CustomPrimitiveDeclaration cpRet]:
    p = PRIMITIVE
    id = IDENTIFIER{$cpRet = new CustomPrimitiveDeclaration(Identifier.createId($id.text ,$id.line), $p.line);}
    LBRACE
    (stateId = IDENTIFIER {$cpRet.addState(Identifier.createId($stateId.text ,$stateId.line));} COMMA)*
    lastStateId = IDENTIFIER {$cpRet.addState(Identifier.createId($lastStateId.text ,$lastStateId.line));}
    RBRACE
;

actorVars returns [ActorVarsDTO argRet]:
    ACTORVAR
    LBRACE
    (
    var = init{$argRet.vars.add($var.varRet);}
        (
        LPAR
        a = accesslevels {$argRet.accessLevels.add($a.accessLevelsRet);}
        RPAR
        )?
    SEMICOLON
    )*
    RBRACE
;

init returns [VarDeclaration varRet]:
    (
    primitives
    id = IDENTIFIER {$varRet = new VarDeclaration(Identifier.createId($id.text ,$id.line), $id.line);}
    (arrayIndex)?
    ) |
    (
    arrayType
    id = IDENTIFIER {$varRet = new VarDeclaration(Identifier.createId($id.text ,$id.line), $id.line);}
    ) |
    (
    container
    id = IDENTIFIER {$varRet = new VarDeclaration(Identifier.createId($id.text ,$id.line), $id.line);}
    )
;

arrayIndex:
    LBRACK
    INT_VALUE
    RBRACK
;

primitives:
    INT |
    STRING |
    BOOLEAN |
    ID |
    IDENTIFIER
;

container:
    (
    SET |
    LIST
    )
    LESS_THAN
    primitives
    GREATER_THAN
;

constructor returns [ConstructorDto constructorRet]:
    {$constructorRet = new ConstructorDto();}
    id = IDENTIFIER {$constructorRet.name = $id.text;}
    LPAR
    (args = arguments
    {$constructorRet.args.addAll($args.argsRet);})?
    RPAR
    LBRACE
    b = body {$constructorRet.body.addAll($b.bodyRet);}
    RBRACE
;

msgHandler returns [Handler handlerRet]:
    {String type ;}
    (srv = MSGRCV {type = $srv.text;
                   $handlerRet = new ServiceHandler($srv.line);}|
    obs = MSGOBS {type = $obs.text;
                  $handlerRet = new ObserveHandler($obs.line);})
    (a = authorized {$handlerRet.setAuthorizationExpressions($a.authorizeRet);})?
    id_name = IDENTIFIER {$handlerRet.setName(Identifier.createId($id_name.text ,$id_name.line));}
    {System.out.println("Line " + $id_name.getLine() + " : " + type + ": " + $id_name.text);}
    LPAR
    (args = arguments{$handlerRet.setArgs($args.argsRet);})?
    RPAR
    LBRACE
    b = body {$handlerRet.setBody($b.bodyRet);} //TODO: fixCrashes caused by body
    RBRACE
;

arguments returns [ArrayList<VarDeclaration> argsRet]:
    {$argsRet = new ArrayList<>();}
    arg = init {$argsRet.add($arg.varRet);}
    (
    COMMA
    otherArg = init {$argsRet.add($otherArg.varRet);}
    )*
;

arrayType:
    primitives
    LBRACK
    RBRACK
;

accesslevels returns [List<Expression> accessLevelsRet]:
    {$accessLevelsRet = new ArrayList<>();}
    (
        (PUBLIC {System.out.println("Line " + $PUBLIC.getLine() + " : " + "Built-In: PUBLIC");}) |
        (PRIVATE {System.out.println("Line " + $PRIVATE.getLine() + " : " + "Built-In: PRIVATE");})
    )
    LPAR
    p = accesslevelsParam {$accessLevelsRet.addAll($p.accessLevelsParamRet);}
    COMMA
    lp = accesslevelsParam {$accessLevelsRet.addAll($lp.accessLevelsParamRet);}
    RPAR
;

authorized returns [List<Expression> authorizeRet]:
    {$authorizeRet = new ArrayList<>();}
    AUTHORIZED
    LPAR
    a = accesslevels {$authorizeRet.addAll($a.accessLevelsRet);}
    RPAR
;

accesslevelsParam returns [List<Expression> accessLevelsParamRet]:
    {$accessLevelsParamRet = new ArrayList<>();}
    (
    id = IDENTIFIER {$accessLevelsParamRet.add(Identifier.createId($id.text, $id.line));}|
    NULL |
    SELF |
    a = accesslevels {$accessLevelsParamRet.addAll($a.accessLevelsRet);}
    )
;

forLoop returns [ForStatement forRet]:
    def = FOR
    {System.out.println("Line " + $def.getLine() + " : " + "Loop: FOR");}
    c = forLoopCondition
    LBRACE
    b = body {$forRet = new ForStatement($c.condRet, $b.bodyRet, $def.line);}
    RBRACE
;

forLoopCondition returns [ArrayList<Expression> condRet]:
    {$condRet = new ArrayList<>();}
    LPAR
    id = IDENTIFIER {$condRet.add(Identifier.createId($id.text, $id.line));}
    IN
    (
    rangeId = IDENTIFIER {$condRet.add(Identifier.createId($rangeId.text, $rangeId.line));}|
    r = range {$condRet.addAll($range.rangeRet);}
    )
    RPAR
;

range returns [ArrayList<Expression> rangeRet]:
    {$rangeRet = new ArrayList<>();}
    RANGE
    LPAR
    ( id1 = IDENTIFIER {$rangeRet.add(Identifier.createId($id1.text, $id1.line));} |
    INT_VALUE {$rangeRet.add(new IntValue());})
    COMMA
    ( id2 = IDENTIFIER {$rangeRet.add(Identifier.createId($id2.text, $id2.line));} |
    INT_VALUE {$rangeRet.add(new IntValue());})
    RPAR
;

whileLoop returns [WhileStatement whileRet]:
    def = WHILE
    {System.out.println("Line " + $def.getLine() + " : " + "Loop: WHILE");}
    LPAR
    ex = expression
    RPAR
    RPAR
    LBRACE
    b = body {$whileRet = new WhileStatement($ex.expRet, $body.bodyRet, $def.line);}
    RBRACE
;

ifBlock returns [IfStatement ifRet]:
    def = IF {$ifRet = new IfStatement($def.line);}
    {System.out.println("Line " + $IF.getLine() + " : " + "Decision: IF");}
    LPAR
    ifExp = expression {$ifRet.setIfConds($ifExp.expRet);}
    RPAR
    LBRACE
    ifBody = body {$ifRet.setIfBody($ifBody.bodyRet);}
    RBRACE
    (
    elif = ELSE IF
    {System.out.println("Line " + $elif.getLine() + " : " + "Decision: ELSE IF");}
    LPAR
    elseIfExp = expression {$ifRet.addElseIfcond($elseIfExp.expRet);}
    RPAR
    LBRACE
    elseIfBody = body {$ifRet.addElseIfBody($elseIfBody.bodyRet);}
    RBRACE
    )*
    (
    ELSE
    {System.out.println("Line " + $ELSE.getLine() + " : " + "Decision: ELSE");}
    LBRACE
    elseBody = body {$ifRet.setElseBody($elseBody.bodyRet);}
    RBRACE
    )?
;

joinBlock returns [JoinStatement joinRet]:
    def = JOIN {$joinRet = new JoinStatement($def.line);}
    {System.out.println("Line " + $def.getLine() + " : " + "Join");}
    LBRACE
    jb = joinBlockBody {$joinRet.setBody($jb.joinBodyRet);}
    RBRACE
;

joinBlockBody returns [ArrayList<Statement> joinBodyRet]:
    {$joinBodyRet = new ArrayList<>();}
    b1 = body {$joinBodyRet.addAll($b1.bodyRet);}
    (
    p = pipeStatement {$joinBodyRet.add($p.pipeRet);}
    b2 = body {$joinBodyRet.addAll($b2.bodyRet);}
    )?
;

pipeStatement returns [PipeStatement pipeRet]:
    assignee = expression
    {$pipeRet = new PipeStatement($assignee.expRet.getFirst().getLine());
     $pipeRet.setAssignee($assignee.expRet);}
    ASSIGN
    assigned = expression{$pipeRet.setAssigned($assigned.expRet);}
    (
    PIPE_OP
    pipeExp = expression {$pipeRet.addPipeExp($pipeExp.expRet);}
    {System.out.println("Line " + $PIPE_OP.getLine() + " : " + "Operator:|>");}
    )+
    {System.out.println("Line " + $ASSIGN.getLine() + " : " + "Assignment");}
    SEMICOLON
;

main returns [ArrayList<Statement> mainRet]:
    MAIN
    {System.out.println("Line " + $MAIN.getLine() + " : " + "MAIN");}
    LPAR
    RPAR
    LBRACE
    b = body {$mainRet = $b.bodyRet;}
    RBRACE
;

body returns [ArrayList<Statement> bodyRet]:
    (
    {$bodyRet = new ArrayList<>();}
    f1 = forLoop {$bodyRet.add($f1.forRet);} |
    w1 = whileLoop {$bodyRet.add($w1.whileRet);} |
    i1 = ifBlock {$bodyRet.add($i1.ifRet);}|
    j1 = joinBlock {$bodyRet.add($j1.joinRet);}|
    statements
    )*
    (
    (
        (
        (CONTINUE {System.out.println("Line " + $CONTINUE.getLine() + " : " + "Control: CONTINUE");}) |
        (BREAK {System.out.println("Line " + $BREAK.getLine() + " : " + "Control: BREAK");})
        )
    SEMICOLON
    )
    (
    f2 = forLoop {$bodyRet.add($f2.forRet);} |
    w2 = whileLoop {$bodyRet.add($w2.whileRet);}|
    i2 = ifBlock {$bodyRet.add($i2.ifRet);}|
    j2 = joinBlock {$bodyRet.add($j2.joinRet);}|
    statements
    )*)?
;

statements returns [Statement statementRet]:
    i = initStatement {$statementRet = $i.initRet;}|
    a = assignStatement {$statementRet = $a.assignRet;}|
    e = exprStatement {$statementRet = $e.expStatementRet;} |
    o = observeStatement {$statementRet = $o.observeRet;}
;

initStatement returns [InitStatement initRet] :
    {List<Expression> assigned = new ArrayList<>();}
    i = init
    (
        assign = ASSIGN
        (
            c = constructorCall {assigned.add($c.constructRet);} |
            r = initRecord {assigned.add($r.recordRet);}|
            e = expression {assigned.addAll($e.expRet);}
        )
        {System.out.println("Line " + $assign.getLine() + " : " + "Assignment");}
    )?
    {$initRet = new InitStatement($i.varRet, assigned, $i.varRet.getLine());}
    SEMICOLON

;

constructorCall returns [ConstructorExpression constructRet]:
    def = NEW id = IDENTIFIER {$constructRet = new ConstructorExpression(Identifier.createId($id.text ,$id.line), $def.line);}
    LPAR (exp = expression {$constructRet.setArgs($exp.expRet);} )? RPAR
;

initRecord returns [InitRecord recordRet]:
    name = IDENTIFIER {$recordRet = new InitRecord(Identifier.createId($name.text ,$name.line), $name.line);}
    LBRACE
    (
    fi = IDENTIFIER {$recordRet.addFieldName(Identifier.createId($fi.text ,$fi.line));}
    COLON
    fe = expression {$recordRet.addFieldValue($fe.expRet);}
    COMMA
    )*
    lfi = IDENTIFIER {$recordRet.addFieldName(Identifier.createId($lfi.text ,$lfi.line));}
    COLON
    lfe = expression {$recordRet.addFieldValue($lfe.expRet);}
    RBRACE
;

assignStatement returns [AssignmentStatement assignRet]:
    {$assignRet = new AssignmentStatement();}
    (id = IDENTIFIER {$assignRet.setLine($id.line);
                      $assignRet.addIdentifier(Identifier.createId($id.text ,$id.line));} |
                      SELF DOT id2 = IDENTIFIER {$assignRet.setLine($SELF.line);
                                                 $assignRet.addIdentifier(Identifier.createId($id2.text ,$id2.line));})
    (DOT id3 = IDENTIFIER {$assignRet.addIdentifier(Identifier.createId($id3.text ,$id3.line));})*
    (arrayIndex)?
    assign = ASSIGN
    (NEW)?
    exp = expression {$assignRet.setAssigned($exp.expRet);}
    SEMICOLON
    {System.out.println("Line " + $assign.getLine() + " : " + "Assignment");}
;

exprStatement returns [ExpressionStatement expStatementRet]:
    exp = expression {$expStatementRet = new ExpressionStatement($exp.expRet, $exp.expRet.getFirst().getLine());}
    SEMICOLON
;

observeStatement returns [ObserveStatement observeRet]:
    {int line = -1;
     $observeRet = new ObserveStatement();}
    (
        (
        id1 = IDENTIFIER {line = $id1.line;
                          $observeRet.addId(Identifier.createId($id1.text, $id1.line));} |
        s = SELF {line = $s.line;}
        )
        DOT
    )?
    id = IDENTIFIER {if(line == -1)
                         line = $id.line;
                     $observeRet.setLine(line);
                     $observeRet.addId(Identifier.createId($id1.text, $id1.line));}
    {System.out.println("Line " + $id.getLine() + " : " + "Send Message");}
    LPAR
    (exp = expression {$observeRet.setArgs($exp.expRet);})?
    RPAR
    OBSERVERS
    LPAR
    a = accesslevels {$observeRet.setObservers($a.accessLevelsRet);}
    RPAR
    SEMICOLON

;

expression returns [ArrayList<Expression> expRet]:
    {$expRet = new ArrayList<>();}
    expComma |
    expComma
    COMMA
    expression
;

expComma: expOr | expOr OR expComma {System.out.println("Line " + $OR.getLine() + " : " + "Operator:||");};

expOr: expAnd | expAnd AND expOr {System.out.println("Line " + $AND.getLine() + " : " + "Operator:&&");};

expAnd: expEquals expAndPrim;

expAndPrim: (equals_name = (NOT_EQUAL | EQUAL)  expEquals {System.out.println("Line " + $equals_name.getLine() + " : " + "Operator:" + $equals_name.text);} expAndPrim)?;

expEquals: expCompare expEqualsPrim;

expEqualsPrim: (than_name = (LESS_THAN | GREATER_THAN) expCompare {System.out.println("Line " + $than_name.getLine() + " : " + "Operator:" + $than_name.text);} expEqualsPrim)?;

expCompare: expPlusMinus expComparePrim;

expComparePrim: (pm_name = (PLUS | MINUS) expPlusMinus {System.out.println("Line " + $pm_name.getLine() + " : " + "Operator:" + $pm_name.text);} expComparePrim)?;

expPlusMinus: expDivideMultMod expPlusMinusPrim;

expPlusMinusPrim: (dmd_name = (DIVIDE | MULT | MOD) expDivideMultMod {System.out.println("Line " + $dmd_name.getLine() + " : " + "Operator:" + $dmd_name.text);} expPlusMinusPrim)?;

expDivideMultMod: expPreUnary | bmndi = (MINUS | NOT | DECREMENT | INCREMENT) expDivideMultMod {System.out.println("Line " + $bmndi.getLine() + " : " + "Operator:" + $bmndi.text);};

expPreUnary: expPostUnary expPreUnaryPrim;

expPreUnaryPrim: (id_name = (INCREMENT | DECREMENT) expPreUnaryPrim {System.out.println("Line " + $id_name.getLine() + " : " + "Operator:" + $id_name.text);})?;

expPostUnary: expBracket | LBRACK expression RBRACK;

expBracket: expAccess | expAccess DOT expBracket;

expAccess: expPar | LPAR expression RPAR;

expPar:
    primitivesVals |
    handlerCall |
    customPrimAccess |
    IDENTIFIER |
    SELF
;

customPrimAccess:
    IDENTIFIER
    COLON
    COLON
    IDENTIFIER
;

handlerCall:
    (
    (PRINT {System.out.println("Line " + $PRINT.getLine() + " : " + "Built-In: PRINT");}) |
    (TOLOWER {System.out.println("Line " + $TOLOWER.getLine() + " : " + "Built-In: LOWER");}) |
    (TOUPPER {System.out.println("Line " + $TOUPPER.getLine() + " : " + "Built-In: UPPER");}) |
    (REVERSE {System.out.println("Line " + $REVERSE.getLine() + " : " + "Built-In: REVERSE");}) |
    (ADD {System.out.println("Line " + $ADD.getLine() + " : " + "Built-In: ADD");}) |
    (INCLUDE {System.out.println("Line " + $INCLUDE.getLine() + " : " + "Built-In: INCLUDE");}) |
    (REMOVE {System.out.println("Line " + $REMOVE.getLine() + " : " + "Built-In: REMOVE");}) |
    (LENGTH {System.out.println("Line " + $LENGTH.getLine() + " : " + "Built-In: LEN");}) |
    IDENTIFIER {System.out.println("Line " + $IDENTIFIER.getLine() + " : " + "Send Message");}
    )
    LPAR
    (expression)?
    RPAR
;

primitivesVals:
    INT_VALUE |
    STRING_VALUE |
    TRUE |
    FALSE
;

ACTOR: 'Actor';
INT: 'int';
IF: 'if';
STRING: 'string';
OBSERVERS: '@observers';
MSGRCV: 'msgRcv';
SELF: 'self';
TRUE: 'true';
ELSE: 'else';
BREAK: 'break';
FOR: 'for';
MSGOBS: 'msgObs';
PUBLIC: 'public';
FALSE: 'false';
BOOLEAN: 'boolean';
CONTINUE: 'continue';
WHILE: 'while';
AUTHORIZED: '@authorized';
RANGE: 'range';
NULL: 'null';
JOIN: 'join';
PRIVATE: 'private';
TOUPPER: 'toUpper';
TOLOWER: 'toLower';
LENGTH: 'length';
SET: 'Set';
LIST: 'List';
ACTORVAR: 'actorVars';
REMOVE: 'remove';
INCLUDE: 'include';
ADD: 'add';
MAIN: 'main';
PRINT: 'print';
REVERSE: 'reverse';
NEW: 'new';
ID: 'ID';
PRIMITIVE: 'primitive';
IN: 'in';
RECORD: 'Record';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';
MOD: 'mod';

PIPE_OP: '|>';

EQUAL: '==';
NOT_EQUAL: '!=';
GREATER_THAN: '>';
LESS_THAN: '<';

AND: '&&';
OR: '||';
NOT: '!';
INCREMENT: '++';
DECREMENT: '--';

QUESTION_MARK: '?';
ASSIGN: '=';

LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';

COMMA: ',';
DOT: '.';
SEMICOLON: ';';
COLON: ':';

INT_VALUE: '0' | [1-9][0-9]*;

IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;
STRING_VALUE: '"'~["]*'"';

COMMENT: ('%' ~( '\r' | '\n')*) -> skip;
WS: ([ \t\n\r]) -> skip;