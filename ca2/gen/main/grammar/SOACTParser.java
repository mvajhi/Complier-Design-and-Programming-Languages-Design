// Generated from /home/mvajhi/code/Complier-Design-and-Programming-Languages-Design/ca2/src/main/grammar/SOACT.g4 by ANTLR 4.13.2
package main.grammar;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.expression.operators.*;
    import main.utils.*;
    import main.ast.nodes.type.*;
    import main.ast.nodes.statements.*;
    import main.ast.nodes.expression.value.*;
    import java.util.ArrayList;

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
		RULE_soact = 0, RULE_record = 1, RULE_actorDec = 2, RULE_customPrimitive = 3, 
		RULE_actorVars = 4, RULE_init = 5, RULE_arrayIndex = 6, RULE_primitives = 7, 
		RULE_container = 8, RULE_constructor = 9, RULE_msgHandler = 10, RULE_arguments = 11, 
		RULE_arrayType = 12, RULE_accesslevels = 13, RULE_authorized = 14, RULE_accesslevelsParam = 15, 
		RULE_forLoop = 16, RULE_forLoopCondition = 17, RULE_range = 18, RULE_whileLoop = 19, 
		RULE_ifBlock = 20, RULE_joinBlock = 21, RULE_joinBlockBody = 22, RULE_pipeStatement = 23, 
		RULE_main = 24, RULE_body = 25, RULE_statements = 26, RULE_initStatement = 27, 
		RULE_constructorCall = 28, RULE_initRecord = 29, RULE_assignStatement = 30, 
		RULE_exprStatement = 31, RULE_observeStatement = 32, RULE_expression = 33, 
		RULE_expComma = 34, RULE_expOr = 35, RULE_expAnd = 36, RULE_expAndPrim = 37, 
		RULE_expEquals = 38, RULE_expEqualsPrim = 39, RULE_expCompare = 40, RULE_expComparePrim = 41, 
		RULE_expPlusMinus = 42, RULE_expPlusMinusPrim = 43, RULE_expDivideMultMod = 44, 
		RULE_expPreUnary = 45, RULE_expPreUnaryPrim = 46, RULE_expPostUnary = 47, 
		RULE_expBracket = 48, RULE_expAccess = 49, RULE_expPar = 50, RULE_customPrimAccess = 51, 
		RULE_handlerCall = 52, RULE_primitivesVals = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"soact", "record", "actorDec", "customPrimitive", "actorVars", "init", 
			"arrayIndex", "primitives", "container", "constructor", "msgHandler", 
			"arguments", "arrayType", "accesslevels", "authorized", "accesslevelsParam", 
			"forLoop", "forLoopCondition", "range", "whileLoop", "ifBlock", "joinBlock", 
			"joinBlockBody", "pipeStatement", "main", "body", "statements", "initStatement", 
			"constructorCall", "initRecord", "assignStatement", "exprStatement", 
			"observeStatement", "expression", "expComma", "expOr", "expAnd", "expAndPrim", 
			"expEquals", "expEqualsPrim", "expCompare", "expComparePrim", "expPlusMinus", 
			"expPlusMinusPrim", "expDivideMultMod", "expPreUnary", "expPreUnaryPrim", 
			"expPostUnary", "expBracket", "expAccess", "expPar", "customPrimAccess", 
			"handlerCall", "primitivesVals"
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
	public static class SoactContext extends ParserRuleContext {
		public Soact soactRet;
		public ActorDecContext a;
		public RecordContext r;
		public MainContext m;
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
		public SoactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterSoact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitSoact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitSoact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SoactContext soact() throws RecognitionException {
		SoactContext _localctx = new SoactContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_soact);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((SoactContext)_localctx).soactRet =  new Soact();
			      _localctx.soactRet.setLine(1);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTOR || _la==RECORD) {
				{
				setState(115);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(109);
					((SoactContext)_localctx).a = actorDec();
					 _localctx.soactRet.addActorDec(((SoactContext)_localctx).a.actorDecRet); 
					}
					break;
				case RECORD:
					{
					setState(112);
					((SoactContext)_localctx).r = record();
					 _localctx.soactRet.addRecordNode(((SoactContext)_localctx).r.recordNodeRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			((SoactContext)_localctx).m = main();
			_localctx.soactRet.setMain(((SoactContext)_localctx).m.mainRet);
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
		public RecordNode recordNodeRet;
		public Token rec;
		public Token id;
		public InitContext var;
		public TerminalNode RECORD() { return getToken(SOACTParser.RECORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SOACTParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SOACTParser.SEMICOLON, i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
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
			setState(123);
			((RecordContext)_localctx).rec = match(RECORD);
			setState(124);
			((RecordContext)_localctx).id = match(IDENTIFIER);
			 Identifier identifier = Identifier.createId((((RecordContext)_localctx).id!=null?((RecordContext)_localctx).id.getText():null) ,(((RecordContext)_localctx).id!=null?((RecordContext)_localctx).id.getLine():0));
			    ((RecordContext)_localctx).recordNodeRet =  new RecordNode(identifier, (((RecordContext)_localctx).rec!=null?((RecordContext)_localctx).rec.getLine():0));
			{
			setState(126);
			match(LBRACE);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				((RecordContext)_localctx).var = init();
				_localctx.recordNodeRet.addVar(((RecordContext)_localctx).var.varRet);
				setState(129);
				match(SEMICOLON);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER );
			setState(135);
			match(RBRACE);
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
	public static class ActorDecContext extends ParserRuleContext {
		public ActorDec actorDecRet;
		public Token def;
		public Token id;
		public CustomPrimitiveContext c;
		public ActorVarsContext v;
		public ConstructorContext cs;
		public MsgHandlerContext h;
		public TerminalNode ACTOR() { return getToken(SOACTParser.ACTOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((ActorDecContext)_localctx).def = match(ACTOR);
			setState(138);
			((ActorDecContext)_localctx).id = match(IDENTIFIER);
			 ((ActorDecContext)_localctx).actorDecRet =  new ActorDec(Identifier.createId((((ActorDecContext)_localctx).id!=null?((ActorDecContext)_localctx).id.getText():null) ,(((ActorDecContext)_localctx).id!=null?((ActorDecContext)_localctx).id.getLine():0)), (((ActorDecContext)_localctx).def!=null?((ActorDecContext)_localctx).def.getLine():0)); 
			{
			setState(140);
			match(LBRACE);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMITIVE) {
				{
				{
				setState(141);
				((ActorDecContext)_localctx).c = customPrimitive();
				_localctx.actorDecRet.addCustomPrimitive(((ActorDecContext)_localctx).c.cpRet);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTORVAR) {
				{
				setState(149);
				((ActorDecContext)_localctx).v = actorVars();
				_localctx.actorDecRet.setActorVars(((ActorDecContext)_localctx).v.argRet.vars);
				                    _localctx.actorDecRet.setAccessExpressions(((ActorDecContext)_localctx).v.argRet.accessLevels);
				}
			}

			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(154);
				((ActorDecContext)_localctx).cs = constructor();
				_localctx.actorDecRet.setConstructor(((ActorDecContext)_localctx).cs.constructorRet);
				}
			}

			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGRCV || _la==MSGOBS) {
				{
				{
				setState(159);
				((ActorDecContext)_localctx).h = msgHandler();
				_localctx.actorDecRet.addHandler(((ActorDecContext)_localctx).h.handlerRet);
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
			match(RBRACE);
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
		public CustomPrimitiveDeclaration cpRet;
		public Token p;
		public Token id;
		public Token stateId;
		public Token lastStateId;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode PRIMITIVE() { return getToken(SOACTParser.PRIMITIVE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 6, RULE_customPrimitive);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((CustomPrimitiveContext)_localctx).p = match(PRIMITIVE);
			setState(170);
			((CustomPrimitiveContext)_localctx).id = match(IDENTIFIER);
			((CustomPrimitiveContext)_localctx).cpRet =  new CustomPrimitiveDeclaration(Identifier.createId((((CustomPrimitiveContext)_localctx).id!=null?((CustomPrimitiveContext)_localctx).id.getText():null) ,(((CustomPrimitiveContext)_localctx).id!=null?((CustomPrimitiveContext)_localctx).id.getLine():0)), (((CustomPrimitiveContext)_localctx).p!=null?((CustomPrimitiveContext)_localctx).p.getLine():0));
			setState(172);
			match(LBRACE);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					((CustomPrimitiveContext)_localctx).stateId = match(IDENTIFIER);
					_localctx.cpRet.addState(Identifier.createId((((CustomPrimitiveContext)_localctx).stateId!=null?((CustomPrimitiveContext)_localctx).stateId.getText():null) ,(((CustomPrimitiveContext)_localctx).stateId!=null?((CustomPrimitiveContext)_localctx).stateId.getLine():0)));
					setState(175);
					match(COMMA);
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(181);
			((CustomPrimitiveContext)_localctx).lastStateId = match(IDENTIFIER);
			_localctx.cpRet.addState(Identifier.createId((((CustomPrimitiveContext)_localctx).lastStateId!=null?((CustomPrimitiveContext)_localctx).lastStateId.getText():null) ,(((CustomPrimitiveContext)_localctx).lastStateId!=null?((CustomPrimitiveContext)_localctx).lastStateId.getLine():0)));
			setState(183);
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
		public ActorVarsDTO argRet;
		public InitContext var;
		public AccesslevelsContext a;
		public TerminalNode ACTORVAR() { return getToken(SOACTParser.ACTORVAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SOACTParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SOACTParser.SEMICOLON, i);
		}
		public List<InitContext> init() {
			return getRuleContexts(InitContext.class);
		}
		public InitContext init(int i) {
			return getRuleContext(InitContext.class,i);
		}
		public List<TerminalNode> LPAR() { return getTokens(SOACTParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SOACTParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public List<AccesslevelsContext> accesslevels() {
			return getRuleContexts(AccesslevelsContext.class);
		}
		public AccesslevelsContext accesslevels(int i) {
			return getRuleContext(AccesslevelsContext.class,i);
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
		enterRule(_localctx, 8, RULE_actorVars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ActorVarsContext)_localctx).argRet =  new ActorVarsDTO();
			{
			setState(186);
			match(ACTORVAR);
			setState(187);
			match(LBRACE);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(188);
				((ActorVarsContext)_localctx).var = init();
				_localctx.argRet.vars.add(((ActorVarsContext)_localctx).var.varRet);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(190);
					match(LPAR);
					setState(191);
					((ActorVarsContext)_localctx).a = accesslevels();
					_localctx.argRet.accessLevels.add(((ActorVarsContext)_localctx).a.accessLevelsRet);
					setState(193);
					match(RPAR);
					}
				}

				setState(197);
				match(SEMICOLON);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(RBRACE);
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
	public static class InitContext extends ParserRuleContext {
		public VarDeclaration varRet;
		public PrimitivesContext p;
		public Token id;
		public ArrayTypeContext a;
		public ContainerContext c;
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
		enterRule(_localctx, 10, RULE_init);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(206);
				((InitContext)_localctx).p = primitives();
				setState(207);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), ((InitContext)_localctx).p.typeRet, (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0));
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(209);
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
				setState(212);
				((InitContext)_localctx).a = arrayType();
				setState(213);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), ((InitContext)_localctx).a.typeRet, (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0));
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(216);
				((InitContext)_localctx).c = container();
				setState(217);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), ((InitContext)_localctx).c.typeRet, (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0));
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
		public IntValue intValueRet;
		public Token value;
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public TerminalNode INT_VALUE() { return getToken(SOACTParser.INT_VALUE, 0); }
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
		enterRule(_localctx, 12, RULE_arrayIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(LBRACK);
			setState(223);
			((ArrayIndexContext)_localctx).value = match(INT_VALUE);
			 ((ArrayIndexContext)_localctx).intValueRet =  new IntValue(Integer.parseInt((((ArrayIndexContext)_localctx).value!=null?((ArrayIndexContext)_localctx).value.getText():null))); _localctx.intValueRet.setLine((((ArrayIndexContext)_localctx).value!=null?((ArrayIndexContext)_localctx).value.getLine():0));
			setState(225);
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
		public Type typeRet;
		public Token i;
		public Token s;
		public Token b;
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
		enterRule(_localctx, 14, RULE_primitives);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((PrimitivesContext)_localctx).i = match(INT);
				 ((PrimitivesContext)_localctx).typeRet =  new Type((((PrimitivesContext)_localctx).i!=null?((PrimitivesContext)_localctx).i.getText():null)); _localctx.typeRet.setLine((((PrimitivesContext)_localctx).i!=null?((PrimitivesContext)_localctx).i.getLine():0)); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((PrimitivesContext)_localctx).s = match(STRING);
				 ((PrimitivesContext)_localctx).typeRet =  new Type((((PrimitivesContext)_localctx).s!=null?((PrimitivesContext)_localctx).s.getText():null)); _localctx.typeRet.setLine((((PrimitivesContext)_localctx).s!=null?((PrimitivesContext)_localctx).s.getLine():0)); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(231);
				((PrimitivesContext)_localctx).b = match(BOOLEAN);
				 ((PrimitivesContext)_localctx).typeRet =  new Type((((PrimitivesContext)_localctx).b!=null?((PrimitivesContext)_localctx).b.getText():null)); _localctx.typeRet.setLine((((PrimitivesContext)_localctx).b!=null?((PrimitivesContext)_localctx).b.getLine():0)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				((PrimitivesContext)_localctx).i = match(ID);
				 ((PrimitivesContext)_localctx).typeRet =  new Type((((PrimitivesContext)_localctx).i!=null?((PrimitivesContext)_localctx).i.getText():null)); _localctx.typeRet.setLine((((PrimitivesContext)_localctx).i!=null?((PrimitivesContext)_localctx).i.getLine():0)); 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(235);
				((PrimitivesContext)_localctx).i = match(IDENTIFIER);
				 ((PrimitivesContext)_localctx).typeRet =  new Type((((PrimitivesContext)_localctx).i!=null?((PrimitivesContext)_localctx).i.getText():null)); _localctx.typeRet.setLine((((PrimitivesContext)_localctx).i!=null?((PrimitivesContext)_localctx).i.getLine():0)); _localctx.typeRet.setIsBuiltInType(false); 
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
	public static class ContainerContext extends ParserRuleContext {
		public Type typeRet;
		public Token t;
		public PrimitivesContext p;
		public TerminalNode LESS_THAN() { return getToken(SOACTParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SOACTParser.GREATER_THAN, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_container);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(239);
				((ContainerContext)_localctx).t = match(SET);
				 var type = ((ContainerContext)_localctx).t; 
				}
				break;
			case LIST:
				{
				setState(241);
				((ContainerContext)_localctx).t = match(LIST);
				 var type = ((ContainerContext)_localctx).t; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			match(LESS_THAN);
			setState(246);
			((ContainerContext)_localctx).p = primitives();
			setState(247);
			match(GREATER_THAN);
			 ((ContainerContext)_localctx).typeRet =  new ContainerType((((ContainerContext)_localctx).t!=null?((ContainerContext)_localctx).t.getText():null), ((ContainerContext)_localctx).p.typeRet); _localctx.typeRet.setLine((((ContainerContext)_localctx).t!=null?((ContainerContext)_localctx).t.getLine():0)); 
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
		public ConstructorDto constructorRet;
		public Token id;
		public ArgumentsContext args;
		public BodyContext b;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
		enterRule(_localctx, 18, RULE_constructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ConstructorContext)_localctx).constructorRet =  new ConstructorDto();
			{
			setState(251);
			((ConstructorContext)_localctx).id = match(IDENTIFIER);
			_localctx.constructorRet.name = (((ConstructorContext)_localctx).id!=null?((ConstructorContext)_localctx).id.getText():null);
			setState(253);
			match(LPAR);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(254);
				((ConstructorContext)_localctx).args = arguments();
				_localctx.constructorRet.args.addAll(((ConstructorContext)_localctx).args.argsRet);
				}
			}

			setState(259);
			match(RPAR);
			setState(260);
			match(LBRACE);
			setState(261);
			((ConstructorContext)_localctx).b = body();
			_localctx.constructorRet.body.addAll(((ConstructorContext)_localctx).b.bodyRet);
			setState(263);
			match(RBRACE);
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
	public static class MsgHandlerContext extends ParserRuleContext {
		public Handler handlerRet;
		public Token srv;
		public Token obs;
		public AuthorizedContext a;
		public Token id_name;
		public ArgumentsContext args;
		public BodyContext b;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode MSGRCV() { return getToken(SOACTParser.MSGRCV, 0); }
		public TerminalNode MSGOBS() { return getToken(SOACTParser.MSGOBS, 0); }
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
		enterRule(_localctx, 20, RULE_msgHandler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			String type ;
			{
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MSGRCV:
				{
				setState(266);
				((MsgHandlerContext)_localctx).srv = match(MSGRCV);
				type = (((MsgHandlerContext)_localctx).srv!=null?((MsgHandlerContext)_localctx).srv.getText():null);
				                   ((MsgHandlerContext)_localctx).handlerRet =  new ServiceHandler((((MsgHandlerContext)_localctx).srv!=null?((MsgHandlerContext)_localctx).srv.getLine():0));
				}
				break;
			case MSGOBS:
				{
				setState(268);
				((MsgHandlerContext)_localctx).obs = match(MSGOBS);
				type = (((MsgHandlerContext)_localctx).obs!=null?((MsgHandlerContext)_localctx).obs.getText():null);
				                  ((MsgHandlerContext)_localctx).handlerRet =  new ObserveHandler((((MsgHandlerContext)_localctx).obs!=null?((MsgHandlerContext)_localctx).obs.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHORIZED) {
				{
				setState(272);
				((MsgHandlerContext)_localctx).a = authorized();
				_localctx.handlerRet.setAuthorizationExpressions(((MsgHandlerContext)_localctx).a.authorizeRet);
				}
			}

			setState(277);
			((MsgHandlerContext)_localctx).id_name = match(IDENTIFIER);
			_localctx.handlerRet.setName(Identifier.createId((((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getText():null) ,(((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getLine():0)));
			setState(279);
			match(LPAR);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(280);
				((MsgHandlerContext)_localctx).args = arguments();
				_localctx.handlerRet.setArgs(((MsgHandlerContext)_localctx).args.argsRet);
				}
			}

			setState(285);
			match(RPAR);
			setState(286);
			match(LBRACE);
			setState(287);
			((MsgHandlerContext)_localctx).b = body();
			_localctx.handlerRet.setBody(((MsgHandlerContext)_localctx).b.bodyRet);
			setState(289);
			match(RBRACE);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public ArrayList<VarDeclaration> argsRet;
		public InitContext arg;
		public InitContext otherArg;
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
		enterRule(_localctx, 22, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ArgumentsContext)_localctx).argsRet =  new ArrayList<>();
			{
			setState(292);
			((ArgumentsContext)_localctx).arg = init();
			_localctx.argsRet.add(((ArgumentsContext)_localctx).arg.varRet);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				((ArgumentsContext)_localctx).otherArg = init();
				_localctx.argsRet.add(((ArgumentsContext)_localctx).otherArg.varRet);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ArrayTypeContext extends ParserRuleContext {
		public Type typeRet;
		public PrimitivesContext p;
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public PrimitivesContext primitives() {
			return getRuleContext(PrimitivesContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			((ArrayTypeContext)_localctx).p = primitives();
			setState(304);
			match(LBRACK);
			setState(305);
			match(RBRACK);
			 ((ArrayTypeContext)_localctx).typeRet =  ((ArrayTypeContext)_localctx).p.typeRet; _localctx.typeRet.setIsArray(true); 
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
		public List<Expression> accessLevelsRet;
		public AccesslevelsParamContext p;
		public AccesslevelsParamContext lp;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public List<AccesslevelsParamContext> accesslevelsParam() {
			return getRuleContexts(AccesslevelsParamContext.class);
		}
		public AccesslevelsParamContext accesslevelsParam(int i) {
			return getRuleContext(AccesslevelsParamContext.class,i);
		}
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
		enterRule(_localctx, 26, RULE_accesslevels);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AccesslevelsContext)_localctx).accessLevelsRet =  new ArrayList<>();
			{
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				{
				{
				setState(309);
				match(PUBLIC);
				}
				}
				break;
			case PRIVATE:
				{
				{
				setState(310);
				match(PRIVATE);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(313);
			match(LPAR);
			setState(314);
			((AccesslevelsContext)_localctx).p = accesslevelsParam();
			_localctx.accessLevelsRet.addAll(((AccesslevelsContext)_localctx).p.accessLevelsParamRet);
			setState(316);
			match(COMMA);
			setState(317);
			((AccesslevelsContext)_localctx).lp = accesslevelsParam();
			_localctx.accessLevelsRet.addAll(((AccesslevelsContext)_localctx).lp.accessLevelsParamRet);
			setState(319);
			match(RPAR);
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
	public static class AuthorizedContext extends ParserRuleContext {
		public List<Expression> authorizeRet;
		public AccesslevelsContext a;
		public TerminalNode AUTHORIZED() { return getToken(SOACTParser.AUTHORIZED, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
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
		enterRule(_localctx, 28, RULE_authorized);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AuthorizedContext)_localctx).authorizeRet =  new ArrayList<>();
			{
			setState(322);
			match(AUTHORIZED);
			setState(323);
			match(LPAR);
			setState(324);
			((AuthorizedContext)_localctx).a = accesslevels();
			_localctx.authorizeRet.addAll(((AuthorizedContext)_localctx).a.accessLevelsRet);
			setState(326);
			match(RPAR);
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
	public static class AccesslevelsParamContext extends ParserRuleContext {
		public List<Expression> accessLevelsParamRet;
		public Token id;
		public AccesslevelsContext a;
		public TerminalNode NULL() { return getToken(SOACTParser.NULL, 0); }
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 30, RULE_accesslevelsParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AccesslevelsParamContext)_localctx).accessLevelsParamRet =  new ArrayList<>();
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(329);
				((AccesslevelsParamContext)_localctx).id = match(IDENTIFIER);
				_localctx.accessLevelsParamRet.add(Identifier.createId((((AccesslevelsParamContext)_localctx).id!=null?((AccesslevelsParamContext)_localctx).id.getText():null), (((AccesslevelsParamContext)_localctx).id!=null?((AccesslevelsParamContext)_localctx).id.getLine():0)));
				}
				break;
			case NULL:
				{
				setState(331);
				match(NULL);
				}
				break;
			case SELF:
				{
				setState(332);
				match(SELF);
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				setState(333);
				((AccesslevelsParamContext)_localctx).a = accesslevels();
				_localctx.accessLevelsParamRet.addAll(((AccesslevelsParamContext)_localctx).a.accessLevelsRet);
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
		public ForStatement forRet;
		public Token def;
		public ForLoopConditionContext c;
		public BodyContext b;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode FOR() { return getToken(SOACTParser.FOR, 0); }
		public ForLoopConditionContext forLoopCondition() {
			return getRuleContext(ForLoopConditionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			((ForLoopContext)_localctx).def = match(FOR);
			setState(339);
			((ForLoopContext)_localctx).c = forLoopCondition();
			setState(340);
			match(LBRACE);
			setState(341);
			((ForLoopContext)_localctx).b = body();
			((ForLoopContext)_localctx).forRet =  new ForStatement(((ForLoopContext)_localctx).c.condRet, ((ForLoopContext)_localctx).b.bodyRet, (((ForLoopContext)_localctx).def!=null?((ForLoopContext)_localctx).def.getLine():0));
			setState(343);
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
		public ArrayList<Expression> condRet;
		public Token id;
		public Token rangeId;
		public RangeContext r;
		public RangeContext range;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode IN() { return getToken(SOACTParser.IN, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
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
		enterRule(_localctx, 34, RULE_forLoopCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForLoopConditionContext)_localctx).condRet =  new ArrayList<>();
			{
			setState(346);
			match(LPAR);
			setState(347);
			((ForLoopConditionContext)_localctx).id = match(IDENTIFIER);
			_localctx.condRet.add(Identifier.createId((((ForLoopConditionContext)_localctx).id!=null?((ForLoopConditionContext)_localctx).id.getText():null), (((ForLoopConditionContext)_localctx).id!=null?((ForLoopConditionContext)_localctx).id.getLine():0)));
			setState(349);
			match(IN);
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(350);
				((ForLoopConditionContext)_localctx).rangeId = match(IDENTIFIER);
				_localctx.condRet.add(Identifier.createId((((ForLoopConditionContext)_localctx).rangeId!=null?((ForLoopConditionContext)_localctx).rangeId.getText():null), (((ForLoopConditionContext)_localctx).rangeId!=null?((ForLoopConditionContext)_localctx).rangeId.getLine():0)));
				}
				break;
			case RANGE:
				{
				setState(352);
				((ForLoopConditionContext)_localctx).r = ((ForLoopConditionContext)_localctx).range = range();
				_localctx.condRet.addAll(((ForLoopConditionContext)_localctx).range.rangeRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(357);
			match(RPAR);
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
	public static class RangeContext extends ParserRuleContext {
		public ArrayList<Expression> rangeRet;
		public Token id1;
		public Token int1;
		public Token id2;
		public Token int2;
		public TerminalNode RANGE() { return getToken(SOACTParser.RANGE, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public List<TerminalNode> INT_VALUE() { return getTokens(SOACTParser.INT_VALUE); }
		public TerminalNode INT_VALUE(int i) {
			return getToken(SOACTParser.INT_VALUE, i);
		}
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
		enterRule(_localctx, 36, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((RangeContext)_localctx).rangeRet =  new ArrayList<>();
			{
			setState(360);
			match(RANGE);
			setState(361);
			match(LPAR);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(362);
				((RangeContext)_localctx).id1 = match(IDENTIFIER);
				_localctx.rangeRet.add(Identifier.createId((((RangeContext)_localctx).id1!=null?((RangeContext)_localctx).id1.getText():null), (((RangeContext)_localctx).id1!=null?((RangeContext)_localctx).id1.getLine():0)));
				}
				break;
			case INT_VALUE:
				{
				setState(364);
				((RangeContext)_localctx).int1 = match(INT_VALUE);
				var tmp1 = new IntValue(Integer.parseInt((((RangeContext)_localctx).int1!=null?((RangeContext)_localctx).int1.getText():null))); tmp1.setLine(((RangeContext)_localctx).int1.getLine()); _localctx.rangeRet.add(tmp1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
			match(COMMA);
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(369);
				((RangeContext)_localctx).id2 = match(IDENTIFIER);
				_localctx.rangeRet.add(Identifier.createId((((RangeContext)_localctx).id2!=null?((RangeContext)_localctx).id2.getText():null), (((RangeContext)_localctx).id2!=null?((RangeContext)_localctx).id2.getLine():0)));
				}
				break;
			case INT_VALUE:
				{
				setState(371);
				((RangeContext)_localctx).int2 = match(INT_VALUE);
				var tmp2 = new IntValue(Integer.parseInt((((RangeContext)_localctx).int2!=null?((RangeContext)_localctx).int2.getText():null))); tmp2.setLine(((RangeContext)_localctx).int2.getLine()); _localctx.rangeRet.add(tmp2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(375);
			match(RPAR);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public WhileStatement whileRet;
		public Token def;
		public ExpressionContext ex;
		public BodyContext b;
		public BodyContext body;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode WHILE() { return getToken(SOACTParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
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
		enterRule(_localctx, 38, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			((WhileLoopContext)_localctx).def = match(WHILE);
			setState(378);
			match(LPAR);
			setState(379);
			((WhileLoopContext)_localctx).ex = expression();
			setState(380);
			match(RPAR);
			setState(381);
			match(RPAR);
			setState(382);
			match(LBRACE);
			setState(383);
			((WhileLoopContext)_localctx).b = ((WhileLoopContext)_localctx).body = body();
			((WhileLoopContext)_localctx).whileRet =  new WhileStatement(((WhileLoopContext)_localctx).ex.expRet, ((WhileLoopContext)_localctx).body.bodyRet, (((WhileLoopContext)_localctx).def!=null?((WhileLoopContext)_localctx).def.getLine():0));
			setState(385);
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
		public IfStatement ifRet;
		public Token def;
		public ExpressionContext ifExp;
		public BodyContext ifBody;
		public Token elif;
		public ExpressionContext elseIfExp;
		public BodyContext elseIfBody;
		public BodyContext elseBody;
		public List<TerminalNode> LPAR() { return getTokens(SOACTParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SOACTParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(SOACTParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(SOACTParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(SOACTParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(SOACTParser.RBRACE, i);
		}
		public List<TerminalNode> IF() { return getTokens(SOACTParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(SOACTParser.IF, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(SOACTParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(SOACTParser.ELSE, i);
		}
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
		enterRule(_localctx, 40, RULE_ifBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			((IfBlockContext)_localctx).def = match(IF);
			((IfBlockContext)_localctx).ifRet =  new IfStatement((((IfBlockContext)_localctx).def!=null?((IfBlockContext)_localctx).def.getLine():0));
			setState(389);
			match(LPAR);
			setState(390);
			((IfBlockContext)_localctx).ifExp = expression();
			_localctx.ifRet.setIfConds(((IfBlockContext)_localctx).ifExp.expRet);
			setState(392);
			match(RPAR);
			setState(393);
			match(LBRACE);
			setState(394);
			((IfBlockContext)_localctx).ifBody = body();
			_localctx.ifRet.setIfBody(((IfBlockContext)_localctx).ifBody.bodyRet);
			setState(396);
			match(RBRACE);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(397);
					((IfBlockContext)_localctx).elif = match(ELSE);
					setState(398);
					match(IF);
					setState(399);
					match(LPAR);
					setState(400);
					((IfBlockContext)_localctx).elseIfExp = expression();
					_localctx.ifRet.addElseIfcond(((IfBlockContext)_localctx).elseIfExp.expRet);
					setState(402);
					match(RPAR);
					setState(403);
					match(LBRACE);
					setState(404);
					((IfBlockContext)_localctx).elseIfBody = body();
					_localctx.ifRet.addElseIfBody(((IfBlockContext)_localctx).elseIfBody.bodyRet);
					setState(406);
					match(RBRACE);
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(413);
				match(ELSE);
				setState(414);
				match(LBRACE);
				setState(415);
				((IfBlockContext)_localctx).elseBody = body();
				_localctx.ifRet.setElseBody(((IfBlockContext)_localctx).elseBody.bodyRet);
				setState(417);
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
		public JoinStatement joinRet;
		public Token def;
		public JoinBlockBodyContext jb;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode JOIN() { return getToken(SOACTParser.JOIN, 0); }
		public JoinBlockBodyContext joinBlockBody() {
			return getRuleContext(JoinBlockBodyContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_joinBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			((JoinBlockContext)_localctx).def = match(JOIN);
			((JoinBlockContext)_localctx).joinRet =  new JoinStatement((((JoinBlockContext)_localctx).def!=null?((JoinBlockContext)_localctx).def.getLine():0));
			setState(423);
			match(LBRACE);
			setState(424);
			((JoinBlockContext)_localctx).jb = joinBlockBody();
			_localctx.joinRet.setBody(((JoinBlockContext)_localctx).jb.joinBodyRet);
			setState(426);
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
		public ArrayList<Statement> joinBodyRet;
		public BodyContext b1;
		public PipeStatementContext p;
		public BodyContext b2;
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
		enterRule(_localctx, 44, RULE_joinBlockBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((JoinBlockBodyContext)_localctx).joinBodyRet =  new ArrayList<>();
			{
			setState(429);
			((JoinBlockBodyContext)_localctx).b1 = body();
			_localctx.joinBodyRet.addAll(((JoinBlockBodyContext)_localctx).b1.bodyRet);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(431);
				((JoinBlockBodyContext)_localctx).p = pipeStatement();
				_localctx.joinBodyRet.add(((JoinBlockBodyContext)_localctx).p.pipeRet);
				setState(433);
				((JoinBlockBodyContext)_localctx).b2 = body();
				_localctx.joinBodyRet.addAll(((JoinBlockBodyContext)_localctx).b2.bodyRet);
				}
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
	public static class PipeStatementContext extends ParserRuleContext {
		public PipeStatement pipeRet;
		public ExpressionContext assignee;
		public ExpressionContext assigned;
		public ExpressionContext pipeExp;
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
		enterRule(_localctx, 46, RULE_pipeStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			((PipeStatementContext)_localctx).assignee = expression();
			((PipeStatementContext)_localctx).pipeRet =  new PipeStatement(((PipeStatementContext)_localctx).assignee.expRet.getFirst().getLine());
			     _localctx.pipeRet.setAssignee(((PipeStatementContext)_localctx).assignee.expRet);
			{
			setState(440);
			match(ASSIGN);
			setState(441);
			((PipeStatementContext)_localctx).assigned = expression();
			_localctx.pipeRet.setAssigned(((PipeStatementContext)_localctx).assigned.expRet);
			setState(447); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(443);
				match(PIPE_OP);
				setState(444);
				((PipeStatementContext)_localctx).pipeExp = expression();
				_localctx.pipeRet.addPipeExp(((PipeStatementContext)_localctx).pipeExp.expRet);
				}
				}
				setState(449); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE_OP );
			setState(451);
			match(SEMICOLON);
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
		public ArrayList<Statement> mainRet;
		public BodyContext b;
		public TerminalNode MAIN() { return getToken(SOACTParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
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
		enterRule(_localctx, 48, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(MAIN);
			setState(454);
			match(LPAR);
			setState(455);
			match(RPAR);
			setState(456);
			match(LBRACE);
			setState(457);
			((MainContext)_localctx).b = body();
			((MainContext)_localctx).mainRet =  ((MainContext)_localctx).b.bodyRet;
			setState(459);
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
		public ArrayList<Statement> bodyRet;
		public ForLoopContext f1;
		public WhileLoopContext w1;
		public IfBlockContext i1;
		public JoinBlockContext j1;
		public StatementsContext s1;
		public ForLoopContext f2;
		public WhileLoopContext w2;
		public IfBlockContext i2;
		public JoinBlockContext j2;
		public StatementsContext s2;
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
		enterRule(_localctx, 50, RULE_body);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((BodyContext)_localctx).bodyRet =  new ArrayList<>();
			{
			setState(479);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(477);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(462);
						((BodyContext)_localctx).f1 = forLoop();
						_localctx.bodyRet.add(((BodyContext)_localctx).f1.forRet);
						}
						break;
					case WHILE:
						{
						setState(465);
						((BodyContext)_localctx).w1 = whileLoop();
						_localctx.bodyRet.add(((BodyContext)_localctx).w1.whileRet);
						}
						break;
					case IF:
						{
						setState(468);
						((BodyContext)_localctx).i1 = ifBlock();
						_localctx.bodyRet.add(((BodyContext)_localctx).i1.ifRet);
						}
						break;
					case JOIN:
						{
						setState(471);
						((BodyContext)_localctx).j1 = joinBlock();
						_localctx.bodyRet.add(((BodyContext)_localctx).j1.joinRet);
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
						setState(474);
						((BodyContext)_localctx).s1 = statements();
						_localctx.bodyRet.add(((BodyContext)_localctx).s1.statementRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(481);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK || _la==CONTINUE) {
				{
				{
				setState(484);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					{
					setState(482);
					match(CONTINUE);
					}
					}
					break;
				case BREAK:
					{
					{
					setState(483);
					match(BREAK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(486);
				match(SEMICOLON);
				}
				setState(505);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(503);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case FOR:
							{
							setState(488);
							((BodyContext)_localctx).f2 = forLoop();
							_localctx.bodyRet.add(((BodyContext)_localctx).f2.forRet);
							}
							break;
						case WHILE:
							{
							setState(491);
							((BodyContext)_localctx).w2 = whileLoop();
							_localctx.bodyRet.add(((BodyContext)_localctx).w2.whileRet);
							}
							break;
						case IF:
							{
							setState(494);
							((BodyContext)_localctx).i2 = ifBlock();
							_localctx.bodyRet.add(((BodyContext)_localctx).i2.ifRet);
							}
							break;
						case JOIN:
							{
							setState(497);
							((BodyContext)_localctx).j2 = joinBlock();
							_localctx.bodyRet.add(((BodyContext)_localctx).j2.joinRet);
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
							setState(500);
							((BodyContext)_localctx).s2 = statements();
							_localctx.bodyRet.add(((BodyContext)_localctx).s2.statementRet);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(507);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				}
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
	public static class StatementsContext extends ParserRuleContext {
		public Statement statementRet;
		public InitStatementContext i;
		public AssignStatementContext a;
		public ExprStatementContext e;
		public ObserveStatementContext o;
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
		enterRule(_localctx, 52, RULE_statements);
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				((StatementsContext)_localctx).i = initStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).i.initRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				((StatementsContext)_localctx).a = assignStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).a.assignRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				((StatementsContext)_localctx).e = exprStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).e.expStatementRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				((StatementsContext)_localctx).o = observeStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).o.observeRet;
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
		public InitStatement initRet;
		public InitContext i;
		public Token assign;
		public ConstructorCallContext c;
		public InitRecordContext r;
		public ExpressionContext e;
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public ConstructorCallContext constructorCall() {
			return getRuleContext(ConstructorCallContext.class,0);
		}
		public InitRecordContext initRecord() {
			return getRuleContext(InitRecordContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 54, RULE_initStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			List<Expression> assigned = new ArrayList<>();
			{
			setState(525);
			((InitStatementContext)_localctx).i = init();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(526);
				((InitStatementContext)_localctx).assign = match(ASSIGN);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(527);
					((InitStatementContext)_localctx).c = constructorCall();
					assigned.add(((InitStatementContext)_localctx).c.constructRet);
					}
					break;
				case 2:
					{
					setState(530);
					((InitStatementContext)_localctx).r = initRecord();
					assigned.add(((InitStatementContext)_localctx).r.recordRet);
					}
					break;
				case 3:
					{
					setState(533);
					((InitStatementContext)_localctx).e = expression();
					assigned.addAll(((InitStatementContext)_localctx).e.expRet);
					}
					break;
				}
				}
			}

			((InitStatementContext)_localctx).initRet =  new InitStatement(((InitStatementContext)_localctx).i.varRet, assigned, ((InitStatementContext)_localctx).i.varRet.getLine());
			setState(541);
			match(SEMICOLON);
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
	public static class ConstructorCallContext extends ParserRuleContext {
		public ConstructorExpression constructRet;
		public Token def;
		public Token id;
		public ExpressionContext exp;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SOACTParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstructorCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterConstructorCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitConstructorCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitConstructorCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCallContext constructorCall() throws RecognitionException {
		ConstructorCallContext _localctx = new ConstructorCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_constructorCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			((ConstructorCallContext)_localctx).def = match(NEW);
			setState(544);
			((ConstructorCallContext)_localctx).id = match(IDENTIFIER);
			((ConstructorCallContext)_localctx).constructRet =  new ConstructorExpression(Identifier.createId((((ConstructorCallContext)_localctx).id!=null?((ConstructorCallContext)_localctx).id.getText():null) ,(((ConstructorCallContext)_localctx).id!=null?((ConstructorCallContext)_localctx).id.getLine():0)), (((ConstructorCallContext)_localctx).def!=null?((ConstructorCallContext)_localctx).def.getLine():0));
			setState(546);
			match(LPAR);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(547);
				((ConstructorCallContext)_localctx).exp = expression();
				_localctx.constructRet.setArgs(((ConstructorCallContext)_localctx).exp.expRet);
				}
			}

			setState(552);
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
	public static class InitRecordContext extends ParserRuleContext {
		public InitRecord recordRet;
		public Token name;
		public Token fi;
		public ExpressionContext fe;
		public Token lfi;
		public ExpressionContext lfe;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public List<TerminalNode> COLON() { return getTokens(SOACTParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SOACTParser.COLON, i);
		}
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
			setState(554);
			((InitRecordContext)_localctx).name = match(IDENTIFIER);
			((InitRecordContext)_localctx).recordRet =  new InitRecord(Identifier.createId((((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getText():null) ,(((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getLine():0)), (((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getLine():0));
			setState(556);
			match(LBRACE);
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(557);
					((InitRecordContext)_localctx).fi = match(IDENTIFIER);
					_localctx.recordRet.addFieldName(Identifier.createId((((InitRecordContext)_localctx).fi!=null?((InitRecordContext)_localctx).fi.getText():null) ,(((InitRecordContext)_localctx).fi!=null?((InitRecordContext)_localctx).fi.getLine():0)));
					setState(559);
					match(COLON);
					setState(560);
					((InitRecordContext)_localctx).fe = expression();
					_localctx.recordRet.addFieldValue(((InitRecordContext)_localctx).fe.expRet);
					setState(562);
					match(COMMA);
					}
					} 
				}
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(569);
			((InitRecordContext)_localctx).lfi = match(IDENTIFIER);
			_localctx.recordRet.addFieldName(Identifier.createId((((InitRecordContext)_localctx).lfi!=null?((InitRecordContext)_localctx).lfi.getText():null) ,(((InitRecordContext)_localctx).lfi!=null?((InitRecordContext)_localctx).lfi.getLine():0)));
			setState(571);
			match(COLON);
			setState(572);
			((InitRecordContext)_localctx).lfe = expression();
			_localctx.recordRet.addFieldValue(((InitRecordContext)_localctx).lfe.expRet);
			setState(574);
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
		public AssignmentStatement assignRet;
		public Token id;
		public Token SELF;
		public Token id2;
		public Token id3;
		public Token assign;
		public ExpressionContext exp;
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SELF() { return getToken(SOACTParser.SELF, 0); }
		public List<TerminalNode> DOT() { return getTokens(SOACTParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SOACTParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
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
			((AssignStatementContext)_localctx).assignRet =  new AssignmentStatement();
			{
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(577);
				((AssignStatementContext)_localctx).id = match(IDENTIFIER);
				_localctx.assignRet.setLine((((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getLine():0));
				                      _localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getText():null) ,(((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getLine():0)));
				}
				break;
			case SELF:
				{
				setState(579);
				((AssignStatementContext)_localctx).SELF = match(SELF);
				setState(580);
				match(DOT);
				setState(581);
				((AssignStatementContext)_localctx).id2 = match(IDENTIFIER);
				_localctx.assignRet.setLine((((AssignStatementContext)_localctx).SELF!=null?((AssignStatementContext)_localctx).SELF.getLine():0));
				                                                 _localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id2!=null?((AssignStatementContext)_localctx).id2.getText():null) ,(((AssignStatementContext)_localctx).id2!=null?((AssignStatementContext)_localctx).id2.getLine():0)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(585);
				match(DOT);
				setState(586);
				((AssignStatementContext)_localctx).id3 = match(IDENTIFIER);
				_localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id3!=null?((AssignStatementContext)_localctx).id3.getText():null) ,(((AssignStatementContext)_localctx).id3!=null?((AssignStatementContext)_localctx).id3.getLine():0)));
				}
				}
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(593);
				arrayIndex();
				}
			}

			setState(596);
			((AssignStatementContext)_localctx).assign = match(ASSIGN);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(597);
				match(NEW);
				}
			}

			setState(600);
			((AssignStatementContext)_localctx).exp = expression();
			_localctx.assignRet.setAssigned(((AssignStatementContext)_localctx).exp.expRet);
			setState(602);
			match(SEMICOLON);
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
	public static class ExprStatementContext extends ParserRuleContext {
		public ExpressionStatement expStatementRet;
		public ExpressionContext exp;
		public Token s;
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
			setState(604);
			((ExprStatementContext)_localctx).exp = expression();
			setState(605);
			((ExprStatementContext)_localctx).s = match(SEMICOLON);
			((ExprStatementContext)_localctx).expStatementRet =  new ExpressionStatement(((ExprStatementContext)_localctx).exp.expRet, (((ExprStatementContext)_localctx).s!=null?((ExprStatementContext)_localctx).s.getLine():0));
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
		public ObserveStatement observeRet;
		public Token id1;
		public Token s;
		public Token id;
		public ExpressionContext exp;
		public AccesslevelsContext a;
		public List<TerminalNode> LPAR() { return getTokens(SOACTParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(SOACTParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(SOACTParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(SOACTParser.RPAR, i);
		}
		public TerminalNode OBSERVERS() { return getToken(SOACTParser.OBSERVERS, 0); }
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
		}
		public AccesslevelsContext accesslevels() {
			return getRuleContext(AccesslevelsContext.class,0);
		}
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
			int line = -1;
			     ((ObserveStatementContext)_localctx).observeRet =  new ObserveStatement();
			{
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(613);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(609);
					((ObserveStatementContext)_localctx).id1 = match(IDENTIFIER);
					line = (((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getLine():0);
					                          _localctx.observeRet.addId(Identifier.createId((((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getText():null), (((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getLine():0)));
					}
					break;
				case SELF:
					{
					setState(611);
					((ObserveStatementContext)_localctx).s = match(SELF);
					line = (((ObserveStatementContext)_localctx).s!=null?((ObserveStatementContext)_localctx).s.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(615);
				match(DOT);
				}
				break;
			}
			setState(618);
			((ObserveStatementContext)_localctx).id = match(IDENTIFIER);
			if(line == -1)
			                         line = (((ObserveStatementContext)_localctx).id!=null?((ObserveStatementContext)_localctx).id.getLine():0);
			                     _localctx.observeRet.setLine(line);
			                     _localctx.observeRet.addId(Identifier.createId((((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getText():null), (((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getLine():0)));
			setState(620);
			match(LPAR);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(621);
				((ObserveStatementContext)_localctx).exp = expression();
				_localctx.observeRet.setArgs(((ObserveStatementContext)_localctx).exp.expRet);
				}
			}

			setState(626);
			match(RPAR);
			setState(627);
			match(OBSERVERS);
			setState(628);
			match(LPAR);
			setState(629);
			((ObserveStatementContext)_localctx).a = accesslevels();
			_localctx.observeRet.setObservers(((ObserveStatementContext)_localctx).a.accessLevelsRet);
			setState(631);
			match(RPAR);
			setState(632);
			match(SEMICOLON);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ArrayList<Expression> expRet;
		public ExpCommaContext e1;
		public ExpCommaContext e2;
		public ExpressionContext es;
		public TerminalNode COMMA() { return getToken(SOACTParser.COMMA, 0); }
		public ExpCommaContext expComma() {
			return getRuleContext(ExpCommaContext.class,0);
		}
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
		enterRule(_localctx, 66, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressionContext)_localctx).expRet =  new ArrayList<>();
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(635);
				((ExpressionContext)_localctx).e1 = expComma();
				 _localctx.expRet.add(((ExpressionContext)_localctx).e1.expRet); 
				}
				break;
			case 2:
				{
				setState(638);
				((ExpressionContext)_localctx).e2 = expComma();
				 _localctx.expRet.add(((ExpressionContext)_localctx).e2.expRet); 
				setState(640);
				match(COMMA);
				setState(641);
				((ExpressionContext)_localctx).es = expression();
				 _localctx.expRet.addAll(((ExpressionContext)_localctx).es.expRet); 
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
	public static class ExpCommaContext extends ParserRuleContext {
		public Expression expRet;
		public ExpOrContext e1;
		public ExpOrContext e2;
		public ExpCommaContext es;
		public ExpOrContext expOr() {
			return getRuleContext(ExpOrContext.class,0);
		}
		public TerminalNode OR() { return getToken(SOACTParser.OR, 0); }
		public ExpCommaContext expComma() {
			return getRuleContext(ExpCommaContext.class,0);
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
		enterRule(_localctx, 68, RULE_expComma);
		try {
			setState(655);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				((ExpCommaContext)_localctx).e1 = expOr();
				 ((ExpCommaContext)_localctx).expRet =  ((ExpCommaContext)_localctx).e1.expRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				((ExpCommaContext)_localctx).e2 = expOr();
				setState(650);
				match(OR);
				BinaryOperator op = BinaryOperator.OR;
				setState(652);
				((ExpCommaContext)_localctx).es = expComma();
				 ((ExpCommaContext)_localctx).expRet =  new BinaryExpression(((ExpCommaContext)_localctx).e2.expRet, ((ExpCommaContext)_localctx).es.expRet, op); 
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
		public Expression expRet;
		public ExpAndContext e1;
		public ExpAndContext e2;
		public ExpOrContext es;
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
		enterRule(_localctx, 70, RULE_expOr);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657);
				((ExpOrContext)_localctx).e1 = expAnd();
				 ((ExpOrContext)_localctx).expRet =  ((ExpOrContext)_localctx).e1.expRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				((ExpOrContext)_localctx).e2 = expAnd();
				setState(661);
				match(AND);
				BinaryOperator op = BinaryOperator.AND;
				setState(663);
				((ExpOrContext)_localctx).es = expOr();
				 ((ExpOrContext)_localctx).expRet =  new BinaryExpression(((ExpOrContext)_localctx).e2.expRet, ((ExpOrContext)_localctx).es.expRet, op); 
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
		public Expression expRet;
		public ExpEqualsContext e1;
		public ExpAndPrimContext es;
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
		enterRule(_localctx, 72, RULE_expAnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			((ExpAndContext)_localctx).e1 = expEquals();
			setState(669);
			((ExpAndContext)_localctx).es = expAndPrim();

			        if(((ExpAndContext)_localctx).es.op == null)
			            ((ExpAndContext)_localctx).expRet =  ((ExpAndContext)_localctx).e1.expRet;
			        else
			            ((ExpAndContext)_localctx).expRet =  new BinaryExpression(((ExpAndContext)_localctx).e1.expRet, ((ExpAndContext)_localctx).es.expRet, ((ExpAndContext)_localctx).es.op);
			    
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
		public BinaryOperator op;
		public Expression expRet;
		public ExpAndContext e2;
		public ExpAndContext expAnd() {
			return getRuleContext(ExpAndContext.class,0);
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
		enterRule(_localctx, 74, RULE_expAndPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpAndPrimContext)_localctx).op =  null;
			     ((ExpAndPrimContext)_localctx).expRet =  null;
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL || _la==NOT_EQUAL) {
				{
				setState(677);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT_EQUAL:
					{
					setState(673);
					match(NOT_EQUAL);
					((ExpAndPrimContext)_localctx).op =  BinaryOperator.NEQ;
					}
					break;
				case EQUAL:
					{
					setState(675);
					match(EQUAL);
					((ExpAndPrimContext)_localctx).op =  BinaryOperator.EQ;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(679);
				((ExpAndPrimContext)_localctx).e2 = expAnd();
				((ExpAndPrimContext)_localctx).expRet =  ((ExpAndPrimContext)_localctx).e2.expRet;
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
		public Expression expRet;
		public ExpCompareContext e1;
		public ExpEqualsPrimContext es;
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
		enterRule(_localctx, 76, RULE_expEquals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			((ExpEqualsContext)_localctx).e1 = expCompare();
			setState(685);
			((ExpEqualsContext)_localctx).es = expEqualsPrim();

			        if(((ExpEqualsContext)_localctx).es.op == null)
			            ((ExpEqualsContext)_localctx).expRet =  ((ExpEqualsContext)_localctx).e1.expRet;
			        else
			            ((ExpEqualsContext)_localctx).expRet =  new BinaryExpression(((ExpEqualsContext)_localctx).e1.expRet, ((ExpEqualsContext)_localctx).es.expRet, ((ExpEqualsContext)_localctx).es.op);
			    
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
		public BinaryOperator op;
		public Expression expRet;
		public ExpEqualsContext e2;
		public ExpEqualsContext expEquals() {
			return getRuleContext(ExpEqualsContext.class,0);
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
		enterRule(_localctx, 78, RULE_expEqualsPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpEqualsPrimContext)_localctx).op =  null;
			     ((ExpEqualsPrimContext)_localctx).expRet =  null;
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				setState(693);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LESS_THAN:
					{
					setState(689);
					match(LESS_THAN);
					((ExpEqualsPrimContext)_localctx).op =  BinaryOperator.LT;
					}
					break;
				case GREATER_THAN:
					{
					setState(691);
					match(GREATER_THAN);
					((ExpEqualsPrimContext)_localctx).op =  BinaryOperator.GT;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(695);
				((ExpEqualsPrimContext)_localctx).e2 = expEquals();
				((ExpEqualsPrimContext)_localctx).expRet =  ((ExpEqualsPrimContext)_localctx).e2.expRet;
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
		public Expression expRet;
		public ExpPlusMinusContext e1;
		public ExpComparePrimContext es;
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
		enterRule(_localctx, 80, RULE_expCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			((ExpCompareContext)_localctx).e1 = expPlusMinus();
			setState(701);
			((ExpCompareContext)_localctx).es = expComparePrim();

			        if(((ExpCompareContext)_localctx).es.op == null)
			            ((ExpCompareContext)_localctx).expRet =  ((ExpCompareContext)_localctx).e1.expRet;
			        else
			            ((ExpCompareContext)_localctx).expRet =  new BinaryExpression(((ExpCompareContext)_localctx).e1.expRet, ((ExpCompareContext)_localctx).es.expRet, ((ExpCompareContext)_localctx).es.op);
			    
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
		public BinaryOperator op;
		public Expression expRet;
		public ExpCompareContext e2;
		public ExpCompareContext expCompare() {
			return getRuleContext(ExpCompareContext.class,0);
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
		enterRule(_localctx, 82, RULE_expComparePrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpComparePrimContext)_localctx).op =  null;
			     ((ExpComparePrimContext)_localctx).expRet =  null;
			setState(714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(709);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(705);
					match(PLUS);
					((ExpComparePrimContext)_localctx).op =  BinaryOperator.PLUS;
					}
					break;
				case MINUS:
					{
					setState(707);
					match(MINUS);
					((ExpComparePrimContext)_localctx).op =  BinaryOperator.MINUS;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(711);
				((ExpComparePrimContext)_localctx).e2 = expCompare();
				((ExpComparePrimContext)_localctx).expRet =  ((ExpComparePrimContext)_localctx).e2.expRet;
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
		public Expression expRet;
		public ExpDivideMultModContext e1;
		public ExpPlusMinusPrimContext es;
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
		enterRule(_localctx, 84, RULE_expPlusMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			((ExpPlusMinusContext)_localctx).e1 = expDivideMultMod();
			setState(717);
			((ExpPlusMinusContext)_localctx).es = expPlusMinusPrim();

			        if(((ExpPlusMinusContext)_localctx).es.op == null)
			            ((ExpPlusMinusContext)_localctx).expRet =  ((ExpPlusMinusContext)_localctx).e1.expRet;
			        else
			            ((ExpPlusMinusContext)_localctx).expRet =  new BinaryExpression(((ExpPlusMinusContext)_localctx).e1.expRet, ((ExpPlusMinusContext)_localctx).es.expRet, ((ExpPlusMinusContext)_localctx).es.op);
			    
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
		public BinaryOperator op;
		public Expression expRet;
		public ExpPlusMinusContext e2;
		public ExpPlusMinusContext expPlusMinus() {
			return getRuleContext(ExpPlusMinusContext.class,0);
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
		enterRule(_localctx, 86, RULE_expPlusMinusPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpPlusMinusPrimContext)_localctx).op =  null;
			     ((ExpPlusMinusPrimContext)_localctx).expRet =  null;
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) {
				{
				setState(727);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIVIDE:
					{
					setState(721);
					match(DIVIDE);
					((ExpPlusMinusPrimContext)_localctx).op =  BinaryOperator.DIV;
					}
					break;
				case MULT:
					{
					setState(723);
					match(MULT);
					((ExpPlusMinusPrimContext)_localctx).op =  BinaryOperator.MULT;
					}
					break;
				case MOD:
					{
					setState(725);
					match(MOD);
					((ExpPlusMinusPrimContext)_localctx).op =  BinaryOperator.MOD;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(729);
				((ExpPlusMinusPrimContext)_localctx).e2 = expPlusMinus();
				((ExpPlusMinusPrimContext)_localctx).expRet =  ((ExpPlusMinusPrimContext)_localctx).e2.expRet;
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
		public Expression expRet;
		public ExpPreUnaryContext e1;
		public ExpDivideMultModContext e2;
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
		enterRule(_localctx, 88, RULE_expDivideMultMod);
		try {
			setState(751);
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
				setState(734);
				((ExpDivideMultModContext)_localctx).e1 = expPreUnary();
				 ((ExpDivideMultModContext)_localctx).expRet =  ((ExpDivideMultModContext)_localctx).e1.expRet; 
				}
				break;
			case MINUS:
			case NOT:
			case INCREMENT:
			case DECREMENT:
				enterOuterAlt(_localctx, 2);
				{
				UnaryOperator op = null;
				setState(746);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(738);
					match(MINUS);
					op = UnaryOperator.MINUS;
					}
					break;
				case NOT:
					{
					setState(740);
					match(NOT);
					op = UnaryOperator.NOT;
					}
					break;
				case DECREMENT:
					{
					setState(742);
					match(DECREMENT);
					op = UnaryOperator.DEC;
					}
					break;
				case INCREMENT:
					{
					setState(744);
					match(INCREMENT);
					op = UnaryOperator.INC;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(748);
				((ExpDivideMultModContext)_localctx).e2 = expDivideMultMod();
				 ((ExpDivideMultModContext)_localctx).expRet =  new UnaryExpression(op, UnarySide.PREFIX, ((ExpDivideMultModContext)_localctx).e2.expRet); 
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
		public Expression expRet;
		public ExpPostUnaryContext e1;
		public ExpPreUnaryPrimContext es;
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
		enterRule(_localctx, 90, RULE_expPreUnary);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			((ExpPreUnaryContext)_localctx).e1 = expPostUnary();
			setState(754);
			((ExpPreUnaryContext)_localctx).es = expPreUnaryPrim();

			        if(((ExpPreUnaryContext)_localctx).es.op == null)
			            ((ExpPreUnaryContext)_localctx).expRet =  ((ExpPreUnaryContext)_localctx).e1.expRet;
			        else
			            ((ExpPreUnaryContext)_localctx).expRet =  new UnaryExpression(((ExpPreUnaryContext)_localctx).es.op, UnarySide.POSTFIX, ((ExpPreUnaryContext)_localctx).e1.expRet);
			    
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
		public UnaryOperator op;
		public Expression expRet;
		public ExpPreUnaryPrimContext e2;
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
		enterRule(_localctx, 92, RULE_expPreUnaryPrim);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpPreUnaryPrimContext)_localctx).op =  null;
			     ((ExpPreUnaryPrimContext)_localctx).expRet =  null;
			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT || _la==DECREMENT) {
				{
				setState(762);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INCREMENT:
					{
					setState(758);
					match(INCREMENT);
					((ExpPreUnaryPrimContext)_localctx).op =  UnaryOperator.INC;
					}
					break;
				case DECREMENT:
					{
					setState(760);
					match(DECREMENT);
					((ExpPreUnaryPrimContext)_localctx).op =  UnaryOperator.DEC;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(764);
				((ExpPreUnaryPrimContext)_localctx).e2 = expPreUnaryPrim();
				((ExpPreUnaryPrimContext)_localctx).expRet =  ((ExpPreUnaryPrimContext)_localctx).e2.expRet;
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
		public Expression expRet;
		public ExpBracketContext e1;
		public ExpCommaContext e2;
		public ExpBracketContext expBracket() {
			return getRuleContext(ExpBracketContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public ExpCommaContext expComma() {
			return getRuleContext(ExpCommaContext.class,0);
		}
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
		enterRule(_localctx, 94, RULE_expPostUnary);
		try {
			setState(777);
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
				setState(769);
				((ExpPostUnaryContext)_localctx).e1 = expBracket();
				 ((ExpPostUnaryContext)_localctx).expRet =  ((ExpPostUnaryContext)_localctx).e1.expRet; 
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				match(LBRACK);
				setState(773);
				((ExpPostUnaryContext)_localctx).e2 = expComma();
				setState(774);
				match(RBRACK);
				 ((ExpPostUnaryContext)_localctx).expRet =  ((ExpPostUnaryContext)_localctx).e2.expRet; 
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
		public Expression expRet;
		public ExpAccessContext e1;
		public ExpBracketContext e2;
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
		enterRule(_localctx, 96, RULE_expBracket);
		try {
			setState(787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				((ExpBracketContext)_localctx).e1 = expAccess();
				 ((ExpBracketContext)_localctx).expRet =  ((ExpBracketContext)_localctx).e1.expRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				((ExpBracketContext)_localctx).e1 = expAccess();
				setState(783);
				match(DOT);
				setState(784);
				((ExpBracketContext)_localctx).e2 = expBracket();
				 ((ExpBracketContext)_localctx).expRet =  new DotExpression(((ExpBracketContext)_localctx).e1.expRet, ((ExpBracketContext)_localctx).e2.expRet);
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
		public Expression expRet;
		public ExpParContext e1;
		public ExpCommaContext e2;
		public ExpParContext expPar() {
			return getRuleContext(ExpParContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public ExpCommaContext expComma() {
			return getRuleContext(ExpCommaContext.class,0);
		}
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
		enterRule(_localctx, 98, RULE_expAccess);
		try {
			setState(797);
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
				setState(789);
				((ExpAccessContext)_localctx).e1 = expPar();
				 ((ExpAccessContext)_localctx).expRet =  ((ExpAccessContext)_localctx).e1.expRet; 
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				match(LPAR);
				setState(793);
				((ExpAccessContext)_localctx).e2 = expComma();
				setState(794);
				match(RPAR);
				 ((ExpAccessContext)_localctx).expRet =  ((ExpAccessContext)_localctx).e2.expRet; 
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
		public Expression expRet;
		public PrimitivesValsContext e1;
		public HandlerCallContext e2;
		public CustomPrimAccessContext e3;
		public Token e4;
		public Token e5;
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
		enterRule(_localctx, 100, RULE_expPar);
		try {
			setState(812);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799);
				((ExpParContext)_localctx).e1 = primitivesVals();
				 ((ExpParContext)_localctx).expRet =  ((ExpParContext)_localctx).e1.expRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				((ExpParContext)_localctx).e2 = handlerCall();
				 ((ExpParContext)_localctx).expRet =  ((ExpParContext)_localctx).e2.expRet; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(805);
				((ExpParContext)_localctx).e3 = customPrimAccess();
				 ((ExpParContext)_localctx).expRet =  ((ExpParContext)_localctx).e3.expRet; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(808);
				((ExpParContext)_localctx).e4 = match(IDENTIFIER);
				 ((ExpParContext)_localctx).expRet =  Identifier.createId((((ExpParContext)_localctx).e4!=null?((ExpParContext)_localctx).e4.getText():null), (((ExpParContext)_localctx).e4!=null?((ExpParContext)_localctx).e4.getLine():0)); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(810);
				((ExpParContext)_localctx).e5 = match(SELF);
				 ((ExpParContext)_localctx).expRet =  Identifier.createId((((ExpParContext)_localctx).e5!=null?((ExpParContext)_localctx).e5.getText():null), (((ExpParContext)_localctx).e5!=null?((ExpParContext)_localctx).e5.getLine():0)); 
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
		public Expression expRet;
		public Token id1;
		public Token id2;
		public List<TerminalNode> COLON() { return getTokens(SOACTParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SOACTParser.COLON, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SOACTParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SOACTParser.IDENTIFIER, i);
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
		enterRule(_localctx, 102, RULE_customPrimAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			((CustomPrimAccessContext)_localctx).id1 = match(IDENTIFIER);
			setState(815);
			match(COLON);
			setState(816);
			match(COLON);
			setState(817);
			((CustomPrimAccessContext)_localctx).id2 = match(IDENTIFIER);

			        ((CustomPrimAccessContext)_localctx).expRet =  new CustomPrimitiveAccess(Identifier.createId((((CustomPrimAccessContext)_localctx).id1!=null?((CustomPrimAccessContext)_localctx).id1.getText():null), (((CustomPrimAccessContext)_localctx).id1!=null?((CustomPrimAccessContext)_localctx).id1.getLine():0)), Identifier.createId((((CustomPrimAccessContext)_localctx).id2!=null?((CustomPrimAccessContext)_localctx).id2.getText():null), (((CustomPrimAccessContext)_localctx).id2!=null?((CustomPrimAccessContext)_localctx).id2.getLine():0)));
			    
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
		public Expression expRet;
		public Token n1;
		public Token n2;
		public Token n3;
		public Token n4;
		public Token n5;
		public Token n6;
		public Token n7;
		public Token n8;
		public Token n9;
		public ExpressionContext expression;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
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
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 104, RULE_handlerCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			String type = "";
			     Integer line = -1;
			     boolean isBuiltIn = true;
			     List<Expression> args = new ArrayList<>();
			{
			setState(839);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				{
				setState(821);
				((HandlerCallContext)_localctx).n1 = match(PRINT);
				type = (((HandlerCallContext)_localctx).n1!=null?((HandlerCallContext)_localctx).n1.getText():null); line = ((HandlerCallContext)_localctx).n1.getLine();
				}
				}
				break;
			case TOLOWER:
				{
				{
				setState(823);
				((HandlerCallContext)_localctx).n2 = match(TOLOWER);
				type = (((HandlerCallContext)_localctx).n2!=null?((HandlerCallContext)_localctx).n2.getText():null); line = ((HandlerCallContext)_localctx).n2.getLine();
				}
				}
				break;
			case TOUPPER:
				{
				{
				setState(825);
				((HandlerCallContext)_localctx).n3 = match(TOUPPER);
				type = (((HandlerCallContext)_localctx).n3!=null?((HandlerCallContext)_localctx).n3.getText():null); line = ((HandlerCallContext)_localctx).n3.getLine();
				}
				}
				break;
			case REVERSE:
				{
				{
				setState(827);
				((HandlerCallContext)_localctx).n4 = match(REVERSE);
				type = (((HandlerCallContext)_localctx).n4!=null?((HandlerCallContext)_localctx).n4.getText():null); line = ((HandlerCallContext)_localctx).n4.getLine();
				}
				}
				break;
			case ADD:
				{
				{
				setState(829);
				((HandlerCallContext)_localctx).n5 = match(ADD);
				type = (((HandlerCallContext)_localctx).n5!=null?((HandlerCallContext)_localctx).n5.getText():null); line = ((HandlerCallContext)_localctx).n5.getLine();
				}
				}
				break;
			case INCLUDE:
				{
				{
				setState(831);
				((HandlerCallContext)_localctx).n6 = match(INCLUDE);
				type = (((HandlerCallContext)_localctx).n6!=null?((HandlerCallContext)_localctx).n6.getText():null); line = ((HandlerCallContext)_localctx).n6.getLine();
				}
				}
				break;
			case REMOVE:
				{
				{
				setState(833);
				((HandlerCallContext)_localctx).n7 = match(REMOVE);
				type = (((HandlerCallContext)_localctx).n7!=null?((HandlerCallContext)_localctx).n7.getText():null); line = ((HandlerCallContext)_localctx).n7.getLine();
				}
				}
				break;
			case LENGTH:
				{
				{
				setState(835);
				((HandlerCallContext)_localctx).n8 = match(LENGTH);
				type = (((HandlerCallContext)_localctx).n8!=null?((HandlerCallContext)_localctx).n8.getText():null); line = ((HandlerCallContext)_localctx).n8.getLine();
				}
				}
				break;
			case IDENTIFIER:
				{
				{
				setState(837);
				((HandlerCallContext)_localctx).n9 = match(IDENTIFIER);
				type = (((HandlerCallContext)_localctx).n9!=null?((HandlerCallContext)_localctx).n9.getText():null); line = ((HandlerCallContext)_localctx).n9.getLine(); isBuiltIn = false;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(841);
			match(LPAR);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(842);
				((HandlerCallContext)_localctx).expression = expression();
				 args.addAll(((HandlerCallContext)_localctx).expression.expRet); 
				}
			}

			setState(847);
			match(RPAR);
			((HandlerCallContext)_localctx).expRet =  new FunctionCall(type, args, isBuiltIn , line);
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
	public static class PrimitivesValsContext extends ParserRuleContext {
		public Expression expRet;
		public Token e1;
		public Token e2;
		public Token e3;
		public Token e4;
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
		enterRule(_localctx, 106, RULE_primitivesVals);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				((PrimitivesValsContext)_localctx).e1 = match(INT_VALUE);
				 ((PrimitivesValsContext)_localctx).expRet =  new IntValue(Integer.parseInt((((PrimitivesValsContext)_localctx).e1!=null?((PrimitivesValsContext)_localctx).e1.getText():null))); _localctx.expRet.setLine(((PrimitivesValsContext)_localctx).e1.getLine()); 
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				((PrimitivesValsContext)_localctx).e2 = match(STRING_VALUE);
				 ((PrimitivesValsContext)_localctx).expRet =  new StringValue((((PrimitivesValsContext)_localctx).e2!=null?((PrimitivesValsContext)_localctx).e2.getText():null)); _localctx.expRet.setLine(((PrimitivesValsContext)_localctx).e2.getLine()); 
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(854);
				((PrimitivesValsContext)_localctx).e3 = match(TRUE);
				 ((PrimitivesValsContext)_localctx).expRet =  new BooleanValue(true); _localctx.expRet.setLine(((PrimitivesValsContext)_localctx).e3.getLine()); 
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(856);
				((PrimitivesValsContext)_localctx).e4 = match(FALSE);
				 ((PrimitivesValsContext)_localctx).expRet =  new BooleanValue(false); _localctx.expRet.setLine(((PrimitivesValsContext)_localctx).e4.getLine()); 
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

	public static final String _serializedATN =
		"\u0004\u0001G\u035d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"t\b\u0000\n\u0000\f\u0000w\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001\u0084\b\u0001\u000b\u0001\f\u0001"+
		"\u0085\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0091\b\u0002\n"+
		"\u0002\f\u0002\u0094\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u0099\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009e"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00a3\b\u0002"+
		"\n\u0002\f\u0002\u00a6\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u00b1\b\u0003\n\u0003\f\u0003\u00b4\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00c4\b\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u00c8\b"+
		"\u0004\n\u0004\f\u0004\u00cb\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d3\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00dd\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00ee\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f4"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0102\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u010f"+
		"\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u0114\b\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0003\n\u011c\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u012b\b\u000b\n\u000b\f\u000b"+
		"\u012e\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u0138\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0151"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0164\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u016f"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0176\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0199"+
		"\b\u0014\n\u0014\f\u0014\u019c\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01a4\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u01b5\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0004\u0017\u01c0\b\u0017\u000b\u0017\f\u0017\u01c1\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u01de\b\u0019\n\u0019\f\u0019\u01e1\t\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u01e5\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01f8\b\u0019\n\u0019"+
		"\f\u0019\u01fb\t\u0019\u0003\u0019\u01fd\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u020b\b\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0219\b\u001b\u0003\u001b\u021b\b\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0227\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0235"+
		"\b\u001d\n\u001d\f\u001d\u0238\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0248\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u024d\b"+
		"\u001e\n\u001e\f\u001e\u0250\t\u001e\u0001\u001e\u0003\u001e\u0253\b\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u0257\b\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0266\b \u0001 \u0003 \u0269"+
		"\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0271\b \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0285\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0290"+
		"\b\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u029b\b#\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u02a6\b%\u0001%\u0001%\u0001%\u0003%\u02ab\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u02b6\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u02bb\b\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0003)\u02c6\b)\u0001)\u0001)\u0001)\u0003"+
		")\u02cb\b)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0003+\u02d8\b+\u0001+\u0001+\u0001+\u0003+\u02dd\b+\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u02eb\b,\u0001,\u0001,\u0001,\u0003,\u02f0\b,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u02fb\b.\u0001"+
		".\u0001.\u0001.\u0003.\u0300\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0003/\u030a\b/\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00030\u0314\b0\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00031\u031e\b1\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u032d\b2\u0001"+
		"3\u00013\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00034\u0348\b4\u00014\u00014\u00014\u0001"+
		"4\u00034\u034e\b4\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00035\u035b\b5\u00015\u0000\u00006\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\u0000\u0388\u0000l\u0001"+
		"\u0000\u0000\u0000\u0002{\u0001\u0000\u0000\u0000\u0004\u0089\u0001\u0000"+
		"\u0000\u0000\u0006\u00a9\u0001\u0000\u0000\u0000\b\u00b9\u0001\u0000\u0000"+
		"\u0000\n\u00dc\u0001\u0000\u0000\u0000\f\u00de\u0001\u0000\u0000\u0000"+
		"\u000e\u00ed\u0001\u0000\u0000\u0000\u0010\u00f3\u0001\u0000\u0000\u0000"+
		"\u0012\u00fa\u0001\u0000\u0000\u0000\u0014\u0109\u0001\u0000\u0000\u0000"+
		"\u0016\u0123\u0001\u0000\u0000\u0000\u0018\u012f\u0001\u0000\u0000\u0000"+
		"\u001a\u0134\u0001\u0000\u0000\u0000\u001c\u0141\u0001\u0000\u0000\u0000"+
		"\u001e\u0148\u0001\u0000\u0000\u0000 \u0152\u0001\u0000\u0000\u0000\""+
		"\u0159\u0001\u0000\u0000\u0000$\u0167\u0001\u0000\u0000\u0000&\u0179\u0001"+
		"\u0000\u0000\u0000(\u0183\u0001\u0000\u0000\u0000*\u01a5\u0001\u0000\u0000"+
		"\u0000,\u01ac\u0001\u0000\u0000\u0000.\u01b6\u0001\u0000\u0000\u00000"+
		"\u01c5\u0001\u0000\u0000\u00002\u01cd\u0001\u0000\u0000\u00004\u020a\u0001"+
		"\u0000\u0000\u00006\u020c\u0001\u0000\u0000\u00008\u021f\u0001\u0000\u0000"+
		"\u0000:\u022a\u0001\u0000\u0000\u0000<\u0240\u0001\u0000\u0000\u0000>"+
		"\u025c\u0001\u0000\u0000\u0000@\u0260\u0001\u0000\u0000\u0000B\u027a\u0001"+
		"\u0000\u0000\u0000D\u028f\u0001\u0000\u0000\u0000F\u029a\u0001\u0000\u0000"+
		"\u0000H\u029c\u0001\u0000\u0000\u0000J\u02a0\u0001\u0000\u0000\u0000L"+
		"\u02ac\u0001\u0000\u0000\u0000N\u02b0\u0001\u0000\u0000\u0000P\u02bc\u0001"+
		"\u0000\u0000\u0000R\u02c0\u0001\u0000\u0000\u0000T\u02cc\u0001\u0000\u0000"+
		"\u0000V\u02d0\u0001\u0000\u0000\u0000X\u02ef\u0001\u0000\u0000\u0000Z"+
		"\u02f1\u0001\u0000\u0000\u0000\\\u02f5\u0001\u0000\u0000\u0000^\u0309"+
		"\u0001\u0000\u0000\u0000`\u0313\u0001\u0000\u0000\u0000b\u031d\u0001\u0000"+
		"\u0000\u0000d\u032c\u0001\u0000\u0000\u0000f\u032e\u0001\u0000\u0000\u0000"+
		"h\u0334\u0001\u0000\u0000\u0000j\u035a\u0001\u0000\u0000\u0000lu\u0006"+
		"\u0000\uffff\uffff\u0000mn\u0003\u0004\u0002\u0000no\u0006\u0000\uffff"+
		"\uffff\u0000ot\u0001\u0000\u0000\u0000pq\u0003\u0002\u0001\u0000qr\u0006"+
		"\u0000\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000sm\u0001\u0000\u0000"+
		"\u0000sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000xy\u00030\u0018\u0000yz\u0006\u0000\uffff\uffff\u0000"+
		"z\u0001\u0001\u0000\u0000\u0000{|\u0005\'\u0000\u0000|}\u0005D\u0000\u0000"+
		"}~\u0006\u0001\uffff\uffff\u0000~\u0083\u0005=\u0000\u0000\u007f\u0080"+
		"\u0003\n\u0005\u0000\u0080\u0081\u0006\u0001\uffff\uffff\u0000\u0081\u0082"+
		"\u0005A\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083\u007f\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005>\u0000\u0000\u0088\u0003\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u0001\u0000\u0000\u008a\u008b\u0005D\u0000"+
		"\u0000\u008b\u008c\u0006\u0002\uffff\uffff\u0000\u008c\u0092\u0005=\u0000"+
		"\u0000\u008d\u008e\u0003\u0006\u0003\u0000\u008e\u008f\u0006\u0002\uffff"+
		"\uffff\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0098\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0003\b\u0004"+
		"\u0000\u0096\u0097\u0006\u0002\uffff\uffff\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009b\u0003\u0012"+
		"\t\u0000\u009b\u009c\u0006\u0002\uffff\uffff\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a4\u0001\u0000\u0000\u0000\u009f\u00a0\u0003\u0014"+
		"\n\u0000\u00a0\u00a1\u0006\u0002\uffff\uffff\u0000\u00a1\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005>\u0000\u0000\u00a8\u0005\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005%\u0000\u0000\u00aa\u00ab\u0005D\u0000\u0000\u00ab"+
		"\u00ac\u0006\u0003\uffff\uffff\u0000\u00ac\u00b2\u0005=\u0000\u0000\u00ad"+
		"\u00ae\u0005D\u0000\u0000\u00ae\u00af\u0006\u0003\uffff\uffff\u0000\u00af"+
		"\u00b1\u0005?\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005D\u0000\u0000\u00b6\u00b7\u0006"+
		"\u0003\uffff\uffff\u0000\u00b7\u00b8\u0005>\u0000\u0000\u00b8\u0007\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0006\u0004\uffff\uffff\u0000\u00ba\u00bb"+
		"\u0005\u001c\u0000\u0000\u00bb\u00c9\u0005=\u0000\u0000\u00bc\u00bd\u0003"+
		"\n\u0005\u0000\u00bd\u00c3\u0006\u0004\uffff\uffff\u0000\u00be\u00bf\u0005"+
		"9\u0000\u0000\u00bf\u00c0\u0003\u001a\r\u0000\u00c0\u00c1\u0006\u0004"+
		"\uffff\uffff\u0000\u00c1\u00c2\u0005:\u0000\u0000\u00c2\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c3\u00be\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005A\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00bc\u0001\u0000\u0000"+
		"\u0000\u00c8\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005>\u0000\u0000"+
		"\u00cd\t\u0001\u0000\u0000\u0000\u00ce\u00cf\u0003\u000e\u0007\u0000\u00cf"+
		"\u00d0\u0005D\u0000\u0000\u00d0\u00d2\u0006\u0005\uffff\uffff\u0000\u00d1"+
		"\u00d3\u0003\f\u0006\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d3\u00dd\u0001\u0000\u0000\u0000\u00d4\u00d5"+
		"\u0003\u0018\f\u0000\u00d5\u00d6\u0005D\u0000\u0000\u00d6\u00d7\u0006"+
		"\u0005\uffff\uffff\u0000\u00d7\u00dd\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0003\u0010\b\u0000\u00d9\u00da\u0005D\u0000\u0000\u00da\u00db\u0006"+
		"\u0005\uffff\uffff\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00dc\u00d4\u0001\u0000\u0000\u0000\u00dc\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dd\u000b\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005;\u0000\u0000\u00df\u00e0\u0005C\u0000\u0000\u00e0\u00e1\u0006\u0006"+
		"\uffff\uffff\u0000\u00e1\u00e2\u0005<\u0000\u0000\u00e2\r\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005\u0002\u0000\u0000\u00e4\u00ee\u0006\u0007"+
		"\uffff\uffff\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00ee\u0006"+
		"\u0007\uffff\uffff\u0000\u00e7\u00e8\u0005\u000f\u0000\u0000\u00e8\u00ee"+
		"\u0006\u0007\uffff\uffff\u0000\u00e9\u00ea\u0005$\u0000\u0000\u00ea\u00ee"+
		"\u0006\u0007\uffff\uffff\u0000\u00eb\u00ec\u0005D\u0000\u0000\u00ec\u00ee"+
		"\u0006\u0007\uffff\uffff\u0000\u00ed\u00e3\u0001\u0000\u0000\u0000\u00ed"+
		"\u00e5\u0001\u0000\u0000\u0000\u00ed\u00e7\u0001\u0000\u0000\u0000\u00ed"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee"+
		"\u000f\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u001a\u0000\u0000\u00f0"+
		"\u00f4\u0006\b\uffff\uffff\u0000\u00f1\u00f2\u0005\u001b\u0000\u0000\u00f2"+
		"\u00f4\u0006\b\uffff\uffff\u0000\u00f3\u00ef\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u00051\u0000\u0000\u00f6\u00f7\u0003\u000e\u0007\u0000\u00f7\u00f8"+
		"\u00050\u0000\u0000\u00f8\u00f9\u0006\b\uffff\uffff\u0000\u00f9\u0011"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0006\t\uffff\uffff\u0000\u00fb\u00fc"+
		"\u0005D\u0000\u0000\u00fc\u00fd\u0006\t\uffff\uffff\u0000\u00fd\u0101"+
		"\u00059\u0000\u0000\u00fe\u00ff\u0003\u0016\u000b\u0000\u00ff\u0100\u0006"+
		"\t\uffff\uffff\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005:\u0000\u0000\u0104\u0105\u0005=\u0000"+
		"\u0000\u0105\u0106\u00032\u0019\u0000\u0106\u0107\u0006\t\uffff\uffff"+
		"\u0000\u0107\u0108\u0005>\u0000\u0000\u0108\u0013\u0001\u0000\u0000\u0000"+
		"\u0109\u010e\u0006\n\uffff\uffff\u0000\u010a\u010b\u0005\u0006\u0000\u0000"+
		"\u010b\u010f\u0006\n\uffff\uffff\u0000\u010c\u010d\u0005\f\u0000\u0000"+
		"\u010d\u010f\u0006\n\uffff\uffff\u0000\u010e\u010a\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0113\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u0003\u001c\u000e\u0000\u0111\u0112\u0006\n\uffff\uffff\u0000"+
		"\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0005D\u0000\u0000\u0116\u0117\u0006\n\uffff\uffff\u0000"+
		"\u0117\u011b\u00059\u0000\u0000\u0118\u0119\u0003\u0016\u000b\u0000\u0119"+
		"\u011a\u0006\n\uffff\uffff\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b"+
		"\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005:\u0000\u0000\u011e\u011f"+
		"\u0005=\u0000\u0000\u011f\u0120\u00032\u0019\u0000\u0120\u0121\u0006\n"+
		"\uffff\uffff\u0000\u0121\u0122\u0005>\u0000\u0000\u0122\u0015\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0006\u000b\uffff\uffff\u0000\u0124\u0125\u0003"+
		"\n\u0005\u0000\u0125\u012c\u0006\u000b\uffff\uffff\u0000\u0126\u0127\u0005"+
		"?\u0000\u0000\u0127\u0128\u0003\n\u0005\u0000\u0128\u0129\u0006\u000b"+
		"\uffff\uffff\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0126\u0001"+
		"\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0017\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0130\u0003"+
		"\u000e\u0007\u0000\u0130\u0131\u0005;\u0000\u0000\u0131\u0132\u0005<\u0000"+
		"\u0000\u0132\u0133\u0006\f\uffff\uffff\u0000\u0133\u0019\u0001\u0000\u0000"+
		"\u0000\u0134\u0137\u0006\r\uffff\uffff\u0000\u0135\u0138\u0005\r\u0000"+
		"\u0000\u0136\u0138\u0005\u0016\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u00059\u0000\u0000\u013a\u013b\u0003\u001e\u000f\u0000"+
		"\u013b\u013c\u0006\r\uffff\uffff\u0000\u013c\u013d\u0005?\u0000\u0000"+
		"\u013d\u013e\u0003\u001e\u000f\u0000\u013e\u013f\u0006\r\uffff\uffff\u0000"+
		"\u013f\u0140\u0005:\u0000\u0000\u0140\u001b\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0006\u000e\uffff\uffff\u0000\u0142\u0143\u0005\u0012\u0000\u0000"+
		"\u0143\u0144\u00059\u0000\u0000\u0144\u0145\u0003\u001a\r\u0000\u0145"+
		"\u0146\u0006\u000e\uffff\uffff\u0000\u0146\u0147\u0005:\u0000\u0000\u0147"+
		"\u001d\u0001\u0000\u0000\u0000\u0148\u0150\u0006\u000f\uffff\uffff\u0000"+
		"\u0149\u014a\u0005D\u0000\u0000\u014a\u0151\u0006\u000f\uffff\uffff\u0000"+
		"\u014b\u0151\u0005\u0014\u0000\u0000\u014c\u0151\u0005\u0007\u0000\u0000"+
		"\u014d\u014e\u0003\u001a\r\u0000\u014e\u014f\u0006\u000f\uffff\uffff\u0000"+
		"\u014f\u0151\u0001\u0000\u0000\u0000\u0150\u0149\u0001\u0000\u0000\u0000"+
		"\u0150\u014b\u0001\u0000\u0000\u0000\u0150\u014c\u0001\u0000\u0000\u0000"+
		"\u0150\u014d\u0001\u0000\u0000\u0000\u0151\u001f\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0005\u000b\u0000\u0000\u0153\u0154\u0003\"\u0011\u0000\u0154"+
		"\u0155\u0005=\u0000\u0000\u0155\u0156\u00032\u0019\u0000\u0156\u0157\u0006"+
		"\u0010\uffff\uffff\u0000\u0157\u0158\u0005>\u0000\u0000\u0158!\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0006\u0011\uffff\uffff\u0000\u015a\u015b\u0005"+
		"9\u0000\u0000\u015b\u015c\u0005D\u0000\u0000\u015c\u015d\u0006\u0011\uffff"+
		"\uffff\u0000\u015d\u0163\u0005&\u0000\u0000\u015e\u015f\u0005D\u0000\u0000"+
		"\u015f\u0164\u0006\u0011\uffff\uffff\u0000\u0160\u0161\u0003$\u0012\u0000"+
		"\u0161\u0162\u0006\u0011\uffff\uffff\u0000\u0162\u0164\u0001\u0000\u0000"+
		"\u0000\u0163\u015e\u0001\u0000\u0000\u0000\u0163\u0160\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005:\u0000\u0000"+
		"\u0166#\u0001\u0000\u0000\u0000\u0167\u0168\u0006\u0012\uffff\uffff\u0000"+
		"\u0168\u0169\u0005\u0013\u0000\u0000\u0169\u016e\u00059\u0000\u0000\u016a"+
		"\u016b\u0005D\u0000\u0000\u016b\u016f\u0006\u0012\uffff\uffff\u0000\u016c"+
		"\u016d\u0005C\u0000\u0000\u016d\u016f\u0006\u0012\uffff\uffff\u0000\u016e"+
		"\u016a\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f"+
		"\u0170\u0001\u0000\u0000\u0000\u0170\u0175\u0005?\u0000\u0000\u0171\u0172"+
		"\u0005D\u0000\u0000\u0172\u0176\u0006\u0012\uffff\uffff\u0000\u0173\u0174"+
		"\u0005C\u0000\u0000\u0174\u0176\u0006\u0012\uffff\uffff\u0000\u0175\u0171"+
		"\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005:\u0000\u0000\u0178%\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0005\u0011\u0000\u0000\u017a\u017b\u00059\u0000"+
		"\u0000\u017b\u017c\u0003B!\u0000\u017c\u017d\u0005:\u0000\u0000\u017d"+
		"\u017e\u0005:\u0000\u0000\u017e\u017f\u0005=\u0000\u0000\u017f\u0180\u0003"+
		"2\u0019\u0000\u0180\u0181\u0006\u0013\uffff\uffff\u0000\u0181\u0182\u0005"+
		">\u0000\u0000\u0182\'\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u0003"+
		"\u0000\u0000\u0184\u0185\u0006\u0014\uffff\uffff\u0000\u0185\u0186\u0005"+
		"9\u0000\u0000\u0186\u0187\u0003B!\u0000\u0187\u0188\u0006\u0014\uffff"+
		"\uffff\u0000\u0188\u0189\u0005:\u0000\u0000\u0189\u018a\u0005=\u0000\u0000"+
		"\u018a\u018b\u00032\u0019\u0000\u018b\u018c\u0006\u0014\uffff\uffff\u0000"+
		"\u018c\u019a\u0005>\u0000\u0000\u018d\u018e\u0005\t\u0000\u0000\u018e"+
		"\u018f\u0005\u0003\u0000\u0000\u018f\u0190\u00059\u0000\u0000\u0190\u0191"+
		"\u0003B!\u0000\u0191\u0192\u0006\u0014\uffff\uffff\u0000\u0192\u0193\u0005"+
		":\u0000\u0000\u0193\u0194\u0005=\u0000\u0000\u0194\u0195\u00032\u0019"+
		"\u0000\u0195\u0196\u0006\u0014\uffff\uffff\u0000\u0196\u0197\u0005>\u0000"+
		"\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u018d\u0001\u0000\u0000"+
		"\u0000\u0199\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u01a3\u0001\u0000\u0000"+
		"\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019d\u019e\u0005\t\u0000\u0000"+
		"\u019e\u019f\u0005=\u0000\u0000\u019f\u01a0\u00032\u0019\u0000\u01a0\u01a1"+
		"\u0006\u0014\uffff\uffff\u0000\u01a1\u01a2\u0005>\u0000\u0000\u01a2\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a3\u019d\u0001\u0000\u0000\u0000\u01a3\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a4)\u0001\u0000\u0000\u0000\u01a5\u01a6\u0005"+
		"\u0015\u0000\u0000\u01a6\u01a7\u0006\u0015\uffff\uffff\u0000\u01a7\u01a8"+
		"\u0005=\u0000\u0000\u01a8\u01a9\u0003,\u0016\u0000\u01a9\u01aa\u0006\u0015"+
		"\uffff\uffff\u0000\u01aa\u01ab\u0005>\u0000\u0000\u01ab+\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0006\u0016\uffff\uffff\u0000\u01ad\u01ae\u00032\u0019"+
		"\u0000\u01ae\u01b4\u0006\u0016\uffff\uffff\u0000\u01af\u01b0\u0003.\u0017"+
		"\u0000\u01b0\u01b1\u0006\u0016\uffff\uffff\u0000\u01b1\u01b2\u00032\u0019"+
		"\u0000\u01b2\u01b3\u0006\u0016\uffff\uffff\u0000\u01b3\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b4\u01af\u0001\u0000\u0000\u0000\u01b4\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b5-\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003B!\u0000"+
		"\u01b7\u01b8\u0006\u0017\uffff\uffff\u0000\u01b8\u01b9\u00058\u0000\u0000"+
		"\u01b9\u01ba\u0003B!\u0000\u01ba\u01bf\u0006\u0017\uffff\uffff\u0000\u01bb"+
		"\u01bc\u0005-\u0000\u0000\u01bc\u01bd\u0003B!\u0000\u01bd\u01be\u0006"+
		"\u0017\uffff\uffff\u0000\u01be\u01c0\u0001\u0000\u0000\u0000\u01bf\u01bb"+
		"\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005A\u0000\u0000\u01c4/\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0005 \u0000\u0000\u01c6\u01c7\u00059\u0000\u0000"+
		"\u01c7\u01c8\u0005:\u0000\u0000\u01c8\u01c9\u0005=\u0000\u0000\u01c9\u01ca"+
		"\u00032\u0019\u0000\u01ca\u01cb\u0006\u0018\uffff\uffff\u0000\u01cb\u01cc"+
		"\u0005>\u0000\u0000\u01cc1\u0001\u0000\u0000\u0000\u01cd\u01df\u0006\u0019"+
		"\uffff\uffff\u0000\u01ce\u01cf\u0003 \u0010\u0000\u01cf\u01d0\u0006\u0019"+
		"\uffff\uffff\u0000\u01d0\u01de\u0001\u0000\u0000\u0000\u01d1\u01d2\u0003"+
		"&\u0013\u0000\u01d2\u01d3\u0006\u0019\uffff\uffff\u0000\u01d3\u01de\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0003(\u0014\u0000\u01d5\u01d6\u0006\u0019"+
		"\uffff\uffff\u0000\u01d6\u01de\u0001\u0000\u0000\u0000\u01d7\u01d8\u0003"+
		"*\u0015\u0000\u01d8\u01d9\u0006\u0019\uffff\uffff\u0000\u01d9\u01de\u0001"+
		"\u0000\u0000\u0000\u01da\u01db\u00034\u001a\u0000\u01db\u01dc\u0006\u0019"+
		"\uffff\uffff\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01ce\u0001"+
		"\u0000\u0000\u0000\u01dd\u01d1\u0001\u0000\u0000\u0000\u01dd\u01d4\u0001"+
		"\u0000\u0000\u0000\u01dd\u01d7\u0001\u0000\u0000\u0000\u01dd\u01da\u0001"+
		"\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01fc\u0001"+
		"\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e5\u0005"+
		"\u0010\u0000\u0000\u01e3\u01e5\u0005\n\u0000\u0000\u01e4\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e3\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0005A\u0000\u0000\u01e7\u01f9\u0001\u0000\u0000"+
		"\u0000\u01e8\u01e9\u0003 \u0010\u0000\u01e9\u01ea\u0006\u0019\uffff\uffff"+
		"\u0000\u01ea\u01f8\u0001\u0000\u0000\u0000\u01eb\u01ec\u0003&\u0013\u0000"+
		"\u01ec\u01ed\u0006\u0019\uffff\uffff\u0000\u01ed\u01f8\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0003(\u0014\u0000\u01ef\u01f0\u0006\u0019\uffff\uffff"+
		"\u0000\u01f0\u01f8\u0001\u0000\u0000\u0000\u01f1\u01f2\u0003*\u0015\u0000"+
		"\u01f2\u01f3\u0006\u0019\uffff\uffff\u0000\u01f3\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u00034\u001a\u0000\u01f5\u01f6\u0006\u0019\uffff\uffff"+
		"\u0000\u01f6\u01f8\u0001\u0000\u0000\u0000\u01f7\u01e8\u0001\u0000\u0000"+
		"\u0000\u01f7\u01eb\u0001\u0000\u0000\u0000\u01f7\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f1\u0001\u0000\u0000\u0000\u01f7\u01f4\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01e4\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd3\u0001\u0000\u0000\u0000"+
		"\u01fe\u01ff\u00036\u001b\u0000\u01ff\u0200\u0006\u001a\uffff\uffff\u0000"+
		"\u0200\u020b\u0001\u0000\u0000\u0000\u0201\u0202\u0003<\u001e\u0000\u0202"+
		"\u0203\u0006\u001a\uffff\uffff\u0000\u0203\u020b\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0003>\u001f\u0000\u0205\u0206\u0006\u001a\uffff\uffff\u0000"+
		"\u0206\u020b\u0001\u0000\u0000\u0000\u0207\u0208\u0003@ \u0000\u0208\u0209"+
		"\u0006\u001a\uffff\uffff\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a"+
		"\u01fe\u0001\u0000\u0000\u0000\u020a\u0201\u0001\u0000\u0000\u0000\u020a"+
		"\u0204\u0001\u0000\u0000\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020b"+
		"5\u0001\u0000\u0000\u0000\u020c\u020d\u0006\u001b\uffff\uffff\u0000\u020d"+
		"\u021a\u0003\n\u0005\u0000\u020e\u0218\u00058\u0000\u0000\u020f\u0210"+
		"\u00038\u001c\u0000\u0210\u0211\u0006\u001b\uffff\uffff\u0000\u0211\u0219"+
		"\u0001\u0000\u0000\u0000\u0212\u0213\u0003:\u001d\u0000\u0213\u0214\u0006"+
		"\u001b\uffff\uffff\u0000\u0214\u0219\u0001\u0000\u0000\u0000\u0215\u0216"+
		"\u0003B!\u0000\u0216\u0217\u0006\u001b\uffff\uffff\u0000\u0217\u0219\u0001"+
		"\u0000\u0000\u0000\u0218\u020f\u0001\u0000\u0000\u0000\u0218\u0212\u0001"+
		"\u0000\u0000\u0000\u0218\u0215\u0001\u0000\u0000\u0000\u0219\u021b\u0001"+
		"\u0000\u0000\u0000\u021a\u020e\u0001\u0000\u0000\u0000\u021a\u021b\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0006"+
		"\u001b\uffff\uffff\u0000\u021d\u021e\u0005A\u0000\u0000\u021e7\u0001\u0000"+
		"\u0000\u0000\u021f\u0220\u0005#\u0000\u0000\u0220\u0221\u0005D\u0000\u0000"+
		"\u0221\u0222\u0006\u001c\uffff\uffff\u0000\u0222\u0226\u00059\u0000\u0000"+
		"\u0223\u0224\u0003B!\u0000\u0224\u0225\u0006\u001c\uffff\uffff\u0000\u0225"+
		"\u0227\u0001\u0000\u0000\u0000\u0226\u0223\u0001\u0000\u0000\u0000\u0226"+
		"\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005:\u0000\u0000\u02299\u0001\u0000\u0000\u0000\u022a\u022b\u0005"+
		"D\u0000\u0000\u022b\u022c\u0006\u001d\uffff\uffff\u0000\u022c\u0236\u0005"+
		"=\u0000\u0000\u022d\u022e\u0005D\u0000\u0000\u022e\u022f\u0006\u001d\uffff"+
		"\uffff\u0000\u022f\u0230\u0005B\u0000\u0000\u0230\u0231\u0003B!\u0000"+
		"\u0231\u0232\u0006\u001d\uffff\uffff\u0000\u0232\u0233\u0005?\u0000\u0000"+
		"\u0233\u0235\u0001\u0000\u0000\u0000\u0234\u022d\u0001\u0000\u0000\u0000"+
		"\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0239\u0001\u0000\u0000\u0000"+
		"\u0238\u0236\u0001\u0000\u0000\u0000\u0239\u023a\u0005D\u0000\u0000\u023a"+
		"\u023b\u0006\u001d\uffff\uffff\u0000\u023b\u023c\u0005B\u0000\u0000\u023c"+
		"\u023d\u0003B!\u0000\u023d\u023e\u0006\u001d\uffff\uffff\u0000\u023e\u023f"+
		"\u0005>\u0000\u0000\u023f;\u0001\u0000\u0000\u0000\u0240\u0247\u0006\u001e"+
		"\uffff\uffff\u0000\u0241\u0242\u0005D\u0000\u0000\u0242\u0248\u0006\u001e"+
		"\uffff\uffff\u0000\u0243\u0244\u0005\u0007\u0000\u0000\u0244\u0245\u0005"+
		"@\u0000\u0000\u0245\u0246\u0005D\u0000\u0000\u0246\u0248\u0006\u001e\uffff"+
		"\uffff\u0000\u0247\u0241\u0001\u0000\u0000\u0000\u0247\u0243\u0001\u0000"+
		"\u0000\u0000\u0248\u024e\u0001\u0000\u0000\u0000\u0249\u024a\u0005@\u0000"+
		"\u0000\u024a\u024b\u0005D\u0000\u0000\u024b\u024d\u0006\u001e\uffff\uffff"+
		"\u0000\u024c\u0249\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000"+
		"\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0252\u0001\u0000\u0000\u0000\u0250\u024e\u0001\u0000\u0000"+
		"\u0000\u0251\u0253\u0003\f\u0006\u0000\u0252\u0251\u0001\u0000\u0000\u0000"+
		"\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000"+
		"\u0254\u0256\u00058\u0000\u0000\u0255\u0257\u0005#\u0000\u0000\u0256\u0255"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000\u0000\u0257\u0258"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0003B!\u0000\u0259\u025a\u0006\u001e"+
		"\uffff\uffff\u0000\u025a\u025b\u0005A\u0000\u0000\u025b=\u0001\u0000\u0000"+
		"\u0000\u025c\u025d\u0003B!\u0000\u025d\u025e\u0005A\u0000\u0000\u025e"+
		"\u025f\u0006\u001f\uffff\uffff\u0000\u025f?\u0001\u0000\u0000\u0000\u0260"+
		"\u0268\u0006 \uffff\uffff\u0000\u0261\u0262\u0005D\u0000\u0000\u0262\u0266"+
		"\u0006 \uffff\uffff\u0000\u0263\u0264\u0005\u0007\u0000\u0000\u0264\u0266"+
		"\u0006 \uffff\uffff\u0000\u0265\u0261\u0001\u0000\u0000\u0000\u0265\u0263"+
		"\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0269"+
		"\u0005@\u0000\u0000\u0268\u0265\u0001\u0000\u0000\u0000\u0268\u0269\u0001"+
		"\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026a\u026b\u0005"+
		"D\u0000\u0000\u026b\u026c\u0006 \uffff\uffff\u0000\u026c\u0270\u00059"+
		"\u0000\u0000\u026d\u026e\u0003B!\u0000\u026e\u026f\u0006 \uffff\uffff"+
		"\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u026d\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0005:\u0000\u0000\u0273\u0274\u0005\u0005\u0000\u0000"+
		"\u0274\u0275\u00059\u0000\u0000\u0275\u0276\u0003\u001a\r\u0000\u0276"+
		"\u0277\u0006 \uffff\uffff\u0000\u0277\u0278\u0005:\u0000\u0000\u0278\u0279"+
		"\u0005A\u0000\u0000\u0279A\u0001\u0000\u0000\u0000\u027a\u0284\u0006!"+
		"\uffff\uffff\u0000\u027b\u027c\u0003D\"\u0000\u027c\u027d\u0006!\uffff"+
		"\uffff\u0000\u027d\u0285\u0001\u0000\u0000\u0000\u027e\u027f\u0003D\""+
		"\u0000\u027f\u0280\u0006!\uffff\uffff\u0000\u0280\u0281\u0005?\u0000\u0000"+
		"\u0281\u0282\u0003B!\u0000\u0282\u0283\u0006!\uffff\uffff\u0000\u0283"+
		"\u0285\u0001\u0000\u0000\u0000\u0284\u027b\u0001\u0000\u0000\u0000\u0284"+
		"\u027e\u0001\u0000\u0000\u0000\u0285C\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0003F#\u0000\u0287\u0288\u0006\"\uffff\uffff\u0000\u0288\u0290\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0003F#\u0000\u028a\u028b\u00053\u0000"+
		"\u0000\u028b\u028c\u0006\"\uffff\uffff\u0000\u028c\u028d\u0003D\"\u0000"+
		"\u028d\u028e\u0006\"\uffff\uffff\u0000\u028e\u0290\u0001\u0000\u0000\u0000"+
		"\u028f\u0286\u0001\u0000\u0000\u0000\u028f\u0289\u0001\u0000\u0000\u0000"+
		"\u0290E\u0001\u0000\u0000\u0000\u0291\u0292\u0003H$\u0000\u0292\u0293"+
		"\u0006#\uffff\uffff\u0000\u0293\u029b\u0001\u0000\u0000\u0000\u0294\u0295"+
		"\u0003H$\u0000\u0295\u0296\u00052\u0000\u0000\u0296\u0297\u0006#\uffff"+
		"\uffff\u0000\u0297\u0298\u0003F#\u0000\u0298\u0299\u0006#\uffff\uffff"+
		"\u0000\u0299\u029b\u0001\u0000\u0000\u0000\u029a\u0291\u0001\u0000\u0000"+
		"\u0000\u029a\u0294\u0001\u0000\u0000\u0000\u029bG\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0003L&\u0000\u029d\u029e\u0003J%\u0000\u029e\u029f\u0006"+
		"$\uffff\uffff\u0000\u029fI\u0001\u0000\u0000\u0000\u02a0\u02aa\u0006%"+
		"\uffff\uffff\u0000\u02a1\u02a2\u0005/\u0000\u0000\u02a2\u02a6\u0006%\uffff"+
		"\uffff\u0000\u02a3\u02a4\u0005.\u0000\u0000\u02a4\u02a6\u0006%\uffff\uffff"+
		"\u0000\u02a5\u02a1\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001\u0000\u0000"+
		"\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0003H$\u0000\u02a8"+
		"\u02a9\u0006%\uffff\uffff\u0000\u02a9\u02ab\u0001\u0000\u0000\u0000\u02aa"+
		"\u02a5\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab"+
		"K\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003P(\u0000\u02ad\u02ae\u0003"+
		"N\'\u0000\u02ae\u02af\u0006&\uffff\uffff\u0000\u02afM\u0001\u0000\u0000"+
		"\u0000\u02b0\u02ba\u0006\'\uffff\uffff\u0000\u02b1\u02b2\u00051\u0000"+
		"\u0000\u02b2\u02b6\u0006\'\uffff\uffff\u0000\u02b3\u02b4\u00050\u0000"+
		"\u0000\u02b4\u02b6\u0006\'\uffff\uffff\u0000\u02b5\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0003L&\u0000\u02b8\u02b9\u0006\'\uffff\uffff\u0000"+
		"\u02b9\u02bb\u0001\u0000\u0000\u0000\u02ba\u02b5\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bbO\u0001\u0000\u0000\u0000\u02bc"+
		"\u02bd\u0003T*\u0000\u02bd\u02be\u0003R)\u0000\u02be\u02bf\u0006(\uffff"+
		"\uffff\u0000\u02bfQ\u0001\u0000\u0000\u0000\u02c0\u02ca\u0006)\uffff\uffff"+
		"\u0000\u02c1\u02c2\u0005(\u0000\u0000\u02c2\u02c6\u0006)\uffff\uffff\u0000"+
		"\u02c3\u02c4\u0005)\u0000\u0000\u02c4\u02c6\u0006)\uffff\uffff\u0000\u02c5"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c7\u02c8\u0003P(\u0000\u02c8\u02c9\u0006"+
		")\uffff\uffff\u0000\u02c9\u02cb\u0001\u0000\u0000\u0000\u02ca\u02c5\u0001"+
		"\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000\u02cbS\u0001\u0000"+
		"\u0000\u0000\u02cc\u02cd\u0003X,\u0000\u02cd\u02ce\u0003V+\u0000\u02ce"+
		"\u02cf\u0006*\uffff\uffff\u0000\u02cfU\u0001\u0000\u0000\u0000\u02d0\u02dc"+
		"\u0006+\uffff\uffff\u0000\u02d1\u02d2\u0005+\u0000\u0000\u02d2\u02d8\u0006"+
		"+\uffff\uffff\u0000\u02d3\u02d4\u0005*\u0000\u0000\u02d4\u02d8\u0006+"+
		"\uffff\uffff\u0000\u02d5\u02d6\u0005,\u0000\u0000\u02d6\u02d8\u0006+\uffff"+
		"\uffff\u0000\u02d7\u02d1\u0001\u0000\u0000\u0000\u02d7\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000"+
		"\u0000\u0000\u02d9\u02da\u0003T*\u0000\u02da\u02db\u0006+\uffff\uffff"+
		"\u0000\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc\u02d7\u0001\u0000\u0000"+
		"\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02ddW\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\u0003Z-\u0000\u02df\u02e0\u0006,\uffff\uffff\u0000\u02e0"+
		"\u02f0\u0001\u0000\u0000\u0000\u02e1\u02ea\u0006,\uffff\uffff\u0000\u02e2"+
		"\u02e3\u0005)\u0000\u0000\u02e3\u02eb\u0006,\uffff\uffff\u0000\u02e4\u02e5"+
		"\u00054\u0000\u0000\u02e5\u02eb\u0006,\uffff\uffff\u0000\u02e6\u02e7\u0005"+
		"6\u0000\u0000\u02e7\u02eb\u0006,\uffff\uffff\u0000\u02e8\u02e9\u00055"+
		"\u0000\u0000\u02e9\u02eb\u0006,\uffff\uffff\u0000\u02ea\u02e2\u0001\u0000"+
		"\u0000\u0000\u02ea\u02e4\u0001\u0000\u0000\u0000\u02ea\u02e6\u0001\u0000"+
		"\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0003X,\u0000\u02ed\u02ee\u0006,\uffff\uffff"+
		"\u0000\u02ee\u02f0\u0001\u0000\u0000\u0000\u02ef\u02de\u0001\u0000\u0000"+
		"\u0000\u02ef\u02e1\u0001\u0000\u0000\u0000\u02f0Y\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f2\u0003^/\u0000\u02f2\u02f3\u0003\\.\u0000\u02f3\u02f4\u0006"+
		"-\uffff\uffff\u0000\u02f4[\u0001\u0000\u0000\u0000\u02f5\u02ff\u0006."+
		"\uffff\uffff\u0000\u02f6\u02f7\u00055\u0000\u0000\u02f7\u02fb\u0006.\uffff"+
		"\uffff\u0000\u02f8\u02f9\u00056\u0000\u0000\u02f9\u02fb\u0006.\uffff\uffff"+
		"\u0000\u02fa\u02f6\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0001\u0000\u0000\u0000\u02fc\u02fd\u0003\\.\u0000"+
		"\u02fd\u02fe\u0006.\uffff\uffff\u0000\u02fe\u0300\u0001\u0000\u0000\u0000"+
		"\u02ff\u02fa\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000\u0000"+
		"\u0300]\u0001\u0000\u0000\u0000\u0301\u0302\u0003`0\u0000\u0302\u0303"+
		"\u0006/\uffff\uffff\u0000\u0303\u030a\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u0005;\u0000\u0000\u0305\u0306\u0003D\"\u0000\u0306\u0307\u0005<\u0000"+
		"\u0000\u0307\u0308\u0006/\uffff\uffff\u0000\u0308\u030a\u0001\u0000\u0000"+
		"\u0000\u0309\u0301\u0001\u0000\u0000\u0000\u0309\u0304\u0001\u0000\u0000"+
		"\u0000\u030a_\u0001\u0000\u0000\u0000\u030b\u030c\u0003b1\u0000\u030c"+
		"\u030d\u00060\uffff\uffff\u0000\u030d\u0314\u0001\u0000\u0000\u0000\u030e"+
		"\u030f\u0003b1\u0000\u030f\u0310\u0005@\u0000\u0000\u0310\u0311\u0003"+
		"`0\u0000\u0311\u0312\u00060\uffff\uffff\u0000\u0312\u0314\u0001\u0000"+
		"\u0000\u0000\u0313\u030b\u0001\u0000\u0000\u0000\u0313\u030e\u0001\u0000"+
		"\u0000\u0000\u0314a\u0001\u0000\u0000\u0000\u0315\u0316\u0003d2\u0000"+
		"\u0316\u0317\u00061\uffff\uffff\u0000\u0317\u031e\u0001\u0000\u0000\u0000"+
		"\u0318\u0319\u00059\u0000\u0000\u0319\u031a\u0003D\"\u0000\u031a\u031b"+
		"\u0005:\u0000\u0000\u031b\u031c\u00061\uffff\uffff\u0000\u031c\u031e\u0001"+
		"\u0000\u0000\u0000\u031d\u0315\u0001\u0000\u0000\u0000\u031d\u0318\u0001"+
		"\u0000\u0000\u0000\u031ec\u0001\u0000\u0000\u0000\u031f\u0320\u0003j5"+
		"\u0000\u0320\u0321\u00062\uffff\uffff\u0000\u0321\u032d\u0001\u0000\u0000"+
		"\u0000\u0322\u0323\u0003h4\u0000\u0323\u0324\u00062\uffff\uffff\u0000"+
		"\u0324\u032d\u0001\u0000\u0000\u0000\u0325\u0326\u0003f3\u0000\u0326\u0327"+
		"\u00062\uffff\uffff\u0000\u0327\u032d\u0001\u0000\u0000\u0000\u0328\u0329"+
		"\u0005D\u0000\u0000\u0329\u032d\u00062\uffff\uffff\u0000\u032a\u032b\u0005"+
		"\u0007\u0000\u0000\u032b\u032d\u00062\uffff\uffff\u0000\u032c\u031f\u0001"+
		"\u0000\u0000\u0000\u032c\u0322\u0001\u0000\u0000\u0000\u032c\u0325\u0001"+
		"\u0000\u0000\u0000\u032c\u0328\u0001\u0000\u0000\u0000\u032c\u032a\u0001"+
		"\u0000\u0000\u0000\u032de\u0001\u0000\u0000\u0000\u032e\u032f\u0005D\u0000"+
		"\u0000\u032f\u0330\u0005B\u0000\u0000\u0330\u0331\u0005B\u0000\u0000\u0331"+
		"\u0332\u0005D\u0000\u0000\u0332\u0333\u00063\uffff\uffff\u0000\u0333g"+
		"\u0001\u0000\u0000\u0000\u0334\u0347\u00064\uffff\uffff\u0000\u0335\u0336"+
		"\u0005!\u0000\u0000\u0336\u0348\u00064\uffff\uffff\u0000\u0337\u0338\u0005"+
		"\u0018\u0000\u0000\u0338\u0348\u00064\uffff\uffff\u0000\u0339\u033a\u0005"+
		"\u0017\u0000\u0000\u033a\u0348\u00064\uffff\uffff\u0000\u033b\u033c\u0005"+
		"\"\u0000\u0000\u033c\u0348\u00064\uffff\uffff\u0000\u033d\u033e\u0005"+
		"\u001f\u0000\u0000\u033e\u0348\u00064\uffff\uffff\u0000\u033f\u0340\u0005"+
		"\u001e\u0000\u0000\u0340\u0348\u00064\uffff\uffff\u0000\u0341\u0342\u0005"+
		"\u001d\u0000\u0000\u0342\u0348\u00064\uffff\uffff\u0000\u0343\u0344\u0005"+
		"\u0019\u0000\u0000\u0344\u0348\u00064\uffff\uffff\u0000\u0345\u0346\u0005"+
		"D\u0000\u0000\u0346\u0348\u00064\uffff\uffff\u0000\u0347\u0335\u0001\u0000"+
		"\u0000\u0000\u0347\u0337\u0001\u0000\u0000\u0000\u0347\u0339\u0001\u0000"+
		"\u0000\u0000\u0347\u033b\u0001\u0000\u0000\u0000\u0347\u033d\u0001\u0000"+
		"\u0000\u0000\u0347\u033f\u0001\u0000\u0000\u0000\u0347\u0341\u0001\u0000"+
		"\u0000\u0000\u0347\u0343\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034d\u00059\u0000"+
		"\u0000\u034a\u034b\u0003B!\u0000\u034b\u034c\u00064\uffff\uffff\u0000"+
		"\u034c\u034e\u0001\u0000\u0000\u0000\u034d\u034a\u0001\u0000\u0000\u0000"+
		"\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000\u0000\u0000"+
		"\u034f\u0350\u0005:\u0000\u0000\u0350\u0351\u00064\uffff\uffff\u0000\u0351"+
		"i\u0001\u0000\u0000\u0000\u0352\u0353\u0005C\u0000\u0000\u0353\u035b\u0006"+
		"5\uffff\uffff\u0000\u0354\u0355\u0005E\u0000\u0000\u0355\u035b\u00065"+
		"\uffff\uffff\u0000\u0356\u0357\u0005\b\u0000\u0000\u0357\u035b\u00065"+
		"\uffff\uffff\u0000\u0358\u0359\u0005\u000e\u0000\u0000\u0359\u035b\u0006"+
		"5\uffff\uffff\u0000\u035a\u0352\u0001\u0000\u0000\u0000\u035a\u0354\u0001"+
		"\u0000\u0000\u0000\u035a\u0356\u0001\u0000\u0000\u0000\u035a\u0358\u0001"+
		"\u0000\u0000\u0000\u035bk\u0001\u0000\u0000\u0000Dsu\u0085\u0092\u0098"+
		"\u009d\u00a4\u00b2\u00c3\u00c9\u00d2\u00dc\u00ed\u00f3\u0101\u010e\u0113"+
		"\u011b\u012c\u0137\u0150\u0163\u016e\u0175\u019a\u01a3\u01b4\u01c1\u01dd"+
		"\u01df\u01e4\u01f7\u01f9\u01fc\u020a\u0218\u021a\u0226\u0236\u0247\u024e"+
		"\u0252\u0256\u0265\u0268\u0270\u0284\u028f\u029a\u02a5\u02aa\u02b5\u02ba"+
		"\u02c5\u02ca\u02d7\u02dc\u02ea\u02ef\u02fa\u02ff\u0309\u0313\u031d\u032c"+
		"\u0347\u034d\u035a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}