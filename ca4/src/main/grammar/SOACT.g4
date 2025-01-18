grammar SOACT;

@header{
    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.type.*;
    import main.utils.*;
    import main.ast.nodes.statements.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.operator.*;
    import java.util.ArrayList;
}

soact returns [Soact soactRet]:
    { $soactRet = new Soact();
      $soactRet.setLine(1);}
    (
    a = actorDec { $soactRet.addActorDec($a.actorDecRet); } |
    r = record { $soactRet.addRecordNode($r.recordNodeRet); }
    )*
    m = main { $soactRet.setMain($m.mainRet); }
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
    (v = actorVars { $actorDecRet.setActorVars($v.argRet.vars);
                     $actorDecRet.setAccessExpressions($v.argRet.accessLevels); })?
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
    {$argRet = new ActorVarsDTO();}
    ACTORVAR
    LBRACE
    (
    var = init { $argRet.vars.add($var.varRet); }
        (
        LPAR
        a = accesslevels { $argRet.accessLevels.add(new ArrayList<>($a.accessLevelsRet)); }
        RPAR
        )?
    SEMICOLON
    )*
    RBRACE
;

init returns [VarDeclaration varRet]:
    (
    t1 = type
    id = IDENTIFIER {$varRet = new VarDeclaration(Identifier.createId($id.text ,$id.line), $id.line, $t1.typeRet);}
    (a = arrayIndex { $varRet.setArrayIndex($a.arrayIndexRet); })?
    ) |
    (
    t2 = arrayType
    id = IDENTIFIER {$varRet = new VarDeclaration(Identifier.createId($id.text ,$id.line), $id.line, $t2.arrayTypeRet);}
    ) |
    (
    t3 = container
    id = IDENTIFIER {$varRet = new VarDeclaration(Identifier.createId($id.text ,$id.line), $id.line, $t3.containerRet);}
    )
;

arrayIndex returns [ArrayIndex arrayIndexRet]:
    LBRACK
    i = INT_VALUE { $arrayIndexRet = new ArrayIndex($i.text); }
    RBRACK
;

type returns [Type typeRet]:
    i1 = INT { $typeRet = new IntType(); $typeRet.setLine($i1.line); } |
    s = STRING { $typeRet = new StringType(); $typeRet.setLine($s.line); } |
    b = BOOLEAN { $typeRet = new BooleanType(); $typeRet.setLine($b.line); } |
    i2 = ID { $typeRet = new IdType(); $typeRet.setLine($i2.line); } |
    i3 = IDENTIFIER { $typeRet = new OtherType($i3.text); $typeRet.setLine($i3.line); }
;

container returns [Type containerRet]:
    (
    s = SET |
    l = LIST
    )
    LESS_THAN
    t = type
    {
        if ($l.text == null)
            $containerRet = new SetType($t.typeRet);
        else
            $containerRet = new ListType($t.typeRet);
    }
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
    (a = authorized {$handlerRet.setAuthorizationExpressions($a.authorizeRet); })?
    id_name = IDENTIFIER {$handlerRet.setName(Identifier.createId($id_name.text ,$id_name.line));}
    LPAR
    (args = arguments{$handlerRet.setArgs($args.argsRet);})?
    RPAR
    LBRACE
    b = body {$handlerRet.setBody($b.bodyRet);}
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

arrayType returns [Type arrayTypeRet]:
    t = type { $arrayTypeRet = new ArrayType($t.typeRet); }
    LBRACK
    RBRACK
;

accesslevels returns [ArrayList<Expression> accessLevelsRet]:
    {$accessLevelsRet = new ArrayList<>();}
    (
        (PUBLIC) |
        (PRIVATE)
    )
    LPAR
    p = accesslevelsParam {$accessLevelsRet.addAll($p.accessLevelsParamRet);}
    COMMA
    lp = accesslevelsParam {$accessLevelsRet.addAll($lp.accessLevelsParamRet);}
    RPAR
;

authorized returns [ArrayList<Expression> authorizeRet]:
    {$authorizeRet = new ArrayList<>();}
    AUTHORIZED
    LPAR
    a = accesslevels {$authorizeRet.addAll($a.accessLevelsRet);}
    RPAR
;

accesslevelsParam returns [ArrayList<Expression> accessLevelsParamRet]:
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
    rangeId = IDENTIFIER {$condRet.add(Identifier.createId($rangeId.text, $rangeId.line));} |
    r = range {$condRet.addAll($range.rangeRet);}
    )
    RPAR
;

range returns [ArrayList<Expression> rangeRet]:
    {$rangeRet = new ArrayList<>();}
    RANGE
    LPAR
    ( id1 = IDENTIFIER {$rangeRet.add(Identifier.createId($id1.text, $id1.line));} |
    i1 = INT_VALUE {$rangeRet.add(new IntValue($i1.int));})
    COMMA
    ( id2 = IDENTIFIER {$rangeRet.add(Identifier.createId($id2.text, $id2.line));} |
    i2 = INT_VALUE {$rangeRet.add(new IntValue($i2.int));})
    RPAR
;

whileLoop returns [WhileStatement whileRet]:
    def = WHILE
    LPAR
    ex = expression
    RPAR
    LBRACE
    b = body {$whileRet = new WhileStatement($ex.expRet, $body.bodyRet, $def.line);}
    RBRACE
;

ifBlock returns [IfStatement ifRet]:
    def = IF {$ifRet = new IfStatement($def.line);}
    LPAR
    ifExp = expression {$ifRet.setIfConds($ifExp.expRet);}
    RPAR
    LBRACE
    ifBody = body {$ifRet.setIfBody($ifBody.bodyRet);}
    RBRACE
    (
    elif = ELSE IF
    LPAR
    elseIfExp = expression {$ifRet.addElseIfcond($elseIfExp.expRet);}
    RPAR
    LBRACE
    elseIfBody = body {$ifRet.addElseIfBody($elseIfBody.bodyRet);}
    RBRACE
    )*
    (
    ELSE
    LBRACE
    elseBody = body {$ifRet.setElseBody($elseBody.bodyRet);}
    RBRACE
    )?
;

joinBlock returns [JoinStatement joinRet]:
    def = JOIN {$joinRet = new JoinStatement($def.line);}
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
    {$pipeRet = new PipeStatement($assignee.expRet.getLine());
     $pipeRet.setAssignee($assignee.expRet);}
    ASSIGN
    assigned = expression{$pipeRet.setAssigned($assigned.expRet);}
    (
    PIPE_OP
    pipeExp = expression {$pipeRet.addPipeExp($pipeExp.expRet);}
    )+
    SEMICOLON
;

main returns [Main mainRet]:
    m = MAIN
    LPAR
    RPAR
    LBRACE
    b = body {$mainRet = new Main($b.bodyRet); $mainRet.setLine($m.line); }
    RBRACE
;

body returns [ArrayList<Statement> bodyRet]:
    { $bodyRet = new ArrayList<>(); }
    (
    f1 = forLoop {$bodyRet.add($f1.forRet);} |
    w1 = whileLoop {$bodyRet.add($w1.whileRet);} |
    i1 = ifBlock {$bodyRet.add($i1.ifRet);} |
    j1 = joinBlock {$bodyRet.add($j1.joinRet);} |
    s1 = statements {$bodyRet.add($s1.statementRet);}
    )*
    (
    (
        (
        (c = CONTINUE {ContinueStatement continueStatement = new ContinueStatement(); continueStatement.setLine($c.line); $bodyRet.add(continueStatement);}) |
        (b = BREAK {BreakStatement breakStatement = new BreakStatement(); breakStatement.setLine($b.line); $bodyRet.add(breakStatement);})
        )
    SEMICOLON
    )
    (
    f2 = forLoop {$bodyRet.add($f2.forRet);} |
    w2 = whileLoop {$bodyRet.add($w2.whileRet);}|
    i2 = ifBlock {$bodyRet.add($i2.ifRet);}|
    j2 = joinBlock {$bodyRet.add($j2.joinRet);}|
    s2 = statements {$bodyRet.add($s2.statementRet);}
    )*)?
;

statements returns [Statement statementRet]:
    i = initStatement {$statementRet = $i.initRet;} |
    a = assignStatement {$statementRet = $a.assignRet;} |
    e = exprStatement {$statementRet = $e.expStatementRet;} |
    o = observeStatement {$statementRet = $o.observeRet;}
;

initStatement returns [InitStatement initRet] :
    {Expression assigned = null;}
    i = init
    (
        assign = ASSIGN
        (
            c = constructorCall {assigned = $c.constructRet;} |
            r = initRecord {assigned = $r.recordRet;} |
            e = expression {assigned = $e.expRet;}
        )
    )?
    {$initRet = new InitStatement($i.varRet, assigned, $i.varRet.getLine());}
    SEMICOLON

;

constructorCall returns [ConstructorExpression constructRet]:
    def = NEW id = IDENTIFIER {$constructRet = new ConstructorExpression(Identifier.createId($id.text ,$id.line), $def.line);}
    LPAR (exp = expressionList {$constructRet.setArgs($exp.expressionRet);} )? RPAR // TODO: Ambiguity with expression? We have LPAR RPAR there
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
;

exprStatement returns [ExpressionStatement expStatementRet]:
    exp = expression {$expStatementRet = new ExpressionStatement($exp.expRet, $exp.expRet.getLine());}
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
    LPAR
    (exp = expression {$observeRet.setArgs($exp.expRet);})?
    RPAR
    OBSERVERS
    LPAR
    a = accesslevels {$observeRet.setObservers($a.accessLevelsRet);}
    RPAR
    SEMICOLON
;

expressionList returns [Expression expressionRet]
  : { $expressionRet = new ExpressionList(); }
    e1 = expression { $expressionRet = $e1.expRet; }
    (',' e2 = expression
    {
        if ($expressionRet instanceof ExpressionList) {
            ((ExpressionList) $expressionRet).add($e2.expRet);
        } else {
            $expressionRet = new ExpressionList($expressionRet);
            $expressionRet.add($e2.expRet);

        }
    }
    )*;


expression returns [Expression expRet]
//  : e0 = expressionList
  :
//  e0 = expression COMMA e0_2 = expression
//    {
//        if ($e0.expRet instanceof ExpressionList)
//        {
//            ((ExpressionList) $e0.expRet).addExpression($e0_2.expRet);
//            $expRet = $e0.expRet;
//        }
//        else
//        {
//            ExpressionList exprList = new ExpressionList();
//            exprList.addExpression($e0.expRet);
//            exprList.addExpression($e0_2.expRet);
//            exprList.setLine($COMMA.getLine());
//            $expRet = exprList;
//        }
//        ExpressionList exprList = new ExpressionList();
//        $expRet = new ExpressionList();
//        exprList.addExpression($e0.expRet);
//        exprList.addExpression($e0_2.expRet);
//        exprList.setLine($COMMA.getLine());
//        $expRet = exprList;
//    } |
   e1 = expression (
    INCREMENT { $expRet = new UnaryExpression($e1.expRet, UnaryOperator.POST_INC); }
    | DECREMENT { $expRet = new UnaryExpression($e1.expRet, UnaryOperator.POST_DEC); }
    ) { $expRet.setLine($e1.expRet.getLine()); }
  | e2 = expression LBRACK e3 = expression RBRACK
    {
        $expRet = new BinaryExpression($e2.expRet, $e3.expRet, BinaryOperator.INDEXING);
        $expRet.setLine($e2.expRet.getLine());
    }
  | e4 = expression DOT e5 = expression
    {
        $expRet = new AccessExpression($e4.expRet, $e5.expRet);
        $expRet.setLine($e4.expRet.getLine());
    }
  |  para = LPAR e6 = expression RPAR
    {
        $expRet = $e6.expRet;
        $expRet.setLine($para.line);
    }
  | un = (INCREMENT | DECREMENT) e7 = expression
    {
        String opText = $un.text;
        UnaryOperator op = (opText.equals("++")) ? UnaryOperator.PRE_INC : UnaryOperator.PRE_DEC;
        $expRet = new UnaryExpression($e7.expRet, op);
        $expRet.setLine($un.line);
    }
  | un_ =  MINUS e8 = expression
    {
        $expRet = new UnaryExpression($e8.expRet, UnaryOperator.MINUS);
        $expRet.setLine($un_.line);
    }
  | excla = NOT e9 = expression
    {
        $expRet = new UnaryExpression($e9.expRet, UnaryOperator.NOT);
        $expRet.setLine($excla.line);
    }
  | e10 = expression op = (MULT | DIVIDE | MOD) e11 = expression
    {
        String opText = $op.text;
        BinaryOperator op = (opText.equals("*")) ? BinaryOperator.MULT :
            (opText.equals("/")) ? BinaryOperator.DIVIDE : BinaryOperator.MOD;
        $expRet = new BinaryExpression($e10.expRet, $e11.expRet, op);
        $expRet.setLine($e10.expRet.getLine());
    }
  | e12 = expression op = (PLUS | MINUS) e13 = expression
    {
        String opText = $op.text;
        BinaryOperator op = (opText.equals("+")) ? BinaryOperator.PLUS : BinaryOperator.MINUS;
        $expRet = new BinaryExpression($e12.expRet, $e13.expRet, op);
        $expRet.setLine($e12.expRet.getLine());
    }
  | e14 = expression op = (LESS_THAN | GREATER_THAN) e15 = expression
    {
        String opText = $op.text;
        BinaryOperator op = (opText.equals("<")) ? BinaryOperator.LESS_THAN : BinaryOperator.GREATER_THAN;
        $expRet = new BinaryExpression($e14.expRet, $e15.expRet, op);
        $expRet.setLine($e14.expRet.getLine());
    }
  | e16 = expression op = (EQUAL | NOT_EQUAL) e17 = expression
    {
        String opText = $op.text;
        BinaryOperator op = (opText.equals("==")) ? BinaryOperator.EQUAL : BinaryOperator.NOT_EQUAL;
        $expRet = new BinaryExpression($e16.expRet, $e17.expRet, op);
        $expRet.setLine($e16.expRet.getLine());
    }
  | e18 = expression op = AND e19 = expression
    {
        $expRet = new BinaryExpression($e18.expRet, $e19.expRet, BinaryOperator.AND);
        $expRet.setLine($e18.expRet.getLine());
    }
  | e20 = expression op = OR e21 = expression
    {
        $expRet = new BinaryExpression($e20.expRet, $e21.expRet, BinaryOperator.OR);
        $expRet.setLine($e20.expRet.getLine());
    }
  | lb = LBRACK e22 = expressionList RBRACK
    {
        $expRet = $e22.expressionRet;
        $expRet.setLine($lb.line);
    }
  | primary = primaryExpression
    {
        $expRet = $primary.primaryExpRet;
        $expRet.setLine($primary.primaryExpRet.getLine());
    };

primaryExpression returns [Expression primaryExpRet]:
      (p = primitivesVals { $primaryExpRet = $p.valRet; } |
      h = handlerCall { $primaryExpRet = $h.callExpRet; } |
      c = customPrimAccess { $primaryExpRet = $c.customPrimAccessRet; } |
      i = IDENTIFIER {
              Expression idExp = Identifier.createId($i.text, $i.line);
              idExp.setLine($i.line);
              $primaryExpRet = idExp;
      } |
      s = SELF { $primaryExpRet = new SelfExpression(); })
      ;

customPrimAccess returns [CustomPrimAccessExpression customPrimAccessRet]:
    id1 = IDENTIFIER
    COLON
    COLON
    id2 = IDENTIFIER
    {
    $customPrimAccessRet = new CustomPrimAccessExpression(
        Identifier.createId($id1.text, $id1.line),
        Identifier.createId($id2.text, $id2.line));
    $customPrimAccessRet.setLine($id1.line);
    }
;




handlerCall returns [CallExpression callExpRet]:
    { $callExpRet = new CallExpression();}
    (
    (p = PRINT
        {
        $callExpRet.setLine($p.getLine());
        $callExpRet.setHandlerName($p.text);
        }) |
    (tl = TOLOWER
        {
        $callExpRet.setLine($tl.getLine());
        $callExpRet.setHandlerName($tl.text);

        }) |
    (tu = TOUPPER
        {
        $callExpRet.setLine($tu.getLine());
        $callExpRet.setHandlerName($tu.text);

        }) |
    (rv = REVERSE
        {
        $callExpRet.setLine($rv.getLine());
        $callExpRet.setHandlerName($rv.text);

        }) |
    (a = ADD
        {
        $callExpRet.setLine($a.getLine());
        $callExpRet.setHandlerName($a.text);

        }) |
    (i = INCLUDE
        {
        $callExpRet.setLine($i.getLine());
        $callExpRet.setHandlerName($i.text);
        }) |
    (rm = REMOVE
        {
        $callExpRet.setLine($rm.getLine());
        $callExpRet.setHandlerName($rm.text);
        }) |
    (l = LENGTH
        {
        $callExpRet.setLine($l.getLine());
        $callExpRet.setHandlerName($l.text);
        }) |
    id = IDENTIFIER
        {
        $callExpRet.setLine($id.getLine());
        $callExpRet.setIdentifier(Identifier.createId($id.text, $id.line));
})

    LPAR
    (exp = expressionList {$callExpRet.setExpressions($exp.expressionRet);})?
    RPAR
;

primitivesVals returns [Expression valRet]:
    i = INT_VALUE    {$valRet = new IntValue($i.int);$valRet.setLine($i.line);} |
    s = STRING_VALUE {$valRet = new StringValue($s.text); $valRet.setLine($s.line);} |
    t = TRUE         {$valRet = new BoolValue(true); $valRet.setLine($t.line);} |
    f = FALSE        {$valRet = new BoolValue(false); $valRet.setLine($f.line);}
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