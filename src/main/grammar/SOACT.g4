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
Doublecolon: '::';
Colon: ':';
Dot: '.';
AT: '@';
LeftBrace: '{';
RightBrace: '}';

// operators
Pipe: '<|';
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
DecimalLiteral: NONZERODIGIT DIGIT*;
IntegerLiteral: '0' | DecimalLiteral;
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


// TODO

// Parser rules
// The parser rules start with the program rule, which defines the overall structure of a
// valid program. They then specify how tokens can be combined to form declarations, control
// structures, expressions, assignments, function calls, and other constructs within a program.
// The parser rules collectively define the syntax of the language.

// TODO