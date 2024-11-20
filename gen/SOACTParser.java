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
		RULE_soact = 0, RULE_declarationseq = 1, RULE_declaration = 2, RULE_actor = 3, 
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
		RULE_objectCall = 43, RULE_observers = 44, RULE_declareVarStatement = 45, 
		RULE_function = 46, RULE_arraySize = 47, RULE_initialayzer = 48, RULE_functionCall = 49, 
		RULE_expressionWithPar = 50, RULE_expression = 51, RULE_logicalOr = 52, 
		RULE_logicalAnd = 53, RULE_equality = 54, RULE_relational = 55, RULE_additive = 56, 
		RULE_multiplicative = 57, RULE_unary = 58, RULE_postfix = 59, RULE_arrayIndex = 60, 
		RULE_expressionPar = 61, RULE_pipe = 62, RULE_terminal = 63, RULE_primitiveUse = 64, 
		RULE_actorInstance = 65, RULE_recordInstance = 66, RULE_type = 67, RULE_builtInType = 68, 
		RULE_set = 69, RULE_list = 70;
	private static String[] makeRuleNames() {
		return new String[] {
			"soact", "declarationseq", "declaration", "actor", "actorComponentsWithBrace", 
			"actorComponents", "actorComponent", "actorConstructor", "actorMethod", 
			"authorized", "actorVars", "record", "decVarsWithBrace", "varsRecords", 
			"decPrimitive", "varsPrimitiveWithBrace", "varsPrimitives", "main", "decArgsWithPar", 
			"decArgs", "decArg", "argsWithPar", "args", "recordArgs", "recordArg", 
			"statementWithBrace", "statementSeq", "statement", "joinStatement", "otherStatement", 
			"whileStatement", "whileArgWithPar", "forStatement", "forArgWithPar", 
			"forArg", "setVarStatement", "builtInFunctionName", "builtInFunction", 
			"builtInFunctionList", "builtInFunctionListName", "expressionStatement", 
			"ifStatement", "methodCall", "objectCall", "observers", "declareVarStatement", 
			"function", "arraySize", "initialayzer", "functionCall", "expressionWithPar", 
			"expression", "logicalOr", "logicalAnd", "equality", "relational", "additive", 
			"multiplicative", "unary", "postfix", "arrayIndex", "expressionPar", 
			"pipe", "terminal", "primitiveUse", "actorInstance", "recordInstance", 
			"type", "builtInType", "set", "list"
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
	public static class SoactContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SOACTParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
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
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 33570819L) != 0)) {
				{
				setState(142);
				declarationseq();
				}
			}

			setState(145);
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
			setState(148); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(147);
				declaration();
				}
				}
				setState(150); 
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
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Main:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				main();
				}
				break;
			case Actor:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				actor();
				}
				break;
			case Record:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				record();
				}
				break;
			case Primitive:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
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
			setState(158);
			match(Actor);
			setState(159);
			match(Identifier);
			setState(160);
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
			setState(162);
			match(LeftBrace);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(163);
				actorComponents();
				}
			}

			setState(166);
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
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				actorComponent();
				}
				}
				setState(171); 
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				actorVars();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				actorConstructor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
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
			setState(178);
			match(Identifier);
			setState(179);
			decArgsWithPar();
			setState(180);
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
			setState(182);
			((ActorMethodContext)_localctx).type = type();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(183);
				authorized();
				}
			}

			setState(186);
			((ActorMethodContext)_localctx).Identifier = match(Identifier);

			            if (((ActorMethodContext)_localctx).type.is_msgrcv) {
			                System.out.println("Line " + ((ActorMethodContext)_localctx).Identifier.getLine() + " : msgRcv: " + ((ActorMethodContext)_localctx).Identifier.getText());
			            }
			            else if(((ActorMethodContext)_localctx).type.is_msgobs){
			                System.out.println("Line " + ((ActorMethodContext)_localctx).Identifier.getLine() + " : msgObs: " + ((ActorMethodContext)_localctx).Identifier.getText());
			            }
			        
			setState(188);
			decArgsWithPar();
			setState(189);
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
			setState(191);
			match(AT);
			setState(192);
			match(Authorized);
			setState(193);
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
			setState(195);
			match(ActorVars);
			setState(196);
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
			setState(198);
			((RecordContext)_localctx).Record = match(Record);

			    System.out.println("Line " + ((RecordContext)_localctx).Record.getLine() + " : Record");
			    
			setState(200);
			match(Identifier);
			setState(201);
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
			setState(203);
			match(LeftBrace);
			setState(204);
			varsRecords();
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
			setState(207);
			decArg();
			setState(208);
			match(Semi);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(209);
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
			setState(212);
			match(Primitive);
			setState(213);
			match(Identifier);
			setState(214);
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
			setState(216);
			match(LeftBrace);
			setState(217);
			varsPrimitives();
			setState(218);
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
			setState(220);
			match(Identifier);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(221);
				match(Comma);
				setState(222);
				match(Identifier);
				}
				}
				setState(227);
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
			setState(228);
			((MainContext)_localctx).Main = match(Main);
			System.out.println("Line " + ((MainContext)_localctx).Main.getLine() + " : MAIN");
			setState(230);
			decArgsWithPar();
			setState(231);
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
			setState(233);
			match(LeftParen);
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 549755815935L) != 0)) {
				{
				setState(234);
				decArgs();
				}
			}

			setState(237);
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
			setState(239);
			decArg();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(240);
				match(Comma);
				setState(241);
				decArg();
				}
				}
				setState(246);
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
			setState(247);
			type();
			setState(248);
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
			setState(250);
			match(LeftParen);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3602879615451516920L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6531L) != 0)) {
				{
				setState(251);
				args();
				}
			}

			setState(254);
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
			setState(256);
			expression();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(257);
				match(Comma);
				setState(258);
				expression();
				}
				}
				setState(263);
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
			setState(264);
			recordArg();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(265);
				match(Comma);
				setState(266);
				recordArg();
				}
				}
				setState(271);
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
			setState(272);
			match(Identifier);
			setState(273);
			match(Colon);
			setState(274);
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
			setState(276);
			match(LeftBrace);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3569102755685191672L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 6531L) != 0)) {
				{
				setState(277);
				statementSeq();
				}
			}

			setState(280);
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
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				statement();
				}
				}
				setState(285); 
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				declareVarStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				setVarStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(291);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(292);
				forStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(293);
				whileStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(294);
				joinStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(295);
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
			setState(298);
			((JoinStatementContext)_localctx).Join = match(Join);

			    System.out.println("Line " + ((JoinStatementContext)_localctx).Join.getLine() + " : Join");
			    
			setState(300);
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
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Break:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(Break);

				        System.out.println("Control: BREAK");
				     
				setState(304);
				match(Semi);
				}
				break;
			case Continue:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				((OtherStatementContext)_localctx).Continue = match(Continue);

				        System.out.println("Line " + ((OtherStatementContext)_localctx).Continue.getLine() + " : Control: CONTINUE");
				     
				setState(307);
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
			setState(310);
			((WhileStatementContext)_localctx).While = match(While);

			    System.out.println("Line " + ((WhileStatementContext)_localctx).While.getLine() + " : Loop: WHILE");
			    
			setState(312);
			whileArgWithPar();
			setState(313);
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
			setState(315);
			match(LeftParen);
			setState(316);
			expression();
			setState(317);
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
			setState(319);
			((ForStatementContext)_localctx).For = match(For);

			    System.out.println("Line " + ((ForStatementContext)_localctx).For.getLine() + " : Loop: FOR");
			    
			setState(321);
			forArgWithPar();
			setState(322);
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
			setState(324);
			match(LeftParen);
			setState(325);
			forArg();
			setState(326);
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
			setState(328);
			match(Identifier);
			setState(329);
			match(In);
			setState(330);
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
		public List<TerminalNode> Identifier() { return getTokens(SOACTParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SOACTParser.Identifier, i);
		}
		public TerminalNode Assign() { return getToken(SOACTParser.Assign, 0); }
		public TerminalNode Semi() { return getToken(SOACTParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(SOACTParser.Dot, 0); }
		public TerminalNode Self() { return getToken(SOACTParser.Self, 0); }
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(332);
				_la = _input.LA(1);
				if ( !(_la==Self || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(333);
				match(Dot);
				}
				break;
			}
			setState(336);
			match(Identifier);
			setState(337);
			((SetVarStatementContext)_localctx).Assign = match(Assign);
			{
			setState(338);
			expression();
			System.out.println("Line " + ((SetVarStatementContext)_localctx).Assign.getLine() + " : Assignment");
			}
			setState(341);
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
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ToLower:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				((BuiltInFunctionNameContext)_localctx).ToLower = match(ToLower);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).ToLower.getLine() + " : Built-In: LOWER");
				        
				}
				break;
			case ToUpper:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				((BuiltInFunctionNameContext)_localctx).ToUpper = match(ToUpper);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).ToUpper.getLine() + " : Built-In: UPPER");
				        
				}
				break;
			case Reverse:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				((BuiltInFunctionNameContext)_localctx).Reverse = match(Reverse);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Reverse.getLine() + " : Built-In: REVERSE");
				        
				}
				break;
			case Print:
				enterOuterAlt(_localctx, 4);
				{
				setState(349);
				((BuiltInFunctionNameContext)_localctx).Print = match(Print);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Print.getLine() + " : Built-In: PRINT");
				        
				}
				break;
			case Private:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				((BuiltInFunctionNameContext)_localctx).Private = match(Private);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Private.getLine() + " : Built-In: PRIVATE");
				        
				}
				break;
			case Public:
				enterOuterAlt(_localctx, 6);
				{
				setState(353);
				((BuiltInFunctionNameContext)_localctx).Public = match(Public);

				            System.out.println("Line " + ((BuiltInFunctionNameContext)_localctx).Public.getLine() + " : Built-In: PUBLIC");
				        
				}
				break;
			case Range:
				enterOuterAlt(_localctx, 7);
				{
				setState(355);
				match(Range);
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
			setState(358);
			builtInFunctionName();
			setState(359);
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
			setState(361);
			builtInFunctionListName();
			setState(362);
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
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Add:
				enterOuterAlt(_localctx, 1);
				{
				setState(364);
				((BuiltInFunctionListNameContext)_localctx).Add = match(Add);

				            System.out.println("Line " + ((BuiltInFunctionListNameContext)_localctx).Add.getLine() + " : Built-In: ADD");
				        
				}
				break;
			case Include:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				((BuiltInFunctionListNameContext)_localctx).Include = match(Include);

				            System.out.println("Line " + ((BuiltInFunctionListNameContext)_localctx).Include.getLine() + " : Built-In: INCLUDE");
				        
				}
				break;
			case Remove:
				enterOuterAlt(_localctx, 3);
				{
				setState(368);
				((BuiltInFunctionListNameContext)_localctx).Remove = match(Remove);

				            System.out.println("Line " + ((BuiltInFunctionListNameContext)_localctx).Remove.getLine() + " : Built-In: REMOVE");
				        
				}
				break;
			case Length:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
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
			setState(374);
			expression();
			setState(375);
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
			setState(377);
			((IfStatementContext)_localctx).If = match(If);

			            System.out.println("Line " + ((IfStatementContext)_localctx).If.getLine() + " : Decision: IF");
			        
			setState(379);
			expressionWithPar();
			setState(380);
			statementWithBrace();
			setState(389);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(381);
					((IfStatementContext)_localctx).Else = match(Else);
					setState(382);
					((IfStatementContext)_localctx).If = match(If);

					            System.out.println("Line " + ((IfStatementContext)_localctx).If.getLine() + " : Decision: ELSE IF");
					        
					setState(384);
					expressionWithPar();
					setState(385);
					statementWithBrace();
					}
					} 
				}
				setState(391);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(392);
				((IfStatementContext)_localctx).Else = match(Else);

				            System.out.println("Line " + ((IfStatementContext)_localctx).Else.getLine() + " : Decision: ELSE");
				        
				setState(394);
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
		public BuiltInFunctionNameContext builtInFunctionName() {
			return getRuleContext(BuiltInFunctionNameContext.class,0);
		}
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
			setState(397);
			_la = _input.LA(1);
			if ( !(_la==Self || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(398);
			((MethodCallContext)_localctx).Dot = match(Dot);
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Range:
			case ToLower:
			case ToUpper:
			case Reverse:
			case Print:
			case Private:
			case Public:
				{
				setState(399);
				builtInFunctionName();
				}
				break;
			case Identifier:
				{
				setState(400);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(403);
				argsWithPar();

				        System.out.println("Line " + ((MethodCallContext)_localctx).Dot.getLine() + " : Send Message");
				     
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT) {
					{
					setState(405);
					observers();
					}
				}

				}
				break;
			case Assign:
				{
				setState(408);
				((MethodCallContext)_localctx).Assign = match(Assign);

				        System.out.println("Line " + ((MethodCallContext)_localctx).Assign.getLine() + " : Assignment");
				     
				setState(410);
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
	public static class ObjectCallContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(SOACTParser.Dot, 0); }
		public List<TerminalNode> Identifier() { return getTokens(SOACTParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SOACTParser.Identifier, i);
		}
		public TerminalNode Self() { return getToken(SOACTParser.Self, 0); }
		public ObjectCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterObjectCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitObjectCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitObjectCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectCallContext objectCall() throws RecognitionException {
		ObjectCallContext _localctx = new ObjectCallContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_objectCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			_la = _input.LA(1);
			if ( !(_la==Self || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(414);
			match(Dot);
			setState(415);
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
		enterRule(_localctx, 88, RULE_observers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			match(AT);
			setState(418);
			match(Observers);
			setState(419);
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
		public Token Assign;
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
		public TerminalNode Assign() { return getToken(SOACTParser.Assign, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 90, RULE_declareVarStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			type();
			setState(422);
			match(Identifier);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(423);
				arraySize();
				}
			}

			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(426);
				initialayzer();
				}
				break;
			}
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(429);
				((DeclareVarStatementContext)_localctx).Assign = match(Assign);
				setState(430);
				functionCall();
				System.out.println( "Line " + ((DeclareVarStatementContext)_localctx).Assign.getLine() + " : Assignment");
				}
			}

			setState(435);
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
	public static class FunctionContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SOACTParser.Semi, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			functionCall();
			setState(438);
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
		enterRule(_localctx, 94, RULE_arraySize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(LeftBracket);
			setState(441);
			expression();
			setState(442);
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
		enterRule(_localctx, 96, RULE_initialayzer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((InitialayzerContext)_localctx).Assign = match(Assign);
			setState(445);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(SOACTParser.Identifier, 0); }
		public ArgsWithParContext argsWithPar() {
			return getRuleContext(ArgsWithParContext.class,0);
		}
		public ObserversContext observers() {
			return getRuleContext(ObserversContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SOACTListener ) ((SOACTListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SOACTVisitor ) return ((SOACTVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			((FunctionCallContext)_localctx).Identifier = match(Identifier);
			setState(449);
			argsWithPar();

			    System.out.println( "Line " + ((FunctionCallContext)_localctx).Identifier.getLine() + " : Send Message");
			    
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(451);
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
		enterRule(_localctx, 100, RULE_expressionWithPar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(LeftParen);
			setState(455);
			expression();
			setState(456);
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
		enterRule(_localctx, 102, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
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
		enterRule(_localctx, 104, RULE_logicalOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			logicalAnd();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OrOr) {
				{
				setState(461);
				((LogicalOrContext)_localctx).OrOr = match(OrOr);
				System.out.println("Line " + ((LogicalOrContext)_localctx).OrOr.getLine() + " : Operator:||");
				setState(463);
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
		enterRule(_localctx, 106, RULE_logicalAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			equality();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AndAnd) {
				{
				setState(467);
				((LogicalAndContext)_localctx).AndAnd = match(AndAnd);
				System.out.println("Line " + ((LogicalAndContext)_localctx).AndAnd.getLine() + " : Operator:&&");
				setState(469);
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
		enterRule(_localctx, 108, RULE_equality);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			relational();
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Equal:
				{
				setState(473);
				((EqualityContext)_localctx).Equal = match(Equal);
				System.out.println("Line " + ((EqualityContext)_localctx).Equal.getLine() + " : Operator:==");
				setState(475);
				equality();
				}
				break;
			case NotEqual:
				{
				setState(476);
				((EqualityContext)_localctx).NotEqual = match(NotEqual);
				System.out.println("Line " + ((EqualityContext)_localctx).NotEqual.getLine() + " : Operator:!=");
				setState(478);
				equality();
				}
				break;
			case Semi:
			case RightBrace:
			case AndAnd:
			case OrOr:
			case RightParen:
			case RightBracket:
			case Assign:
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
		enterRule(_localctx, 110, RULE_relational);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			additive();
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Less:
				{
				setState(482);
				((RelationalContext)_localctx).Less = match(Less);
				System.out.println("Line " + ((RelationalContext)_localctx).Less.getLine() + " : Operator:<");
				setState(484);
				relational();
				}
				break;
			case Greater:
				{
				setState(485);
				((RelationalContext)_localctx).Greater = match(Greater);
				System.out.println("Line " + ((RelationalContext)_localctx).Greater.getLine() + " : Operator:>");
				setState(487);
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
			case Assign:
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
		enterRule(_localctx, 112, RULE_additive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			multiplicative();
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Plus:
				{
				setState(491);
				((AdditiveContext)_localctx).Plus = match(Plus);
				System.out.println("Line " + ((AdditiveContext)_localctx).Plus.getLine() + " : Operator:+");
				setState(493);
				additive();
				}
				break;
			case Minus:
				{
				setState(494);
				((AdditiveContext)_localctx).Minus = match(Minus);
				System.out.println("Line " + ((AdditiveContext)_localctx).Minus.getLine() + " : Operator:-");
				setState(496);
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
			case Assign:
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
		enterRule(_localctx, 114, RULE_multiplicative);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			unary();
			setState(509);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Star:
				{
				setState(500);
				((MultiplicativeContext)_localctx).Star = match(Star);
				System.out.println("Line " + ((MultiplicativeContext)_localctx).Star.getLine() + " : Operator:*");
				setState(502);
				multiplicative();
				}
				break;
			case Div:
				{
				setState(503);
				((MultiplicativeContext)_localctx).Div = match(Div);
				System.out.println("Line " + ((MultiplicativeContext)_localctx).Div.getLine() + " : Operator:/");
				setState(505);
				multiplicative();
				}
				break;
			case Mod:
				{
				setState(506);
				((MultiplicativeContext)_localctx).Mod = match(Mod);
				System.out.println("Line " + ((MultiplicativeContext)_localctx).Mod.getLine() + " : Operator:%");
				setState(508);
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
			case Assign:
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
		enterRule(_localctx, 116, RULE_unary);
		try {
			setState(528);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				((UnaryContext)_localctx).PlusPlus = match(PlusPlus);
				setState(512);
				unary();
				System.out.println("Line " + ((UnaryContext)_localctx).PlusPlus.getLine() + " : Operator:++");
				}
				break;
			case MinusMinus:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				((UnaryContext)_localctx).MinusMinus = match(MinusMinus);
				setState(516);
				unary();
				System.out.println("Line " + ((UnaryContext)_localctx).MinusMinus.getLine() + " : Operator:--");
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 3);
				{
				setState(519);
				((UnaryContext)_localctx).Not = match(Not);
				setState(520);
				unary();
				System.out.println("Line " + ((UnaryContext)_localctx).Not.getLine() + " : Operator:!");
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 4);
				{
				setState(523);
				((UnaryContext)_localctx).Minus = match(Minus);
				setState(524);
				unary();
				System.out.println("Line " + ((UnaryContext)_localctx).Minus.getLine() + " : Operator:-");
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
				setState(527);
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
		enterRule(_localctx, 118, RULE_postfix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			arrayIndex();
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
				{
				setState(531);
				((PostfixContext)_localctx).PlusPlus = match(PlusPlus);
				System.out.println("Line " + ((PostfixContext)_localctx).PlusPlus.getLine() + " : Operator:++");
				}
				break;
			case MinusMinus:
				{
				setState(533);
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
			case Assign:
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
		enterRule(_localctx, 120, RULE_arrayIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			expressionPar();
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(538);
				match(LeftBracket);
				setState(539);
				expression();
				setState(540);
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
		enterRule(_localctx, 122, RULE_expressionPar);
		try {
			setState(549);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				match(LeftParen);
				setState(545);
				expression();
				setState(546);
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
				setState(548);
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
		enterRule(_localctx, 124, RULE_pipe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			terminal();
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Pipe) {
				{
				setState(552);
				((PipeContext)_localctx).Pipe = match(Pipe);
				setState(553);
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
		public ObjectCallContext objectCall() {
			return getRuleContext(ObjectCallContext.class,0);
		}
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
		enterRule(_localctx, 126, RULE_terminal);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				objectCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(559);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				actorInstance();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				recordInstance();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(562);
				primitiveUse();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(563);
				builtInFunction();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Self) {
					{
					setState(564);
					match(Self);
					setState(565);
					match(Dot);
					}
				}

				setState(568);
				match(StringLiteral);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(569);
				match(Identifier);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Dot) {
					{
					setState(570);
					match(Dot);
					setState(571);
					builtInFunctionList();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(574);
				match(Self);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(575);
				match(IntegerLiteral);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(576);
				match(BoolLiteral);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(577);
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
		enterRule(_localctx, 128, RULE_primitiveUse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(Identifier);
			setState(581);
			match(DoubleColon);
			setState(582);
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
		enterRule(_localctx, 130, RULE_actorInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(New);
			setState(585);
			match(Identifier);
			setState(586);
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
		enterRule(_localctx, 132, RULE_recordInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(Identifier);
			setState(589);
			match(LeftBrace);
			setState(590);
			recordArgs();
			setState(591);
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
		enterRule(_localctx, 134, RULE_type);
		try {
			setState(597);
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
				setState(593);
				((TypeContext)_localctx).builtInType = builtInType();

				        ((TypeContext)_localctx).is_msgrcv =  ((TypeContext)_localctx).builtInType.is_msgrcv;
				        ((TypeContext)_localctx).is_msgobs =  ((TypeContext)_localctx).builtInType.is_msgobs;
				    
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
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
		enterRule(_localctx, 136, RULE_builtInType);
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				match(Bool);
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(Int);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(601);
				match(String);
				}
				break;
			case Id:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				match(Id);
				}
				break;
			case Actor:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				match(Actor);
				}
				break;
			case Primitive:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				match(Primitive);
				}
				break;
			case MsgRcv:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				match(MsgRcv);

				        ((BuiltInTypeContext)_localctx).is_msgrcv =  true;
				    
				}
				break;
			case MsgObs:
				enterOuterAlt(_localctx, 8);
				{
				setState(607);
				match(MsgObs);

				        ((BuiltInTypeContext)_localctx).is_msgobs =  true;
				    
				}
				break;
			case ActorVars:
				enterOuterAlt(_localctx, 9);
				{
				setState(609);
				match(ActorVars);
				}
				break;
			case List:
				enterOuterAlt(_localctx, 10);
				{
				setState(610);
				list();
				}
				break;
			case Set:
				enterOuterAlt(_localctx, 11);
				{
				setState(611);
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
		enterRule(_localctx, 138, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			match(Set);
			setState(615);
			match(Less);
			setState(616);
			type();
			setState(617);
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
		enterRule(_localctx, 140, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(List);
			setState(620);
			match(Less);
			setState(621);
			type();
			setState(622);
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
		"\u0004\u0001P\u0271\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0001\u0000\u0003\u0000\u0090\b\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0004\u0001\u0095\b\u0001\u000b\u0001\f\u0001\u0096\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u009d\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u00a5\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005\u00aa"+
		"\b\u0005\u000b\u0005\f\u0005\u00ab\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00b1\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0003\b\u00b9\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00d3\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00e0\b\u0010\n"+
		"\u0010\f\u0010\u00e3\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00ec\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00f3"+
		"\b\u0013\n\u0013\f\u0013\u00f6\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u00fd\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0104\b\u0016\n\u0016"+
		"\f\u0016\u0107\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017"+
		"\u010c\b\u0017\n\u0017\f\u0017\u010f\t\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0117\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0004\u001a\u011c\b\u001a\u000b\u001a\f"+
		"\u001a\u011d\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u0129\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0135\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0003#\u014f\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0165\b$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u0175\b\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u0184\b)\n)\f)\u0187\t)\u0001)\u0001"+
		")\u0001)\u0003)\u018c\b)\u0001*\u0001*\u0001*\u0001*\u0003*\u0192\b*\u0001"+
		"*\u0001*\u0001*\u0003*\u0197\b*\u0001*\u0001*\u0001*\u0003*\u019c\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0003-\u01a9\b-\u0001-\u0003-\u01ac\b-\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u01b2\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00011\u00031\u01c5"+
		"\b1\u00012\u00012\u00012\u00012\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00034\u01d1\b4\u00015\u00015\u00015\u00015\u00035\u01d7\b5\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00036\u01e0\b6\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00037\u01e9\b7\u00018\u00018\u00018\u0001"+
		"8\u00018\u00018\u00018\u00038\u01f2\b8\u00019\u00019\u00019\u00019\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u00039\u01fe\b9\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0003:\u0211\b:\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0003;\u0218\b;\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u021f"+
		"\b<\u0001=\u0001=\u0001=\u0001=\u0001=\u0003=\u0226\b=\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0003>\u022d\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0003?\u0237\b?\u0001?\u0001?\u0001?\u0001?\u0003?\u023d"+
		"\b?\u0001?\u0001?\u0001?\u0001?\u0003?\u0243\b?\u0001@\u0001@\u0001@\u0001"+
		"@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"C\u0001C\u0001C\u0001C\u0003C\u0256\bC\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0265"+
		"\bD\u0001E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0000\u0000G\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u0000\u0001"+
		"\u0002\u0000::LL\u0284\u0000\u008f\u0001\u0000\u0000\u0000\u0002\u0094"+
		"\u0001\u0000\u0000\u0000\u0004\u009c\u0001\u0000\u0000\u0000\u0006\u009e"+
		"\u0001\u0000\u0000\u0000\b\u00a2\u0001\u0000\u0000\u0000\n\u00a9\u0001"+
		"\u0000\u0000\u0000\f\u00b0\u0001\u0000\u0000\u0000\u000e\u00b2\u0001\u0000"+
		"\u0000\u0000\u0010\u00b6\u0001\u0000\u0000\u0000\u0012\u00bf\u0001\u0000"+
		"\u0000\u0000\u0014\u00c3\u0001\u0000\u0000\u0000\u0016\u00c6\u0001\u0000"+
		"\u0000\u0000\u0018\u00cb\u0001\u0000\u0000\u0000\u001a\u00cf\u0001\u0000"+
		"\u0000\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e\u00d8\u0001\u0000"+
		"\u0000\u0000 \u00dc\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000"+
		"\u0000$\u00e9\u0001\u0000\u0000\u0000&\u00ef\u0001\u0000\u0000\u0000("+
		"\u00f7\u0001\u0000\u0000\u0000*\u00fa\u0001\u0000\u0000\u0000,\u0100\u0001"+
		"\u0000\u0000\u0000.\u0108\u0001\u0000\u0000\u00000\u0110\u0001\u0000\u0000"+
		"\u00002\u0114\u0001\u0000\u0000\u00004\u011b\u0001\u0000\u0000\u00006"+
		"\u0128\u0001\u0000\u0000\u00008\u012a\u0001\u0000\u0000\u0000:\u0134\u0001"+
		"\u0000\u0000\u0000<\u0136\u0001\u0000\u0000\u0000>\u013b\u0001\u0000\u0000"+
		"\u0000@\u013f\u0001\u0000\u0000\u0000B\u0144\u0001\u0000\u0000\u0000D"+
		"\u0148\u0001\u0000\u0000\u0000F\u014e\u0001\u0000\u0000\u0000H\u0164\u0001"+
		"\u0000\u0000\u0000J\u0166\u0001\u0000\u0000\u0000L\u0169\u0001\u0000\u0000"+
		"\u0000N\u0174\u0001\u0000\u0000\u0000P\u0176\u0001\u0000\u0000\u0000R"+
		"\u0179\u0001\u0000\u0000\u0000T\u018d\u0001\u0000\u0000\u0000V\u019d\u0001"+
		"\u0000\u0000\u0000X\u01a1\u0001\u0000\u0000\u0000Z\u01a5\u0001\u0000\u0000"+
		"\u0000\\\u01b5\u0001\u0000\u0000\u0000^\u01b8\u0001\u0000\u0000\u0000"+
		"`\u01bc\u0001\u0000\u0000\u0000b\u01c0\u0001\u0000\u0000\u0000d\u01c6"+
		"\u0001\u0000\u0000\u0000f\u01ca\u0001\u0000\u0000\u0000h\u01cc\u0001\u0000"+
		"\u0000\u0000j\u01d2\u0001\u0000\u0000\u0000l\u01d8\u0001\u0000\u0000\u0000"+
		"n\u01e1\u0001\u0000\u0000\u0000p\u01ea\u0001\u0000\u0000\u0000r\u01f3"+
		"\u0001\u0000\u0000\u0000t\u0210\u0001\u0000\u0000\u0000v\u0212\u0001\u0000"+
		"\u0000\u0000x\u0219\u0001\u0000\u0000\u0000z\u0225\u0001\u0000\u0000\u0000"+
		"|\u0227\u0001\u0000\u0000\u0000~\u0242\u0001\u0000\u0000\u0000\u0080\u0244"+
		"\u0001\u0000\u0000\u0000\u0082\u0248\u0001\u0000\u0000\u0000\u0084\u024c"+
		"\u0001\u0000\u0000\u0000\u0086\u0255\u0001\u0000\u0000\u0000\u0088\u0264"+
		"\u0001\u0000\u0000\u0000\u008a\u0266\u0001\u0000\u0000\u0000\u008c\u026b"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0003\u0002\u0001\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0000\u0000\u0001\u0092\u0001"+
		"\u0001\u0000\u0000\u0000\u0093\u0095\u0003\u0004\u0002\u0000\u0094\u0093"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0003"+
		"\u0001\u0000\u0000\u0000\u0098\u009d\u0003\"\u0011\u0000\u0099\u009d\u0003"+
		"\u0006\u0003\u0000\u009a\u009d\u0003\u0016\u000b\u0000\u009b\u009d\u0003"+
		"\u001c\u000e\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009c\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u0005\u0001\u0000\u0000\u0000\u009e\u009f\u0005"+
		")\u0000\u0000\u009f\u00a0\u0005L\u0000\u0000\u00a0\u00a1\u0003\b\u0004"+
		"\u0000\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2\u00a4\u0005\t\u0000\u0000"+
		"\u00a3\u00a5\u0003\n\u0005\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\n\u0000\u0000\u00a7\t\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0003\f\u0006\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00b1\u0003"+
		"\u0014\n\u0000\u00ae\u00b1\u0003\u000e\u0007\u0000\u00af\u00b1\u0003\u0010"+
		"\b\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\r\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0005L\u0000\u0000\u00b3\u00b4\u0003$\u0012\u0000\u00b4\u00b5"+
		"\u00032\u0019\u0000\u00b5\u000f\u0001\u0000\u0000\u0000\u00b6\u00b8\u0003"+
		"\u0086C\u0000\u00b7\u00b9\u0003\u0012\t\u0000\u00b8\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0005L\u0000\u0000\u00bb\u00bc\u0006\b\uffff"+
		"\uffff\u0000\u00bc\u00bd\u0003$\u0012\u0000\u00bd\u00be\u00032\u0019\u0000"+
		"\u00be\u0011\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\b\u0000\u0000\u00c0"+
		"\u00c1\u0005=\u0000\u0000\u00c1\u00c2\u0003*\u0015\u0000\u00c2\u0013\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005-\u0000\u0000\u00c4\u00c5\u0003\u0018"+
		"\f\u0000\u00c5\u0015\u0001\u0000\u0000\u0000\u00c6\u00c7\u00057\u0000"+
		"\u0000\u00c7\u00c8\u0006\u000b\uffff\uffff\u0000\u00c8\u00c9\u0005L\u0000"+
		"\u0000\u00c9\u00ca\u0003\u0018\f\u0000\u00ca\u0017\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0005\t\u0000\u0000\u00cc\u00cd\u0003\u001a\r\u0000\u00cd"+
		"\u00ce\u0005\n\u0000\u0000\u00ce\u0019\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0003(\u0014\u0000\u00d0\u00d2\u0005\u0004\u0000\u0000\u00d1\u00d3\u0003"+
		"\u001a\r\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d3\u001b\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005*\u0000"+
		"\u0000\u00d5\u00d6\u0005L\u0000\u0000\u00d6\u00d7\u0003\u001e\u000f\u0000"+
		"\u00d7\u001d\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\t\u0000\u0000\u00d9"+
		"\u00da\u0003 \u0010\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u001f"+
		"\u0001\u0000\u0000\u0000\u00dc\u00e1\u0005L\u0000\u0000\u00dd\u00de\u0005"+
		"!\u0000\u0000\u00de\u00e0\u0005L\u0000\u0000\u00df\u00dd\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2!\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005B\u0000\u0000\u00e5"+
		"\u00e6\u0006\u0011\uffff\uffff\u0000\u00e6\u00e7\u0003$\u0012\u0000\u00e7"+
		"\u00e8\u00032\u0019\u0000\u00e8#\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005"+
		"\u0012\u0000\u0000\u00ea\u00ec\u0003&\u0013\u0000\u00eb\u00ea\u0001\u0000"+
		"\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0005\u0013\u0000\u0000\u00ee%\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f4\u0003(\u0014\u0000\u00f0\u00f1\u0005!\u0000\u0000\u00f1"+
		"\u00f3\u0003(\u0014\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\'\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0003\u0086C\u0000\u00f8\u00f9\u0005L\u0000"+
		"\u0000\u00f9)\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u0012\u0000\u0000"+
		"\u00fb\u00fd\u0003,\u0016\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0013\u0000\u0000\u00ff+\u0001\u0000\u0000\u0000\u0100\u0105"+
		"\u0003f3\u0000\u0101\u0102\u0005!\u0000\u0000\u0102\u0104\u0003f3\u0000"+
		"\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106-\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108"+
		"\u010d\u00030\u0018\u0000\u0109\u010a\u0005!\u0000\u0000\u010a\u010c\u0003"+
		"0\u0018\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000"+
		"\u0000\u0000\u010e/\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0005L\u0000\u0000\u0111\u0112\u0005\u0006\u0000\u0000"+
		"\u0112\u0113\u0003f3\u0000\u01131\u0001\u0000\u0000\u0000\u0114\u0116"+
		"\u0005\t\u0000\u0000\u0115\u0117\u00034\u001a\u0000\u0116\u0115\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0005\n\u0000\u0000\u01193\u0001\u0000"+
		"\u0000\u0000\u011a\u011c\u00036\u001b\u0000\u011b\u011a\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e5\u0001\u0000\u0000\u0000"+
		"\u011f\u0129\u0003Z-\u0000\u0120\u0129\u0003\\.\u0000\u0121\u0129\u0003"+
		"P(\u0000\u0122\u0129\u0003F#\u0000\u0123\u0129\u0003R)\u0000\u0124\u0129"+
		"\u0003@ \u0000\u0125\u0129\u0003<\u001e\u0000\u0126\u0129\u00038\u001c"+
		"\u0000\u0127\u0129\u0003:\u001d\u0000\u0128\u011f\u0001\u0000\u0000\u0000"+
		"\u0128\u0120\u0001\u0000\u0000\u0000\u0128\u0121\u0001\u0000\u0000\u0000"+
		"\u0128\u0122\u0001\u0000\u0000\u0000\u0128\u0123\u0001\u0000\u0000\u0000"+
		"\u0128\u0124\u0001\u0000\u0000\u0000\u0128\u0125\u0001\u0000\u0000\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u01297\u0001\u0000\u0000\u0000\u012a\u012b\u00056\u0000\u0000\u012b\u012c"+
		"\u0006\u001c\uffff\uffff\u0000\u012c\u012d\u00032\u0019\u0000\u012d9\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u00050\u0000\u0000\u012f\u0130\u0006\u001d"+
		"\uffff\uffff\u0000\u0130\u0135\u0005\u0004\u0000\u0000\u0131\u0132\u0005"+
		"1\u0000\u0000\u0132\u0133\u0006\u001d\uffff\uffff\u0000\u0133\u0135\u0005"+
		"\u0004\u0000\u0000\u0134\u012e\u0001\u0000\u0000\u0000\u0134\u0131\u0001"+
		"\u0000\u0000\u0000\u0135;\u0001\u0000\u0000\u0000\u0136\u0137\u00055\u0000"+
		"\u0000\u0137\u0138\u0006\u001e\uffff\uffff\u0000\u0138\u0139\u0003>\u001f"+
		"\u0000\u0139\u013a\u00032\u0019\u0000\u013a=\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0005\u0012\u0000\u0000\u013c\u013d\u0003f3\u0000\u013d\u013e\u0005"+
		"\u0013\u0000\u0000\u013e?\u0001\u0000\u0000\u0000\u013f\u0140\u00054\u0000"+
		"\u0000\u0140\u0141\u0006 \uffff\uffff\u0000\u0141\u0142\u0003B!\u0000"+
		"\u0142\u0143\u00032\u0019\u0000\u0143A\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0005\u0012\u0000\u0000\u0145\u0146\u0003D\"\u0000\u0146\u0147\u0005"+
		"\u0013\u0000\u0000\u0147C\u0001\u0000\u0000\u0000\u0148\u0149\u0005L\u0000"+
		"\u0000\u0149\u014a\u00058\u0000\u0000\u014a\u014b\u0003f3\u0000\u014b"+
		"E\u0001\u0000\u0000\u0000\u014c\u014d\u0007\u0000\u0000\u0000\u014d\u014f"+
		"\u0005\u0007\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151"+
		"\u0005L\u0000\u0000\u0151\u0152\u0005\u001e\u0000\u0000\u0152\u0153\u0003"+
		"f3\u0000\u0153\u0154\u0006#\uffff\uffff\u0000\u0154\u0155\u0001\u0000"+
		"\u0000\u0000\u0155\u0156\u0005\u0004\u0000\u0000\u0156G\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0005>\u0000\u0000\u0158\u0165\u0006$\uffff\uffff\u0000"+
		"\u0159\u015a\u0005?\u0000\u0000\u015a\u0165\u0006$\uffff\uffff\u0000\u015b"+
		"\u015c\u0005@\u0000\u0000\u015c\u0165\u0006$\uffff\uffff\u0000\u015d\u015e"+
		"\u0005A\u0000\u0000\u015e\u0165\u0006$\uffff\uffff\u0000\u015f\u0160\u0005"+
		"G\u0000\u0000\u0160\u0165\u0006$\uffff\uffff\u0000\u0161\u0162\u0005H"+
		"\u0000\u0000\u0162\u0165\u0006$\uffff\uffff\u0000\u0163\u0165\u0005;\u0000"+
		"\u0000\u0164\u0157\u0001\u0000\u0000\u0000\u0164\u0159\u0001\u0000\u0000"+
		"\u0000\u0164\u015b\u0001\u0000\u0000\u0000\u0164\u015d\u0001\u0000\u0000"+
		"\u0000\u0164\u015f\u0001\u0000\u0000\u0000\u0164\u0161\u0001\u0000\u0000"+
		"\u0000\u0164\u0163\u0001\u0000\u0000\u0000\u0165I\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0003H$\u0000\u0167\u0168\u0003*\u0015\u0000\u0168K\u0001"+
		"\u0000\u0000\u0000\u0169\u016a\u0003N\'\u0000\u016a\u016b\u0003*\u0015"+
		"\u0000\u016bM\u0001\u0000\u0000\u0000\u016c\u016d\u0005C\u0000\u0000\u016d"+
		"\u0175\u0006\'\uffff\uffff\u0000\u016e\u016f\u0005D\u0000\u0000\u016f"+
		"\u0175\u0006\'\uffff\uffff\u0000\u0170\u0171\u0005E\u0000\u0000\u0171"+
		"\u0175\u0006\'\uffff\uffff\u0000\u0172\u0173\u0005F\u0000\u0000\u0173"+
		"\u0175\u0006\'\uffff\uffff\u0000\u0174\u016c\u0001\u0000\u0000\u0000\u0174"+
		"\u016e\u0001\u0000\u0000\u0000\u0174\u0170\u0001\u0000\u0000\u0000\u0174"+
		"\u0172\u0001\u0000\u0000\u0000\u0175O\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0003f3\u0000\u0177\u0178\u0005\u0004\u0000\u0000\u0178Q\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u00052\u0000\u0000\u017a\u017b\u0006)\uffff\uffff"+
		"\u0000\u017b\u017c\u0003d2\u0000\u017c\u0185\u00032\u0019\u0000\u017d"+
		"\u017e\u00053\u0000\u0000\u017e\u017f\u00052\u0000\u0000\u017f\u0180\u0006"+
		")\uffff\uffff\u0000\u0180\u0181\u0003d2\u0000\u0181\u0182\u00032\u0019"+
		"\u0000\u0182\u0184\u0001\u0000\u0000\u0000\u0183\u017d\u0001\u0000\u0000"+
		"\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000"+
		"\u0000\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u018b\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u00053\u0000\u0000"+
		"\u0189\u018a\u0006)\uffff\uffff\u0000\u018a\u018c\u00032\u0019\u0000\u018b"+
		"\u0188\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"S\u0001\u0000\u0000\u0000\u018d\u018e\u0007\u0000\u0000\u0000\u018e\u0191"+
		"\u0005\u0007\u0000\u0000\u018f\u0192\u0003H$\u0000\u0190\u0192\u0005L"+
		"\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191\u0190\u0001\u0000"+
		"\u0000\u0000\u0192\u019b\u0001\u0000\u0000\u0000\u0193\u0194\u0003*\u0015"+
		"\u0000\u0194\u0196\u0006*\uffff\uffff\u0000\u0195\u0197\u0003X,\u0000"+
		"\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u019c\u0001\u0000\u0000\u0000\u0198\u0199\u0005\u001e\u0000\u0000"+
		"\u0199\u019a\u0006*\uffff\uffff\u0000\u019a\u019c\u0005L\u0000\u0000\u019b"+
		"\u0193\u0001\u0000\u0000\u0000\u019b\u0198\u0001\u0000\u0000\u0000\u019c"+
		"U\u0001\u0000\u0000\u0000\u019d\u019e\u0007\u0000\u0000\u0000\u019e\u019f"+
		"\u0005\u0007\u0000\u0000\u019f\u01a0\u0005L\u0000\u0000\u01a0W\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0005\b\u0000\u0000\u01a2\u01a3\u0005<\u0000"+
		"\u0000\u01a3\u01a4\u0003*\u0015\u0000\u01a4Y\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0003\u0086C\u0000\u01a6\u01a8\u0005L\u0000\u0000\u01a7\u01a9\u0003"+
		"^/\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01ac\u0003`0\u0000\u01ab"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac"+
		"\u01b1\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u001e\u0000\u0000\u01ae"+
		"\u01af\u0003b1\u0000\u01af\u01b0\u0006-\uffff\uffff\u0000\u01b0\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000\u01b1\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4"+
		"\u0005\u0004\u0000\u0000\u01b4[\u0001\u0000\u0000\u0000\u01b5\u01b6\u0003"+
		"b1\u0000\u01b6\u01b7\u0005\u0004\u0000\u0000\u01b7]\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0005\u0014\u0000\u0000\u01b9\u01ba\u0003f3\u0000\u01ba"+
		"\u01bb\u0005\u0015\u0000\u0000\u01bb_\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0005\u001e\u0000\u0000\u01bd\u01be\u0003f3\u0000\u01be\u01bf\u00060"+
		"\uffff\uffff\u0000\u01bfa\u0001\u0000\u0000\u0000\u01c0\u01c1\u0005L\u0000"+
		"\u0000\u01c1\u01c2\u0003*\u0015\u0000\u01c2\u01c4\u00061\uffff\uffff\u0000"+
		"\u01c3\u01c5\u0003X,\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5c\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005"+
		"\u0012\u0000\u0000\u01c7\u01c8\u0003f3\u0000\u01c8\u01c9\u0005\u0013\u0000"+
		"\u0000\u01c9e\u0001\u0000\u0000\u0000\u01ca\u01cb\u0003h4\u0000\u01cb"+
		"g\u0001\u0000\u0000\u0000\u01cc\u01d0\u0003j5\u0000\u01cd\u01ce\u0005"+
		"\u0011\u0000\u0000\u01ce\u01cf\u00064\uffff\uffff\u0000\u01cf\u01d1\u0003"+
		"h4\u0000\u01d0\u01cd\u0001\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d1i\u0001\u0000\u0000\u0000\u01d2\u01d6\u0003l6\u0000\u01d3"+
		"\u01d4\u0005\u0010\u0000\u0000\u01d4\u01d5\u00065\uffff\uffff\u0000\u01d5"+
		"\u01d7\u0003j5\u0000\u01d6\u01d3\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001"+
		"\u0000\u0000\u0000\u01d7k\u0001\u0000\u0000\u0000\u01d8\u01df\u0003n7"+
		"\u0000\u01d9\u01da\u0005\u000e\u0000\u0000\u01da\u01db\u00066\uffff\uffff"+
		"\u0000\u01db\u01e0\u0003l6\u0000\u01dc\u01dd\u0005\u000f\u0000\u0000\u01dd"+
		"\u01de\u00066\uffff\uffff\u0000\u01de\u01e0\u0003l6\u0000\u01df\u01d9"+
		"\u0001\u0000\u0000\u0000\u01df\u01dc\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e0m\u0001\u0000\u0000\u0000\u01e1\u01e8\u0003"+
		"p8\u0000\u01e2\u01e3\u0005\u001f\u0000\u0000\u01e3\u01e4\u00067\uffff"+
		"\uffff\u0000\u01e4\u01e9\u0003n7\u0000\u01e5\u01e6\u0005 \u0000\u0000"+
		"\u01e6\u01e7\u00067\uffff\uffff\u0000\u01e7\u01e9\u0003n7\u0000\u01e8"+
		"\u01e2\u0001\u0000\u0000\u0000\u01e8\u01e5\u0001\u0000\u0000\u0000\u01e8"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e9o\u0001\u0000\u0000\u0000\u01ea\u01f1"+
		"\u0003r9\u0000\u01eb\u01ec\u0005\u0016\u0000\u0000\u01ec\u01ed\u00068"+
		"\uffff\uffff\u0000\u01ed\u01f2\u0003p8\u0000\u01ee\u01ef\u0005\u0017\u0000"+
		"\u0000\u01ef\u01f0\u00068\uffff\uffff\u0000\u01f0\u01f2\u0003p8\u0000"+
		"\u01f1\u01eb\u0001\u0000\u0000\u0000\u01f1\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2q\u0001\u0000\u0000\u0000\u01f3"+
		"\u01fd\u0003t:\u0000\u01f4\u01f5\u0005\u0018\u0000\u0000\u01f5\u01f6\u0006"+
		"9\uffff\uffff\u0000\u01f6\u01fe\u0003r9\u0000\u01f7\u01f8\u0005\u0019"+
		"\u0000\u0000\u01f8\u01f9\u00069\uffff\uffff\u0000\u01f9\u01fe\u0003r9"+
		"\u0000\u01fa\u01fb\u0005\u001a\u0000\u0000\u01fb\u01fc\u00069\uffff\uffff"+
		"\u0000\u01fc\u01fe\u0003r9\u0000\u01fd\u01f4\u0001\u0000\u0000\u0000\u01fd"+
		"\u01f7\u0001\u0000\u0000\u0000\u01fd\u01fa\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0001\u0000\u0000\u0000\u01fes\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u0005\f\u0000\u0000\u0200\u0201\u0003t:\u0000\u0201\u0202\u0006:\uffff"+
		"\uffff\u0000\u0202\u0211\u0001\u0000\u0000\u0000\u0203\u0204\u0005\r\u0000"+
		"\u0000\u0204\u0205\u0003t:\u0000\u0205\u0206\u0006:\uffff\uffff\u0000"+
		"\u0206\u0211\u0001\u0000\u0000\u0000\u0207\u0208\u0005\u001d\u0000\u0000"+
		"\u0208\u0209\u0003t:\u0000\u0209\u020a\u0006:\uffff\uffff\u0000\u020a"+
		"\u0211\u0001\u0000\u0000\u0000\u020b\u020c\u0005\u0017\u0000\u0000\u020c"+
		"\u020d\u0003t:\u0000\u020d\u020e\u0006:\uffff\uffff\u0000\u020e\u0211"+
		"\u0001\u0000\u0000\u0000\u020f\u0211\u0003v;\u0000\u0210\u01ff\u0001\u0000"+
		"\u0000\u0000\u0210\u0203\u0001\u0000\u0000\u0000\u0210\u0207\u0001\u0000"+
		"\u0000\u0000\u0210\u020b\u0001\u0000\u0000\u0000\u0210\u020f\u0001\u0000"+
		"\u0000\u0000\u0211u\u0001\u0000\u0000\u0000\u0212\u0217\u0003x<\u0000"+
		"\u0213\u0214\u0005\f\u0000\u0000\u0214\u0218\u0006;\uffff\uffff\u0000"+
		"\u0215\u0216\u0005\r\u0000\u0000\u0216\u0218\u0006;\uffff\uffff\u0000"+
		"\u0217\u0213\u0001\u0000\u0000\u0000\u0217\u0215\u0001\u0000\u0000\u0000"+
		"\u0217\u0218\u0001\u0000\u0000\u0000\u0218w\u0001\u0000\u0000\u0000\u0219"+
		"\u021e\u0003z=\u0000\u021a\u021b\u0005\u0014\u0000\u0000\u021b\u021c\u0003"+
		"f3\u0000\u021c\u021d\u0005\u0015\u0000\u0000\u021d\u021f\u0001\u0000\u0000"+
		"\u0000\u021e\u021a\u0001\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000"+
		"\u0000\u021fy\u0001\u0000\u0000\u0000\u0220\u0221\u0005\u0012\u0000\u0000"+
		"\u0221\u0222\u0003f3\u0000\u0222\u0223\u0005\u0013\u0000\u0000\u0223\u0226"+
		"\u0001\u0000\u0000\u0000\u0224\u0226\u0003|>\u0000\u0225\u0220\u0001\u0000"+
		"\u0000\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0226{\u0001\u0000\u0000"+
		"\u0000\u0227\u022c\u0003~?\u0000\u0228\u0229\u0005\u000b\u0000\u0000\u0229"+
		"\u022a\u0003|>\u0000\u022a\u022b\u0006>\uffff\uffff\u0000\u022b\u022d"+
		"\u0001\u0000\u0000\u0000\u022c\u0228\u0001\u0000\u0000\u0000\u022c\u022d"+
		"\u0001\u0000\u0000\u0000\u022d}\u0001\u0000\u0000\u0000\u022e\u0243\u0003"+
		"V+\u0000\u022f\u0243\u0003T*\u0000\u0230\u0243\u0003\u0082A\u0000\u0231"+
		"\u0243\u0003\u0084B\u0000\u0232\u0243\u0003\u0080@\u0000\u0233\u0243\u0003"+
		"J%\u0000\u0234\u0235\u0005:\u0000\u0000\u0235\u0237\u0005\u0007\u0000"+
		"\u0000\u0236\u0234\u0001\u0000\u0000\u0000\u0236\u0237\u0001\u0000\u0000"+
		"\u0000\u0237\u0238\u0001\u0000\u0000\u0000\u0238\u0243\u0005\u0003\u0000"+
		"\u0000\u0239\u023c\u0005L\u0000\u0000\u023a\u023b\u0005\u0007\u0000\u0000"+
		"\u023b\u023d\u0003L&\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0001\u0000\u0000\u0000\u023d\u0243\u0001\u0000\u0000\u0000\u023e\u0243"+
		"\u0005:\u0000\u0000\u023f\u0243\u0005\"\u0000\u0000\u0240\u0243\u0005"+
		"$\u0000\u0000\u0241\u0243\u0005K\u0000\u0000\u0242\u022e\u0001\u0000\u0000"+
		"\u0000\u0242\u022f\u0001\u0000\u0000\u0000\u0242\u0230\u0001\u0000\u0000"+
		"\u0000\u0242\u0231\u0001\u0000\u0000\u0000\u0242\u0232\u0001\u0000\u0000"+
		"\u0000\u0242\u0233\u0001\u0000\u0000\u0000\u0242\u0236\u0001\u0000\u0000"+
		"\u0000\u0242\u0239\u0001\u0000\u0000\u0000\u0242\u023e\u0001\u0000\u0000"+
		"\u0000\u0242\u023f\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000"+
		"\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0243\u007f\u0001\u0000\u0000"+
		"\u0000\u0244\u0245\u0005L\u0000\u0000\u0245\u0246\u0005\u0005\u0000\u0000"+
		"\u0246\u0247\u0005L\u0000\u0000\u0247\u0081\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u00059\u0000\u0000\u0249\u024a\u0005L\u0000\u0000\u024a\u024b\u0003"+
		"*\u0015\u0000\u024b\u0083\u0001\u0000\u0000\u0000\u024c\u024d\u0005L\u0000"+
		"\u0000\u024d\u024e\u0005\t\u0000\u0000\u024e\u024f\u0003.\u0017\u0000"+
		"\u024f\u0250\u0005\n\u0000\u0000\u0250\u0085\u0001\u0000\u0000\u0000\u0251"+
		"\u0252\u0003\u0088D\u0000\u0252\u0253\u0006C\uffff\uffff\u0000\u0253\u0256"+
		"\u0001\u0000\u0000\u0000\u0254\u0256\u0005L\u0000\u0000\u0255\u0251\u0001"+
		"\u0000\u0000\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0256\u0087\u0001"+
		"\u0000\u0000\u0000\u0257\u0265\u0005%\u0000\u0000\u0258\u0265\u0005&\u0000"+
		"\u0000\u0259\u0265\u0005\'\u0000\u0000\u025a\u0265\u0005(\u0000\u0000"+
		"\u025b\u0265\u0005)\u0000\u0000\u025c\u0265\u0005*\u0000\u0000\u025d\u025e"+
		"\u0005+\u0000\u0000\u025e\u0265\u0006D\uffff\uffff\u0000\u025f\u0260\u0005"+
		",\u0000\u0000\u0260\u0265\u0006D\uffff\uffff\u0000\u0261\u0265\u0005-"+
		"\u0000\u0000\u0262\u0265\u0003\u008cF\u0000\u0263\u0265\u0003\u008aE\u0000"+
		"\u0264\u0257\u0001\u0000\u0000\u0000\u0264\u0258\u0001\u0000\u0000\u0000"+
		"\u0264\u0259\u0001\u0000\u0000\u0000\u0264\u025a\u0001\u0000\u0000\u0000"+
		"\u0264\u025b\u0001\u0000\u0000\u0000\u0264\u025c\u0001\u0000\u0000\u0000"+
		"\u0264\u025d\u0001\u0000\u0000\u0000\u0264\u025f\u0001\u0000\u0000\u0000"+
		"\u0264\u0261\u0001\u0000\u0000\u0000\u0264\u0262\u0001\u0000\u0000\u0000"+
		"\u0264\u0263\u0001\u0000\u0000\u0000\u0265\u0089\u0001\u0000\u0000\u0000"+
		"\u0266\u0267\u0005/\u0000\u0000\u0267\u0268\u0005\u001f\u0000\u0000\u0268"+
		"\u0269\u0003\u0086C\u0000\u0269\u026a\u0005 \u0000\u0000\u026a\u008b\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0005.\u0000\u0000\u026c\u026d\u0005\u001f"+
		"\u0000\u0000\u026d\u026e\u0003\u0086C\u0000\u026e\u026f\u0005 \u0000\u0000"+
		"\u026f\u008d\u0001\u0000\u0000\u0000.\u008f\u0096\u009c\u00a4\u00ab\u00b0"+
		"\u00b8\u00d2\u00e1\u00eb\u00f4\u00fc\u0105\u010d\u0116\u011d\u0128\u0134"+
		"\u014e\u0164\u0174\u0185\u018b\u0191\u0196\u019b\u01a8\u01ab\u01b1\u01c4"+
		"\u01d0\u01d6\u01df\u01e8\u01f1\u01fd\u0210\u0217\u021e\u0225\u022c\u0236"+
		"\u023c\u0242\u0255\u0264";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}