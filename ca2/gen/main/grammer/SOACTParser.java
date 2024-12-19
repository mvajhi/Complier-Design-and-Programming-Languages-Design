// Generated from D:/UT/Term 7/PLC-TA/git/Fall-1403-project/Phase1/Project/src/main/grammer/SOACT.g4 by ANTLR 4.13.1
package main.grammer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SOACTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ACTOR=1, INT=2, IF=3, STRING=4, OBSERVERS=5, MSGRCV=6, SELF=7, TRUE=8, 
		ELSE=9, BREAK=10, FOR=11, MSGOBS=12, PUBLIC=13, FALSE=14, BOOLEAN=15, 
		CONTINUE=16, WHILE=17, AUTHORIZED=18, RANGE=19, NULL=20, JOIN=21, PRIVATE=22, 
		TOUPPER=23, TOLOWER=24, LENGTH=25, SET=26, LIST=27, ACTORVAR=28, REMOVE=29, 
		INCLUDE=30, ADD=31, MAIN=32, PRINT=33, REVERSE=34, NEW=35, ID=36, PRIMITIVE=37, 
		IN=38, RECORD=39, PLUS=40, MINUS=41, MULT=42, DIVIDE=43, MOD=44, PIPE_OP=45, 
		EQUAL=46, NOT_EQUAL=47, GREATER_THAN=48, LESS_THAN=49, AND=50, OR=51, 
		NOT=52, INCREMENT=53, DECREMENT=54, QUESTION_MARK=55, ASSIGN=56, LPAR=57, 
		RPAR=58, LBRACK=59, RBRACK=60, LBRACE=61, RBRACE=62, COMMA=63, DOT=64, 
		SEMICOLON=65, COLON=66, INT_VALUE=67, IDENTIFIER=68, STRING_VALUE=69, 
		COMMENT=70, WS=71;
	public static final int
		RULE_program = 0, RULE_record = 1, RULE_actorDec = 2, RULE_actorBody = 3, 
		RULE_customPrimitive = 4, RULE_actorVars = 5, RULE_init = 6, RULE_arrayIndex = 7, 
		RULE_primitives = 8, RULE_container = 9, RULE_constructor = 10, RULE_msgHandler = 11, 
		RULE_arguments = 12, RULE_arrayType = 13, RULE_authorized = 14, RULE_accesslevels = 15, 
		RULE_accesslevelsParam = 16, RULE_forLoop = 17, RULE_forLoopCondition = 18, 
		RULE_range = 19, RULE_whileLoop = 20, RULE_ifBlock = 21, RULE_joinBlock = 22, 
		RULE_joinBlockBody = 23, RULE_pipeStatement = 24, RULE_main = 25, RULE_body = 26, 
		RULE_statements = 27, RULE_initStatement = 28, RULE_initRecord = 29, RULE_assignStatement = 30, 
		RULE_exprStatement = 31, RULE_observeStatement = 32, RULE_observers = 33, 
		RULE_expression = 34, RULE_expComma = 35, RULE_expCommaPrim = 36, RULE_expAssign = 37, 
		RULE_expTernary = 38, RULE_expOr = 39, RULE_expAnd = 40, RULE_expAndPrim = 41, 
		RULE_expEquals = 42, RULE_expEqualsPrim = 43, RULE_expCompare = 44, RULE_expComparePrim = 45, 
		RULE_expPlusMinus = 46, RULE_expPlusMinusPrim = 47, RULE_expDivideMultMod = 48, 
		RULE_expPreUnary = 49, RULE_expPreUnaryPrim = 50, RULE_expPostUnary = 51, 
		RULE_expBracket = 52, RULE_expAccess = 53, RULE_expPar = 54, RULE_customPrimAccess = 55, 
		RULE_handlerCall = 56, RULE_primitivesVals = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "record", "actorDec", "actorBody", "customPrimitive", "actorVars", 
			"init", "arrayIndex", "primitives", "container", "constructor", "msgHandler", 
			"arguments", "arrayType", "authorized", "accesslevels", "accesslevelsParam", 
			"forLoop", "forLoopCondition", "range", "whileLoop", "ifBlock", "joinBlock", 
			"joinBlockBody", "pipeStatement", "main", "body", "statements", "initStatement", 
			"initRecord", "assignStatement", "exprStatement", "observeStatement", 
			"observers", "expression", "expComma", "expCommaPrim", "expAssign", "expTernary", 
			"expOr", "expAnd", "expAndPrim", "expEquals", "expEqualsPrim", "expCompare", 
			"expComparePrim", "expPlusMinus", "expPlusMinusPrim", "expDivideMultMod", 
			"expPreUnary", "expPreUnaryPrim", "expPostUnary", "expBracket", "expAccess", 
			"expPar", "customPrimAccess", "handlerCall", "primitivesVals"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Actor'", "'int'", "'if'", "'string'", "'@observers'", "'msgRcv'", 
			"'self'", "'true'", "'else'", "'break'", "'for'", "'msgObs'", "'public'", 
			"'false'", "'boolean'", "'continue'", "'while'", "'@authorized'", "'range'", 
			"'null'", "'join'", "'private'", "'toUpper'", "'toLower'", "'length'", 
			"'Set'", "'List'", "'actorVars'", "'remove'", "'include'", "'add'", "'main'", 
			"'print'", "'reverse'", "'new'", "'ID'", "'primitive'", "'in'", "'Record'", 
			"'+'", "'-'", "'*'", "'/'", "'mod'", "'|>'", "'=='", "'!='", "'>'", "'<'", 
			"'&&'", "'||'", "'!'", "'++'", "'--'", "'?'", "'='", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "','", "'.'", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ACTOR", "INT", "IF", "STRING", "OBSERVERS", "MSGRCV", "SELF", 
			"TRUE", "ELSE", "BREAK", "FOR", "MSGOBS", "PUBLIC", "FALSE", "BOOLEAN", 
			"CONTINUE", "WHILE", "AUTHORIZED", "RANGE", "NULL", "JOIN", "PRIVATE", 
			"TOUPPER", "TOLOWER", "LENGTH", "SET", "LIST", "ACTORVAR", "REMOVE", 
			"INCLUDE", "ADD", "MAIN", "PRINT", "REVERSE", "NEW", "ID", "PRIMITIVE", 
			"IN", "RECORD", "PLUS", "MINUS", "MULT", "DIVIDE", "MOD", "PIPE_OP", 
			"EQUAL", "NOT_EQUAL", "GREATER_THAN", "LESS_THAN", "AND", "OR", "NOT", 
			"INCREMENT", "DECREMENT", "QUESTION_MARK", "ASSIGN", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "COMMA", "DOT", "SEMICOLON", 
			"COLON", "INT_VALUE", "IDENTIFIER", "STRING_VALUE", "COMMENT", "WS"
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
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<ActorDecContext> actorDec() {
			return getRuleContexts(ActorDecContext.class);
		}
		public ActorDecContext actorDec(int i) {
			return getRuleContext(ActorDecContext.class,i);
		}
		public List<RecordContext> record() {
			return getRuleContexts(RecordContext.class);
		}
		public RecordContext record(int i) {
			return getRuleContext(RecordContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTOR || _la==RECORD) {
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(116);
					actorDec();
					}
					break;
				case RECORD:
					{
					setState(117);
					record();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			main();
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
		public TerminalNode RECORD() { return getToken(SOACTParser.RECORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SOACTParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SOACTParser.SEMICOLON, i);
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
		enterRule(_localctx, 2, RULE_record);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(RECORD);
			System.out.println("Record");
			setState(127);
			match(IDENTIFIER);
			setState(128);
			match(LBRACE);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				init();
				setState(130);
				match(SEMICOLON);
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER );
			setState(136);
			match(RBRACE);
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
	public static class ActorDecContext extends ParserRuleContext {
		public TerminalNode ACTOR() { return getToken(SOACTParser.ACTOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public ActorBodyContext actorBody() {
			return getRuleContext(ActorBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public ActorDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorDecContext actorDec() throws RecognitionException {
		ActorDecContext _localctx = new ActorDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actorDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ACTOR);
			setState(139);
			match(IDENTIFIER);
			setState(140);
			match(LBRACE);
			setState(141);
			actorBody();
			setState(142);
			match(RBRACE);
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
	public static class ActorBodyContext extends ParserRuleContext {
		public List<CustomPrimitiveContext> customPrimitive() {
			return getRuleContexts(CustomPrimitiveContext.class);
		}
		public CustomPrimitiveContext customPrimitive(int i) {
			return getRuleContext(CustomPrimitiveContext.class,i);
		}
		public ActorVarsContext actorVars() {
			return getRuleContext(ActorVarsContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public List<MsgHandlerContext> msgHandler() {
			return getRuleContexts(MsgHandlerContext.class);
		}
		public MsgHandlerContext msgHandler(int i) {
			return getRuleContext(MsgHandlerContext.class,i);
		}
		public ActorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterActorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitActorBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitActorBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActorBodyContext actorBody() throws RecognitionException {
		ActorBodyContext _localctx = new ActorBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actorBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMITIVE) {
				{
				{
				setState(144);
				customPrimitive();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTORVAR) {
				{
				setState(150);
				actorVars();
				}
			}

			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(153);
				constructor();
				}
			}

			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGRCV || _la==MSGOBS) {
				{
				{
				setState(156);
				msgHandler();
				}
				}
				setState(161);
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
	public static class CustomPrimitiveContext extends ParserRuleContext {
		public TerminalNode PRIMITIVE() { return getToken(SOACTParser.PRIMITIVE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SOACTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SOACTParser.COMMA, i);
		}
		public CustomPrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customPrimitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterCustomPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitCustomPrimitive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitCustomPrimitive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomPrimitiveContext customPrimitive() throws RecognitionException {
		CustomPrimitiveContext _localctx = new CustomPrimitiveContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_customPrimitive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(PRIMITIVE);
			setState(163);
			match(IDENTIFIER);
			setState(164);
			match(LBRACE);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					match(IDENTIFIER);
					setState(166);
					match(COMMA);
					}
					} 
				}
				setState(171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(172);
			match(IDENTIFIER);
			setState(173);
			match(RBRACE);
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
		public TerminalNode ACTORVAR() { return getToken(SOACTParser.ACTORVAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(SOACTParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SOACTParser.SEMICOLON, i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SOACTParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SOACTParser.LPAR, i);
		}
		public List<AccesslevelsContext> accesslevels() {
			return getRuleContexts(AccesslevelsContext.class);
		}
		public AccesslevelsContext accesslevels(int i) {
			return getRuleContext(AccesslevelsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
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
		enterRule(_localctx, 10, RULE_actorVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ACTORVAR);
			setState(176);
			match(LBRACE);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(177);
				init();
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(178);
					match(LPAR);
					setState(179);
					accesslevels();
					setState(180);
					match(RPAR);
					}
				}

				setState(184);
				match(SEMICOLON);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(RBRACE);
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
	public static class InitContext extends ParserRuleContext {
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public ContainerContext container() {
			return getRuleContext(ContainerContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_init);
		int _la;
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(193);
				primitives();
				setState(194);
				match(IDENTIFIER);
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(195);
					arrayIndex();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(198);
				arrayType();
				setState(199);
				match(IDENTIFIER);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(201);
				container();
				setState(202);
				match(IDENTIFIER);
				}
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
	public static class ArrayIndexContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode INT_VALUE() { return getToken(SOACTParser.INT_VALUE, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
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
		enterRule(_localctx, 14, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(LBRACK);
			setState(207);
			match(INT_VALUE);
			setState(208);
			match(RBRACK);
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
	public static class PrimitivesContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SOACTParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SOACTParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SOACTParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(SOACTParser.ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public PrimitivesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitives; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPrimitives(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPrimitives(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPrimitives(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivesContext primitives() throws RecognitionException {
		PrimitivesContext _localctx = new PrimitivesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitives);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 68719509524L) != 0) || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class ContainerContext extends ParserRuleContext {
		public TerminalNode LESS_THAN() { return getToken(SOACTParser.LESS_THAN, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode GREATER_THAN() { return getToken(SOACTParser.GREATER_THAN, 0); }
		public TerminalNode SET() { return getToken(SOACTParser.SET, 0); }
		public TerminalNode LIST() { return getToken(SOACTParser.LIST, 0); }
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_container);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !(_la==SET || _la==LIST) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(213);
			match(LESS_THAN);
			setState(214);
			primitives();
			setState(215);
			match(GREATER_THAN);
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
	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(LPAR);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(219);
				arguments();
				}
			}

			setState(222);
			match(RPAR);
			setState(223);
			match(LBRACE);
			setState(224);
			body();
			setState(225);
			match(RBRACE);
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
	public static class MsgHandlerContext extends ParserRuleContext {
		public Token id_name;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode MSGRCV() { return getToken(SOACTParser.MSGRCV, 0); }
		public TerminalNode MSGOBS() { return getToken(SOACTParser.MSGOBS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public AuthorizedContext authorized() {
			return getRuleContext(AuthorizedContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MsgHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_msgHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterMsgHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitMsgHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitMsgHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MsgHandlerContext msgHandler() throws RecognitionException {
		MsgHandlerContext _localctx = new MsgHandlerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_msgHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !(_la==MSGRCV || _la==MSGOBS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHORIZED) {
				{
				setState(228);
				authorized();
				}
			}

			setState(231);
			((MsgHandlerContext)_localctx).id_name = match(IDENTIFIER);
			System.out.println("Handler:" + (((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getText():null));
			setState(233);
			match(LPAR);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(234);
				arguments();
				}
			}

			setState(237);
			match(RPAR);
			setState(238);
			match(LBRACE);
			setState(239);
			body();
			setState(240);
			match(RBRACE);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SOACTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SOACTParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			init();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(243);
				match(COMMA);
				setState(244);
				init();
				}
				}
				setState(249);
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			primitives();
			setState(251);
			match(LBRACK);
			setState(252);
			match(RBRACK);
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
		public TerminalNode AUTHORIZED() { return getToken(SOACTParser.AUTHORIZED, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
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
		enterRule(_localctx, 28, RULE_authorized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(AUTHORIZED);
			setState(255);
			match(LPAR);
			setState(256);
			accesslevels();
			setState(257);
			match(RPAR);
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
	public static class AccesslevelsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public List<AccesslevelsParamContext> accesslevelsParam() {
			return getRuleContexts(AccesslevelsParamContext.class);
		}
		public AccesslevelsParamContext accesslevelsParam(int i) {
			return getRuleContext(AccesslevelsParamContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode PUBLIC() { return getToken(SOACTParser.PUBLIC, 0); }
		public TerminalNode PRIVATE() { return getToken(SOACTParser.PRIVATE, 0); }
		public AccesslevelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesslevels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAccesslevels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAccesslevels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAccesslevels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesslevelsContext accesslevels() throws RecognitionException {
		AccesslevelsContext _localctx = new AccesslevelsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_accesslevels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				{
				{
				setState(259);
				match(PUBLIC);
				System.out.println("Built-In: PUBLIC");
				}
				}
				break;
			case PRIVATE:
				{
				{
				setState(261);
				match(PRIVATE);
				System.out.println("Built-In: PRIVATE");
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(265);
			match(LPAR);
			setState(266);
			accesslevelsParam();
			setState(267);
			match(COMMA);
			setState(268);
			accesslevelsParam();
			setState(269);
			match(RPAR);
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
	public static class AccesslevelsParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode NULL() { return getToken(SOACTParser.NULL, 0); }
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
		}
		public AccesslevelsParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesslevelsParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAccesslevelsParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAccesslevelsParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAccesslevelsParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccesslevelsParamContext accesslevelsParam() throws RecognitionException {
		AccesslevelsParamContext _localctx = new AccesslevelsParamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_accesslevelsParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(271);
				match(IDENTIFIER);
				}
				break;
			case NULL:
				{
				setState(272);
				match(NULL);
				}
				break;
			case SELF:
				{
				setState(273);
				match(SELF);
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				setState(274);
				accesslevels();
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
	public static class ForLoopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SOACTParser.FOR, 0); }
		public ForLoopConditionContext forLoopCondition() {
			return getRuleContext(ForLoopConditionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(FOR);
			System.out.println("Loop: FOR");
			setState(279);
			forLoopCondition();
			setState(280);
			match(LBRACE);
			setState(281);
			body();
			setState(282);
			match(RBRACE);
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
	public static class ForLoopConditionContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(SOACTParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ForLoopConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterForLoopCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitForLoopCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitForLoopCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopConditionContext forLoopCondition() throws RecognitionException {
		ForLoopConditionContext _localctx = new ForLoopConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forLoopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(LPAR);
			setState(285);
			match(IDENTIFIER);
			setState(286);
			match(IN);
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(287);
				match(IDENTIFIER);
				}
				break;
			case RANGE:
				{
				setState(288);
				range();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(291);
			match(RPAR);
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
	public static class RangeContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(SOACTParser.RANGE, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public List<TerminalNode> INT_VALUE() { return getTokens(SOACTParser.INT_VALUE); }
		public TerminalNode INT_VALUE(int i) {
			return getToken(SOACTParser.INT_VALUE, i);
		}
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(RANGE);
			setState(294);
			match(LPAR);
			setState(295);
			match(INT_VALUE);
			setState(296);
			match(COMMA);
			setState(297);
			match(INT_VALUE);
			setState(298);
			match(RPAR);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(SOACTParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(WHILE);
			System.out.println("Loop: WHILE");
			setState(302);
			match(LPAR);
			setState(303);
			expression();
			setState(304);
			match(RPAR);
			setState(305);
			match(LBRACE);
			setState(306);
			body();
			setState(307);
			match(RBRACE);
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
	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SOACTParser.IF, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(SOACTParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SOACTParser.LBRACE, i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SOACTParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SOACTParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(SOACTParser.ELSE, 0); }
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(IF);
			System.out.println("Decision: IF");
			setState(311);
			match(LPAR);
			setState(312);
			expression();
			setState(313);
			match(RPAR);
			setState(314);
			match(LBRACE);
			setState(315);
			body();
			setState(316);
			match(RBRACE);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(317);
				match(ELSE);
				System.out.println("Decision: ELSE");
				setState(319);
				match(LBRACE);
				setState(320);
				body();
				setState(321);
				match(RBRACE);
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
	public static class JoinBlockContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(SOACTParser.JOIN, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public JoinBlockBodyContext joinBlockBody() {
			return getRuleContext(JoinBlockBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public JoinBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterJoinBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitJoinBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitJoinBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinBlockContext joinBlock() throws RecognitionException {
		JoinBlockContext _localctx = new JoinBlockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_joinBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(JOIN);
			System.out.println("Join");
			setState(327);
			match(LBRACE);
			setState(328);
			joinBlockBody();
			setState(329);
			match(RBRACE);
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
	public static class JoinBlockBodyContext extends ParserRuleContext {
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public PipeStatementContext pipeStatement() {
			return getRuleContext(PipeStatementContext.class,0);
		}
		public JoinBlockBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinBlockBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterJoinBlockBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitJoinBlockBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitJoinBlockBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinBlockBodyContext joinBlockBody() throws RecognitionException {
		JoinBlockBodyContext _localctx = new JoinBlockBodyContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_joinBlockBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			body();
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(332);
				pipeStatement();
				}
				break;
			}
			setState(335);
			body();
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
	public static class PipeStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public List<TerminalNode> PIPE_OP() { return getTokens(SOACTParser.PIPE_OP); }
		public TerminalNode PIPE_OP(int i) {
			return getToken(SOACTParser.PIPE_OP, i);
		}
		public PipeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPipeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPipeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPipeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PipeStatementContext pipeStatement() throws RecognitionException {
		PipeStatementContext _localctx = new PipeStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pipeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			expression();
			setState(338);
			match(ASSIGN);
			setState(339);
			expression();
			setState(342); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(340);
				match(PIPE_OP);
				setState(341);
				expression();
				}
				}
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE_OP );
			setState(346);
			match(SEMICOLON);
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
		public TerminalNode MAIN() { return getToken(SOACTParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
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
		enterRule(_localctx, 50, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(MAIN);
			System.out.println("MAIN");
			setState(350);
			match(LPAR);
			setState(351);
			match(RPAR);
			setState(352);
			match(LBRACE);
			setState(353);
			body();
			setState(354);
			match(RBRACE);
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
	public static class BodyContext extends ParserRuleContext {
		public List<ForLoopContext> forLoop() {
			return getRuleContexts(ForLoopContext.class);
		}
		public ForLoopContext forLoop(int i) {
			return getRuleContext(ForLoopContext.class,i);
		}
		public List<WhileLoopContext> whileLoop() {
			return getRuleContexts(WhileLoopContext.class);
		}
		public WhileLoopContext whileLoop(int i) {
			return getRuleContext(WhileLoopContext.class,i);
		}
		public List<IfBlockContext> ifBlock() {
			return getRuleContexts(IfBlockContext.class);
		}
		public IfBlockContext ifBlock(int i) {
			return getRuleContext(IfBlockContext.class,i);
		}
		public List<JoinBlockContext> joinBlock() {
			return getRuleContexts(JoinBlockContext.class);
		}
		public JoinBlockContext joinBlock(int i) {
			return getRuleContext(JoinBlockContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(SOACTParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(SOACTParser.BREAK, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(361);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(356);
						forLoop();
						}
						break;
					case WHILE:
						{
						setState(357);
						whileLoop();
						}
						break;
					case IF:
						{
						setState(358);
						ifBlock();
						}
						break;
					case JOIN:
						{
						setState(359);
						joinBlock();
						}
						break;
					case INT:
					case STRING:
					case SELF:
					case TRUE:
					case FALSE:
					case BOOLEAN:
					case TOUPPER:
					case TOLOWER:
					case LENGTH:
					case SET:
					case LIST:
					case REMOVE:
					case INCLUDE:
					case ADD:
					case PRINT:
					case REVERSE:
					case ID:
					case MINUS:
					case NOT:
					case INCREMENT:
					case DECREMENT:
					case LPAR:
					case LBRACK:
					case INT_VALUE:
					case IDENTIFIER:
					case STRING_VALUE:
						{
						setState(360);
						statements();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					{
					setState(366);
					match(CONTINUE);
					System.out.println("Control: CONTINUE");
					}
					}
					break;
				case BREAK:
					{
					{
					setState(368);
					match(BREAK);
					System.out.println("Control: BREAK");
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(372);
				match(SEMICOLON);
				}
				break;
			}
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(380);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(375);
						forLoop();
						}
						break;
					case WHILE:
						{
						setState(376);
						whileLoop();
						}
						break;
					case IF:
						{
						setState(377);
						ifBlock();
						}
						break;
					case JOIN:
						{
						setState(378);
						joinBlock();
						}
						break;
					case INT:
					case STRING:
					case SELF:
					case TRUE:
					case FALSE:
					case BOOLEAN:
					case TOUPPER:
					case TOLOWER:
					case LENGTH:
					case SET:
					case LIST:
					case REMOVE:
					case INCLUDE:
					case ADD:
					case PRINT:
					case REVERSE:
					case ID:
					case MINUS:
					case NOT:
					case INCREMENT:
					case DECREMENT:
					case LPAR:
					case LBRACK:
					case INT_VALUE:
					case IDENTIFIER:
					case STRING_VALUE:
						{
						setState(379);
						statements();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
	public static class StatementsContext extends ParserRuleContext {
		public InitStatementContext initStatement() {
			return getRuleContext(InitStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ExprStatementContext exprStatement() {
			return getRuleContext(ExprStatementContext.class,0);
		}
		public ObserveStatementContext observeStatement() {
			return getRuleContext(ObserveStatementContext.class,0);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statements);
		try {
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				initStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				assignStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				exprStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(388);
				observeStatement();
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
	public static class InitStatementContext extends ParserRuleContext {
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitRecordContext initRecord() {
			return getRuleContext(InitRecordContext.class,0);
		}
		public TerminalNode NEW() { return getToken(SOACTParser.NEW, 0); }
		public InitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitStatementContext initStatement() throws RecognitionException {
		InitStatementContext _localctx = new InitStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_initStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			init();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(392);
				match(ASSIGN);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW) {
					{
					setState(393);
					match(NEW);
					}
				}

				setState(398);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(396);
					expression();
					}
					break;
				case 2:
					{
					setState(397);
					initRecord();
					}
					break;
				}
				}
			}

			setState(402);
			match(SEMICOLON);
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
	public static class InitRecordContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(SOACTParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SOACTParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SOACTParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SOACTParser.COMMA, i);
		}
		public InitRecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initRecord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterInitRecord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitInitRecord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitInitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitRecordContext initRecord() throws RecognitionException {
		InitRecordContext _localctx = new InitRecordContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_initRecord);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(IDENTIFIER);
			setState(405);
			match(LBRACE);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(406);
					match(IDENTIFIER);
					setState(407);
					match(COLON);
					setState(408);
					expression();
					setState(409);
					match(COMMA);
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(416);
			match(IDENTIFIER);
			setState(417);
			match(COLON);
			setState(418);
			expression();
			setState(419);
			match(RBRACE);
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
	public static class AssignStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public ArrayIndexContext arrayIndex() {
			return getRuleContext(ArrayIndexContext.class,0);
		}
		public TerminalNode NEW() { return getToken(SOACTParser.NEW, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assignStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(IDENTIFIER);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(422);
				arrayIndex();
				}
			}

			setState(425);
			match(ASSIGN);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(426);
				match(NEW);
				}
			}

			setState(429);
			expression();
			setState(430);
			match(SEMICOLON);
			System.out.println("Assignment");
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
	public static class ExprStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public ExprStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprStatementContext exprStatement() throws RecognitionException {
		ExprStatementContext _localctx = new ExprStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_exprStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			expression();
			setState(434);
			match(SEMICOLON);
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
	public static class ObserveStatementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public ObserversContext observers() {
			return getRuleContext(ObserversContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public TerminalNode DOT() { return getToken(SOACTParser.DOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public ObserveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_observeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterObserveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitObserveStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitObserveStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObserveStatementContext observeStatement() throws RecognitionException {
		ObserveStatementContext _localctx = new ObserveStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_observeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==SELF || _la==IDENTIFIER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(437);
				match(DOT);
				}
				break;
			}
			setState(440);
			match(IDENTIFIER);
			setState(441);
			match(LPAR);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(442);
				expression();
				}
			}

			setState(445);
			match(RPAR);
			setState(446);
			observers();
			setState(447);
			match(SEMICOLON);
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
		public TerminalNode OBSERVERS() { return getToken(SOACTParser.OBSERVERS, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
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
		enterRule(_localctx, 66, RULE_observers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(OBSERVERS);
			setState(450);
			match(LPAR);
			setState(451);
			accesslevels();
			setState(452);
			match(RPAR);
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
		public ExpCommaContext expComma() {
			return getRuleContext(ExpCommaContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 68, RULE_expression);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454);
				expComma();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455);
				expComma();
				setState(456);
				match(COMMA);
				setState(457);
				expression();
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
	public static class ExpCommaContext extends ParserRuleContext {
		public ExpAssignContext expAssign() {
			return getRuleContext(ExpAssignContext.class,0);
		}
		public ExpCommaPrimContext expCommaPrim() {
			return getRuleContext(ExpCommaPrimContext.class,0);
		}
		public ExpCommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expComma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpComma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpComma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpCommaContext expComma() throws RecognitionException {
		ExpCommaContext _localctx = new ExpCommaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expComma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			expAssign();
			setState(462);
			expCommaPrim();
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
	public static class ExpCommaPrimContext extends ParserRuleContext {
		public Token ASSIGN;
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public ExpAssignContext expAssign() {
			return getRuleContext(ExpAssignContext.class,0);
		}
		public ExpCommaPrimContext expCommaPrim() {
			return getRuleContext(ExpCommaPrimContext.class,0);
		}
		public ExpCommaPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expCommaPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpCommaPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpCommaPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpCommaPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpCommaPrimContext expCommaPrim() throws RecognitionException {
		ExpCommaPrimContext _localctx = new ExpCommaPrimContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expCommaPrim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(464);
				((ExpCommaPrimContext)_localctx).ASSIGN = match(ASSIGN);
				setState(465);
				expAssign();
				System.out.println("Operator:" + (((ExpCommaPrimContext)_localctx).ASSIGN!=null?((ExpCommaPrimContext)_localctx).ASSIGN.getText():null));
				setState(467);
				expCommaPrim();
				}
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
	public static class ExpAssignContext extends ParserRuleContext {
		public List<ExpTernaryContext> expTernary() {
			return getRuleContexts(ExpTernaryContext.class);
		}
		public ExpTernaryContext expTernary(int i) {
			return getRuleContext(ExpTernaryContext.class,i);
		}
		public TerminalNode QUESTION_MARK() { return getToken(SOACTParser.QUESTION_MARK, 0); }
		public TerminalNode COLON() { return getToken(SOACTParser.COLON, 0); }
		public ExpAssignContext expAssign() {
			return getRuleContext(ExpAssignContext.class,0);
		}
		public ExpAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAssignContext expAssign() throws RecognitionException {
		ExpAssignContext _localctx = new ExpAssignContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expAssign);
		try {
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				expTernary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				expTernary();
				setState(473);
				match(QUESTION_MARK);
				setState(474);
				expTernary();
				setState(475);
				match(COLON);
				setState(476);
				expAssign();
				System.out.println("Operator:?:");
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
	public static class ExpTernaryContext extends ParserRuleContext {
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public TerminalNode OR() { return getToken(SOACTParser.OR, 0); }
		public ExpAssignContext expAssign() {
			return getRuleContext(ExpAssignContext.class,0);
		}
		public ExpTernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expTernary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpTernary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpTernary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpTernary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpTernaryContext expTernary() throws RecognitionException {
		ExpTernaryContext _localctx = new ExpTernaryContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expTernary);
		try {
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				expOr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(482);
				expOr();
				setState(483);
				match(OR);
				setState(484);
				expAssign();
				System.out.println("Operator:||");
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
	public static class ExpOrContext extends ParserRuleContext {
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
		}
		public TerminalNode AND() { return getToken(SOACTParser.AND, 0); }
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public ExpOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpOrContext expOr() throws RecognitionException {
		ExpOrContext _localctx = new ExpOrContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expOr);
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				expAnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
				expAnd();
				setState(491);
				match(AND);
				setState(492);
				expOr();
				System.out.println("Operator:&&");
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
	public static class ExpAndContext extends ParserRuleContext {
		public ExpEqualsContext expEquals() {
			return getRuleContext(ExpEqualsContext.class,0);
		}
		public ExpAndPrimContext expAndPrim() {
			return getRuleContext(ExpAndPrimContext.class,0);
		}
		public ExpAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAndContext expAnd() throws RecognitionException {
		ExpAndContext _localctx = new ExpAndContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			expEquals();
			setState(498);
			expAndPrim();
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
	public static class ExpAndPrimContext extends ParserRuleContext {
		public Token equals_name;
		public ExpEqualsContext expEquals() {
			return getRuleContext(ExpEqualsContext.class,0);
		}
		public ExpAndPrimContext expAndPrim() {
			return getRuleContext(ExpAndPrimContext.class,0);
		}
		public TerminalNode NOT_EQUAL() { return getToken(SOACTParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(SOACTParser.EQUAL, 0); }
		public ExpAndPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAndPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpAndPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpAndPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpAndPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAndPrimContext expAndPrim() throws RecognitionException {
		ExpAndPrimContext _localctx = new ExpAndPrimContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_expAndPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL || _la==NOT_EQUAL) {
				{
				setState(500);
				((ExpAndPrimContext)_localctx).equals_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
					((ExpAndPrimContext)_localctx).equals_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(501);
				expEquals();
				System.out.println("Operator:" + (((ExpAndPrimContext)_localctx).equals_name!=null?((ExpAndPrimContext)_localctx).equals_name.getText():null));
				setState(503);
				expAndPrim();
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
	public static class ExpEqualsContext extends ParserRuleContext {
		public ExpCompareContext expCompare() {
			return getRuleContext(ExpCompareContext.class,0);
		}
		public ExpEqualsPrimContext expEqualsPrim() {
			return getRuleContext(ExpEqualsPrimContext.class,0);
		}
		public ExpEqualsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expEquals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpEquals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpEqualsContext expEquals() throws RecognitionException {
		ExpEqualsContext _localctx = new ExpEqualsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_expEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			expCompare();
			setState(508);
			expEqualsPrim();
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
	public static class ExpEqualsPrimContext extends ParserRuleContext {
		public Token than_name;
		public ExpCompareContext expCompare() {
			return getRuleContext(ExpCompareContext.class,0);
		}
		public ExpEqualsPrimContext expEqualsPrim() {
			return getRuleContext(ExpEqualsPrimContext.class,0);
		}
		public TerminalNode LESS_THAN() { return getToken(SOACTParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SOACTParser.GREATER_THAN, 0); }
		public ExpEqualsPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expEqualsPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpEqualsPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpEqualsPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpEqualsPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpEqualsPrimContext expEqualsPrim() throws RecognitionException {
		ExpEqualsPrimContext _localctx = new ExpEqualsPrimContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expEqualsPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				setState(510);
				((ExpEqualsPrimContext)_localctx).than_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GREATER_THAN || _la==LESS_THAN) ) {
					((ExpEqualsPrimContext)_localctx).than_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(511);
				expCompare();
				System.out.println("Operator:" + (((ExpEqualsPrimContext)_localctx).than_name!=null?((ExpEqualsPrimContext)_localctx).than_name.getText():null));
				setState(513);
				expEqualsPrim();
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
	public static class ExpCompareContext extends ParserRuleContext {
		public ExpPlusMinusContext expPlusMinus() {
			return getRuleContext(ExpPlusMinusContext.class,0);
		}
		public ExpComparePrimContext expComparePrim() {
			return getRuleContext(ExpComparePrimContext.class,0);
		}
		public ExpCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpCompareContext expCompare() throws RecognitionException {
		ExpCompareContext _localctx = new ExpCompareContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_expCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			expPlusMinus();
			setState(518);
			expComparePrim();
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
	public static class ExpComparePrimContext extends ParserRuleContext {
		public Token pm_name;
		public ExpPlusMinusContext expPlusMinus() {
			return getRuleContext(ExpPlusMinusContext.class,0);
		}
		public ExpComparePrimContext expComparePrim() {
			return getRuleContext(ExpComparePrimContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(SOACTParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SOACTParser.MINUS, 0); }
		public ExpComparePrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expComparePrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpComparePrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpComparePrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpComparePrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpComparePrimContext expComparePrim() throws RecognitionException {
		ExpComparePrimContext _localctx = new ExpComparePrimContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expComparePrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(520);
				((ExpComparePrimContext)_localctx).pm_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ExpComparePrimContext)_localctx).pm_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(521);
				expPlusMinus();
				System.out.println("Operator:" + (((ExpComparePrimContext)_localctx).pm_name!=null?((ExpComparePrimContext)_localctx).pm_name.getText():null));
				setState(523);
				expComparePrim();
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
	public static class ExpPlusMinusContext extends ParserRuleContext {
		public ExpDivideMultModContext expDivideMultMod() {
			return getRuleContext(ExpDivideMultModContext.class,0);
		}
		public ExpPlusMinusPrimContext expPlusMinusPrim() {
			return getRuleContext(ExpPlusMinusPrimContext.class,0);
		}
		public ExpPlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPlusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPlusMinusContext expPlusMinus() throws RecognitionException {
		ExpPlusMinusContext _localctx = new ExpPlusMinusContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_expPlusMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			expDivideMultMod();
			setState(528);
			expPlusMinusPrim();
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
	public static class ExpPlusMinusPrimContext extends ParserRuleContext {
		public Token dmd_name;
		public ExpDivideMultModContext expDivideMultMod() {
			return getRuleContext(ExpDivideMultModContext.class,0);
		}
		public ExpPlusMinusPrimContext expPlusMinusPrim() {
			return getRuleContext(ExpPlusMinusPrimContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(SOACTParser.DIVIDE, 0); }
		public TerminalNode MULT() { return getToken(SOACTParser.MULT, 0); }
		public TerminalNode MOD() { return getToken(SOACTParser.MOD, 0); }
		public ExpPlusMinusPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPlusMinusPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPlusMinusPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPlusMinusPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPlusMinusPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPlusMinusPrimContext expPlusMinusPrim() throws RecognitionException {
		ExpPlusMinusPrimContext _localctx = new ExpPlusMinusPrimContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_expPlusMinusPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) {
				{
				setState(530);
				((ExpPlusMinusPrimContext)_localctx).dmd_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
					((ExpPlusMinusPrimContext)_localctx).dmd_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(531);
				expDivideMultMod();
				System.out.println("Operator:" + (((ExpPlusMinusPrimContext)_localctx).dmd_name!=null?((ExpPlusMinusPrimContext)_localctx).dmd_name.getText():null));
				setState(533);
				expPlusMinusPrim();
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
	public static class ExpDivideMultModContext extends ParserRuleContext {
		public Token bmndi;
		public ExpPreUnaryContext expPreUnary() {
			return getRuleContext(ExpPreUnaryContext.class,0);
		}
		public ExpDivideMultModContext expDivideMultMod() {
			return getRuleContext(ExpDivideMultModContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SOACTParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SOACTParser.NOT, 0); }
		public TerminalNode DECREMENT() { return getToken(SOACTParser.DECREMENT, 0); }
		public TerminalNode INCREMENT() { return getToken(SOACTParser.INCREMENT, 0); }
		public ExpDivideMultModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expDivideMultMod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpDivideMultMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpDivideMultMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpDivideMultMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpDivideMultModContext expDivideMultMod() throws RecognitionException {
		ExpDivideMultModContext _localctx = new ExpDivideMultModContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_expDivideMultMod);
		int _la;
		try {
			setState(542);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case TOUPPER:
			case TOLOWER:
			case LENGTH:
			case REMOVE:
			case INCLUDE:
			case ADD:
			case PRINT:
			case REVERSE:
			case LPAR:
			case LBRACK:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				expPreUnary();
				}
				break;
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(538);
				((ExpDivideMultModContext)_localctx).bmndi = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31527396414849024L) != 0)) ) {
					((ExpDivideMultModContext)_localctx).bmndi = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
				expDivideMultMod();
				System.out.println("Operator:" + (((ExpDivideMultModContext)_localctx).bmndi!=null?((ExpDivideMultModContext)_localctx).bmndi.getText():null));
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
	public static class ExpPreUnaryContext extends ParserRuleContext {
		public ExpPostUnaryContext expPostUnary() {
			return getRuleContext(ExpPostUnaryContext.class,0);
		}
		public ExpPreUnaryPrimContext expPreUnaryPrim() {
			return getRuleContext(ExpPreUnaryPrimContext.class,0);
		}
		public ExpPreUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPreUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPreUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPreUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPreUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPreUnaryContext expPreUnary() throws RecognitionException {
		ExpPreUnaryContext _localctx = new ExpPreUnaryContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_expPreUnary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			expPostUnary();
			setState(545);
			expPreUnaryPrim();
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
	public static class ExpPreUnaryPrimContext extends ParserRuleContext {
		public Token id_name;
		public ExpPreUnaryPrimContext expPreUnaryPrim() {
			return getRuleContext(ExpPreUnaryPrimContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(SOACTParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SOACTParser.DECREMENT, 0); }
		public ExpPreUnaryPrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPreUnaryPrim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPreUnaryPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPreUnaryPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPreUnaryPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPreUnaryPrimContext expPreUnaryPrim() throws RecognitionException {
		ExpPreUnaryPrimContext _localctx = new ExpPreUnaryPrimContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_expPreUnaryPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT || _la==DECREMENT) {
				{
				setState(547);
				((ExpPreUnaryPrimContext)_localctx).id_name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					((ExpPreUnaryPrimContext)_localctx).id_name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(548);
				expPreUnaryPrim();
				System.out.println("Operator:" + (((ExpPreUnaryPrimContext)_localctx).id_name!=null?((ExpPreUnaryPrimContext)_localctx).id_name.getText():null));
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
	public static class ExpPostUnaryContext extends ParserRuleContext {
		public ExpBracketContext expBracket() {
			return getRuleContext(ExpBracketContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public ExpPostUnaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPostUnary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPostUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPostUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPostUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpPostUnaryContext expPostUnary() throws RecognitionException {
		ExpPostUnaryContext _localctx = new ExpPostUnaryContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expPostUnary);
		try {
			setState(558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case TOUPPER:
			case TOLOWER:
			case LENGTH:
			case REMOVE:
			case INCLUDE:
			case ADD:
			case PRINT:
			case REVERSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				expBracket();
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(554);
				match(LBRACK);
				setState(555);
				expression();
				setState(556);
				match(RBRACK);
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
	public static class ExpBracketContext extends ParserRuleContext {
		public ExpAccessContext expAccess() {
			return getRuleContext(ExpAccessContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SOACTParser.DOT, 0); }
		public ExpBracketContext expBracket() {
			return getRuleContext(ExpBracketContext.class,0);
		}
		public ExpBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpBracketContext expBracket() throws RecognitionException {
		ExpBracketContext _localctx = new ExpBracketContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_expBracket);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(560);
				expAccess();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				expAccess();
				setState(562);
				match(DOT);
				setState(563);
				expBracket();
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
	public static class ExpAccessContext extends ParserRuleContext {
		public ExpParContext expPar() {
			return getRuleContext(ExpParContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public ExpAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpAccessContext expAccess() throws RecognitionException {
		ExpAccessContext _localctx = new ExpAccessContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expAccess);
		try {
			setState(572);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TRUE:
			case FALSE:
			case TOUPPER:
			case TOLOWER:
			case LENGTH:
			case REMOVE:
			case INCLUDE:
			case ADD:
			case PRINT:
			case REVERSE:
			case INT_VALUE:
			case IDENTIFIER:
			case STRING_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				expPar();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(568);
				match(LPAR);
				setState(569);
				expression();
				setState(570);
				match(RPAR);
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
	public static class ExpParContext extends ParserRuleContext {
		public PrimitivesValsContext primitivesVals() {
			return getRuleContext(PrimitivesValsContext.class,0);
		}
		public HandlerCallContext handlerCall() {
			return getRuleContext(HandlerCallContext.class,0);
		}
		public CustomPrimAccessContext customPrimAccess() {
			return getRuleContext(CustomPrimAccessContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public ExpParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expPar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpPar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpParContext expPar() throws RecognitionException {
		ExpParContext _localctx = new ExpParContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expPar);
		try {
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				primitivesVals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				handlerCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				customPrimAccess();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(577);
				match(IDENTIFIER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(578);
				match(SELF);
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
	public static class CustomPrimAccessContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COLON() { return getTokens(SOACTParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SOACTParser.COLON, i);
		}
		public CustomPrimAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customPrimAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterCustomPrimAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitCustomPrimAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitCustomPrimAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomPrimAccessContext customPrimAccess() throws RecognitionException {
		CustomPrimAccessContext _localctx = new CustomPrimAccessContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_customPrimAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(IDENTIFIER);
			setState(582);
			match(COLON);
			setState(583);
			match(COLON);
			setState(584);
			match(IDENTIFIER);
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
	public static class HandlerCallContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(SOACTParser.PRINT, 0); }
		public TerminalNode TOLOWER() { return getToken(SOACTParser.TOLOWER, 0); }
		public TerminalNode TOUPPER() { return getToken(SOACTParser.TOUPPER, 0); }
		public TerminalNode REVERSE() { return getToken(SOACTParser.REVERSE, 0); }
		public TerminalNode ADD() { return getToken(SOACTParser.ADD, 0); }
		public TerminalNode INCLUDE() { return getToken(SOACTParser.INCLUDE, 0); }
		public TerminalNode REMOVE() { return getToken(SOACTParser.REMOVE, 0); }
		public TerminalNode LENGTH() { return getToken(SOACTParser.LENGTH, 0); }
		public HandlerCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterHandlerCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitHandlerCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitHandlerCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HandlerCallContext handlerCall() throws RecognitionException {
		HandlerCallContext _localctx = new HandlerCallContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_handlerCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				{
				setState(586);
				match(PRINT);
				System.out.println("Built-In: PRINT");
				}
				}
				break;
			case TOLOWER:
				{
				{
				setState(588);
				match(TOLOWER);
				System.out.println("Built-In: LOWER");
				}
				}
				break;
			case TOUPPER:
				{
				{
				setState(590);
				match(TOUPPER);
				System.out.println("Built-In: UPPER");
				}
				}
				break;
			case REVERSE:
				{
				{
				setState(592);
				match(REVERSE);
				System.out.println("Built-In: REVERSE");
				}
				}
				break;
			case ADD:
				{
				{
				setState(594);
				match(ADD);
				System.out.println("Built-In: ADD");
				}
				}
				break;
			case INCLUDE:
				{
				{
				setState(596);
				match(INCLUDE);
				System.out.println("Built-In: INCLUDE");
				}
				}
				break;
			case REMOVE:
				{
				{
				setState(598);
				match(REMOVE);
				System.out.println("Built-In: REMOVE");
				}
				}
				break;
			case LENGTH:
				{
				{
				setState(600);
				match(LENGTH);
				System.out.println("Built-In: LEN");
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(602);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(605);
			match(LPAR);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(606);
				expression();
				}
			}

			setState(609);
			match(RPAR);
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
	public static class PrimitivesValsContext extends ParserRuleContext {
		public TerminalNode INT_VALUE() { return getToken(SOACTParser.INT_VALUE, 0); }
		public TerminalNode STRING_VALUE() { return getToken(SOACTParser.STRING_VALUE, 0); }
		public TerminalNode TRUE() { return getToken(SOACTParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SOACTParser.FALSE, 0); }
		public PrimitivesValsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivesVals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPrimitivesVals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPrimitivesVals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPrimitivesVals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitivesValsContext primitivesVals() throws RecognitionException {
		PrimitivesValsContext _localctx = new PrimitivesValsContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_primitivesVals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			_la = _input.LA(1);
			if ( !(((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & 2882303761517117505L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001G\u0266\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0001\u0000\u0005\u0000"+
		"w\b\u0000\n\u0000\f\u0000z\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0004\u0001\u0085\b\u0001\u000b\u0001\f\u0001\u0086\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0005\u0003\u0092\b\u0003\n\u0003\f\u0003\u0095\t\u0003"+
		"\u0001\u0003\u0003\u0003\u0098\b\u0003\u0001\u0003\u0003\u0003\u009b\b"+
		"\u0003\u0001\u0003\u0005\u0003\u009e\b\u0003\n\u0003\f\u0003\u00a1\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u00a8\b\u0004\n\u0004\f\u0004\u00ab\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00b7\b\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00bb\b\u0005\n\u0005\f\u0005\u00be\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c5\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00cd\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00dd\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00e6\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00ec\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00f6\b\f\n\f"+
		"\f\f\u00f9\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0108\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0114\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0122\b\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0144\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u014e\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0004\u0018\u0157\b\u0018\u000b\u0018\f\u0018"+
		"\u0158\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u016a\b\u001a\n"+
		"\u001a\f\u001a\u016d\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0173\b\u001a\u0001\u001a\u0003\u001a\u0176\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u017d\b\u001a\n\u001a\f\u001a\u0180\t\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0186\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u018b\b\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u018f"+
		"\b\u001c\u0003\u001c\u0191\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u019c\b\u001d\n\u001d\f\u001d\u019f\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01a8\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01ac\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0003 \u01b7\b \u0001 \u0001 \u0001 \u0003"+
		" \u01bc\b \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01cc\b\"\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01d6\b$\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01e0\b%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u01e8\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0003\'\u01f0\b\'\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u01fa\b)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0204\b+\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u020e\b-\u0001.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u0218\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00030\u021f\b0\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00032\u0228\b2\u00013\u00013\u00013\u00013\u00013\u00033\u022f\b3\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u0236\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00035\u023d\b5\u00016\u00016\u00016\u00016\u00016\u00036\u0244"+
		"\b6\u00017\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00038\u025c\b8\u00018\u00018\u00038\u0260\b8\u00018\u0001"+
		"8\u00019\u00019\u00019\u0000\u0000:\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnpr\u0000\u000b\u0005\u0000\u0002\u0002\u0004\u0004"+
		"\u000f\u000f$$DD\u0001\u0000\u001a\u001b\u0002\u0000\u0006\u0006\f\f\u0002"+
		"\u0000\u0007\u0007DD\u0001\u0000./\u0001\u000001\u0001\u0000()\u0001\u0000"+
		"*,\u0002\u0000))46\u0001\u000056\u0004\u0000\b\b\u000e\u000eCCEE\u0276"+
		"\u0000x\u0001\u0000\u0000\u0000\u0002}\u0001\u0000\u0000\u0000\u0004\u008a"+
		"\u0001\u0000\u0000\u0000\u0006\u0093\u0001\u0000\u0000\u0000\b\u00a2\u0001"+
		"\u0000\u0000\u0000\n\u00af\u0001\u0000\u0000\u0000\f\u00cc\u0001\u0000"+
		"\u0000\u0000\u000e\u00ce\u0001\u0000\u0000\u0000\u0010\u00d2\u0001\u0000"+
		"\u0000\u0000\u0012\u00d4\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000"+
		"\u0000\u0000\u0016\u00e3\u0001\u0000\u0000\u0000\u0018\u00f2\u0001\u0000"+
		"\u0000\u0000\u001a\u00fa\u0001\u0000\u0000\u0000\u001c\u00fe\u0001\u0000"+
		"\u0000\u0000\u001e\u0107\u0001\u0000\u0000\u0000 \u0113\u0001\u0000\u0000"+
		"\u0000\"\u0115\u0001\u0000\u0000\u0000$\u011c\u0001\u0000\u0000\u0000"+
		"&\u0125\u0001\u0000\u0000\u0000(\u012c\u0001\u0000\u0000\u0000*\u0135"+
		"\u0001\u0000\u0000\u0000,\u0145\u0001\u0000\u0000\u0000.\u014b\u0001\u0000"+
		"\u0000\u00000\u0151\u0001\u0000\u0000\u00002\u015c\u0001\u0000\u0000\u0000"+
		"4\u016b\u0001\u0000\u0000\u00006\u0185\u0001\u0000\u0000\u00008\u0187"+
		"\u0001\u0000\u0000\u0000:\u0194\u0001\u0000\u0000\u0000<\u01a5\u0001\u0000"+
		"\u0000\u0000>\u01b1\u0001\u0000\u0000\u0000@\u01b6\u0001\u0000\u0000\u0000"+
		"B\u01c1\u0001\u0000\u0000\u0000D\u01cb\u0001\u0000\u0000\u0000F\u01cd"+
		"\u0001\u0000\u0000\u0000H\u01d5\u0001\u0000\u0000\u0000J\u01df\u0001\u0000"+
		"\u0000\u0000L\u01e7\u0001\u0000\u0000\u0000N\u01ef\u0001\u0000\u0000\u0000"+
		"P\u01f1\u0001\u0000\u0000\u0000R\u01f9\u0001\u0000\u0000\u0000T\u01fb"+
		"\u0001\u0000\u0000\u0000V\u0203\u0001\u0000\u0000\u0000X\u0205\u0001\u0000"+
		"\u0000\u0000Z\u020d\u0001\u0000\u0000\u0000\\\u020f\u0001\u0000\u0000"+
		"\u0000^\u0217\u0001\u0000\u0000\u0000`\u021e\u0001\u0000\u0000\u0000b"+
		"\u0220\u0001\u0000\u0000\u0000d\u0227\u0001\u0000\u0000\u0000f\u022e\u0001"+
		"\u0000\u0000\u0000h\u0235\u0001\u0000\u0000\u0000j\u023c\u0001\u0000\u0000"+
		"\u0000l\u0243\u0001\u0000\u0000\u0000n\u0245\u0001\u0000\u0000\u0000p"+
		"\u025b\u0001\u0000\u0000\u0000r\u0263\u0001\u0000\u0000\u0000tw\u0003"+
		"\u0004\u0002\u0000uw\u0003\u0002\u0001\u0000vt\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{|\u00032\u0019\u0000|\u0001\u0001\u0000\u0000\u0000}~\u0005"+
		"\'\u0000\u0000~\u007f\u0006\u0001\uffff\uffff\u0000\u007f\u0080\u0005"+
		"D\u0000\u0000\u0080\u0084\u0005=\u0000\u0000\u0081\u0082\u0003\f\u0006"+
		"\u0000\u0082\u0083\u0005A\u0000\u0000\u0083\u0085\u0001\u0000\u0000\u0000"+
		"\u0084\u0081\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0005>\u0000\u0000\u0089"+
		"\u0003\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u0001\u0000\u0000\u008b"+
		"\u008c\u0005D\u0000\u0000\u008c\u008d\u0005=\u0000\u0000\u008d\u008e\u0003"+
		"\u0006\u0003\u0000\u008e\u008f\u0005>\u0000\u0000\u008f\u0005\u0001\u0000"+
		"\u0000\u0000\u0090\u0092\u0003\b\u0004\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0095\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000\u0000"+
		"\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0096\u0098\u0003\n\u0005\u0000"+
		"\u0097\u0096\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u009b\u0003\u0014\n\u0000\u009a"+
		"\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009f\u0001\u0000\u0000\u0000\u009c\u009e\u0003\u0016\u000b\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f"+
		"\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0"+
		"\u0007\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0005%\u0000\u0000\u00a3\u00a4\u0005D\u0000\u0000\u00a4\u00a9\u0005"+
		"=\u0000\u0000\u00a5\u00a6\u0005D\u0000\u0000\u00a6\u00a8\u0005?\u0000"+
		"\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000"+
		"\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000"+
		"\u0000\u00aa\u00ac\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0005D\u0000\u0000\u00ad\u00ae\u0005>\u0000\u0000\u00ae"+
		"\t\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u001c\u0000\u0000\u00b0\u00bc"+
		"\u0005=\u0000\u0000\u00b1\u00b6\u0003\f\u0006\u0000\u00b2\u00b3\u0005"+
		"9\u0000\u0000\u00b3\u00b4\u0003\u001e\u000f\u0000\u00b4\u00b5\u0005:\u0000"+
		"\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0005A\u0000\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b1\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005>\u0000\u0000\u00c0\u000b\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0003\u0010\b\u0000\u00c2\u00c4\u0005D\u0000\u0000\u00c3\u00c5"+
		"\u0003\u000e\u0007\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5\u00cd\u0001\u0000\u0000\u0000\u00c6\u00c7"+
		"\u0003\u001a\r\u0000\u00c7\u00c8\u0005D\u0000\u0000\u00c8\u00cd\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0003\u0012\t\u0000\u00ca\u00cb\u0005D"+
		"\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00c1\u0001\u0000"+
		"\u0000\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00c9\u0001\u0000"+
		"\u0000\u0000\u00cd\r\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005;\u0000"+
		"\u0000\u00cf\u00d0\u0005C\u0000\u0000\u00d0\u00d1\u0005<\u0000\u0000\u00d1"+
		"\u000f\u0001\u0000\u0000\u0000\u00d2\u00d3\u0007\u0000\u0000\u0000\u00d3"+
		"\u0011\u0001\u0000\u0000\u0000\u00d4\u00d5\u0007\u0001\u0000\u0000\u00d5"+
		"\u00d6\u00051\u0000\u0000\u00d6\u00d7\u0003\u0010\b\u0000\u00d7\u00d8"+
		"\u00050\u0000\u0000\u00d8\u0013\u0001\u0000\u0000\u0000\u00d9\u00da\u0005"+
		"D\u0000\u0000\u00da\u00dc\u00059\u0000\u0000\u00db\u00dd\u0003\u0018\f"+
		"\u0000\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00df\u0005:\u0000\u0000"+
		"\u00df\u00e0\u0005=\u0000\u0000\u00e0\u00e1\u00034\u001a\u0000\u00e1\u00e2"+
		"\u0005>\u0000\u0000\u00e2\u0015\u0001\u0000\u0000\u0000\u00e3\u00e5\u0007"+
		"\u0002\u0000\u0000\u00e4\u00e6\u0003\u001c\u000e\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005D\u0000\u0000\u00e8\u00e9\u0006\u000b"+
		"\uffff\uffff\u0000\u00e9\u00eb\u00059\u0000\u0000\u00ea\u00ec\u0003\u0018"+
		"\f\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005:\u0000\u0000"+
		"\u00ee\u00ef\u0005=\u0000\u0000\u00ef\u00f0\u00034\u001a\u0000\u00f0\u00f1"+
		"\u0005>\u0000\u0000\u00f1\u0017\u0001\u0000\u0000\u0000\u00f2\u00f7\u0003"+
		"\f\u0006\u0000\u00f3\u00f4\u0005?\u0000\u0000\u00f4\u00f6\u0003\f\u0006"+
		"\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u0019\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0003\u0010\b\u0000\u00fb\u00fc\u0005;\u0000\u0000"+
		"\u00fc\u00fd\u0005<\u0000\u0000\u00fd\u001b\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0012\u0000\u0000\u00ff\u0100\u00059\u0000\u0000\u0100\u0101"+
		"\u0003\u001e\u000f\u0000\u0101\u0102\u0005:\u0000\u0000\u0102\u001d\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005\r\u0000\u0000\u0104\u0108\u0006\u000f"+
		"\uffff\uffff\u0000\u0105\u0106\u0005\u0016\u0000\u0000\u0106\u0108\u0006"+
		"\u000f\uffff\uffff\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010a"+
		"\u00059\u0000\u0000\u010a\u010b\u0003 \u0010\u0000\u010b\u010c\u0005?"+
		"\u0000\u0000\u010c\u010d\u0003 \u0010\u0000\u010d\u010e\u0005:\u0000\u0000"+
		"\u010e\u001f\u0001\u0000\u0000\u0000\u010f\u0114\u0005D\u0000\u0000\u0110"+
		"\u0114\u0005\u0014\u0000\u0000\u0111\u0114\u0005\u0007\u0000\u0000\u0112"+
		"\u0114\u0003\u001e\u000f\u0000\u0113\u010f\u0001\u0000\u0000\u0000\u0113"+
		"\u0110\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0113"+
		"\u0112\u0001\u0000\u0000\u0000\u0114!\u0001\u0000\u0000\u0000\u0115\u0116"+
		"\u0005\u000b\u0000\u0000\u0116\u0117\u0006\u0011\uffff\uffff\u0000\u0117"+
		"\u0118\u0003$\u0012\u0000\u0118\u0119\u0005=\u0000\u0000\u0119\u011a\u0003"+
		"4\u001a\u0000\u011a\u011b\u0005>\u0000\u0000\u011b#\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u00059\u0000\u0000\u011d\u011e\u0005D\u0000\u0000\u011e"+
		"\u0121\u0005&\u0000\u0000\u011f\u0122\u0005D\u0000\u0000\u0120\u0122\u0003"+
		"&\u0013\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0124\u0005:\u0000"+
		"\u0000\u0124%\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0013\u0000\u0000"+
		"\u0126\u0127\u00059\u0000\u0000\u0127\u0128\u0005C\u0000\u0000\u0128\u0129"+
		"\u0005?\u0000\u0000\u0129\u012a\u0005C\u0000\u0000\u012a\u012b\u0005:"+
		"\u0000\u0000\u012b\'\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0011\u0000"+
		"\u0000\u012d\u012e\u0006\u0014\uffff\uffff\u0000\u012e\u012f\u00059\u0000"+
		"\u0000\u012f\u0130\u0003D\"\u0000\u0130\u0131\u0005:\u0000\u0000\u0131"+
		"\u0132\u0005=\u0000\u0000\u0132\u0133\u00034\u001a\u0000\u0133\u0134\u0005"+
		">\u0000\u0000\u0134)\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0003\u0000"+
		"\u0000\u0136\u0137\u0006\u0015\uffff\uffff\u0000\u0137\u0138\u00059\u0000"+
		"\u0000\u0138\u0139\u0003D\"\u0000\u0139\u013a\u0005:\u0000\u0000\u013a"+
		"\u013b\u0005=\u0000\u0000\u013b\u013c\u00034\u001a\u0000\u013c\u0143\u0005"+
		">\u0000\u0000\u013d\u013e\u0005\t\u0000\u0000\u013e\u013f\u0006\u0015"+
		"\uffff\uffff\u0000\u013f\u0140\u0005=\u0000\u0000\u0140\u0141\u00034\u001a"+
		"\u0000\u0141\u0142\u0005>\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000"+
		"\u0143\u013d\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144+\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0015\u0000\u0000\u0146"+
		"\u0147\u0006\u0016\uffff\uffff\u0000\u0147\u0148\u0005=\u0000\u0000\u0148"+
		"\u0149\u0003.\u0017\u0000\u0149\u014a\u0005>\u0000\u0000\u014a-\u0001"+
		"\u0000\u0000\u0000\u014b\u014d\u00034\u001a\u0000\u014c\u014e\u00030\u0018"+
		"\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0150\u00034\u001a\u0000"+
		"\u0150/\u0001\u0000\u0000\u0000\u0151\u0152\u0003D\"\u0000\u0152\u0153"+
		"\u00058\u0000\u0000\u0153\u0156\u0003D\"\u0000\u0154\u0155\u0005-\u0000"+
		"\u0000\u0155\u0157\u0003D\"\u0000\u0156\u0154\u0001\u0000\u0000\u0000"+
		"\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0158\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0005A\u0000\u0000\u015b1\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0005 \u0000\u0000\u015d\u015e\u0006\u0019\uffff\uffff\u0000\u015e\u015f"+
		"\u00059\u0000\u0000\u015f\u0160\u0005:\u0000\u0000\u0160\u0161\u0005="+
		"\u0000\u0000\u0161\u0162\u00034\u001a\u0000\u0162\u0163\u0005>\u0000\u0000"+
		"\u01633\u0001\u0000\u0000\u0000\u0164\u016a\u0003\"\u0011\u0000\u0165"+
		"\u016a\u0003(\u0014\u0000\u0166\u016a\u0003*\u0015\u0000\u0167\u016a\u0003"+
		",\u0016\u0000\u0168\u016a\u00036\u001b\u0000\u0169\u0164\u0001\u0000\u0000"+
		"\u0000\u0169\u0165\u0001\u0000\u0000\u0000\u0169\u0166\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u0168\u0001\u0000\u0000"+
		"\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u0175\u0001\u0000\u0000"+
		"\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e\u016f\u0005\u0010\u0000"+
		"\u0000\u016f\u0173\u0006\u001a\uffff\uffff\u0000\u0170\u0171\u0005\n\u0000"+
		"\u0000\u0171\u0173\u0006\u001a\uffff\uffff\u0000\u0172\u016e\u0001\u0000"+
		"\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000"+
		"\u0000\u0000\u0174\u0176\u0005A\u0000\u0000\u0175\u0172\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u017e\u0001\u0000\u0000"+
		"\u0000\u0177\u017d\u0003\"\u0011\u0000\u0178\u017d\u0003(\u0014\u0000"+
		"\u0179\u017d\u0003*\u0015\u0000\u017a\u017d\u0003,\u0016\u0000\u017b\u017d"+
		"\u00036\u001b\u0000\u017c\u0177\u0001\u0000\u0000\u0000\u017c\u0178\u0001"+
		"\u0000\u0000\u0000\u017c\u0179\u0001\u0000\u0000\u0000\u017c\u017a\u0001"+
		"\u0000\u0000\u0000\u017c\u017b\u0001\u0000\u0000\u0000\u017d\u0180\u0001"+
		"\u0000\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001"+
		"\u0000\u0000\u0000\u017f5\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0181\u0186\u00038\u001c\u0000\u0182\u0186\u0003<\u001e\u0000"+
		"\u0183\u0186\u0003>\u001f\u0000\u0184\u0186\u0003@ \u0000\u0185\u0181"+
		"\u0001\u0000\u0000\u0000\u0185\u0182\u0001\u0000\u0000\u0000\u0185\u0183"+
		"\u0001\u0000\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u01867\u0001"+
		"\u0000\u0000\u0000\u0187\u0190\u0003\f\u0006\u0000\u0188\u018a\u00058"+
		"\u0000\u0000\u0189\u018b\u0005#\u0000\u0000\u018a\u0189\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000"+
		"\u0000\u018c\u018f\u0003D\"\u0000\u018d\u018f\u0003:\u001d\u0000\u018e"+
		"\u018c\u0001\u0000\u0000\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f"+
		"\u0191\u0001\u0000\u0000\u0000\u0190\u0188\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0193\u0005A\u0000\u0000\u01939\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"D\u0000\u0000\u0195\u019d\u0005=\u0000\u0000\u0196\u0197\u0005D\u0000"+
		"\u0000\u0197\u0198\u0005B\u0000\u0000\u0198\u0199\u0003D\"\u0000\u0199"+
		"\u019a\u0005?\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u0196"+
		"\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b"+
		"\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0"+
		"\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1"+
		"\u0005D\u0000\u0000\u01a1\u01a2\u0005B\u0000\u0000\u01a2\u01a3\u0003D"+
		"\"\u0000\u01a3\u01a4\u0005>\u0000\u0000\u01a4;\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a7\u0005D\u0000\u0000\u01a6\u01a8\u0003\u000e\u0007\u0000\u01a7"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ab\u00058\u0000\u0000\u01aa\u01ac"+
		"\u0005#\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0003"+
		"D\"\u0000\u01ae\u01af\u0005A\u0000\u0000\u01af\u01b0\u0006\u001e\uffff"+
		"\uffff\u0000\u01b0=\u0001\u0000\u0000\u0000\u01b1\u01b2\u0003D\"\u0000"+
		"\u01b2\u01b3\u0005A\u0000\u0000\u01b3?\u0001\u0000\u0000\u0000\u01b4\u01b5"+
		"\u0007\u0003\u0000\u0000\u01b5\u01b7\u0005@\u0000\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u0005D\u0000\u0000\u01b9\u01bb\u00059\u0000"+
		"\u0000\u01ba\u01bc\u0003D\"\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bd\u01be\u0005:\u0000\u0000\u01be\u01bf\u0003B!\u0000\u01bf\u01c0"+
		"\u0005A\u0000\u0000\u01c0A\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005\u0005"+
		"\u0000\u0000\u01c2\u01c3\u00059\u0000\u0000\u01c3\u01c4\u0003\u001e\u000f"+
		"\u0000\u01c4\u01c5\u0005:\u0000\u0000\u01c5C\u0001\u0000\u0000\u0000\u01c6"+
		"\u01cc\u0003F#\u0000\u01c7\u01c8\u0003F#\u0000\u01c8\u01c9\u0005?\u0000"+
		"\u0000\u01c9\u01ca\u0003D\"\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c6\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000\u0000"+
		"\u01ccE\u0001\u0000\u0000\u0000\u01cd\u01ce\u0003J%\u0000\u01ce\u01cf"+
		"\u0003H$\u0000\u01cfG\u0001\u0000\u0000\u0000\u01d0\u01d1\u00058\u0000"+
		"\u0000\u01d1\u01d2\u0003J%\u0000\u01d2\u01d3\u0006$\uffff\uffff\u0000"+
		"\u01d3\u01d4\u0003H$\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d0"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6I\u0001"+
		"\u0000\u0000\u0000\u01d7\u01e0\u0003L&\u0000\u01d8\u01d9\u0003L&\u0000"+
		"\u01d9\u01da\u00057\u0000\u0000\u01da\u01db\u0003L&\u0000\u01db\u01dc"+
		"\u0005B\u0000\u0000\u01dc\u01dd\u0003J%\u0000\u01dd\u01de\u0006%\uffff"+
		"\uffff\u0000\u01de\u01e0\u0001\u0000\u0000\u0000\u01df\u01d7\u0001\u0000"+
		"\u0000\u0000\u01df\u01d8\u0001\u0000\u0000\u0000\u01e0K\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e8\u0003N\'\u0000\u01e2\u01e3\u0003N\'\u0000\u01e3\u01e4"+
		"\u00053\u0000\u0000\u01e4\u01e5\u0003J%\u0000\u01e5\u01e6\u0006&\uffff"+
		"\uffff\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e7\u01e2\u0001\u0000\u0000\u0000\u01e8M\u0001\u0000\u0000"+
		"\u0000\u01e9\u01f0\u0003P(\u0000\u01ea\u01eb\u0003P(\u0000\u01eb\u01ec"+
		"\u00052\u0000\u0000\u01ec\u01ed\u0003N\'\u0000\u01ed\u01ee\u0006\'\uffff"+
		"\uffff\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01e9\u0001\u0000"+
		"\u0000\u0000\u01ef\u01ea\u0001\u0000\u0000\u0000\u01f0O\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0003T*\u0000\u01f2\u01f3\u0003R)\u0000\u01f3Q\u0001"+
		"\u0000\u0000\u0000\u01f4\u01f5\u0007\u0004\u0000\u0000\u01f5\u01f6\u0003"+
		"T*\u0000\u01f6\u01f7\u0006)\uffff\uffff\u0000\u01f7\u01f8\u0003R)\u0000"+
		"\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0001\u0000\u0000\u0000\u01faS\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0003X,\u0000\u01fc\u01fd\u0003V+\u0000\u01fdU\u0001\u0000\u0000"+
		"\u0000\u01fe\u01ff\u0007\u0005\u0000\u0000\u01ff\u0200\u0003X,\u0000\u0200"+
		"\u0201\u0006+\uffff\uffff\u0000\u0201\u0202\u0003V+\u0000\u0202\u0204"+
		"\u0001\u0000\u0000\u0000\u0203\u01fe\u0001\u0000\u0000\u0000\u0203\u0204"+
		"\u0001\u0000\u0000\u0000\u0204W\u0001\u0000\u0000\u0000\u0205\u0206\u0003"+
		"\\.\u0000\u0206\u0207\u0003Z-\u0000\u0207Y\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0007\u0006\u0000\u0000\u0209\u020a\u0003\\.\u0000\u020a\u020b"+
		"\u0006-\uffff\uffff\u0000\u020b\u020c\u0003Z-\u0000\u020c\u020e\u0001"+
		"\u0000\u0000\u0000\u020d\u0208\u0001\u0000\u0000\u0000\u020d\u020e\u0001"+
		"\u0000\u0000\u0000\u020e[\u0001\u0000\u0000\u0000\u020f\u0210\u0003`0"+
		"\u0000\u0210\u0211\u0003^/\u0000\u0211]\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0007\u0007\u0000\u0000\u0213\u0214\u0003`0\u0000\u0214\u0215\u0006"+
		"/\uffff\uffff\u0000\u0215\u0216\u0003^/\u0000\u0216\u0218\u0001\u0000"+
		"\u0000\u0000\u0217\u0212\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000"+
		"\u0000\u0000\u0218_\u0001\u0000\u0000\u0000\u0219\u021f\u0003b1\u0000"+
		"\u021a\u021b\u0007\b\u0000\u0000\u021b\u021c\u0003`0\u0000\u021c\u021d"+
		"\u00060\uffff\uffff\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u0219"+
		"\u0001\u0000\u0000\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021fa\u0001"+
		"\u0000\u0000\u0000\u0220\u0221\u0003f3\u0000\u0221\u0222\u0003d2\u0000"+
		"\u0222c\u0001\u0000\u0000\u0000\u0223\u0224\u0007\t\u0000\u0000\u0224"+
		"\u0225\u0003d2\u0000\u0225\u0226\u00062\uffff\uffff\u0000\u0226\u0228"+
		"\u0001\u0000\u0000\u0000\u0227\u0223\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u0001\u0000\u0000\u0000\u0228e\u0001\u0000\u0000\u0000\u0229\u022f\u0003"+
		"h4\u0000\u022a\u022b\u0005;\u0000\u0000\u022b\u022c\u0003D\"\u0000\u022c"+
		"\u022d\u0005<\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u0229"+
		"\u0001\u0000\u0000\u0000\u022e\u022a\u0001\u0000\u0000\u0000\u022fg\u0001"+
		"\u0000\u0000\u0000\u0230\u0236\u0003j5\u0000\u0231\u0232\u0003j5\u0000"+
		"\u0232\u0233\u0005@\u0000\u0000\u0233\u0234\u0003h4\u0000\u0234\u0236"+
		"\u0001\u0000\u0000\u0000\u0235\u0230\u0001\u0000\u0000\u0000\u0235\u0231"+
		"\u0001\u0000\u0000\u0000\u0236i\u0001\u0000\u0000\u0000\u0237\u023d\u0003"+
		"l6\u0000\u0238\u0239\u00059\u0000\u0000\u0239\u023a\u0003D\"\u0000\u023a"+
		"\u023b\u0005:\u0000\u0000\u023b\u023d\u0001\u0000\u0000\u0000\u023c\u0237"+
		"\u0001\u0000\u0000\u0000\u023c\u0238\u0001\u0000\u0000\u0000\u023dk\u0001"+
		"\u0000\u0000\u0000\u023e\u0244\u0003r9\u0000\u023f\u0244\u0003p8\u0000"+
		"\u0240\u0244\u0003n7\u0000\u0241\u0244\u0005D\u0000\u0000\u0242\u0244"+
		"\u0005\u0007\u0000\u0000\u0243\u023e\u0001\u0000\u0000\u0000\u0243\u023f"+
		"\u0001\u0000\u0000\u0000\u0243\u0240\u0001\u0000\u0000\u0000\u0243\u0241"+
		"\u0001\u0000\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244m\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0005D\u0000\u0000\u0246\u0247\u0005B\u0000"+
		"\u0000\u0247\u0248\u0005B\u0000\u0000\u0248\u0249\u0005D\u0000\u0000\u0249"+
		"o\u0001\u0000\u0000\u0000\u024a\u024b\u0005!\u0000\u0000\u024b\u025c\u0006"+
		"8\uffff\uffff\u0000\u024c\u024d\u0005\u0018\u0000\u0000\u024d\u025c\u0006"+
		"8\uffff\uffff\u0000\u024e\u024f\u0005\u0017\u0000\u0000\u024f\u025c\u0006"+
		"8\uffff\uffff\u0000\u0250\u0251\u0005\"\u0000\u0000\u0251\u025c\u0006"+
		"8\uffff\uffff\u0000\u0252\u0253\u0005\u001f\u0000\u0000\u0253\u025c\u0006"+
		"8\uffff\uffff\u0000\u0254\u0255\u0005\u001e\u0000\u0000\u0255\u025c\u0006"+
		"8\uffff\uffff\u0000\u0256\u0257\u0005\u001d\u0000\u0000\u0257\u025c\u0006"+
		"8\uffff\uffff\u0000\u0258\u0259\u0005\u0019\u0000\u0000\u0259\u025c\u0006"+
		"8\uffff\uffff\u0000\u025a\u025c\u0005D\u0000\u0000\u025b\u024a\u0001\u0000"+
		"\u0000\u0000\u025b\u024c\u0001\u0000\u0000\u0000\u025b\u024e\u0001\u0000"+
		"\u0000\u0000\u025b\u0250\u0001\u0000\u0000\u0000\u025b\u0252\u0001\u0000"+
		"\u0000\u0000\u025b\u0254\u0001\u0000\u0000\u0000\u025b\u0256\u0001\u0000"+
		"\u0000\u0000\u025b\u0258\u0001\u0000\u0000\u0000\u025b\u025a\u0001\u0000"+
		"\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d\u025f\u00059\u0000"+
		"\u0000\u025e\u0260\u0003D\"\u0000\u025f\u025e\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0005:\u0000\u0000\u0262q\u0001\u0000\u0000\u0000\u0263\u0264"+
		"\u0007\n\u0000\u0000\u0264s\u0001\u0000\u0000\u00006vx\u0086\u0093\u0097"+
		"\u009a\u009f\u00a9\u00b6\u00bc\u00c4\u00cc\u00dc\u00e5\u00eb\u00f7\u0107"+
		"\u0113\u0121\u0143\u014d\u0158\u0169\u016b\u0172\u0175\u017c\u017e\u0185"+
		"\u018a\u018e\u0190\u019d\u01a7\u01ab\u01b6\u01bb\u01cb\u01d5\u01df\u01e7"+
		"\u01ef\u01f9\u0203\u020d\u0217\u021e\u0227\u022e\u0235\u023c\u0243\u025b"+
		"\u025f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}