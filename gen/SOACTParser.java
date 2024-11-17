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
		RULE_forArg = 34, RULE_setVarStatement = 35, RULE_builtInFunction = 36, 
		RULE_expressionStatement = 37, RULE_ifStatement = 38, RULE_methodCall = 39, 
		RULE_observers = 40, RULE_declareVarStatement = 41, RULE_arraySize = 42, 
		RULE_initialayzer = 43, RULE_expressionWithPar = 44, RULE_expression = 45, 
		RULE_logicalOr = 46, RULE_logicalAnd = 47, RULE_equality = 48, RULE_relational = 49, 
		RULE_additive = 50, RULE_multiplicative = 51, RULE_unary = 52, RULE_postfix = 53, 
		RULE_arrayIndex = 54, RULE_expressionPar = 55, RULE_pipe = 56, RULE_terminal = 57, 
		RULE_primitiveUse = 58, RULE_actorInstance = 59, RULE_recordInstance = 60, 
		RULE_type = 61, RULE_builtInType = 62, RULE_set = 63, RULE_list = 64;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "declarationseq", "declaration", "actor", "actorComponentsWithBrace", 
			"actorComponents", "actorComponent", "actorConstructor", "actorMethod", 
			"authorized", "actorVars", "record", "decVarsWithBrace", "varsRecords", 
			"decPrimitive", "varsPrimitiveWithBrace", "varsPrimitives", "main", "decArgsWithPar", 
			"decArgs", "decArg", "argsWithPar", "args", "recordArgs", "recordArg", 
			"statementWithBrace", "statementSeq", "statement", "joinStatement", "otherStatement", 
			"whileStatement", "whileArgWithPar", "forStatement", "forArgWithPar", 
			"forArg", "setVarStatement", "builtInFunction", "expressionStatement", 
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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 33570819L) != 0)) {
				{
				setState(130);
				declarationseq();
				}
			}

			setState(133);
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
			setState(136); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(135);
				declaration();
				}
				}
				setState(138); 
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Main:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				main();
				}
				break;
			case Actor:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				actor();
				}
				break;
			case Record:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				record();
				}
				break;
			case Primitive:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
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
			setState(146);
			match(Actor);
			setState(147);
			match(Identifier);
			setState(148);
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
			setState(150);
			match(LeftBrace);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(151);
				actorComponents();
				}
			}

			setState(154);
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
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				actorComponent();
				}
				}
				setState(159); 
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
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				actorVars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				actorConstructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
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
			setState(166);
			match(Identifier);
			setState(167);
			decArgsWithPar();
			setState(168);
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
			setState(170);
			((ActorMethodContext)_localctx).type = type();
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(171);
				authorized();
				}
			}

			setState(174);
			((ActorMethodContext)_localctx).Identifier = match(Identifier);
			setState(175);
			decArgsWithPar();
			setState(176);
			statementWithBrace();

			        if (((ActorMethodContext)_localctx).type.is_handler) {
			            System.out.println("Handler:" + ((ActorMethodContext)_localctx).Identifier.getText());
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
			setState(179);
			match(AT);
			setState(180);
			match(Authorized);
			setState(181);
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
			setState(183);
			match(ActorVars);
			setState(184);
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
			setState(186);
			match(Record);
			setState(187);
			match(Identifier);
			setState(188);
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
			setState(190);
			match(LeftBrace);
			setState(191);
			varsRecords();
			setState(192);
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
			setState(194);
			decArg();
			setState(195);
			match(Semi);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(196);
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
			setState(199);
			match(Primitive);
			setState(200);
			match(Identifier);
			setState(201);
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
			setState(203);
			match(LeftBrace);
			setState(204);
			varsPrimitives();
			setState(205);
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
			setState(207);
			match(Identifier);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(208);
				match(Comma);
				setState(209);
				match(Identifier);
				}
				}
				setState(214);
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
			setState(215);
			match(Main);
			setState(216);
			decArgsWithPar();
			setState(217);
			statementWithBrace();

			    System.out.println("MAIN");
			    
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
			setState(220);
			match(LeftParen);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(221);
				decArgs();
				}
			}

			setState(224);
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
			setState(226);
			decArg();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(227);
				match(Comma);
				setState(228);
				decArg();
				}
				}
				setState(233);
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
			setState(234);
			type();
			setState(235);
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
			setState(237);
			match(LeftParen);
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3602879615451516920L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6651L) != 0)) {
				{
				setState(238);
				args();
				}
			}

			setState(241);
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
			setState(243);
			expression();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(244);
				match(Comma);
				setState(245);
				expression();
				}
				}
				setState(250);
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
			setState(251);
			recordArg();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(252);
				match(Comma);
				setState(253);
				recordArg();
				}
				}
				setState(258);
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
			setState(259);
			match(Identifier);
			setState(260);
			match(Colon);
			setState(261);
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
			setState(263);
			match(LeftBrace);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3569102755685191672L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6651L) != 0)) {
				{
				setState(264);
				statementSeq();
				}
			}

			setState(267);
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
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				statement();
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -3569102755685191672L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6651L) != 0) );
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
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				declareVarStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				setVarStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(278);
				forStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				joinStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(281);
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
			setState(284);
			match(Join);
			setState(285);
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
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(Break);
				setState(288);
				match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(Continue);
				setState(290);
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
			setState(293);
			match(While);
			setState(294);
			whileArgWithPar();
			setState(295);
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
			setState(297);
			match(LeftParen);
			setState(298);
			expression();
			setState(299);
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
			setState(301);
			match(For);
			setState(302);
			forArgWithPar();
			setState(303);
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
			setState(305);
			match(LeftParen);
			setState(306);
			forArg();
			setState(307);
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
			setState(309);
			match(Identifier);
			setState(310);
			match(In);
			setState(311);
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
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Self) {
				{
				setState(313);
				match(Self);
				setState(314);
				match(Dot);
				}
			}

			setState(317);
			match(Identifier);
			setState(318);
			match(Assign);
			setState(319);
			expression();
			setState(320);
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
	public static class BuiltInFunctionContext extends ParserRuleContext {
		public TerminalNode ToLower() { return getToken(SOACTParser.ToLower, 0); }
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public TerminalNode ToUpper() { return getToken(SOACTParser.ToUpper, 0); }
		public TerminalNode Reverse() { return getToken(SOACTParser.Reverse, 0); }
		public TerminalNode Print() { return getToken(SOACTParser.Print, 0); }
		public TerminalNode Add() { return getToken(SOACTParser.Add, 0); }
		public TerminalNode Include() { return getToken(SOACTParser.Include, 0); }
		public TerminalNode Remove() { return getToken(SOACTParser.Remove, 0); }
		public TerminalNode Length() { return getToken(SOACTParser.Length, 0); }
		public TerminalNode Private() { return getToken(SOACTParser.Private, 0); }
		public TerminalNode Public() { return getToken(SOACTParser.Public, 0); }
		public TerminalNode Range() { return getToken(SOACTParser.Range, 0); }
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
		enterRule(_localctx, 72, RULE_builtInFunction);
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ToLower:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(ToLower);
				setState(323);
				argsWithPar();

				            System.out.println("Built-In: LOWER");
				        
				}
				break;
			case ToUpper:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(ToUpper);
				setState(327);
				argsWithPar();

				            System.out.println("Built-In: UPPER");
				        
				}
				break;
			case Reverse:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				match(Reverse);
				setState(331);
				argsWithPar();

				            System.out.println("Built-In: REVERSE");
				        
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(334);
				match(Print);
				setState(335);
				argsWithPar();

				            System.out.println("Built-In: PRINT");
				        
				}
				break;
			case Add:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				match(Add);
				setState(339);
				argsWithPar();

				            System.out.println("Built-In: ADD");
				        
				}
				break;
			case Include:
				enterOuterAlt(_localctx, 6);
				{
				setState(342);
				match(Include);
				setState(343);
				argsWithPar();

				            System.out.println("Built-In: INCLUDE");
				        
				}
				break;
			case Remove:
				enterOuterAlt(_localctx, 7);
				{
				setState(346);
				match(Remove);
				setState(347);
				argsWithPar();

				            System.out.println("Built-In: REMOVE");
				        
				}
				break;
			case Length:
				enterOuterAlt(_localctx, 8);
				{
				setState(350);
				match(Length);
				setState(351);
				argsWithPar();

				            System.out.println("Built-In: LEN");
				        
				}
				break;
			case Private:
				enterOuterAlt(_localctx, 9);
				{
				setState(354);
				match(Private);
				setState(355);
				argsWithPar();

				            System.out.println("Built-In: PRIVATE");
				        
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 10);
				{
				setState(358);
				match(Public);
				setState(359);
				argsWithPar();

				            System.out.println("Built-In: PUBLIC");
				        
				}
				break;
			case Range:
				enterOuterAlt(_localctx, 11);
				{
				setState(362);
				match(Range);
				setState(363);
				argsWithPar();

				            System.out.println("Built-In: RANGE");
				        
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
		enterRule(_localctx, 74, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			expression();
			setState(369);
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
		enterRule(_localctx, 76, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(If);
			setState(372);
			expressionWithPar();
			setState(373);
			statementWithBrace();

			            System.out.println("Decision:IF");
			        
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(375);
					match(Else);
					setState(376);
					match(If);
					setState(377);
					expressionWithPar();
					setState(378);
					statementWithBrace();

					            System.out.println("Decision:ELSE IF");
					        
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(386);
				match(Else);
				setState(387);
				statementWithBrace();

				            System.out.println("Decision:ELSE");
				        
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
		public TerminalNode Dot() { return getToken(SOACTParser.Dot, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SOACTParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SOACTParser.Identifier, i);
		}
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public TerminalNode Self() { return getToken(SOACTParser.Self, 0); }
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
		enterRule(_localctx, 78, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==Self || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(393);
			match(Dot);
			setState(394);
			match(Identifier);
			setState(395);
			argsWithPar();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(396);
				observers();
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
		enterRule(_localctx, 80, RULE_observers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(AT);
			setState(400);
			match(Observers);
			setState(401);
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
		enterRule(_localctx, 82, RULE_declareVarStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			type();
			setState(404);
			match(Identifier);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(405);
				arraySize();
				}
			}

			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(408);
				initialayzer();
				}
			}

			setState(411);
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
		enterRule(_localctx, 84, RULE_arraySize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(LeftBracket);
			setState(414);
			expression();
			setState(415);
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
		enterRule(_localctx, 86, RULE_initialayzer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(Assign);
			setState(418);
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
		enterRule(_localctx, 88, RULE_expressionWithPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(LeftParen);
			setState(421);
			expression();
			setState(422);
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
		enterRule(_localctx, 90, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
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
		enterRule(_localctx, 92, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			logicalAnd();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OrOr) {
				{
				setState(427);
				match(OrOr);
				setState(428);
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
		enterRule(_localctx, 94, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			equality();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AndAnd) {
				{
				setState(432);
				match(AndAnd);
				setState(433);
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
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public EqualityContext equality() {
			return getRuleContext(EqualityContext.class,0);
		}
		public TerminalNode Equal() { return getToken(SOACTParser.Equal, 0); }
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
		enterRule(_localctx, 96, RULE_equality);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			relational();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Equal || _la==NotEqual) {
				{
				setState(437);
				_la = _input.LA(1);
				if ( !(_la==Equal || _la==NotEqual) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(438);
				equality();
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
	public static class RelationalContext extends ParserRuleContext {
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public RelationalContext relational() {
			return getRuleContext(RelationalContext.class,0);
		}
		public TerminalNode Less() { return getToken(SOACTParser.Less, 0); }
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
		enterRule(_localctx, 98, RULE_relational);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			additive();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Less || _la==Greater) {
				{
				setState(442);
				_la = _input.LA(1);
				if ( !(_la==Less || _la==Greater) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(443);
				relational();
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
	public static class AdditiveContext extends ParserRuleContext {
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public AdditiveContext additive() {
			return getRuleContext(AdditiveContext.class,0);
		}
		public TerminalNode Plus() { return getToken(SOACTParser.Plus, 0); }
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
		enterRule(_localctx, 100, RULE_additive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			multiplicative();
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==Plus || _la==Minus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				additive();
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
	public static class MultiplicativeContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public MultiplicativeContext multiplicative() {
			return getRuleContext(MultiplicativeContext.class,0);
		}
		public TerminalNode Star() { return getToken(SOACTParser.Star, 0); }
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
		enterRule(_localctx, 102, RULE_multiplicative);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			unary();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) {
				{
				setState(452);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 117440512L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(453);
				multiplicative();
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
	public static class UnaryContext extends ParserRuleContext {
		public UnaryContext unary() {
			return getRuleContext(UnaryContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(SOACTParser.PlusPlus, 0); }
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
		enterRule(_localctx, 104, RULE_unary);
		int _la;
		try {
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
			case MinusMinus:
			case Minus:
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 545271808L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(457);
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
			case Add:
			case Include:
			case Remove:
			case Length:
			case Private:
			case Public:
			case Null:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
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
		enterRule(_localctx, 106, RULE_postfix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			arrayIndex();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PlusPlus || _la==MinusMinus) {
				{
				setState(462);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
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
		enterRule(_localctx, 108, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			expressionPar();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(466);
				match(LeftBracket);
				setState(467);
				expression();
				setState(468);
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
		enterRule(_localctx, 110, RULE_expressionPar);
		try {
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(472);
				match(LeftParen);
				setState(473);
				expression();
				setState(474);
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
			case Add:
			case Include:
			case Remove:
			case Length:
			case Private:
			case Public:
			case Null:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
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
		enterRule(_localctx, 112, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			terminal();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Pipe) {
				{
				setState(480);
				match(Pipe);
				setState(481);
				pipe();
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
		enterRule(_localctx, 114, RULE_terminal);
		int _la;
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				methodCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				actorInstance();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				recordInstance();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				primitiveUse();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(488);
				builtInFunction();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Self) {
					{
					setState(489);
					match(Self);
					setState(490);
					match(Dot);
					}
				}

				setState(493);
				match(StringLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(494);
				match(Identifier);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(495);
				match(IntegerLiteral);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(496);
				match(BoolLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(497);
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
		enterRule(_localctx, 116, RULE_primitiveUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(Identifier);
			setState(501);
			match(DoubleColon);
			setState(502);
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
		enterRule(_localctx, 118, RULE_actorInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(New);
			setState(505);
			match(Identifier);
			setState(506);
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
		enterRule(_localctx, 120, RULE_recordInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(Identifier);
			setState(509);
			match(LeftBrace);
			setState(510);
			recordArgs();
			setState(511);
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
		public boolean is_handler = false;
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
		enterRule(_localctx, 122, RULE_type);
		try {
			setState(517);
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
				setState(513);
				((TypeContext)_localctx).builtInType = builtInType();

				        ((TypeContext)_localctx).is_handler =  ((TypeContext)_localctx).builtInType.is_handler;
				    
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(516);
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
		public boolean is_handler = false;
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
		enterRule(_localctx, 124, RULE_builtInType);
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(519);
				match(Bool);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(520);
				match(Int);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(521);
				match(String);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(522);
				match(Id);
				}
				break;
			case Actor:
				enterOuterAlt(_localctx, 5);
				{
				setState(523);
				match(Actor);
				}
				break;
			case Primitive:
				enterOuterAlt(_localctx, 6);
				{
				setState(524);
				match(Primitive);
				}
				break;
			case MsgRcv:
				enterOuterAlt(_localctx, 7);
				{
				setState(525);
				match(MsgRcv);

				        ((BuiltInTypeContext)_localctx).is_handler =  true;
				    
				}
				break;
			case MsgObs:
				enterOuterAlt(_localctx, 8);
				{
				setState(527);
				match(MsgObs);

				        ((BuiltInTypeContext)_localctx).is_handler =  true;
				    
				}
				break;
			case ActorVars:
				enterOuterAlt(_localctx, 9);
				{
				setState(529);
				match(ActorVars);
				}
				break;
			case List:
				enterOuterAlt(_localctx, 10);
				{
				setState(530);
				list();
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 11);
				{
				setState(531);
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
		enterRule(_localctx, 126, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(Set);
			setState(535);
			match(Less);
			setState(536);
			type();
			setState(537);
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
		enterRule(_localctx, 128, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(List);
			setState(540);
			match(Less);
			setState(541);
			type();
			setState(542);
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
		"\u0004\u0001P\u0221\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0001"+
		"\u0000\u0003\u0000\u0084\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004"+
		"\u0001\u0089\b\u0001\u000b\u0001\f\u0001\u008a\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002\u0091\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0099\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005\u009e\b\u0005\u000b\u0005"+
		"\f\u0005\u009f\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a5\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0003\b\u00ad\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00c6\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00d3\b\u0010\n\u0010\f\u0010\u00d6\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00df\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u00e6\b\u0013\n\u0013\f\u0013\u00e9\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u00f0"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u00f7\b\u0016\n\u0016\f\u0016\u00fa\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00ff\b\u0017\n\u0017\f\u0017\u0102\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u010a\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u010f"+
		"\b\u001a\u000b\u001a\f\u001a\u0110\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u011b\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u0124\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001#\u0001#\u0003#\u013c\b#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u016f\b$\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0005&\u017e\b&\n&\f&\u0181\t&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u0187\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u018e\b\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0003)\u0197\b)\u0001)\u0003"+
		")\u019a\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001.\u0003"+
		".\u01ae\b.\u0001/\u0001/\u0001/\u0003/\u01b3\b/\u00010\u00010\u00010\u0003"+
		"0\u01b8\b0\u00011\u00011\u00011\u00031\u01bd\b1\u00012\u00012\u00012\u0003"+
		"2\u01c2\b2\u00013\u00013\u00013\u00033\u01c7\b3\u00014\u00014\u00014\u0003"+
		"4\u01cc\b4\u00015\u00015\u00035\u01d0\b5\u00016\u00016\u00016\u00016\u0001"+
		"6\u00036\u01d7\b6\u00017\u00017\u00017\u00017\u00017\u00037\u01de\b7\u0001"+
		"8\u00018\u00018\u00038\u01e3\b8\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00039\u01ec\b9\u00019\u00019\u00019\u00019\u00019\u00039\u01f3"+
		"\b9\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0003=\u0206\b=\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u0215\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0000\u0000A\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0000\u0007\u0002\u0000"+
		"::LL\u0001\u0000\u000e\u000f\u0001\u0000\u001f \u0001\u0000\u0016\u0017"+
		"\u0001\u0000\u0018\u001a\u0003\u0000\f\r\u0017\u0017\u001d\u001d\u0001"+
		"\u0000\f\r\u022a\u0000\u0083\u0001\u0000\u0000\u0000\u0002\u0088\u0001"+
		"\u0000\u0000\u0000\u0004\u0090\u0001\u0000\u0000\u0000\u0006\u0092\u0001"+
		"\u0000\u0000\u0000\b\u0096\u0001\u0000\u0000\u0000\n\u009d\u0001\u0000"+
		"\u0000\u0000\f\u00a4\u0001\u0000\u0000\u0000\u000e\u00a6\u0001\u0000\u0000"+
		"\u0000\u0010\u00aa\u0001\u0000\u0000\u0000\u0012\u00b3\u0001\u0000\u0000"+
		"\u0000\u0014\u00b7\u0001\u0000\u0000\u0000\u0016\u00ba\u0001\u0000\u0000"+
		"\u0000\u0018\u00be\u0001\u0000\u0000\u0000\u001a\u00c2\u0001\u0000\u0000"+
		"\u0000\u001c\u00c7\u0001\u0000\u0000\u0000\u001e\u00cb\u0001\u0000\u0000"+
		"\u0000 \u00cf\u0001\u0000\u0000\u0000\"\u00d7\u0001\u0000\u0000\u0000"+
		"$\u00dc\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000\u0000\u0000(\u00ea"+
		"\u0001\u0000\u0000\u0000*\u00ed\u0001\u0000\u0000\u0000,\u00f3\u0001\u0000"+
		"\u0000\u0000.\u00fb\u0001\u0000\u0000\u00000\u0103\u0001\u0000\u0000\u0000"+
		"2\u0107\u0001\u0000\u0000\u00004\u010e\u0001\u0000\u0000\u00006\u011a"+
		"\u0001\u0000\u0000\u00008\u011c\u0001\u0000\u0000\u0000:\u0123\u0001\u0000"+
		"\u0000\u0000<\u0125\u0001\u0000\u0000\u0000>\u0129\u0001\u0000\u0000\u0000"+
		"@\u012d\u0001\u0000\u0000\u0000B\u0131\u0001\u0000\u0000\u0000D\u0135"+
		"\u0001\u0000\u0000\u0000F\u013b\u0001\u0000\u0000\u0000H\u016e\u0001\u0000"+
		"\u0000\u0000J\u0170\u0001\u0000\u0000\u0000L\u0173\u0001\u0000\u0000\u0000"+
		"N\u0188\u0001\u0000\u0000\u0000P\u018f\u0001\u0000\u0000\u0000R\u0193"+
		"\u0001\u0000\u0000\u0000T\u019d\u0001\u0000\u0000\u0000V\u01a1\u0001\u0000"+
		"\u0000\u0000X\u01a4\u0001\u0000\u0000\u0000Z\u01a8\u0001\u0000\u0000\u0000"+
		"\\\u01aa\u0001\u0000\u0000\u0000^\u01af\u0001\u0000\u0000\u0000`\u01b4"+
		"\u0001\u0000\u0000\u0000b\u01b9\u0001\u0000\u0000\u0000d\u01be\u0001\u0000"+
		"\u0000\u0000f\u01c3\u0001\u0000\u0000\u0000h\u01cb\u0001\u0000\u0000\u0000"+
		"j\u01cd\u0001\u0000\u0000\u0000l\u01d1\u0001\u0000\u0000\u0000n\u01dd"+
		"\u0001\u0000\u0000\u0000p\u01df\u0001\u0000\u0000\u0000r\u01f2\u0001\u0000"+
		"\u0000\u0000t\u01f4\u0001\u0000\u0000\u0000v\u01f8\u0001\u0000\u0000\u0000"+
		"x\u01fc\u0001\u0000\u0000\u0000z\u0205\u0001\u0000\u0000\u0000|\u0214"+
		"\u0001\u0000\u0000\u0000~\u0216\u0001\u0000\u0000\u0000\u0080\u021b\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0003\u0002\u0001\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0005\u0000\u0000\u0001\u0086\u0001\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0003\u0004\u0002\u0000\u0088\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0003\u0001"+
		"\u0000\u0000\u0000\u008c\u0091\u0003\"\u0011\u0000\u008d\u0091\u0003\u0006"+
		"\u0003\u0000\u008e\u0091\u0003\u0016\u000b\u0000\u008f\u0091\u0003\u001c"+
		"\u000e\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000"+
		"\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0005\u0001\u0000\u0000\u0000\u0092\u0093\u0005)\u0000"+
		"\u0000\u0093\u0094\u0005L\u0000\u0000\u0094\u0095\u0003\b\u0004\u0000"+
		"\u0095\u0007\u0001\u0000\u0000\u0000\u0096\u0098\u0005\t\u0000\u0000\u0097"+
		"\u0099\u0003\n\u0005\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0005\n\u0000\u0000\u009b\t\u0001\u0000\u0000\u0000\u009c\u009e\u0003"+
		"\f\u0006\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u000b\u0001\u0000\u0000\u0000\u00a1\u00a5\u0003\u0014"+
		"\n\u0000\u00a2\u00a5\u0003\u000e\u0007\u0000\u00a3\u00a5\u0003\u0010\b"+
		"\u0000\u00a4\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\r\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0005L\u0000\u0000\u00a7\u00a8\u0003$\u0012\u0000\u00a8\u00a9"+
		"\u00032\u0019\u0000\u00a9\u000f\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003"+
		"z=\u0000\u00ab\u00ad\u0003\u0012\t\u0000\u00ac\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0005L\u0000\u0000\u00af\u00b0\u0003$\u0012\u0000\u00b0"+
		"\u00b1\u00032\u0019\u0000\u00b1\u00b2\u0006\b\uffff\uffff\u0000\u00b2"+
		"\u0011\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\b\u0000\u0000\u00b4\u00b5"+
		"\u0005=\u0000\u0000\u00b5\u00b6\u0003*\u0015\u0000\u00b6\u0013\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005-\u0000\u0000\u00b8\u00b9\u0003\u0018\f"+
		"\u0000\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00bb\u00057\u0000\u0000"+
		"\u00bb\u00bc\u0005L\u0000\u0000\u00bc\u00bd\u0003\u0018\f\u0000\u00bd"+
		"\u0017\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\t\u0000\u0000\u00bf\u00c0"+
		"\u0003\u001a\r\u0000\u00c0\u00c1\u0005\n\u0000\u0000\u00c1\u0019\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0003(\u0014\u0000\u00c3\u00c5\u0005\u0004"+
		"\u0000\u0000\u00c4\u00c6\u0003\u001a\r\u0000\u00c5\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u001b\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005*\u0000\u0000\u00c8\u00c9\u0005L\u0000\u0000\u00c9"+
		"\u00ca\u0003\u001e\u000f\u0000\u00ca\u001d\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0005\t\u0000\u0000\u00cc\u00cd\u0003 \u0010\u0000\u00cd\u00ce"+
		"\u0005\n\u0000\u0000\u00ce\u001f\u0001\u0000\u0000\u0000\u00cf\u00d4\u0005"+
		"L\u0000\u0000\u00d0\u00d1\u0005!\u0000\u0000\u00d1\u00d3\u0005L\u0000"+
		"\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d5!\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0005B\u0000\u0000\u00d8\u00d9\u0003$\u0012\u0000\u00d9\u00da"+
		"\u00032\u0019\u0000\u00da\u00db\u0006\u0011\uffff\uffff\u0000\u00db#\u0001"+
		"\u0000\u0000\u0000\u00dc\u00de\u0005\u0012\u0000\u0000\u00dd\u00df\u0003"+
		"&\u0013\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0013"+
		"\u0000\u0000\u00e1%\u0001\u0000\u0000\u0000\u00e2\u00e7\u0003(\u0014\u0000"+
		"\u00e3\u00e4\u0005!\u0000\u0000\u00e4\u00e6\u0003(\u0014\u0000\u00e5\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\'\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0003"+
		"z=\u0000\u00eb\u00ec\u0005L\u0000\u0000\u00ec)\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ef\u0005\u0012\u0000\u0000\u00ee\u00f0\u0003,\u0016\u0000\u00ef"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0013\u0000\u0000\u00f2"+
		"+\u0001\u0000\u0000\u0000\u00f3\u00f8\u0003Z-\u0000\u00f4\u00f5\u0005"+
		"!\u0000\u0000\u00f5\u00f7\u0003Z-\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9-\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u0100\u00030\u0018\u0000\u00fc"+
		"\u00fd\u0005!\u0000\u0000\u00fd\u00ff\u00030\u0018\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101/\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005L\u0000"+
		"\u0000\u0104\u0105\u0005\u0006\u0000\u0000\u0105\u0106\u0003Z-\u0000\u0106"+
		"1\u0001\u0000\u0000\u0000\u0107\u0109\u0005\t\u0000\u0000\u0108\u010a"+
		"\u00034\u001a\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"\n\u0000\u0000\u010c3\u0001\u0000\u0000\u0000\u010d\u010f\u00036\u001b"+
		"\u0000\u010e\u010d\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000"+
		"\u0000\u01115\u0001\u0000\u0000\u0000\u0112\u011b\u0003R)\u0000\u0113"+
		"\u011b\u0003J%\u0000\u0114\u011b\u0003F#\u0000\u0115\u011b\u0003L&\u0000"+
		"\u0116\u011b\u0003@ \u0000\u0117\u011b\u0003<\u001e\u0000\u0118\u011b"+
		"\u00038\u001c\u0000\u0119\u011b\u0003:\u001d\u0000\u011a\u0112\u0001\u0000"+
		"\u0000\u0000\u011a\u0113\u0001\u0000\u0000\u0000\u011a\u0114\u0001\u0000"+
		"\u0000\u0000\u011a\u0115\u0001\u0000\u0000\u0000\u011a\u0116\u0001\u0000"+
		"\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b7\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u00056\u0000\u0000\u011d\u011e\u00032\u0019\u0000\u011e"+
		"9\u0001\u0000\u0000\u0000\u011f\u0120\u00050\u0000\u0000\u0120\u0124\u0005"+
		"\u0004\u0000\u0000\u0121\u0122\u00051\u0000\u0000\u0122\u0124\u0005\u0004"+
		"\u0000\u0000\u0123\u011f\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0124;\u0001\u0000\u0000\u0000\u0125\u0126\u00055\u0000\u0000"+
		"\u0126\u0127\u0003>\u001f\u0000\u0127\u0128\u00032\u0019\u0000\u0128="+
		"\u0001\u0000\u0000\u0000\u0129\u012a\u0005\u0012\u0000\u0000\u012a\u012b"+
		"\u0003Z-\u0000\u012b\u012c\u0005\u0013\u0000\u0000\u012c?\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u00054\u0000\u0000\u012e\u012f\u0003B!\u0000"+
		"\u012f\u0130\u00032\u0019\u0000\u0130A\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005\u0012\u0000\u0000\u0132\u0133\u0003D\"\u0000\u0133\u0134\u0005"+
		"\u0013\u0000\u0000\u0134C\u0001\u0000\u0000\u0000\u0135\u0136\u0005L\u0000"+
		"\u0000\u0136\u0137\u00058\u0000\u0000\u0137\u0138\u0003Z-\u0000\u0138"+
		"E\u0001\u0000\u0000\u0000\u0139\u013a\u0005:\u0000\u0000\u013a\u013c\u0005"+
		"\u0007\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001"+
		"\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u0005"+
		"L\u0000\u0000\u013e\u013f\u0005\u001e\u0000\u0000\u013f\u0140\u0003Z-"+
		"\u0000\u0140\u0141\u0005\u0004\u0000\u0000\u0141G\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005>\u0000\u0000\u0143\u0144\u0003*\u0015\u0000\u0144\u0145"+
		"\u0006$\uffff\uffff\u0000\u0145\u016f\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0005?\u0000\u0000\u0147\u0148\u0003*\u0015\u0000\u0148\u0149\u0006$"+
		"\uffff\uffff\u0000\u0149\u016f\u0001\u0000\u0000\u0000\u014a\u014b\u0005"+
		"@\u0000\u0000\u014b\u014c\u0003*\u0015\u0000\u014c\u014d\u0006$\uffff"+
		"\uffff\u0000\u014d\u016f\u0001\u0000\u0000\u0000\u014e\u014f\u0005A\u0000"+
		"\u0000\u014f\u0150\u0003*\u0015\u0000\u0150\u0151\u0006$\uffff\uffff\u0000"+
		"\u0151\u016f\u0001\u0000\u0000\u0000\u0152\u0153\u0005C\u0000\u0000\u0153"+
		"\u0154\u0003*\u0015\u0000\u0154\u0155\u0006$\uffff\uffff\u0000\u0155\u016f"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0005D\u0000\u0000\u0157\u0158\u0003"+
		"*\u0015\u0000\u0158\u0159\u0006$\uffff\uffff\u0000\u0159\u016f\u0001\u0000"+
		"\u0000\u0000\u015a\u015b\u0005E\u0000\u0000\u015b\u015c\u0003*\u0015\u0000"+
		"\u015c\u015d\u0006$\uffff\uffff\u0000\u015d\u016f\u0001\u0000\u0000\u0000"+
		"\u015e\u015f\u0005F\u0000\u0000\u015f\u0160\u0003*\u0015\u0000\u0160\u0161"+
		"\u0006$\uffff\uffff\u0000\u0161\u016f\u0001\u0000\u0000\u0000\u0162\u0163"+
		"\u0005G\u0000\u0000\u0163\u0164\u0003*\u0015\u0000\u0164\u0165\u0006$"+
		"\uffff\uffff\u0000\u0165\u016f\u0001\u0000\u0000\u0000\u0166\u0167\u0005"+
		"H\u0000\u0000\u0167\u0168\u0003*\u0015\u0000\u0168\u0169\u0006$\uffff"+
		"\uffff\u0000\u0169\u016f\u0001\u0000\u0000\u0000\u016a\u016b\u0005;\u0000"+
		"\u0000\u016b\u016c\u0003*\u0015\u0000\u016c\u016d\u0006$\uffff\uffff\u0000"+
		"\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0142\u0001\u0000\u0000\u0000"+
		"\u016e\u0146\u0001\u0000\u0000\u0000\u016e\u014a\u0001\u0000\u0000\u0000"+
		"\u016e\u014e\u0001\u0000\u0000\u0000\u016e\u0152\u0001\u0000\u0000\u0000"+
		"\u016e\u0156\u0001\u0000\u0000\u0000\u016e\u015a\u0001\u0000\u0000\u0000"+
		"\u016e\u015e\u0001\u0000\u0000\u0000\u016e\u0162\u0001\u0000\u0000\u0000"+
		"\u016e\u0166\u0001\u0000\u0000\u0000\u016e\u016a\u0001\u0000\u0000\u0000"+
		"\u016fI\u0001\u0000\u0000\u0000\u0170\u0171\u0003Z-\u0000\u0171\u0172"+
		"\u0005\u0004\u0000\u0000\u0172K\u0001\u0000\u0000\u0000\u0173\u0174\u0005"+
		"2\u0000\u0000\u0174\u0175\u0003X,\u0000\u0175\u0176\u00032\u0019\u0000"+
		"\u0176\u017f\u0006&\uffff\uffff\u0000\u0177\u0178\u00053\u0000\u0000\u0178"+
		"\u0179\u00052\u0000\u0000\u0179\u017a\u0003X,\u0000\u017a\u017b\u0003"+
		"2\u0019\u0000\u017b\u017c\u0006&\uffff\uffff\u0000\u017c\u017e\u0001\u0000"+
		"\u0000\u0000\u017d\u0177\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000"+
		"\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0186\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u00053\u0000\u0000\u0183\u0184\u00032\u0019\u0000"+
		"\u0184\u0185\u0006&\uffff\uffff\u0000\u0185\u0187\u0001\u0000\u0000\u0000"+
		"\u0186\u0182\u0001\u0000\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000"+
		"\u0187M\u0001\u0000\u0000\u0000\u0188\u0189\u0007\u0000\u0000\u0000\u0189"+
		"\u018a\u0005\u0007\u0000\u0000\u018a\u018b\u0005L\u0000\u0000\u018b\u018d"+
		"\u0003*\u0015\u0000\u018c\u018e\u0003P(\u0000\u018d\u018c\u0001\u0000"+
		"\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018eO\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0005\b\u0000\u0000\u0190\u0191\u0005<\u0000\u0000"+
		"\u0191\u0192\u0003*\u0015\u0000\u0192Q\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0003z=\u0000\u0194\u0196\u0005L\u0000\u0000\u0195\u0197\u0003T*\u0000"+
		"\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u019a\u0003V+\u0000\u0199\u0198"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b"+
		"\u0001\u0000\u0000\u0000\u019b\u019c\u0005\u0004\u0000\u0000\u019cS\u0001"+
		"\u0000\u0000\u0000\u019d\u019e\u0005\u0014\u0000\u0000\u019e\u019f\u0003"+
		"Z-\u0000\u019f\u01a0\u0005\u0015\u0000\u0000\u01a0U\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0005\u001e\u0000\u0000\u01a2\u01a3\u0003Z-\u0000\u01a3"+
		"W\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0012\u0000\u0000\u01a5\u01a6"+
		"\u0003Z-\u0000\u01a6\u01a7\u0005\u0013\u0000\u0000\u01a7Y\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0003\\.\u0000\u01a9[\u0001\u0000\u0000\u0000"+
		"\u01aa\u01ad\u0003^/\u0000\u01ab\u01ac\u0005\u0011\u0000\u0000\u01ac\u01ae"+
		"\u0003\\.\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ae]\u0001\u0000\u0000\u0000\u01af\u01b2\u0003`0"+
		"\u0000\u01b0\u01b1\u0005\u0010\u0000\u0000\u01b1\u01b3\u0003^/\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3"+
		"_\u0001\u0000\u0000\u0000\u01b4\u01b7\u0003b1\u0000\u01b5\u01b6\u0007"+
		"\u0001\u0000\u0000\u01b6\u01b8\u0003`0\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8a\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bc\u0003d2\u0000\u01ba\u01bb\u0007\u0002\u0000\u0000\u01bb\u01bd"+
		"\u0003b1\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000"+
		"\u0000\u0000\u01bdc\u0001\u0000\u0000\u0000\u01be\u01c1\u0003f3\u0000"+
		"\u01bf\u01c0\u0007\u0003\u0000\u0000\u01c0\u01c2\u0003d2\u0000\u01c1\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000\u0000\u01c2e\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c6\u0003h4\u0000\u01c4\u01c5\u0007\u0004\u0000"+
		"\u0000\u01c5\u01c7\u0003f3\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c7g\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0007\u0005\u0000\u0000\u01c9\u01cc\u0003h4\u0000\u01ca\u01cc\u0003j"+
		"5\u0000\u01cb\u01c8\u0001\u0000\u0000\u0000\u01cb\u01ca\u0001\u0000\u0000"+
		"\u0000\u01cci\u0001\u0000\u0000\u0000\u01cd\u01cf\u0003l6\u0000\u01ce"+
		"\u01d0\u0007\u0006\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0k\u0001\u0000\u0000\u0000\u01d1\u01d6"+
		"\u0003n7\u0000\u01d2\u01d3\u0005\u0014\u0000\u0000\u01d3\u01d4\u0003Z"+
		"-\u0000\u01d4\u01d5\u0005\u0015\u0000\u0000\u01d5\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d2\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d7m\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\u0012\u0000\u0000"+
		"\u01d9\u01da\u0003Z-\u0000\u01da\u01db\u0005\u0013\u0000\u0000\u01db\u01de"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u0003p8\u0000\u01dd\u01d8\u0001\u0000"+
		"\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01deo\u0001\u0000\u0000"+
		"\u0000\u01df\u01e2\u0003r9\u0000\u01e0\u01e1\u0005\u000b\u0000\u0000\u01e1"+
		"\u01e3\u0003p8\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e3q\u0001\u0000\u0000\u0000\u01e4\u01f3\u0003N\'"+
		"\u0000\u01e5\u01f3\u0003v;\u0000\u01e6\u01f3\u0003x<\u0000\u01e7\u01f3"+
		"\u0003t:\u0000\u01e8\u01f3\u0003H$\u0000\u01e9\u01ea\u0005:\u0000\u0000"+
		"\u01ea\u01ec\u0005\u0007\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000"+
		"\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ed\u01f3\u0005\u0003\u0000\u0000\u01ee\u01f3\u0005L\u0000\u0000\u01ef"+
		"\u01f3\u0005\"\u0000\u0000\u01f0\u01f3\u0005$\u0000\u0000\u01f1\u01f3"+
		"\u0005K\u0000\u0000\u01f2\u01e4\u0001\u0000\u0000\u0000\u01f2\u01e5\u0001"+
		"\u0000\u0000\u0000\u01f2\u01e6\u0001\u0000\u0000\u0000\u01f2\u01e7\u0001"+
		"\u0000\u0000\u0000\u01f2\u01e8\u0001\u0000\u0000\u0000\u01f2\u01eb\u0001"+
		"\u0000\u0000\u0000\u01f2\u01ee\u0001\u0000\u0000\u0000\u01f2\u01ef\u0001"+
		"\u0000\u0000\u0000\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3s\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005L\u0000"+
		"\u0000\u01f5\u01f6\u0005\u0005\u0000\u0000\u01f6\u01f7\u0005L\u0000\u0000"+
		"\u01f7u\u0001\u0000\u0000\u0000\u01f8\u01f9\u00059\u0000\u0000\u01f9\u01fa"+
		"\u0005L\u0000\u0000\u01fa\u01fb\u0003*\u0015\u0000\u01fbw\u0001\u0000"+
		"\u0000\u0000\u01fc\u01fd\u0005L\u0000\u0000\u01fd\u01fe\u0005\t\u0000"+
		"\u0000\u01fe\u01ff\u0003.\u0017\u0000\u01ff\u0200\u0005\n\u0000\u0000"+
		"\u0200y\u0001\u0000\u0000\u0000\u0201\u0202\u0003|>\u0000\u0202\u0203"+
		"\u0006=\uffff\uffff\u0000\u0203\u0206\u0001\u0000\u0000\u0000\u0204\u0206"+
		"\u0005L\u0000\u0000\u0205\u0201\u0001\u0000\u0000\u0000\u0205\u0204\u0001"+
		"\u0000\u0000\u0000\u0206{\u0001\u0000\u0000\u0000\u0207\u0215\u0005%\u0000"+
		"\u0000\u0208\u0215\u0005&\u0000\u0000\u0209\u0215\u0005\'\u0000\u0000"+
		"\u020a\u0215\u0005(\u0000\u0000\u020b\u0215\u0005)\u0000\u0000\u020c\u0215"+
		"\u0005*\u0000\u0000\u020d\u020e\u0005+\u0000\u0000\u020e\u0215\u0006>"+
		"\uffff\uffff\u0000\u020f\u0210\u0005,\u0000\u0000\u0210\u0215\u0006>\uffff"+
		"\uffff\u0000\u0211\u0215\u0005-\u0000\u0000\u0212\u0215\u0003\u0080@\u0000"+
		"\u0213\u0215\u0003~?\u0000\u0214\u0207\u0001\u0000\u0000\u0000\u0214\u0208"+
		"\u0001\u0000\u0000\u0000\u0214\u0209\u0001\u0000\u0000\u0000\u0214\u020a"+
		"\u0001\u0000\u0000\u0000\u0214\u020b\u0001\u0000\u0000\u0000\u0214\u020c"+
		"\u0001\u0000\u0000\u0000\u0214\u020d\u0001\u0000\u0000\u0000\u0214\u020f"+
		"\u0001\u0000\u0000\u0000\u0214\u0211\u0001\u0000\u0000\u0000\u0214\u0212"+
		"\u0001\u0000\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215}\u0001"+
		"\u0000\u0000\u0000\u0216\u0217\u0005/\u0000\u0000\u0217\u0218\u0005\u001f"+
		"\u0000\u0000\u0218\u0219\u0003z=\u0000\u0219\u021a\u0005 \u0000\u0000"+
		"\u021a\u007f\u0001\u0000\u0000\u0000\u021b\u021c\u0005.\u0000\u0000\u021c"+
		"\u021d\u0005\u001f\u0000\u0000\u021d\u021e\u0003z=\u0000\u021e\u021f\u0005"+
		" \u0000\u0000\u021f\u0081\u0001\u0000\u0000\u0000(\u0083\u008a\u0090\u0098"+
		"\u009f\u00a4\u00ac\u00c5\u00d4\u00de\u00e7\u00ef\u00f8\u0100\u0109\u0110"+
		"\u011a\u0123\u013b\u016e\u017f\u0186\u018d\u0196\u0199\u01ad\u01b2\u01b7"+
		"\u01bc\u01c1\u01c6\u01cb\u01cf\u01d6\u01dd\u01e2\u01eb\u01f2\u0205\u0214";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}