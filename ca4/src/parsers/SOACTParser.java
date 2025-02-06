// Generated from /home/mvajhi/code/Complier-Design-and-Programming-Languages-Design/ca4/src/main/grammar/SOACT.g4 by ANTLR 4.13.2
package parsers;

    import main.ast.nodes.*;
    import main.ast.nodes.declaration.*;
    import main.ast.nodes.expression.*;
    import main.ast.nodes.type.*;
    import main.utils.*;
    import main.ast.nodes.statements.*;
    import main.ast.nodes.expression.value.*;
    import main.ast.nodes.expression.operator.*;
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
		RULE_actorVars = 4, RULE_init = 5, RULE_arrayIndex = 6, RULE_type = 7, 
		RULE_container = 8, RULE_constructor = 9, RULE_msgHandler = 10, RULE_arguments = 11, 
		RULE_arrayType = 12, RULE_accesslevels = 13, RULE_authorized = 14, RULE_accesslevelsParam = 15, 
		RULE_forLoop = 16, RULE_forLoopCondition = 17, RULE_range = 18, RULE_whileLoop = 19, 
		RULE_ifBlock = 20, RULE_joinBlock = 21, RULE_joinBlockBody = 22, RULE_pipeStatement = 23, 
		RULE_main = 24, RULE_body = 25, RULE_statements = 26, RULE_initStatement = 27, 
		RULE_constructorCall = 28, RULE_initRecord = 29, RULE_assignStatement = 30, 
		RULE_exprStatement = 31, RULE_observeStatement = 32, RULE_expressionList = 33, 
		RULE_expression = 34, RULE_primaryExpression = 35, RULE_customPrimAccess = 36, 
		RULE_handlerCall = 37, RULE_primitivesVals = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"soact", "record", "actorDec", "customPrimitive", "actorVars", "init", 
			"arrayIndex", "type", "container", "constructor", "msgHandler", "arguments", 
			"arrayType", "accesslevels", "authorized", "accesslevelsParam", "forLoop", 
			"forLoopCondition", "range", "whileLoop", "ifBlock", "joinBlock", "joinBlockBody", 
			"pipeStatement", "main", "body", "statements", "initStatement", "constructorCall", 
			"initRecord", "assignStatement", "exprStatement", "observeStatement", 
			"expressionList", "expression", "primaryExpression", "customPrimAccess", 
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
			if ( visitor instanceof SOACTVisitor) return ((SOACTVisitor<? extends T>)visitor).visitSoact(this);
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
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTOR || _la==RECORD) {
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(79);
					((SoactContext)_localctx).a = actorDec();
					 _localctx.soactRet.addActorDec(((SoactContext)_localctx).a.actorDecRet); 
					}
					break;
				case RECORD:
					{
					setState(82);
					((SoactContext)_localctx).r = record();
					 _localctx.soactRet.addRecordNode(((SoactContext)_localctx).r.recordNodeRet); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
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
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode RECORD() { return getToken(SOACTParser.RECORD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
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
			setState(93);
			((RecordContext)_localctx).rec = match(RECORD);
			setState(94);
			((RecordContext)_localctx).id = match(IDENTIFIER);
			 Identifier identifier = Identifier.createId((((RecordContext)_localctx).id!=null?((RecordContext)_localctx).id.getText():null) ,(((RecordContext)_localctx).id!=null?((RecordContext)_localctx).id.getLine():0));
			    ((RecordContext)_localctx).recordNodeRet =  new RecordNode(identifier, (((RecordContext)_localctx).rec!=null?((RecordContext)_localctx).rec.getLine():0));
			setState(96);
			match(LBRACE);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				((RecordContext)_localctx).var = init();
				_localctx.recordNodeRet.addVar(((RecordContext)_localctx).var.varRet);
				setState(99);
				match(SEMICOLON);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER );
			setState(105);
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
		public ActorDec actorDecRet;
		public Token def;
		public Token id;
		public CustomPrimitiveContext c;
		public ActorVarsContext v;
		public ConstructorContext cs;
		public MsgHandlerContext h;
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode ACTOR() { return getToken(SOACTParser.ACTOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
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
			setState(107);
			((ActorDecContext)_localctx).def = match(ACTOR);
			setState(108);
			((ActorDecContext)_localctx).id = match(IDENTIFIER);
			 ((ActorDecContext)_localctx).actorDecRet =  new ActorDec(Identifier.createId((((ActorDecContext)_localctx).id!=null?((ActorDecContext)_localctx).id.getText():null) ,(((ActorDecContext)_localctx).id!=null?((ActorDecContext)_localctx).id.getLine():0)), (((ActorDecContext)_localctx).def!=null?((ActorDecContext)_localctx).def.getLine():0)); 
			setState(110);
			match(LBRACE);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PRIMITIVE) {
				{
				{
				setState(111);
				((ActorDecContext)_localctx).c = customPrimitive();
				_localctx.actorDecRet.addCustomPrimitive(((ActorDecContext)_localctx).c.cpRet);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ACTORVAR) {
				{
				setState(119);
				((ActorDecContext)_localctx).v = actorVars();
				 _localctx.actorDecRet.setActorVars(((ActorDecContext)_localctx).v.argRet.vars);
				                     _localctx.actorDecRet.setAccessExpressions(((ActorDecContext)_localctx).v.argRet.accessLevels); 
				}
			}

			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(124);
				((ActorDecContext)_localctx).cs = constructor();
				_localctx.actorDecRet.setConstructor(((ActorDecContext)_localctx).cs.constructorRet);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MSGRCV || _la==MSGOBS) {
				{
				{
				setState(129);
				((ActorDecContext)_localctx).h = msgHandler();
				_localctx.actorDecRet.addHandler(((ActorDecContext)_localctx).h.handlerRet);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
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
			setState(139);
			((CustomPrimitiveContext)_localctx).p = match(PRIMITIVE);
			setState(140);
			((CustomPrimitiveContext)_localctx).id = match(IDENTIFIER);
			((CustomPrimitiveContext)_localctx).cpRet =  new CustomPrimitiveDeclaration(Identifier.createId((((CustomPrimitiveContext)_localctx).id!=null?((CustomPrimitiveContext)_localctx).id.getText():null) ,(((CustomPrimitiveContext)_localctx).id!=null?((CustomPrimitiveContext)_localctx).id.getLine():0)), (((CustomPrimitiveContext)_localctx).p!=null?((CustomPrimitiveContext)_localctx).p.getLine():0));
			setState(142);
			match(LBRACE);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					((CustomPrimitiveContext)_localctx).stateId = match(IDENTIFIER);
					_localctx.cpRet.addState(Identifier.createId((((CustomPrimitiveContext)_localctx).stateId!=null?((CustomPrimitiveContext)_localctx).stateId.getText():null) ,(((CustomPrimitiveContext)_localctx).stateId!=null?((CustomPrimitiveContext)_localctx).stateId.getLine():0)));
					setState(145);
					match(COMMA);
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(151);
			((CustomPrimitiveContext)_localctx).lastStateId = match(IDENTIFIER);
			_localctx.cpRet.addState(Identifier.createId((((CustomPrimitiveContext)_localctx).lastStateId!=null?((CustomPrimitiveContext)_localctx).lastStateId.getText():null) ,(((CustomPrimitiveContext)_localctx).lastStateId!=null?((CustomPrimitiveContext)_localctx).lastStateId.getLine():0)));
			setState(153);
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
			setState(156);
			match(ACTORVAR);
			setState(157);
			match(LBRACE);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(158);
				((ActorVarsContext)_localctx).var = init();
				 _localctx.argRet.vars.add(((ActorVarsContext)_localctx).var.varRet); 
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(160);
					match(LPAR);
					setState(161);
					((ActorVarsContext)_localctx).a = accesslevels();
					 _localctx.argRet.accessLevels.add(new ArrayList<>(((ActorVarsContext)_localctx).a.accessLevelsRet)); 
					setState(163);
					match(RPAR);
					}
				}

				setState(167);
				match(SEMICOLON);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(174);
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
		public VarDeclaration varRet;
		public TypeContext t1;
		public Token id;
		public ArrayIndexContext a;
		public ArrayTypeContext t2;
		public ContainerContext t3;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(176);
				((InitContext)_localctx).t1 = type();
				setState(177);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0), ((InitContext)_localctx).t1.typeRet);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(179);
					((InitContext)_localctx).a = arrayIndex();
					 _localctx.varRet.setArrayIndex(((InitContext)_localctx).a.arrayIndexRet); 
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(184);
				((InitContext)_localctx).t2 = arrayType();
				setState(185);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0), ((InitContext)_localctx).t2.arrayTypeRet);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(188);
				((InitContext)_localctx).t3 = container();
				setState(189);
				((InitContext)_localctx).id = match(IDENTIFIER);
				((InitContext)_localctx).varRet =  new VarDeclaration(Identifier.createId((((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getText():null) ,(((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0)), (((InitContext)_localctx).id!=null?((InitContext)_localctx).id.getLine():0), ((InitContext)_localctx).t3.containerRet);
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
		public ArrayIndex arrayIndexRet;
		public Token i;
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
			setState(194);
			match(LBRACK);
			setState(195);
			((ArrayIndexContext)_localctx).i = match(INT_VALUE);
			 ((ArrayIndexContext)_localctx).arrayIndexRet =  new ArrayIndex((((ArrayIndexContext)_localctx).i!=null?((ArrayIndexContext)_localctx).i.getText():null)); 
			setState(197);
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
	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public Token i1;
		public Token s;
		public Token b;
		public Token i2;
		public Token i3;
		public TerminalNode INT() { return getToken(SOACTParser.INT, 0); }
		public TerminalNode STRING() { return getToken(SOACTParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(SOACTParser.BOOLEAN, 0); }
		public TerminalNode ID() { return getToken(SOACTParser.ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 14, RULE_type);
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				((TypeContext)_localctx).i1 = match(INT);
				 ((TypeContext)_localctx).typeRet =  new IntType(); _localctx.typeRet.setLine((((TypeContext)_localctx).i1!=null?((TypeContext)_localctx).i1.getLine():0)); 
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((TypeContext)_localctx).s = match(STRING);
				 ((TypeContext)_localctx).typeRet =  new StringType(); _localctx.typeRet.setLine((((TypeContext)_localctx).s!=null?((TypeContext)_localctx).s.getLine():0)); 
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				((TypeContext)_localctx).b = match(BOOLEAN);
				 ((TypeContext)_localctx).typeRet =  new BooleanType(); _localctx.typeRet.setLine((((TypeContext)_localctx).b!=null?((TypeContext)_localctx).b.getLine():0)); 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				((TypeContext)_localctx).i2 = match(ID);
				 ((TypeContext)_localctx).typeRet =  new IdType(); _localctx.typeRet.setLine((((TypeContext)_localctx).i2!=null?((TypeContext)_localctx).i2.getLine():0)); 
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(207);
				((TypeContext)_localctx).i3 = match(IDENTIFIER);
				 ((TypeContext)_localctx).typeRet =  new OtherType((((TypeContext)_localctx).i3!=null?((TypeContext)_localctx).i3.getText():null)); _localctx.typeRet.setLine((((TypeContext)_localctx).i3!=null?((TypeContext)_localctx).i3.getLine():0)); 
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
		public Type containerRet;
		public Token s;
		public Token l;
		public TypeContext t;
		public TerminalNode LESS_THAN() { return getToken(SOACTParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SOACTParser.GREATER_THAN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				{
				setState(211);
				((ContainerContext)_localctx).s = match(SET);
				}
				break;
			case LIST:
				{
				setState(212);
				((ContainerContext)_localctx).l = match(LIST);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(215);
			match(LESS_THAN);
			setState(216);
			((ContainerContext)_localctx).t = type();

			        if ((((ContainerContext)_localctx).l!=null?((ContainerContext)_localctx).l.getText():null) == null)
			            ((ContainerContext)_localctx).containerRet =  new SetType(((ContainerContext)_localctx).t.typeRet);
			        else
			            ((ContainerContext)_localctx).containerRet =  new ListType(((ContainerContext)_localctx).t.typeRet);
			    
			setState(218);
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
			setState(221);
			((ConstructorContext)_localctx).id = match(IDENTIFIER);
			_localctx.constructorRet.name = (((ConstructorContext)_localctx).id!=null?((ConstructorContext)_localctx).id.getText():null);
			setState(223);
			match(LPAR);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(224);
				((ConstructorContext)_localctx).args = arguments();
				_localctx.constructorRet.args.addAll(((ConstructorContext)_localctx).args.argsRet);
				}
			}

			setState(229);
			match(RPAR);
			setState(230);
			match(LBRACE);
			setState(231);
			((ConstructorContext)_localctx).b = body();
			_localctx.constructorRet.body.addAll(((ConstructorContext)_localctx).b.bodyRet);
			setState(233);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MSGRCV:
				{
				setState(236);
				((MsgHandlerContext)_localctx).srv = match(MSGRCV);
				type = (((MsgHandlerContext)_localctx).srv!=null?((MsgHandlerContext)_localctx).srv.getText():null);
				                   ((MsgHandlerContext)_localctx).handlerRet =  new ServiceHandler((((MsgHandlerContext)_localctx).srv!=null?((MsgHandlerContext)_localctx).srv.getLine():0));
				}
				break;
			case MSGOBS:
				{
				setState(238);
				((MsgHandlerContext)_localctx).obs = match(MSGOBS);
				type = (((MsgHandlerContext)_localctx).obs!=null?((MsgHandlerContext)_localctx).obs.getText():null);
				                  ((MsgHandlerContext)_localctx).handlerRet =  new ObserveHandler((((MsgHandlerContext)_localctx).obs!=null?((MsgHandlerContext)_localctx).obs.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTHORIZED) {
				{
				setState(242);
				((MsgHandlerContext)_localctx).a = authorized();
				_localctx.handlerRet.setAuthorizationExpressions(((MsgHandlerContext)_localctx).a.authorizeRet); 
				}
			}

			setState(247);
			((MsgHandlerContext)_localctx).id_name = match(IDENTIFIER);
			_localctx.handlerRet.setName(Identifier.createId((((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getText():null) ,(((MsgHandlerContext)_localctx).id_name!=null?((MsgHandlerContext)_localctx).id_name.getLine():0)));
			setState(249);
			match(LPAR);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68920836116L) != 0) || _la==IDENTIFIER) {
				{
				setState(250);
				((MsgHandlerContext)_localctx).args = arguments();
				_localctx.handlerRet.setArgs(((MsgHandlerContext)_localctx).args.argsRet);
				}
			}

			setState(255);
			match(RPAR);
			setState(256);
			match(LBRACE);
			setState(257);
			((MsgHandlerContext)_localctx).b = body();
			_localctx.handlerRet.setBody(((MsgHandlerContext)_localctx).b.bodyRet);
			setState(259);
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
			setState(262);
			((ArgumentsContext)_localctx).arg = init();
			_localctx.argsRet.add(((ArgumentsContext)_localctx).arg.varRet);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				((ArgumentsContext)_localctx).otherArg = init();
				_localctx.argsRet.add(((ArgumentsContext)_localctx).otherArg.varRet);
				}
				}
				setState(272);
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
		public Type arrayTypeRet;
		public TypeContext t;
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(273);
			((ArrayTypeContext)_localctx).t = type();
			 ((ArrayTypeContext)_localctx).arrayTypeRet =  new ArrayType(((ArrayTypeContext)_localctx).t.typeRet); 
			setState(275);
			match(LBRACK);
			setState(276);
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
	public static class AccesslevelsContext extends ParserRuleContext {
		public ArrayList<Expression> accessLevelsRet;
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUBLIC:
				{
				{
				setState(279);
				match(PUBLIC);
				_localctx.accessLevelsRet.add(new BoolValue(true));
				}
				}
				break;
			case PRIVATE:
				{
				{
				setState(281);
				match(PRIVATE);
				_localctx.accessLevelsRet.add(new BoolValue(false));
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(285);
			match(LPAR);
			setState(286);
			((AccesslevelsContext)_localctx).p = accesslevelsParam();
			_localctx.accessLevelsRet.addAll(((AccesslevelsContext)_localctx).p.accessLevelsParamRet);
			setState(288);
			match(COMMA);
			setState(289);
			((AccesslevelsContext)_localctx).lp = accesslevelsParam();
			_localctx.accessLevelsRet.addAll(((AccesslevelsContext)_localctx).lp.accessLevelsParamRet);
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
	public static class AuthorizedContext extends ParserRuleContext {
		public ArrayList<Expression> authorizeRet;
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
			setState(294);
			match(AUTHORIZED);
			setState(295);
			match(LPAR);
			setState(296);
			((AuthorizedContext)_localctx).a = accesslevels();
			_localctx.authorizeRet.addAll(((AuthorizedContext)_localctx).a.accessLevelsRet);
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
	public static class AccesslevelsParamContext extends ParserRuleContext {
		public ArrayList<Expression> accessLevelsParamRet;
		public Token id;
		public Token s;
		public AccesslevelsContext a;
		public TerminalNode NULL() { return getToken(SOACTParser.NULL, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 30, RULE_accesslevelsParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AccesslevelsParamContext)_localctx).accessLevelsParamRet =  new ArrayList<>();
			setState(309);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(301);
				((AccesslevelsParamContext)_localctx).id = match(IDENTIFIER);
				_localctx.accessLevelsParamRet.add(Identifier.createId((((AccesslevelsParamContext)_localctx).id!=null?((AccesslevelsParamContext)_localctx).id.getText():null), (((AccesslevelsParamContext)_localctx).id!=null?((AccesslevelsParamContext)_localctx).id.getLine():0)));
				}
				break;
			case NULL:
				{
				setState(303);
				match(NULL);
				}
				break;
			case SELF:
				{
				setState(304);
				((AccesslevelsParamContext)_localctx).s = match(SELF);
				_localctx.accessLevelsParamRet.add(Identifier.createId((((AccesslevelsParamContext)_localctx).s!=null?((AccesslevelsParamContext)_localctx).s.getText():null), (((AccesslevelsParamContext)_localctx).s!=null?((AccesslevelsParamContext)_localctx).s.getLine():0)));
				}
				break;
			case PUBLIC:
			case PRIVATE:
				{
				setState(306);
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
			setState(311);
			((ForLoopContext)_localctx).def = match(FOR);
			setState(312);
			((ForLoopContext)_localctx).c = forLoopCondition();
			setState(313);
			match(LBRACE);
			setState(314);
			((ForLoopContext)_localctx).b = body();
			((ForLoopContext)_localctx).forRet =  new ForStatement(((ForLoopContext)_localctx).c.condRet, ((ForLoopContext)_localctx).b.bodyRet, (((ForLoopContext)_localctx).def!=null?((ForLoopContext)_localctx).def.getLine():0));
			setState(316);
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
			setState(319);
			match(LPAR);
			setState(320);
			((ForLoopConditionContext)_localctx).id = match(IDENTIFIER);
			_localctx.condRet.add(Identifier.createId((((ForLoopConditionContext)_localctx).id!=null?((ForLoopConditionContext)_localctx).id.getText():null), (((ForLoopConditionContext)_localctx).id!=null?((ForLoopConditionContext)_localctx).id.getLine():0)));
			setState(322);
			match(IN);
			setState(328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(323);
				((ForLoopConditionContext)_localctx).rangeId = match(IDENTIFIER);
				_localctx.condRet.add(Identifier.createId((((ForLoopConditionContext)_localctx).rangeId!=null?((ForLoopConditionContext)_localctx).rangeId.getText():null), (((ForLoopConditionContext)_localctx).rangeId!=null?((ForLoopConditionContext)_localctx).rangeId.getLine():0)));
				}
				break;
			case RANGE:
				{
				setState(325);
				((ForLoopConditionContext)_localctx).r = ((ForLoopConditionContext)_localctx).range = range();
				_localctx.condRet.addAll(((ForLoopConditionContext)_localctx).range.rangeRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(330);
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
		public ArrayList<Expression> rangeRet;
		public Token id1;
		public Token i1;
		public Token id2;
		public Token i2;
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
			setState(333);
			match(RANGE);
			setState(334);
			match(LPAR);
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(335);
				((RangeContext)_localctx).id1 = match(IDENTIFIER);
				_localctx.rangeRet.add(Identifier.createId((((RangeContext)_localctx).id1!=null?((RangeContext)_localctx).id1.getText():null), (((RangeContext)_localctx).id1!=null?((RangeContext)_localctx).id1.getLine():0)));
				}
				break;
			case INT_VALUE:
				{
				setState(337);
				((RangeContext)_localctx).i1 = match(INT_VALUE);
				_localctx.rangeRet.add(new IntValue((((RangeContext)_localctx).i1!=null?Integer.valueOf(((RangeContext)_localctx).i1.getText()):0)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(341);
			match(COMMA);
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(342);
				((RangeContext)_localctx).id2 = match(IDENTIFIER);
				_localctx.rangeRet.add(Identifier.createId((((RangeContext)_localctx).id2!=null?((RangeContext)_localctx).id2.getText():null), (((RangeContext)_localctx).id2!=null?((RangeContext)_localctx).id2.getLine():0)));
				}
				break;
			case INT_VALUE:
				{
				setState(344);
				((RangeContext)_localctx).i2 = match(INT_VALUE);
				_localctx.rangeRet.add(new IntValue((((RangeContext)_localctx).i2!=null?Integer.valueOf(((RangeContext)_localctx).i2.getText()):0)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(348);
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
		public WhileStatement whileRet;
		public Token def;
		public ExpressionContext ex;
		public BodyContext b;
		public BodyContext body;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
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
			setState(350);
			((WhileLoopContext)_localctx).def = match(WHILE);
			setState(351);
			match(LPAR);
			setState(352);
			((WhileLoopContext)_localctx).ex = expression(0);
			setState(353);
			match(RPAR);
			setState(354);
			match(LBRACE);
			setState(355);
			((WhileLoopContext)_localctx).b = ((WhileLoopContext)_localctx).body = body();
			((WhileLoopContext)_localctx).whileRet =  new WhileStatement(((WhileLoopContext)_localctx).ex.expRet, ((WhileLoopContext)_localctx).body.bodyRet, (((WhileLoopContext)_localctx).def!=null?((WhileLoopContext)_localctx).def.getLine():0));
			setState(357);
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
			setState(359);
			((IfBlockContext)_localctx).def = match(IF);
			((IfBlockContext)_localctx).ifRet =  new IfStatement((((IfBlockContext)_localctx).def!=null?((IfBlockContext)_localctx).def.getLine():0));
			setState(361);
			match(LPAR);
			setState(362);
			((IfBlockContext)_localctx).ifExp = expression(0);
			_localctx.ifRet.setIfConds(((IfBlockContext)_localctx).ifExp.expRet);
			setState(364);
			match(RPAR);
			setState(365);
			match(LBRACE);
			setState(366);
			((IfBlockContext)_localctx).ifBody = body();
			_localctx.ifRet.setIfBody(((IfBlockContext)_localctx).ifBody.bodyRet);
			setState(368);
			match(RBRACE);
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(369);
					((IfBlockContext)_localctx).elif = match(ELSE);
					setState(370);
					match(IF);
					setState(371);
					match(LPAR);
					setState(372);
					((IfBlockContext)_localctx).elseIfExp = expression(0);
					_localctx.ifRet.addElseIfcond(((IfBlockContext)_localctx).elseIfExp.expRet);
					setState(374);
					match(RPAR);
					setState(375);
					match(LBRACE);
					setState(376);
					((IfBlockContext)_localctx).elseIfBody = body();
					_localctx.ifRet.addElseIfBody(((IfBlockContext)_localctx).elseIfBody.bodyRet);
					setState(378);
					match(RBRACE);
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(385);
				match(ELSE);
				setState(386);
				match(LBRACE);
				setState(387);
				((IfBlockContext)_localctx).elseBody = body();
				_localctx.ifRet.setElseBody(((IfBlockContext)_localctx).elseBody.bodyRet);
				setState(389);
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
			setState(393);
			((JoinBlockContext)_localctx).def = match(JOIN);
			((JoinBlockContext)_localctx).joinRet =  new JoinStatement((((JoinBlockContext)_localctx).def!=null?((JoinBlockContext)_localctx).def.getLine():0));
			setState(395);
			match(LBRACE);
			setState(396);
			((JoinBlockContext)_localctx).jb = joinBlockBody();
			_localctx.joinRet.setBody(((JoinBlockContext)_localctx).jb.joinBodyRet);
			setState(398);
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
			setState(401);
			((JoinBlockBodyContext)_localctx).b1 = body();
			_localctx.joinBodyRet.addAll(((JoinBlockBodyContext)_localctx).b1.bodyRet);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(403);
				((JoinBlockBodyContext)_localctx).p = pipeStatement();
				_localctx.joinBodyRet.add(((JoinBlockBodyContext)_localctx).p.pipeRet);
				setState(405);
				((JoinBlockBodyContext)_localctx).b2 = body();
				_localctx.joinBodyRet.addAll(((JoinBlockBodyContext)_localctx).b2.bodyRet);
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
		public TerminalNode ASSIGN() { return getToken(SOACTParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
			setState(410);
			((PipeStatementContext)_localctx).assignee = expression(0);
			((PipeStatementContext)_localctx).pipeRet =  new PipeStatement(((PipeStatementContext)_localctx).assignee.expRet.getLine());
			     _localctx.pipeRet.setAssignee(((PipeStatementContext)_localctx).assignee.expRet);
			setState(412);
			match(ASSIGN);
			setState(413);
			((PipeStatementContext)_localctx).assigned = expression(0);
			_localctx.pipeRet.setAssigned(((PipeStatementContext)_localctx).assigned.expRet);
			setState(419); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(415);
				match(PIPE_OP);
				setState(416);
				((PipeStatementContext)_localctx).pipeExp = expression(0);
				_localctx.pipeRet.addPipeExp(((PipeStatementContext)_localctx).pipeExp.expRet);
				}
				}
				setState(421); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE_OP );
			setState(423);
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
		public Main mainRet;
		public Token m;
		public BodyContext b;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(SOACTParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SOACTParser.RBRACE, 0); }
		public TerminalNode MAIN() { return getToken(SOACTParser.MAIN, 0); }
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
			setState(425);
			((MainContext)_localctx).m = match(MAIN);
			setState(426);
			match(LPAR);
			setState(427);
			match(RPAR);
			setState(428);
			match(LBRACE);
			setState(429);
			((MainContext)_localctx).b = body();
			((MainContext)_localctx).mainRet =  new Main(((MainContext)_localctx).b.bodyRet); _localctx.mainRet.setLine((((MainContext)_localctx).m!=null?((MainContext)_localctx).m.getLine():0)); 
			setState(431);
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
		public Token c;
		public Token b;
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
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(449);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FOR:
						{
						setState(434);
						((BodyContext)_localctx).f1 = forLoop();
						_localctx.bodyRet.add(((BodyContext)_localctx).f1.forRet);
						}
						break;
					case WHILE:
						{
						setState(437);
						((BodyContext)_localctx).w1 = whileLoop();
						_localctx.bodyRet.add(((BodyContext)_localctx).w1.whileRet);
						}
						break;
					case IF:
						{
						setState(440);
						((BodyContext)_localctx).i1 = ifBlock();
						_localctx.bodyRet.add(((BodyContext)_localctx).i1.ifRet);
						}
						break;
					case JOIN:
						{
						setState(443);
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
						setState(446);
						((BodyContext)_localctx).s1 = statements();
						_localctx.bodyRet.add(((BodyContext)_localctx).s1.statementRet);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(453);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BREAK || _la==CONTINUE) {
				{
				{
				setState(458);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONTINUE:
					{
					{
					setState(454);
					((BodyContext)_localctx).c = match(CONTINUE);
					ContinueStatement continueStatement = new ContinueStatement(); continueStatement.setLine((((BodyContext)_localctx).c!=null?((BodyContext)_localctx).c.getLine():0)); _localctx.bodyRet.add(continueStatement);
					}
					}
					break;
				case BREAK:
					{
					{
					setState(456);
					((BodyContext)_localctx).b = match(BREAK);
					BreakStatement breakStatement = new BreakStatement(); breakStatement.setLine((((BodyContext)_localctx).b!=null?((BodyContext)_localctx).b.getLine():0)); _localctx.bodyRet.add(breakStatement);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(460);
				match(SEMICOLON);
				}
				setState(479);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(477);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case FOR:
							{
							setState(462);
							((BodyContext)_localctx).f2 = forLoop();
							_localctx.bodyRet.add(((BodyContext)_localctx).f2.forRet);
							}
							break;
						case WHILE:
							{
							setState(465);
							((BodyContext)_localctx).w2 = whileLoop();
							_localctx.bodyRet.add(((BodyContext)_localctx).w2.whileRet);
							}
							break;
						case IF:
							{
							setState(468);
							((BodyContext)_localctx).i2 = ifBlock();
							_localctx.bodyRet.add(((BodyContext)_localctx).i2.ifRet);
							}
							break;
						case JOIN:
							{
							setState(471);
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
							setState(474);
							((BodyContext)_localctx).s2 = statements();
							_localctx.bodyRet.add(((BodyContext)_localctx).s2.statementRet);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(481);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				((StatementsContext)_localctx).i = initStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).i.initRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				((StatementsContext)_localctx).a = assignStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).a.assignRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(490);
				((StatementsContext)_localctx).e = exprStatement();
				((StatementsContext)_localctx).statementRet =  ((StatementsContext)_localctx).e.expStatementRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
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
			Expression assigned = null;
			setState(499);
			((InitStatementContext)_localctx).i = init();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(500);
				((InitStatementContext)_localctx).assign = match(ASSIGN);
				setState(510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(501);
					((InitStatementContext)_localctx).c = constructorCall();
					assigned = ((InitStatementContext)_localctx).c.constructRet;
					}
					break;
				case 2:
					{
					setState(504);
					((InitStatementContext)_localctx).r = initRecord();
					assigned = ((InitStatementContext)_localctx).r.recordRet;
					}
					break;
				case 3:
					{
					setState(507);
					((InitStatementContext)_localctx).e = expression(0);
					assigned = ((InitStatementContext)_localctx).e.expRet;
					}
					break;
				}
				}
			}

			((InitStatementContext)_localctx).initRet =  new InitStatement(((InitStatementContext)_localctx).i.varRet, assigned, ((InitStatementContext)_localctx).i.varRet.getLine());
			setState(515);
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
	public static class ConstructorCallContext extends ParserRuleContext {
		public ConstructorExpression constructRet;
		public Token def;
		public Token id;
		public ExpressionListContext exp;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode NEW() { return getToken(SOACTParser.NEW, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
			setState(517);
			((ConstructorCallContext)_localctx).def = match(NEW);
			setState(518);
			((ConstructorCallContext)_localctx).id = match(IDENTIFIER);
			((ConstructorCallContext)_localctx).constructRet =  new ConstructorExpression(Identifier.createId((((ConstructorCallContext)_localctx).id!=null?((ConstructorCallContext)_localctx).id.getText():null) ,(((ConstructorCallContext)_localctx).id!=null?((ConstructorCallContext)_localctx).id.getLine():0)), (((ConstructorCallContext)_localctx).def!=null?((ConstructorCallContext)_localctx).def.getLine():0));
			setState(520);
			match(LPAR);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(521);
				((ConstructorCallContext)_localctx).exp = expressionList();
				_localctx.constructRet.setArgs(((ConstructorCallContext)_localctx).exp.expressionRet);
				}
			}

			setState(526);
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
			setState(528);
			((InitRecordContext)_localctx).name = match(IDENTIFIER);
			((InitRecordContext)_localctx).recordRet =  new InitRecord(Identifier.createId((((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getText():null) ,(((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getLine():0)), (((InitRecordContext)_localctx).name!=null?((InitRecordContext)_localctx).name.getLine():0));
			setState(530);
			match(LBRACE);
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(531);
					((InitRecordContext)_localctx).fi = match(IDENTIFIER);
					_localctx.recordRet.addFieldName(Identifier.createId((((InitRecordContext)_localctx).fi!=null?((InitRecordContext)_localctx).fi.getText():null) ,(((InitRecordContext)_localctx).fi!=null?((InitRecordContext)_localctx).fi.getLine():0)));
					setState(533);
					match(COLON);
					setState(534);
					((InitRecordContext)_localctx).fe = expression(0);
					_localctx.recordRet.addFieldValue(((InitRecordContext)_localctx).fe.expRet);
					setState(536);
					match(COMMA);
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(543);
			((InitRecordContext)_localctx).lfi = match(IDENTIFIER);
			_localctx.recordRet.addFieldName(Identifier.createId((((InitRecordContext)_localctx).lfi!=null?((InitRecordContext)_localctx).lfi.getText():null) ,(((InitRecordContext)_localctx).lfi!=null?((InitRecordContext)_localctx).lfi.getLine():0)));
			setState(545);
			match(COLON);
			setState(546);
			((InitRecordContext)_localctx).lfe = expression(0);
			_localctx.recordRet.addFieldValue(((InitRecordContext)_localctx).lfe.expRet);
			setState(548);
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
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(551);
				((AssignStatementContext)_localctx).id = match(IDENTIFIER);
				_localctx.assignRet.setLine((((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getLine():0));
				                      _localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getText():null) ,(((AssignStatementContext)_localctx).id!=null?((AssignStatementContext)_localctx).id.getLine():0)));
				}
				break;
			case SELF:
				{
				setState(553);
				((AssignStatementContext)_localctx).SELF = match(SELF);
				setState(554);
				match(DOT);
				setState(555);
				((AssignStatementContext)_localctx).id2 = match(IDENTIFIER);
				_localctx.assignRet.setLine((((AssignStatementContext)_localctx).SELF!=null?((AssignStatementContext)_localctx).SELF.getLine():0));
				                                                 _localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id2!=null?((AssignStatementContext)_localctx).id2.getText():null) ,(((AssignStatementContext)_localctx).id2!=null?((AssignStatementContext)_localctx).id2.getLine():0)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(559);
				match(DOT);
				setState(560);
				((AssignStatementContext)_localctx).id3 = match(IDENTIFIER);
				_localctx.assignRet.addIdentifier(Identifier.createId((((AssignStatementContext)_localctx).id3!=null?((AssignStatementContext)_localctx).id3.getText():null) ,(((AssignStatementContext)_localctx).id3!=null?((AssignStatementContext)_localctx).id3.getLine():0)));
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(567);
				arrayIndex();
				}
			}

			setState(570);
			((AssignStatementContext)_localctx).assign = match(ASSIGN);
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW) {
				{
				setState(571);
				match(NEW);
				}
			}

			setState(574);
			((AssignStatementContext)_localctx).exp = expression(0);
			_localctx.assignRet.setAssigned(((AssignStatementContext)_localctx).exp.expRet);
			setState(576);
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
	public static class ExprStatementContext extends ParserRuleContext {
		public ExpressionStatement expStatementRet;
		public ExpressionContext exp;
		public TerminalNode SEMICOLON() { return getToken(SOACTParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(578);
			((ExprStatementContext)_localctx).exp = expression(0);
			((ExprStatementContext)_localctx).expStatementRet =  new ExpressionStatement(((ExprStatementContext)_localctx).exp.expRet, ((ExprStatementContext)_localctx).exp.expRet.getLine());
			setState(580);
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
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(587);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENTIFIER:
					{
					setState(583);
					((ObserveStatementContext)_localctx).id1 = match(IDENTIFIER);
					line = (((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getLine():0);
					                          _localctx.observeRet.addId(Identifier.createId((((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getText():null), (((ObserveStatementContext)_localctx).id1!=null?((ObserveStatementContext)_localctx).id1.getLine():0)));
					}
					break;
				case SELF:
					{
					setState(585);
					((ObserveStatementContext)_localctx).s = match(SELF);
					line = (((ObserveStatementContext)_localctx).s!=null?((ObserveStatementContext)_localctx).s.getLine():0);
					                    _localctx.observeRet.addId(Identifier.createId((((ObserveStatementContext)_localctx).s!=null?((ObserveStatementContext)_localctx).s.getText():null), (((ObserveStatementContext)_localctx).s!=null?((ObserveStatementContext)_localctx).s.getLine():0)));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(589);
				match(DOT);
				}
				break;
			}
			setState(592);
			((ObserveStatementContext)_localctx).id = match(IDENTIFIER);
			if(line == -1)
			                         line = (((ObserveStatementContext)_localctx).id!=null?((ObserveStatementContext)_localctx).id.getLine():0);
			                     _localctx.observeRet.setLine(line);
			                     _localctx.observeRet.addId(Identifier.createId((((ObserveStatementContext)_localctx).id!=null?((ObserveStatementContext)_localctx).id.getText():null), (((ObserveStatementContext)_localctx).id!=null?((ObserveStatementContext)_localctx).id.getLine():0)));
			setState(594);
			match(LPAR);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(595);
				((ObserveStatementContext)_localctx).exp = expression(0);
				_localctx.observeRet.setArgs(((ObserveStatementContext)_localctx).exp.expRet);
				}
			}

			setState(600);
			match(RPAR);
			setState(601);
			match(OBSERVERS);
			setState(602);
			match(LPAR);
			setState(603);
			((ObserveStatementContext)_localctx).a = accesslevels();
			_localctx.observeRet.setObservers(((ObserveStatementContext)_localctx).a.accessLevelsRet);
			setState(605);
			match(RPAR);
			setState(606);
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
	public static class ExpressionListContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
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
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ExpressionListContext)_localctx).expressionRet =  new ExpressionList(); 
			setState(609);
			((ExpressionListContext)_localctx).e1 = expression(0);
			 ((ExpressionListContext)_localctx).expressionRet =  ((ExpressionListContext)_localctx).e1.expRet; 
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(611);
				match(COMMA);
				setState(612);
				((ExpressionListContext)_localctx).e2 = expression(0);

				        if (_localctx.expressionRet instanceof ExpressionList) {
				            ((ExpressionList) _localctx.expressionRet).add(((ExpressionListContext)_localctx).e2.expRet);
				        } else {
				            ((ExpressionListContext)_localctx).expressionRet =  new ExpressionList(_localctx.expressionRet);
				            _localctx.expressionRet.add(((ExpressionListContext)_localctx).e2.expRet);

				        }
				    
				}
				}
				setState(619);
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
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public ExpressionContext e4;
		public ExpressionContext e10;
		public ExpressionContext e12;
		public ExpressionContext e14;
		public ExpressionContext e16;
		public ExpressionContext e18;
		public ExpressionContext e20;
		public Token para;
		public ExpressionContext e6;
		public Token un;
		public ExpressionContext e7;
		public Token un_;
		public ExpressionContext e8;
		public Token excla;
		public ExpressionContext e9;
		public Token lb;
		public ExpressionListContext e22;
		public PrimaryExpressionContext primary;
		public ExpressionContext e5;
		public Token op;
		public ExpressionContext e11;
		public ExpressionContext e13;
		public ExpressionContext e15;
		public ExpressionContext e17;
		public ExpressionContext e19;
		public ExpressionContext e21;
		public ExpressionContext e3;
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INCREMENT() { return getToken(SOACTParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(SOACTParser.DECREMENT, 0); }
		public TerminalNode MINUS() { return getToken(SOACTParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SOACTParser.NOT, 0); }
		public TerminalNode RBRACK() { return getToken(SOACTParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(SOACTParser.LBRACK, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SOACTParser.DOT, 0); }
		public TerminalNode MULT() { return getToken(SOACTParser.MULT, 0); }
		public TerminalNode DIVIDE() { return getToken(SOACTParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(SOACTParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SOACTParser.PLUS, 0); }
		public TerminalNode LESS_THAN() { return getToken(SOACTParser.LESS_THAN, 0); }
		public TerminalNode GREATER_THAN() { return getToken(SOACTParser.GREATER_THAN, 0); }
		public TerminalNode EQUAL() { return getToken(SOACTParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(SOACTParser.NOT_EQUAL, 0); }
		public TerminalNode AND() { return getToken(SOACTParser.AND, 0); }
		public TerminalNode OR() { return getToken(SOACTParser.OR, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				setState(621);
				((ExpressionContext)_localctx).para = match(LPAR);
				setState(622);
				((ExpressionContext)_localctx).e6 = expression(0);
				setState(623);
				match(RPAR);

				        ((ExpressionContext)_localctx).expRet =  ((ExpressionContext)_localctx).e6.expRet;
				        _localctx.expRet.setLine((((ExpressionContext)_localctx).para!=null?((ExpressionContext)_localctx).para.getLine():0));
				    
				}
				break;
			case INCREMENT:
			case DECREMENT:
				{
				setState(626);
				((ExpressionContext)_localctx).un = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
					((ExpressionContext)_localctx).un = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(627);
				((ExpressionContext)_localctx).e7 = expression(11);

				        String opText = (((ExpressionContext)_localctx).un!=null?((ExpressionContext)_localctx).un.getText():null);
				        UnaryOperator op = (opText.equals("++")) ? UnaryOperator.PRE_INC : UnaryOperator.PRE_DEC;
				        ((ExpressionContext)_localctx).expRet =  new UnaryExpression(((ExpressionContext)_localctx).e7.expRet, op);
				        _localctx.expRet.setLine((((ExpressionContext)_localctx).un!=null?((ExpressionContext)_localctx).un.getLine():0));
				    
				}
				break;
			case MINUS:
				{
				setState(630);
				((ExpressionContext)_localctx).un_ = match(MINUS);
				setState(631);
				((ExpressionContext)_localctx).e8 = expression(10);

				        ((ExpressionContext)_localctx).expRet =  new UnaryExpression(((ExpressionContext)_localctx).e8.expRet, UnaryOperator.MINUS);
				        _localctx.expRet.setLine((((ExpressionContext)_localctx).un_!=null?((ExpressionContext)_localctx).un_.getLine():0));
				    
				}
				break;
			case NOT:
				{
				setState(634);
				((ExpressionContext)_localctx).excla = match(NOT);
				setState(635);
				((ExpressionContext)_localctx).e9 = expression(9);

				        ((ExpressionContext)_localctx).expRet =  new UnaryExpression(((ExpressionContext)_localctx).e9.expRet, UnaryOperator.NOT);
				        _localctx.expRet.setLine((((ExpressionContext)_localctx).excla!=null?((ExpressionContext)_localctx).excla.getLine():0));
				    
				}
				break;
			case LBRACK:
				{
				setState(638);
				((ExpressionContext)_localctx).lb = match(LBRACK);
				setState(639);
				((ExpressionContext)_localctx).e22 = expressionList();
				setState(640);
				match(RBRACK);

				        ((ExpressionContext)_localctx).expRet =  ((ExpressionContext)_localctx).e22.expressionRet;
				        _localctx.expRet.setLine((((ExpressionContext)_localctx).lb!=null?((ExpressionContext)_localctx).lb.getLine():0));
				    
				}
				break;
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
				{
				setState(643);
				((ExpressionContext)_localctx).primary = primaryExpression();

				        ((ExpressionContext)_localctx).expRet =  ((ExpressionContext)_localctx).primary.primaryExpRet;
				        _localctx.expRet.setLine(((ExpressionContext)_localctx).primary.primaryExpRet.getLine());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(697);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(648);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(649);
						match(DOT);
						setState(650);
						((ExpressionContext)_localctx).e5 = expression(14);

						                  ((ExpressionContext)_localctx).expRet =  new AccessExpression(((ExpressionContext)_localctx).e4.expRet, ((ExpressionContext)_localctx).e5.expRet);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e4.expRet.getLine());
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e10 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(653);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(654);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(655);
						((ExpressionContext)_localctx).e11 = expression(9);

						                  String opText = (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null);
						                  BinaryOperator op = (opText.equals("*")) ? BinaryOperator.MULT :
						                      (opText.equals("/")) ? BinaryOperator.DIVIDE : BinaryOperator.MOD;
						                  ((ExpressionContext)_localctx).expRet =  new BinaryExpression(((ExpressionContext)_localctx).e10.expRet, ((ExpressionContext)_localctx).e11.expRet, op);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e10.expRet.getLine());
						              
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e12 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(658);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(659);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(660);
						((ExpressionContext)_localctx).e13 = expression(8);

						                  String opText = (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null);
						                  BinaryOperator op = (opText.equals("+")) ? BinaryOperator.PLUS : BinaryOperator.MINUS;
						                  ((ExpressionContext)_localctx).expRet =  new BinaryExpression(((ExpressionContext)_localctx).e12.expRet, ((ExpressionContext)_localctx).e13.expRet, op);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e12.expRet.getLine());
						              
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e14 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(663);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(664);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GREATER_THAN || _la==LESS_THAN) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(665);
						((ExpressionContext)_localctx).e15 = expression(7);

						                  String opText = (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null);
						                  BinaryOperator op = (opText.equals("<")) ? BinaryOperator.LESS_THAN : BinaryOperator.GREATER_THAN;
						                  ((ExpressionContext)_localctx).expRet =  new BinaryExpression(((ExpressionContext)_localctx).e14.expRet, ((ExpressionContext)_localctx).e15.expRet, op);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e14.expRet.getLine());
						              
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e16 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(668);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(669);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(670);
						((ExpressionContext)_localctx).e17 = expression(6);

						                  String opText = (((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null);
						                  BinaryOperator op = (opText.equals("==")) ? BinaryOperator.EQUAL : BinaryOperator.NOT_EQUAL;
						                  ((ExpressionContext)_localctx).expRet =  new BinaryExpression(((ExpressionContext)_localctx).e16.expRet, ((ExpressionContext)_localctx).e17.expRet, op);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e16.expRet.getLine());
						              
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e18 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(673);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(674);
						((ExpressionContext)_localctx).op = match(AND);
						setState(675);
						((ExpressionContext)_localctx).e19 = expression(5);

						                  ((ExpressionContext)_localctx).expRet =  new BinaryExpression(((ExpressionContext)_localctx).e18.expRet, ((ExpressionContext)_localctx).e19.expRet, BinaryOperator.AND);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e18.expRet.getLine());
						              
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e20 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(678);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(679);
						((ExpressionContext)_localctx).op = match(OR);
						setState(680);
						((ExpressionContext)_localctx).e21 = expression(4);

						                  ((ExpressionContext)_localctx).expRet =  new BinaryExpression(((ExpressionContext)_localctx).e20.expRet, ((ExpressionContext)_localctx).e21.expRet, BinaryOperator.OR);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e20.expRet.getLine());
						              
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(688);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INCREMENT:
							{
							setState(684);
							match(INCREMENT);
							 ((ExpressionContext)_localctx).expRet =  new UnaryExpression(((ExpressionContext)_localctx).e1.expRet, UnaryOperator.POST_INC); 
							}
							break;
						case DECREMENT:
							{
							setState(686);
							match(DECREMENT);
							 ((ExpressionContext)_localctx).expRet =  new UnaryExpression(((ExpressionContext)_localctx).e1.expRet, UnaryOperator.POST_DEC); 
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						 _localctx.expRet.setLine(((ExpressionContext)_localctx).e1.expRet.getLine()); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(691);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(692);
						match(LBRACK);
						setState(693);
						((ExpressionContext)_localctx).e3 = expression(0);
						setState(694);
						match(RBRACK);

						                  ((ExpressionContext)_localctx).expRet =  new BinaryExpression(((ExpressionContext)_localctx).e2.expRet, ((ExpressionContext)_localctx).e3.expRet, BinaryOperator.INDEXING);
						                  _localctx.expRet.setLine(((ExpressionContext)_localctx).e2.expRet.getLine());
						              
						}
						break;
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public Expression primaryExpRet;
		public PrimitivesValsContext p;
		public HandlerCallContext h;
		public CustomPrimAccessContext c;
		public Token i;
		public Token s;
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
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_primaryExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(702);
				((PrimaryExpressionContext)_localctx).p = primitivesVals();
				 ((PrimaryExpressionContext)_localctx).primaryExpRet =  ((PrimaryExpressionContext)_localctx).p.valRet; 
				}
				break;
			case 2:
				{
				setState(705);
				((PrimaryExpressionContext)_localctx).h = handlerCall();
				 ((PrimaryExpressionContext)_localctx).primaryExpRet =  ((PrimaryExpressionContext)_localctx).h.callExpRet; 
				}
				break;
			case 3:
				{
				setState(708);
				((PrimaryExpressionContext)_localctx).c = customPrimAccess();
				 ((PrimaryExpressionContext)_localctx).primaryExpRet =  ((PrimaryExpressionContext)_localctx).c.customPrimAccessRet; 
				}
				break;
			case 4:
				{
				setState(711);
				((PrimaryExpressionContext)_localctx).i = match(IDENTIFIER);

				              Expression idExp = Identifier.createId((((PrimaryExpressionContext)_localctx).i!=null?((PrimaryExpressionContext)_localctx).i.getText():null), (((PrimaryExpressionContext)_localctx).i!=null?((PrimaryExpressionContext)_localctx).i.getLine():0));
				              idExp.setLine((((PrimaryExpressionContext)_localctx).i!=null?((PrimaryExpressionContext)_localctx).i.getLine():0));
				              ((PrimaryExpressionContext)_localctx).primaryExpRet =  idExp;
				      
				}
				break;
			case 5:
				{
				setState(713);
				((PrimaryExpressionContext)_localctx).s = match(SELF);
				 ((PrimaryExpressionContext)_localctx).primaryExpRet =  new SelfExpression(); 
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
	public static class CustomPrimAccessContext extends ParserRuleContext {
		public CustomPrimAccessExpression customPrimAccessRet;
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
		enterRule(_localctx, 72, RULE_customPrimAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			((CustomPrimAccessContext)_localctx).id1 = match(IDENTIFIER);
			setState(718);
			match(COLON);
			setState(719);
			match(COLON);
			setState(720);
			((CustomPrimAccessContext)_localctx).id2 = match(IDENTIFIER);

			    ((CustomPrimAccessContext)_localctx).customPrimAccessRet =  new CustomPrimAccessExpression(
			        Identifier.createId((((CustomPrimAccessContext)_localctx).id1!=null?((CustomPrimAccessContext)_localctx).id1.getText():null), (((CustomPrimAccessContext)_localctx).id1!=null?((CustomPrimAccessContext)_localctx).id1.getLine():0)),
			        Identifier.createId((((CustomPrimAccessContext)_localctx).id2!=null?((CustomPrimAccessContext)_localctx).id2.getText():null), (((CustomPrimAccessContext)_localctx).id2!=null?((CustomPrimAccessContext)_localctx).id2.getLine():0)));
			    _localctx.customPrimAccessRet.setLine((((CustomPrimAccessContext)_localctx).id1!=null?((CustomPrimAccessContext)_localctx).id1.getLine():0));
			    
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
		public CallExpression callExpRet;
		public Token p;
		public Token tl;
		public Token tu;
		public Token rv;
		public Token a;
		public Token i;
		public Token rm;
		public Token l;
		public Token id;
		public ExpressionListContext exp;
		public TerminalNode LPAR() { return getToken(SOACTParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(SOACTParser.RPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SOACTParser.IDENTIFIER, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		enterRule(_localctx, 74, RULE_handlerCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((HandlerCallContext)_localctx).callExpRet =  new CallExpression();
			setState(742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				{
				setState(724);
				((HandlerCallContext)_localctx).p = match(PRINT);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).p.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).p!=null?((HandlerCallContext)_localctx).p.getText():null));
				        
				}
				}
				break;
			case TOLOWER:
				{
				{
				setState(726);
				((HandlerCallContext)_localctx).tl = match(TOLOWER);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).tl.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).tl!=null?((HandlerCallContext)_localctx).tl.getText():null));

				        
				}
				}
				break;
			case TOUPPER:
				{
				{
				setState(728);
				((HandlerCallContext)_localctx).tu = match(TOUPPER);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).tu.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).tu!=null?((HandlerCallContext)_localctx).tu.getText():null));

				        
				}
				}
				break;
			case REVERSE:
				{
				{
				setState(730);
				((HandlerCallContext)_localctx).rv = match(REVERSE);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).rv.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).rv!=null?((HandlerCallContext)_localctx).rv.getText():null));

				        
				}
				}
				break;
			case ADD:
				{
				{
				setState(732);
				((HandlerCallContext)_localctx).a = match(ADD);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).a.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).a!=null?((HandlerCallContext)_localctx).a.getText():null));

				        
				}
				}
				break;
			case INCLUDE:
				{
				{
				setState(734);
				((HandlerCallContext)_localctx).i = match(INCLUDE);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).i.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).i!=null?((HandlerCallContext)_localctx).i.getText():null));
				        
				}
				}
				break;
			case REMOVE:
				{
				{
				setState(736);
				((HandlerCallContext)_localctx).rm = match(REMOVE);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).rm.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).rm!=null?((HandlerCallContext)_localctx).rm.getText():null));
				        
				}
				}
				break;
			case LENGTH:
				{
				{
				setState(738);
				((HandlerCallContext)_localctx).l = match(LENGTH);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).l.getLine());
				        _localctx.callExpRet.setHandlerName((((HandlerCallContext)_localctx).l!=null?((HandlerCallContext)_localctx).l.getText():null));
				        
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(740);
				((HandlerCallContext)_localctx).id = match(IDENTIFIER);

				        _localctx.callExpRet.setLine(((HandlerCallContext)_localctx).id.getLine());
				        _localctx.callExpRet.setIdentifier(Identifier.createId((((HandlerCallContext)_localctx).id!=null?((HandlerCallContext)_localctx).id.getText():null), (((HandlerCallContext)_localctx).id!=null?((HandlerCallContext)_localctx).id.getLine():0)));

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(744);
			match(LPAR);
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 7)) & ~0x3f) == 0 && ((1L << (_la - 7)) & 8076326339797778563L) != 0)) {
				{
				setState(745);
				((HandlerCallContext)_localctx).exp = expressionList();
				_localctx.callExpRet.setExpressions(((HandlerCallContext)_localctx).exp.expressionRet);
				}
			}

			setState(750);
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
		public Expression valRet;
		public Token i;
		public Token s;
		public Token t;
		public Token f;
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
		enterRule(_localctx, 76, RULE_primitivesVals);
		try {
			setState(760);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				((PrimitivesValsContext)_localctx).i = match(INT_VALUE);
				((PrimitivesValsContext)_localctx).valRet =  new IntValue((((PrimitivesValsContext)_localctx).i!=null?Integer.valueOf(((PrimitivesValsContext)_localctx).i.getText()):0));_localctx.valRet.setLine((((PrimitivesValsContext)_localctx).i!=null?((PrimitivesValsContext)_localctx).i.getLine():0));
				}
				break;
			case STRING_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				((PrimitivesValsContext)_localctx).s = match(STRING_VALUE);
				((PrimitivesValsContext)_localctx).valRet =  new StringValue((((PrimitivesValsContext)_localctx).s!=null?((PrimitivesValsContext)_localctx).s.getText():null)); _localctx.valRet.setLine((((PrimitivesValsContext)_localctx).s!=null?((PrimitivesValsContext)_localctx).s.getLine():0));
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				((PrimitivesValsContext)_localctx).t = match(TRUE);
				((PrimitivesValsContext)_localctx).valRet =  new BoolValue(true); _localctx.valRet.setLine((((PrimitivesValsContext)_localctx).t!=null?((PrimitivesValsContext)_localctx).t.getLine():0));
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(758);
				((PrimitivesValsContext)_localctx).f = match(FALSE);
				((PrimitivesValsContext)_localctx).valRet =  new BoolValue(false); _localctx.valRet.setLine((((PrimitivesValsContext)_localctx).f!=null?((PrimitivesValsContext)_localctx).f.getLine():0));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001G\u02fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"V\b\u0000\n\u0000\f\u0000Y\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0004\u0001f\b\u0001\u000b\u0001\f\u0001g\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002s\b\u0002\n\u0002\f\u0002v\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002{\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0080\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u0085\b\u0002\n\u0002\f\u0002\u0088\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u0093\b\u0003\n\u0003"+
		"\f\u0003\u0096\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a6\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00aa\b\u0004\n\u0004\f\u0004\u00ad"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00b7\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00c1\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00d2\b\u0007\u0001\b\u0001\b\u0003\b\u00d6\b\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00e4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00f1\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00f6\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00fe\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u010d\b\u000b\n\u000b\f\u000b\u0110\t\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u011c\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0136\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0149\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0154\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u015b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u017d\b\u0014"+
		"\n\u0014\f\u0014\u0180\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0188\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0199\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0004\u0017\u01a4\b\u0017\u000b\u0017\f\u0017\u01a5\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u01c2\b\u0019\n\u0019\f\u0019\u01c5\t\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01cb\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01de"+
		"\b\u0019\n\u0019\f\u0019\u01e1\t\u0019\u0003\u0019\u01e3\b\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u01f1\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01ff\b\u001b\u0003\u001b\u0201\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u020d\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u021b\b\u001d\n\u001d\f\u001d\u021e\t\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u022e\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0233\b\u001e\n\u001e\f\u001e\u0236\t\u001e\u0001\u001e\u0003\u001e"+
		"\u0239\b\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u023d\b\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u024c\b "+
		"\u0001 \u0003 \u024f\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u0257\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0268\b!\n!\f!\u026b"+
		"\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003"+
		"\"\u0287\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02b1\b\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u02ba\b\"\n\"\f\"\u02bd"+
		"\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u02cc\b#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u02e7\b%\u0001%\u0001%\u0001%\u0001%\u0003%\u02ed\b%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02f9"+
		"\b&\u0001&\u0000\u0001D\'\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJL\u0000\u0005"+
		"\u0001\u000056\u0001\u0000*,\u0001\u0000()\u0001\u000001\u0001\u0000."+
		"/\u0330\u0000N\u0001\u0000\u0000\u0000\u0002]\u0001\u0000\u0000\u0000"+
		"\u0004k\u0001\u0000\u0000\u0000\u0006\u008b\u0001\u0000\u0000\u0000\b"+
		"\u009b\u0001\u0000\u0000\u0000\n\u00c0\u0001\u0000\u0000\u0000\f\u00c2"+
		"\u0001\u0000\u0000\u0000\u000e\u00d1\u0001\u0000\u0000\u0000\u0010\u00d5"+
		"\u0001\u0000\u0000\u0000\u0012\u00dc\u0001\u0000\u0000\u0000\u0014\u00eb"+
		"\u0001\u0000\u0000\u0000\u0016\u0105\u0001\u0000\u0000\u0000\u0018\u0111"+
		"\u0001\u0000\u0000\u0000\u001a\u0116\u0001\u0000\u0000\u0000\u001c\u0125"+
		"\u0001\u0000\u0000\u0000\u001e\u012c\u0001\u0000\u0000\u0000 \u0137\u0001"+
		"\u0000\u0000\u0000\"\u013e\u0001\u0000\u0000\u0000$\u014c\u0001\u0000"+
		"\u0000\u0000&\u015e\u0001\u0000\u0000\u0000(\u0167\u0001\u0000\u0000\u0000"+
		"*\u0189\u0001\u0000\u0000\u0000,\u0190\u0001\u0000\u0000\u0000.\u019a"+
		"\u0001\u0000\u0000\u00000\u01a9\u0001\u0000\u0000\u00002\u01b1\u0001\u0000"+
		"\u0000\u00004\u01f0\u0001\u0000\u0000\u00006\u01f2\u0001\u0000\u0000\u0000"+
		"8\u0205\u0001\u0000\u0000\u0000:\u0210\u0001\u0000\u0000\u0000<\u0226"+
		"\u0001\u0000\u0000\u0000>\u0242\u0001\u0000\u0000\u0000@\u0246\u0001\u0000"+
		"\u0000\u0000B\u0260\u0001\u0000\u0000\u0000D\u0286\u0001\u0000\u0000\u0000"+
		"F\u02cb\u0001\u0000\u0000\u0000H\u02cd\u0001\u0000\u0000\u0000J\u02d3"+
		"\u0001\u0000\u0000\u0000L\u02f8\u0001\u0000\u0000\u0000NW\u0006\u0000"+
		"\uffff\uffff\u0000OP\u0003\u0004\u0002\u0000PQ\u0006\u0000\uffff\uffff"+
		"\u0000QV\u0001\u0000\u0000\u0000RS\u0003\u0002\u0001\u0000ST\u0006\u0000"+
		"\uffff\uffff\u0000TV\u0001\u0000\u0000\u0000UO\u0001\u0000\u0000\u0000"+
		"UR\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000XZ\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z[\u00030\u0018\u0000[\\\u0006\u0000\uffff\uffff\u0000\\\u0001"+
		"\u0001\u0000\u0000\u0000]^\u0005\'\u0000\u0000^_\u0005D\u0000\u0000_`"+
		"\u0006\u0001\uffff\uffff\u0000`e\u0005=\u0000\u0000ab\u0003\n\u0005\u0000"+
		"bc\u0006\u0001\uffff\uffff\u0000cd\u0005A\u0000\u0000df\u0001\u0000\u0000"+
		"\u0000ea\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005"+
		">\u0000\u0000j\u0003\u0001\u0000\u0000\u0000kl\u0005\u0001\u0000\u0000"+
		"lm\u0005D\u0000\u0000mn\u0006\u0002\uffff\uffff\u0000nt\u0005=\u0000\u0000"+
		"op\u0003\u0006\u0003\u0000pq\u0006\u0002\uffff\uffff\u0000qs\u0001\u0000"+
		"\u0000\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001"+
		"\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uz\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000wx\u0003\b\u0004\u0000xy\u0006\u0002\uffff\uffff"+
		"\u0000y{\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{\u007f\u0001\u0000\u0000\u0000|}\u0003\u0012\t\u0000}~\u0006"+
		"\u0002\uffff\uffff\u0000~\u0080\u0001\u0000\u0000\u0000\u007f|\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0086\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0003\u0014\n\u0000\u0082\u0083\u0006\u0002\uffff"+
		"\uffff\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0089\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005>\u0000"+
		"\u0000\u008a\u0005\u0001\u0000\u0000\u0000\u008b\u008c\u0005%\u0000\u0000"+
		"\u008c\u008d\u0005D\u0000\u0000\u008d\u008e\u0006\u0003\uffff\uffff\u0000"+
		"\u008e\u0094\u0005=\u0000\u0000\u008f\u0090\u0005D\u0000\u0000\u0090\u0091"+
		"\u0006\u0003\uffff\uffff\u0000\u0091\u0093\u0005?\u0000\u0000\u0092\u008f"+
		"\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005D\u0000\u0000\u0098\u0099\u0006\u0003\uffff\uffff\u0000\u0099\u009a"+
		"\u0005>\u0000\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0006"+
		"\u0004\uffff\uffff\u0000\u009c\u009d\u0005\u001c\u0000\u0000\u009d\u00ab"+
		"\u0005=\u0000\u0000\u009e\u009f\u0003\n\u0005\u0000\u009f\u00a5\u0006"+
		"\u0004\uffff\uffff\u0000\u00a0\u00a1\u00059\u0000\u0000\u00a1\u00a2\u0003"+
		"\u001a\r\u0000\u00a2\u00a3\u0006\u0004\uffff\uffff\u0000\u00a3\u00a4\u0005"+
		":\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005A\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a9\u009e\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005>\u0000\u0000\u00af\t\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0003\u000e\u0007\u0000\u00b1\u00b2\u0005D\u0000\u0000\u00b2"+
		"\u00b6\u0006\u0005\uffff\uffff\u0000\u00b3\u00b4\u0003\f\u0006\u0000\u00b4"+
		"\u00b5\u0006\u0005\uffff\uffff\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b3\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00c1\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003\u0018\f\u0000\u00b9"+
		"\u00ba\u0005D\u0000\u0000\u00ba\u00bb\u0006\u0005\uffff\uffff\u0000\u00bb"+
		"\u00c1\u0001\u0000\u0000\u0000\u00bc\u00bd\u0003\u0010\b\u0000\u00bd\u00be"+
		"\u0005D\u0000\u0000\u00be\u00bf\u0006\u0005\uffff\uffff\u0000\u00bf\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c0\u00b0\u0001\u0000\u0000\u0000\u00c0\u00b8"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c1\u000b"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005;\u0000\u0000\u00c3\u00c4\u0005"+
		"C\u0000\u0000\u00c4\u00c5\u0006\u0006\uffff\uffff\u0000\u00c5\u00c6\u0005"+
		"<\u0000\u0000\u00c6\r\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0002"+
		"\u0000\u0000\u00c8\u00d2\u0006\u0007\uffff\uffff\u0000\u00c9\u00ca\u0005"+
		"\u0004\u0000\u0000\u00ca\u00d2\u0006\u0007\uffff\uffff\u0000\u00cb\u00cc"+
		"\u0005\u000f\u0000\u0000\u00cc\u00d2\u0006\u0007\uffff\uffff\u0000\u00cd"+
		"\u00ce\u0005$\u0000\u0000\u00ce\u00d2\u0006\u0007\uffff\uffff\u0000\u00cf"+
		"\u00d0\u0005D\u0000\u0000\u00d0\u00d2\u0006\u0007\uffff\uffff\u0000\u00d1"+
		"\u00c7\u0001\u0000\u0000\u0000\u00d1\u00c9\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cb\u0001\u0000\u0000\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d1"+
		"\u00cf\u0001\u0000\u0000\u0000\u00d2\u000f\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0005\u001a\u0000\u0000\u00d4\u00d6\u0005\u001b\u0000\u0000\u00d5"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u00d8\u00051\u0000\u0000\u00d8\u00d9"+
		"\u0003\u000e\u0007\u0000\u00d9\u00da\u0006\b\uffff\uffff\u0000\u00da\u00db"+
		"\u00050\u0000\u0000\u00db\u0011\u0001\u0000\u0000\u0000\u00dc\u00dd\u0006"+
		"\t\uffff\uffff\u0000\u00dd\u00de\u0005D\u0000\u0000\u00de\u00df\u0006"+
		"\t\uffff\uffff\u0000\u00df\u00e3\u00059\u0000\u0000\u00e0\u00e1\u0003"+
		"\u0016\u000b\u0000\u00e1\u00e2\u0006\t\uffff\uffff\u0000\u00e2\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		":\u0000\u0000\u00e6\u00e7\u0005=\u0000\u0000\u00e7\u00e8\u00032\u0019"+
		"\u0000\u00e8\u00e9\u0006\t\uffff\uffff\u0000\u00e9\u00ea\u0005>\u0000"+
		"\u0000\u00ea\u0013\u0001\u0000\u0000\u0000\u00eb\u00f0\u0006\n\uffff\uffff"+
		"\u0000\u00ec\u00ed\u0005\u0006\u0000\u0000\u00ed\u00f1\u0006\n\uffff\uffff"+
		"\u0000\u00ee\u00ef\u0005\f\u0000\u0000\u00ef\u00f1\u0006\n\uffff\uffff"+
		"\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f5\u0001\u0000\u0000\u0000\u00f2\u00f3\u0003\u001c\u000e"+
		"\u0000\u00f3\u00f4\u0006\n\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005D\u0000\u0000"+
		"\u00f8\u00f9\u0006\n\uffff\uffff\u0000\u00f9\u00fd\u00059\u0000\u0000"+
		"\u00fa\u00fb\u0003\u0016\u000b\u0000\u00fb\u00fc\u0006\n\uffff\uffff\u0000"+
		"\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0005:\u0000\u0000\u0100\u0101\u0005=\u0000\u0000\u0101\u0102"+
		"\u00032\u0019\u0000\u0102\u0103\u0006\n\uffff\uffff\u0000\u0103\u0104"+
		"\u0005>\u0000\u0000\u0104\u0015\u0001\u0000\u0000\u0000\u0105\u0106\u0006"+
		"\u000b\uffff\uffff\u0000\u0106\u0107\u0003\n\u0005\u0000\u0107\u010e\u0006"+
		"\u000b\uffff\uffff\u0000\u0108\u0109\u0005?\u0000\u0000\u0109\u010a\u0003"+
		"\n\u0005\u0000\u010a\u010b\u0006\u000b\uffff\uffff\u0000\u010b\u010d\u0001"+
		"\u0000\u0000\u0000\u010c\u0108\u0001\u0000\u0000\u0000\u010d\u0110\u0001"+
		"\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0017\u0001\u0000\u0000\u0000\u0110\u010e\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0003\u000e\u0007\u0000\u0112\u0113\u0006"+
		"\f\uffff\uffff\u0000\u0113\u0114\u0005;\u0000\u0000\u0114\u0115\u0005"+
		"<\u0000\u0000\u0115\u0019\u0001\u0000\u0000\u0000\u0116\u011b\u0006\r"+
		"\uffff\uffff\u0000\u0117\u0118\u0005\r\u0000\u0000\u0118\u011c\u0006\r"+
		"\uffff\uffff\u0000\u0119\u011a\u0005\u0016\u0000\u0000\u011a\u011c\u0006"+
		"\r\uffff\uffff\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005"+
		"9\u0000\u0000\u011e\u011f\u0003\u001e\u000f\u0000\u011f\u0120\u0006\r"+
		"\uffff\uffff\u0000\u0120\u0121\u0005?\u0000\u0000\u0121\u0122\u0003\u001e"+
		"\u000f\u0000\u0122\u0123\u0006\r\uffff\uffff\u0000\u0123\u0124\u0005:"+
		"\u0000\u0000\u0124\u001b\u0001\u0000\u0000\u0000\u0125\u0126\u0006\u000e"+
		"\uffff\uffff\u0000\u0126\u0127\u0005\u0012\u0000\u0000\u0127\u0128\u0005"+
		"9\u0000\u0000\u0128\u0129\u0003\u001a\r\u0000\u0129\u012a\u0006\u000e"+
		"\uffff\uffff\u0000\u012a\u012b\u0005:\u0000\u0000\u012b\u001d\u0001\u0000"+
		"\u0000\u0000\u012c\u0135\u0006\u000f\uffff\uffff\u0000\u012d\u012e\u0005"+
		"D\u0000\u0000\u012e\u0136\u0006\u000f\uffff\uffff\u0000\u012f\u0136\u0005"+
		"\u0014\u0000\u0000\u0130\u0131\u0005\u0007\u0000\u0000\u0131\u0136\u0006"+
		"\u000f\uffff\uffff\u0000\u0132\u0133\u0003\u001a\r\u0000\u0133\u0134\u0006"+
		"\u000f\uffff\uffff\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u012d"+
		"\u0001\u0000\u0000\u0000\u0135\u012f\u0001\u0000\u0000\u0000\u0135\u0130"+
		"\u0001\u0000\u0000\u0000\u0135\u0132\u0001\u0000\u0000\u0000\u0136\u001f"+
		"\u0001\u0000\u0000\u0000\u0137\u0138\u0005\u000b\u0000\u0000\u0138\u0139"+
		"\u0003\"\u0011\u0000\u0139\u013a\u0005=\u0000\u0000\u013a\u013b\u0003"+
		"2\u0019\u0000\u013b\u013c\u0006\u0010\uffff\uffff\u0000\u013c\u013d\u0005"+
		">\u0000\u0000\u013d!\u0001\u0000\u0000\u0000\u013e\u013f\u0006\u0011\uffff"+
		"\uffff\u0000\u013f\u0140\u00059\u0000\u0000\u0140\u0141\u0005D\u0000\u0000"+
		"\u0141\u0142\u0006\u0011\uffff\uffff\u0000\u0142\u0148\u0005&\u0000\u0000"+
		"\u0143\u0144\u0005D\u0000\u0000\u0144\u0149\u0006\u0011\uffff\uffff\u0000"+
		"\u0145\u0146\u0003$\u0012\u0000\u0146\u0147\u0006\u0011\uffff\uffff\u0000"+
		"\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u0143\u0001\u0000\u0000\u0000"+
		"\u0148\u0145\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0005:\u0000\u0000\u014b#\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0006\u0012\uffff\uffff\u0000\u014d\u014e\u0005\u0013\u0000\u0000\u014e"+
		"\u0153\u00059\u0000\u0000\u014f\u0150\u0005D\u0000\u0000\u0150\u0154\u0006"+
		"\u0012\uffff\uffff\u0000\u0151\u0152\u0005C\u0000\u0000\u0152\u0154\u0006"+
		"\u0012\uffff\uffff\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0153\u0151"+
		"\u0001\u0000\u0000\u0000\u0154\u0155\u0001\u0000\u0000\u0000\u0155\u015a"+
		"\u0005?\u0000\u0000\u0156\u0157\u0005D\u0000\u0000\u0157\u015b\u0006\u0012"+
		"\uffff\uffff\u0000\u0158\u0159\u0005C\u0000\u0000\u0159\u015b\u0006\u0012"+
		"\uffff\uffff\u0000\u015a\u0156\u0001\u0000\u0000\u0000\u015a\u0158\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		":\u0000\u0000\u015d%\u0001\u0000\u0000\u0000\u015e\u015f\u0005\u0011\u0000"+
		"\u0000\u015f\u0160\u00059\u0000\u0000\u0160\u0161\u0003D\"\u0000\u0161"+
		"\u0162\u0005:\u0000\u0000\u0162\u0163\u0005=\u0000\u0000\u0163\u0164\u0003"+
		"2\u0019\u0000\u0164\u0165\u0006\u0013\uffff\uffff\u0000\u0165\u0166\u0005"+
		">\u0000\u0000\u0166\'\u0001\u0000\u0000\u0000\u0167\u0168\u0005\u0003"+
		"\u0000\u0000\u0168\u0169\u0006\u0014\uffff\uffff\u0000\u0169\u016a\u0005"+
		"9\u0000\u0000\u016a\u016b\u0003D\"\u0000\u016b\u016c\u0006\u0014\uffff"+
		"\uffff\u0000\u016c\u016d\u0005:\u0000\u0000\u016d\u016e\u0005=\u0000\u0000"+
		"\u016e\u016f\u00032\u0019\u0000\u016f\u0170\u0006\u0014\uffff\uffff\u0000"+
		"\u0170\u017e\u0005>\u0000\u0000\u0171\u0172\u0005\t\u0000\u0000\u0172"+
		"\u0173\u0005\u0003\u0000\u0000\u0173\u0174\u00059\u0000\u0000\u0174\u0175"+
		"\u0003D\"\u0000\u0175\u0176\u0006\u0014\uffff\uffff\u0000\u0176\u0177"+
		"\u0005:\u0000\u0000\u0177\u0178\u0005=\u0000\u0000\u0178\u0179\u00032"+
		"\u0019\u0000\u0179\u017a\u0006\u0014\uffff\uffff\u0000\u017a\u017b\u0005"+
		">\u0000\u0000\u017b\u017d\u0001\u0000\u0000\u0000\u017c\u0171\u0001\u0000"+
		"\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0187\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0182\u0005\t\u0000"+
		"\u0000\u0182\u0183\u0005=\u0000\u0000\u0183\u0184\u00032\u0019\u0000\u0184"+
		"\u0185\u0006\u0014\uffff\uffff\u0000\u0185\u0186\u0005>\u0000\u0000\u0186"+
		"\u0188\u0001\u0000\u0000\u0000\u0187\u0181\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u0001\u0000\u0000\u0000\u0188)\u0001\u0000\u0000\u0000\u0189\u018a"+
		"\u0005\u0015\u0000\u0000\u018a\u018b\u0006\u0015\uffff\uffff\u0000\u018b"+
		"\u018c\u0005=\u0000\u0000\u018c\u018d\u0003,\u0016\u0000\u018d\u018e\u0006"+
		"\u0015\uffff\uffff\u0000\u018e\u018f\u0005>\u0000\u0000\u018f+\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0006\u0016\uffff\uffff\u0000\u0191\u0192\u0003"+
		"2\u0019\u0000\u0192\u0198\u0006\u0016\uffff\uffff\u0000\u0193\u0194\u0003"+
		".\u0017\u0000\u0194\u0195\u0006\u0016\uffff\uffff\u0000\u0195\u0196\u0003"+
		"2\u0019\u0000\u0196\u0197\u0006\u0016\uffff\uffff\u0000\u0197\u0199\u0001"+
		"\u0000\u0000\u0000\u0198\u0193\u0001\u0000\u0000\u0000\u0198\u0199\u0001"+
		"\u0000\u0000\u0000\u0199-\u0001\u0000\u0000\u0000\u019a\u019b\u0003D\""+
		"\u0000\u019b\u019c\u0006\u0017\uffff\uffff\u0000\u019c\u019d\u00058\u0000"+
		"\u0000\u019d\u019e\u0003D\"\u0000\u019e\u01a3\u0006\u0017\uffff\uffff"+
		"\u0000\u019f\u01a0\u0005-\u0000\u0000\u01a0\u01a1\u0003D\"\u0000\u01a1"+
		"\u01a2\u0006\u0017\uffff\uffff\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a3\u019f\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005A\u0000\u0000\u01a8"+
		"/\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005 \u0000\u0000\u01aa\u01ab\u0005"+
		"9\u0000\u0000\u01ab\u01ac\u0005:\u0000\u0000\u01ac\u01ad\u0005=\u0000"+
		"\u0000\u01ad\u01ae\u00032\u0019\u0000\u01ae\u01af\u0006\u0018\uffff\uffff"+
		"\u0000\u01af\u01b0\u0005>\u0000\u0000\u01b01\u0001\u0000\u0000\u0000\u01b1"+
		"\u01c3\u0006\u0019\uffff\uffff\u0000\u01b2\u01b3\u0003 \u0010\u0000\u01b3"+
		"\u01b4\u0006\u0019\uffff\uffff\u0000\u01b4\u01c2\u0001\u0000\u0000\u0000"+
		"\u01b5\u01b6\u0003&\u0013\u0000\u01b6\u01b7\u0006\u0019\uffff\uffff\u0000"+
		"\u01b7\u01c2\u0001\u0000\u0000\u0000\u01b8\u01b9\u0003(\u0014\u0000\u01b9"+
		"\u01ba\u0006\u0019\uffff\uffff\u0000\u01ba\u01c2\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bc\u0003*\u0015\u0000\u01bc\u01bd\u0006\u0019\uffff\uffff\u0000"+
		"\u01bd\u01c2\u0001\u0000\u0000\u0000\u01be\u01bf\u00034\u001a\u0000\u01bf"+
		"\u01c0\u0006\u0019\uffff\uffff\u0000\u01c0\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c1\u01b2\u0001\u0000\u0000\u0000\u01c1\u01b5\u0001\u0000\u0000\u0000"+
		"\u01c1\u01b8\u0001\u0000\u0000\u0000\u01c1\u01bb\u0001\u0000\u0000\u0000"+
		"\u01c1\u01be\u0001\u0000\u0000\u0000\u01c2\u01c5\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000"+
		"\u01c4\u01e2\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u0005\u0010\u0000\u0000\u01c7\u01cb\u0006\u0019\uffff\uffff"+
		"\u0000\u01c8\u01c9\u0005\n\u0000\u0000\u01c9\u01cb\u0006\u0019\uffff\uffff"+
		"\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005A\u0000\u0000"+
		"\u01cd\u01df\u0001\u0000\u0000\u0000\u01ce\u01cf\u0003 \u0010\u0000\u01cf"+
		"\u01d0\u0006\u0019\uffff\uffff\u0000\u01d0\u01de\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0003&\u0013\u0000\u01d2\u01d3\u0006\u0019\uffff\uffff\u0000"+
		"\u01d3\u01de\u0001\u0000\u0000\u0000\u01d4\u01d5\u0003(\u0014\u0000\u01d5"+
		"\u01d6\u0006\u0019\uffff\uffff\u0000\u01d6\u01de\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d8\u0003*\u0015\u0000\u01d8\u01d9\u0006\u0019\uffff\uffff\u0000"+
		"\u01d9\u01de\u0001\u0000\u0000\u0000\u01da\u01db\u00034\u001a\u0000\u01db"+
		"\u01dc\u0006\u0019\uffff\uffff\u0000\u01dc\u01de\u0001\u0000\u0000\u0000"+
		"\u01dd\u01ce\u0001\u0000\u0000\u0000\u01dd\u01d1\u0001\u0000\u0000\u0000"+
		"\u01dd\u01d4\u0001\u0000\u0000\u0000\u01dd\u01d7\u0001\u0000\u0000\u0000"+
		"\u01dd\u01da\u0001\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000"+
		"\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e0\u01e3\u0001\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000"+
		"\u01e2\u01ca\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e33\u0001\u0000\u0000\u0000\u01e4\u01e5\u00036\u001b\u0000\u01e5\u01e6"+
		"\u0006\u001a\uffff\uffff\u0000\u01e6\u01f1\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0003<\u001e\u0000\u01e8\u01e9\u0006\u001a\uffff\uffff\u0000\u01e9"+
		"\u01f1\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003>\u001f\u0000\u01eb\u01ec"+
		"\u0006\u001a\uffff\uffff\u0000\u01ec\u01f1\u0001\u0000\u0000\u0000\u01ed"+
		"\u01ee\u0003@ \u0000\u01ee\u01ef\u0006\u001a\uffff\uffff\u0000\u01ef\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f0\u01e4\u0001\u0000\u0000\u0000\u01f0\u01e7"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ea\u0001\u0000\u0000\u0000\u01f0\u01ed"+
		"\u0001\u0000\u0000\u0000\u01f15\u0001\u0000\u0000\u0000\u01f2\u01f3\u0006"+
		"\u001b\uffff\uffff\u0000\u01f3\u0200\u0003\n\u0005\u0000\u01f4\u01fe\u0005"+
		"8\u0000\u0000\u01f5\u01f6\u00038\u001c\u0000\u01f6\u01f7\u0006\u001b\uffff"+
		"\uffff\u0000\u01f7\u01ff\u0001\u0000\u0000\u0000\u01f8\u01f9\u0003:\u001d"+
		"\u0000\u01f9\u01fa\u0006\u001b\uffff\uffff\u0000\u01fa\u01ff\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0003D\"\u0000\u01fc\u01fd\u0006\u001b\uffff"+
		"\uffff\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01f5\u0001\u0000"+
		"\u0000\u0000\u01fe\u01f8\u0001\u0000\u0000\u0000\u01fe\u01fb\u0001\u0000"+
		"\u0000\u0000\u01ff\u0201\u0001\u0000\u0000\u0000\u0200\u01f4\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0202\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0006\u001b\uffff\uffff\u0000\u0203\u0204\u0005"+
		"A\u0000\u0000\u02047\u0001\u0000\u0000\u0000\u0205\u0206\u0005#\u0000"+
		"\u0000\u0206\u0207\u0005D\u0000\u0000\u0207\u0208\u0006\u001c\uffff\uffff"+
		"\u0000\u0208\u020c\u00059\u0000\u0000\u0209\u020a\u0003B!\u0000\u020a"+
		"\u020b\u0006\u001c\uffff\uffff\u0000\u020b\u020d\u0001\u0000\u0000\u0000"+
		"\u020c\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000"+
		"\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0005:\u0000\u0000\u020f"+
		"9\u0001\u0000\u0000\u0000\u0210\u0211\u0005D\u0000\u0000\u0211\u0212\u0006"+
		"\u001d\uffff\uffff\u0000\u0212\u021c\u0005=\u0000\u0000\u0213\u0214\u0005"+
		"D\u0000\u0000\u0214\u0215\u0006\u001d\uffff\uffff\u0000\u0215\u0216\u0005"+
		"B\u0000\u0000\u0216\u0217\u0003D\"\u0000\u0217\u0218\u0006\u001d\uffff"+
		"\uffff\u0000\u0218\u0219\u0005?\u0000\u0000\u0219\u021b\u0001\u0000\u0000"+
		"\u0000\u021a\u0213\u0001\u0000\u0000\u0000\u021b\u021e\u0001\u0000\u0000"+
		"\u0000\u021c\u021a\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000"+
		"\u0000\u021d\u021f\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0005D\u0000\u0000\u0220\u0221\u0006\u001d\uffff\uffff"+
		"\u0000\u0221\u0222\u0005B\u0000\u0000\u0222\u0223\u0003D\"\u0000\u0223"+
		"\u0224\u0006\u001d\uffff\uffff\u0000\u0224\u0225\u0005>\u0000\u0000\u0225"+
		";\u0001\u0000\u0000\u0000\u0226\u022d\u0006\u001e\uffff\uffff\u0000\u0227"+
		"\u0228\u0005D\u0000\u0000\u0228\u022e\u0006\u001e\uffff\uffff\u0000\u0229"+
		"\u022a\u0005\u0007\u0000\u0000\u022a\u022b\u0005@\u0000\u0000\u022b\u022c"+
		"\u0005D\u0000\u0000\u022c\u022e\u0006\u001e\uffff\uffff\u0000\u022d\u0227"+
		"\u0001\u0000\u0000\u0000\u022d\u0229\u0001\u0000\u0000\u0000\u022e\u0234"+
		"\u0001\u0000\u0000\u0000\u022f\u0230\u0005@\u0000\u0000\u0230\u0231\u0005"+
		"D\u0000\u0000\u0231\u0233\u0006\u001e\uffff\uffff\u0000\u0232\u022f\u0001"+
		"\u0000\u0000\u0000\u0233\u0236\u0001\u0000\u0000\u0000\u0234\u0232\u0001"+
		"\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0238\u0001"+
		"\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0237\u0239\u0003"+
		"\f\u0006\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c\u00058\u0000"+
		"\u0000\u023b\u023d\u0005#\u0000\u0000\u023c\u023b\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0003D\"\u0000\u023f\u0240\u0006\u001e\uffff\uffff\u0000"+
		"\u0240\u0241\u0005A\u0000\u0000\u0241=\u0001\u0000\u0000\u0000\u0242\u0243"+
		"\u0003D\"\u0000\u0243\u0244\u0006\u001f\uffff\uffff\u0000\u0244\u0245"+
		"\u0005A\u0000\u0000\u0245?\u0001\u0000\u0000\u0000\u0246\u024e\u0006 "+
		"\uffff\uffff\u0000\u0247\u0248\u0005D\u0000\u0000\u0248\u024c\u0006 \uffff"+
		"\uffff\u0000\u0249\u024a\u0005\u0007\u0000\u0000\u024a\u024c\u0006 \uffff"+
		"\uffff\u0000\u024b\u0247\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000"+
		"\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024f\u0005@\u0000"+
		"\u0000\u024e\u024b\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0005D\u0000\u0000"+
		"\u0251\u0252\u0006 \uffff\uffff\u0000\u0252\u0256\u00059\u0000\u0000\u0253"+
		"\u0254\u0003D\"\u0000\u0254\u0255\u0006 \uffff\uffff\u0000\u0255\u0257"+
		"\u0001\u0000\u0000\u0000\u0256\u0253\u0001\u0000\u0000\u0000\u0256\u0257"+
		"\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000\u0000\u0258\u0259"+
		"\u0005:\u0000\u0000\u0259\u025a\u0005\u0005\u0000\u0000\u025a\u025b\u0005"+
		"9\u0000\u0000\u025b\u025c\u0003\u001a\r\u0000\u025c\u025d\u0006 \uffff"+
		"\uffff\u0000\u025d\u025e\u0005:\u0000\u0000\u025e\u025f\u0005A\u0000\u0000"+
		"\u025fA\u0001\u0000\u0000\u0000\u0260\u0261\u0006!\uffff\uffff\u0000\u0261"+
		"\u0262\u0003D\"\u0000\u0262\u0269\u0006!\uffff\uffff\u0000\u0263\u0264"+
		"\u0005?\u0000\u0000\u0264\u0265\u0003D\"\u0000\u0265\u0266\u0006!\uffff"+
		"\uffff\u0000\u0266\u0268\u0001\u0000\u0000\u0000\u0267\u0263\u0001\u0000"+
		"\u0000\u0000\u0268\u026b\u0001\u0000\u0000\u0000\u0269\u0267\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0001\u0000\u0000\u0000\u026aC\u0001\u0000\u0000"+
		"\u0000\u026b\u0269\u0001\u0000\u0000\u0000\u026c\u026d\u0006\"\uffff\uffff"+
		"\u0000\u026d\u026e\u00059\u0000\u0000\u026e\u026f\u0003D\"\u0000\u026f"+
		"\u0270\u0005:\u0000\u0000\u0270\u0271\u0006\"\uffff\uffff\u0000\u0271"+
		"\u0287\u0001\u0000\u0000\u0000\u0272\u0273\u0007\u0000\u0000\u0000\u0273"+
		"\u0274\u0003D\"\u000b\u0274\u0275\u0006\"\uffff\uffff\u0000\u0275\u0287"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u0005)\u0000\u0000\u0277\u0278\u0003"+
		"D\"\n\u0278\u0279\u0006\"\uffff\uffff\u0000\u0279\u0287\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u00054\u0000\u0000\u027b\u027c\u0003D\"\t\u027c\u027d"+
		"\u0006\"\uffff\uffff\u0000\u027d\u0287\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u0005;\u0000\u0000\u027f\u0280\u0003B!\u0000\u0280\u0281\u0005<\u0000"+
		"\u0000\u0281\u0282\u0006\"\uffff\uffff\u0000\u0282\u0287\u0001\u0000\u0000"+
		"\u0000\u0283\u0284\u0003F#\u0000\u0284\u0285\u0006\"\uffff\uffff\u0000"+
		"\u0285\u0287\u0001\u0000\u0000\u0000\u0286\u026c\u0001\u0000\u0000\u0000"+
		"\u0286\u0272\u0001\u0000\u0000\u0000\u0286\u0276\u0001\u0000\u0000\u0000"+
		"\u0286\u027a\u0001\u0000\u0000\u0000\u0286\u027e\u0001\u0000\u0000\u0000"+
		"\u0286\u0283\u0001\u0000\u0000\u0000\u0287\u02bb\u0001\u0000\u0000\u0000"+
		"\u0288\u0289\n\r\u0000\u0000\u0289\u028a\u0005@\u0000\u0000\u028a\u028b"+
		"\u0003D\"\u000e\u028b\u028c\u0006\"\uffff\uffff\u0000\u028c\u02ba\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\n\b\u0000\u0000\u028e\u028f\u0007\u0001"+
		"\u0000\u0000\u028f\u0290\u0003D\"\t\u0290\u0291\u0006\"\uffff\uffff\u0000"+
		"\u0291\u02ba\u0001\u0000\u0000\u0000\u0292\u0293\n\u0007\u0000\u0000\u0293"+
		"\u0294\u0007\u0002\u0000\u0000\u0294\u0295\u0003D\"\b\u0295\u0296\u0006"+
		"\"\uffff\uffff\u0000\u0296\u02ba\u0001\u0000\u0000\u0000\u0297\u0298\n"+
		"\u0006\u0000\u0000\u0298\u0299\u0007\u0003\u0000\u0000\u0299\u029a\u0003"+
		"D\"\u0007\u029a\u029b\u0006\"\uffff\uffff\u0000\u029b\u02ba\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\n\u0005\u0000\u0000\u029d\u029e\u0007\u0004\u0000"+
		"\u0000\u029e\u029f\u0003D\"\u0006\u029f\u02a0\u0006\"\uffff\uffff\u0000"+
		"\u02a0\u02ba\u0001\u0000\u0000\u0000\u02a1\u02a2\n\u0004\u0000\u0000\u02a2"+
		"\u02a3\u00052\u0000\u0000\u02a3\u02a4\u0003D\"\u0005\u02a4\u02a5\u0006"+
		"\"\uffff\uffff\u0000\u02a5\u02ba\u0001\u0000\u0000\u0000\u02a6\u02a7\n"+
		"\u0003\u0000\u0000\u02a7\u02a8\u00053\u0000\u0000\u02a8\u02a9\u0003D\""+
		"\u0004\u02a9\u02aa\u0006\"\uffff\uffff\u0000\u02aa\u02ba\u0001\u0000\u0000"+
		"\u0000\u02ab\u02b0\n\u000f\u0000\u0000\u02ac\u02ad\u00055\u0000\u0000"+
		"\u02ad\u02b1\u0006\"\uffff\uffff\u0000\u02ae\u02af\u00056\u0000\u0000"+
		"\u02af\u02b1\u0006\"\uffff\uffff\u0000\u02b0\u02ac\u0001\u0000\u0000\u0000"+
		"\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001\u0000\u0000\u0000"+
		"\u02b2\u02ba\u0006\"\uffff\uffff\u0000\u02b3\u02b4\n\u000e\u0000\u0000"+
		"\u02b4\u02b5\u0005;\u0000\u0000\u02b5\u02b6\u0003D\"\u0000\u02b6\u02b7"+
		"\u0005<\u0000\u0000\u02b7\u02b8\u0006\"\uffff\uffff\u0000\u02b8\u02ba"+
		"\u0001\u0000\u0000\u0000\u02b9\u0288\u0001\u0000\u0000\u0000\u02b9\u028d"+
		"\u0001\u0000\u0000\u0000\u02b9\u0292\u0001\u0000\u0000\u0000\u02b9\u0297"+
		"\u0001\u0000\u0000\u0000\u02b9\u029c\u0001\u0000\u0000\u0000\u02b9\u02a1"+
		"\u0001\u0000\u0000\u0000\u02b9\u02a6\u0001\u0000\u0000\u0000\u02b9\u02ab"+
		"\u0001\u0000\u0000\u0000\u02b9\u02b3\u0001\u0000\u0000\u0000\u02ba\u02bd"+
		"\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bcE\u0001\u0000\u0000\u0000\u02bd\u02bb\u0001"+
		"\u0000\u0000\u0000\u02be\u02bf\u0003L&\u0000\u02bf\u02c0\u0006#\uffff"+
		"\uffff\u0000\u02c0\u02cc\u0001\u0000\u0000\u0000\u02c1\u02c2\u0003J%\u0000"+
		"\u02c2\u02c3\u0006#\uffff\uffff\u0000\u02c3\u02cc\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0003H$\u0000\u02c5\u02c6\u0006#\uffff\uffff\u0000\u02c6"+
		"\u02cc\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005D\u0000\u0000\u02c8\u02cc"+
		"\u0006#\uffff\uffff\u0000\u02c9\u02ca\u0005\u0007\u0000\u0000\u02ca\u02cc"+
		"\u0006#\uffff\uffff\u0000\u02cb\u02be\u0001\u0000\u0000\u0000\u02cb\u02c1"+
		"\u0001\u0000\u0000\u0000\u02cb\u02c4\u0001\u0000\u0000\u0000\u02cb\u02c7"+
		"\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02ccG\u0001"+
		"\u0000\u0000\u0000\u02cd\u02ce\u0005D\u0000\u0000\u02ce\u02cf\u0005B\u0000"+
		"\u0000\u02cf\u02d0\u0005B\u0000\u0000\u02d0\u02d1\u0005D\u0000\u0000\u02d1"+
		"\u02d2\u0006$\uffff\uffff\u0000\u02d2I\u0001\u0000\u0000\u0000\u02d3\u02e6"+
		"\u0006%\uffff\uffff\u0000\u02d4\u02d5\u0005!\u0000\u0000\u02d5\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02d6\u02d7\u0005\u0018\u0000\u0000\u02d7\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02d8\u02d9\u0005\u0017\u0000\u0000\u02d9\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02da\u02db\u0005\"\u0000\u0000\u02db\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02dc\u02dd\u0005\u001f\u0000\u0000\u02dd\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02de\u02df\u0005\u001e\u0000\u0000\u02df\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02e0\u02e1\u0005\u001d\u0000\u0000\u02e1\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02e2\u02e3\u0005\u0019\u0000\u0000\u02e3\u02e7\u0006"+
		"%\uffff\uffff\u0000\u02e4\u02e5\u0005D\u0000\u0000\u02e5\u02e7\u0006%"+
		"\uffff\uffff\u0000\u02e6\u02d4\u0001\u0000\u0000\u0000\u02e6\u02d6\u0001"+
		"\u0000\u0000\u0000\u02e6\u02d8\u0001\u0000\u0000\u0000\u02e6\u02da\u0001"+
		"\u0000\u0000\u0000\u02e6\u02dc\u0001\u0000\u0000\u0000\u02e6\u02de\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e0\u0001\u0000\u0000\u0000\u02e6\u02e2\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001"+
		"\u0000\u0000\u0000\u02e8\u02ec\u00059\u0000\u0000\u02e9\u02ea\u0003B!"+
		"\u0000\u02ea\u02eb\u0006%\uffff\uffff\u0000\u02eb\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ec\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000\u02ee\u02ef\u0005:\u0000\u0000"+
		"\u02efK\u0001\u0000\u0000\u0000\u02f0\u02f1\u0005C\u0000\u0000\u02f1\u02f9"+
		"\u0006&\uffff\uffff\u0000\u02f2\u02f3\u0005E\u0000\u0000\u02f3\u02f9\u0006"+
		"&\uffff\uffff\u0000\u02f4\u02f5\u0005\b\u0000\u0000\u02f5\u02f9\u0006"+
		"&\uffff\uffff\u0000\u02f6\u02f7\u0005\u000e\u0000\u0000\u02f7\u02f9\u0006"+
		"&\uffff\uffff\u0000\u02f8\u02f0\u0001\u0000\u0000\u0000\u02f8\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f4\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f9M\u0001\u0000\u0000\u00007UWgtz\u007f\u0086\u0094"+
		"\u00a5\u00ab\u00b6\u00c0\u00d1\u00d5\u00e3\u00f0\u00f5\u00fd\u010e\u011b"+
		"\u0135\u0148\u0153\u015a\u017e\u0187\u0198\u01a5\u01c1\u01c3\u01ca\u01dd"+
		"\u01df\u01e2\u01f0\u01fe\u0200\u020c\u021c\u022d\u0234\u0238\u023c\u024b"+
		"\u024e\u0256\u0269\u0286\u02b0\u02b9\u02bb\u02cb\u02e6\u02ec\u02f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}