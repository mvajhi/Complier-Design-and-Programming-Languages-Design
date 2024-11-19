// Generated from /home/sadra/Documents/Codes/Compiler/Complier-Design-and-Programming-Languages-Design/src/main/grammar/SOACT.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SOACTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, StringLiteral=3, Semi=4, DoubleColon=5, Colon=6, Dot=7, 
		AT=8, LeftBrace=9, RightBrace=10, Pipe=11, PlusPlus=12, MinusMinus=13, 
		Equal=14, NotEqual=15, AndAnd=16, OrOr=17, LeftParen=18, RightParen=19, 
		LeftBracket=20, RightBracket=21, Plus=22, Minus=23, Star=24, Div=25, Mod=26, 
		And=27, Or=28, Not=29, Assign=30, Less=31, Greater=32, Comma=33, IntegerLiteral=34, 
		DecimalLiteral=35, BoolLiteral=36, Bool=37, Int=38, String=39, Id=40, 
		Actor=41, Primitive=42, MsgRcv=43, MsgObs=44, ActorVars=45, List=46, Set=47, 
		Break=48, Continue=49, If=50, Else=51, For=52, While=53, Join=54, Record=55, 
		In=56, New=57, Self=58, Range=59, Observers=60, Authorized=61, ToLower=62, 
		ToUpper=63, Reverse=64, Print=65, Main=66, Add=67, Include=68, Remove=69, 
		Length=70, Private=71, Public=72, True=73, False=74, Null=75, Identifier=76, 
		NONDIGIT=77, NONZERODIGIT=78, DIGIT=79, StringChar=80;
	public static final int
		RULE_start = 0, RULE_declarationseq = 1, RULE_declaration = 2, RULE_actor = 3, 
		RULE_actorComponentsWithBrace = 4, RULE_actorComponents = 5, RULE_actorComponent = 6, 
		RULE_actorConstructor = 7, RULE_actorMethod = 8, RULE_authorized = 9, 
		RULE_actorVars = 10, RULE_record = 11, RULE_decVarsWithBrace = 12, RULE_varsRecords = 13, 
		RULE_decPrimitive = 14, RULE_varsPrimitiveWithBrace = 15, RULE_varsPrimitives = 16, 
		RULE_main = 17, RULE_decArgsWithPar = 18, RULE_decArgs = 19, RULE_decArg = 20, 
		RULE_argsWithPar = 21, RULE_args = 22, RULE_recordArgs = 23, RULE_recordArg = 24, 
		RULE_statementWithBrace = 25, RULE_statementSeq = 26, RULE_statement = 27, 
		RULE_joinStatement = 28, RULE_otherStatement = 29, RULE_whileStatement = 30, 
		RULE_whileArgWithPar = 31, RULE_forStatement = 32, RULE_forArgWithPar = 33, 
		RULE_forArg = 34, RULE_setVarStatement = 35, RULE_builtInFunctionName = 36, 
		RULE_builtInFunction = 37, RULE_builtInFunctionList = 38, RULE_builtInFunctionListName = 39, 
		RULE_expressionStatement = 40, RULE_ifStatement = 41, RULE_methodCall = 42, 
		RULE_observers = 43, RULE_declareVarStatement = 44, RULE_arraySize = 45, 
		RULE_initialayzer = 46, RULE_expressionWithPar = 47, RULE_expression = 48, 
		RULE_logicalOr = 49, RULE_logicalAnd = 50, RULE_equality = 51, RULE_relational = 52, 
		RULE_additive = 53, RULE_multiplicative = 54, RULE_unary = 55, RULE_postfix = 56, 
		RULE_arrayIndex = 57, RULE_expressionPar = 58, RULE_pipe = 59, RULE_terminal = 60, 
		RULE_primitiveUse = 61, RULE_actorInstance = 62, RULE_recordInstance = 63, 
		RULE_type = 64, RULE_builtInType = 65, RULE_set = 66, RULE_list = 67;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declarationseq", "declaration", "actor", "actorComponentsWithBrace", 
			"actorComponents", "actorComponent", "actorConstructor", "actorMethod", 
			"authorized", "actorVars", "record", "decVarsWithBrace", "varsRecords", 
			"decPrimitive", "varsPrimitiveWithBrace", "varsPrimitives", "main", "decArgsWithPar", 
			"decArgs", "decArg", "argsWithPar", "args", "recordArgs", "recordArg", 
			"statementWithBrace", "statementSeq", "statement", "joinStatement", "otherStatement", 
			"whileStatement", "whileArgWithPar", "forStatement", "forArgWithPar", 
			"forArg", "setVarStatement", "builtInFunctionName", "builtInFunction", 
			"builtInFunctionList", "builtInFunctionListName", "expressionStatement", 
			"ifStatement", "methodCall", "observers", "declareVarStatement", "arraySize", 
			"initialayzer", "expressionWithPar", "expression", "logicalOr", "logicalAnd", 
			"equality", "relational", "additive", "multiplicative", "unary", "postfix", 
			"arrayIndex", "expressionPar", "pipe", "terminal", "primitiveUse", "actorInstance", 
			"recordInstance", "type", "builtInType", "set", "list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "';'", "'::'", "':'", "'.'", "'@'", "'{'", "'}'", 
			"'|>'", "'++'", "'--'", "'=='", "'!='", "'&&'", "'||'", "'('", "')'", 
			"'['", "']'", "'+'", "'-'", "'*'", "'/'", "'mod'", "'&'", "'|'", "'!'", 
			"'='", "'<'", "'>'", "','", null, null, null, "'bool'", "'int'", "'string'", 
			"'ID'", "'Actor'", "'primitive'", "'msgRcv'", "'msgObs'", "'actorVars'", 
			"'List'", "'Set'", "'break'", "'continue'", "'if'", "'else'", "'for'", 
			"'while'", "'join'", "'Record'", "'in'", "'new'", "'self'", "'range'", 
			"'observers'", "'authorized'", "'toLower'", "'toUpper'", "'reverse'", 
			"'print'", "'main'", "'add'", "'include'", "'remove'", "'length'", "'private'", 
			"'public'", "'true'", "'false'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "COMMENT", "StringLiteral", "Semi", "DoubleColon", "Colon", 
			"Dot", "AT", "LeftBrace", "RightBrace", "Pipe", "PlusPlus", "MinusMinus", 
			"Equal", "NotEqual", "AndAnd", "OrOr", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "Plus", "Minus", "Star", "Div", "Mod", "And", "Or", "Not", 
			"Assign", "Less", "Greater", "Comma", "IntegerLiteral", "DecimalLiteral", 
			"BoolLiteral", "Bool", "Int", "String", "Id", "Actor", "Primitive", "MsgRcv", 
			"MsgObs", "ActorVars", "List", "Set", "Break", "Continue", "If", "Else", 
			"For", "While", "Join", "Record", "In", "New", "Self", "Range", "Observers", 
			"Authorized", "ToLower", "ToUpper", "Reverse", "Print", "Main", "Add", 
			"Include", "Remove", "Length", "Private", "Public", "True", "False", 
			"Null", "Identifier", "NONDIGIT", "NONZERODIGIT", "DIGIT", "StringChar"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SOACT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SOACTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SOACTParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 33570819L) != 0)) {
				{
				setState(136);
				declarationseq();
				}
			}

			setState(139);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDeclarationseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				declaration();
				}
				}
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 33570819L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ActorContext actor() {
			return getRuleContext(ActorContext.class,0);
		}
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public DecPrimitiveContext decPrimitive() {
			return getRuleContext(DecPrimitiveContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Main:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				main();
				}
				break;
			case Actor:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				actor();
				}
				break;
			case Record:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				record();
				}
				break;
			case Primitive:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				decPrimitive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorContext extends ParserRuleContext {
		public TerminalNode Actor() { return getToken(SOACTParser.Actor, 0); }
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public ActorComponentsWithBraceContext actorComponentsWithBrace() {
			return getRuleContext(ActorComponentsWithBraceContext.class,0);
		}
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Actor);
			setState(153);
			match(Identifier);
			setState(154);
			actorComponentsWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorComponentsWithBraceContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SOACTParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SOACTParser.RightBrace, 0); }
		public ActorComponentsContext actorComponents() {
			return getRuleContext(ActorComponentsContext.class,0);
		}
		public ActorComponentsWithBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorComponentsWithBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorComponentsWithBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorComponentsWithBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorComponentsWithBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorComponentsWithBraceContext actorComponentsWithBrace() throws RecognitionException {
		ActorComponentsWithBraceContext _localctx = new ActorComponentsWithBraceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actorComponentsWithBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LeftBrace);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(157);
				actorComponents();
				}
			}

			setState(160);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorComponentsContext extends ParserRuleContext {
		public List<ActorComponentContext> actorComponent() {
			return getRuleContexts(ActorComponentContext.class);
		}
		public ActorComponentContext actorComponent(int i) {
			return getRuleContext(ActorComponentContext.class,i);
		}
		public ActorComponentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorComponents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorComponents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorComponents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorComponents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorComponentsContext actorComponents() throws RecognitionException {
		ActorComponentsContext _localctx = new ActorComponentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_actorComponents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				actorComponent();
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorComponentContext extends ParserRuleContext {
		public ActorVarsContext actorVars() {
			return getRuleContext(ActorVarsContext.class,0);
		}
		public ActorConstructorContext actorConstructor() {
			return getRuleContext(ActorConstructorContext.class,0);
		}
		public ActorMethodContext actorMethod() {
			return getRuleContext(ActorMethodContext.class,0);
		}
		public ActorComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorComponent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorComponentContext actorComponent() throws RecognitionException {
		ActorComponentContext _localctx = new ActorComponentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_actorComponent);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				actorVars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				actorConstructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				actorMethod();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorConstructorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public DecArgsWithParContext decArgsWithPar() {
			return getRuleContext(DecArgsWithParContext.class,0);
		}
		public StatementWithBraceContext statementWithBrace() {
			return getRuleContext(StatementWithBraceContext.class,0);
		}
		public ActorConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorConstructorContext actorConstructor() throws RecognitionException {
		ActorConstructorContext _localctx = new ActorConstructorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_actorConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(Identifier);
			setState(173);
			decArgsWithPar();
			setState(174);
			statementWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorMethodContext extends ParserRuleContext {
		public TypeContext type;
		public Token Identifier;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public DecArgsWithParContext decArgsWithPar() {
			return getRuleContext(DecArgsWithParContext.class,0);
		}
		public StatementWithBraceContext statementWithBrace() {
			return getRuleContext(StatementWithBraceContext.class,0);
		}
		public AuthorizedContext authorized() {
			return getRuleContext(AuthorizedContext.class,0);
		}
		public ActorMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorMethodContext actorMethod() throws RecognitionException {
		ActorMethodContext _localctx = new ActorMethodContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actorMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			((ActorMethodContext)_localctx).type = type();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(177);
				authorized();
				}
			}

			setState(180);
			((ActorMethodContext)_localctx).Identifier = match(Identifier);

			            if (((ActorMethodContext)_localctx).type.is_msgrcv) {
			                System.out.println("Line " + ((ActorMethodContext)_localctx).Identifier.getLine() + " : msgRcv: " + ((ActorMethodContext)_localctx).Identifier.getText());
			            }
			            else if(((ActorMethodContext)_localctx).type.is_msgobs){
			                System.out.println("Line " + ((ActorMethodContext)_localctx).Identifier.getLine() + " : msgObs: " + ((ActorMethodContext)_localctx).Identifier.getText());
			            }
			        
			setState(182);
			decArgsWithPar();
			setState(183);
			statementWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AuthorizedContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SOACTParser.AT, 0); }
		public TerminalNode Authorized() { return getToken(SOACTParser.Authorized, 0); }
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public AuthorizedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAuthorized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAuthorized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAuthorized(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorizedContext authorized() throws RecognitionException {
		AuthorizedContext _localctx = new AuthorizedContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_authorized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(AT);
			setState(186);
			match(Authorized);
			setState(187);
			argsWithPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorVarsContext extends ParserRuleContext {
		public TerminalNode ActorVars() { return getToken(SOACTParser.ActorVars, 0); }
		public DecVarsWithBraceContext decVarsWithBrace() {
			return getRuleContext(DecVarsWithBraceContext.class,0);
		}
		public ActorVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorVarsContext actorVars() throws RecognitionException {
		ActorVarsContext _localctx = new ActorVarsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_actorVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ActorVars);
			setState(190);
			decVarsWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordContext extends ParserRuleContext {
		public Token Record;
		public TerminalNode Record() { return getToken(SOACTParser.Record, 0); }
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public DecVarsWithBraceContext decVarsWithBrace() {
			return getRuleContext(DecVarsWithBraceContext.class,0);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_record);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			((RecordContext)_localctx).Record = match(Record);

			    System.out.println("Line " + ((RecordContext)_localctx).Record.getLine() + " : Record");
			    
			setState(194);
			match(Identifier);
			setState(195);
			decVarsWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecVarsWithBraceContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SOACTParser.LeftBrace, 0); }
		public VarsRecordsContext varsRecords() {
			return getRuleContext(VarsRecordsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(SOACTParser.RightBrace, 0); }
		public DecVarsWithBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVarsWithBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDecVarsWithBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDecVarsWithBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDecVarsWithBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecVarsWithBraceContext decVarsWithBrace() throws RecognitionException {
		DecVarsWithBraceContext _localctx = new DecVarsWithBraceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decVarsWithBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(LeftBrace);
			setState(198);
			varsRecords();
			setState(199);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarsRecordsContext extends ParserRuleContext {
		public DecArgContext decArg() {
			return getRuleContext(DecArgContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SOACTParser.Semi, 0); }
		public VarsRecordsContext varsRecords() {
			return getRuleContext(VarsRecordsContext.class,0);
		}
		public VarsRecordsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsRecords; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterVarsRecords(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitVarsRecords(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitVarsRecords(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsRecordsContext varsRecords() throws RecognitionException {
		VarsRecordsContext _localctx = new VarsRecordsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varsRecords);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			decArg();
			setState(202);
			match(Semi);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(203);
				varsRecords();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecPrimitiveContext extends ParserRuleContext {
		public TerminalNode Primitive() { return getToken(SOACTParser.Primitive, 0); }
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public VarsPrimitiveWithBraceContext varsPrimitiveWithBrace() {
			return getRuleContext(VarsPrimitiveWithBraceContext.class,0);
		}
		public DecPrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decPrimitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDecPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDecPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDecPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecPrimitiveContext decPrimitive() throws RecognitionException {
		DecPrimitiveContext _localctx = new DecPrimitiveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decPrimitive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Primitive);
			setState(207);
			match(Identifier);
			setState(208);
			varsPrimitiveWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarsPrimitiveWithBraceContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SOACTParser.LeftBrace, 0); }
		public VarsPrimitivesContext varsPrimitives() {
			return getRuleContext(VarsPrimitivesContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(SOACTParser.RightBrace, 0); }
		public VarsPrimitiveWithBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsPrimitiveWithBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterVarsPrimitiveWithBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitVarsPrimitiveWithBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitVarsPrimitiveWithBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsPrimitiveWithBraceContext varsPrimitiveWithBrace() throws RecognitionException {
		VarsPrimitiveWithBraceContext _localctx = new VarsPrimitiveWithBraceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varsPrimitiveWithBrace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(LeftBrace);
			setState(211);
			varsPrimitives();
			setState(212);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarsPrimitivesContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SOACTParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SOACTParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(SOACTParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SOACTParser.Comma, i);
		}
		public VarsPrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsPrimitives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterVarsPrimitives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitVarsPrimitives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitVarsPrimitives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsPrimitivesContext varsPrimitives() throws RecognitionException {
		VarsPrimitivesContext _localctx = new VarsPrimitivesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varsPrimitives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(Identifier);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(215);
				match(Comma);
				setState(216);
				match(Identifier);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public Token Main;
		public TerminalNode Main() { return getToken(SOACTParser.Main, 0); }
		public DecArgsWithParContext decArgsWithPar() {
			return getRuleContext(DecArgsWithParContext.class,0);
		}
		public StatementWithBraceContext statementWithBrace() {
			return getRuleContext(StatementWithBraceContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((MainContext)_localctx).Main = match(Main);
			System.out.println("Line " + ((MainContext)_localctx).Main.getLine() + " : MAIN");
			setState(224);
			decArgsWithPar();
			setState(225);
			statementWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecArgsWithParContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SOACTParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SOACTParser.RightParen, 0); }
		public DecArgsContext decArgs() {
			return getRuleContext(DecArgsContext.class,0);
		}
		public DecArgsWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decArgsWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDecArgsWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDecArgsWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDecArgsWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecArgsWithParContext decArgsWithPar() throws RecognitionException {
		DecArgsWithParContext _localctx = new DecArgsWithParContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_decArgsWithPar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LeftParen);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(228);
				decArgs();
				}
			}

			setState(231);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecArgsContext extends ParserRuleContext {
		public List<DecArgContext> decArg() {
			return getRuleContexts(DecArgContext.class);
		}
		public DecArgContext decArg(int i) {
			return getRuleContext(DecArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SOACTParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SOACTParser.Comma, i);
		}
		public DecArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDecArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDecArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDecArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecArgsContext decArgs() throws RecognitionException {
		DecArgsContext _localctx = new DecArgsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			decArg();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(234);
				match(Comma);
				setState(235);
				decArg();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecArgContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public DecArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDecArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDecArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDecArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecArgContext decArg() throws RecognitionException {
		DecArgContext _localctx = new DecArgContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_decArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			type();
			setState(242);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsWithParContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SOACTParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SOACTParser.RightParen, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ArgsWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArgsWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArgsWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArgsWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsWithParContext argsWithPar() throws RecognitionException {
		ArgsWithParContext _localctx = new ArgsWithParContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_argsWithPar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(LeftParen);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3602879615451516920L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6531L) != 0)) {
				{
				setState(245);
				args();
				}
			}

			setState(248);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SOACTParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SOACTParser.Comma, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			expression();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(251);
				match(Comma);
				setState(252);
				expression();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordArgsContext extends ParserRuleContext {
		public List<RecordArgContext> recordArg() {
			return getRuleContexts(RecordArgContext.class);
		}
		public RecordArgContext recordArg(int i) {
			return getRuleContext(RecordArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SOACTParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SOACTParser.Comma, i);
		}
		public RecordArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRecordArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRecordArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRecordArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordArgsContext recordArgs() throws RecognitionException {
		RecordArgsContext _localctx = new RecordArgsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_recordArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			recordArg();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(259);
				match(Comma);
				setState(260);
				recordArg();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordArgContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(SOACTParser.Colon, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RecordArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRecordArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRecordArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRecordArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordArgContext recordArg() throws RecognitionException {
		RecordArgContext _localctx = new RecordArgContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_recordArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(Identifier);
			setState(267);
			match(Colon);
			setState(268);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementWithBraceContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(SOACTParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SOACTParser.RightBrace, 0); }
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public StatementWithBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWithBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterStatementWithBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitStatementWithBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitStatementWithBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWithBraceContext statementWithBrace() throws RecognitionException {
		StatementWithBraceContext _localctx = new StatementWithBraceContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_statementWithBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(LeftBrace);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3569102755685191672L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6531L) != 0)) {
				{
				setState(271);
				statementSeq();
				}
			}

			setState(274);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitStatementSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitStatementSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_statementSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				statement();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -3569102755685191672L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6531L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public DeclareVarStatementContext declareVarStatement() {
			return getRuleContext(DeclareVarStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SetVarStatementContext setVarStatement() {
			return getRuleContext(SetVarStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public JoinStatementContext joinStatement() {
			return getRuleContext(JoinStatementContext.class,0);
		}
		public OtherStatementContext otherStatement() {
			return getRuleContext(OtherStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				declareVarStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				setVarStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				joinStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				otherStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinStatementContext extends ParserRuleContext {
		public Token Join;
		public TerminalNode Join() { return getToken(SOACTParser.Join, 0); }
		public StatementWithBraceContext statementWithBrace() {
			return getRuleContext(StatementWithBraceContext.class,0);
		}
		public JoinStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterJoinStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitJoinStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitJoinStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinStatementContext joinStatement() throws RecognitionException {
		JoinStatementContext _localctx = new JoinStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_joinStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((JoinStatementContext)_localctx).Join = match(Join);

			    System.out.println("Line " + ((JoinStatementContext)_localctx).Join.getLine() + " : Join");
			    
			setState(293);
			statementWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OtherStatementContext extends ParserRuleContext {
		public Token Continue;
		public TerminalNode Break() { return getToken(SOACTParser.Break, 0); }
		public TerminalNode Semi() { return getToken(SOACTParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(SOACTParser.Continue, 0); }
		public OtherStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterOtherStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitOtherStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitOtherStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherStatementContext otherStatement() throws RecognitionException {
		OtherStatementContext _localctx = new OtherStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_otherStatement);
		try {
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(Break);

				        System.out.println("Control: BREAK");
				     
				setState(297);
				match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				((OtherStatementContext)_localctx).Continue = match(Continue);

				        System.out.println("Line " + ((OtherStatementContext)_localctx).Continue.getLine() + " : Control: CONTINUE");
				     
				setState(300);
				match(Semi);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public Token While;
		public TerminalNode While() { return getToken(SOACTParser.While, 0); }
		public WhileArgWithParContext whileArgWithPar() {
			return getRuleContext(WhileArgWithParContext.class,0);
		}
		public StatementWithBraceContext statementWithBrace() {
			return getRuleContext(StatementWithBraceContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((WhileStatementContext)_localctx).While = match(While);

			    System.out.println("Line " + ((WhileStatementContext)_localctx).While.getLine() + " : Loop: WHILE");
			    
			setState(305);
			whileArgWithPar();
			setState(306);
			statementWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileArgWithParContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SOACTParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SOACTParser.RightParen, 0); }
		public WhileArgWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileArgWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterWhileArgWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitWhileArgWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitWhileArgWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileArgWithParContext whileArgWithPar() throws RecognitionException {
		WhileArgWithParContext _localctx = new WhileArgWithParContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_whileArgWithPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(LeftParen);
			setState(309);
			expression();
			setState(310);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public Token For;
		public TerminalNode For() { return getToken(SOACTParser.For, 0); }
		public ForArgWithParContext forArgWithPar() {
			return getRuleContext(ForArgWithParContext.class,0);
		}
		public StatementWithBraceContext statementWithBrace() {
			return getRuleContext(StatementWithBraceContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((ForStatementContext)_localctx).For = match(For);

			    System.out.println("Line " + ((ForStatementContext)_localctx).For.getLine() + " : Loop: FOR");
			    
			setState(314);
			forArgWithPar();
			setState(315);
			statementWithBrace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForArgWithParContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SOACTParser.LeftParen, 0); }
		public ForArgContext forArg() {
			return getRuleContext(ForArgContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SOACTParser.RightParen, 0); }
		public ForArgWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forArgWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterForArgWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitForArgWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitForArgWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForArgWithParContext forArgWithPar() throws RecognitionException {
		ForArgWithParContext _localctx = new ForArgWithParContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forArgWithPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(LeftParen);
			setState(318);
			forArg();
			setState(319);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForArgContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public TerminalNode In() { return getToken(SOACTParser.In, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterForArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitForArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitForArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForArgContext forArg() throws RecognitionException {
		ForArgContext _localctx = new ForArgContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(Identifier);
			setState(322);
			match(In);
			setState(323);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetVarStatementContext extends ParserRuleContext {
		public Token Assign;
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(SOACTParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SOACTParser.Semi, 0); }
		public TerminalNode Self() { return getToken(SOACTParser.Self, 0); }
		public TerminalNode Dot() { return getToken(SOACTParser.Dot, 0); }
		public SetVarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVarStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterSetVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitSetVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitSetVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVarStatementContext setVarStatement() throws RecognitionException {
		SetVarStatementContext _localctx = new SetVarStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_setVarStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Self) {
				{
				setState(325);
				match(Self);
				setState(326);
				match(Dot);
				}
			}

			setState(329);
			match(Identifier);
			setState(330);
			((SetVarStatementContext)_localctx).Assign = match(Assign);
			setState(331);
			expression();
			System.out.println("Line " + ((SetVarStatementContext)_localctx).Assign.getLine() + " : Assignment");
			setState(333);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInFunctionNameContext extends ParserRuleContext {
		public Token ToLower;
		public Token ToUpper;
		public Token Reverse;
		public Token Print;
		public Token Private;
		public Token Public;
		public Token Range;
		public TerminalNode ToLower() { return getToken(SOACTParser.ToLower, 0); }
		public TerminalNode ToUpper() { return getToken(SOACTParser.ToUpper, 0); }
		public TerminalNode Reverse() { return getToken(SOACTParser.Reverse, 0); }
		public TerminalNode Print() { return getToken(SOACTParser.Print, 0); }
		public TerminalNode Private() { return getToken(SOACTParser.Private, 0); }
		public TerminalNode Public() { return getToken(SOACTParser.Public, 0); }
		public TerminalNode Range() { return getToken(SOACTParser.Range, 0); }
		public BuiltInFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterBuiltInFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitBuiltInFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitBuiltInFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInFunctionNameContext builtInFunctionName() throws RecognitionException {
		BuiltInFunctionNameContext _localctx = new BuiltInFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_builtInFunctionName);
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ToLower:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((BuiltInFunctionNameContext)_localctx).ToLower = match(ToLower);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).ToLower.getLine() + " : Built-In: LOWER");
				        
				}
				break;
			case ToUpper:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				((BuiltInFunctionNameContext)_localctx).ToUpper = match(ToUpper);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).ToUpper.getLine() + " : Built-In: UPPER");
				        
				}
				break;
			case Reverse:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				((BuiltInFunctionNameContext)_localctx).Reverse = match(Reverse);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Reverse.getLine() + " : Built-In: REVERSE");
				        
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				((BuiltInFunctionNameContext)_localctx).Print = match(Print);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Print.getLine() + " : Built-In: PRINT");
				        
				}
				break;
			case Private:
				enterOuterAlt(_localctx, 5);
				{
				setState(343);
				((BuiltInFunctionNameContext)_localctx).Private = match(Private);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Private.getLine() + " : Built-In: PRIVATE");
				        
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				((BuiltInFunctionNameContext)_localctx).Public = match(Public);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Public.getLine() + " : Built-In: PUBLIC");
				        
				}
				break;
			case Range:
				enterOuterAlt(_localctx, 7);
				{
				setState(347);
				((BuiltInFunctionNameContext)_localctx).Range = match(Range);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Range.getLine() + " : Built-In: RANGE");
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInFunctionContext extends ParserRuleContext {
		public BuiltInFunctionNameContext builtInFunctionName() {
			return getRuleContext(BuiltInFunctionNameContext.class,0);
		}
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public BuiltInFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterBuiltInFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitBuiltInFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitBuiltInFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInFunctionContext builtInFunction() throws RecognitionException {
		BuiltInFunctionContext _localctx = new BuiltInFunctionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_builtInFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			builtInFunctionName();
			setState(352);
			argsWithPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInFunctionListContext extends ParserRuleContext {
		public BuiltInFunctionListNameContext builtInFunctionListName() {
			return getRuleContext(BuiltInFunctionListNameContext.class,0);
		}
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public BuiltInFunctionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunctionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterBuiltInFunctionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitBuiltInFunctionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitBuiltInFunctionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInFunctionListContext builtInFunctionList() throws RecognitionException {
		BuiltInFunctionListContext _localctx = new BuiltInFunctionListContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_builtInFunctionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			builtInFunctionListName();
			setState(355);
			argsWithPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInFunctionListNameContext extends ParserRuleContext {
		public Token Add;
		public Token Include;
		public Token Remove;
		public Token Length;
		public TerminalNode Add() { return getToken(SOACTParser.Add, 0); }
		public TerminalNode Include() { return getToken(SOACTParser.Include, 0); }
		public TerminalNode Remove() { return getToken(SOACTParser.Remove, 0); }
		public TerminalNode Length() { return getToken(SOACTParser.Length, 0); }
		public BuiltInFunctionListNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInFunctionListName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterBuiltInFunctionListName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitBuiltInFunctionListName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitBuiltInFunctionListName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInFunctionListNameContext builtInFunctionListName() throws RecognitionException {
		BuiltInFunctionListNameContext _localctx = new BuiltInFunctionListNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_builtInFunctionListName);
		try {
			setState(365);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Add:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				((BuiltInFunctionListNameContext)_localctx).Add = match(Add);

				            System.out.println("Line " + ((BuiltInFunctionListNameContext)_localctx).Add.getLine() + " : Built-In: ADD");
				        
				}
				break;
			case Include:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				((BuiltInFunctionListNameContext)_localctx).Include = match(Include);

				            System.out.println("Line " + ((BuiltInFunctionListNameContext)_localctx).Include.getLine() + " : Built-In: INCLUDE");
				        
				}
				break;
			case Remove:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				((BuiltInFunctionListNameContext)_localctx).Remove = match(Remove);

				            System.out.println("Line " + ((BuiltInFunctionListNameContext)_localctx).Remove.getLine() + " : Built-In: REMOVE");
				        
				}
				break;
			case Length:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				((BuiltInFunctionListNameContext)_localctx).Length = match(Length);

				            System.out.println("Line " + ((BuiltInFunctionListNameContext)_localctx).Length.getLine() + " : Built-In: LEN");
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SOACTParser.Semi, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			expression();
			setState(368);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public Token If;
		public Token Else;
		public List<TerminalNode> If() { return getTokens(SOACTParser.If); }
		public TerminalNode If(int i) {
			return getToken(SOACTParser.If, i);
		}
		public List<ExpressionWithParContext> expressionWithPar() {
			return getRuleContexts(ExpressionWithParContext.class);
		}
		public ExpressionWithParContext expressionWithPar(int i) {
			return getRuleContext(ExpressionWithParContext.class,i);
		}
		public List<StatementWithBraceContext> statementWithBrace() {
			return getRuleContexts(StatementWithBraceContext.class);
		}
		public StatementWithBraceContext statementWithBrace(int i) {
			return getRuleContext(StatementWithBraceContext.class,i);
		}
		public List<TerminalNode> Else() { return getTokens(SOACTParser.Else); }
		public TerminalNode Else(int i) {
			return getToken(SOACTParser.Else, i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			((IfStatementContext)_localctx).If = match(If);

			            System.out.println("Line " + ((IfStatementContext)_localctx).If.getLine() + " : Decision:IF");
			        
			setState(372);
			expressionWithPar();
			setState(373);
			statementWithBrace();
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(374);
					((IfStatementContext)_localctx).Else = match(Else);
					setState(375);
					((IfStatementContext)_localctx).If = match(If);

					            System.out.println("Line " + ((IfStatementContext)_localctx).If.getLine() + " : Decision:ELSE IF");
					        
					setState(377);
					expressionWithPar();
					setState(378);
					statementWithBrace();
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(385);
				((IfStatementContext)_localctx).Else = match(Else);

				            System.out.println("Line " + ((IfStatementContext)_localctx).Else.getLine() + " : Decision:ELSE");
				        
				setState(387);
				statementWithBrace();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public Token Dot;
		public Token Assign;
		public TerminalNode Dot() { return getToken(SOACTParser.Dot, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SOACTParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SOACTParser.Identifier, i);
		}
		public TerminalNode Self() { return getToken(SOACTParser.Self, 0); }
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SOACTParser.Assign, 0); }
		public ObserversContext observers() {
			return getRuleContext(ObserversContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !(_la==Self || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			((MethodCallContext)_localctx).Dot = match(Dot);
			setState(392);
			match(Identifier);
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(393);
				argsWithPar();

				        System.out.println("Line " + ((MethodCallContext)_localctx).Dot.getLine() + " : send message");
				     
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(395);
					observers();
					}
				}

				}
				break;
			case Assign:
				{
				setState(398);
				((MethodCallContext)_localctx).Assign = match(Assign);

				        System.out.println("Line " + ((MethodCallContext)_localctx).Assign.getLine() + " : Assignment");
				     
				setState(400);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObserversContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(SOACTParser.AT, 0); }
		public TerminalNode Observers() { return getToken(SOACTParser.Observers, 0); }
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public ObserversContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterObservers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitObservers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitObservers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObserversContext observers() throws RecognitionException {
		ObserversContext _localctx = new ObserversContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_observers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(AT);
			setState(404);
			match(Observers);
			setState(405);
			argsWithPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareVarStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(SOACTParser.Semi, 0); }
		public ArraySizeContext arraySize() {
			return getRuleContext(ArraySizeContext.class,0);
		}
		public InitialayzerContext initialayzer() {
			return getRuleContext(InitialayzerContext.class,0);
		}
		public DeclareVarStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareVarStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterDeclareVarStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitDeclareVarStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitDeclareVarStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclareVarStatementContext declareVarStatement() throws RecognitionException {
		DeclareVarStatementContext _localctx = new DeclareVarStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_declareVarStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			type();
			setState(408);
			match(Identifier);
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(409);
				arraySize();
				}
			}

			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(412);
				initialayzer();
				}
			}

			setState(415);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArraySizeContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(SOACTParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(SOACTParser.RightBracket, 0); }
		public ArraySizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArraySize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArraySize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArraySize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySizeContext arraySize() throws RecognitionException {
		ArraySizeContext _localctx = new ArraySizeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_arraySize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(LeftBracket);
			setState(418);
			expression();
			setState(419);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitialayzerContext extends ParserRuleContext {
		public Token Assign;
		public TerminalNode Assign() { return getToken(SOACTParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialayzerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialayzer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterInitialayzer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitInitialayzer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitInitialayzer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialayzerContext initialayzer() throws RecognitionException {
		InitialayzerContext _localctx = new InitialayzerContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_initialayzer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			((InitialayzerContext)_localctx).Assign = match(Assign);
			setState(422);
			expression();
			System.out.println( "Line " + ((InitialayzerContext)_localctx).Assign.getLine() + " : Assignment");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionWithParContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SOACTParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SOACTParser.RightParen, 0); }
		public ExpressionWithParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWithPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpressionWithPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpressionWithPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpressionWithPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWithParContext expressionWithPar() throws RecognitionException {
		ExpressionWithParContext _localctx = new ExpressionWithParContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expressionWithPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(LeftParen);
			setState(426);
			expression();
			setState(427);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			logicalOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrContext extends ParserRuleContext {
		public Token OrOr;
		public LogicalAndContext logicalAnd() {
			return getRuleContext(LogicalAndContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(SOACTParser.OrOr, 0); }
		public LogicalOrContext logicalOr() {
			return getRuleContext(LogicalOrContext.class,0);
		}
		public LogicalOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterLogicalOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitLogicalOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitLogicalOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrContext logicalOr() throws RecognitionException {
		LogicalOrContext _localctx = new LogicalOrContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			logicalAnd();
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OrOr) {
				{
				setState(432);
				((LogicalOrContext)_localctx).OrOr = match(OrOr);
				System.out.println("Line " + ((LogicalOrContext)_localctx).OrOr.getLine() + " : Operator:||");
				setState(434);
				logicalOr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndContext extends ParserRuleContext {
		public Token AndAnd;
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(SOACTParser.AndAnd, 0); }
		public LogicalAndContext logicalAnd() {
			return getRuleContext(LogicalAndContext.class,0);
		}
		public LogicalAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterLogicalAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitLogicalAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitLogicalAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndContext logicalAnd() throws RecognitionException {
		LogicalAndContext _localctx = new LogicalAndContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			equality();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AndAnd) {
				{
				setState(438);
				((LogicalAndContext)_localctx).AndAnd = match(AndAnd);
				System.out.println("Line " + ((LogicalAndContext)_localctx).AndAnd.getLine() + " : Operator:&&");
				setState(440);
				logicalAnd();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ParserRuleContext {
		public Token Equal;
		public Token NotEqual;
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public TerminalNode Equal() { return getToken(SOACTParser.Equal, 0); }
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(SOACTParser.NotEqual, 0); }
		public EqualityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equality; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterEquality(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitEquality(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitEquality(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityContext equality() throws RecognitionException {
		EqualityContext _localctx = new EqualityContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			relational();
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(444);
				((EqualityContext)_localctx).Equal = match(Equal);
				System.out.println("Line " + ((EqualityContext)_localctx).Equal.getLine() + " : Operator:==");
				setState(446);
				equality();
				}
				break;
			case NotEqual:
				{
				setState(447);
				((EqualityContext)_localctx).NotEqual = match(NotEqual);
				System.out.println("Line " + ((EqualityContext)_localctx).NotEqual.getLine() + " : Operator:!=");
				setState(449);
				equality();
				}
				break;
			case Semi:
			case RightBrace:
			case AndAnd:
			case OrOr:
			case RightParen:
			case RightBracket:
			case Comma:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ParserRuleContext {
		public Token Less;
		public Token Greater;
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public TerminalNode Less() { return getToken(SOACTParser.Less, 0); }
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public TerminalNode Greater() { return getToken(SOACTParser.Greater, 0); }
		public RelationalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relational; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRelational(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalContext relational() throws RecognitionException {
		RelationalContext _localctx = new RelationalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_relational);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			additive();
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Less:
				{
				setState(453);
				((RelationalContext)_localctx).Less = match(Less);
				System.out.println("Line " + ((RelationalContext)_localctx).Less.getLine() + " : Operator:<");
				setState(455);
				relational();
				}
				break;
			case Greater:
				{
				setState(456);
				((RelationalContext)_localctx).Greater = match(Greater);
				System.out.println("Line " + ((RelationalContext)_localctx).Greater.getLine() + " : Operator:>");
				setState(458);
				relational();
				}
				break;
			case Semi:
			case RightBrace:
			case Equal:
			case NotEqual:
			case AndAnd:
			case OrOr:
			case RightParen:
			case RightBracket:
			case Comma:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveContext extends ParserRuleContext {
		public Token Plus;
		public Token Minus;
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public TerminalNode Plus() { return getToken(SOACTParser.Plus, 0); }
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public TerminalNode Minus() { return getToken(SOACTParser.Minus, 0); }
		public AdditiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAdditive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAdditive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAdditive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveContext additive() throws RecognitionException {
		AdditiveContext _localctx = new AdditiveContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_additive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			multiplicative();
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				{
				setState(462);
				((AdditiveContext)_localctx).Plus = match(Plus);
				System.out.println("Line " + ((AdditiveContext)_localctx).Plus.getLine() + " : Operator:+");
				setState(464);
				additive();
				}
				break;
			case Minus:
				{
				setState(465);
				((AdditiveContext)_localctx).Minus = match(Minus);
				System.out.println("Line " + ((AdditiveContext)_localctx).Minus.getLine() + " : Operator:-");
				setState(467);
				additive();
				}
				break;
			case Semi:
			case RightBrace:
			case Equal:
			case NotEqual:
			case AndAnd:
			case OrOr:
			case RightParen:
			case RightBracket:
			case Less:
			case Greater:
			case Comma:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeContext extends ParserRuleContext {
		public Token Star;
		public Token Div;
		public Token Mod;
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode Star() { return getToken(SOACTParser.Star, 0); }
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public TerminalNode Div() { return getToken(SOACTParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SOACTParser.Mod, 0); }
		public MultiplicativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterMultiplicative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitMultiplicative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitMultiplicative(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeContext multiplicative() throws RecognitionException {
		MultiplicativeContext _localctx = new MultiplicativeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_multiplicative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			unary();
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				{
				setState(471);
				((MultiplicativeContext)_localctx).Star = match(Star);
				System.out.println("Line " + ((MultiplicativeContext)_localctx).Star.getLine() + " : Operator:*");
				setState(473);
				multiplicative();
				}
				break;
			case Div:
				{
				setState(474);
				((MultiplicativeContext)_localctx).Div = match(Div);
				System.out.println("Line " + ((MultiplicativeContext)_localctx).Div.getLine() + " : Operator:/");
				setState(476);
				multiplicative();
				}
				break;
			case Mod:
				{
				setState(477);
				((MultiplicativeContext)_localctx).Mod = match(Mod);
				System.out.println("Line " + ((MultiplicativeContext)_localctx).Mod.getLine() + " : Operator:%");
				setState(479);
				multiplicative();
				}
				break;
			case Semi:
			case RightBrace:
			case Equal:
			case NotEqual:
			case AndAnd:
			case OrOr:
			case RightParen:
			case RightBracket:
			case Plus:
			case Minus:
			case Less:
			case Greater:
			case Comma:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ParserRuleContext {
		public Token PlusPlus;
		public Token MinusMinus;
		public Token Not;
		public Token Minus;
		public TerminalNode PlusPlus() { return getToken(SOACTParser.PlusPlus, 0); }
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(SOACTParser.MinusMinus, 0); }
		public TerminalNode Not() { return getToken(SOACTParser.Not, 0); }
		public TerminalNode Minus() { return getToken(SOACTParser.Minus, 0); }
		public PostfixContext postfix() {
			return getRuleContext(PostfixContext.class,0);
		}
		public UnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryContext unary() throws RecognitionException {
		UnaryContext _localctx = new UnaryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_unary);
		try {
			setState(495);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
				enterOuterAlt(_localctx, 1);
				{
				setState(482);
				((UnaryContext)_localctx).PlusPlus = match(PlusPlus);
				System.out.println("Line " + ((UnaryContext)_localctx).PlusPlus.getLine() + " : Operator:++");
				setState(484);
				unary();
				}
				break;
			case MinusMinus:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				((UnaryContext)_localctx).MinusMinus = match(MinusMinus);
				System.out.println("Line " + ((UnaryContext)_localctx).MinusMinus.getLine() + " : Operator:--");
				setState(487);
				unary();
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				((UnaryContext)_localctx).Not = match(Not);
				System.out.println("Line " + ((UnaryContext)_localctx).Not.getLine() + " : Operator:!");
				setState(490);
				unary();
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 4);
				{
				setState(491);
				((UnaryContext)_localctx).Minus = match(Minus);
				System.out.println("Line " + ((UnaryContext)_localctx).Minus.getLine() + " : Operator:-");
				setState(493);
				unary();
				}
				break;
			case StringLiteral:
			case LeftParen:
			case IntegerLiteral:
			case BoolLiteral:
			case New:
			case Self:
			case Range:
			case ToLower:
			case ToUpper:
			case Reverse:
			case Print:
			case Private:
			case Public:
			case Null:
			case Identifier:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				postfix();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostfixContext extends ParserRuleContext {
		public Token PlusPlus;
		public Token MinusMinus;
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(SOACTParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(SOACTParser.MinusMinus, 0); }
		public PostfixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPostfix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPostfix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPostfix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixContext postfix() throws RecognitionException {
		PostfixContext _localctx = new PostfixContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_postfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			arrayIndex();
			setState(502);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
				{
				setState(498);
				((PostfixContext)_localctx).PlusPlus = match(PlusPlus);
				System.out.println("Line " + ((PostfixContext)_localctx).PlusPlus.getLine() + " : Operator:++");
				}
				break;
			case MinusMinus:
				{
				setState(500);
				((PostfixContext)_localctx).MinusMinus = match(MinusMinus);
				System.out.println("Line " + ((PostfixContext)_localctx).MinusMinus.getLine() + " : Operator:--");
				}
				break;
			case Semi:
			case RightBrace:
			case Equal:
			case NotEqual:
			case AndAnd:
			case OrOr:
			case RightParen:
			case RightBracket:
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Less:
			case Greater:
			case Comma:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayIndexContext extends ParserRuleContext {
		public ExpressionParContext expressionPar() {
			return getRuleContext(ExpressionParContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SOACTParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(SOACTParser.RightBracket, 0); }
		public ArrayIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayIndexContext arrayIndex() throws RecognitionException {
		ArrayIndexContext _localctx = new ArrayIndexContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			expressionPar();
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(505);
				match(LeftBracket);
				setState(506);
				expression();
				setState(507);
				match(RightBracket);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionParContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(SOACTParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(SOACTParser.RightParen, 0); }
		public PipeContext pipe() {
			return getRuleContext(PipeContext.class,0);
		}
		public ExpressionParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpressionPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpressionPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpressionPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionParContext expressionPar() throws RecognitionException {
		ExpressionParContext _localctx = new ExpressionParContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expressionPar);
		try {
			setState(516);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				match(LeftParen);
				setState(512);
				expression();
				setState(513);
				match(RightParen);
				}
				break;
			case StringLiteral:
			case IntegerLiteral:
			case BoolLiteral:
			case New:
			case Self:
			case Range:
			case ToLower:
			case ToUpper:
			case Reverse:
			case Print:
			case Private:
			case Public:
			case Null:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				pipe();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PipeContext extends ParserRuleContext {
		public Token Pipe;
		public TerminalContext terminal() {
			return getRuleContext(TerminalContext.class,0);
		}
		public TerminalNode Pipe() { return getToken(SOACTParser.Pipe, 0); }
		public PipeContext pipe() {
			return getRuleContext(PipeContext.class,0);
		}
		public PipeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPipe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPipe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPipe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeContext pipe() throws RecognitionException {
		PipeContext _localctx = new PipeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			terminal();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Pipe) {
				{
				setState(519);
				((PipeContext)_localctx).Pipe = match(Pipe);
				setState(520);
				pipe();
				System.out.println("Line " + ((PipeContext)_localctx).Pipe.getLine() + " : Operator:|>");
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalContext extends ParserRuleContext {
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ActorInstanceContext actorInstance() {
			return getRuleContext(ActorInstanceContext.class,0);
		}
		public RecordInstanceContext recordInstance() {
			return getRuleContext(RecordInstanceContext.class,0);
		}
		public PrimitiveUseContext primitiveUse() {
			return getRuleContext(PrimitiveUseContext.class,0);
		}
		public BuiltInFunctionContext builtInFunction() {
			return getRuleContext(BuiltInFunctionContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SOACTParser.StringLiteral, 0); }
		public TerminalNode Self() { return getToken(SOACTParser.Self, 0); }
		public TerminalNode Dot() { return getToken(SOACTParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public BuiltInFunctionListContext builtInFunctionList() {
			return getRuleContext(BuiltInFunctionListContext.class,0);
		}
		public TerminalNode IntegerLiteral() { return getToken(SOACTParser.IntegerLiteral, 0); }
		public TerminalNode BoolLiteral() { return getToken(SOACTParser.BoolLiteral, 0); }
		public TerminalNode Null() { return getToken(SOACTParser.Null, 0); }
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_terminal);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				actorInstance();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				recordInstance();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				primitiveUse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(529);
				builtInFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Self) {
					{
					setState(530);
					match(Self);
					setState(531);
					match(Dot);
					}
				}

				setState(534);
				match(StringLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(535);
				match(Identifier);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(536);
					match(Dot);
					setState(537);
					builtInFunctionList();
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(540);
				match(IntegerLiteral);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(541);
				match(BoolLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(542);
				match(Null);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveUseContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(SOACTParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SOACTParser.Identifier, i);
		}
		public TerminalNode DoubleColon() { return getToken(SOACTParser.DoubleColon, 0); }
		public PrimitiveUseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveUse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPrimitiveUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPrimitiveUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPrimitiveUse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveUseContext primitiveUse() throws RecognitionException {
		PrimitiveUseContext _localctx = new PrimitiveUseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_primitiveUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(Identifier);
			setState(546);
			match(DoubleColon);
			setState(547);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActorInstanceContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(SOACTParser.New, 0); }
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public ActorInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorInstanceContext actorInstance() throws RecognitionException {
		ActorInstanceContext _localctx = new ActorInstanceContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_actorInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(New);
			setState(550);
			match(Identifier);
			setState(551);
			argsWithPar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RecordInstanceContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public TerminalNode LeftBrace() { return getToken(SOACTParser.LeftBrace, 0); }
		public RecordArgsContext recordArgs() {
			return getRuleContext(RecordArgsContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(SOACTParser.RightBrace, 0); }
		public RecordInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRecordInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRecordInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRecordInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordInstanceContext recordInstance() throws RecognitionException {
		RecordInstanceContext _localctx = new RecordInstanceContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_recordInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(Identifier);
			setState(554);
			match(LeftBrace);
			setState(555);
			recordArgs();
			setState(556);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public boolean is_msgobs = false;
		public boolean is_msgrcv = false;
		public BuiltInTypeContext builtInType;
		public BuiltInTypeContext builtInType() {
			return getRuleContext(BuiltInTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_type);
		try {
			setState(562);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Int:
			case String:
			case Id:
			case Actor:
			case Primitive:
			case MsgRcv:
			case MsgObs:
			case ActorVars:
			case List:
			case Set:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				((TypeContext)_localctx).builtInType = builtInType();

				        ((TypeContext)_localctx).is_msgrcv =  ((TypeContext)_localctx).builtInType.is_msgrcv;
				        ((TypeContext)_localctx).is_msgobs =  ((TypeContext)_localctx).builtInType.is_msgobs;
				    
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInTypeContext extends ParserRuleContext {
		public boolean is_msgrcv = false;
		public boolean is_msgobs;
		public TerminalNode Bool() { return getToken(SOACTParser.Bool, 0); }
		public TerminalNode Int() { return getToken(SOACTParser.Int, 0); }
		public TerminalNode String() { return getToken(SOACTParser.String, 0); }
		public TerminalNode Id() { return getToken(SOACTParser.Id, 0); }
		public TerminalNode Actor() { return getToken(SOACTParser.Actor, 0); }
		public TerminalNode Primitive() { return getToken(SOACTParser.Primitive, 0); }
		public TerminalNode MsgRcv() { return getToken(SOACTParser.MsgRcv, 0); }
		public TerminalNode MsgObs() { return getToken(SOACTParser.MsgObs, 0); }
		public TerminalNode ActorVars() { return getToken(SOACTParser.ActorVars, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public BuiltInTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterBuiltInType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitBuiltInType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitBuiltInType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInTypeContext builtInType() throws RecognitionException {
		BuiltInTypeContext _localctx = new BuiltInTypeContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_builtInType);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(564);
				match(Bool);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(565);
				match(Int);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(String);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(567);
				match(Id);
				}
				break;
			case Actor:
				enterOuterAlt(_localctx, 5);
				{
				setState(568);
				match(Actor);
				}
				break;
			case Primitive:
				enterOuterAlt(_localctx, 6);
				{
				setState(569);
				match(Primitive);
				}
				break;
			case MsgRcv:
				enterOuterAlt(_localctx, 7);
				{
				setState(570);
				match(MsgRcv);

				        ((BuiltInTypeContext)_localctx).is_msgrcv =  true;
				    
				}
				break;
			case MsgObs:
				enterOuterAlt(_localctx, 8);
				{
				setState(572);
				match(MsgObs);

				        ((BuiltInTypeContext)_localctx).is_msgobs =  true;
				    
				}
				break;
			case ActorVars:
				enterOuterAlt(_localctx, 9);
				{
				setState(574);
				match(ActorVars);
				}
				break;
			case List:
				enterOuterAlt(_localctx, 10);
				{
				setState(575);
				list();
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 11);
				{
				setState(576);
				set();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetContext extends ParserRuleContext {
		public TerminalNode Set() { return getToken(SOACTParser.Set, 0); }
		public TerminalNode Less() { return getToken(SOACTParser.Less, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Greater() { return getToken(SOACTParser.Greater, 0); }
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(Set);
			setState(580);
			match(Less);
			setState(581);
			type();
			setState(582);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode List() { return getToken(SOACTParser.List, 0); }
		public TerminalNode Less() { return getToken(SOACTParser.Less, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Greater() { return getToken(SOACTParser.Greater, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(List);
			setState(585);
			match(Less);
			setState(586);
			type();
			setState(587);
			match(Greater);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001P\u024e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0001\u0000\u0003\u0000\u008a\b\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001\u008f\b\u0001\u000b\u0001"+
		"\f\u0001\u0090\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0097\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u009f\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0004\u0005\u00a4\b\u0005\u000b\u0005\f\u0005\u00a5\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00ab\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00b3\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00cd\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00da"+
		"\b\u0010\n\u0010\f\u0010\u00dd\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00e6\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00ed\b\u0013\n\u0013\f\u0013\u00f0\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00f7\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00fe\b\u0016\n"+
		"\u0016\f\u0016\u0101\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0106\b\u0017\n\u0017\f\u0017\u0109\t\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0111\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u0116\b\u001a\u000b\u001a"+
		"\f\u001a\u0117\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0122\b\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u012e\b\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u0148"+
		"\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u015e\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u016e\b\'\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0005)\u017d\b)\n)\f)\u0180\t)\u0001)\u0001)\u0001)\u0003"+
		")\u0185\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u018d\b*\u0001"+
		"*\u0001*\u0001*\u0003*\u0192\b*\u0001+\u0001+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0003,\u019b\b,\u0001,\u0003,\u019e\b,\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00011\u00011\u00011\u00011\u00031\u01b4\b1\u00012\u0001"+
		"2\u00012\u00012\u00032\u01ba\b2\u00013\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00033\u01c3\b3\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u01cc\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u01d5\b5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00036\u01e1\b6\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00037\u01f0\b7\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u01f7\b8\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u01fe\b9\u0001:\u0001:\u0001:\u0001:\u0001:\u0003:\u0205\b:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u020c\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0003<\u0215\b<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u021b\b<\u0001<\u0001<\u0001<\u0003<\u0220\b<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"@\u0001@\u0001@\u0001@\u0003@\u0233\b@\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u0242"+
		"\bA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0000\u0000D\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0000\u0001\u0002\u0000::LL"+
		"\u025e\u0000\u0089\u0001\u0000\u0000\u0000\u0002\u008e\u0001\u0000\u0000"+
		"\u0000\u0004\u0096\u0001\u0000\u0000\u0000\u0006\u0098\u0001\u0000\u0000"+
		"\u0000\b\u009c\u0001\u0000\u0000\u0000\n\u00a3\u0001\u0000\u0000\u0000"+
		"\f\u00aa\u0001\u0000\u0000\u0000\u000e\u00ac\u0001\u0000\u0000\u0000\u0010"+
		"\u00b0\u0001\u0000\u0000\u0000\u0012\u00b9\u0001\u0000\u0000\u0000\u0014"+
		"\u00bd\u0001\u0000\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018"+
		"\u00c5\u0001\u0000\u0000\u0000\u001a\u00c9\u0001\u0000\u0000\u0000\u001c"+
		"\u00ce\u0001\u0000\u0000\u0000\u001e\u00d2\u0001\u0000\u0000\u0000 \u00d6"+
		"\u0001\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000\u0000$\u00e3\u0001"+
		"\u0000\u0000\u0000&\u00e9\u0001\u0000\u0000\u0000(\u00f1\u0001\u0000\u0000"+
		"\u0000*\u00f4\u0001\u0000\u0000\u0000,\u00fa\u0001\u0000\u0000\u0000."+
		"\u0102\u0001\u0000\u0000\u00000\u010a\u0001\u0000\u0000\u00002\u010e\u0001"+
		"\u0000\u0000\u00004\u0115\u0001\u0000\u0000\u00006\u0121\u0001\u0000\u0000"+
		"\u00008\u0123\u0001\u0000\u0000\u0000:\u012d\u0001\u0000\u0000\u0000<"+
		"\u012f\u0001\u0000\u0000\u0000>\u0134\u0001\u0000\u0000\u0000@\u0138\u0001"+
		"\u0000\u0000\u0000B\u013d\u0001\u0000\u0000\u0000D\u0141\u0001\u0000\u0000"+
		"\u0000F\u0147\u0001\u0000\u0000\u0000H\u015d\u0001\u0000\u0000\u0000J"+
		"\u015f\u0001\u0000\u0000\u0000L\u0162\u0001\u0000\u0000\u0000N\u016d\u0001"+
		"\u0000\u0000\u0000P\u016f\u0001\u0000\u0000\u0000R\u0172\u0001\u0000\u0000"+
		"\u0000T\u0186\u0001\u0000\u0000\u0000V\u0193\u0001\u0000\u0000\u0000X"+
		"\u0197\u0001\u0000\u0000\u0000Z\u01a1\u0001\u0000\u0000\u0000\\\u01a5"+
		"\u0001\u0000\u0000\u0000^\u01a9\u0001\u0000\u0000\u0000`\u01ad\u0001\u0000"+
		"\u0000\u0000b\u01af\u0001\u0000\u0000\u0000d\u01b5\u0001\u0000\u0000\u0000"+
		"f\u01bb\u0001\u0000\u0000\u0000h\u01c4\u0001\u0000\u0000\u0000j\u01cd"+
		"\u0001\u0000\u0000\u0000l\u01d6\u0001\u0000\u0000\u0000n\u01ef\u0001\u0000"+
		"\u0000\u0000p\u01f1\u0001\u0000\u0000\u0000r\u01f8\u0001\u0000\u0000\u0000"+
		"t\u0204\u0001\u0000\u0000\u0000v\u0206\u0001\u0000\u0000\u0000x\u021f"+
		"\u0001\u0000\u0000\u0000z\u0221\u0001\u0000\u0000\u0000|\u0225\u0001\u0000"+
		"\u0000\u0000~\u0229\u0001\u0000\u0000\u0000\u0080\u0232\u0001\u0000\u0000"+
		"\u0000\u0082\u0241\u0001\u0000\u0000\u0000\u0084\u0243\u0001\u0000\u0000"+
		"\u0000\u0086\u0248\u0001\u0000\u0000\u0000\u0088\u008a\u0003\u0002\u0001"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0000\u0000"+
		"\u0001\u008c\u0001\u0001\u0000\u0000\u0000\u008d\u008f\u0003\u0004\u0002"+
		"\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000"+
		"\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0003\u0001\u0000\u0000\u0000\u0092\u0097\u0003\"\u0011\u0000"+
		"\u0093\u0097\u0003\u0006\u0003\u0000\u0094\u0097\u0003\u0016\u000b\u0000"+
		"\u0095\u0097\u0003\u001c\u000e\u0000\u0096\u0092\u0001\u0000\u0000\u0000"+
		"\u0096\u0093\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0005\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005)\u0000\u0000\u0099\u009a\u0005L\u0000\u0000\u009a\u009b"+
		"\u0003\b\u0004\u0000\u009b\u0007\u0001\u0000\u0000\u0000\u009c\u009e\u0005"+
		"\t\u0000\u0000\u009d\u009f\u0003\n\u0005\u0000\u009e\u009d\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\n\u0000\u0000\u00a1\t\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a4\u0003\f\u0006\u0000\u00a3\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u000b\u0001\u0000\u0000\u0000"+
		"\u00a7\u00ab\u0003\u0014\n\u0000\u00a8\u00ab\u0003\u000e\u0007\u0000\u00a9"+
		"\u00ab\u0003\u0010\b\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00ab\r\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005L\u0000\u0000\u00ad\u00ae\u0003$\u0012"+
		"\u0000\u00ae\u00af\u00032\u0019\u0000\u00af\u000f\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0003\u0080@\u0000\u00b1\u00b3\u0003\u0012\t\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005L\u0000\u0000\u00b5\u00b6"+
		"\u0006\b\uffff\uffff\u0000\u00b6\u00b7\u0003$\u0012\u0000\u00b7\u00b8"+
		"\u00032\u0019\u0000\u00b8\u0011\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005"+
		"\b\u0000\u0000\u00ba\u00bb\u0005=\u0000\u0000\u00bb\u00bc\u0003*\u0015"+
		"\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00be\u0005-\u0000\u0000"+
		"\u00be\u00bf\u0003\u0018\f\u0000\u00bf\u0015\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u00057\u0000\u0000\u00c1\u00c2\u0006\u000b\uffff\uffff\u0000\u00c2"+
		"\u00c3\u0005L\u0000\u0000\u00c3\u00c4\u0003\u0018\f\u0000\u00c4\u0017"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\t\u0000\u0000\u00c6\u00c7\u0003"+
		"\u001a\r\u0000\u00c7\u00c8\u0005\n\u0000\u0000\u00c8\u0019\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0003(\u0014\u0000\u00ca\u00cc\u0005\u0004\u0000"+
		"\u0000\u00cb\u00cd\u0003\u001a\r\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u001b\u0001\u0000\u0000\u0000"+
		"\u00ce\u00cf\u0005*\u0000\u0000\u00cf\u00d0\u0005L\u0000\u0000\u00d0\u00d1"+
		"\u0003\u001e\u000f\u0000\u00d1\u001d\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005\t\u0000\u0000\u00d3\u00d4\u0003 \u0010\u0000\u00d4\u00d5\u0005"+
		"\n\u0000\u0000\u00d5\u001f\u0001\u0000\u0000\u0000\u00d6\u00db\u0005L"+
		"\u0000\u0000\u00d7\u00d8\u0005!\u0000\u0000\u00d8\u00da\u0005L\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
		"\u00dc!\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\u0005B\u0000\u0000\u00df\u00e0\u0006\u0011\uffff\uffff\u0000\u00e0"+
		"\u00e1\u0003$\u0012\u0000\u00e1\u00e2\u00032\u0019\u0000\u00e2#\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0005\u0012\u0000\u0000\u00e4\u00e6\u0003"+
		"&\u0013\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0013"+
		"\u0000\u0000\u00e8%\u0001\u0000\u0000\u0000\u00e9\u00ee\u0003(\u0014\u0000"+
		"\u00ea\u00eb\u0005!\u0000\u0000\u00eb\u00ed\u0003(\u0014\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\'\u0001"+
		"\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003"+
		"\u0080@\u0000\u00f2\u00f3\u0005L\u0000\u0000\u00f3)\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f6\u0005\u0012\u0000\u0000\u00f5\u00f7\u0003,\u0016\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0013\u0000\u0000"+
		"\u00f9+\u0001\u0000\u0000\u0000\u00fa\u00ff\u0003`0\u0000\u00fb\u00fc"+
		"\u0005!\u0000\u0000\u00fc\u00fe\u0003`0\u0000\u00fd\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100-\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0107\u00030\u0018\u0000"+
		"\u0103\u0104\u0005!\u0000\u0000\u0104\u0106\u00030\u0018\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108/\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"L\u0000\u0000\u010b\u010c\u0005\u0006\u0000\u0000\u010c\u010d\u0003`0"+
		"\u0000\u010d1\u0001\u0000\u0000\u0000\u010e\u0110\u0005\t\u0000\u0000"+
		"\u010f\u0111\u00034\u001a\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0110"+
		"\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112"+
		"\u0113\u0005\n\u0000\u0000\u01133\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u00036\u001b\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u01185\u0001\u0000\u0000\u0000\u0119\u0122\u0003X,"+
		"\u0000\u011a\u0122\u0003P(\u0000\u011b\u0122\u0003F#\u0000\u011c\u0122"+
		"\u0003R)\u0000\u011d\u0122\u0003@ \u0000\u011e\u0122\u0003<\u001e\u0000"+
		"\u011f\u0122\u00038\u001c\u0000\u0120\u0122\u0003:\u001d\u0000\u0121\u0119"+
		"\u0001\u0000\u0000\u0000\u0121\u011a\u0001\u0000\u0000\u0000\u0121\u011b"+
		"\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000\u0121\u011d"+
		"\u0001\u0000\u0000\u0000\u0121\u011e\u0001\u0000\u0000\u0000\u0121\u011f"+
		"\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u01227\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u00056\u0000\u0000\u0124\u0125\u0006\u001c"+
		"\uffff\uffff\u0000\u0125\u0126\u00032\u0019\u0000\u01269\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u00050\u0000\u0000\u0128\u0129\u0006\u001d\uffff\uffff"+
		"\u0000\u0129\u012e\u0005\u0004\u0000\u0000\u012a\u012b\u00051\u0000\u0000"+
		"\u012b\u012c\u0006\u001d\uffff\uffff\u0000\u012c\u012e\u0005\u0004\u0000"+
		"\u0000\u012d\u0127\u0001\u0000\u0000\u0000\u012d\u012a\u0001\u0000\u0000"+
		"\u0000\u012e;\u0001\u0000\u0000\u0000\u012f\u0130\u00055\u0000\u0000\u0130"+
		"\u0131\u0006\u001e\uffff\uffff\u0000\u0131\u0132\u0003>\u001f\u0000\u0132"+
		"\u0133\u00032\u0019\u0000\u0133=\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\u0012\u0000\u0000\u0135\u0136\u0003`0\u0000\u0136\u0137\u0005\u0013\u0000"+
		"\u0000\u0137?\u0001\u0000\u0000\u0000\u0138\u0139\u00054\u0000\u0000\u0139"+
		"\u013a\u0006 \uffff\uffff\u0000\u013a\u013b\u0003B!\u0000\u013b\u013c"+
		"\u00032\u0019\u0000\u013cA\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0012"+
		"\u0000\u0000\u013e\u013f\u0003D\"\u0000\u013f\u0140\u0005\u0013\u0000"+
		"\u0000\u0140C\u0001\u0000\u0000\u0000\u0141\u0142\u0005L\u0000\u0000\u0142"+
		"\u0143\u00058\u0000\u0000\u0143\u0144\u0003`0\u0000\u0144E\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0005:\u0000\u0000\u0146\u0148\u0005\u0007\u0000"+
		"\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000"+
		"\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0005L\u0000\u0000"+
		"\u014a\u014b\u0005\u001e\u0000\u0000\u014b\u014c\u0003`0\u0000\u014c\u014d"+
		"\u0006#\uffff\uffff\u0000\u014d\u014e\u0005\u0004\u0000\u0000\u014eG\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005>\u0000\u0000\u0150\u015e\u0006$\uffff"+
		"\uffff\u0000\u0151\u0152\u0005?\u0000\u0000\u0152\u015e\u0006$\uffff\uffff"+
		"\u0000\u0153\u0154\u0005@\u0000\u0000\u0154\u015e\u0006$\uffff\uffff\u0000"+
		"\u0155\u0156\u0005A\u0000\u0000\u0156\u015e\u0006$\uffff\uffff\u0000\u0157"+
		"\u0158\u0005G\u0000\u0000\u0158\u015e\u0006$\uffff\uffff\u0000\u0159\u015a"+
		"\u0005H\u0000\u0000\u015a\u015e\u0006$\uffff\uffff\u0000\u015b\u015c\u0005"+
		";\u0000\u0000\u015c\u015e\u0006$\uffff\uffff\u0000\u015d\u014f\u0001\u0000"+
		"\u0000\u0000\u015d\u0151\u0001\u0000\u0000\u0000\u015d\u0153\u0001\u0000"+
		"\u0000\u0000\u015d\u0155\u0001\u0000\u0000\u0000\u015d\u0157\u0001\u0000"+
		"\u0000\u0000\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000"+
		"\u0000\u0000\u015eI\u0001\u0000\u0000\u0000\u015f\u0160\u0003H$\u0000"+
		"\u0160\u0161\u0003*\u0015\u0000\u0161K\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0003N\'\u0000\u0163\u0164\u0003*\u0015\u0000\u0164M\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0005C\u0000\u0000\u0166\u016e\u0006\'\uffff\uffff"+
		"\u0000\u0167\u0168\u0005D\u0000\u0000\u0168\u016e\u0006\'\uffff\uffff"+
		"\u0000\u0169\u016a\u0005E\u0000\u0000\u016a\u016e\u0006\'\uffff\uffff"+
		"\u0000\u016b\u016c\u0005F\u0000\u0000\u016c\u016e\u0006\'\uffff\uffff"+
		"\u0000\u016d\u0165\u0001\u0000\u0000\u0000\u016d\u0167\u0001\u0000\u0000"+
		"\u0000\u016d\u0169\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000"+
		"\u0000\u016eO\u0001\u0000\u0000\u0000\u016f\u0170\u0003`0\u0000\u0170"+
		"\u0171\u0005\u0004\u0000\u0000\u0171Q\u0001\u0000\u0000\u0000\u0172\u0173"+
		"\u00052\u0000\u0000\u0173\u0174\u0006)\uffff\uffff\u0000\u0174\u0175\u0003"+
		"^/\u0000\u0175\u017e\u00032\u0019\u0000\u0176\u0177\u00053\u0000\u0000"+
		"\u0177\u0178\u00052\u0000\u0000\u0178\u0179\u0006)\uffff\uffff\u0000\u0179"+
		"\u017a\u0003^/\u0000\u017a\u017b\u00032\u0019\u0000\u017b\u017d\u0001"+
		"\u0000\u0000\u0000\u017c\u0176\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f\u0184\u0001\u0000\u0000\u0000\u0180\u017e\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u00053\u0000\u0000\u0182\u0183\u0006)\uffff"+
		"\uffff\u0000\u0183\u0185\u00032\u0019\u0000\u0184\u0181\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185S\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0007\u0000\u0000\u0000\u0187\u0188\u0005\u0007\u0000\u0000"+
		"\u0188\u0191\u0005L\u0000\u0000\u0189\u018a\u0003*\u0015\u0000\u018a\u018c"+
		"\u0006*\uffff\uffff\u0000\u018b\u018d\u0003V+\u0000\u018c\u018b\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0192\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0005\u001e\u0000\u0000\u018f\u0190\u0006"+
		"*\uffff\uffff\u0000\u0190\u0192\u0005L\u0000\u0000\u0191\u0189\u0001\u0000"+
		"\u0000\u0000\u0191\u018e\u0001\u0000\u0000\u0000\u0192U\u0001\u0000\u0000"+
		"\u0000\u0193\u0194\u0005\b\u0000\u0000\u0194\u0195\u0005<\u0000\u0000"+
		"\u0195\u0196\u0003*\u0015\u0000\u0196W\u0001\u0000\u0000\u0000\u0197\u0198"+
		"\u0003\u0080@\u0000\u0198\u019a\u0005L\u0000\u0000\u0199\u019b\u0003Z"+
		"-\u0000\u019a\u0199\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000"+
		"\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c\u019e\u0003\\.\u0000"+
		"\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\u0004\u0000\u0000"+
		"\u01a0Y\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005\u0014\u0000\u0000\u01a2"+
		"\u01a3\u0003`0\u0000\u01a3\u01a4\u0005\u0015\u0000\u0000\u01a4[\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0005\u001e\u0000\u0000\u01a6\u01a7\u0003"+
		"`0\u0000\u01a7\u01a8\u0006.\uffff\uffff\u0000\u01a8]\u0001\u0000\u0000"+
		"\u0000\u01a9\u01aa\u0005\u0012\u0000\u0000\u01aa\u01ab\u0003`0\u0000\u01ab"+
		"\u01ac\u0005\u0013\u0000\u0000\u01ac_\u0001\u0000\u0000\u0000\u01ad\u01ae"+
		"\u0003b1\u0000\u01aea\u0001\u0000\u0000\u0000\u01af\u01b3\u0003d2\u0000"+
		"\u01b0\u01b1\u0005\u0011\u0000\u0000\u01b1\u01b2\u00061\uffff\uffff\u0000"+
		"\u01b2\u01b4\u0003b1\u0000\u01b3\u01b0\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b4c\u0001\u0000\u0000\u0000\u01b5\u01b9\u0003"+
		"f3\u0000\u01b6\u01b7\u0005\u0010\u0000\u0000\u01b7\u01b8\u00062\uffff"+
		"\uffff\u0000\u01b8\u01ba\u0003d2\u0000\u01b9\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b9\u01ba\u0001\u0000\u0000\u0000\u01bae\u0001\u0000\u0000\u0000\u01bb"+
		"\u01c2\u0003h4\u0000\u01bc\u01bd\u0005\u000e\u0000\u0000\u01bd\u01be\u0006"+
		"3\uffff\uffff\u0000\u01be\u01c3\u0003f3\u0000\u01bf\u01c0\u0005\u000f"+
		"\u0000\u0000\u01c0\u01c1\u00063\uffff\uffff\u0000\u01c1\u01c3\u0003f3"+
		"\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000\u01c2\u01bf\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000\u01c3g\u0001\u0000\u0000\u0000"+
		"\u01c4\u01cb\u0003j5\u0000\u01c5\u01c6\u0005\u001f\u0000\u0000\u01c6\u01c7"+
		"\u00064\uffff\uffff\u0000\u01c7\u01cc\u0003h4\u0000\u01c8\u01c9\u0005"+
		" \u0000\u0000\u01c9\u01ca\u00064\uffff\uffff\u0000\u01ca\u01cc\u0003h"+
		"4\u0000\u01cb\u01c5\u0001\u0000\u0000\u0000\u01cb\u01c8\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cci\u0001\u0000\u0000\u0000"+
		"\u01cd\u01d4\u0003l6\u0000\u01ce\u01cf\u0005\u0016\u0000\u0000\u01cf\u01d0"+
		"\u00065\uffff\uffff\u0000\u01d0\u01d5\u0003j5\u0000\u01d1\u01d2\u0005"+
		"\u0017\u0000\u0000\u01d2\u01d3\u00065\uffff\uffff\u0000\u01d3\u01d5\u0003"+
		"j5\u0000\u01d4\u01ce\u0001\u0000\u0000\u0000\u01d4\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5k\u0001\u0000\u0000\u0000"+
		"\u01d6\u01e0\u0003n7\u0000\u01d7\u01d8\u0005\u0018\u0000\u0000\u01d8\u01d9"+
		"\u00066\uffff\uffff\u0000\u01d9\u01e1\u0003l6\u0000\u01da\u01db\u0005"+
		"\u0019\u0000\u0000\u01db\u01dc\u00066\uffff\uffff\u0000\u01dc\u01e1\u0003"+
		"l6\u0000\u01dd\u01de\u0005\u001a\u0000\u0000\u01de\u01df\u00066\uffff"+
		"\uffff\u0000\u01df\u01e1\u0003l6\u0000\u01e0\u01d7\u0001\u0000\u0000\u0000"+
		"\u01e0\u01da\u0001\u0000\u0000\u0000\u01e0\u01dd\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1m\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0005\f\u0000\u0000\u01e3\u01e4\u00067\uffff\uffff\u0000\u01e4"+
		"\u01f0\u0003n7\u0000\u01e5\u01e6\u0005\r\u0000\u0000\u01e6\u01e7\u0006"+
		"7\uffff\uffff\u0000\u01e7\u01f0\u0003n7\u0000\u01e8\u01e9\u0005\u001d"+
		"\u0000\u0000\u01e9\u01ea\u00067\uffff\uffff\u0000\u01ea\u01f0\u0003n7"+
		"\u0000\u01eb\u01ec\u0005\u0017\u0000\u0000\u01ec\u01ed\u00067\uffff\uffff"+
		"\u0000\u01ed\u01f0\u0003n7\u0000\u01ee\u01f0\u0003p8\u0000\u01ef\u01e2"+
		"\u0001\u0000\u0000\u0000\u01ef\u01e5\u0001\u0000\u0000\u0000\u01ef\u01e8"+
		"\u0001\u0000\u0000\u0000\u01ef\u01eb\u0001\u0000\u0000\u0000\u01ef\u01ee"+
		"\u0001\u0000\u0000\u0000\u01f0o\u0001\u0000\u0000\u0000\u01f1\u01f6\u0003"+
		"r9\u0000\u01f2\u01f3\u0005\f\u0000\u0000\u01f3\u01f7\u00068\uffff\uffff"+
		"\u0000\u01f4\u01f5\u0005\r\u0000\u0000\u01f5\u01f7\u00068\uffff\uffff"+
		"\u0000\u01f6\u01f2\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7q\u0001\u0000\u0000\u0000"+
		"\u01f8\u01fd\u0003t:\u0000\u01f9\u01fa\u0005\u0014\u0000\u0000\u01fa\u01fb"+
		"\u0003`0\u0000\u01fb\u01fc\u0005\u0015\u0000\u0000\u01fc\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fd\u01f9\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000"+
		"\u0000\u0000\u01fes\u0001\u0000\u0000\u0000\u01ff\u0200\u0005\u0012\u0000"+
		"\u0000\u0200\u0201\u0003`0\u0000\u0201\u0202\u0005\u0013\u0000\u0000\u0202"+
		"\u0205\u0001\u0000\u0000\u0000\u0203\u0205\u0003v;\u0000\u0204\u01ff\u0001"+
		"\u0000\u0000\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205u\u0001\u0000"+
		"\u0000\u0000\u0206\u020b\u0003x<\u0000\u0207\u0208\u0005\u000b\u0000\u0000"+
		"\u0208\u0209\u0003v;\u0000\u0209\u020a\u0006;\uffff\uffff\u0000\u020a"+
		"\u020c\u0001\u0000\u0000\u0000\u020b\u0207\u0001\u0000\u0000\u0000\u020b"+
		"\u020c\u0001\u0000\u0000\u0000\u020cw\u0001\u0000\u0000\u0000\u020d\u0220"+
		"\u0003T*\u0000\u020e\u0220\u0003|>\u0000\u020f\u0220\u0003~?\u0000\u0210"+
		"\u0220\u0003z=\u0000\u0211\u0220\u0003J%\u0000\u0212\u0213\u0005:\u0000"+
		"\u0000\u0213\u0215\u0005\u0007\u0000\u0000\u0214\u0212\u0001\u0000\u0000"+
		"\u0000\u0214\u0215\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000"+
		"\u0000\u0216\u0220\u0005\u0003\u0000\u0000\u0217\u021a\u0005L\u0000\u0000"+
		"\u0218\u0219\u0005\u0007\u0000\u0000\u0219\u021b\u0003L&\u0000\u021a\u0218"+
		"\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u0220"+
		"\u0001\u0000\u0000\u0000\u021c\u0220\u0005\"\u0000\u0000\u021d\u0220\u0005"+
		"$\u0000\u0000\u021e\u0220\u0005K\u0000\u0000\u021f\u020d\u0001\u0000\u0000"+
		"\u0000\u021f\u020e\u0001\u0000\u0000\u0000\u021f\u020f\u0001\u0000\u0000"+
		"\u0000\u021f\u0210\u0001\u0000\u0000\u0000\u021f\u0211\u0001\u0000\u0000"+
		"\u0000\u021f\u0214\u0001\u0000\u0000\u0000\u021f\u0217\u0001\u0000\u0000"+
		"\u0000\u021f\u021c\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u0220y\u0001\u0000\u0000\u0000"+
		"\u0221\u0222\u0005L\u0000\u0000\u0222\u0223\u0005\u0005\u0000\u0000\u0223"+
		"\u0224\u0005L\u0000\u0000\u0224{\u0001\u0000\u0000\u0000\u0225\u0226\u0005"+
		"9\u0000\u0000\u0226\u0227\u0005L\u0000\u0000\u0227\u0228\u0003*\u0015"+
		"\u0000\u0228}\u0001\u0000\u0000\u0000\u0229\u022a\u0005L\u0000\u0000\u022a"+
		"\u022b\u0005\t\u0000\u0000\u022b\u022c\u0003.\u0017\u0000\u022c\u022d"+
		"\u0005\n\u0000\u0000\u022d\u007f\u0001\u0000\u0000\u0000\u022e\u022f\u0003"+
		"\u0082A\u0000\u022f\u0230\u0006@\uffff\uffff\u0000\u0230\u0233\u0001\u0000"+
		"\u0000\u0000\u0231\u0233\u0005L\u0000\u0000\u0232\u022e\u0001\u0000\u0000"+
		"\u0000\u0232\u0231\u0001\u0000\u0000\u0000\u0233\u0081\u0001\u0000\u0000"+
		"\u0000\u0234\u0242\u0005%\u0000\u0000\u0235\u0242\u0005&\u0000\u0000\u0236"+
		"\u0242\u0005\'\u0000\u0000\u0237\u0242\u0005(\u0000\u0000\u0238\u0242"+
		"\u0005)\u0000\u0000\u0239\u0242\u0005*\u0000\u0000\u023a\u023b\u0005+"+
		"\u0000\u0000\u023b\u0242\u0006A\uffff\uffff\u0000\u023c\u023d\u0005,\u0000"+
		"\u0000\u023d\u0242\u0006A\uffff\uffff\u0000\u023e\u0242\u0005-\u0000\u0000"+
		"\u023f\u0242\u0003\u0086C\u0000\u0240\u0242\u0003\u0084B\u0000\u0241\u0234"+
		"\u0001\u0000\u0000\u0000\u0241\u0235\u0001\u0000\u0000\u0000\u0241\u0236"+
		"\u0001\u0000\u0000\u0000\u0241\u0237\u0001\u0000\u0000\u0000\u0241\u0238"+
		"\u0001\u0000\u0000\u0000\u0241\u0239\u0001\u0000\u0000\u0000\u0241\u023a"+
		"\u0001\u0000\u0000\u0000\u0241\u023c\u0001\u0000\u0000\u0000\u0241\u023e"+
		"\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241\u0240"+
		"\u0001\u0000\u0000\u0000\u0242\u0083\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0005/\u0000\u0000\u0244\u0245\u0005\u001f\u0000\u0000\u0245\u0246\u0003"+
		"\u0080@\u0000\u0246\u0247\u0005 \u0000\u0000\u0247\u0085\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0005.\u0000\u0000\u0249\u024a\u0005\u001f\u0000\u0000"+
		"\u024a\u024b\u0003\u0080@\u0000\u024b\u024c\u0005 \u0000\u0000\u024c\u0087"+
		"\u0001\u0000\u0000\u0000+\u0089\u0090\u0096\u009e\u00a5\u00aa\u00b2\u00cc"+
		"\u00db\u00e5\u00ee\u00f6\u00ff\u0107\u0110\u0117\u0121\u012d\u0147\u015d"+
		"\u016d\u017e\u0184\u018c\u0191\u019a\u019d\u01b3\u01b9\u01c2\u01cb\u01d4"+
		"\u01e0\u01ef\u01f6\u01fd\u0204\u020b\u0214\u021a\u021f\u0232\u0241";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}