// Generated from C:\Users\e160813x\monticoreProjects\FSM\target\generated-sources\monticore\sourcecode\fsm\_parser\FSMAntlrLexer.g4 by ANTLR 4.7.1

  package fsm._parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FSMAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FSM69920=1, LEXNAME3=2, LEXNAME0=3, FALSE97196323=4, LEXNAME1=5, MINUS=6, 
		POINT=7, STATES3402485250=8, LEXNAME4=9, LEXNAME2=10, NULL3392903=11, 
		TRUE3569038=12, COLON=13, LCURLY=14, SEMI=15, STATE109757585=16, RCURLY=17, 
		Digits=18, String=19, Name=20, Char=21, ML_COMMENT=22, SL_COMMENT=23, 
		WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"FSM69920", "LEXNAME3", "LEXNAME0", "FALSE97196323", "LEXNAME1", "MINUS", 
		"POINT", "STATES3402485250", "LEXNAME4", "LEXNAME2", "NULL3392903", "TRUE3569038", 
		"COLON", "LCURLY", "SEMI", "STATE109757585", "RCURLY", "Digit", "OctalDigit", 
		"StringCharacters", "SingleCharacter", "NEWLINE", "Digits", "EscapeSequence", 
		"String", "HexDigit", "StringCharacter", "Name", "Char", "ML_COMMENT", 
		"SL_COMMENT", "ZeroToThree", "OctalEscape", "UnicodeEscape", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'FSM'", "'input ='", "'initial state'", "'false'", "'final states'", 
		"'-'", "'.'", "'states'", "'output ='", "'Transition to'", "'null'", "'true'", 
		"':'", "'{'", "';'", "'state'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "FSM69920", "LEXNAME3", "LEXNAME0", "FALSE97196323", "LEXNAME1", 
		"MINUS", "POINT", "STATES3402485250", "LEXNAME4", "LEXNAME2", "NULL3392903", 
		"TRUE3569038", "COLON", "LCURLY", "SEMI", "STATE109757585", "RCURLY", 
		"Digits", "String", "Name", "Char", "ML_COMMENT", "SL_COMMENT", "WS"
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





	private FSMAntlrParser _monticore_parser;

	protected FSMAntlrParser getCompiler() {
	   return _monticore_parser;
	}

	public void setMCParser(FSMAntlrParser in) {
	  this._monticore_parser = in;
	}

	protected void storeComment(){
	  if (getCompiler() != null) {
	    de.monticore.ast.Comment _comment = new de.monticore.ast.Comment(getText());
	    de.se_rwth.commons.SourcePosition startPos = new de.se_rwth.commons.SourcePosition(_tokenStartLine, _tokenStartCharPositionInLine);
	    _comment.set_SourcePositionStart(startPos);
	    _comment.set_SourcePositionEnd(getCompiler().computeEndPosition(startPos, getText()));
	    getCompiler().addComment(_comment);
	  }
	}


	public FSMAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FSMAntlrLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 24:
			String_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			Char_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			ML_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			SL_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void String_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void Char_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			setText(getText().substring(1,getText().length() - 1));


			break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			storeComment();


			break;
		}
	}
	private void SL_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			storeComment();


			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u011e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\6\25\u00b6\n\25\r\25\16\25\u00b7\3\26\3\26\3\27\3\27\3\27\5\27\u00bf"+
		"\n\27\3\30\6\30\u00c2\n\30\r\30\16\30\u00c3\3\31\3\31\3\31\3\31\5\31\u00ca"+
		"\n\31\3\32\3\32\5\32\u00ce\n\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\5\34"+
		"\u00d7\n\34\3\35\3\35\7\35\u00db\n\35\f\35\16\35\u00de\13\35\3\36\3\36"+
		"\3\36\5\36\u00e3\n\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\7\37\u00ec\n"+
		"\37\f\37\16\37\u00ef\13\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3"+
		" \3 \7 \u00fc\n \f \16 \u00ff\13 \3 \3 \3 \3 \3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0112\n\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3\u00ed\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\2\'\2)\2+\2-\2/\24\61\2\63\25\65\2\67\2"+
		"9\26;\27=\30?\31A\2C\2E\2G\32\3\2\n\3\2))\4\2\f\f\17\17\n\2$$))^^ddhh"+
		"ppttvv\5\2\62;CHch\4\2$$^^\6\2&&C\\aac|\7\2&&\62;C\\aac|\5\2\13\f\17\17"+
		"\"\"\2\u011f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2"+
		"\2\2\2#\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5M\3\2\2\2\7U\3\2\2\2\tc\3\2\2\2\13"+
		"i\3\2\2\2\rv\3\2\2\2\17x\3\2\2\2\21z\3\2\2\2\23\u0081\3\2\2\2\25\u008a"+
		"\3\2\2\2\27\u0098\3\2\2\2\31\u009d\3\2\2\2\33\u00a2\3\2\2\2\35\u00a4\3"+
		"\2\2\2\37\u00a6\3\2\2\2!\u00a8\3\2\2\2#\u00ae\3\2\2\2%\u00b0\3\2\2\2\'"+
		"\u00b2\3\2\2\2)\u00b5\3\2\2\2+\u00b9\3\2\2\2-\u00be\3\2\2\2/\u00c1\3\2"+
		"\2\2\61\u00c9\3\2\2\2\63\u00cb\3\2\2\2\65\u00d2\3\2\2\2\67\u00d6\3\2\2"+
		"\29\u00d8\3\2\2\2;\u00df\3\2\2\2=\u00e7\3\2\2\2?\u00f7\3\2\2\2A\u0104"+
		"\3\2\2\2C\u0111\3\2\2\2E\u0113\3\2\2\2G\u011a\3\2\2\2IJ\7H\2\2JK\7U\2"+
		"\2KL\7O\2\2L\4\3\2\2\2MN\7k\2\2NO\7p\2\2OP\7r\2\2PQ\7w\2\2QR\7v\2\2RS"+
		"\7\"\2\2ST\7?\2\2T\6\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7k\2\2XY\7v\2\2YZ\7k"+
		"\2\2Z[\7c\2\2[\\\7n\2\2\\]\7\"\2\2]^\7u\2\2^_\7v\2\2_`\7c\2\2`a\7v\2\2"+
		"ab\7g\2\2b\b\3\2\2\2cd\7h\2\2de\7c\2\2ef\7n\2\2fg\7u\2\2gh\7g\2\2h\n\3"+
		"\2\2\2ij\7h\2\2jk\7k\2\2kl\7p\2\2lm\7c\2\2mn\7n\2\2no\7\"\2\2op\7u\2\2"+
		"pq\7v\2\2qr\7c\2\2rs\7v\2\2st\7g\2\2tu\7u\2\2u\f\3\2\2\2vw\7/\2\2w\16"+
		"\3\2\2\2xy\7\60\2\2y\20\3\2\2\2z{\7u\2\2{|\7v\2\2|}\7c\2\2}~\7v\2\2~\177"+
		"\7g\2\2\177\u0080\7u\2\2\u0080\22\3\2\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7w\2\2\u0083\u0084\7v\2\2\u0084\u0085\7r\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7v\2\2\u0087\u0088\7\"\2\2\u0088\u0089\7?\2\2\u0089\24\3\2\2\2"+
		"\u008a\u008b\7V\2\2\u008b\u008c\7t\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u008f\7u\2\2\u008f\u0090\7k\2\2\u0090\u0091\7v\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7q\2\2\u0093\u0094\7p\2\2\u0094\u0095\7\"\2"+
		"\2\u0095\u0096\7v\2\2\u0096\u0097\7q\2\2\u0097\26\3\2\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7w\2\2\u009a\u009b\7n\2\2\u009b\u009c\7n\2\2\u009c"+
		"\30\3\2\2\2\u009d\u009e\7v\2\2\u009e\u009f\7t\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\u00a1\7g\2\2\u00a1\32\3\2\2\2\u00a2\u00a3\7<\2\2\u00a3\34\3\2\2\2\u00a4"+
		"\u00a5\7}\2\2\u00a5\36\3\2\2\2\u00a6\u00a7\7=\2\2\u00a7 \3\2\2\2\u00a8"+
		"\u00a9\7u\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7v\2\2"+
		"\u00ac\u00ad\7g\2\2\u00ad\"\3\2\2\2\u00ae\u00af\7\177\2\2\u00af$\3\2\2"+
		"\2\u00b0\u00b1\4\62;\2\u00b1&\3\2\2\2\u00b2\u00b3\4\629\2\u00b3(\3\2\2"+
		"\2\u00b4\u00b6\5\67\34\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8*\3\2\2\2\u00b9\u00ba\n\2\2\2"+
		"\u00ba,\3\2\2\2\u00bb\u00bc\7\17\2\2\u00bc\u00bf\7\f\2\2\u00bd\u00bf\t"+
		"\3\2\2\u00be\u00bb\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf.\3\2\2\2\u00c0\u00c2"+
		"\5%\23\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\60\3\2\2\2\u00c5\u00c6\7^\2\2\u00c6\u00ca\t\4\2\2"+
		"\u00c7\u00ca\5C\"\2\u00c8\u00ca\5E#\2\u00c9\u00c5\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\62\3\2\2\2\u00cb\u00cd\7$\2\2\u00cc"+
		"\u00ce\5)\25\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\7$\2\2\u00d0\u00d1\b\32\2\2\u00d1\64\3\2\2\2\u00d2\u00d3"+
		"\t\5\2\2\u00d3\66\3\2\2\2\u00d4\u00d7\n\6\2\2\u00d5\u00d7\5\61\31\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d78\3\2\2\2\u00d8\u00dc\t\7\2\2"+
		"\u00d9\u00db\t\b\2\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd:\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\7)\2\2\u00e0\u00e3\5+\26\2\u00e1\u00e3\5\61\31\2\u00e2\u00e0\3"+
		"\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7)\2\2\u00e5"+
		"\u00e6\b\36\3\2\u00e6<\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7,\2\2"+
		"\u00e9\u00ed\3\2\2\2\u00ea\u00ec\13\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef"+
		"\u00ed\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f4\b\37\4\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\37\5\2\u00f6"+
		">\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fd\3\2\2"+
		"\2\u00fa\u00fc\n\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\b \6\2\u0101\u0102\3\2\2\2\u0102\u0103\b \5\2\u0103@\3\2\2\2\u0104"+
		"\u0105\4\62\65\2\u0105B\3\2\2\2\u0106\u0107\7^\2\2\u0107\u0112\5\'\24"+
		"\2\u0108\u0109\7^\2\2\u0109\u010a\5\'\24\2\u010a\u010b\5\'\24\2\u010b"+
		"\u0112\3\2\2\2\u010c\u010d\7^\2\2\u010d\u010e\5A!\2\u010e\u010f\5\'\24"+
		"\2\u010f\u0110\5\'\24\2\u0110\u0112\3\2\2\2\u0111\u0106\3\2\2\2\u0111"+
		"\u0108\3\2\2\2\u0111\u010c\3\2\2\2\u0112D\3\2\2\2\u0113\u0114\7^\2\2\u0114"+
		"\u0115\7w\2\2\u0115\u0116\5\65\33\2\u0116\u0117\5\65\33\2\u0117\u0118"+
		"\5\65\33\2\u0118\u0119\5\65\33\2\u0119F\3\2\2\2\u011a\u011b\t\t\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\b$\5\2\u011dH\3\2\2\2\16\2\u00b7\u00be\u00c3"+
		"\u00c9\u00cd\u00d6\u00dc\u00e2\u00ed\u00fd\u0111\7\3\32\2\3\36\3\3\37"+
		"\4\b\2\2\3 \5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}