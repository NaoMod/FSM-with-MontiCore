// Generated from C:\Users\e160813x\monticoreProjects\FSM\target\generated-sources\monticore\sourcecode\fsm\_parser\FSMAntlrParser.g4 by ANTLR 4.7.1

package fsm._parser;
import de.monticore.antlr4.*;
import de.monticore.parser.*;
import fsm.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FSMAntlrParser extends MCParser {
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
	public static final int
		RULE_nullLiteral = 0, RULE_booleanLiteral = 1, RULE_charLiteral = 2, RULE_stringLiteral = 3, 
		RULE_natLiteral = 4, RULE_signedNatLiteral = 5, RULE_basicLongLiteral = 6, 
		RULE_signedBasicLongLiteral = 7, RULE_basicFloatLiteral = 8, RULE_signedBasicFloatLiteral = 9, 
		RULE_basicDoubleLiteral = 10, RULE_signedBasicDoubleLiteral = 11, RULE_fSM = 12, 
		RULE_state = 13, RULE_transition = 14, RULE_literal = 15, RULE_signedLiteral = 16, 
		RULE_numericLiteral = 17, RULE_signedNumericLiteral = 18, RULE_mc_eof = 19, 
		RULE_nokeyword_f102 = 20, RULE_nokeyword_F70 = 21, RULE_nokeyword_l108 = 22, 
		RULE_nokeyword_L76 = 23;
	public static final String[] ruleNames = {
		"nullLiteral", "booleanLiteral", "charLiteral", "stringLiteral", "natLiteral", 
		"signedNatLiteral", "basicLongLiteral", "signedBasicLongLiteral", "basicFloatLiteral", 
		"signedBasicFloatLiteral", "basicDoubleLiteral", "signedBasicDoubleLiteral", 
		"fSM", "state", "transition", "literal", "signedLiteral", "numericLiteral", 
		"signedNumericLiteral", "mc_eof", "nokeyword_f102", "nokeyword_F70", "nokeyword_l108", 
		"nokeyword_L76"
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

	@Override
	public String getGrammarFileName() { return "FSMAntlrParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	  // convert function for Name
	private String convertName(Token t)  {
	    return t.getText();
	}

	  // convert function for NEWLINE
	private String convertNEWLINE(Token t)  {
	    return t.getText();
	}

	  // convert function for WS
	private String convertWS(Token t)  {
	    return t.getText();
	}

	  // convert function for SL_COMMENT
	private String convertSL_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for ML_COMMENT
	private String convertML_COMMENT(Token t)  {
	    return t.getText();
	}

	  // convert function for Digits
	private String convertDigits(Token t)  {
	    return t.getText();
	}

	  // convert function for Digit
	private String convertDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for Char
	private String convertChar(Token t)  {
	    return t.getText();
	}

	  // convert function for SingleCharacter
	private String convertSingleCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for String
	private String convertString(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacters
	private String convertStringCharacters(Token t)  {
	    return t.getText();
	}

	  // convert function for StringCharacter
	private String convertStringCharacter(Token t)  {
	    return t.getText();
	}

	  // convert function for EscapeSequence
	private String convertEscapeSequence(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalEscape
	private String convertOctalEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for UnicodeEscape
	private String convertUnicodeEscape(Token t)  {
	    return t.getText();
	}

	  // convert function for ZeroToThree
	private String convertZeroToThree(Token t)  {
	    return t.getText();
	}

	  // convert function for HexDigit
	private String convertHexDigit(Token t)  {
	    return t.getText();
	}

	  // convert function for OctalDigit
	private String convertOctalDigit(Token t)  {
	    return t.getText();
	}


	public FSMAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NullLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ret = null;
		public TerminalNode NULL3392903() { return getToken(FSMAntlrParser.NULL3392903, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_nullLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNullLiteralBuilder _builder = fsm.FSMMill.nullLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NULL3392903);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ret = null;
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_booleanLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteralBuilder _builder = fsm.FSMMill.booleanLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE3569038:
				{
				setState(50);
				match(TRUE3569038);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.TRUE);

				}
				break;
			case FALSE97196323:
				{
				setState(52);
				match(FALSE97196323);

				_builder.setSource(de.monticore.literals.mccommonliterals._ast.ASTConstantsMCCommonLiterals.FALSE);

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CharLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ret = null;
		public Token tmp0;
		public TerminalNode Char() { return getToken(FSMAntlrParser.Char, 0); }
		public CharLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charLiteral; }
	}

	public final CharLiteralContext charLiteral() throws RecognitionException {
		CharLiteralContext _localctx = new CharLiteralContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_charLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTCharLiteralBuilder _builder = fsm.FSMMill.charLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(56);
			((CharLiteralContext)_localctx).tmp0 = match(Char);
			_builder.setSource(convertChar(((CharLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ret = null;
		public Token tmp0;
		public TerminalNode String() { return getToken(FSMAntlrParser.String, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stringLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTStringLiteralBuilder _builder = fsm.FSMMill.stringLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(59);
			((StringLiteralContext)_localctx).tmp0 = match(String);
			_builder.setSource(convertString(((StringLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(FSMAntlrParser.Digits, 0); }
		public NatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natLiteral; }
	}

	public final NatLiteralContext natLiteral() throws RecognitionException {
		NatLiteralContext _localctx = new NatLiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_natLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTNatLiteralBuilder _builder = fsm.FSMMill.natLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			((NatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((NatLiteralContext)_localctx).tmp0));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedNatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode Digits() { return getToken(FSMAntlrParser.Digits, 0); }
		public TerminalNode MINUS() { return getToken(FSMAntlrParser.MINUS, 0); }
		public SignedNatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNatLiteral; }
	}

	public final SignedNatLiteralContext signedNatLiteral() throws RecognitionException {
		SignedNatLiteralContext _localctx = new SignedNatLiteralContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_signedNatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteralBuilder _builder = fsm.FSMMill.signedNatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				if (!(noSpace(2))) throw new FailedPredicateException(this, "noSpace(2)");
				{
				{
				setState(66);
				match(MINUS);

				_builder.setNegative(true);

				}
				}
				{
				setState(69);
				((SignedNatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp0));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(71);
				((SignedNatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedNatLiteralContext)_localctx).tmp1));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ret = null;
		public Token tmp0;
		public TerminalNode Digits() { return getToken(FSMAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public BasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLongLiteral; }
	}

	public final BasicLongLiteralContext basicLongLiteral() throws RecognitionException {
		BasicLongLiteralContext _localctx = new BasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_basicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteralBuilder _builder = fsm.FSMMill.basicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
			{
			setState(76);
			((BasicLongLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setDigits(convertDigits(((BasicLongLiteralContext)_localctx).tmp0));
			}
			{
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(79);
				nokeyword_l108();
				}
				break;
			case 2:
				{
				setState(80);
				nokeyword_L76();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedBasicLongLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode MINUS() { return getToken(FSMAntlrParser.MINUS, 0); }
		public TerminalNode Digits() { return getToken(FSMAntlrParser.Digits, 0); }
		public Nokeyword_l108Context nokeyword_l108() {
			return getRuleContext(Nokeyword_l108Context.class,0);
		}
		public Nokeyword_L76Context nokeyword_L76() {
			return getRuleContext(Nokeyword_L76Context.class,0);
		}
		public SignedBasicLongLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicLongLiteral; }
	}

	public final SignedBasicLongLiteralContext signedBasicLongLiteral() throws RecognitionException {
		SignedBasicLongLiteralContext _localctx = new SignedBasicLongLiteralContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signedBasicLongLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteralBuilder _builder = fsm.FSMMill.signedBasicLongLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				if (!(cmpToken(3,"l","L") && noSpace(2,3))) throw new FailedPredicateException(this, "cmpToken(3,\"l\",\"L\") && noSpace(2,3)");
				{
				setState(84);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(87);
				((SignedBasicLongLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp0));
				}
				{
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(90);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(91);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				if (!(cmpToken(2,"l","L") && noSpace(2))) throw new FailedPredicateException(this, "cmpToken(2,\"l\",\"L\") && noSpace(2)");
				{
				setState(95);
				((SignedBasicLongLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setDigits(convertDigits(((SignedBasicLongLiteralContext)_localctx).tmp1));
				}
				{
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(98);
					nokeyword_l108();
					}
					break;
				case 2:
					{
					setState(99);
					nokeyword_L76();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(FSMAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(FSMAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(FSMAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public BasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicFloatLiteral; }
	}

	public final BasicFloatLiteralContext basicFloatLiteral() throws RecognitionException {
		BasicFloatLiteralContext _localctx = new BasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_basicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteralBuilder _builder = fsm.FSMMill.basicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
			{
			setState(105);
			((BasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicFloatLiteralContext)_localctx).tmp0));
			}
			setState(108);
			match(POINT);
			{
			setState(109);
			((BasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicFloatLiteralContext)_localctx).tmp1));
			}
			{
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(112);
				nokeyword_f102();
				}
				break;
			case 2:
				{
				setState(113);
				nokeyword_F70();
				}
				break;
			}
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedBasicFloatLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(FSMAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(FSMAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(FSMAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(FSMAntlrParser.Digits, i);
		}
		public Nokeyword_f102Context nokeyword_f102() {
			return getRuleContext(Nokeyword_f102Context.class,0);
		}
		public Nokeyword_F70Context nokeyword_F70() {
			return getRuleContext(Nokeyword_F70Context.class,0);
		}
		public SignedBasicFloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicFloatLiteral; }
	}

	public final SignedBasicFloatLiteralContext signedBasicFloatLiteral() throws RecognitionException {
		SignedBasicFloatLiteralContext _localctx = new SignedBasicFloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_signedBasicFloatLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteralBuilder _builder = fsm.FSMMill.signedBasicFloatLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				if (!(cmpToken(5,"f","F") && noSpace(2,3,4,5))) throw new FailedPredicateException(this, "cmpToken(5,\"f\",\"F\") && noSpace(2,3,4,5)");
				{
				setState(117);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(120);
				((SignedBasicFloatLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp0));
				}
				setState(123);
				match(POINT);
				{
				setState(124);
				((SignedBasicFloatLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp1));
				}
				{
				setState(129);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(127);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(128);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				if (!(cmpToken(4,"f","F") && noSpace(2,3,4))) throw new FailedPredicateException(this, "cmpToken(4,\"f\",\"F\") && noSpace(2,3,4)");
				{
				setState(132);
				((SignedBasicFloatLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp2));
				}
				setState(135);
				match(POINT);
				{
				setState(136);
				((SignedBasicFloatLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicFloatLiteralContext)_localctx).tmp3));
				}
				{
				setState(141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(139);
					nokeyword_f102();
					}
					break;
				case 2:
					{
					setState(140);
					nokeyword_F70();
					}
					break;
				}
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public TerminalNode POINT() { return getToken(FSMAntlrParser.POINT, 0); }
		public List<TerminalNode> Digits() { return getTokens(FSMAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(FSMAntlrParser.Digits, i);
		}
		public BasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicDoubleLiteral; }
	}

	public final BasicDoubleLiteralContext basicDoubleLiteral() throws RecognitionException {
		BasicDoubleLiteralContext _localctx = new BasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_basicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteralBuilder _builder = fsm.FSMMill.basicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
			{
			setState(146);
			((BasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
			_builder.setPre(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp0));
			}
			setState(149);
			match(POINT);
			{
			setState(150);
			((BasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
			_builder.setPost(convertDigits(((BasicDoubleLiteralContext)_localctx).tmp1));
			}
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedBasicDoubleLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ret = null;
		public Token tmp0;
		public Token tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode POINT() { return getToken(FSMAntlrParser.POINT, 0); }
		public TerminalNode MINUS() { return getToken(FSMAntlrParser.MINUS, 0); }
		public List<TerminalNode> Digits() { return getTokens(FSMAntlrParser.Digits); }
		public TerminalNode Digits(int i) {
			return getToken(FSMAntlrParser.Digits, i);
		}
		public SignedBasicDoubleLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedBasicDoubleLiteral; }
	}

	public final SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() throws RecognitionException {
		SignedBasicDoubleLiteralContext _localctx = new SignedBasicDoubleLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_signedBasicDoubleLiteral);
		// getActionForAltBeforeRuleBody
		de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteralBuilder _builder = fsm.FSMMill.signedBasicDoubleLiteralBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				if (!(noSpace(2,3,4))) throw new FailedPredicateException(this, "noSpace(2,3,4)");
				{
				setState(154);
				match(MINUS);

				_builder.setNegative(true);

				}
				{
				setState(157);
				((SignedBasicDoubleLiteralContext)_localctx).tmp0 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp0));
				}
				setState(160);
				match(POINT);
				{
				setState(161);
				((SignedBasicDoubleLiteralContext)_localctx).tmp1 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp1));
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				if (!(noSpace(2,3))) throw new FailedPredicateException(this, "noSpace(2,3)");
				{
				setState(164);
				((SignedBasicDoubleLiteralContext)_localctx).tmp2 = match(Digits);
				_builder.setPre(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp2));
				}
				setState(167);
				match(POINT);
				{
				setState(168);
				((SignedBasicDoubleLiteralContext)_localctx).tmp3 = match(Digits);
				_builder.setPost(convertDigits(((SignedBasicDoubleLiteralContext)_localctx).tmp3));
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FSMContext extends ParserRuleContext {
		public fsm._ast.ASTFSM ret = null;
		public Token tmp0;
		public StateContext tmp1;
		public Token tmp2;
		public Token tmp3;
		public TerminalNode FSM69920() { return getToken(FSMAntlrParser.FSM69920, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(FSMAntlrParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(FSMAntlrParser.LCURLY, i);
		}
		public TerminalNode STATES3402485250() { return getToken(FSMAntlrParser.STATES3402485250, 0); }
		public List<TerminalNode> RCURLY() { return getTokens(FSMAntlrParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(FSMAntlrParser.RCURLY, i);
		}
		public TerminalNode LEXNAME0() { return getToken(FSMAntlrParser.LEXNAME0, 0); }
		public List<TerminalNode> SEMI() { return getTokens(FSMAntlrParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(FSMAntlrParser.SEMI, i);
		}
		public TerminalNode LEXNAME1() { return getToken(FSMAntlrParser.LEXNAME1, 0); }
		public List<TerminalNode> Name() { return getTokens(FSMAntlrParser.Name); }
		public TerminalNode Name(int i) {
			return getToken(FSMAntlrParser.Name, i);
		}
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public FSMContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fSM; }
	}

	public final FSMContext fSM() throws RecognitionException {
		FSMContext _localctx = new FSMContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fSM);
		// getActionForAltBeforeRuleBody
		fsm._ast.ASTFSMBuilder _builder = fsm.FSMMill.fSMBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(FSM69920);
			{
			setState(173);
			((FSMContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((FSMContext)_localctx).tmp0));
			}
			setState(176);
			match(LCURLY);
			setState(177);
			match(STATES3402485250);
			setState(178);
			match(LCURLY);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATE109757585) {
				{
				{
				setState(179);
				((FSMContext)_localctx).tmp1 = state();
				addToIteratedAttributeIfNotNull(_builder.getStateList(), _localctx.tmp1.ret);
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
			match(RCURLY);
			setState(188);
			match(LEXNAME0);
			setState(189);
			match(LCURLY);
			{
			setState(190);
			((FSMContext)_localctx).tmp2 = match(Name);
			_builder.setInitialState(convertName(((FSMContext)_localctx).tmp2));
			}
			setState(193);
			match(SEMI);
			setState(194);
			match(RCURLY);
			setState(195);
			match(LEXNAME1);
			setState(196);
			match(LCURLY);
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(197);
				((FSMContext)_localctx).tmp3 = match(Name);
				 addToIteratedAttributeIfNotNull(_builder.getFinalStatesList(), convertName(((FSMContext)_localctx).tmp3));
				}
				setState(200);
				match(SEMI);
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
			setState(205);
			match(RCURLY);
			setState(206);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public fsm._ast.ASTState ret = null;
		public Token tmp0;
		public TransitionContext tmp1;
		public TerminalNode STATE109757585() { return getToken(FSMAntlrParser.STATE109757585, 0); }
		public TerminalNode LCURLY() { return getToken(FSMAntlrParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(FSMAntlrParser.RCURLY, 0); }
		public TerminalNode Name() { return getToken(FSMAntlrParser.Name, 0); }
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_state);
		// getActionForAltBeforeRuleBody
		fsm._ast.ASTStateBuilder _builder = fsm.FSMMill.stateBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(STATE109757585);
			{
			setState(209);
			((StateContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((StateContext)_localctx).tmp0));
			}
			setState(212);
			match(LCURLY);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LEXNAME2) {
				{
				{
				setState(213);
				((StateContext)_localctx).tmp1 = transition();
				addToIteratedAttributeIfNotNull(_builder.getTransitionList(), _localctx.tmp1.ret);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(RCURLY);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransitionContext extends ParserRuleContext {
		public fsm._ast.ASTTransition ret = null;
		public Token tmp0;
		public StringLiteralContext tmp1;
		public StringLiteralContext tmp2;
		public TerminalNode LEXNAME2() { return getToken(FSMAntlrParser.LEXNAME2, 0); }
		public TerminalNode COLON() { return getToken(FSMAntlrParser.COLON, 0); }
		public TerminalNode LEXNAME3() { return getToken(FSMAntlrParser.LEXNAME3, 0); }
		public TerminalNode LEXNAME4() { return getToken(FSMAntlrParser.LEXNAME4, 0); }
		public TerminalNode SEMI() { return getToken(FSMAntlrParser.SEMI, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public TerminalNode Name() { return getToken(FSMAntlrParser.Name, 0); }
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_transition);
		// getActionForAltBeforeRuleBody
		fsm._ast.ASTTransitionBuilder _builder = fsm.FSMMill.transitionBuilder();
		_builder.set_SourcePositionStart( computeStartPosition(_input.LT(1)));
		setActiveBuilder(_builder);

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(LEXNAME2);
			{
			setState(224);
			((TransitionContext)_localctx).tmp0 = match(Name);
			_builder.setName(convertName(((TransitionContext)_localctx).tmp0));
			}
			setState(227);
			match(COLON);
			setState(228);
			match(LEXNAME3);
			setState(229);
			((TransitionContext)_localctx).tmp1 = stringLiteral();
			_builder.setInput(_localctx.tmp1.ret);
			setState(231);
			match(LEXNAME4);
			setState(232);
			((TransitionContext)_localctx).tmp2 = stringLiteral();
			_builder.setOutput(_localctx.tmp2.ret);
			setState(234);
			match(SEMI);
			}
			_ctx.stop = _input.LT(-1);
			_builder.set_SourcePositionEnd(computeEndPosition(_input.LT(-1)));
			_localctx.ret = _builder.uncheckedBuild();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ret;
		public NumericLiteralContext tmp3;
		public NullLiteralContext tmp4;
		public BooleanLiteralContext tmp5;
		public CharLiteralContext tmp6;
		public StringLiteralContext tmp7;
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literal);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				((LiteralContext)_localctx).tmp3 = numericLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp3.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				((LiteralContext)_localctx).tmp4 = nullLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp4.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				((LiteralContext)_localctx).tmp5 = booleanLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				((LiteralContext)_localctx).tmp6 = charLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248);
				((LiteralContext)_localctx).tmp7 = stringLiteral();
				((LiteralContext)_localctx).ret = ((LiteralContext)_localctx).tmp7.ret;
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

	public static class SignedLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ret;
		public SignedNumericLiteralContext tmp8;
		public NullLiteralContext tmp4;
		public BooleanLiteralContext tmp5;
		public CharLiteralContext tmp6;
		public StringLiteralContext tmp7;
		public SignedNumericLiteralContext signedNumericLiteral() {
			return getRuleContext(SignedNumericLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public CharLiteralContext charLiteral() {
			return getRuleContext(CharLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SignedLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedLiteral; }
	}

	public final SignedLiteralContext signedLiteral() throws RecognitionException {
		SignedLiteralContext _localctx = new SignedLiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_signedLiteral);
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				((SignedLiteralContext)_localctx).tmp8 = signedNumericLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp8.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((SignedLiteralContext)_localctx).tmp4 = nullLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp4.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				((SignedLiteralContext)_localctx).tmp5 = booleanLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp5.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				((SignedLiteralContext)_localctx).tmp6 = charLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp6.ret;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(265);
				((SignedLiteralContext)_localctx).tmp7 = stringLiteral();
				((SignedLiteralContext)_localctx).ret = ((SignedLiteralContext)_localctx).tmp7.ret;
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ret;
		public NatLiteralContext tmp9;
		public BasicLongLiteralContext tmp10;
		public BasicFloatLiteralContext tmp11;
		public BasicDoubleLiteralContext tmp12;
		public NatLiteralContext natLiteral() {
			return getRuleContext(NatLiteralContext.class,0);
		}
		public BasicLongLiteralContext basicLongLiteral() {
			return getRuleContext(BasicLongLiteralContext.class,0);
		}
		public BasicFloatLiteralContext basicFloatLiteral() {
			return getRuleContext(BasicFloatLiteralContext.class,0);
		}
		public BasicDoubleLiteralContext basicDoubleLiteral() {
			return getRuleContext(BasicDoubleLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numericLiteral);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				((NumericLiteralContext)_localctx).tmp9 = natLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp9.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((NumericLiteralContext)_localctx).tmp10 = basicLongLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp10.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				((NumericLiteralContext)_localctx).tmp11 = basicFloatLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp11.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				((NumericLiteralContext)_localctx).tmp12 = basicDoubleLiteral();
				((NumericLiteralContext)_localctx).ret = ((NumericLiteralContext)_localctx).tmp12.ret;
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

	public static class SignedNumericLiteralContext extends ParserRuleContext {
		public de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ret;
		public SignedNatLiteralContext tmp13;
		public SignedBasicLongLiteralContext tmp14;
		public SignedBasicFloatLiteralContext tmp15;
		public SignedBasicDoubleLiteralContext tmp16;
		public SignedNatLiteralContext signedNatLiteral() {
			return getRuleContext(SignedNatLiteralContext.class,0);
		}
		public SignedBasicLongLiteralContext signedBasicLongLiteral() {
			return getRuleContext(SignedBasicLongLiteralContext.class,0);
		}
		public SignedBasicFloatLiteralContext signedBasicFloatLiteral() {
			return getRuleContext(SignedBasicFloatLiteralContext.class,0);
		}
		public SignedBasicDoubleLiteralContext signedBasicDoubleLiteral() {
			return getRuleContext(SignedBasicDoubleLiteralContext.class,0);
		}
		public SignedNumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumericLiteral; }
	}

	public final SignedNumericLiteralContext signedNumericLiteral() throws RecognitionException {
		SignedNumericLiteralContext _localctx = new SignedNumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_signedNumericLiteral);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((SignedNumericLiteralContext)_localctx).tmp13 = signedNatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp13.ret;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				((SignedNumericLiteralContext)_localctx).tmp14 = signedBasicLongLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp14.ret;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				((SignedNumericLiteralContext)_localctx).tmp15 = signedBasicFloatLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp15.ret;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				((SignedNumericLiteralContext)_localctx).tmp16 = signedBasicDoubleLiteral();
				((SignedNumericLiteralContext)_localctx).ret = ((SignedNumericLiteralContext)_localctx).tmp16.ret;
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

	public static class Mc_eofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FSMAntlrParser.EOF, 0); }
		public Mc_eofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mc_eof; }
	}

	public final Mc_eofContext mc_eof() throws RecognitionException {
		Mc_eofContext _localctx = new Mc_eofContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_mc_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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

	public static class Nokeyword_f102Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(FSMAntlrParser.Name, 0); }
		public Nokeyword_f102Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_f102; }
	}

	public final Nokeyword_f102Context nokeyword_f102() throws RecognitionException {
		Nokeyword_f102Context _localctx = new Nokeyword_f102Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_nokeyword_f102);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			if (!(next("f"))) throw new FailedPredicateException(this, "next(\"f\")");
			setState(301);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nokeyword_F70Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(FSMAntlrParser.Name, 0); }
		public Nokeyword_F70Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_F70; }
	}

	public final Nokeyword_F70Context nokeyword_F70() throws RecognitionException {
		Nokeyword_F70Context _localctx = new Nokeyword_F70Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_nokeyword_F70);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			if (!(next("F"))) throw new FailedPredicateException(this, "next(\"F\")");
			setState(304);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nokeyword_l108Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(FSMAntlrParser.Name, 0); }
		public Nokeyword_l108Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_l108; }
	}

	public final Nokeyword_l108Context nokeyword_l108() throws RecognitionException {
		Nokeyword_l108Context _localctx = new Nokeyword_l108Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_nokeyword_l108);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			if (!(next("l"))) throw new FailedPredicateException(this, "next(\"l\")");
			setState(307);
			match(Name);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nokeyword_L76Context extends ParserRuleContext {
		public TerminalNode Name() { return getToken(FSMAntlrParser.Name, 0); }
		public Nokeyword_L76Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nokeyword_L76; }
	}

	public final Nokeyword_L76Context nokeyword_L76() throws RecognitionException {
		Nokeyword_L76Context _localctx = new Nokeyword_L76Context(_ctx, getState());
		enterRule(_localctx, 46, RULE_nokeyword_L76);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			if (!(next("L"))) throw new FailedPredicateException(this, "next(\"L\")");
			setState(310);
			match(Name);
			}
		}
		catch (RecognitionException re) {
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
		case 5:
			return signedNatLiteral_sempred((SignedNatLiteralContext)_localctx, predIndex);
		case 6:
			return basicLongLiteral_sempred((BasicLongLiteralContext)_localctx, predIndex);
		case 7:
			return signedBasicLongLiteral_sempred((SignedBasicLongLiteralContext)_localctx, predIndex);
		case 8:
			return basicFloatLiteral_sempred((BasicFloatLiteralContext)_localctx, predIndex);
		case 9:
			return signedBasicFloatLiteral_sempred((SignedBasicFloatLiteralContext)_localctx, predIndex);
		case 10:
			return basicDoubleLiteral_sempred((BasicDoubleLiteralContext)_localctx, predIndex);
		case 11:
			return signedBasicDoubleLiteral_sempred((SignedBasicDoubleLiteralContext)_localctx, predIndex);
		case 20:
			return nokeyword_f102_sempred((Nokeyword_f102Context)_localctx, predIndex);
		case 21:
			return nokeyword_F70_sempred((Nokeyword_F70Context)_localctx, predIndex);
		case 22:
			return nokeyword_l108_sempred((Nokeyword_l108Context)_localctx, predIndex);
		case 23:
			return nokeyword_L76_sempred((Nokeyword_L76Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean signedNatLiteral_sempred(SignedNatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return noSpace(2);
		}
		return true;
	}
	private boolean basicLongLiteral_sempred(BasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean signedBasicLongLiteral_sempred(SignedBasicLongLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return cmpToken(3,"l","L") && noSpace(2,3);
		case 3:
			return cmpToken(2,"l","L") && noSpace(2);
		}
		return true;
	}
	private boolean basicFloatLiteral_sempred(BasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean signedBasicFloatLiteral_sempred(SignedBasicFloatLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return cmpToken(5,"f","F") && noSpace(2,3,4,5);
		case 6:
			return cmpToken(4,"f","F") && noSpace(2,3,4);
		}
		return true;
	}
	private boolean basicDoubleLiteral_sempred(BasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean signedBasicDoubleLiteral_sempred(SignedBasicDoubleLiteralContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return noSpace(2,3,4);
		case 9:
			return noSpace(2,3);
		}
		return true;
	}
	private boolean nokeyword_f102_sempred(Nokeyword_f102Context _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return next("f");
		}
		return true;
	}
	private boolean nokeyword_F70_sempred(Nokeyword_F70Context _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return next("F");
		}
		return true;
	}
	private boolean nokeyword_l108_sempred(Nokeyword_l108Context _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return next("l");
		}
		return true;
	}
	private boolean nokeyword_L76_sempred(Nokeyword_L76Context _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return next("L");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u013b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b"+
		"T\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\tg\n\t\5\ti\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nu\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0084\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0090\n\13\5\13\u0092\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ad\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00b9\n\16\f"+
		"\16\16\16\u00bc\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u00cc\n\16\r\16\16\16\u00cd\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16\17\u00de"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u00fe\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u010f\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u011d\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u012b\n\24\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\2\2"+
		"\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\2\2\u013e\2\62"+
		"\3\2\2\2\48\3\2\2\2\6:\3\2\2\2\b=\3\2\2\2\n@\3\2\2\2\fK\3\2\2\2\16M\3"+
		"\2\2\2\20h\3\2\2\2\22j\3\2\2\2\24\u0091\3\2\2\2\26\u0093\3\2\2\2\30\u00ac"+
		"\3\2\2\2\32\u00ae\3\2\2\2\34\u00d2\3\2\2\2\36\u00e1\3\2\2\2 \u00fd\3\2"+
		"\2\2\"\u010e\3\2\2\2$\u011c\3\2\2\2&\u012a\3\2\2\2(\u012c\3\2\2\2*\u012e"+
		"\3\2\2\2,\u0131\3\2\2\2.\u0134\3\2\2\2\60\u0137\3\2\2\2\62\63\7\r\2\2"+
		"\63\3\3\2\2\2\64\65\7\16\2\2\659\b\3\1\2\66\67\7\6\2\2\679\b\3\1\28\64"+
		"\3\2\2\28\66\3\2\2\29\5\3\2\2\2:;\7\27\2\2;<\b\4\1\2<\7\3\2\2\2=>\7\25"+
		"\2\2>?\b\5\1\2?\t\3\2\2\2@A\7\24\2\2AB\b\6\1\2B\13\3\2\2\2CD\6\7\2\2D"+
		"E\7\b\2\2EF\b\7\1\2FG\3\2\2\2GH\7\24\2\2HL\b\7\1\2IJ\7\24\2\2JL\b\7\1"+
		"\2KC\3\2\2\2KI\3\2\2\2L\r\3\2\2\2MN\6\b\3\2NO\7\24\2\2OP\b\b\1\2PS\3\2"+
		"\2\2QT\5.\30\2RT\5\60\31\2SQ\3\2\2\2SR\3\2\2\2T\17\3\2\2\2UV\6\t\4\2V"+
		"W\7\b\2\2WX\b\t\1\2XY\3\2\2\2YZ\7\24\2\2Z[\b\t\1\2[^\3\2\2\2\\_\5.\30"+
		"\2]_\5\60\31\2^\\\3\2\2\2^]\3\2\2\2_i\3\2\2\2`a\6\t\5\2ab\7\24\2\2bc\b"+
		"\t\1\2cf\3\2\2\2dg\5.\30\2eg\5\60\31\2fd\3\2\2\2fe\3\2\2\2gi\3\2\2\2h"+
		"U\3\2\2\2h`\3\2\2\2i\21\3\2\2\2jk\6\n\6\2kl\7\24\2\2lm\b\n\1\2mn\3\2\2"+
		"\2no\7\t\2\2op\7\24\2\2pq\b\n\1\2qt\3\2\2\2ru\5*\26\2su\5,\27\2tr\3\2"+
		"\2\2ts\3\2\2\2u\23\3\2\2\2vw\6\13\7\2wx\7\b\2\2xy\b\13\1\2yz\3\2\2\2z"+
		"{\7\24\2\2{|\b\13\1\2|}\3\2\2\2}~\7\t\2\2~\177\7\24\2\2\177\u0080\b\13"+
		"\1\2\u0080\u0083\3\2\2\2\u0081\u0084\5*\26\2\u0082\u0084\5,\27\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0092\3\2\2\2\u0085\u0086\6\13"+
		"\b\2\u0086\u0087\7\24\2\2\u0087\u0088\b\13\1\2\u0088\u0089\3\2\2\2\u0089"+
		"\u008a\7\t\2\2\u008a\u008b\7\24\2\2\u008b\u008c\b\13\1\2\u008c\u008f\3"+
		"\2\2\2\u008d\u0090\5*\26\2\u008e\u0090\5,\27\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0092\3\2\2\2\u0091v\3\2\2\2\u0091\u0085\3\2\2\2"+
		"\u0092\25\3\2\2\2\u0093\u0094\6\f\t\2\u0094\u0095\7\24\2\2\u0095\u0096"+
		"\b\f\1\2\u0096\u0097\3\2\2\2\u0097\u0098\7\t\2\2\u0098\u0099\7\24\2\2"+
		"\u0099\u009a\b\f\1\2\u009a\27\3\2\2\2\u009b\u009c\6\r\n\2\u009c\u009d"+
		"\7\b\2\2\u009d\u009e\b\r\1\2\u009e\u009f\3\2\2\2\u009f\u00a0\7\24\2\2"+
		"\u00a0\u00a1\b\r\1\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4"+
		"\7\24\2\2\u00a4\u00ad\b\r\1\2\u00a5\u00a6\6\r\13\2\u00a6\u00a7\7\24\2"+
		"\2\u00a7\u00a8\b\r\1\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\7\t\2\2\u00aa\u00ab"+
		"\7\24\2\2\u00ab\u00ad\b\r\1\2\u00ac\u009b\3\2\2\2\u00ac\u00a5\3\2\2\2"+
		"\u00ad\31\3\2\2\2\u00ae\u00af\7\3\2\2\u00af\u00b0\7\26\2\2\u00b0\u00b1"+
		"\b\16\1\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\7\20\2\2\u00b3\u00b4\7\n\2\2"+
		"\u00b4\u00ba\7\20\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00b7\b\16\1\2\u00b7"+
		"\u00b9\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7\23\2\2\u00be\u00bf\7\5\2\2\u00bf\u00c0\7\20\2\2\u00c0\u00c1\7"+
		"\26\2\2\u00c1\u00c2\b\16\1\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\7\21\2\2"+
		"\u00c4\u00c5\7\23\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00cb\7\20\2\2\u00c7\u00c8"+
		"\7\26\2\2\u00c8\u00c9\b\16\1\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\7\21\2"+
		"\2\u00cb\u00c7\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7\23\2\2\u00d0\u00d1\7\23\2\2"+
		"\u00d1\33\3\2\2\2\u00d2\u00d3\7\22\2\2\u00d3\u00d4\7\26\2\2\u00d4\u00d5"+
		"\b\17\1\2\u00d5\u00d6\3\2\2\2\u00d6\u00dc\7\20\2\2\u00d7\u00d8\5\36\20"+
		"\2\u00d8\u00d9\b\17\1\2\u00d9\u00db\3\2\2\2\u00da\u00d7\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\23\2\2\u00e0\35\3\2\2\2\u00e1\u00e2"+
		"\7\f\2\2\u00e2\u00e3\7\26\2\2\u00e3\u00e4\b\20\1\2\u00e4\u00e5\3\2\2\2"+
		"\u00e5\u00e6\7\17\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\5\b\5\2\u00e8\u00e9"+
		"\b\20\1\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb\5\b\5\2\u00eb\u00ec\b\20\1"+
		"\2\u00ec\u00ed\7\21\2\2\u00ed\37\3\2\2\2\u00ee\u00ef\5$\23\2\u00ef\u00f0"+
		"\b\21\1\2\u00f0\u00fe\3\2\2\2\u00f1\u00f2\5\2\2\2\u00f2\u00f3\b\21\1\2"+
		"\u00f3\u00fe\3\2\2\2\u00f4\u00f5\5\4\3\2\u00f5\u00f6\b\21\1\2\u00f6\u00fe"+
		"\3\2\2\2\u00f7\u00f8\5\6\4\2\u00f8\u00f9\b\21\1\2\u00f9\u00fe\3\2\2\2"+
		"\u00fa\u00fb\5\b\5\2\u00fb\u00fc\b\21\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00ee"+
		"\3\2\2\2\u00fd\u00f1\3\2\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00f7\3\2\2\2\u00fd"+
		"\u00fa\3\2\2\2\u00fe!\3\2\2\2\u00ff\u0100\5&\24\2\u0100\u0101\b\22\1\2"+
		"\u0101\u010f\3\2\2\2\u0102\u0103\5\2\2\2\u0103\u0104\b\22\1\2\u0104\u010f"+
		"\3\2\2\2\u0105\u0106\5\4\3\2\u0106\u0107\b\22\1\2\u0107\u010f\3\2\2\2"+
		"\u0108\u0109\5\6\4\2\u0109\u010a\b\22\1\2\u010a\u010f\3\2\2\2\u010b\u010c"+
		"\5\b\5\2\u010c\u010d\b\22\1\2\u010d\u010f\3\2\2\2\u010e\u00ff\3\2\2\2"+
		"\u010e\u0102\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0108\3\2\2\2\u010e\u010b"+
		"\3\2\2\2\u010f#\3\2\2\2\u0110\u0111\5\n\6\2\u0111\u0112\b\23\1\2\u0112"+
		"\u011d\3\2\2\2\u0113\u0114\5\16\b\2\u0114\u0115\b\23\1\2\u0115\u011d\3"+
		"\2\2\2\u0116\u0117\5\22\n\2\u0117\u0118\b\23\1\2\u0118\u011d\3\2\2\2\u0119"+
		"\u011a\5\26\f\2\u011a\u011b\b\23\1\2\u011b\u011d\3\2\2\2\u011c\u0110\3"+
		"\2\2\2\u011c\u0113\3\2\2\2\u011c\u0116\3\2\2\2\u011c\u0119\3\2\2\2\u011d"+
		"%\3\2\2\2\u011e\u011f\5\f\7\2\u011f\u0120\b\24\1\2\u0120\u012b\3\2\2\2"+
		"\u0121\u0122\5\20\t\2\u0122\u0123\b\24\1\2\u0123\u012b\3\2\2\2\u0124\u0125"+
		"\5\24\13\2\u0125\u0126\b\24\1\2\u0126\u012b\3\2\2\2\u0127\u0128\5\30\r"+
		"\2\u0128\u0129\b\24\1\2\u0129\u012b\3\2\2\2\u012a\u011e\3\2\2\2\u012a"+
		"\u0121\3\2\2\2\u012a\u0124\3\2\2\2\u012a\u0127\3\2\2\2\u012b\'\3\2\2\2"+
		"\u012c\u012d\7\2\2\3\u012d)\3\2\2\2\u012e\u012f\6\26\f\2\u012f\u0130\7"+
		"\26\2\2\u0130+\3\2\2\2\u0131\u0132\6\27\r\2\u0132\u0133\7\26\2\2\u0133"+
		"-\3\2\2\2\u0134\u0135\6\30\16\2\u0135\u0136\7\26\2\2\u0136/\3\2\2\2\u0137"+
		"\u0138\6\31\17\2\u0138\u0139\7\26\2\2\u0139\61\3\2\2\2\248KS^fht\u0083"+
		"\u008f\u0091\u00ac\u00ba\u00cd\u00dc\u00fd\u010e\u011c\u012a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}