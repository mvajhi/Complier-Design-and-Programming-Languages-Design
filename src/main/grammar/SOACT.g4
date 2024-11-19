grammar SOACT;

// Lexer rules
// The lexer rules define patterns for recognizing tokens like numbers, booleans, strings,
// comments, keywords, identifiers, and operators in the input text. These rules are used
// by the lexer to break the input into a token stream.

// trash
WS : [ \t\r\n]+ -> skip;
COMMENT : '%' ~[\r\n]* -> skip;

// advanced values
StringLiteral: '"' StringChar* '"';

// symbols
Semi: ';';
DoubleColon: '::';
Colon: ':';
Dot: '.';
AT: '@';
LeftBrace: '{';
RightBrace: '}';

// operators
Pipe: '|>';
PlusPlus: '++';
MinusMinus: '--';
Equal: '==';
NotEqual: '!=';
AndAnd: '&&';
OrOr: '||';
LeftParen: '(';
RightParen: ')';
LeftBracket: '[';
RightBracket: ']';
Plus: '+';
Minus: '-';
Star: '*';
Div: '/';
Mod: 'mod';
And: '&';
Or: '|';
Not: '!';
Assign: '=';
Less: '<';
Greater: '>';
Comma: ',';

// advanced values
IntegerLiteral: '0' | DecimalLiteral;
DecimalLiteral: NONZERODIGIT DIGIT*;
BoolLiteral: True | False;

// types
Bool: 'bool';
Int: 'int';
String: 'string';
Id: 'ID';
Actor: 'Actor';
Primitive: 'primitive';
MsgRcv: 'msgRcv';
MsgObs: 'msgObs';
ActorVars: 'actorVars';
List: 'List';
Set: 'Set';

// keywords
Break: 'break';
Continue: 'continue';
If: 'if';
Else: 'else';
For: 'for';
While: 'while';
Join: 'join';
Record: 'Record';
In: 'in';
New: 'new';
Self: 'self';
Range: 'range';
Observers: 'observers';
Authorized: 'authorized';

// functions
ToLower: 'toLower';
ToUpper: 'toUpper';
Reverse: 'reverse';
Print: 'print';
Main: 'main';
Add: 'add';
Include: 'include';
Remove: 'remove';
Length: 'length';
Private: 'private';
Public: 'public';

// values
True: 'true';
False: 'false';
Null: 'null';

Identifier: NONDIGIT (NONDIGIT | DIGIT)*;

// values
NONDIGIT: [a-zA-Z_];
NONZERODIGIT: [1-9];
DIGIT: [0-9];
StringChar: ~ ["\\\r\n];


// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

start
    : declarationseq? EOF
    ;

declarationseq
    : declaration+
    ;

declaration
    : main
    | actor
    | record
    | decPrimitive
    ;

actor
    : Actor Identifier actorComponentsWithBrace
    ;

actorComponentsWithBrace
    : LeftBrace actorComponents? RightBrace
    ;

actorComponents
    : actorComponent+
    ;

actorComponent
    : actorVars
    | actorConstructor
    | actorMethod
    ;

actorConstructor
    : Identifier decArgsWithPar statementWithBrace
    ;

actorMethod
    : type authorized? Identifier
        {
            if ($type.is_handler) {
                System.out.println("Handler:" + $Identifier.getText());
            }
        }
    decArgsWithPar statementWithBrace

    ;

authorized
    : AT Authorized argsWithPar
    ;

actorVars
    : ActorVars decVarsWithBrace
    ;

record
    : Record
    {
    System.out.println("Record");
    }
    Identifier decVarsWithBrace
    ;

decVarsWithBrace
    : LeftBrace varsRecords RightBrace
    ;

varsRecords
    : decArg Semi varsRecords?
    ;


decPrimitive
    : Primitive Identifier varsPrimitiveWithBrace
    ;

varsPrimitiveWithBrace
    : LeftBrace varsPrimitives RightBrace
    ;

varsPrimitives
    : Identifier (Comma Identifier)*
    ;

main
    : Main {System.out.println("MAIN");} decArgsWithPar statementWithBrace

    ;

// args
decArgsWithPar
    : LeftParen decArgs? RightParen
    ;

decArgs
    : decArg (Comma decArg)*
    ;

decArg
    : type Identifier
    ;

argsWithPar
    : LeftParen args? RightParen
    ;

args
    : expression (Comma expression)*
    ;

recordArgs
    : recordArg (Comma recordArg)*
    ;

recordArg
    : Identifier Colon expression
    ;

// statement
statementWithBrace
    : LeftBrace statementSeq? RightBrace
    ;

statementSeq
    : statement+
    ;

statement
    : declareVarStatement
    | expressionStatement
    | setVarStatement
    | ifStatement
    | forStatement
    | whileStatement
    | joinStatement
    | otherStatement
    ;

joinStatement
    : Join
    {
    System.out.println("Join");
    }
    statementWithBrace
    ;

otherStatement
    : Break
     {
        System.out.println("Control: BREAK");
     }
     Semi
    | Continue
     {
        System.out.println("Control: CONTINUE");
     }
     Semi
    ;

whileStatement
    : While
    {
    System.out.println("Loop: WHILE");
    }
    whileArgWithPar statementWithBrace
    ;

whileArgWithPar
    : LeftParen expression RightParen
    ;

forStatement
    : For
    {
    System.out.println("Loop: FOR");
    }
    forArgWithPar statementWithBrace
    ;

forArgWithPar
    : LeftParen forArg RightParen
    ;

forArg
    : Identifier In expression
    ;

setVarStatement
    : (Self Dot)? Identifier Assign expression {System.out.println("Operator:=");} Semi
    ;

builtInFunction
    : ToLower
    {
        System.out.println("Built-In: LOWER");
    }
    argsWithPar
    | ToUpper
        {
            System.out.println("Built-In: UPPER");
        }
    argsWithPar
    | Reverse
        {
            System.out.println("Built-In: REVERSE");
        }
    argsWithPar
    | Print
        {
            System.out.println("Built-In: PRINT");
        }
    argsWithPar
    | Add
        {
            System.out.println("Built-In: ADD");
        }
    argsWithPar
    | Include
        {
            System.out.println("Built-In: INCLUDE");
        }
    argsWithPar
    | Remove
        {
            System.out.println("Built-In: REMOVE");
        }
    argsWithPar
    | Length
        {
            System.out.println("Built-In: LEN");
        }
    argsWithPar
    | Private
        {
            System.out.println("Built-In: PRIVATE");
        }
    argsWithPar
    | Public
        {
            System.out.println("Built-In: PUBLIC");
        }
    argsWithPar
    | Range
        {
            System.out.println("Built-In: RANGE");
        }
    argsWithPar
    ;

expressionStatement
    : expression Semi
    ;

ifStatement//i did some changes in here
    : If
        {
            System.out.println("Decision:IF");
        }
        expressionWithPar statementWithBrace
        (
        Else If
        {
            System.out.println("Decision:ELSE IF");
        }
        expressionWithPar statementWithBrace
        )*
        (Else
        {
            System.out.println("Decision:ELSE");
        }
        statementWithBrace
        )?
    ;
// method call
methodCall
    : (Identifier | Self) Dot Identifier argsWithPar observers?
    ;

observers
    : AT Observers argsWithPar
    ;

declareVarStatement
    : type Identifier arraySize? initialayzer? Semi
    ;

arraySize
    : LeftBracket expression RightBracket
    ;

initialayzer
    : Assign expression {System.out.println("Operator:=");}
    ;

// expression
expressionWithPar
    : LeftParen expression RightParen
    ;

expression : logicalOr ;

logicalOr
    : logicalAnd (OrOr {System.out.println("Operator:||");} logicalOr )?
    ;

logicalAnd
    : equality (AndAnd {System.out.println("Operator:&&");} logicalAnd)?
    ;

equality
    : relational (Equal {System.out.println("Operator:==");} equality | NotEqual {System.out.println("Operator:!=");} equality)?
    ;

relational
    : additive (Less {System.out.println("Operator:<");} relational| Greater {System.out.println("Operator:>");} relational)?
    ;

additive
    : multiplicative (Plus {System.out.println("Operator:+");} additive | Minus {System.out.println("Operator:-");} additive)?
    ;

multiplicative
    : unary (Star {System.out.println("Operator:*");} multiplicative | Div {System.out.println("Operator:/");} multiplicative |
    Mod {System.out.println("Operator:%");} multiplicative )?
    ;

unary
    : PlusPlus {System.out.println("Operator:++");} unary | MinusMinus {System.out.println("Operator:--");} unary
    | Not {System.out.println("Operator:!");} unary| Minus {System.out.println("Operator:-");} unary
    | postfix
    ;

postfix
    : arrayIndex (PlusPlus {System.out.println("Operator:++");} | MinusMinus {System.out.println("Operator:--");})?
    ;

arrayIndex
    : expressionPar (LeftBracket expression RightBracket)?
    ;

expressionPar
    : LeftParen expression RightParen
    | pipe
    ;

pipe
    : terminal (Pipe pipe {System.out.println("Operator:|>");})?
    ;

// terminal
terminal
    : methodCall
    | actorInstance
    | recordInstance
    | primitiveUse
    | builtInFunction
    | (Self Dot)? StringLiteral
    | Identifier
    | IntegerLiteral
    | BoolLiteral
    | Null
    ;

primitiveUse
    : Identifier DoubleColon Identifier
    ;

actorInstance
    : New Identifier argsWithPar
    ;

recordInstance
    : Identifier LeftBrace recordArgs RightBrace
    ;

// types
type returns [boolean is_handler = false]
    : builtInType {
        $is_handler = $builtInType.is_handler;
    }
    | Identifier
    ;

builtInType returns [boolean is_handler = false]
    : Bool
    | Int
    | String
    | Id
    | Actor
    | Primitive
    | MsgRcv {
        $is_handler = true;
    }
    | MsgObs {
        $is_handler = true;
    }
    | ActorVars
    | list
    | set
    ;

set
    : Set Less type Greater
    ;

list
    : List Less type Greater
    ;