grammar SOACT;

// Lexer rules
// The lexer rules define patterns for recognizing tokens like numbers, booleans, strings,
// comments, keywords, identifiers, and operators in the input text. These rules are used
// by the lexer to break the input into a token stream.

// trash
WS : [ \t\r\n]+ -> skip;
COMMENT : '%' ~[\r\n]* -> skip;

// symbols
Semi: ';';
Colon: ':';
Doublecolon: '::';
Dot: '.';
AT: '@';
LeftBrace: '{';
RightBrace: '}';

// operators
Pipe: '<|';
LeftParen: '(';
RightParen: ')';
LeftBracket: '[';
RightBracket: ']';
Plus: '+';
Minus: '-';
Star: '*';
Div: '/';
Mod: '%';
And: '&';
Or: '|';
Not: '!';
Assign: '=';
PlusPlus: '++';
MinusMinus: '--';
Less: '<';
Greater: '>';
Equal: '==';
NotEqual: '!=';
AndAnd: '&&';
OrOr: '||';
Comma: ',';

// values
NONDIGIT: [a-zA-Z_];
NONZERODIGIT: [1-9];
DIGIT: [0-9];
StringChar: ~ ["\\\r\n];
True: 'true';
False: 'false';
Null: 'null';

// advanced values
DecimalLiteral: NONZERODIGIT DIGIT*;
Identifier: NONDIGIT (NONDIGIT | DIGIT)*;
IntegerLiteral: '0' | DecimalLiteral;
StringLiteral: '"' StringChar* '"';
BoolLiteral: True | False;

// types
Bool: 'bool';
Int: 'int';
String: 'string';
Id: 'ID';
List: 'List';
Set: 'Set';
Actor: 'Actor';
Primitive: 'primitive';
MsgRcv: 'msgRcv';
MsgObs: 'msgObs';
ActorVars: 'actorVars';

// keywords
Break: 'break';
Continue: 'continue';
If: 'if';
Else: 'else';
For: 'for';
While: 'while';
Join: 'join';
Record: 'record';
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


// TODO

// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// TODO