// Generated from /home/sadra/Documents/Codes/Compiler/Complier-Design-and-Programming-Languages-Design/src/main/grammar/SOACT.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SOACTLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "COMMENT", "StringLiteral", "Semi", "DoubleColon", "Colon", "Dot", 
			"AT", "LeftBrace", "RightBrace", "Pipe", "PlusPlus", "MinusMinus", "Equal", 
			"NotEqual", "AndAnd", "OrOr", "LeftParen", "RightParen", "LeftBracket", 
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


	public SOACTLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SOACT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000P\u0213\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0001\u0000\u0004\u0000\u00a3\b\u0000\u000b\u0000\f\u0000"+
		"\u00a4\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u00ab"+
		"\b\u0001\n\u0001\f\u0001\u00ae\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u00b4\b\u0002\n\u0002\f\u0002\u00b7\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001!\u0001!\u0003!\u0103\b!\u0001\"\u0001\"\u0005\"\u0107\b\"\n\""+
		"\f\"\u010a\t\"\u0001#\u0001#\u0003#\u010e\b#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00013\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u0001"+
		"5\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001"+
		"J\u0001K\u0001K\u0001K\u0005K\u0207\bK\nK\fK\u020a\tK\u0001L\u0001L\u0001"+
		"M\u0001M\u0001N\u0001N\u0001O\u0001O\u0000\u0000P\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e"+
		"3g4i5k6m7o8q9s:u;w<y={>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0089E\u008b"+
		"F\u008dG\u008fH\u0091I\u0093J\u0095K\u0097L\u0099M\u009bN\u009dO\u009f"+
		"P\u0001\u0000\u0006\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u0003\u0000"+
		"AZ__az\u0001\u000019\u0001\u000009\u0004\u0000\n\n\r\r\"\"\\\\\u021a\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/"+
		"\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000"+
		"\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000"+
		"\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000="+
		"\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000"+
		"\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000"+
		"\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K"+
		"\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000"+
		"\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000"+
		"\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y"+
		"\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000"+
		"\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000"+
		"\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000g"+
		"\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001\u0000"+
		"\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000\u0000"+
		"\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000u"+
		"\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001\u0000"+
		"\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000\u0000"+
		"\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000\u0000"+
		"\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000\u0000"+
		"\u0000\u0087\u0001\u0000\u0000\u0000\u0000\u0089\u0001\u0000\u0000\u0000"+
		"\u0000\u008b\u0001\u0000\u0000\u0000\u0000\u008d\u0001\u0000\u0000\u0000"+
		"\u0000\u008f\u0001\u0000\u0000\u0000\u0000\u0091\u0001\u0000\u0000\u0000"+
		"\u0000\u0093\u0001\u0000\u0000\u0000\u0000\u0095\u0001\u0000\u0000\u0000"+
		"\u0000\u0097\u0001\u0000\u0000\u0000\u0000\u0099\u0001\u0000\u0000\u0000"+
		"\u0000\u009b\u0001\u0000\u0000\u0000\u0000\u009d\u0001\u0000\u0000\u0000"+
		"\u0000\u009f\u0001\u0000\u0000\u0000\u0001\u00a2\u0001\u0000\u0000\u0000"+
		"\u0003\u00a8\u0001\u0000\u0000\u0000\u0005\u00b1\u0001\u0000\u0000\u0000"+
		"\u0007\u00ba\u0001\u0000\u0000\u0000\t\u00bc\u0001\u0000\u0000\u0000\u000b"+
		"\u00bf\u0001\u0000\u0000\u0000\r\u00c1\u0001\u0000\u0000\u0000\u000f\u00c3"+
		"\u0001\u0000\u0000\u0000\u0011\u00c5\u0001\u0000\u0000\u0000\u0013\u00c7"+
		"\u0001\u0000\u0000\u0000\u0015\u00c9\u0001\u0000\u0000\u0000\u0017\u00cc"+
		"\u0001\u0000\u0000\u0000\u0019\u00cf\u0001\u0000\u0000\u0000\u001b\u00d2"+
		"\u0001\u0000\u0000\u0000\u001d\u00d5\u0001\u0000\u0000\u0000\u001f\u00d8"+
		"\u0001\u0000\u0000\u0000!\u00db\u0001\u0000\u0000\u0000#\u00de\u0001\u0000"+
		"\u0000\u0000%\u00e0\u0001\u0000\u0000\u0000\'\u00e2\u0001\u0000\u0000"+
		"\u0000)\u00e4\u0001\u0000\u0000\u0000+\u00e6\u0001\u0000\u0000\u0000-"+
		"\u00e8\u0001\u0000\u0000\u0000/\u00ea\u0001\u0000\u0000\u00001\u00ec\u0001"+
		"\u0000\u0000\u00003\u00ee\u0001\u0000\u0000\u00005\u00f2\u0001\u0000\u0000"+
		"\u00007\u00f4\u0001\u0000\u0000\u00009\u00f6\u0001\u0000\u0000\u0000;"+
		"\u00f8\u0001\u0000\u0000\u0000=\u00fa\u0001\u0000\u0000\u0000?\u00fc\u0001"+
		"\u0000\u0000\u0000A\u00fe\u0001\u0000\u0000\u0000C\u0102\u0001\u0000\u0000"+
		"\u0000E\u0104\u0001\u0000\u0000\u0000G\u010d\u0001\u0000\u0000\u0000I"+
		"\u010f\u0001\u0000\u0000\u0000K\u0114\u0001\u0000\u0000\u0000M\u0118\u0001"+
		"\u0000\u0000\u0000O\u011f\u0001\u0000\u0000\u0000Q\u0122\u0001\u0000\u0000"+
		"\u0000S\u0128\u0001\u0000\u0000\u0000U\u0132\u0001\u0000\u0000\u0000W"+
		"\u0139\u0001\u0000\u0000\u0000Y\u0140\u0001\u0000\u0000\u0000[\u014a\u0001"+
		"\u0000\u0000\u0000]\u014f\u0001\u0000\u0000\u0000_\u0153\u0001\u0000\u0000"+
		"\u0000a\u0159\u0001\u0000\u0000\u0000c\u0162\u0001\u0000\u0000\u0000e"+
		"\u0165\u0001\u0000\u0000\u0000g\u016a\u0001\u0000\u0000\u0000i\u016e\u0001"+
		"\u0000\u0000\u0000k\u0174\u0001\u0000\u0000\u0000m\u0179\u0001\u0000\u0000"+
		"\u0000o\u0180\u0001\u0000\u0000\u0000q\u0183\u0001\u0000\u0000\u0000s"+
		"\u0187\u0001\u0000\u0000\u0000u\u018c\u0001\u0000\u0000\u0000w\u0192\u0001"+
		"\u0000\u0000\u0000y\u019c\u0001\u0000\u0000\u0000{\u01a7\u0001\u0000\u0000"+
		"\u0000}\u01af\u0001\u0000\u0000\u0000\u007f\u01b7\u0001\u0000\u0000\u0000"+
		"\u0081\u01bf\u0001\u0000\u0000\u0000\u0083\u01c5\u0001\u0000\u0000\u0000"+
		"\u0085\u01ca\u0001\u0000\u0000\u0000\u0087\u01ce\u0001\u0000\u0000\u0000"+
		"\u0089\u01d6\u0001\u0000\u0000\u0000\u008b\u01dd\u0001\u0000\u0000\u0000"+
		"\u008d\u01e4\u0001\u0000\u0000\u0000\u008f\u01ec\u0001\u0000\u0000\u0000"+
		"\u0091\u01f3\u0001\u0000\u0000\u0000\u0093\u01f8\u0001\u0000\u0000\u0000"+
		"\u0095\u01fe\u0001\u0000\u0000\u0000\u0097\u0203\u0001\u0000\u0000\u0000"+
		"\u0099\u020b\u0001\u0000\u0000\u0000\u009b\u020d\u0001\u0000\u0000\u0000"+
		"\u009d\u020f\u0001\u0000\u0000\u0000\u009f\u0211\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0007\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0006\u0000\u0000\u0000\u00a7\u0002\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ac\u0005%\u0000\u0000\u00a9\u00ab\b\u0001\u0000\u0000\u00aa"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad"+
		"\u00af\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0006\u0001\u0000\u0000\u00b0\u0004\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b5\u0005\"\u0000\u0000\u00b2\u00b4\u0003\u009fO\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0005\"\u0000\u0000\u00b9\u0006\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		";\u0000\u0000\u00bb\b\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005:\u0000"+
		"\u0000\u00bd\u00be\u0005:\u0000\u0000\u00be\n\u0001\u0000\u0000\u0000"+
		"\u00bf\u00c0\u0005:\u0000\u0000\u00c0\f\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0005.\u0000\u0000\u00c2\u000e\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0005@\u0000\u0000\u00c4\u0010\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"{\u0000\u0000\u00c6\u0012\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005}\u0000"+
		"\u0000\u00c8\u0014\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005|\u0000\u0000"+
		"\u00ca\u00cb\u0005>\u0000\u0000\u00cb\u0016\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0005+\u0000\u0000\u00cd\u00ce\u0005+\u0000\u0000\u00ce\u0018\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005-\u0000\u0000\u00d0\u00d1\u0005-\u0000"+
		"\u0000\u00d1\u001a\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005=\u0000\u0000"+
		"\u00d3\u00d4\u0005=\u0000\u0000\u00d4\u001c\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d6\u0005!\u0000\u0000\u00d6\u00d7\u0005=\u0000\u0000\u00d7\u001e\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d9\u0005&\u0000\u0000\u00d9\u00da\u0005&\u0000"+
		"\u0000\u00da \u0001\u0000\u0000\u0000\u00db\u00dc\u0005|\u0000\u0000\u00dc"+
		"\u00dd\u0005|\u0000\u0000\u00dd\"\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005(\u0000\u0000\u00df$\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005)"+
		"\u0000\u0000\u00e1&\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005[\u0000\u0000"+
		"\u00e3(\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005]\u0000\u0000\u00e5*"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005+\u0000\u0000\u00e7,\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005-\u0000\u0000\u00e9.\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0005*\u0000\u0000\u00eb0\u0001\u0000\u0000\u0000\u00ec\u00ed"+
		"\u0005/\u0000\u0000\u00ed2\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005m"+
		"\u0000\u0000\u00ef\u00f0\u0005o\u0000\u0000\u00f0\u00f1\u0005d\u0000\u0000"+
		"\u00f14\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005&\u0000\u0000\u00f36"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005|\u0000\u0000\u00f58\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005!\u0000\u0000\u00f7:\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0005=\u0000\u0000\u00f9<\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005<\u0000\u0000\u00fb>\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005>"+
		"\u0000\u0000\u00fd@\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005,\u0000\u0000"+
		"\u00ffB\u0001\u0000\u0000\u0000\u0100\u0103\u00050\u0000\u0000\u0101\u0103"+
		"\u0003E\"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0101\u0001"+
		"\u0000\u0000\u0000\u0103D\u0001\u0000\u0000\u0000\u0104\u0108\u0003\u009b"+
		"M\u0000\u0105\u0107\u0003\u009dN\u0000\u0106\u0105\u0001\u0000\u0000\u0000"+
		"\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0001\u0000\u0000\u0000\u0109F\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010b\u010e\u0003\u0091H\u0000\u010c\u010e"+
		"\u0003\u0093I\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010eH\u0001\u0000\u0000\u0000\u010f\u0110\u0005b\u0000"+
		"\u0000\u0110\u0111\u0005o\u0000\u0000\u0111\u0112\u0005o\u0000\u0000\u0112"+
		"\u0113\u0005l\u0000\u0000\u0113J\u0001\u0000\u0000\u0000\u0114\u0115\u0005"+
		"i\u0000\u0000\u0115\u0116\u0005n\u0000\u0000\u0116\u0117\u0005t\u0000"+
		"\u0000\u0117L\u0001\u0000\u0000\u0000\u0118\u0119\u0005s\u0000\u0000\u0119"+
		"\u011a\u0005t\u0000\u0000\u011a\u011b\u0005r\u0000\u0000\u011b\u011c\u0005"+
		"i\u0000\u0000\u011c\u011d\u0005n\u0000\u0000\u011d\u011e\u0005g\u0000"+
		"\u0000\u011eN\u0001\u0000\u0000\u0000\u011f\u0120\u0005I\u0000\u0000\u0120"+
		"\u0121\u0005D\u0000\u0000\u0121P\u0001\u0000\u0000\u0000\u0122\u0123\u0005"+
		"A\u0000\u0000\u0123\u0124\u0005c\u0000\u0000\u0124\u0125\u0005t\u0000"+
		"\u0000\u0125\u0126\u0005o\u0000\u0000\u0126\u0127\u0005r\u0000\u0000\u0127"+
		"R\u0001\u0000\u0000\u0000\u0128\u0129\u0005p\u0000\u0000\u0129\u012a\u0005"+
		"r\u0000\u0000\u012a\u012b\u0005i\u0000\u0000\u012b\u012c\u0005m\u0000"+
		"\u0000\u012c\u012d\u0005i\u0000\u0000\u012d\u012e\u0005t\u0000\u0000\u012e"+
		"\u012f\u0005i\u0000\u0000\u012f\u0130\u0005v\u0000\u0000\u0130\u0131\u0005"+
		"e\u0000\u0000\u0131T\u0001\u0000\u0000\u0000\u0132\u0133\u0005m\u0000"+
		"\u0000\u0133\u0134\u0005s\u0000\u0000\u0134\u0135\u0005g\u0000\u0000\u0135"+
		"\u0136\u0005R\u0000\u0000\u0136\u0137\u0005c\u0000\u0000\u0137\u0138\u0005"+
		"v\u0000\u0000\u0138V\u0001\u0000\u0000\u0000\u0139\u013a\u0005m\u0000"+
		"\u0000\u013a\u013b\u0005s\u0000\u0000\u013b\u013c\u0005g\u0000\u0000\u013c"+
		"\u013d\u0005O\u0000\u0000\u013d\u013e\u0005b\u0000\u0000\u013e\u013f\u0005"+
		"s\u0000\u0000\u013fX\u0001\u0000\u0000\u0000\u0140\u0141\u0005a\u0000"+
		"\u0000\u0141\u0142\u0005c\u0000\u0000\u0142\u0143\u0005t\u0000\u0000\u0143"+
		"\u0144\u0005o\u0000\u0000\u0144\u0145\u0005r\u0000\u0000\u0145\u0146\u0005"+
		"V\u0000\u0000\u0146\u0147\u0005a\u0000\u0000\u0147\u0148\u0005r\u0000"+
		"\u0000\u0148\u0149\u0005s\u0000\u0000\u0149Z\u0001\u0000\u0000\u0000\u014a"+
		"\u014b\u0005L\u0000\u0000\u014b\u014c\u0005i\u0000\u0000\u014c\u014d\u0005"+
		"s\u0000\u0000\u014d\u014e\u0005t\u0000\u0000\u014e\\\u0001\u0000\u0000"+
		"\u0000\u014f\u0150\u0005S\u0000\u0000\u0150\u0151\u0005e\u0000\u0000\u0151"+
		"\u0152\u0005t\u0000\u0000\u0152^\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"b\u0000\u0000\u0154\u0155\u0005r\u0000\u0000\u0155\u0156\u0005e\u0000"+
		"\u0000\u0156\u0157\u0005a\u0000\u0000\u0157\u0158\u0005k\u0000\u0000\u0158"+
		"`\u0001\u0000\u0000\u0000\u0159\u015a\u0005c\u0000\u0000\u015a\u015b\u0005"+
		"o\u0000\u0000\u015b\u015c\u0005n\u0000\u0000\u015c\u015d\u0005t\u0000"+
		"\u0000\u015d\u015e\u0005i\u0000\u0000\u015e\u015f\u0005n\u0000\u0000\u015f"+
		"\u0160\u0005u\u0000\u0000\u0160\u0161\u0005e\u0000\u0000\u0161b\u0001"+
		"\u0000\u0000\u0000\u0162\u0163\u0005i\u0000\u0000\u0163\u0164\u0005f\u0000"+
		"\u0000\u0164d\u0001\u0000\u0000\u0000\u0165\u0166\u0005e\u0000\u0000\u0166"+
		"\u0167\u0005l\u0000\u0000\u0167\u0168\u0005s\u0000\u0000\u0168\u0169\u0005"+
		"e\u0000\u0000\u0169f\u0001\u0000\u0000\u0000\u016a\u016b\u0005f\u0000"+
		"\u0000\u016b\u016c\u0005o\u0000\u0000\u016c\u016d\u0005r\u0000\u0000\u016d"+
		"h\u0001\u0000\u0000\u0000\u016e\u016f\u0005w\u0000\u0000\u016f\u0170\u0005"+
		"h\u0000\u0000\u0170\u0171\u0005i\u0000\u0000\u0171\u0172\u0005l\u0000"+
		"\u0000\u0172\u0173\u0005e\u0000\u0000\u0173j\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0005j\u0000\u0000\u0175\u0176\u0005o\u0000\u0000\u0176\u0177\u0005"+
		"i\u0000\u0000\u0177\u0178\u0005n\u0000\u0000\u0178l\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0005R\u0000\u0000\u017a\u017b\u0005e\u0000\u0000\u017b"+
		"\u017c\u0005c\u0000\u0000\u017c\u017d\u0005o\u0000\u0000\u017d\u017e\u0005"+
		"r\u0000\u0000\u017e\u017f\u0005d\u0000\u0000\u017fn\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0005i\u0000\u0000\u0181\u0182\u0005n\u0000\u0000\u0182"+
		"p\u0001\u0000\u0000\u0000\u0183\u0184\u0005n\u0000\u0000\u0184\u0185\u0005"+
		"e\u0000\u0000\u0185\u0186\u0005w\u0000\u0000\u0186r\u0001\u0000\u0000"+
		"\u0000\u0187\u0188\u0005s\u0000\u0000\u0188\u0189\u0005e\u0000\u0000\u0189"+
		"\u018a\u0005l\u0000\u0000\u018a\u018b\u0005f\u0000\u0000\u018bt\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0005r\u0000\u0000\u018d\u018e\u0005a\u0000"+
		"\u0000\u018e\u018f\u0005n\u0000\u0000\u018f\u0190\u0005g\u0000\u0000\u0190"+
		"\u0191\u0005e\u0000\u0000\u0191v\u0001\u0000\u0000\u0000\u0192\u0193\u0005"+
		"o\u0000\u0000\u0193\u0194\u0005b\u0000\u0000\u0194\u0195\u0005s\u0000"+
		"\u0000\u0195\u0196\u0005e\u0000\u0000\u0196\u0197\u0005r\u0000\u0000\u0197"+
		"\u0198\u0005v\u0000\u0000\u0198\u0199\u0005e\u0000\u0000\u0199\u019a\u0005"+
		"r\u0000\u0000\u019a\u019b\u0005s\u0000\u0000\u019bx\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0005a\u0000\u0000\u019d\u019e\u0005u\u0000\u0000\u019e"+
		"\u019f\u0005t\u0000\u0000\u019f\u01a0\u0005h\u0000\u0000\u01a0\u01a1\u0005"+
		"o\u0000\u0000\u01a1\u01a2\u0005r\u0000\u0000\u01a2\u01a3\u0005i\u0000"+
		"\u0000\u01a3\u01a4\u0005z\u0000\u0000\u01a4\u01a5\u0005e\u0000\u0000\u01a5"+
		"\u01a6\u0005d\u0000\u0000\u01a6z\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005"+
		"t\u0000\u0000\u01a8\u01a9\u0005o\u0000\u0000\u01a9\u01aa\u0005L\u0000"+
		"\u0000\u01aa\u01ab\u0005o\u0000\u0000\u01ab\u01ac\u0005w\u0000\u0000\u01ac"+
		"\u01ad\u0005e\u0000\u0000\u01ad\u01ae\u0005r\u0000\u0000\u01ae|\u0001"+
		"\u0000\u0000\u0000\u01af\u01b0\u0005t\u0000\u0000\u01b0\u01b1\u0005o\u0000"+
		"\u0000\u01b1\u01b2\u0005U\u0000\u0000\u01b2\u01b3\u0005p\u0000\u0000\u01b3"+
		"\u01b4\u0005p\u0000\u0000\u01b4\u01b5\u0005e\u0000\u0000\u01b5\u01b6\u0005"+
		"r\u0000\u0000\u01b6~\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005r\u0000"+
		"\u0000\u01b8\u01b9\u0005e\u0000\u0000\u01b9\u01ba\u0005v\u0000\u0000\u01ba"+
		"\u01bb\u0005e\u0000\u0000\u01bb\u01bc\u0005r\u0000\u0000\u01bc\u01bd\u0005"+
		"s\u0000\u0000\u01bd\u01be\u0005e\u0000\u0000\u01be\u0080\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0005p\u0000\u0000\u01c0\u01c1\u0005r\u0000\u0000\u01c1"+
		"\u01c2\u0005i\u0000\u0000\u01c2\u01c3\u0005n\u0000\u0000\u01c3\u01c4\u0005"+
		"t\u0000\u0000\u01c4\u0082\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005m\u0000"+
		"\u0000\u01c6\u01c7\u0005a\u0000\u0000\u01c7\u01c8\u0005i\u0000\u0000\u01c8"+
		"\u01c9\u0005n\u0000\u0000\u01c9\u0084\u0001\u0000\u0000\u0000\u01ca\u01cb"+
		"\u0005a\u0000\u0000\u01cb\u01cc\u0005d\u0000\u0000\u01cc\u01cd\u0005d"+
		"\u0000\u0000\u01cd\u0086\u0001\u0000\u0000\u0000\u01ce\u01cf\u0005i\u0000"+
		"\u0000\u01cf\u01d0\u0005n\u0000\u0000\u01d0\u01d1\u0005c\u0000\u0000\u01d1"+
		"\u01d2\u0005l\u0000\u0000\u01d2\u01d3\u0005u\u0000\u0000\u01d3\u01d4\u0005"+
		"d\u0000\u0000\u01d4\u01d5\u0005e\u0000\u0000\u01d5\u0088\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0005r\u0000\u0000\u01d7\u01d8\u0005e\u0000\u0000\u01d8"+
		"\u01d9\u0005m\u0000\u0000\u01d9\u01da\u0005o\u0000\u0000\u01da\u01db\u0005"+
		"v\u0000\u0000\u01db\u01dc\u0005e\u0000\u0000\u01dc\u008a\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0005l\u0000\u0000\u01de\u01df\u0005e\u0000\u0000\u01df"+
		"\u01e0\u0005n\u0000\u0000\u01e0\u01e1\u0005g\u0000\u0000\u01e1\u01e2\u0005"+
		"t\u0000\u0000\u01e2\u01e3\u0005h\u0000\u0000\u01e3\u008c\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0005p\u0000\u0000\u01e5\u01e6\u0005r\u0000\u0000\u01e6"+
		"\u01e7\u0005i\u0000\u0000\u01e7\u01e8\u0005v\u0000\u0000\u01e8\u01e9\u0005"+
		"a\u0000\u0000\u01e9\u01ea\u0005t\u0000\u0000\u01ea\u01eb\u0005e\u0000"+
		"\u0000\u01eb\u008e\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005p\u0000\u0000"+
		"\u01ed\u01ee\u0005u\u0000\u0000\u01ee\u01ef\u0005b\u0000\u0000\u01ef\u01f0"+
		"\u0005l\u0000\u0000\u01f0\u01f1\u0005i\u0000\u0000\u01f1\u01f2\u0005c"+
		"\u0000\u0000\u01f2\u0090\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005t\u0000"+
		"\u0000\u01f4\u01f5\u0005r\u0000\u0000\u01f5\u01f6\u0005u\u0000\u0000\u01f6"+
		"\u01f7\u0005e\u0000\u0000\u01f7\u0092\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0005f\u0000\u0000\u01f9\u01fa\u0005a\u0000\u0000\u01fa\u01fb\u0005l"+
		"\u0000\u0000\u01fb\u01fc\u0005s\u0000\u0000\u01fc\u01fd\u0005e\u0000\u0000"+
		"\u01fd\u0094\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005n\u0000\u0000\u01ff"+
		"\u0200\u0005u\u0000\u0000\u0200\u0201\u0005l\u0000\u0000\u0201\u0202\u0005"+
		"l\u0000\u0000\u0202\u0096\u0001\u0000\u0000\u0000\u0203\u0208\u0003\u0099"+
		"L\u0000\u0204\u0207\u0003\u0099L\u0000\u0205\u0207\u0003\u009dN\u0000"+
		"\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0205\u0001\u0000\u0000\u0000"+
		"\u0207\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000"+
		"\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u0098\u0001\u0000\u0000\u0000"+
		"\u020a\u0208\u0001\u0000\u0000\u0000\u020b\u020c\u0007\u0002\u0000\u0000"+
		"\u020c\u009a\u0001\u0000\u0000\u0000\u020d\u020e\u0007\u0003\u0000\u0000"+
		"\u020e\u009c\u0001\u0000\u0000\u0000\u020f\u0210\u0007\u0004\u0000\u0000"+
		"\u0210\u009e\u0001\u0000\u0000\u0000\u0211\u0212\b\u0005\u0000\u0000\u0212"+
		"\u00a0\u0001\u0000\u0000\u0000\t\u0000\u00a4\u00ac\u00b5\u0102\u0108\u010d"+
		"\u0206\u0208\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}