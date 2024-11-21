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

soact
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
            if ($type.is_msgrcv) {
                System.out.println("Line " + $Identifier.getLine() + " : msgRcv: " + $Identifier.getText());
            }
            else if($type.is_msgobs){
                System.out.println("Line " + $Identifier.getLine() + " : msgObs: " + $Identifier.getText());
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
    System.out.println("Line " + $Record.getLine() + " : Record");
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
    : Main {System.out.println("Line " + $Main.getLine() + " : MAIN");} decArgsWithPar statementWithBrace

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
    | function
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
    System.out.println("Line " + $Join.getLine() + " : Join");
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
        System.out.println("Line " + $Continue.getLine() + " : Control: CONTINUE");
     }
     Semi
    ;

whileStatement
    : While
    {
    System.out.println("Line " + $While.getLine() + " : Loop: WHILE");
    }
    whileArgWithPar statementWithBrace
    ;

whileArgWithPar
    : LeftParen expression RightParen
    ;

forStatement
    : For
    {
    System.out.println("Line " + $For.getLine() + " : Loop: FOR");
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
    : ((Self|Identifier) Dot)? Identifier Assign (expression {System.out.println("Line " + $Assign.getLine() + " : Assignment");} ) Semi
    ;

builtInFunctionName
    : ToLower
        {
            System.out.println("Line " + $ToLower.getLine() + " : Built-In: LOWER");
        }
    | ToUpper
        {
            System.out.println("Line " + $ToUpper.getLine() + " : Built-In: UPPER");
        }
    | Reverse
        {
            System.out.println("Line " + $Reverse.getLine() + " : Built-In: REVERSE");
        }
    | Print
        {
            System.out.println("Line " + $Print.getLine() + " : Built-In: PRINT");
        }
    | Private
        {
            System.out.println("Line " + $Private.getLine() + " : Built-In: PRIVATE");
        }
    | Public
        {
            System.out.println("Line " + $Public.getLine() + " : Built-In: PUBLIC");
        }
    | Range
    ;

builtInFunction
    : builtInFunctionName
    argsWithPar
    ;

builtInFunctionList
    : builtInFunctionListName argsWithPar
    ;

builtInFunctionListName
    : Add
        {
            System.out.println("Line " + $Add.getLine() + " : Built-In: ADD");
        }
    | Include
        {
            System.out.println("Line " + $Include.getLine() + " : Built-In: INCLUDE");
        }
    | Remove
        {
            System.out.println("Line " + $Remove.getLine() + " : Built-In: REMOVE");
        }
    | Length
        {
            System.out.println("Line " + $Length.getLine() + " : Built-In: LEN");
        }
    ;

expressionStatement
    : expression Semi
    ;

ifStatement//i did some changes in here
    : If
        {
            System.out.println("Line " + $If.getLine() + " : Decision: IF");
        }
        expressionWithPar statementWithBrace
        (
        Else If//check here
        {
            System.out.println("Line " + $If.getLine() + " : Decision: ELSE IF");
        }
        expressionWithPar statementWithBrace
        )*
        (Else
        {
            System.out.println("Line " + $Else.getLine() + " : Decision: ELSE");
        }
        statementWithBrace
        )?
    ;

// method call
methodCall
    : (Identifier | Self) Dot (builtInFunctionName | Identifier
     {
        System.out.println("Line " + $Dot.getLine() + " : Send Message");
     }
     )
     argsWithPar
     observers?
    ;

objectCall
    : (Identifier | Self) Dot Identifier
    ;

observers
    : AT Observers argsWithPar
    ;

declareVarStatement
    : type Identifier arraySize? initialayzer? (Assign functionCall
    {System.out.println( "Line " + $Assign.getLine() + " : Assignment");}
    )? Semi
    ;

function
    : functionCall Semi
    ;

arraySize
    : LeftBracket expression RightBracket
    ;

initialayzer
    : Assign expression {System.out.println( "Line " + $Assign.getLine() + " : Assignment");}
    ;

functionCall
    : (builtInFunctionListName | Identifier)
    {
        System.out.println( "Line " + $Identifier.getLine() + " : Send Message");
    }
    argsWithPar
    observers?
    ;


// expression
expressionWithPar
    : LeftParen expression RightParen
    ;

expression : logicalOr;

logicalOr
    : logicalAnd (OrOr logicalAnd {System.out.println("Line " + $OrOr.getLine() + " : Operator:||");}  )*
    ;

logicalAnd
    : equality (AndAnd equality {System.out.println("Line " + $AndAnd.getLine() + " : Operator:&&");}  )*
    ;

equality
    : relational (Equal relational {System.out.println("Line " + $Equal.getLine() + " : Operator:==");}
    | NotEqual relational {System.out.println("Line " + $NotEqual.getLine() + " : Operator:!=");}  )*
    ;

relational
    : additive (Less additive {System.out.println("Line " + $Less.getLine() + " : Operator:<");}
    | Greater additive {System.out.println("Line " + $Greater.getLine() + " : Operator:>");})*
    ;

additive
    : multiplicative (Plus multiplicative {System.out.println("Line " + $Plus.getLine() + " : Operator:+");}
    |Minus multiplicative {System.out.println("Line " + $Minus.getLine() + " : Operator:-");} )*
    ;

multiplicative
    : unary (Star unary {System.out.println("Line " + $Star.getLine() + " : Operator:*");}
    | Div unary {System.out.println("Line " + $Div.getLine() + " : Operator:/");}
    | Mod  unary {System.out.println("Line " + $Mod.getLine() + " : Operator:%");}
    )*
    ;

unary
    : PlusPlus unary {System.out.println("Line " + $PlusPlus.getLine() + " : Operator:++");}
    | MinusMinus unary {System.out.println("Line " + $MinusMinus.getLine() + " : Operator:--");}
    | Not unary {System.out.println("Line " + $Not.getLine() + " : Operator:!");}
    | Minus unary {System.out.println("Line " + $Minus.getLine() + " : Operator:-");}
    | postfix
    ;

postfix
    : postfix (
    PlusPlus {System.out.println("Line " + $PlusPlus.getLine() + " : Operator:++");}
    | MinusMinus {System.out.println("Line " + $MinusMinus.getLine() + " : Operator:--");})
    | arrayIndex
    ;

arrayIndex
    : expressionPar (LeftBracket expression RightBracket)?
    ;

expressionPar
    : LeftParen expression RightParen
    | pipe
    ;

pipe
    : terminal (Pipe terminal {System.out.println("Line " + $Pipe.getLine() + " : Operator:|>");} )*
    ;

// terminal
terminal//change some priorities
    : objectCall
    | methodCall
    | actorInstance
    | recordInstance
    | primitiveUse
    | builtInFunction
    | (Self Dot)? StringLiteral
    | Identifier (Dot builtInFunctionList)?
    | Self
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
type returns [boolean is_msgobs = false , boolean is_msgrcv = false]
    : builtInType {
        $is_msgrcv = $builtInType.is_msgrcv;
        $is_msgobs = $builtInType.is_msgobs;
    }
    | Identifier
    ;

builtInType returns [boolean is_msgrcv = false , boolean is_msgobs]
    : Bool
    | Int
    | String
    | Id
    | Actor
    | Primitive
    | MsgRcv {
        $is_msgrcv = true;
    }
    | MsgObs {
        $is_msgobs = true;
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