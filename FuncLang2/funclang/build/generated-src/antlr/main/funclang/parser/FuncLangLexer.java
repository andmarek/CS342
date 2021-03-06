// Generated from funclang/parser/FuncLang.g by ANTLR 4.5
package funclang.parser; import static funclang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FuncLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		Define=10, Let=11, Letrec=12, Lambda=13, If=14, Car=15, Cdr=16, Cons=17, 
		List=18, Null=19, Less=20, Equal=21, Greater=22, TrueLiteral=23, FalseLiteral=24, 
		Ref=25, Deref=26, Assign=27, Free=28, Fork=29, Lock=30, UnLock=31, Process=32, 
		Send=33, Stop=34, Self=35, Dot=36, Number=37, Identifier=38, Letter=39, 
		LetterOrDigit=40, StrLiteral=41, AT=42, ELLIPSIS=43, WS=44, Comment=45, 
		Line_Comment=46;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"Define", "Let", "Letrec", "Lambda", "If", "Car", "Cdr", "Cons", "List", 
		"Null", "Less", "Equal", "Greater", "TrueLiteral", "FalseLiteral", "Ref", 
		"Deref", "Assign", "Free", "Fork", "Lock", "UnLock", "Process", "Send", 
		"Stop", "Self", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"DIGIT", "ESCQUOTE", "StrLiteral", "AT", "ELLIPSIS", "WS", "Comment", 
		"Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'&'", "'|'", "'-'", "'+'", "'*'", "'/'", "'isList'", 
		"'define'", "'let'", "'letrec'", "'lambda'", "'if'", "'car'", "'cdr'", 
		"'cons'", "'list'", "'null?'", "'<'", "'='", "'>'", "'#t'", "'#f'", "'ref'", 
		"'deref'", "'set!'", "'free'", "'fork'", "'lock'", "'unlock'", "'process'", 
		"'send'", "'stop'", "'self'", "'.'", null, null, null, null, null, "'@'", 
		"'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "Define", 
		"Let", "Letrec", "Lambda", "If", "Car", "Cdr", "Cons", "List", "Null", 
		"Less", "Equal", "Greater", "TrueLiteral", "FalseLiteral", "Ref", "Deref", 
		"Assign", "Free", "Fork", "Lock", "UnLock", "Process", "Send", "Stop", 
		"Self", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", "StrLiteral", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
	};
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


	public FuncLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FuncLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 38:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 39:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0149\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3&\6&\u00fa\n&\r&\16&\u00fb\3\'\3\'\7\'\u0100\n\'\f\'\16\'\u0103\13\'"+
		"\3(\3(\3(\3(\3(\3(\5(\u010b\n(\3)\3)\3)\3)\3)\3)\5)\u0113\n)\3*\3*\3+"+
		"\3+\3+\3,\3,\3,\7,\u011d\n,\f,\16,\u0120\13,\3,\3,\3-\3-\3.\3.\3.\3.\3"+
		"/\6/\u012b\n/\r/\16/\u012c\3/\3/\3\60\3\60\3\60\3\60\7\60\u0135\n\60\f"+
		"\60\16\60\u0138\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61"+
		"\u0143\n\61\f\61\16\61\u0146\13\61\3\61\3\61\4\u011e\u0136\2\62\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S\2U\2W+Y,[-]._/a\60\3\2\t\6\2&&C\\aac|\4\2\2\u0101"+
		"\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\4\2\f\f"+
		"\17\17\5\2\13\f\16\17\"\"\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3\2\2\2\ti\3\2\2\2\13k\3\2\2"+
		"\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25z\3\2\2\2\27\u0081"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u008c\3\2\2\2\35\u0093\3\2\2\2\37\u0096\3"+
		"\2\2\2!\u009a\3\2\2\2#\u009e\3\2\2\2%\u00a3\3\2\2\2\'\u00a8\3\2\2\2)\u00ae"+
		"\3\2\2\2+\u00b0\3\2\2\2-\u00b2\3\2\2\2/\u00b4\3\2\2\2\61\u00b7\3\2\2\2"+
		"\63\u00ba\3\2\2\2\65\u00be\3\2\2\2\67\u00c4\3\2\2\29\u00c9\3\2\2\2;\u00ce"+
		"\3\2\2\2=\u00d3\3\2\2\2?\u00d8\3\2\2\2A\u00df\3\2\2\2C\u00e7\3\2\2\2E"+
		"\u00ec\3\2\2\2G\u00f1\3\2\2\2I\u00f6\3\2\2\2K\u00f9\3\2\2\2M\u00fd\3\2"+
		"\2\2O\u010a\3\2\2\2Q\u0112\3\2\2\2S\u0114\3\2\2\2U\u0116\3\2\2\2W\u0119"+
		"\3\2\2\2Y\u0123\3\2\2\2[\u0125\3\2\2\2]\u012a\3\2\2\2_\u0130\3\2\2\2a"+
		"\u013e\3\2\2\2cd\7*\2\2d\4\3\2\2\2ef\7+\2\2f\6\3\2\2\2gh\7(\2\2h\b\3\2"+
		"\2\2ij\7~\2\2j\n\3\2\2\2kl\7/\2\2l\f\3\2\2\2mn\7-\2\2n\16\3\2\2\2op\7"+
		",\2\2p\20\3\2\2\2qr\7\61\2\2r\22\3\2\2\2st\7k\2\2tu\7u\2\2uv\7N\2\2vw"+
		"\7k\2\2wx\7u\2\2xy\7v\2\2y\24\3\2\2\2z{\7f\2\2{|\7g\2\2|}\7h\2\2}~\7k"+
		"\2\2~\177\7p\2\2\177\u0080\7g\2\2\u0080\26\3\2\2\2\u0081\u0082\7n\2\2"+
		"\u0082\u0083\7g\2\2\u0083\u0084\7v\2\2\u0084\30\3\2\2\2\u0085\u0086\7"+
		"n\2\2\u0086\u0087\7g\2\2\u0087\u0088\7v\2\2\u0088\u0089\7t\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7e\2\2\u008b\32\3\2\2\2\u008c\u008d\7n\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7o\2\2\u008f\u0090\7d\2\2\u0090\u0091\7f\2\2\u0091"+
		"\u0092\7c\2\2\u0092\34\3\2\2\2\u0093\u0094\7k\2\2\u0094\u0095\7h\2\2\u0095"+
		"\36\3\2\2\2\u0096\u0097\7e\2\2\u0097\u0098\7c\2\2\u0098\u0099\7t\2\2\u0099"+
		" \3\2\2\2\u009a\u009b\7e\2\2\u009b\u009c\7f\2\2\u009c\u009d\7t\2\2\u009d"+
		"\"\3\2\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7p\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2$\3\2\2\2\u00a3\u00a4\7n\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7u\2\2\u00a6\u00a7\7v\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7p\2\2\u00a9"+
		"\u00aa\7w\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7n\2\2\u00ac\u00ad\7A\2\2"+
		"\u00ad(\3\2\2\2\u00ae\u00af\7>\2\2\u00af*\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1"+
		",\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3.\3\2\2\2\u00b4\u00b5\7%\2\2\u00b5\u00b6"+
		"\7v\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7%\2\2\u00b8\u00b9\7h\2\2\u00b9\62"+
		"\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7h\2\2\u00bd"+
		"\64\3\2\2\2\u00be\u00bf\7f\2\2\u00bf\u00c0\7g\2\2\u00c0\u00c1\7t\2\2\u00c1"+
		"\u00c2\7g\2\2\u00c2\u00c3\7h\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7u\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7#\2\2\u00c88\3\2\2\2\u00c9"+
		"\u00ca\7h\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7g\2\2"+
		"\u00cd:\3\2\2\2\u00ce\u00cf\7h\2\2\u00cf\u00d0\7q\2\2\u00d0\u00d1\7t\2"+
		"\2\u00d1\u00d2\7m\2\2\u00d2<\3\2\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7"+
		"q\2\2\u00d5\u00d6\7e\2\2\u00d6\u00d7\7m\2\2\u00d7>\3\2\2\2\u00d8\u00d9"+
		"\7w\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7n\2\2\u00db\u00dc\7q\2\2\u00dc"+
		"\u00dd\7e\2\2\u00dd\u00de\7m\2\2\u00de@\3\2\2\2\u00df\u00e0\7r\2\2\u00e0"+
		"\u00e1\7t\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7e\2\2\u00e3\u00e4\7g\2\2"+
		"\u00e4\u00e5\7u\2\2\u00e5\u00e6\7u\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7u\2"+
		"\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7f\2\2\u00ebD\3\2"+
		"\2\2\u00ec\u00ed\7u\2\2\u00ed\u00ee\7v\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0"+
		"\7r\2\2\u00f0F\3\2\2\2\u00f1\u00f2\7u\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4"+
		"\7n\2\2\u00f4\u00f5\7h\2\2\u00f5H\3\2\2\2\u00f6\u00f7\7\60\2\2\u00f7J"+
		"\3\2\2\2\u00f8\u00fa\5S*\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fcL\3\2\2\2\u00fd\u0101\5O(\2\u00fe"+
		"\u0100\5Q)\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102N\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u010b"+
		"\t\2\2\2\u0105\u0106\n\3\2\2\u0106\u010b\6(\2\2\u0107\u0108\t\4\2\2\u0108"+
		"\u0109\t\5\2\2\u0109\u010b\6(\3\2\u010a\u0104\3\2\2\2\u010a\u0105\3\2"+
		"\2\2\u010a\u0107\3\2\2\2\u010bP\3\2\2\2\u010c\u0113\t\6\2\2\u010d\u010e"+
		"\n\3\2\2\u010e\u0113\6)\4\2\u010f\u0110\t\4\2\2\u0110\u0111\t\5\2\2\u0111"+
		"\u0113\6)\5\2\u0112\u010c\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010f\3\2"+
		"\2\2\u0113R\3\2\2\2\u0114\u0115\4\62;\2\u0115T\3\2\2\2\u0116\u0117\7^"+
		"\2\2\u0117\u0118\7$\2\2\u0118V\3\2\2\2\u0119\u011e\7$\2\2\u011a\u011d"+
		"\5U+\2\u011b\u011d\n\7\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7$\2\2\u0122X\3\2\2\2\u0123\u0124"+
		"\7B\2\2\u0124Z\3\2\2\2\u0125\u0126\7\60\2\2\u0126\u0127\7\60\2\2\u0127"+
		"\u0128\7\60\2\2\u0128\\\3\2\2\2\u0129\u012b\t\b\2\2\u012a\u0129\3\2\2"+
		"\2\u012b\u012c\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\u012f\b/\2\2\u012f^\3\2\2\2\u0130\u0131\7\61\2\2\u0131"+
		"\u0132\7,\2\2\u0132\u0136\3\2\2\2\u0133\u0135\13\2\2\2\u0134\u0133\3\2"+
		"\2\2\u0135\u0138\3\2\2\2\u0136\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7,\2\2\u013a\u013b\7\61"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b\60\2\2\u013d`\3\2\2\2\u013e\u013f"+
		"\7\61\2\2\u013f\u0140\7\61\2\2\u0140\u0144\3\2\2\2\u0141\u0143\n\7\2\2"+
		"\u0142\u0141\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\b\61\2\2"+
		"\u0148b\3\2\2\2\f\2\u00fb\u0101\u010a\u0112\u011c\u011e\u012c\u0136\u0144"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}