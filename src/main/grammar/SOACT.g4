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
    : type authorized? Identifier decArgsWithPar statementWithBrace
    ;

authorized
    : AT Authorized argsWithPar
    ;

actorVars
    : ActorVars decVarsWithBrace
    ;

record
    : Record Identifier decVarsWithBrace
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
    : Main decArgsWithPar statementWithBrace
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
    : Join statementWithBrace
    ;

otherStatement
    : Break Semi
    | Continue Semi
    ;

whileStatement
    : While whileArgWithPar statementWithBrace
    ;

whileArgWithPar
    : LeftParen expression RightParen
    ;

forStatement
    : For forArgWithPar statementWithBrace
    ;

forArgWithPar
    : LeftParen forArg RightParen
    ;

forArg
    : Identifier In expression
    ;

setVarStatement
    : (Self Dot)? Identifier Assign expression Semi
    ;

builtInFunctionName
    : ToLower
    | ToUpper
    | Reverse
    | Print
    | Private
    | Public
    | Range
    ;

builtInFunction
    : builtInFunctionName argsWithPar
    ;

builtInFunctionList
    : builtInFunctionListName argsWithPar
    ;

builtInFunctionListName
    : Add
    | Remove
    | Include
    | Length
    ;

expressionStatement
    : expression Semi
    ;

ifStatement
    : If expressionWithPar statementWithBrace (Else statementWithBrace)?
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
    : Assign expression
    ;

// expression
expressionWithPar
    : LeftParen expression RightParen
    ;

expression : logicalOr ;

logicalOr
    : logicalAnd (OrOr logicalOr)?
    ;

logicalAnd
    : equality (AndAnd logicalAnd)?
    ;

equality
    : relational ((Equal | NotEqual) equality)?
    ;

relational
    : additive ((Less | Greater) relational)?
    ;

additive
    : multiplicative ((Plus | Minus) additive)?
    ;

multiplicative
    : unary ((Star | Div | Mod) multiplicative)?
    ;

unary
    : (PlusPlus | MinusMinus | Not | Minus) unary
    | postfix
    ;

postfix
    : arrayIndex (PlusPlus | MinusMinus)?
    ;

arrayIndex
    : expressionPar (LeftBracket expression RightBracket)?
    ;

expressionPar
    : LeftParen expression RightParen
    | pipe
    ;

pipe
    : terminal (Pipe pipe)?
    ;

// terminal
terminal
    : methodCall
    | actorInstance
    | recordInstance
    | primitiveUse
    | builtInFunction
    | (Self Dot)? StringLiteral
    | Identifier (Dot builtInFunctionList)?
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
type
    : builtInType
    | Identifier
    ;

builtInType
    : Bool
    | Int
    | String
    | Id
    | Actor
    | Primitive
    | MsgRcv
    | MsgObs
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