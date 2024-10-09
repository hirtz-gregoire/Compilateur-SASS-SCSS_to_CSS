// Generated from /home/greg/IUT/Compilation/Compilateur-SASS-SCSS_to_CSS/src/ScssParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ScssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Comment=1, MultiLineComment=2, LineComment=3, Space=4, Uri=5, Format=6, 
		AbsLength=7, FontRelative=8, ViewportRelative=9, Angle=10, Resolution=11, 
		Freq=12, Time=13, Percentage=14, Import=15, Include=16, Use=17, Require=18, 
		Charset=19, Mixin=20, Function=21, FontFace=22, Forward=23, Content=24, 
		Keyframes=25, Return=26, Media=27, Extend=28, Warn=29, Error=30, If=31, 
		AtIf=32, AtFor=33, AtElse=34, AtWhile=35, AtEach=36, From=37, To=38, Through=39, 
		Only=40, Not=41, And=42, Using=43, As=44, With=45, Or=46, In=47, Default=48, 
		Important=49, Lparen=50, Rparen=51, Lbrack=52, Rbrack=53, BlockStart=54, 
		BlockEnd=55, Dot=56, Comma=57, Colon=58, Semi=59, Tilde=60, Under=61, 
		Dollar=62, At=63, Amp=64, Hash=65, True=66, False=67, Plus=68, Div=69, 
		Minus=70, Times=71, Eq=72, NotEq=73, Greater=74, Less=75, Includes=76, 
		DashMatch=77, Pipe=78, Cdo=79, Cdc=80, PseudoNot=81, Calc=82, Rotate=83, 
		Var=84, Rgba=85, Repeat=86, PrefixMatch=87, SuffixMatch=88, SubstringMatch=89, 
		VendorPrefix=90, Variable=91, Number=92, String_=93, Ident=94;
	public static final int
		RULE_stylesheet = 0, RULE_statement = 1, RULE_importDeclaration = 2, RULE_importPath = 3, 
		RULE_asClause = 4, RULE_withClause = 5, RULE_variableDeclaration = 6, 
		RULE_variableValue = 7, RULE_variableName = 8, RULE_namespace_ = 9, RULE_propertyDeclaration = 10, 
		RULE_prio = 11, RULE_propertyValue = 12, RULE_mediaDeclaration = 13, RULE_mediaQueryList = 14, 
		RULE_mediaQuery = 15, RULE_mediaExpression = 16, RULE_mixinDeclaration = 17, 
		RULE_contentDeclaration = 18, RULE_fontFaceDeclaration = 19, RULE_keyframesDeclaration = 20, 
		RULE_keyframesBlock = 21, RULE_percentageStatement = 22, RULE_includeDeclaration = 23, 
		RULE_interpolationDeclaration = 24, RULE_extendDeclaration = 25, RULE_warndingDeclaration = 26, 
		RULE_errorDeclaration = 27, RULE_atStatementDeclaration = 28, RULE_ruleset = 29, 
		RULE_block = 30, RULE_selectorGroup = 31, RULE_selector = 32, RULE_combinator = 33, 
		RULE_selectorSequence = 34, RULE_id = 35, RULE_typeSelector = 36, RULE_typeNamespacePrefix = 37, 
		RULE_universal = 38, RULE_className = 39, RULE_interpolation = 40, RULE_parentRef = 41, 
		RULE_attrib = 42, RULE_pseudo = 43, RULE_functionalPseudo = 44, RULE_pseudoParameter = 45, 
		RULE_negation = 46, RULE_negationArg = 47, RULE_operator_ = 48, RULE_value = 49, 
		RULE_functionDeclaration = 50, RULE_parameters = 51, RULE_parameter = 52, 
		RULE_functionBody = 53, RULE_functionReturn = 54, RULE_functionStatement = 55, 
		RULE_functionCall = 56, RULE_expression = 57, RULE_expressionPart = 58, 
		RULE_ifExpression = 59, RULE_listDeclaration = 60, RULE_listCommaSeparated = 61, 
		RULE_listSpaceSeparated = 62, RULE_listBracketed = 63, RULE_listElement = 64, 
		RULE_mapDeclaration = 65, RULE_mapEntries = 66, RULE_mapEntry = 67, RULE_mapKey = 68, 
		RULE_mapValue = 69, RULE_ifDeclaration = 70, RULE_elseIfStatement = 71, 
		RULE_elseStatement = 72, RULE_forDeclaration = 73, RULE_through = 74, 
		RULE_whileDeclaration = 75, RULE_eachDeclaration = 76, RULE_eachValueList = 77, 
		RULE_var_ = 78, RULE_calc = 79, RULE_rotate = 80, RULE_rgba = 81, RULE_repeat = 82, 
		RULE_unit = 83, RULE_length = 84, RULE_dimension = 85, RULE_percentage = 86, 
		RULE_degree = 87, RULE_measurment = 88, RULE_uri = 89, RULE_arglist = 90, 
		RULE_plusMinus = 91, RULE_hexcolor = 92, RULE_color = 93, RULE_boolean = 94, 
		RULE_number = 95, RULE_identifier = 96;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "statement", "importDeclaration", "importPath", "asClause", 
			"withClause", "variableDeclaration", "variableValue", "variableName", 
			"namespace_", "propertyDeclaration", "prio", "propertyValue", "mediaDeclaration", 
			"mediaQueryList", "mediaQuery", "mediaExpression", "mixinDeclaration", 
			"contentDeclaration", "fontFaceDeclaration", "keyframesDeclaration", 
			"keyframesBlock", "percentageStatement", "includeDeclaration", "interpolationDeclaration", 
			"extendDeclaration", "warndingDeclaration", "errorDeclaration", "atStatementDeclaration", 
			"ruleset", "block", "selectorGroup", "selector", "combinator", "selectorSequence", 
			"id", "typeSelector", "typeNamespacePrefix", "universal", "className", 
			"interpolation", "parentRef", "attrib", "pseudo", "functionalPseudo", 
			"pseudoParameter", "negation", "negationArg", "operator_", "value", "functionDeclaration", 
			"parameters", "parameter", "functionBody", "functionReturn", "functionStatement", 
			"functionCall", "expression", "expressionPart", "ifExpression", "listDeclaration", 
			"listCommaSeparated", "listSpaceSeparated", "listBracketed", "listElement", 
			"mapDeclaration", "mapEntries", "mapEntry", "mapKey", "mapValue", "ifDeclaration", 
			"elseIfStatement", "elseStatement", "forDeclaration", "through", "whileDeclaration", 
			"eachDeclaration", "eachValueList", "var_", "calc", "rotate", "rgba", 
			"repeat", "unit", "length", "dimension", "percentage", "degree", "measurment", 
			"uri", "arglist", "plusMinus", "hexcolor", "color", "boolean", "number", 
			"identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'%'", "'@import'", "'@include'", "'@use'", "'@require'", 
			"'@charset '", "'@mixin'", "'@function'", "'@font-face'", "'@forward'", 
			"'@content'", "'@keyframes'", "'@return'", "'@media'", "'@extend'", "'@warn'", 
			"'@error'", "'if'", "'@if'", "'@for'", "'@else'", "'@while'", "'@each'", 
			"'from'", "'to'", "'through'", "'only'", "'not'", "'and'", "'using'", 
			"'as'", "'with'", "'or'", "'in'", "'!default'", "'!important'", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "'.'", "','", "':'", "';'", "'~'", 
			"'_'", "'$'", "'@'", "'&'", "'#'", "'true'", "'false'", "'+'", "'/'", 
			"'-'", "'*'", "'='", "'!='", "'>'", "'<'", "'~='", "'|='", "'|'", "'<!--'", 
			"'-->'", "':not('", "'calc('", "'rotate('", "'var('", "'rgba('", "'repeat('", 
			"'^='", "'$='", "'*='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Comment", "MultiLineComment", "LineComment", "Space", "Uri", "Format", 
			"AbsLength", "FontRelative", "ViewportRelative", "Angle", "Resolution", 
			"Freq", "Time", "Percentage", "Import", "Include", "Use", "Require", 
			"Charset", "Mixin", "Function", "FontFace", "Forward", "Content", "Keyframes", 
			"Return", "Media", "Extend", "Warn", "Error", "If", "AtIf", "AtFor", 
			"AtElse", "AtWhile", "AtEach", "From", "To", "Through", "Only", "Not", 
			"And", "Using", "As", "With", "Or", "In", "Default", "Important", "Lparen", 
			"Rparen", "Lbrack", "Rbrack", "BlockStart", "BlockEnd", "Dot", "Comma", 
			"Colon", "Semi", "Tilde", "Under", "Dollar", "At", "Amp", "Hash", "True", 
			"False", "Plus", "Div", "Minus", "Times", "Eq", "NotEq", "Greater", "Less", 
			"Includes", "DashMatch", "Pipe", "Cdo", "Cdc", "PseudoNot", "Calc", "Rotate", 
			"Var", "Rgba", "Repeat", "PrefixMatch", "SuffixMatch", "SubstringMatch", 
			"VendorPrefix", "Variable", "Number", "String_", "Ident"
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
	public String getGrammarFileName() { return "ScssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ScssParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3093972413642719216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1543652563L) != 0)) {
				{
				{
				setState(194);
				statement();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
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
	public static class StatementContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public PropertyDeclarationContext propertyDeclaration() {
			return getRuleContext(PropertyDeclarationContext.class,0);
		}
		public InterpolationDeclarationContext interpolationDeclaration() {
			return getRuleContext(InterpolationDeclarationContext.class,0);
		}
		public MediaDeclarationContext mediaDeclaration() {
			return getRuleContext(MediaDeclarationContext.class,0);
		}
		public MixinDeclarationContext mixinDeclaration() {
			return getRuleContext(MixinDeclarationContext.class,0);
		}
		public ContentDeclarationContext contentDeclaration() {
			return getRuleContext(ContentDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public IfDeclarationContext ifDeclaration() {
			return getRuleContext(IfDeclarationContext.class,0);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public WhileDeclarationContext whileDeclaration() {
			return getRuleContext(WhileDeclarationContext.class,0);
		}
		public EachDeclarationContext eachDeclaration() {
			return getRuleContext(EachDeclarationContext.class,0);
		}
		public FontFaceDeclarationContext fontFaceDeclaration() {
			return getRuleContext(FontFaceDeclarationContext.class,0);
		}
		public KeyframesDeclarationContext keyframesDeclaration() {
			return getRuleContext(KeyframesDeclarationContext.class,0);
		}
		public IncludeDeclarationContext includeDeclaration() {
			return getRuleContext(IncludeDeclarationContext.class,0);
		}
		public ExtendDeclarationContext extendDeclaration() {
			return getRuleContext(ExtendDeclarationContext.class,0);
		}
		public WarndingDeclarationContext warndingDeclaration() {
			return getRuleContext(WarndingDeclarationContext.class,0);
		}
		public ErrorDeclarationContext errorDeclaration() {
			return getRuleContext(ErrorDeclarationContext.class,0);
		}
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public AtStatementDeclarationContext atStatementDeclaration() {
			return getRuleContext(AtStatementDeclarationContext.class,0);
		}
		public PercentageStatementContext percentageStatement() {
			return getRuleContext(PercentageStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				importDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				variableDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				propertyDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				interpolationDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				mediaDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				mixinDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(208);
				contentDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(209);
				functionDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(210);
				ifDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(211);
				forDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(212);
				whileDeclaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(213);
				eachDeclaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(214);
				fontFaceDeclaration();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(215);
				keyframesDeclaration();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(216);
				includeDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(217);
				extendDeclaration();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(218);
				warndingDeclaration();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(219);
				errorDeclaration();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(220);
				ruleset();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(221);
				atStatementDeclaration();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(222);
				percentageStatement();
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
	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ScssParser.Import, 0); }
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public TerminalNode Require() { return getToken(ScssParser.Require, 0); }
		public TerminalNode Use() { return getToken(ScssParser.Use, 0); }
		public AsClauseContext asClause() {
			return getRuleContext(AsClauseContext.class,0);
		}
		public WithClauseContext withClause() {
			return getRuleContext(WithClauseContext.class,0);
		}
		public TerminalNode Forward() { return getToken(ScssParser.Forward, 0); }
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(Import);
				setState(226);
				importPath();
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(227);
					match(Semi);
					}
				}

				}
				break;
			case Require:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				match(Require);
				setState(231);
				importPath();
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(232);
					match(Semi);
					}
				}

				}
				break;
			case Use:
				enterOuterAlt(_localctx, 3);
				{
				setState(235);
				match(Use);
				setState(236);
				importPath();
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==As) {
					{
					setState(237);
					asClause();
					}
				}

				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==With) {
					{
					setState(240);
					withClause();
					}
				}

				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Semi) {
					{
					setState(243);
					match(Semi);
					}
				}

				}
				break;
			case Forward:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(Forward);
				setState(247);
				importPath();
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
	public static class ImportPathContext extends ParserRuleContext {
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public TerminalNode String_() { return getToken(ScssParser.String_, 0); }
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitImportPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitImportPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importPath);
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Uri:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				uri();
				}
				break;
			case String_:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(String_);
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
	public static class AsClauseContext extends ParserRuleContext {
		public TerminalNode As() { return getToken(ScssParser.As, 0); }
		public TerminalNode Times() { return getToken(ScssParser.Times, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AsClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterAsClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitAsClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitAsClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsClauseContext asClause() throws RecognitionException {
		AsClauseContext _localctx = new AsClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(As);
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Times:
				{
				setState(255);
				match(Times);
				}
				break;
			case From:
			case To:
			case Minus:
			case VendorPrefix:
			case Ident:
				{
				setState(256);
				identifier();
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
	public static class WithClauseContext extends ParserRuleContext {
		public TerminalNode With() { return getToken(ScssParser.With, 0); }
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public WithClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterWithClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitWithClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitWithClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithClauseContext withClause() throws RecognitionException {
		WithClauseContext _localctx = new WithClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_withClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(With);
			setState(260);
			match(Lparen);
			setState(261);
			parameters();
			setState(262);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ScssParser.Colon, 0); }
		public VariableValueContext variableValue() {
			return getRuleContext(VariableValueContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			variableName();
			setState(265);
			match(Colon);
			setState(266);
			variableValue();
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(267);
				prio();
				}
				break;
			}
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(270);
				match(Semi);
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
	public static class VariableValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<MapDeclarationContext> mapDeclaration() {
			return getRuleContexts(MapDeclarationContext.class);
		}
		public MapDeclarationContext mapDeclaration(int i) {
			return getRuleContext(MapDeclarationContext.class,i);
		}
		public List<ListDeclarationContext> listDeclaration() {
			return getRuleContexts(ListDeclarationContext.class);
		}
		public ListDeclarationContext listDeclaration(int i) {
			return getRuleContext(ListDeclarationContext.class,i);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterVariableValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitVariableValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitVariableValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueContext variableValue() throws RecognitionException {
		VariableValueContext _localctx = new VariableValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variableValue);
		try {
			int _alt;
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				functionDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(277); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(276);
						mapDeclaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(279); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(281);
						listDeclaration();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(284); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				variableName();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				identifier();
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
	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Dollar() { return getToken(ScssParser.Dollar, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public List<TerminalNode> Minus() { return getTokens(ScssParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(ScssParser.Minus, i);
		}
		public MeasurmentContext measurment() {
			return getRuleContext(MeasurmentContext.class,0);
		}
		public Namespace_Context namespace_() {
			return getRuleContext(Namespace_Context.class,0);
		}
		public TerminalNode Variable() { return getToken(ScssParser.Variable, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableName);
		int _la;
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					{
					setState(290);
					match(Minus);
					setState(291);
					match(Minus);
					}
					setState(293);
					match(Dollar);
					}
					break;
				case 2:
					{
					setState(294);
					plusMinus();
					setState(295);
					match(Dollar);
					}
					break;
				case 3:
					{
					setState(297);
					match(Dollar);
					}
					break;
				}
				setState(300);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(301);
					plusMinus();
					}
					break;
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153122395920531459L) != 0)) {
					{
					setState(304);
					namespace_();
					}
				}

				setState(307);
				match(Dollar);
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case From:
				case To:
				case Minus:
				case VendorPrefix:
				case Ident:
					{
					setState(308);
					identifier();
					}
					break;
				case AbsLength:
				case FontRelative:
				case ViewportRelative:
				case Angle:
				case Resolution:
				case Freq:
				case Time:
				case Percentage:
					{
					setState(309);
					measurment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(312);
				match(Variable);
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
	public static class Namespace_Context extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(ScssParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ScssParser.Dot, i);
		}
		public Namespace_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterNamespace_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitNamespace_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitNamespace_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_Context namespace_() throws RecognitionException {
		Namespace_Context _localctx = new Namespace_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_namespace_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(315);
					identifier();
					setState(316);
					match(Dot);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ScssParser.Colon, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public PropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDeclarationContext propertyDeclaration() throws RecognitionException {
		PropertyDeclarationContext _localctx = new PropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			identifier();
			setState(323);
			match(Colon);
			setState(324);
			propertyValue();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(325);
				match(Semi);
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
	public static class PrioContext extends ParserRuleContext {
		public TerminalNode Important() { return getToken(ScssParser.Important, 0); }
		public TerminalNode Default() { return getToken(ScssParser.Default, 0); }
		public PrioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPrio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPrio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPrio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrioContext prio() throws RecognitionException {
		PrioContext _localctx = new PrioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_la = _input.LA(1);
			if ( !(_la==Default || _la==Important) ) {
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
	public static class PropertyValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ListSpaceSeparatedContext listSpaceSeparated() {
			return getRuleContext(ListSpaceSeparatedContext.class,0);
		}
		public ListCommaSeparatedContext listCommaSeparated() {
			return getRuleContext(ListCommaSeparatedContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public List<PrioContext> prio() {
			return getRuleContexts(PrioContext.class);
		}
		public PrioContext prio(int i) {
			return getRuleContext(PrioContext.class,i);
		}
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propertyValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(330);
				value();
				}
				break;
			case 2:
				{
				setState(332);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(331);
					value();
					}
					break;
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Default || _la==Important) {
					{
					setState(334);
					prio();
					}
				}

				setState(337);
				block();
				}
				break;
			case 3:
				{
				setState(338);
				variableName();
				}
				break;
			case 4:
				{
				setState(339);
				listSpaceSeparated();
				}
				break;
			case 5:
				{
				setState(340);
				listCommaSeparated();
				}
				break;
			case 6:
				{
				setState(341);
				expression();
				}
				break;
			case 7:
				{
				setState(342);
				functionCall();
				}
				break;
			}
			setState(346);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(345);
				prio();
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
	public static class MediaDeclarationContext extends ParserRuleContext {
		public TerminalNode Media() { return getToken(ScssParser.Media, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MediaDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMediaDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMediaDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMediaDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaDeclarationContext mediaDeclaration() throws RecognitionException {
		MediaDeclarationContext _localctx = new MediaDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_mediaDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			match(Media);
			setState(349);
			mediaQueryList();
			setState(350);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryListContext extends ParserRuleContext {
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMediaQueryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(352);
				mediaQuery();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(353);
					match(Comma);
					setState(354);
					mediaQuery();
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class MediaQueryContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> And() { return getTokens(ScssParser.And); }
		public TerminalNode And(int i) {
			return getToken(ScssParser.And, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode Only() { return getToken(ScssParser.Only, 0); }
		public TerminalNode Not() { return getToken(ScssParser.Not, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_mediaQuery);
		int _la;
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(362);
					_la = _input.LA(1);
					if ( !(_la==Only || _la==Not) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(367);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(365);
					identifier();
					}
					break;
				case 2:
					{
					setState(366);
					value();
					}
					break;
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==And) {
					{
					{
					setState(369);
					match(And);
					setState(370);
					mediaExpression();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(376);
				mediaExpression();
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==And) {
					{
					{
					setState(377);
					match(And);
					setState(378);
					mediaExpression();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class MediaExpressionContext extends ParserRuleContext {
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public TerminalNode Colon() { return getToken(ScssParser.Colon, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMediaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMediaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMediaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(Lparen);
			setState(387);
			identifier();
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(388);
				match(Colon);
				setState(389);
				value();
				}
			}

			setState(392);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MixinDeclarationContext extends ParserRuleContext {
		public TerminalNode Mixin() { return getToken(ScssParser.Mixin, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public MixinDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixinDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMixinDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMixinDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMixinDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MixinDeclarationContext mixinDeclaration() throws RecognitionException {
		MixinDeclarationContext _localctx = new MixinDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_mixinDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(Mixin);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(395);
				identifier();
				}
				break;
			case 2:
				{
				setState(396);
				identifier();
				setState(397);
				match(Lparen);
				setState(398);
				parameters();
				setState(399);
				match(Rparen);
				}
				break;
			}
			setState(403);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContentDeclarationContext extends ParserRuleContext {
		public TerminalNode Content() { return getToken(ScssParser.Content, 0); }
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public ContentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterContentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitContentDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitContentDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentDeclarationContext contentDeclaration() throws RecognitionException {
		ContentDeclarationContext _localctx = new ContentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_contentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(Content);
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(406);
				match(Lparen);
				setState(407);
				parameters();
				setState(408);
				match(Rparen);
				}
				break;
			}
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(412);
				match(Semi);
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
	public static class FontFaceDeclarationContext extends ParserRuleContext {
		public TerminalNode FontFace() { return getToken(ScssParser.FontFace, 0); }
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FontFaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceDeclarationContext fontFaceDeclaration() throws RecognitionException {
		FontFaceDeclarationContext _localctx = new FontFaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_fontFaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(FontFace);
			setState(416);
			match(BlockStart);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3093972413642719216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1543652563L) != 0)) {
				{
				{
				setState(417);
				statement();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			match(BlockEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframesDeclarationContext extends ParserRuleContext {
		public TerminalNode Keyframes() { return getToken(ScssParser.Keyframes, 0); }
		public KeyframesBlockContext keyframesBlock() {
			return getRuleContext(KeyframesBlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeyframesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterKeyframesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitKeyframesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitKeyframesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesDeclarationContext keyframesDeclaration() throws RecognitionException {
		KeyframesDeclarationContext _localctx = new KeyframesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_keyframesDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(Keyframes);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153122395920531459L) != 0)) {
				{
				setState(426);
				identifier();
				}
			}

			setState(429);
			keyframesBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframesBlockContext extends ParserRuleContext {
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public List<PercentageStatementContext> percentageStatement() {
			return getRuleContexts(PercentageStatementContext.class);
		}
		public PercentageStatementContext percentageStatement(int i) {
			return getRuleContext(PercentageStatementContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public KeyframesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterKeyframesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitKeyframesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitKeyframesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesBlockContext keyframesBlock() throws RecognitionException {
		KeyframesBlockContext _localctx = new KeyframesBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_keyframesBlock);
		int _la;
		try {
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(BlockStart);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 16777221L) != 0)) {
					{
					{
					setState(432);
					percentageStatement();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				match(BlockEnd);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(439);
				block();
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
	public static class PercentageStatementContext extends ParserRuleContext {
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public PercentageStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentageStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPercentageStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPercentageStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPercentageStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentageStatementContext percentageStatement() throws RecognitionException {
		PercentageStatementContext _localctx = new PercentageStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_percentageStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			percentage();
			setState(443);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IncludeDeclarationContext extends ParserRuleContext {
		public TerminalNode Include() { return getToken(ScssParser.Include, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public Namespace_Context namespace_() {
			return getRuleContext(Namespace_Context.class,0);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public TerminalNode Using() { return getToken(ScssParser.Using, 0); }
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IncludeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIncludeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIncludeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitIncludeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeDeclarationContext includeDeclaration() throws RecognitionException {
		IncludeDeclarationContext _localctx = new IncludeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_includeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(Include);
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(446);
				namespace_();
				}
				break;
			}
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(449);
				identifier();
				}
				break;
			case 2:
				{
				setState(450);
				functionCall();
				}
				break;
			}
			setState(459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Semi:
				{
				setState(453);
				match(Semi);
				}
				break;
			case Using:
				{
				setState(454);
				match(Using);
				setState(455);
				match(Lparen);
				setState(456);
				parameters();
				setState(457);
				match(Rparen);
				}
				break;
			case EOF:
			case Space:
			case Uri:
			case Format:
			case AbsLength:
			case FontRelative:
			case ViewportRelative:
			case Angle:
			case Resolution:
			case Freq:
			case Time:
			case Percentage:
			case Import:
			case Include:
			case Use:
			case Require:
			case Mixin:
			case Function:
			case FontFace:
			case Forward:
			case Content:
			case Keyframes:
			case Return:
			case Media:
			case Extend:
			case Warn:
			case Error:
			case If:
			case AtIf:
			case AtFor:
			case AtWhile:
			case AtEach:
			case From:
			case To:
			case Not:
			case Default:
			case Important:
			case Lparen:
			case Lbrack:
			case BlockStart:
			case BlockEnd:
			case Dot:
			case Colon:
			case Tilde:
			case Dollar:
			case At:
			case Amp:
			case Hash:
			case True:
			case False:
			case Plus:
			case Minus:
			case Times:
			case Greater:
			case Pipe:
			case PseudoNot:
			case Calc:
			case Rotate:
			case Var:
			case Rgba:
			case VendorPrefix:
			case Variable:
			case Number:
			case String_:
			case Ident:
				break;
			default:
				break;
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BlockStart) {
				{
				setState(461);
				block();
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
	public static class InterpolationDeclarationContext extends ParserRuleContext {
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ScssParser.Colon, 0); }
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public InterpolationDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolationDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterInterpolationDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitInterpolationDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitInterpolationDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationDeclarationContext interpolationDeclaration() throws RecognitionException {
		InterpolationDeclarationContext _localctx = new InterpolationDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_interpolationDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			interpolation();
			setState(465);
			match(Colon);
			setState(466);
			propertyValue();
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(467);
				match(Semi);
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
	public static class ExtendDeclarationContext extends ParserRuleContext {
		public TerminalNode Extend() { return getToken(ScssParser.Extend, 0); }
		public TerminalNode Percentage() { return getToken(ScssParser.Percentage, 0); }
		public List<ParentRefContext> parentRef() {
			return getRuleContexts(ParentRefContext.class);
		}
		public ParentRefContext parentRef(int i) {
			return getRuleContext(ParentRefContext.class,i);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TypeSelectorContext> typeSelector() {
			return getRuleContexts(TypeSelectorContext.class);
		}
		public TypeSelectorContext typeSelector(int i) {
			return getRuleContext(TypeSelectorContext.class,i);
		}
		public List<UniversalContext> universal() {
			return getRuleContexts(UniversalContext.class);
		}
		public UniversalContext universal(int i) {
			return getRuleContext(UniversalContext.class,i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public ExtendDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterExtendDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitExtendDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitExtendDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendDeclarationContext extendDeclaration() throws RecognitionException {
		ExtendDeclarationContext _localctx = new ExtendDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_extendDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(Extend);
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(471);
				match(Percentage);
				}
				break;
			case 2:
				{
				setState(472);
				parentRef();
				}
				break;
			}
			setState(483); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(483);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(475);
						id();
						}
						break;
					case 2:
						{
						setState(476);
						typeSelector();
						}
						break;
					case 3:
						{
						setState(477);
						universal();
						}
						break;
					case 4:
						{
						setState(478);
						className();
						}
						break;
					case 5:
						{
						setState(479);
						attrib();
						}
						break;
					case 6:
						{
						setState(480);
						pseudo();
						}
						break;
					case 7:
						{
						setState(481);
						interpolation();
						}
						break;
					case 8:
						{
						setState(482);
						parentRef();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(485); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(487);
				match(Semi);
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
	public static class WarndingDeclarationContext extends ParserRuleContext {
		public TerminalNode Warn() { return getToken(ScssParser.Warn, 0); }
		public TerminalNode String_() { return getToken(ScssParser.String_, 0); }
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public WarndingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_warndingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterWarndingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitWarndingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitWarndingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WarndingDeclarationContext warndingDeclaration() throws RecognitionException {
		WarndingDeclarationContext _localctx = new WarndingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_warndingDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(Warn);
			setState(491);
			match(String_);
			setState(492);
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
	public static class ErrorDeclarationContext extends ParserRuleContext {
		public TerminalNode Error() { return getToken(ScssParser.Error, 0); }
		public TerminalNode String_() { return getToken(ScssParser.String_, 0); }
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public ErrorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterErrorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitErrorDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitErrorDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorDeclarationContext errorDeclaration() throws RecognitionException {
		ErrorDeclarationContext _localctx = new ErrorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_errorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(Error);
			setState(495);
			match(String_);
			setState(496);
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
	public static class AtStatementDeclarationContext extends ParserRuleContext {
		public TerminalNode At() { return getToken(ScssParser.At, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public AtStatementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atStatementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterAtStatementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitAtStatementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitAtStatementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtStatementDeclarationContext atStatementDeclaration() throws RecognitionException {
		AtStatementDeclarationContext _localctx = new AtStatementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atStatementDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(At);
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(499);
				identifier();
				setState(500);
				match(Lparen);
				setState(501);
				parameters();
				setState(502);
				match(Rparen);
				}
				break;
			case 2:
				{
				setState(504);
				identifier();
				}
				break;
			}
			setState(507);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesetContext extends ParserRuleContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ruleset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			selectorGroup();
			setState(510);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(BlockStart);
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3093972413642719216L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 1543652563L) != 0)) {
				{
				{
				setState(513);
				statement();
				}
				}
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(519);
				functionReturn();
				}
			}

			setState(522);
			match(BlockEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			selector();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(525);
				match(Comma);
				setState(526);
				selector();
				}
				}
				setState(531);
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
	public static class SelectorContext extends ParserRuleContext {
		public List<SelectorSequenceContext> selectorSequence() {
			return getRuleContexts(SelectorSequenceContext.class);
		}
		public SelectorSequenceContext selectorSequence(int i) {
			return getRuleContext(SelectorSequenceContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(532);
				combinator();
				}
				break;
			}
			setState(535);
			selectorSequence();
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Space || _la==Tilde || _la==Plus || _la==Greater) {
				{
				{
				setState(536);
				combinator();
				setState(537);
				selectorSequence();
				}
				}
				setState(543);
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
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(ScssParser.Plus, 0); }
		public TerminalNode Greater() { return getToken(ScssParser.Greater, 0); }
		public TerminalNode Tilde() { return getToken(ScssParser.Tilde, 0); }
		public TerminalNode Space() { return getToken(ScssParser.Space, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_combinator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			_la = _input.LA(1);
			if ( !(_la==Space || _la==Tilde || _la==Plus || _la==Greater) ) {
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
	public static class SelectorSequenceContext extends ParserRuleContext {
		public List<TypeSelectorContext> typeSelector() {
			return getRuleContexts(TypeSelectorContext.class);
		}
		public TypeSelectorContext typeSelector(int i) {
			return getRuleContext(TypeSelectorContext.class,i);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public List<ParentRefContext> parentRef() {
			return getRuleContexts(ParentRefContext.class);
		}
		public ParentRefContext parentRef(int i) {
			return getRuleContext(ParentRefContext.class,i);
		}
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public List<TerminalNode> Percentage() { return getTokens(ScssParser.Percentage); }
		public TerminalNode Percentage(int i) {
			return getToken(ScssParser.Percentage, i);
		}
		public SelectorSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitSelectorSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitSelectorSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorSequenceContext selectorSequence() throws RecognitionException {
		SelectorSequenceContext _localctx = new SelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectorSequence);
		int _la;
		try {
			int _alt;
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(546);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(547);
					universal();
					}
					break;
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153139988511883267L) != 0)) {
					{
					setState(561);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(550);
						id();
						}
						break;
					case 2:
						{
						setState(551);
						className();
						}
						break;
					case 3:
						{
						setState(552);
						attrib();
						}
						break;
					case 4:
						{
						setState(553);
						pseudo();
						}
						break;
					case 5:
						{
						setState(554);
						negation();
						}
						break;
					case 6:
						{
						setState(555);
						interpolation();
						setState(558);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
						case 1:
							{
							setState(556);
							variableName();
							}
							break;
						case 2:
							{
							setState(557);
							match(Percentage);
							}
							break;
						}
						}
						break;
					case 7:
						{
						setState(560);
						parentRef();
						}
						break;
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(578); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(578);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
						case 1:
							{
							setState(566);
							typeSelector();
							}
							break;
						case 2:
							{
							setState(567);
							id();
							}
							break;
						case 3:
							{
							setState(568);
							className();
							}
							break;
						case 4:
							{
							setState(569);
							attrib();
							}
							break;
						case 5:
							{
							setState(570);
							pseudo();
							}
							break;
						case 6:
							{
							setState(571);
							negation();
							}
							break;
						case 7:
							{
							setState(572);
							interpolation();
							setState(575);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
							case 1:
								{
								setState(573);
								variableName();
								}
								break;
							case 2:
								{
								setState(574);
								match(Percentage);
								}
								break;
							}
							}
							break;
						case 8:
							{
							setState(577);
							parentRef();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(580); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(ScssParser.Hash, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(Hash);
			setState(585);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode Percentage() { return getToken(ScssParser.Percentage, 0); }
		public ParentRefContext parentRef() {
			return getRuleContext(ParentRefContext.class,0);
		}
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(587);
				typeNamespacePrefix();
				}
				break;
			}
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Percentage:
				{
				setState(590);
				match(Percentage);
				}
				break;
			case Amp:
				{
				setState(591);
				parentRef();
				}
				break;
			case From:
			case To:
			case Dollar:
			case Plus:
			case Minus:
			case VendorPrefix:
			case Variable:
			case Ident:
				break;
			default:
				break;
			}
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(594);
				identifier();
				}
				break;
			case 2:
				{
				setState(595);
				variableName();
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
	public static class TypeNamespacePrefixContext extends ParserRuleContext {
		public TerminalNode Pipe() { return getToken(ScssParser.Pipe, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Times() { return getToken(ScssParser.Times, 0); }
		public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterTypeNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitTypeNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitTypeNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case From:
			case To:
			case Minus:
			case VendorPrefix:
			case Ident:
				{
				setState(598);
				identifier();
				}
				break;
			case Times:
				{
				setState(599);
				match(Times);
				}
				break;
			case Pipe:
				break;
			default:
				break;
			}
			setState(602);
			match(Pipe);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniversalContext extends ParserRuleContext {
		public TerminalNode Times() { return getToken(ScssParser.Times, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(604);
				typeNamespacePrefix();
				}
				break;
			}
			setState(607);
			match(Times);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(ScssParser.Dot, 0); }
		public List<TerminalNode> Minus() { return getTokens(ScssParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(ScssParser.Minus, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<InterpolationContext> interpolation() {
			return getRuleContexts(InterpolationContext.class);
		}
		public InterpolationContext interpolation(int i) {
			return getRuleContext(InterpolationContext.class,i);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_className);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(Dot);
			setState(613); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(613);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						setState(610);
						match(Minus);
						}
						break;
					case 2:
						{
						setState(611);
						identifier();
						}
						break;
					case 3:
						{
						setState(612);
						interpolation();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(615); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InterpolationContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(ScssParser.Hash, 0); }
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ParentRefContext parentRef() {
			return getRuleContext(ParentRefContext.class,0);
		}
		public List<Namespace_Context> namespace_() {
			return getRuleContexts(Namespace_Context.class);
		}
		public Namespace_Context namespace_(int i) {
			return getRuleContext(Namespace_Context.class,i);
		}
		public MeasurmentContext measurment() {
			return getRuleContext(MeasurmentContext.class,0);
		}
		public InterpolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interpolation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterInterpolation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitInterpolation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitInterpolation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterpolationContext interpolation() throws RecognitionException {
		InterpolationContext _localctx = new InterpolationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_interpolation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153122395920531459L) != 0)) {
				{
				setState(617);
				namespace_();
				}
			}

			setState(620);
			match(Hash);
			setState(621);
			match(BlockStart);
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(622);
				namespace_();
				}
				break;
			}
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(625);
				ifExpression();
				}
				break;
			case 2:
				{
				setState(626);
				value();
				}
				break;
			case 3:
				{
				setState(627);
				parentRef();
				}
				break;
			}
			setState(630);
			match(BlockEnd);
			setState(632);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(631);
				measurment();
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
	public static class ParentRefContext extends ParserRuleContext {
		public TerminalNode Amp() { return getToken(ScssParser.Amp, 0); }
		public ParentRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterParentRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitParentRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitParentRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentRefContext parentRef() throws RecognitionException {
		ParentRefContext _localctx = new ParentRefContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parentRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(Amp);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttribContext extends ParserRuleContext {
		public TerminalNode Lbrack() { return getToken(ScssParser.Lbrack, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode Rbrack() { return getToken(ScssParser.Rbrack, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode PrefixMatch() { return getToken(ScssParser.PrefixMatch, 0); }
		public TerminalNode SuffixMatch() { return getToken(ScssParser.SuffixMatch, 0); }
		public TerminalNode SubstringMatch() { return getToken(ScssParser.SubstringMatch, 0); }
		public TerminalNode Eq() { return getToken(ScssParser.Eq, 0); }
		public TerminalNode Includes() { return getToken(ScssParser.Includes, 0); }
		public TerminalNode DashMatch() { return getToken(ScssParser.DashMatch, 0); }
		public TerminalNode String_() { return getToken(ScssParser.String_, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(Lbrack);
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(637);
				typeNamespacePrefix();
				}
				break;
			}
			setState(640);
			identifier();
			setState(646);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 229425L) != 0)) {
				{
				setState(641);
				_la = _input.LA(1);
				if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 229425L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(644);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case From:
				case To:
				case Minus:
				case VendorPrefix:
				case Ident:
					{
					setState(642);
					identifier();
					}
					break;
				case String_:
					{
					setState(643);
					match(String_);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(648);
			match(Rbrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoContext extends ParserRuleContext {
		public List<TerminalNode> Colon() { return getTokens(ScssParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(ScssParser.Colon, i);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			match(Colon);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(651);
				match(Colon);
				}
			}

			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(654);
				interpolation();
				}
				break;
			case 2:
				{
				setState(655);
				identifier();
				}
				break;
			case 3:
				{
				setState(656);
				functionalPseudo();
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
	public static class FunctionalPseudoContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(ScssParser.Ident, 0); }
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public List<PseudoParameterContext> pseudoParameter() {
			return getRuleContexts(PseudoParameterContext.class);
		}
		public PseudoParameterContext pseudoParameter(int i) {
			return getRuleContext(PseudoParameterContext.class,i);
		}
		public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalPseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionalPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionalPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitFunctionalPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_functionalPseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(Ident);
			setState(660);
			match(Lparen);
			setState(662); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(661);
				pseudoParameter();
				}
				}
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4703730949299404768L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1044250671L) != 0) );
			setState(666);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoParameterContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ScssParser.Comma, 0); }
		public PseudoParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPseudoParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPseudoParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPseudoParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoParameterContext pseudoParameter() throws RecognitionException {
		PseudoParameterContext _localctx = new PseudoParameterContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_pseudoParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(671);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(668);
				value();
				}
				break;
			case 2:
				{
				setState(669);
				className();
				}
				break;
			case 3:
				{
				setState(670);
				interpolation();
				}
				break;
			}
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(673);
				match(Comma);
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
	public static class NegationContext extends ParserRuleContext {
		public TerminalNode PseudoNot() { return getToken(ScssParser.PseudoNot, 0); }
		public NegationArgContext negationArg() {
			return getRuleContext(NegationArgContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			match(PseudoNot);
			setState(677);
			negationArg();
			setState(678);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegationArgContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public TerminalNode Hash() { return getToken(ScssParser.Hash, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public NegationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterNegationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitNegationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitNegationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationArgContext negationArg() throws RecognitionException {
		NegationArgContext _localctx = new NegationArgContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_negationArg);
		try {
			setState(686);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				typeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				universal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(Hash);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				className();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(684);
				attrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(685);
				pseudo();
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
	public static class Operator_Context extends ParserRuleContext {
		public TerminalNode Div() { return getToken(ScssParser.Div, 0); }
		public TerminalNode Times() { return getToken(ScssParser.Times, 0); }
		public TerminalNode Minus() { return getToken(ScssParser.Minus, 0); }
		public TerminalNode Plus() { return getToken(ScssParser.Plus, 0); }
		public TerminalNode Greater() { return getToken(ScssParser.Greater, 0); }
		public TerminalNode Less() { return getToken(ScssParser.Less, 0); }
		public List<TerminalNode> Eq() { return getTokens(ScssParser.Eq); }
		public TerminalNode Eq(int i) {
			return getToken(ScssParser.Eq, i);
		}
		public TerminalNode NotEq() { return getToken(ScssParser.NotEq, 0); }
		public TerminalNode And() { return getToken(ScssParser.And, 0); }
		public TerminalNode Or() { return getToken(ScssParser.Or, 0); }
		public TerminalNode Not() { return getToken(ScssParser.Not, 0); }
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterOperator_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitOperator_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitOperator_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_operator_);
		int _la;
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				match(Div);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(689);
				match(Times);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(690);
				match(Minus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(691);
				match(Plus);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(692);
				match(Greater);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(693);
				match(Less);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(694);
				match(Greater);
				setState(695);
				match(Eq);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(696);
				match(Less);
				setState(697);
				match(Eq);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(698);
				match(Eq);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Eq) {
					{
					setState(699);
					match(Eq);
					}
				}

				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(702);
				match(NotEq);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(703);
				match(And);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(704);
				match(Or);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(705);
				match(Not);
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
	public static class ValueContext extends ParserRuleContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public RgbaContext rgba() {
			return getRuleContext(RgbaContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public TerminalNode Format() { return getToken(ScssParser.Format, 0); }
		public TerminalNode String_() { return getToken(ScssParser.String_, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public HexcolorContext hexcolor() {
			return getRuleContext(HexcolorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public MeasurmentContext measurment() {
			return getRuleContext(MeasurmentContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_value);
		try {
			setState(729);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				unit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				boolean_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				calc();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(712);
				rotate();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(713);
				rgba();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(714);
				var_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(715);
				uri();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(716);
				repeat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(717);
				match(Format);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(718);
				match(String_);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(719);
				functionCall();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(720);
				variableName();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(721);
				interpolation();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(722);
				hexcolor();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(723);
				identifier();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(724);
				expression();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(725);
				block();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(726);
				match(Lparen);
				setState(727);
				match(Rparen);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(728);
				measurment();
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(ScssParser.Function, 0); }
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public TerminalNode BlockStart() { return getToken(ScssParser.BlockStart, 0); }
		public TerminalNode BlockEnd() { return getToken(ScssParser.BlockEnd, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public Namespace_Context namespace_() {
			return getRuleContext(Namespace_Context.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			match(Function);
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 37)) & ~0x3f) == 0 && ((1L << (_la - 37)) & 153122395920531459L) != 0)) {
				{
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(732);
					namespace_();
					}
					break;
				}
				setState(735);
				identifier();
				}
			}

			setState(738);
			match(Lparen);
			setState(739);
			parameters();
			setState(740);
			match(Rparen);
			setState(741);
			match(BlockStart);
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(742);
				functionBody();
				}
				break;
			}
			setState(745);
			match(BlockEnd);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4631673355261476832L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1044250671L) != 0)) {
				{
				setState(747);
				parameter();
				}
			}

			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(750);
				match(Comma);
				setState(751);
				parameter();
				}
				}
				setState(756);
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
	public static class ParameterContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ListSpaceSeparatedContext listSpaceSeparated() {
			return getRuleContext(ListSpaceSeparatedContext.class,0);
		}
		public MapDeclarationContext mapDeclaration() {
			return getRuleContext(MapDeclarationContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(757);
				value();
				}
				break;
			case 2:
				{
				setState(758);
				variableDeclaration();
				}
				break;
			case 3:
				{
				setState(759);
				listSpaceSeparated();
				}
				break;
			case 4:
				{
				setState(760);
				mapDeclaration();
				}
				break;
			}
			setState(764);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(763);
				arglist();
				}
			}

			setState(767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default || _la==Important) {
				{
				setState(766);
				prio();
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
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitFunctionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -3091999887634989072L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2084455647L) != 0)) {
				{
				{
				setState(769);
				functionStatement();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(775);
				functionReturn();
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
	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ScssParser.Return, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_functionReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			match(Return);
			setState(779);
			expression();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(780);
				match(Comma);
				setState(781);
				expression();
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(788);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Semi) {
				{
				setState(787);
				match(Semi);
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
	public static class FunctionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(ScssParser.Semi, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_functionStatement);
		try {
			setState(794);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				expression();
				setState(791);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				statement();
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
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public Namespace_Context namespace_() {
			return getRuleContext(Namespace_Context.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(796);
				namespace_();
				}
				break;
			}
			setState(799);
			identifier();
			setState(800);
			match(Lparen);
			setState(801);
			parameters();
			setState(802);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
		public List<ExpressionPartContext> expressionPart() {
			return getRuleContexts(ExpressionPartContext.class);
		}
		public ExpressionPartContext expressionPart(int i) {
			return getRuleContext(ExpressionPartContext.class,i);
		}
		public List<TerminalNode> Not() { return getTokens(ScssParser.Not); }
		public TerminalNode Not(int i) {
			return getToken(ScssParser.Not, i);
		}
		public List<Operator_Context> operator_() {
			return getRuleContexts(Operator_Context.class);
		}
		public Operator_Context operator_(int i) {
			return getRuleContext(Operator_Context.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Not) {
				{
				setState(804);
				match(Not);
				}
			}

			setState(807);
			expressionPart();
			setState(816);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(808);
					operator_();
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Not) {
						{
						setState(809);
						match(Not);
						}
					}

					setState(812);
					expressionPart();
					}
					} 
				}
				setState(818);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
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
	public static class ExpressionPartContext extends ParserRuleContext {
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public RotateContext rotate() {
			return getRuleContext(RotateContext.class,0);
		}
		public RgbaContext rgba() {
			return getRuleContext(RgbaContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public TerminalNode Format() { return getToken(ScssParser.Format, 0); }
		public TerminalNode String_() { return getToken(ScssParser.String_, 0); }
		public InterpolationContext interpolation() {
			return getRuleContext(InterpolationContext.class,0);
		}
		public HexcolorContext hexcolor() {
			return getRuleContext(HexcolorContext.class,0);
		}
		public IfExpressionContext ifExpression() {
			return getRuleContext(IfExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public MeasurmentContext measurment() {
			return getRuleContext(MeasurmentContext.class,0);
		}
		public ExpressionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterExpressionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitExpressionPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitExpressionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionPartContext expressionPart() throws RecognitionException {
		ExpressionPartContext _localctx = new ExpressionPartContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_expressionPart);
		int _la;
		try {
			setState(845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(819);
				unit();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(820);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				variableName();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(822);
				var_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(823);
				boolean_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(824);
				calc();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(825);
				rotate();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(826);
				rgba();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(827);
				number();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(828);
				uri();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(829);
				match(Format);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(830);
				match(String_);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(831);
				interpolation();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(832);
				hexcolor();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(833);
				ifExpression();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(834);
				functionCall();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Plus || _la==Minus) {
					{
					setState(835);
					plusMinus();
					}
				}

				setState(838);
				match(Lparen);
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4613658956751994848L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1042153519L) != 0)) {
					{
					setState(839);
					expression();
					}
				}

				setState(842);
				match(Rparen);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(843);
				prio();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(844);
				measurment();
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
	public static class IfExpressionContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ScssParser.If, 0); }
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParentRefContext parentRef() {
			return getRuleContext(ParentRefContext.class,0);
		}
		public MeasurmentContext measurment() {
			return getRuleContext(MeasurmentContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public IfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExpressionContext ifExpression() throws RecognitionException {
		IfExpressionContext _localctx = new IfExpressionContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ifExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(If);
			setState(848);
			match(Lparen);
			setState(851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Uri:
			case Format:
			case AbsLength:
			case FontRelative:
			case ViewportRelative:
			case Angle:
			case Resolution:
			case Freq:
			case Time:
			case Percentage:
			case If:
			case From:
			case To:
			case Not:
			case Default:
			case Important:
			case Lparen:
			case Dollar:
			case Hash:
			case True:
			case False:
			case Plus:
			case Minus:
			case Calc:
			case Rotate:
			case Var:
			case Rgba:
			case VendorPrefix:
			case Variable:
			case Number:
			case String_:
			case Ident:
				{
				setState(849);
				expression();
				}
				break;
			case Amp:
				{
				setState(850);
				parentRef();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(853);
			match(Comma);
			setState(854);
			value();
			setState(855);
			match(Comma);
			setState(856);
			value();
			setState(857);
			match(Rparen);
			setState(859);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(858);
				measurment();
				}
				break;
			}
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(861);
				prio();
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
	public static class ListDeclarationContext extends ParserRuleContext {
		public ListBracketedContext listBracketed() {
			return getRuleContext(ListBracketedContext.class,0);
		}
		public ListCommaSeparatedContext listCommaSeparated() {
			return getRuleContext(ListCommaSeparatedContext.class,0);
		}
		public ListSpaceSeparatedContext listSpaceSeparated() {
			return getRuleContext(ListSpaceSeparatedContext.class,0);
		}
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_listDeclaration);
		try {
			setState(873);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(864);
					listBracketed();
					}
					break;
				case 2:
					{
					setState(865);
					listCommaSeparated();
					}
					break;
				case 3:
					{
					setState(866);
					listSpaceSeparated();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				match(Lparen);
				setState(870);
				listDeclaration();
				setState(871);
				match(Rparen);
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
	public static class ListCommaSeparatedContext extends ParserRuleContext {
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public ListCommaSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listCommaSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterListCommaSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitListCommaSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitListCommaSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListCommaSeparatedContext listCommaSeparated() throws RecognitionException {
		ListCommaSeparatedContext _localctx = new ListCommaSeparatedContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_listCommaSeparated);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			listElement();
			setState(880);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(876);
					match(Comma);
					setState(877);
					listElement();
					}
					} 
				}
				setState(882);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(883);
				match(Comma);
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
	public static class ListSpaceSeparatedContext extends ParserRuleContext {
		public List<ListElementContext> listElement() {
			return getRuleContexts(ListElementContext.class);
		}
		public ListElementContext listElement(int i) {
			return getRuleContext(ListElementContext.class,i);
		}
		public ListSpaceSeparatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listSpaceSeparated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterListSpaceSeparated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitListSpaceSeparated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitListSpaceSeparated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListSpaceSeparatedContext listSpaceSeparated() throws RecognitionException {
		ListSpaceSeparatedContext _localctx = new ListSpaceSeparatedContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_listSpaceSeparated);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(887); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(886);
					listElement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(889); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,114,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListBracketedContext extends ParserRuleContext {
		public TerminalNode Lbrack() { return getToken(ScssParser.Lbrack, 0); }
		public TerminalNode Rbrack() { return getToken(ScssParser.Rbrack, 0); }
		public ListSpaceSeparatedContext listSpaceSeparated() {
			return getRuleContext(ListSpaceSeparatedContext.class,0);
		}
		public ListCommaSeparatedContext listCommaSeparated() {
			return getRuleContext(ListCommaSeparatedContext.class,0);
		}
		public ListBracketedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBracketed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterListBracketed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitListBracketed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitListBracketed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBracketedContext listBracketed() throws RecognitionException {
		ListBracketedContext _localctx = new ListBracketedContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_listBracketed);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			match(Lbrack);
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(892);
				listSpaceSeparated();
				}
				break;
			case 2:
				{
				setState(893);
				listCommaSeparated();
				}
				break;
			}
			setState(896);
			match(Rbrack);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListElementContext extends ParserRuleContext {
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public ListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListElementContext listElement() throws RecognitionException {
		ListElementContext _localctx = new ListElementContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_listElement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(898);
				match(Lparen);
				}
				break;
			}
			setState(905); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(901);
					value();
					setState(903);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(902);
						match(Comma);
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(907); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(909);
				match(Rparen);
				}
				break;
			}
			setState(913);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(912);
				match(Comma);
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
	public static class MapDeclarationContext extends ParserRuleContext {
		public TerminalNode Lparen() { return getToken(ScssParser.Lparen, 0); }
		public MapEntriesContext mapEntries() {
			return getRuleContext(MapEntriesContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public MapDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMapDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMapDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMapDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapDeclarationContext mapDeclaration() throws RecognitionException {
		MapDeclarationContext _localctx = new MapDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_mapDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(Lparen);
			setState(916);
			mapEntries();
			setState(917);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapEntriesContext extends ParserRuleContext {
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public MapEntriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntries; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMapEntries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMapEntries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMapEntries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntriesContext mapEntries() throws RecognitionException {
		MapEntriesContext _localctx = new MapEntriesContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_mapEntries);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(919);
			mapEntry();
			setState(924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(920);
					match(Comma);
					setState(921);
					mapEntry();
					}
					} 
				}
				setState(926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			}
			setState(928);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(927);
				match(Comma);
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
	public static class MapEntryContext extends ParserRuleContext {
		public MapKeyContext mapKey() {
			return getRuleContext(MapKeyContext.class,0);
		}
		public TerminalNode Colon() { return getToken(ScssParser.Colon, 0); }
		public MapValueContext mapValue() {
			return getRuleContext(MapValueContext.class,0);
		}
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMapEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMapEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_mapEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(930);
			mapKey();
			setState(931);
			match(Colon);
			setState(932);
			mapValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapKeyContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public MapDeclarationContext mapDeclaration() {
			return getRuleContext(MapDeclarationContext.class,0);
		}
		public MapKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMapKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMapKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMapKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapKeyContext mapKey() throws RecognitionException {
		MapKeyContext _localctx = new MapKeyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_mapKey);
		try {
			setState(937);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(934);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				listDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(936);
				mapDeclaration();
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
	public static class MapValueContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public MapDeclarationContext mapDeclaration() {
			return getRuleContext(MapDeclarationContext.class,0);
		}
		public MapValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMapValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMapValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMapValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapValueContext mapValue() throws RecognitionException {
		MapValueContext _localctx = new MapValueContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_mapValue);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				listDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(941);
				mapDeclaration();
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
	public static class IfDeclarationContext extends ParserRuleContext {
		public TerminalNode AtIf() { return getToken(ScssParser.AtIf, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIfDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIfDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitIfDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDeclarationContext ifDeclaration() throws RecognitionException {
		IfDeclarationContext _localctx = new IfDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ifDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(944);
			match(AtIf);
			setState(945);
			expression();
			setState(946);
			block();
			setState(950);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(947);
					elseIfStatement();
					}
					} 
				}
				setState(952);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			}
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AtElse) {
				{
				setState(953);
				elseStatement();
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
	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode AtElse() { return getToken(ScssParser.AtElse, 0); }
		public TerminalNode If() { return getToken(ScssParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			match(AtElse);
			setState(957);
			match(If);
			setState(958);
			expression();
			setState(959);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode AtElse() { return getToken(ScssParser.AtElse, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_elseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(AtElse);
			setState(962);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public TerminalNode AtFor() { return getToken(ScssParser.AtFor, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode From() { return getToken(ScssParser.From, 0); }
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public ThroughContext through() {
			return getRuleContext(ThroughContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode To() { return getToken(ScssParser.To, 0); }
		public TerminalNode Through() { return getToken(ScssParser.Through, 0); }
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(964);
			match(AtFor);
			setState(965);
			variableName();
			setState(966);
			match(From);
			setState(967);
			match(Number);
			setState(968);
			_la = _input.LA(1);
			if ( !(_la==To || _la==Through) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(969);
			through();
			setState(970);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThroughContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThroughContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_through; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterThrough(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitThrough(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitThrough(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThroughContext through() throws RecognitionException {
		ThroughContext _localctx = new ThroughContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_through);
		try {
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				match(Number);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(974);
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
	public static class WhileDeclarationContext extends ParserRuleContext {
		public TerminalNode AtWhile() { return getToken(ScssParser.AtWhile, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterWhileDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitWhileDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitWhileDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileDeclarationContext whileDeclaration() throws RecognitionException {
		WhileDeclarationContext _localctx = new WhileDeclarationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_whileDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			match(AtWhile);
			setState(978);
			expression();
			setState(979);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EachDeclarationContext extends ParserRuleContext {
		public TerminalNode AtEach() { return getToken(ScssParser.AtEach, 0); }
		public List<VariableNameContext> variableName() {
			return getRuleContexts(VariableNameContext.class);
		}
		public VariableNameContext variableName(int i) {
			return getRuleContext(VariableNameContext.class,i);
		}
		public TerminalNode In() { return getToken(ScssParser.In, 0); }
		public EachValueListContext eachValueList() {
			return getRuleContext(EachValueListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public EachDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterEachDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitEachDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitEachDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EachDeclarationContext eachDeclaration() throws RecognitionException {
		EachDeclarationContext _localctx = new EachDeclarationContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_eachDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(AtEach);
			setState(982);
			variableName();
			setState(987);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(983);
				match(Comma);
				setState(984);
				variableName();
				}
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(990);
			match(In);
			setState(991);
			eachValueList();
			setState(992);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EachValueListContext extends ParserRuleContext {
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public MapDeclarationContext mapDeclaration() {
			return getRuleContext(MapDeclarationContext.class,0);
		}
		public EachValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eachValueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterEachValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitEachValueList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitEachValueList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EachValueListContext eachValueList() throws RecognitionException {
		EachValueListContext _localctx = new EachValueListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_eachValueList);
		try {
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(994);
				listDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				mapDeclaration();
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
	public static class Var_Context extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ScssParser.Var, 0); }
		public TerminalNode Variable() { return getToken(ScssParser.Variable, 0); }
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public TerminalNode Comma() { return getToken(ScssParser.Comma, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterVar_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitVar_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitVar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 156, RULE_var_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(Var);
			setState(999);
			match(Variable);
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(1000);
				match(Comma);
				setState(1001);
				value();
				}
			}

			setState(1004);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcContext extends ParserRuleContext {
		public TerminalNode Calc() { return getToken(ScssParser.Calc, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(Calc);
			setState(1007);
			expression();
			setState(1008);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RotateContext extends ParserRuleContext {
		public TerminalNode Rotate() { return getToken(ScssParser.Rotate, 0); }
		public DegreeContext degree() {
			return getRuleContext(DegreeContext.class,0);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public RotateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rotate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterRotate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitRotate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitRotate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RotateContext rotate() throws RecognitionException {
		RotateContext _localctx = new RotateContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_rotate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1010);
			match(Rotate);
			setState(1011);
			degree();
			setState(1012);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RgbaContext extends ParserRuleContext {
		public TerminalNode Rgba() { return getToken(ScssParser.Rgba, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public List<TerminalNode> Comma() { return getTokens(ScssParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ScssParser.Comma, i);
		}
		public RgbaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rgba; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterRgba(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitRgba(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitRgba(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RgbaContext rgba() throws RecognitionException {
		RgbaContext _localctx = new RgbaContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rgba);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1014);
			match(Rgba);
			setState(1015);
			value();
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4775788543337332704L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 1044250671L) != 0)) {
				{
				{
				setState(1017);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1016);
					match(Comma);
					}
				}

				setState(1019);
				value();
				}
				}
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1025);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode Repeat() { return getToken(ScssParser.Repeat, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode Comma() { return getToken(ScssParser.Comma, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode Freq() { return getToken(ScssParser.Freq, 0); }
		public TerminalNode Rparen() { return getToken(ScssParser.Rparen, 0); }
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			match(Repeat);
			setState(1028);
			value();
			setState(1029);
			match(Comma);
			setState(1030);
			number();
			setState(1031);
			match(Freq);
			setState(1032);
			match(Rparen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public LengthContext length() {
			return getRuleContext(LengthContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DegreeContext degree() {
			return getRuleContext(DegreeContext.class,0);
		}
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_unit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1038);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1034);
				length();
				}
				break;
			case 2:
				{
				setState(1035);
				dimension();
				}
				break;
			case 3:
				{
				setState(1036);
				percentage();
				}
				break;
			case 4:
				{
				setState(1037);
				degree();
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
	public static class LengthContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public TerminalNode AbsLength() { return getToken(ScssParser.AbsLength, 0); }
		public TerminalNode FontRelative() { return getToken(ScssParser.FontRelative, 0); }
		public TerminalNode ViewportRelative() { return getToken(ScssParser.ViewportRelative, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public LengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_length; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LengthContext length() throws RecognitionException {
		LengthContext _localctx = new LengthContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_length);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1040);
				plusMinus();
				}
			}

			setState(1043);
			match(Number);
			setState(1044);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 896L) != 0)) ) {
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
	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public TerminalNode Time() { return getToken(ScssParser.Time, 0); }
		public TerminalNode Freq() { return getToken(ScssParser.Freq, 0); }
		public TerminalNode Resolution() { return getToken(ScssParser.Resolution, 0); }
		public TerminalNode Angle() { return getToken(ScssParser.Angle, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1046);
				plusMinus();
				}
			}

			setState(1049);
			match(Number);
			setState(1050);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
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
	public static class PercentageContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public TerminalNode Percentage() { return getToken(ScssParser.Percentage, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_percentage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1052);
				plusMinus();
				}
			}

			setState(1055);
			match(Number);
			setState(1056);
			match(Percentage);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DegreeContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public TerminalNode Angle() { return getToken(ScssParser.Angle, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public DegreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterDegree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitDegree(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitDegree(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DegreeContext degree() throws RecognitionException {
		DegreeContext _localctx = new DegreeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_degree);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1058);
				plusMinus();
				}
			}

			setState(1061);
			match(Number);
			setState(1062);
			match(Angle);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MeasurmentContext extends ParserRuleContext {
		public TerminalNode AbsLength() { return getToken(ScssParser.AbsLength, 0); }
		public TerminalNode FontRelative() { return getToken(ScssParser.FontRelative, 0); }
		public TerminalNode ViewportRelative() { return getToken(ScssParser.ViewportRelative, 0); }
		public TerminalNode Time() { return getToken(ScssParser.Time, 0); }
		public TerminalNode Freq() { return getToken(ScssParser.Freq, 0); }
		public TerminalNode Resolution() { return getToken(ScssParser.Resolution, 0); }
		public TerminalNode Angle() { return getToken(ScssParser.Angle, 0); }
		public TerminalNode Percentage() { return getToken(ScssParser.Percentage, 0); }
		public MeasurmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_measurment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterMeasurment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitMeasurment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitMeasurment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MeasurmentContext measurment() throws RecognitionException {
		MeasurmentContext _localctx = new MeasurmentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_measurment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1064);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32640L) != 0)) ) {
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
	public static class UriContext extends ParserRuleContext {
		public TerminalNode Uri() { return getToken(ScssParser.Uri, 0); }
		public UriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UriContext uri() throws RecognitionException {
		UriContext _localctx = new UriContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_uri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1066);
			match(Uri);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArglistContext extends ParserRuleContext {
		public List<TerminalNode> Dot() { return getTokens(ScssParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ScssParser.Dot, i);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_arglist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(Dot);
			setState(1069);
			match(Dot);
			setState(1070);
			match(Dot);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PlusMinusContext extends ParserRuleContext {
		public TerminalNode Plus() { return getToken(ScssParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ScssParser.Minus, 0); }
		public PlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusContext plusMinus() throws RecognitionException {
		PlusMinusContext _localctx = new PlusMinusContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_plusMinus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1072);
			_la = _input.LA(1);
			if ( !(_la==Plus || _la==Minus) ) {
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
	public static class HexcolorContext extends ParserRuleContext {
		public TerminalNode Hash() { return getToken(ScssParser.Hash, 0); }
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public HexcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterHexcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitHexcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitHexcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexcolorContext hexcolor() throws RecognitionException {
		HexcolorContext _localctx = new HexcolorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(Hash);
			setState(1075);
			color();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColorContext extends ParserRuleContext {
		public List<TerminalNode> Number() { return getTokens(ScssParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(ScssParser.Number, i);
		}
		public List<TerminalNode> Ident() { return getTokens(ScssParser.Ident); }
		public TerminalNode Ident(int i) {
			return getToken(ScssParser.Ident, i);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_color);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1078); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1077);
					_la = _input.LA(1);
					if ( !(_la==Number || _la==Ident) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1080); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode True() { return getToken(ScssParser.True, 0); }
		public TerminalNode False() { return getToken(ScssParser.False, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_la = _input.LA(1);
			if ( !(_la==True || _la==False) ) {
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode Number() { return getToken(ScssParser.Number, 0); }
		public PlusMinusContext plusMinus() {
			return getRuleContext(PlusMinusContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Plus || _la==Minus) {
				{
				setState(1084);
				plusMinus();
				}
			}

			setState(1087);
			match(Number);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(ScssParser.Ident, 0); }
		public TerminalNode VendorPrefix() { return getToken(ScssParser.VendorPrefix, 0); }
		public TerminalNode Minus() { return getToken(ScssParser.Minus, 0); }
		public TerminalNode From() { return getToken(ScssParser.From, 0); }
		public TerminalNode To() { return getToken(ScssParser.To, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScssParserListener ) ((ScssParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScssParserVisitor ) return ((ScssParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_identifier);
		int _la;
		try {
			setState(1095);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Minus:
			case VendorPrefix:
			case Ident:
				enterOuterAlt(_localctx, 1);
				{
				setState(1090);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Minus || _la==VendorPrefix) {
					{
					setState(1089);
					_la = _input.LA(1);
					if ( !(_la==Minus || _la==VendorPrefix) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1092);
				match(Ident);
				}
				break;
			case From:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				match(From);
				}
				break;
			case To:
				enterOuterAlt(_localctx, 3);
				{
				setState(1094);
				match(To);
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
		"\u0004\u0001^\u044a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0001\u0000\u0005\u0000\u00c4\b\u0000\n\u0000\f"+
		"\u0000\u00c7\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u00e0\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002\u00e5\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ea"+
		"\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00ef\b\u0002"+
		"\u0001\u0002\u0003\u0002\u00f2\b\u0002\u0001\u0002\u0003\u0002\u00f5\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00f9\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0003\u0003\u00fd\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004\u0102\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u010d"+
		"\b\u0006\u0001\u0006\u0003\u0006\u0110\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007\u0116\b\u0007\u000b\u0007\f\u0007"+
		"\u0117\u0001\u0007\u0004\u0007\u011b\b\u0007\u000b\u0007\f\u0007\u011c"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u0121\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u012b\b\b\u0001\b\u0001"+
		"\b\u0003\b\u012f\b\b\u0001\b\u0003\b\u0132\b\b\u0001\b\u0001\b\u0001\b"+
		"\u0003\b\u0137\b\b\u0001\b\u0003\b\u013a\b\b\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u013f\b\t\u000b\t\f\t\u0140\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u0147\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u014d\b\f\u0001"+
		"\f\u0003\f\u0150\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0158\b\f\u0001\f\u0003\f\u015b\b\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0164\b\u000e\n\u000e"+
		"\f\u000e\u0167\t\u000e\u0003\u000e\u0169\b\u000e\u0001\u000f\u0003\u000f"+
		"\u016c\b\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0170\b\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0174\b\u000f\n\u000f\f\u000f\u0177\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u017c\b\u000f\n\u000f"+
		"\f\u000f\u017f\t\u000f\u0003\u000f\u0181\b\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u0187\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0192\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u019b\b\u0012"+
		"\u0001\u0012\u0003\u0012\u019e\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u01a3\b\u0013\n\u0013\f\u0013\u01a6\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u01ac\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u01b2\b\u0015\n\u0015\f\u0015"+
		"\u01b5\t\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b9\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u01c0"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01c4\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01cc\b\u0017\u0001\u0017\u0003\u0017\u01cf\b\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d5\b\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u01da\b\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0004"+
		"\u0019\u01e4\b\u0019\u000b\u0019\f\u0019\u01e5\u0001\u0019\u0003\u0019"+
		"\u01e9\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01fa\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u0203\b\u001e\n\u001e\f\u001e\u0206\t\u001e\u0001"+
		"\u001e\u0003\u001e\u0209\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u0210\b\u001f\n\u001f\f\u001f\u0213\t\u001f"+
		"\u0001 \u0003 \u0216\b \u0001 \u0001 \u0001 \u0001 \u0005 \u021c\b \n"+
		" \f \u021f\t \u0001!\u0001!\u0001\"\u0001\"\u0003\"\u0225\b\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u022f"+
		"\b\"\u0001\"\u0005\"\u0232\b\"\n\"\f\"\u0235\t\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0240\b\"\u0001"+
		"\"\u0004\"\u0243\b\"\u000b\"\f\"\u0244\u0003\"\u0247\b\"\u0001#\u0001"+
		"#\u0001#\u0001$\u0003$\u024d\b$\u0001$\u0001$\u0003$\u0251\b$\u0001$\u0001"+
		"$\u0003$\u0255\b$\u0001%\u0001%\u0003%\u0259\b%\u0001%\u0001%\u0001&\u0003"+
		"&\u025e\b&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0004\'\u0266"+
		"\b\'\u000b\'\f\'\u0267\u0001(\u0003(\u026b\b(\u0001(\u0001(\u0001(\u0003"+
		"(\u0270\b(\u0001(\u0001(\u0001(\u0003(\u0275\b(\u0001(\u0001(\u0003(\u0279"+
		"\b(\u0001)\u0001)\u0001*\u0001*\u0003*\u027f\b*\u0001*\u0001*\u0001*\u0001"+
		"*\u0003*\u0285\b*\u0003*\u0287\b*\u0001*\u0001*\u0001+\u0001+\u0003+\u028d"+
		"\b+\u0001+\u0001+\u0001+\u0003+\u0292\b+\u0001,\u0001,\u0001,\u0004,\u0297"+
		"\b,\u000b,\f,\u0298\u0001,\u0001,\u0001-\u0001-\u0001-\u0003-\u02a0\b"+
		"-\u0001-\u0003-\u02a3\b-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0003/\u02af\b/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u00030\u02bd\b0\u0001"+
		"0\u00010\u00010\u00010\u00030\u02c3\b0\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u0001"+
		"1\u00011\u00011\u00011\u00011\u00011\u00011\u00031\u02da\b1\u00012\u0001"+
		"2\u00032\u02de\b2\u00012\u00032\u02e1\b2\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u02e8\b2\u00012\u00012\u00013\u00033\u02ed\b3\u00013\u00013\u0005"+
		"3\u02f1\b3\n3\f3\u02f4\t3\u00014\u00014\u00014\u00014\u00034\u02fa\b4"+
		"\u00014\u00034\u02fd\b4\u00014\u00034\u0300\b4\u00015\u00055\u0303\b5"+
		"\n5\f5\u0306\t5\u00015\u00035\u0309\b5\u00016\u00016\u00016\u00016\u0005"+
		"6\u030f\b6\n6\f6\u0312\t6\u00016\u00036\u0315\b6\u00017\u00017\u00017"+
		"\u00017\u00037\u031b\b7\u00018\u00038\u031e\b8\u00018\u00018\u00018\u0001"+
		"8\u00018\u00019\u00039\u0326\b9\u00019\u00019\u00019\u00039\u032b\b9\u0001"+
		"9\u00019\u00059\u032f\b9\n9\f9\u0332\t9\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0003:\u0345\b:\u0001:\u0001:\u0003:\u0349\b:\u0001:\u0001"+
		":\u0001:\u0003:\u034e\b:\u0001;\u0001;\u0001;\u0001;\u0003;\u0354\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u035c\b;\u0001;\u0003;\u035f"+
		"\b;\u0001<\u0001<\u0001<\u0003<\u0364\b<\u0001<\u0001<\u0001<\u0001<\u0003"+
		"<\u036a\b<\u0001=\u0001=\u0001=\u0005=\u036f\b=\n=\f=\u0372\t=\u0001="+
		"\u0003=\u0375\b=\u0001>\u0004>\u0378\b>\u000b>\f>\u0379\u0001?\u0001?"+
		"\u0001?\u0003?\u037f\b?\u0001?\u0001?\u0001@\u0003@\u0384\b@\u0001@\u0001"+
		"@\u0003@\u0388\b@\u0004@\u038a\b@\u000b@\f@\u038b\u0001@\u0003@\u038f"+
		"\b@\u0001@\u0003@\u0392\b@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0005B\u039b\bB\nB\fB\u039e\tB\u0001B\u0003B\u03a1\bB\u0001C\u0001C"+
		"\u0001C\u0001C\u0001D\u0001D\u0001D\u0003D\u03aa\bD\u0001E\u0001E\u0001"+
		"E\u0003E\u03af\bE\u0001F\u0001F\u0001F\u0001F\u0005F\u03b5\bF\nF\fF\u03b8"+
		"\tF\u0001F\u0003F\u03bb\bF\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001"+
		"H\u0001H\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"J\u0001J\u0001J\u0003J\u03d0\bJ\u0001K\u0001K\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0001L\u0005L\u03da\bL\nL\fL\u03dd\tL\u0001L\u0001L\u0001L\u0001"+
		"L\u0001M\u0001M\u0003M\u03e5\bM\u0001N\u0001N\u0001N\u0001N\u0003N\u03eb"+
		"\bN\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001"+
		"P\u0001Q\u0001Q\u0001Q\u0003Q\u03fa\bQ\u0001Q\u0005Q\u03fd\bQ\nQ\fQ\u0400"+
		"\tQ\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"S\u0001S\u0001S\u0001S\u0003S\u040f\bS\u0001T\u0003T\u0412\bT\u0001T\u0001"+
		"T\u0001T\u0001U\u0003U\u0418\bU\u0001U\u0001U\u0001U\u0001V\u0003V\u041e"+
		"\bV\u0001V\u0001V\u0001V\u0001W\u0003W\u0424\bW\u0001W\u0001W\u0001W\u0001"+
		"X\u0001X\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0001\\\u0001]\u0004]\u0437\b]\u000b]\f]\u0438\u0001^\u0001"+
		"^\u0001_\u0003_\u043e\b_\u0001_\u0001_\u0001`\u0003`\u0443\b`\u0001`\u0001"+
		"`\u0001`\u0003`\u0448\b`\u0001`\u0000\u0000a\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u0000\f\u0001\u000001\u0001\u0000()\u0004\u0000"+
		"\u0004\u0004<<DDJJ\u0003\u0000HHLMWY\u0001\u0000&\'\u0001\u0000\u0007"+
		"\t\u0001\u0000\n\r\u0001\u0000\u0007\u000e\u0002\u0000DDFF\u0002\u0000"+
		"\\\\^^\u0001\u0000BC\u0002\u0000FFZZ\u04ed\u0000\u00c5\u0001\u0000\u0000"+
		"\u0000\u0002\u00df\u0001\u0000\u0000\u0000\u0004\u00f8\u0001\u0000\u0000"+
		"\u0000\u0006\u00fc\u0001\u0000\u0000\u0000\b\u00fe\u0001\u0000\u0000\u0000"+
		"\n\u0103\u0001\u0000\u0000\u0000\f\u0108\u0001\u0000\u0000\u0000\u000e"+
		"\u0120\u0001\u0000\u0000\u0000\u0010\u0139\u0001\u0000\u0000\u0000\u0012"+
		"\u013e\u0001\u0000\u0000\u0000\u0014\u0142\u0001\u0000\u0000\u0000\u0016"+
		"\u0148\u0001\u0000\u0000\u0000\u0018\u0157\u0001\u0000\u0000\u0000\u001a"+
		"\u015c\u0001\u0000\u0000\u0000\u001c\u0168\u0001\u0000\u0000\u0000\u001e"+
		"\u0180\u0001\u0000\u0000\u0000 \u0182\u0001\u0000\u0000\u0000\"\u018a"+
		"\u0001\u0000\u0000\u0000$\u0195\u0001\u0000\u0000\u0000&\u019f\u0001\u0000"+
		"\u0000\u0000(\u01a9\u0001\u0000\u0000\u0000*\u01b8\u0001\u0000\u0000\u0000"+
		",\u01ba\u0001\u0000\u0000\u0000.\u01bd\u0001\u0000\u0000\u00000\u01d0"+
		"\u0001\u0000\u0000\u00002\u01d6\u0001\u0000\u0000\u00004\u01ea\u0001\u0000"+
		"\u0000\u00006\u01ee\u0001\u0000\u0000\u00008\u01f2\u0001\u0000\u0000\u0000"+
		":\u01fd\u0001\u0000\u0000\u0000<\u0200\u0001\u0000\u0000\u0000>\u020c"+
		"\u0001\u0000\u0000\u0000@\u0215\u0001\u0000\u0000\u0000B\u0220\u0001\u0000"+
		"\u0000\u0000D\u0246\u0001\u0000\u0000\u0000F\u0248\u0001\u0000\u0000\u0000"+
		"H\u024c\u0001\u0000\u0000\u0000J\u0258\u0001\u0000\u0000\u0000L\u025d"+
		"\u0001\u0000\u0000\u0000N\u0261\u0001\u0000\u0000\u0000P\u026a\u0001\u0000"+
		"\u0000\u0000R\u027a\u0001\u0000\u0000\u0000T\u027c\u0001\u0000\u0000\u0000"+
		"V\u028a\u0001\u0000\u0000\u0000X\u0293\u0001\u0000\u0000\u0000Z\u029f"+
		"\u0001\u0000\u0000\u0000\\\u02a4\u0001\u0000\u0000\u0000^\u02ae\u0001"+
		"\u0000\u0000\u0000`\u02c2\u0001\u0000\u0000\u0000b\u02d9\u0001\u0000\u0000"+
		"\u0000d\u02db\u0001\u0000\u0000\u0000f\u02ec\u0001\u0000\u0000\u0000h"+
		"\u02f9\u0001\u0000\u0000\u0000j\u0304\u0001\u0000\u0000\u0000l\u030a\u0001"+
		"\u0000\u0000\u0000n\u031a\u0001\u0000\u0000\u0000p\u031d\u0001\u0000\u0000"+
		"\u0000r\u0325\u0001\u0000\u0000\u0000t\u034d\u0001\u0000\u0000\u0000v"+
		"\u034f\u0001\u0000\u0000\u0000x\u0369\u0001\u0000\u0000\u0000z\u036b\u0001"+
		"\u0000\u0000\u0000|\u0377\u0001\u0000\u0000\u0000~\u037b\u0001\u0000\u0000"+
		"\u0000\u0080\u0383\u0001\u0000\u0000\u0000\u0082\u0393\u0001\u0000\u0000"+
		"\u0000\u0084\u0397\u0001\u0000\u0000\u0000\u0086\u03a2\u0001\u0000\u0000"+
		"\u0000\u0088\u03a9\u0001\u0000\u0000\u0000\u008a\u03ae\u0001\u0000\u0000"+
		"\u0000\u008c\u03b0\u0001\u0000\u0000\u0000\u008e\u03bc\u0001\u0000\u0000"+
		"\u0000\u0090\u03c1\u0001\u0000\u0000\u0000\u0092\u03c4\u0001\u0000\u0000"+
		"\u0000\u0094\u03cf\u0001\u0000\u0000\u0000\u0096\u03d1\u0001\u0000\u0000"+
		"\u0000\u0098\u03d5\u0001\u0000\u0000\u0000\u009a\u03e4\u0001\u0000\u0000"+
		"\u0000\u009c\u03e6\u0001\u0000\u0000\u0000\u009e\u03ee\u0001\u0000\u0000"+
		"\u0000\u00a0\u03f2\u0001\u0000\u0000\u0000\u00a2\u03f6\u0001\u0000\u0000"+
		"\u0000\u00a4\u0403\u0001\u0000\u0000\u0000\u00a6\u040e\u0001\u0000\u0000"+
		"\u0000\u00a8\u0411\u0001\u0000\u0000\u0000\u00aa\u0417\u0001\u0000\u0000"+
		"\u0000\u00ac\u041d\u0001\u0000\u0000\u0000\u00ae\u0423\u0001\u0000\u0000"+
		"\u0000\u00b0\u0428\u0001\u0000\u0000\u0000\u00b2\u042a\u0001\u0000\u0000"+
		"\u0000\u00b4\u042c\u0001\u0000\u0000\u0000\u00b6\u0430\u0001\u0000\u0000"+
		"\u0000\u00b8\u0432\u0001\u0000\u0000\u0000\u00ba\u0436\u0001\u0000\u0000"+
		"\u0000\u00bc\u043a\u0001\u0000\u0000\u0000\u00be\u043d\u0001\u0000\u0000"+
		"\u0000\u00c0\u0447\u0001\u0000\u0000\u0000\u00c2\u00c4\u0003\u0002\u0001"+
		"\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005\u0000\u0000\u0001\u00c9\u0001\u0001\u0000\u0000"+
		"\u0000\u00ca\u00e0\u0003\u0004\u0002\u0000\u00cb\u00e0\u0003\f\u0006\u0000"+
		"\u00cc\u00e0\u0003\u0014\n\u0000\u00cd\u00e0\u00030\u0018\u0000\u00ce"+
		"\u00e0\u0003\u001a\r\u0000\u00cf\u00e0\u0003\"\u0011\u0000\u00d0\u00e0"+
		"\u0003$\u0012\u0000\u00d1\u00e0\u0003d2\u0000\u00d2\u00e0\u0003\u008c"+
		"F\u0000\u00d3\u00e0\u0003\u0092I\u0000\u00d4\u00e0\u0003\u0096K\u0000"+
		"\u00d5\u00e0\u0003\u0098L\u0000\u00d6\u00e0\u0003&\u0013\u0000\u00d7\u00e0"+
		"\u0003(\u0014\u0000\u00d8\u00e0\u0003.\u0017\u0000\u00d9\u00e0\u00032"+
		"\u0019\u0000\u00da\u00e0\u00034\u001a\u0000\u00db\u00e0\u00036\u001b\u0000"+
		"\u00dc\u00e0\u0003:\u001d\u0000\u00dd\u00e0\u00038\u001c\u0000\u00de\u00e0"+
		"\u0003,\u0016\u0000\u00df\u00ca\u0001\u0000\u0000\u0000\u00df\u00cb\u0001"+
		"\u0000\u0000\u0000\u00df\u00cc\u0001\u0000\u0000\u0000\u00df\u00cd\u0001"+
		"\u0000\u0000\u0000\u00df\u00ce\u0001\u0000\u0000\u0000\u00df\u00cf\u0001"+
		"\u0000\u0000\u0000\u00df\u00d0\u0001\u0000\u0000\u0000\u00df\u00d1\u0001"+
		"\u0000\u0000\u0000\u00df\u00d2\u0001\u0000\u0000\u0000\u00df\u00d3\u0001"+
		"\u0000\u0000\u0000\u00df\u00d4\u0001\u0000\u0000\u0000\u00df\u00d5\u0001"+
		"\u0000\u0000\u0000\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00d7\u0001"+
		"\u0000\u0000\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00df\u00d9\u0001"+
		"\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000\u00df\u00db\u0001"+
		"\u0000\u0000\u0000\u00df\u00dc\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00de\u0001\u0000\u0000\u0000\u00e0\u0003\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\u000f\u0000\u0000\u00e2\u00e4\u0003"+
		"\u0006\u0003\u0000\u00e3\u00e5\u0005;\u0000\u0000\u00e4\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00f9\u0001\u0000"+
		"\u0000\u0000\u00e6\u00e7\u0005\u0012\u0000\u0000\u00e7\u00e9\u0003\u0006"+
		"\u0003\u0000\u00e8\u00ea\u0005;\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00f9\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ec\u0005\u0011\u0000\u0000\u00ec\u00ee\u0003\u0006\u0003"+
		"\u0000\u00ed\u00ef\u0003\b\u0004\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\u0003\n\u0005\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f5\u0005;\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f9\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0017\u0000\u0000\u00f7\u00f9\u0003\u0006\u0003\u0000\u00f8\u00e1"+
		"\u0001\u0000\u0000\u0000\u00f8\u00e6\u0001\u0000\u0000\u0000\u00f8\u00eb"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u0005"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fd\u0003\u00b2Y\u0000\u00fb\u00fd\u0005"+
		"]\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fd\u0007\u0001\u0000\u0000\u0000\u00fe\u0101\u0005,\u0000"+
		"\u0000\u00ff\u0102\u0005G\u0000\u0000\u0100\u0102\u0003\u00c0`\u0000\u0101"+
		"\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000\u0102"+
		"\t\u0001\u0000\u0000\u0000\u0103\u0104\u0005-\u0000\u0000\u0104\u0105"+
		"\u00052\u0000\u0000\u0105\u0106\u0003f3\u0000\u0106\u0107\u00053\u0000"+
		"\u0000\u0107\u000b\u0001\u0000\u0000\u0000\u0108\u0109\u0003\u0010\b\u0000"+
		"\u0109\u010a\u0005:\u0000\u0000\u010a\u010c\u0003\u000e\u0007\u0000\u010b"+
		"\u010d\u0003\u0016\u000b\u0000\u010c\u010b\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0001\u0000\u0000\u0000\u010d\u010f\u0001\u0000\u0000\u0000\u010e"+
		"\u0110\u0005;\u0000\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0001\u0000\u0000\u0000\u0110\r\u0001\u0000\u0000\u0000\u0111\u0121\u0003"+
		"b1\u0000\u0112\u0121\u0003d2\u0000\u0113\u0121\u0003p8\u0000\u0114\u0116"+
		"\u0003\u0082A\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0121\u0001\u0000\u0000\u0000\u0119\u011b\u0003"+
		"x<\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u0121\u0001\u0000\u0000\u0000\u011e\u0121\u0003\u0010\b\u0000"+
		"\u011f\u0121\u0003\u00c0`\u0000\u0120\u0111\u0001\u0000\u0000\u0000\u0120"+
		"\u0112\u0001\u0000\u0000\u0000\u0120\u0113\u0001\u0000\u0000\u0000\u0120"+
		"\u0115\u0001\u0000\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121"+
		"\u000f\u0001\u0000\u0000\u0000\u0122\u0123\u0005F\u0000\u0000\u0123\u0124"+
		"\u0005F\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u012b\u0005"+
		">\u0000\u0000\u0126\u0127\u0003\u00b6[\u0000\u0127\u0128\u0005>\u0000"+
		"\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u012b\u0005>\u0000\u0000"+
		"\u012a\u0122\u0001\u0000\u0000\u0000\u012a\u0126\u0001\u0000\u0000\u0000"+
		"\u012a\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u013a\u0003\u00c0`\u0000\u012d\u012f\u0003\u00b6[\u0000\u012e\u012d"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0131"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u0003\u0012\t\u0000\u0131\u0130\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0136\u0005>\u0000\u0000\u0134\u0137\u0003\u00c0"+
		"`\u0000\u0135\u0137\u0003\u00b0X\u0000\u0136\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0135\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000"+
		"\u0138\u013a\u0005[\u0000\u0000\u0139\u012a\u0001\u0000\u0000\u0000\u0139"+
		"\u012e\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a"+
		"\u0011\u0001\u0000\u0000\u0000\u013b\u013c\u0003\u00c0`\u0000\u013c\u013d"+
		"\u00058\u0000\u0000\u013d\u013f\u0001\u0000\u0000\u0000\u013e\u013b\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u013e\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0013\u0001"+
		"\u0000\u0000\u0000\u0142\u0143\u0003\u00c0`\u0000\u0143\u0144\u0005:\u0000"+
		"\u0000\u0144\u0146\u0003\u0018\f\u0000\u0145\u0147\u0005;\u0000\u0000"+
		"\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000"+
		"\u0147\u0015\u0001\u0000\u0000\u0000\u0148\u0149\u0007\u0000\u0000\u0000"+
		"\u0149\u0017\u0001\u0000\u0000\u0000\u014a\u0158\u0003b1\u0000\u014b\u014d"+
		"\u0003b1\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000"+
		"\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u0150\u0003\u0016"+
		"\u000b\u0000\u014f\u014e\u0001\u0000\u0000\u0000\u014f\u0150\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000\u0151\u0158\u0003<\u001e"+
		"\u0000\u0152\u0158\u0003\u0010\b\u0000\u0153\u0158\u0003|>\u0000\u0154"+
		"\u0158\u0003z=\u0000\u0155\u0158\u0003r9\u0000\u0156\u0158\u0003p8\u0000"+
		"\u0157\u014a\u0001\u0000\u0000\u0000\u0157\u014c\u0001\u0000\u0000\u0000"+
		"\u0157\u0152\u0001\u0000\u0000\u0000\u0157\u0153\u0001\u0000\u0000\u0000"+
		"\u0157\u0154\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0157\u0156\u0001\u0000\u0000\u0000\u0158\u015a\u0001\u0000\u0000\u0000"+
		"\u0159\u015b\u0003\u0016\u000b\u0000\u015a\u0159\u0001\u0000\u0000\u0000"+
		"\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0019\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0005\u001b\u0000\u0000\u015d\u015e\u0003\u001c\u000e\u0000"+
		"\u015e\u015f\u0003<\u001e\u0000\u015f\u001b\u0001\u0000\u0000\u0000\u0160"+
		"\u0165\u0003\u001e\u000f\u0000\u0161\u0162\u00059\u0000\u0000\u0162\u0164"+
		"\u0003\u001e\u000f\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u0160\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0001\u0000\u0000\u0000\u0169\u001d\u0001\u0000\u0000\u0000\u016a\u016c"+
		"\u0007\u0001\u0000\u0000\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c"+
		"\u0001\u0000\u0000\u0000\u016c\u016f\u0001\u0000\u0000\u0000\u016d\u0170"+
		"\u0003\u00c0`\u0000\u016e\u0170\u0003b1\u0000\u016f\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0175\u0001\u0000"+
		"\u0000\u0000\u0171\u0172\u0005*\u0000\u0000\u0172\u0174\u0003 \u0010\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000"+
		"\u0175\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0181\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0178\u017d\u0003 \u0010\u0000\u0179\u017a\u0005*\u0000\u0000\u017a\u017c"+
		"\u0003 \u0010\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017f\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u0180\u016b\u0001\u0000\u0000\u0000\u0180\u0178\u0001"+
		"\u0000\u0000\u0000\u0181\u001f\u0001\u0000\u0000\u0000\u0182\u0183\u0005"+
		"2\u0000\u0000\u0183\u0186\u0003\u00c0`\u0000\u0184\u0185\u0005:\u0000"+
		"\u0000\u0185\u0187\u0003b1\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188"+
		"\u0189\u00053\u0000\u0000\u0189!\u0001\u0000\u0000\u0000\u018a\u0191\u0005"+
		"\u0014\u0000\u0000\u018b\u0192\u0003\u00c0`\u0000\u018c\u018d\u0003\u00c0"+
		"`\u0000\u018d\u018e\u00052\u0000\u0000\u018e\u018f\u0003f3\u0000\u018f"+
		"\u0190\u00053\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018b"+
		"\u0001\u0000\u0000\u0000\u0191\u018c\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0003<\u001e\u0000\u0194#\u0001\u0000"+
		"\u0000\u0000\u0195\u019a\u0005\u0018\u0000\u0000\u0196\u0197\u00052\u0000"+
		"\u0000\u0197\u0198\u0003f3\u0000\u0198\u0199\u00053\u0000\u0000\u0199"+
		"\u019b\u0001\u0000\u0000\u0000\u019a\u0196\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u019d\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0005;\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e%\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"\u0016\u0000\u0000\u01a0\u01a4\u00056\u0000\u0000\u01a1\u01a3\u0003\u0002"+
		"\u0001\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u00057\u0000\u0000\u01a8\'\u0001\u0000\u0000"+
		"\u0000\u01a9\u01ab\u0005\u0019\u0000\u0000\u01aa\u01ac\u0003\u00c0`\u0000"+
		"\u01ab\u01aa\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000"+
		"\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad\u01ae\u0003*\u0015\u0000\u01ae"+
		")\u0001\u0000\u0000\u0000\u01af\u01b3\u00056\u0000\u0000\u01b0\u01b2\u0003"+
		",\u0016\u0000\u01b1\u01b0\u0001\u0000\u0000\u0000\u01b2\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b6\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b9\u00057\u0000\u0000\u01b7\u01b9\u0003<\u001e\u0000"+
		"\u01b8\u01af\u0001\u0000\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000"+
		"\u01b9+\u0001\u0000\u0000\u0000\u01ba\u01bb\u0003\u00acV\u0000\u01bb\u01bc"+
		"\u0003<\u001e\u0000\u01bc-\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005\u0010"+
		"\u0000\u0000\u01be\u01c0\u0003\u0012\t\u0000\u01bf\u01be\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000"+
		"\u0000\u01c1\u01c4\u0003\u00c0`\u0000\u01c2\u01c4\u0003p8\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4"+
		"\u01cb\u0001\u0000\u0000\u0000\u01c5\u01cc\u0005;\u0000\u0000\u01c6\u01c7"+
		"\u0005+\u0000\u0000\u01c7\u01c8\u00052\u0000\u0000\u01c8\u01c9\u0003f"+
		"3\u0000\u01c9\u01ca\u00053\u0000\u0000\u01ca\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cb\u01c5\u0001\u0000\u0000\u0000\u01cb\u01c6\u0001\u0000\u0000\u0000"+
		"\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000\u0000\u0000"+
		"\u01cd\u01cf\u0003<\u001e\u0000\u01ce\u01cd\u0001\u0000\u0000\u0000\u01ce"+
		"\u01cf\u0001\u0000\u0000\u0000\u01cf/\u0001\u0000\u0000\u0000\u01d0\u01d1"+
		"\u0003P(\u0000\u01d1\u01d2\u0005:\u0000\u0000\u01d2\u01d4\u0003\u0018"+
		"\f\u0000\u01d3\u01d5\u0005;\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d51\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d9\u0005\u001c\u0000\u0000\u01d7\u01da\u0005\u000e\u0000\u0000"+
		"\u01d8\u01da\u0003R)\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01e3"+
		"\u0001\u0000\u0000\u0000\u01db\u01e4\u0003F#\u0000\u01dc\u01e4\u0003H"+
		"$\u0000\u01dd\u01e4\u0003L&\u0000\u01de\u01e4\u0003N\'\u0000\u01df\u01e4"+
		"\u0003T*\u0000\u01e0\u01e4\u0003V+\u0000\u01e1\u01e4\u0003P(\u0000\u01e2"+
		"\u01e4\u0003R)\u0000\u01e3\u01db\u0001\u0000\u0000\u0000\u01e3\u01dc\u0001"+
		"\u0000\u0000\u0000\u01e3\u01dd\u0001\u0000\u0000\u0000\u01e3\u01de\u0001"+
		"\u0000\u0000\u0000\u01e3\u01df\u0001\u0000\u0000\u0000\u01e3\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e9\u0005;\u0000\u0000\u01e8\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e93\u0001\u0000\u0000"+
		"\u0000\u01ea\u01eb\u0005\u001d\u0000\u0000\u01eb\u01ec\u0005]\u0000\u0000"+
		"\u01ec\u01ed\u0005;\u0000\u0000\u01ed5\u0001\u0000\u0000\u0000\u01ee\u01ef"+
		"\u0005\u001e\u0000\u0000\u01ef\u01f0\u0005]\u0000\u0000\u01f0\u01f1\u0005"+
		";\u0000\u0000\u01f17\u0001\u0000\u0000\u0000\u01f2\u01f9\u0005?\u0000"+
		"\u0000\u01f3\u01f4\u0003\u00c0`\u0000\u01f4\u01f5\u00052\u0000\u0000\u01f5"+
		"\u01f6\u0003f3\u0000\u01f6\u01f7\u00053\u0000\u0000\u01f7\u01fa\u0001"+
		"\u0000\u0000\u0000\u01f8\u01fa\u0003\u00c0`\u0000\u01f9\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0003<\u001e\u0000\u01fc9\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0003>\u001f\u0000\u01fe\u01ff\u0003<\u001e\u0000\u01ff;"+
		"\u0001\u0000\u0000\u0000\u0200\u0204\u00056\u0000\u0000\u0201\u0203\u0003"+
		"\u0002\u0001\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0203\u0206\u0001"+
		"\u0000\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0204\u0205\u0001"+
		"\u0000\u0000\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001"+
		"\u0000\u0000\u0000\u0207\u0209\u0003l6\u0000\u0208\u0207\u0001\u0000\u0000"+
		"\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209\u020a\u0001\u0000\u0000"+
		"\u0000\u020a\u020b\u00057\u0000\u0000\u020b=\u0001\u0000\u0000\u0000\u020c"+
		"\u0211\u0003@ \u0000\u020d\u020e\u00059\u0000\u0000\u020e\u0210\u0003"+
		"@ \u0000\u020f\u020d\u0001\u0000\u0000\u0000\u0210\u0213\u0001\u0000\u0000"+
		"\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000"+
		"\u0000\u0212?\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000\u0000\u0000"+
		"\u0214\u0216\u0003B!\u0000\u0215\u0214\u0001\u0000\u0000\u0000\u0215\u0216"+
		"\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u021d"+
		"\u0003D\"\u0000\u0218\u0219\u0003B!\u0000\u0219\u021a\u0003D\"\u0000\u021a"+
		"\u021c\u0001\u0000\u0000\u0000\u021b\u0218\u0001\u0000\u0000\u0000\u021c"+
		"\u021f\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021d"+
		"\u021e\u0001\u0000\u0000\u0000\u021eA\u0001\u0000\u0000\u0000\u021f\u021d"+
		"\u0001\u0000\u0000\u0000\u0220\u0221\u0007\u0002\u0000\u0000\u0221C\u0001"+
		"\u0000\u0000\u0000\u0222\u0225\u0003H$\u0000\u0223\u0225\u0003L&\u0000"+
		"\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000"+
		"\u0225\u0233\u0001\u0000\u0000\u0000\u0226\u0232\u0003F#\u0000\u0227\u0232"+
		"\u0003N\'\u0000\u0228\u0232\u0003T*\u0000\u0229\u0232\u0003V+\u0000\u022a"+
		"\u0232\u0003\\.\u0000\u022b\u022e\u0003P(\u0000\u022c\u022f\u0003\u0010"+
		"\b\u0000\u022d\u022f\u0005\u000e\u0000\u0000\u022e\u022c\u0001\u0000\u0000"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000"+
		"\u0000\u022f\u0232\u0001\u0000\u0000\u0000\u0230\u0232\u0003R)\u0000\u0231"+
		"\u0226\u0001\u0000\u0000\u0000\u0231\u0227\u0001\u0000\u0000\u0000\u0231"+
		"\u0228\u0001\u0000\u0000\u0000\u0231\u0229\u0001\u0000\u0000\u0000\u0231"+
		"\u022a\u0001\u0000\u0000\u0000\u0231\u022b\u0001\u0000\u0000\u0000\u0231"+
		"\u0230\u0001\u0000\u0000\u0000\u0232\u0235\u0001\u0000\u0000\u0000\u0233"+
		"\u0231\u0001\u0000\u0000\u0000\u0233\u0234\u0001\u0000\u0000\u0000\u0234"+
		"\u0247\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236"+
		"\u0243\u0003H$\u0000\u0237\u0243\u0003F#\u0000\u0238\u0243\u0003N\'\u0000"+
		"\u0239\u0243\u0003T*\u0000\u023a\u0243\u0003V+\u0000\u023b\u0243\u0003"+
		"\\.\u0000\u023c\u023f\u0003P(\u0000\u023d\u0240\u0003\u0010\b\u0000\u023e"+
		"\u0240\u0005\u000e\u0000\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f"+
		"\u023e\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240"+
		"\u0243\u0001\u0000\u0000\u0000\u0241\u0243\u0003R)\u0000\u0242\u0236\u0001"+
		"\u0000\u0000\u0000\u0242\u0237\u0001\u0000\u0000\u0000\u0242\u0238\u0001"+
		"\u0000\u0000\u0000\u0242\u0239\u0001\u0000\u0000\u0000\u0242\u023a\u0001"+
		"\u0000\u0000\u0000\u0242\u023b\u0001\u0000\u0000\u0000\u0242\u023c\u0001"+
		"\u0000\u0000\u0000\u0242\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001"+
		"\u0000\u0000\u0000\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0224\u0001"+
		"\u0000\u0000\u0000\u0246\u0242\u0001\u0000\u0000\u0000\u0247E\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0005A\u0000\u0000\u0249\u024a\u0003\u00c0`\u0000"+
		"\u024aG\u0001\u0000\u0000\u0000\u024b\u024d\u0003J%\u0000\u024c\u024b"+
		"\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u0250"+
		"\u0001\u0000\u0000\u0000\u024e\u0251\u0005\u000e\u0000\u0000\u024f\u0251"+
		"\u0003R)\u0000\u0250\u024e\u0001\u0000\u0000\u0000\u0250\u024f\u0001\u0000"+
		"\u0000\u0000\u0250\u0251\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000"+
		"\u0000\u0000\u0252\u0255\u0003\u00c0`\u0000\u0253\u0255\u0003\u0010\b"+
		"\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0254\u0253\u0001\u0000\u0000"+
		"\u0000\u0255I\u0001\u0000\u0000\u0000\u0256\u0259\u0003\u00c0`\u0000\u0257"+
		"\u0259\u0005G\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000\u0258\u0257"+
		"\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0001\u0000\u0000\u0000\u025a\u025b\u0005N\u0000\u0000\u025bK\u0001\u0000"+
		"\u0000\u0000\u025c\u025e\u0003J%\u0000\u025d\u025c\u0001\u0000\u0000\u0000"+
		"\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0005G\u0000\u0000\u0260M\u0001\u0000\u0000\u0000\u0261\u0265"+
		"\u00058\u0000\u0000\u0262\u0266\u0005F\u0000\u0000\u0263\u0266\u0003\u00c0"+
		"`\u0000\u0264\u0266\u0003P(\u0000\u0265\u0262\u0001\u0000\u0000\u0000"+
		"\u0265\u0263\u0001\u0000\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000"+
		"\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0001\u0000\u0000\u0000\u0268O\u0001\u0000\u0000\u0000\u0269"+
		"\u026b\u0003\u0012\t\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b"+
		"\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d"+
		"\u0005A\u0000\u0000\u026d\u026f\u00056\u0000\u0000\u026e\u0270\u0003\u0012"+
		"\t\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000"+
		"\u0000\u0270\u0274\u0001\u0000\u0000\u0000\u0271\u0275\u0003v;\u0000\u0272"+
		"\u0275\u0003b1\u0000\u0273\u0275\u0003R)\u0000\u0274\u0271\u0001\u0000"+
		"\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0273\u0001\u0000"+
		"\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0278\u00057\u0000"+
		"\u0000\u0277\u0279\u0003\u00b0X\u0000\u0278\u0277\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0001\u0000\u0000\u0000\u0279Q\u0001\u0000\u0000\u0000\u027a"+
		"\u027b\u0005@\u0000\u0000\u027bS\u0001\u0000\u0000\u0000\u027c\u027e\u0005"+
		"4\u0000\u0000\u027d\u027f\u0003J%\u0000\u027e\u027d\u0001\u0000\u0000"+
		"\u0000\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000"+
		"\u0000\u0280\u0286\u0003\u00c0`\u0000\u0281\u0284\u0007\u0003\u0000\u0000"+
		"\u0282\u0285\u0003\u00c0`\u0000\u0283\u0285\u0005]\u0000\u0000\u0284\u0282"+
		"\u0001\u0000\u0000\u0000\u0284\u0283\u0001\u0000\u0000\u0000\u0285\u0287"+
		"\u0001\u0000\u0000\u0000\u0286\u0281\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0001\u0000\u0000\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u0288\u0289"+
		"\u00055\u0000\u0000\u0289U\u0001\u0000\u0000\u0000\u028a\u028c\u0005:"+
		"\u0000\u0000\u028b\u028d\u0005:\u0000\u0000\u028c\u028b\u0001\u0000\u0000"+
		"\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d\u0291\u0001\u0000\u0000"+
		"\u0000\u028e\u0292\u0003P(\u0000\u028f\u0292\u0003\u00c0`\u0000\u0290"+
		"\u0292\u0003X,\u0000\u0291\u028e\u0001\u0000\u0000\u0000\u0291\u028f\u0001"+
		"\u0000\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292W\u0001\u0000"+
		"\u0000\u0000\u0293\u0294\u0005^\u0000\u0000\u0294\u0296\u00052\u0000\u0000"+
		"\u0295\u0297\u0003Z-\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297\u0298"+
		"\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0299"+
		"\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b"+
		"\u00053\u0000\u0000\u029bY\u0001\u0000\u0000\u0000\u029c\u02a0\u0003b"+
		"1\u0000\u029d\u02a0\u0003N\'\u0000\u029e\u02a0\u0003P(\u0000\u029f\u029c"+
		"\u0001\u0000\u0000\u0000\u029f\u029d\u0001\u0000\u0000\u0000\u029f\u029e"+
		"\u0001\u0000\u0000\u0000\u02a0\u02a2\u0001\u0000\u0000\u0000\u02a1\u02a3"+
		"\u00059\u0000\u0000\u02a2\u02a1\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a3[\u0001\u0000\u0000\u0000\u02a4\u02a5\u0005Q\u0000"+
		"\u0000\u02a5\u02a6\u0003^/\u0000\u02a6\u02a7\u00053\u0000\u0000\u02a7"+
		"]\u0001\u0000\u0000\u0000\u02a8\u02af\u0003H$\u0000\u02a9\u02af\u0003"+
		"L&\u0000\u02aa\u02af\u0005A\u0000\u0000\u02ab\u02af\u0003N\'\u0000\u02ac"+
		"\u02af\u0003T*\u0000\u02ad\u02af\u0003V+\u0000\u02ae\u02a8\u0001\u0000"+
		"\u0000\u0000\u02ae\u02a9\u0001\u0000\u0000\u0000\u02ae\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ae\u02ab\u0001\u0000\u0000\u0000\u02ae\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af_\u0001\u0000\u0000"+
		"\u0000\u02b0\u02c3\u0005E\u0000\u0000\u02b1\u02c3\u0005G\u0000\u0000\u02b2"+
		"\u02c3\u0005F\u0000\u0000\u02b3\u02c3\u0005D\u0000\u0000\u02b4\u02c3\u0005"+
		"J\u0000\u0000\u02b5\u02c3\u0005K\u0000\u0000\u02b6\u02b7\u0005J\u0000"+
		"\u0000\u02b7\u02c3\u0005H\u0000\u0000\u02b8\u02b9\u0005K\u0000\u0000\u02b9"+
		"\u02c3\u0005H\u0000\u0000\u02ba\u02bc\u0005H\u0000\u0000\u02bb\u02bd\u0005"+
		"H\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bc\u02bd\u0001\u0000"+
		"\u0000\u0000\u02bd\u02c3\u0001\u0000\u0000\u0000\u02be\u02c3\u0005I\u0000"+
		"\u0000\u02bf\u02c3\u0005*\u0000\u0000\u02c0\u02c3\u0005.\u0000\u0000\u02c1"+
		"\u02c3\u0005)\u0000\u0000\u02c2\u02b0\u0001\u0000\u0000\u0000\u02c2\u02b1"+
		"\u0001\u0000\u0000\u0000\u02c2\u02b2\u0001\u0000\u0000\u0000\u02c2\u02b3"+
		"\u0001\u0000\u0000\u0000\u02c2\u02b4\u0001\u0000\u0000\u0000\u02c2\u02b5"+
		"\u0001\u0000\u0000\u0000\u02c2\u02b6\u0001\u0000\u0000\u0000\u02c2\u02b8"+
		"\u0001\u0000\u0000\u0000\u02c2\u02ba\u0001\u0000\u0000\u0000\u02c2\u02be"+
		"\u0001\u0000\u0000\u0000\u02c2\u02bf\u0001\u0000\u0000\u0000\u02c2\u02c0"+
		"\u0001\u0000\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3a\u0001"+
		"\u0000\u0000\u0000\u02c4\u02da\u0003\u00a6S\u0000\u02c5\u02da\u0003\u00be"+
		"_\u0000\u02c6\u02da\u0003\u00bc^\u0000\u02c7\u02da\u0003\u009eO\u0000"+
		"\u02c8\u02da\u0003\u00a0P\u0000\u02c9\u02da\u0003\u00a2Q\u0000\u02ca\u02da"+
		"\u0003\u009cN\u0000\u02cb\u02da\u0003\u00b2Y\u0000\u02cc\u02da\u0003\u00a4"+
		"R\u0000\u02cd\u02da\u0005\u0006\u0000\u0000\u02ce\u02da\u0005]\u0000\u0000"+
		"\u02cf\u02da\u0003p8\u0000\u02d0\u02da\u0003\u0010\b\u0000\u02d1\u02da"+
		"\u0003P(\u0000\u02d2\u02da\u0003\u00b8\\\u0000\u02d3\u02da\u0003\u00c0"+
		"`\u0000\u02d4\u02da\u0003r9\u0000\u02d5\u02da\u0003<\u001e\u0000\u02d6"+
		"\u02d7\u00052\u0000\u0000\u02d7\u02da\u00053\u0000\u0000\u02d8\u02da\u0003"+
		"\u00b0X\u0000\u02d9\u02c4\u0001\u0000\u0000\u0000\u02d9\u02c5\u0001\u0000"+
		"\u0000\u0000\u02d9\u02c6\u0001\u0000\u0000\u0000\u02d9\u02c7\u0001\u0000"+
		"\u0000\u0000\u02d9\u02c8\u0001\u0000\u0000\u0000\u02d9\u02c9\u0001\u0000"+
		"\u0000\u0000\u02d9\u02ca\u0001\u0000\u0000\u0000\u02d9\u02cb\u0001\u0000"+
		"\u0000\u0000\u02d9\u02cc\u0001\u0000\u0000\u0000\u02d9\u02cd\u0001\u0000"+
		"\u0000\u0000\u02d9\u02ce\u0001\u0000\u0000\u0000\u02d9\u02cf\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d0\u0001\u0000\u0000\u0000\u02d9\u02d1\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d2\u0001\u0000\u0000\u0000\u02d9\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d4\u0001\u0000\u0000\u0000\u02d9\u02d5\u0001\u0000"+
		"\u0000\u0000\u02d9\u02d6\u0001\u0000\u0000\u0000\u02d9\u02d8\u0001\u0000"+
		"\u0000\u0000\u02dac\u0001\u0000\u0000\u0000\u02db\u02e0\u0005\u0015\u0000"+
		"\u0000\u02dc\u02de\u0003\u0012\t\u0000\u02dd\u02dc\u0001\u0000\u0000\u0000"+
		"\u02dd\u02de\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000"+
		"\u02df\u02e1\u0003\u00c0`\u0000\u02e0\u02dd\u0001\u0000\u0000\u0000\u02e0"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e3\u00052\u0000\u0000\u02e3\u02e4\u0003f3\u0000\u02e4\u02e5\u0005"+
		"3\u0000\u0000\u02e5\u02e7\u00056\u0000\u0000\u02e6\u02e8\u0003j5\u0000"+
		"\u02e7\u02e6\u0001\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ea\u00057\u0000\u0000\u02ea"+
		"e\u0001\u0000\u0000\u0000\u02eb\u02ed\u0003h4\u0000\u02ec\u02eb\u0001"+
		"\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02f2\u0001"+
		"\u0000\u0000\u0000\u02ee\u02ef\u00059\u0000\u0000\u02ef\u02f1\u0003h4"+
		"\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f1\u02f4\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000"+
		"\u0000\u02f3g\u0001\u0000\u0000\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f5\u02fa\u0003b1\u0000\u02f6\u02fa\u0003\f\u0006\u0000\u02f7\u02fa"+
		"\u0003|>\u0000\u02f8\u02fa\u0003\u0082A\u0000\u02f9\u02f5\u0001\u0000"+
		"\u0000\u0000\u02f9\u02f6\u0001\u0000\u0000\u0000\u02f9\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fb\u02fd\u0003\u00b4Z\u0000\u02fc\u02fb\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02ff\u0001\u0000\u0000"+
		"\u0000\u02fe\u0300\u0003\u0016\u000b\u0000\u02ff\u02fe\u0001\u0000\u0000"+
		"\u0000\u02ff\u0300\u0001\u0000\u0000\u0000\u0300i\u0001\u0000\u0000\u0000"+
		"\u0301\u0303\u0003n7\u0000\u0302\u0301\u0001\u0000\u0000\u0000\u0303\u0306"+
		"\u0001\u0000\u0000\u0000\u0304\u0302\u0001\u0000\u0000\u0000\u0304\u0305"+
		"\u0001\u0000\u0000\u0000\u0305\u0308\u0001\u0000\u0000\u0000\u0306\u0304"+
		"\u0001\u0000\u0000\u0000\u0307\u0309\u0003l6\u0000\u0308\u0307\u0001\u0000"+
		"\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309k\u0001\u0000\u0000"+
		"\u0000\u030a\u030b\u0005\u001a\u0000\u0000\u030b\u0310\u0003r9\u0000\u030c"+
		"\u030d\u00059\u0000\u0000\u030d\u030f\u0003r9\u0000\u030e\u030c\u0001"+
		"\u0000\u0000\u0000\u030f\u0312\u0001\u0000\u0000\u0000\u0310\u030e\u0001"+
		"\u0000\u0000\u0000\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0314\u0001"+
		"\u0000\u0000\u0000\u0312\u0310\u0001\u0000\u0000\u0000\u0313\u0315\u0005"+
		";\u0000\u0000\u0314\u0313\u0001\u0000\u0000\u0000\u0314\u0315\u0001\u0000"+
		"\u0000\u0000\u0315m\u0001\u0000\u0000\u0000\u0316\u0317\u0003r9\u0000"+
		"\u0317\u0318\u0005;\u0000\u0000\u0318\u031b\u0001\u0000\u0000\u0000\u0319"+
		"\u031b\u0003\u0002\u0001\u0000\u031a\u0316\u0001\u0000\u0000\u0000\u031a"+
		"\u0319\u0001\u0000\u0000\u0000\u031bo\u0001\u0000\u0000\u0000\u031c\u031e"+
		"\u0003\u0012\t\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031d\u031e\u0001"+
		"\u0000\u0000\u0000\u031e\u031f\u0001\u0000\u0000\u0000\u031f\u0320\u0003"+
		"\u00c0`\u0000\u0320\u0321\u00052\u0000\u0000\u0321\u0322\u0003f3\u0000"+
		"\u0322\u0323\u00053\u0000\u0000\u0323q\u0001\u0000\u0000\u0000\u0324\u0326"+
		"\u0005)\u0000\u0000\u0325\u0324\u0001\u0000\u0000\u0000\u0325\u0326\u0001"+
		"\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0330\u0003"+
		"t:\u0000\u0328\u032a\u0003`0\u0000\u0329\u032b\u0005)\u0000\u0000\u032a"+
		"\u0329\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b"+
		"\u032c\u0001\u0000\u0000\u0000\u032c\u032d\u0003t:\u0000\u032d\u032f\u0001"+
		"\u0000\u0000\u0000\u032e\u0328\u0001\u0000\u0000\u0000\u032f\u0332\u0001"+
		"\u0000\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001"+
		"\u0000\u0000\u0000\u0331s\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000"+
		"\u0000\u0000\u0333\u034e\u0003\u00a6S\u0000\u0334\u034e\u0003\u00c0`\u0000"+
		"\u0335\u034e\u0003\u0010\b\u0000\u0336\u034e\u0003\u009cN\u0000\u0337"+
		"\u034e\u0003\u00bc^\u0000\u0338\u034e\u0003\u009eO\u0000\u0339\u034e\u0003"+
		"\u00a0P\u0000\u033a\u034e\u0003\u00a2Q\u0000\u033b\u034e\u0003\u00be_"+
		"\u0000\u033c\u034e\u0003\u00b2Y\u0000\u033d\u034e\u0005\u0006\u0000\u0000"+
		"\u033e\u034e\u0005]\u0000\u0000\u033f\u034e\u0003P(\u0000\u0340\u034e"+
		"\u0003\u00b8\\\u0000\u0341\u034e\u0003v;\u0000\u0342\u034e\u0003p8\u0000"+
		"\u0343\u0345\u0003\u00b6[\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344"+
		"\u0345\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346"+
		"\u0348\u00052\u0000\u0000\u0347\u0349\u0003r9\u0000\u0348\u0347\u0001"+
		"\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u0001"+
		"\u0000\u0000\u0000\u034a\u034e\u00053\u0000\u0000\u034b\u034e\u0003\u0016"+
		"\u000b\u0000\u034c\u034e\u0003\u00b0X\u0000\u034d\u0333\u0001\u0000\u0000"+
		"\u0000\u034d\u0334\u0001\u0000\u0000\u0000\u034d\u0335\u0001\u0000\u0000"+
		"\u0000\u034d\u0336\u0001\u0000\u0000\u0000\u034d\u0337\u0001\u0000\u0000"+
		"\u0000\u034d\u0338\u0001\u0000\u0000\u0000\u034d\u0339\u0001\u0000\u0000"+
		"\u0000\u034d\u033a\u0001\u0000\u0000\u0000\u034d\u033b\u0001\u0000\u0000"+
		"\u0000\u034d\u033c\u0001\u0000\u0000\u0000\u034d\u033d\u0001\u0000\u0000"+
		"\u0000\u034d\u033e\u0001\u0000\u0000\u0000\u034d\u033f\u0001\u0000\u0000"+
		"\u0000\u034d\u0340\u0001\u0000\u0000\u0000\u034d\u0341\u0001\u0000\u0000"+
		"\u0000\u034d\u0342\u0001\u0000\u0000\u0000\u034d\u0344\u0001\u0000\u0000"+
		"\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034d\u034c\u0001\u0000\u0000"+
		"\u0000\u034eu\u0001\u0000\u0000\u0000\u034f\u0350\u0005\u001f\u0000\u0000"+
		"\u0350\u0353\u00052\u0000\u0000\u0351\u0354\u0003r9\u0000\u0352\u0354"+
		"\u0003R)\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0352\u0001\u0000"+
		"\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0356\u00059\u0000"+
		"\u0000\u0356\u0357\u0003b1\u0000\u0357\u0358\u00059\u0000\u0000\u0358"+
		"\u0359\u0003b1\u0000\u0359\u035b\u00053\u0000\u0000\u035a\u035c\u0003"+
		"\u00b0X\u0000\u035b\u035a\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000"+
		"\u0000\u0000\u035c\u035e\u0001\u0000\u0000\u0000\u035d\u035f\u0003\u0016"+
		"\u000b\u0000\u035e\u035d\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000"+
		"\u0000\u0000\u035fw\u0001\u0000\u0000\u0000\u0360\u0364\u0003~?\u0000"+
		"\u0361\u0364\u0003z=\u0000\u0362\u0364\u0003|>\u0000\u0363\u0360\u0001"+
		"\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0362\u0001"+
		"\u0000\u0000\u0000\u0364\u036a\u0001\u0000\u0000\u0000\u0365\u0366\u0005"+
		"2\u0000\u0000\u0366\u0367\u0003x<\u0000\u0367\u0368\u00053\u0000\u0000"+
		"\u0368\u036a\u0001\u0000\u0000\u0000\u0369\u0363\u0001\u0000\u0000\u0000"+
		"\u0369\u0365\u0001\u0000\u0000\u0000\u036ay\u0001\u0000\u0000\u0000\u036b"+
		"\u0370\u0003\u0080@\u0000\u036c\u036d\u00059\u0000\u0000\u036d\u036f\u0003"+
		"\u0080@\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036f\u0372\u0001\u0000"+
		"\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371\u0001\u0000"+
		"\u0000\u0000\u0371\u0374\u0001\u0000\u0000\u0000\u0372\u0370\u0001\u0000"+
		"\u0000\u0000\u0373\u0375\u00059\u0000\u0000\u0374\u0373\u0001\u0000\u0000"+
		"\u0000\u0374\u0375\u0001\u0000\u0000\u0000\u0375{\u0001\u0000\u0000\u0000"+
		"\u0376\u0378\u0003\u0080@\u0000\u0377\u0376\u0001\u0000\u0000\u0000\u0378"+
		"\u0379\u0001\u0000\u0000\u0000\u0379\u0377\u0001\u0000\u0000\u0000\u0379"+
		"\u037a\u0001\u0000\u0000\u0000\u037a}\u0001\u0000\u0000\u0000\u037b\u037e"+
		"\u00054\u0000\u0000\u037c\u037f\u0003|>\u0000\u037d\u037f\u0003z=\u0000"+
		"\u037e\u037c\u0001\u0000\u0000\u0000\u037e\u037d\u0001\u0000\u0000\u0000"+
		"\u037f\u0380\u0001\u0000\u0000\u0000\u0380\u0381\u00055\u0000\u0000\u0381"+
		"\u007f\u0001\u0000\u0000\u0000\u0382\u0384\u00052\u0000\u0000\u0383\u0382"+
		"\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000\u0384\u0389"+
		"\u0001\u0000\u0000\u0000\u0385\u0387\u0003b1\u0000\u0386\u0388\u00059"+
		"\u0000\u0000\u0387\u0386\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000"+
		"\u0000\u0000\u0388\u038a\u0001\u0000\u0000\u0000\u0389\u0385\u0001\u0000"+
		"\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u0389\u0001\u0000"+
		"\u0000\u0000\u038b\u038c\u0001\u0000\u0000\u0000\u038c\u038e\u0001\u0000"+
		"\u0000\u0000\u038d\u038f\u00053\u0000\u0000\u038e\u038d\u0001\u0000\u0000"+
		"\u0000\u038e\u038f\u0001\u0000\u0000\u0000\u038f\u0391\u0001\u0000\u0000"+
		"\u0000\u0390\u0392\u00059\u0000\u0000\u0391\u0390\u0001\u0000\u0000\u0000"+
		"\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0081\u0001\u0000\u0000\u0000"+
		"\u0393\u0394\u00052\u0000\u0000\u0394\u0395\u0003\u0084B\u0000\u0395\u0396"+
		"\u00053\u0000\u0000\u0396\u0083\u0001\u0000\u0000\u0000\u0397\u039c\u0003"+
		"\u0086C\u0000\u0398\u0399\u00059\u0000\u0000\u0399\u039b\u0003\u0086C"+
		"\u0000\u039a\u0398\u0001\u0000\u0000\u0000\u039b\u039e\u0001\u0000\u0000"+
		"\u0000\u039c\u039a\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000"+
		"\u0000\u039d\u03a0\u0001\u0000\u0000\u0000\u039e\u039c\u0001\u0000\u0000"+
		"\u0000\u039f\u03a1\u00059\u0000\u0000\u03a0\u039f\u0001\u0000\u0000\u0000"+
		"\u03a0\u03a1\u0001\u0000\u0000\u0000\u03a1\u0085\u0001\u0000\u0000\u0000"+
		"\u03a2\u03a3\u0003\u0088D\u0000\u03a3\u03a4\u0005:\u0000\u0000\u03a4\u03a5"+
		"\u0003\u008aE\u0000\u03a5\u0087\u0001\u0000\u0000\u0000\u03a6\u03aa\u0003"+
		"b1\u0000\u03a7\u03aa\u0003x<\u0000\u03a8\u03aa\u0003\u0082A\u0000\u03a9"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03a9"+
		"\u03a8\u0001\u0000\u0000\u0000\u03aa\u0089\u0001\u0000\u0000\u0000\u03ab"+
		"\u03af\u0003b1\u0000\u03ac\u03af\u0003x<\u0000\u03ad\u03af\u0003\u0082"+
		"A\u0000\u03ae\u03ab\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ae\u03ad\u0001\u0000\u0000\u0000\u03af\u008b\u0001\u0000\u0000"+
		"\u0000\u03b0\u03b1\u0005 \u0000\u0000\u03b1\u03b2\u0003r9\u0000\u03b2"+
		"\u03b6\u0003<\u001e\u0000\u03b3\u03b5\u0003\u008eG\u0000\u03b4\u03b3\u0001"+
		"\u0000\u0000\u0000\u03b5\u03b8\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03ba\u0001"+
		"\u0000\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b9\u03bb\u0003"+
		"\u0090H\u0000\u03ba\u03b9\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000"+
		"\u0000\u0000\u03bb\u008d\u0001\u0000\u0000\u0000\u03bc\u03bd\u0005\"\u0000"+
		"\u0000\u03bd\u03be\u0005\u001f\u0000\u0000\u03be\u03bf\u0003r9\u0000\u03bf"+
		"\u03c0\u0003<\u001e\u0000\u03c0\u008f\u0001\u0000\u0000\u0000\u03c1\u03c2"+
		"\u0005\"\u0000\u0000\u03c2\u03c3\u0003<\u001e\u0000\u03c3\u0091\u0001"+
		"\u0000\u0000\u0000\u03c4\u03c5\u0005!\u0000\u0000\u03c5\u03c6\u0003\u0010"+
		"\b\u0000\u03c6\u03c7\u0005%\u0000\u0000\u03c7\u03c8\u0005\\\u0000\u0000"+
		"\u03c8\u03c9\u0007\u0004\u0000\u0000\u03c9\u03ca\u0003\u0094J\u0000\u03ca"+
		"\u03cb\u0003<\u001e\u0000\u03cb\u0093\u0001\u0000\u0000\u0000\u03cc\u03d0"+
		"\u0005\\\u0000\u0000\u03cd\u03d0\u0003p8\u0000\u03ce\u03d0\u0003r9\u0000"+
		"\u03cf\u03cc\u0001\u0000\u0000\u0000\u03cf\u03cd\u0001\u0000\u0000\u0000"+
		"\u03cf\u03ce\u0001\u0000\u0000\u0000\u03d0\u0095\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d2\u0005#\u0000\u0000\u03d2\u03d3\u0003r9\u0000\u03d3\u03d4"+
		"\u0003<\u001e\u0000\u03d4\u0097\u0001\u0000\u0000\u0000\u03d5\u03d6\u0005"+
		"$\u0000\u0000\u03d6\u03db\u0003\u0010\b\u0000\u03d7\u03d8\u00059\u0000"+
		"\u0000\u03d8\u03da\u0003\u0010\b\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000"+
		"\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9\u0001\u0000\u0000\u0000"+
		"\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03de\u0001\u0000\u0000\u0000"+
		"\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03df\u0005/\u0000\u0000\u03df"+
		"\u03e0\u0003\u009aM\u0000\u03e0\u03e1\u0003<\u001e\u0000\u03e1\u0099\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e5\u0003x<\u0000\u03e3\u03e5\u0003\u0082A"+
		"\u0000\u03e4\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e5\u009b\u0001\u0000\u0000\u0000\u03e6\u03e7\u0005T\u0000\u0000"+
		"\u03e7\u03ea\u0005[\u0000\u0000\u03e8\u03e9\u00059\u0000\u0000\u03e9\u03eb"+
		"\u0003b1\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001\u0000"+
		"\u0000\u0000\u03eb\u03ec\u0001\u0000\u0000\u0000\u03ec\u03ed\u00053\u0000"+
		"\u0000\u03ed\u009d\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005R\u0000\u0000"+
		"\u03ef\u03f0\u0003r9\u0000\u03f0\u03f1\u00053\u0000\u0000\u03f1\u009f"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f3\u0005S\u0000\u0000\u03f3\u03f4\u0003"+
		"\u00aeW\u0000\u03f4\u03f5\u00053\u0000\u0000\u03f5\u00a1\u0001\u0000\u0000"+
		"\u0000\u03f6\u03f7\u0005U\u0000\u0000\u03f7\u03fe\u0003b1\u0000\u03f8"+
		"\u03fa\u00059\u0000\u0000\u03f9\u03f8\u0001\u0000\u0000\u0000\u03f9\u03fa"+
		"\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fd"+
		"\u0003b1\u0000\u03fc\u03f9\u0001\u0000\u0000\u0000\u03fd\u0400\u0001\u0000"+
		"\u0000\u0000\u03fe\u03fc\u0001\u0000\u0000\u0000\u03fe\u03ff\u0001\u0000"+
		"\u0000\u0000\u03ff\u0401\u0001\u0000\u0000\u0000\u0400\u03fe\u0001\u0000"+
		"\u0000\u0000\u0401\u0402\u00053\u0000\u0000\u0402\u00a3\u0001\u0000\u0000"+
		"\u0000\u0403\u0404\u0005V\u0000\u0000\u0404\u0405\u0003b1\u0000\u0405"+
		"\u0406\u00059\u0000\u0000\u0406\u0407\u0003\u00be_\u0000\u0407\u0408\u0005"+
		"\f\u0000\u0000\u0408\u0409\u00053\u0000\u0000\u0409\u00a5\u0001\u0000"+
		"\u0000\u0000\u040a\u040f\u0003\u00a8T\u0000\u040b\u040f\u0003\u00aaU\u0000"+
		"\u040c\u040f\u0003\u00acV\u0000\u040d\u040f\u0003\u00aeW\u0000\u040e\u040a"+
		"\u0001\u0000\u0000\u0000\u040e\u040b\u0001\u0000\u0000\u0000\u040e\u040c"+
		"\u0001\u0000\u0000\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040f\u00a7"+
		"\u0001\u0000\u0000\u0000\u0410\u0412\u0003\u00b6[\u0000\u0411\u0410\u0001"+
		"\u0000\u0000\u0000\u0411\u0412\u0001\u0000\u0000\u0000\u0412\u0413\u0001"+
		"\u0000\u0000\u0000\u0413\u0414\u0005\\\u0000\u0000\u0414\u0415\u0007\u0005"+
		"\u0000\u0000\u0415\u00a9\u0001\u0000\u0000\u0000\u0416\u0418\u0003\u00b6"+
		"[\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0417\u0418\u0001\u0000\u0000"+
		"\u0000\u0418\u0419\u0001\u0000\u0000\u0000\u0419\u041a\u0005\\\u0000\u0000"+
		"\u041a\u041b\u0007\u0006\u0000\u0000\u041b\u00ab\u0001\u0000\u0000\u0000"+
		"\u041c\u041e\u0003\u00b6[\u0000\u041d\u041c\u0001\u0000\u0000\u0000\u041d"+
		"\u041e\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f"+
		"\u0420\u0005\\\u0000\u0000\u0420\u0421\u0005\u000e\u0000\u0000\u0421\u00ad"+
		"\u0001\u0000\u0000\u0000\u0422\u0424\u0003\u00b6[\u0000\u0423\u0422\u0001"+
		"\u0000\u0000\u0000\u0423\u0424\u0001\u0000\u0000\u0000\u0424\u0425\u0001"+
		"\u0000\u0000\u0000\u0425\u0426\u0005\\\u0000\u0000\u0426\u0427\u0005\n"+
		"\u0000\u0000\u0427\u00af\u0001\u0000\u0000\u0000\u0428\u0429\u0007\u0007"+
		"\u0000\u0000\u0429\u00b1\u0001\u0000\u0000\u0000\u042a\u042b\u0005\u0005"+
		"\u0000\u0000\u042b\u00b3\u0001\u0000\u0000\u0000\u042c\u042d\u00058\u0000"+
		"\u0000\u042d\u042e\u00058\u0000\u0000\u042e\u042f\u00058\u0000\u0000\u042f"+
		"\u00b5\u0001\u0000\u0000\u0000\u0430\u0431\u0007\b\u0000\u0000\u0431\u00b7"+
		"\u0001\u0000\u0000\u0000\u0432\u0433\u0005A\u0000\u0000\u0433\u0434\u0003"+
		"\u00ba]\u0000\u0434\u00b9\u0001\u0000\u0000\u0000\u0435\u0437\u0007\t"+
		"\u0000\u0000\u0436\u0435\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000"+
		"\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000"+
		"\u0000\u0000\u0439\u00bb\u0001\u0000\u0000\u0000\u043a\u043b\u0007\n\u0000"+
		"\u0000\u043b\u00bd\u0001\u0000\u0000\u0000\u043c\u043e\u0003\u00b6[\u0000"+
		"\u043d\u043c\u0001\u0000\u0000\u0000\u043d\u043e\u0001\u0000\u0000\u0000"+
		"\u043e\u043f\u0001\u0000\u0000\u0000\u043f\u0440\u0005\\\u0000\u0000\u0440"+
		"\u00bf\u0001\u0000\u0000\u0000\u0441\u0443\u0007\u000b\u0000\u0000\u0442"+
		"\u0441\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443"+
		"\u0444\u0001\u0000\u0000\u0000\u0444\u0448\u0005^\u0000\u0000\u0445\u0448"+
		"\u0005%\u0000\u0000\u0446\u0448\u0005&\u0000\u0000\u0447\u0442\u0001\u0000"+
		"\u0000\u0000\u0447\u0445\u0001\u0000\u0000\u0000\u0447\u0446\u0001\u0000"+
		"\u0000\u0000\u0448\u00c1\u0001\u0000\u0000\u0000\u008e\u00c5\u00df\u00e4"+
		"\u00e9\u00ee\u00f1\u00f4\u00f8\u00fc\u0101\u010c\u010f\u0117\u011c\u0120"+
		"\u012a\u012e\u0131\u0136\u0139\u0140\u0146\u014c\u014f\u0157\u015a\u0165"+
		"\u0168\u016b\u016f\u0175\u017d\u0180\u0186\u0191\u019a\u019d\u01a4\u01ab"+
		"\u01b3\u01b8\u01bf\u01c3\u01cb\u01ce\u01d4\u01d9\u01e3\u01e5\u01e8\u01f9"+
		"\u0204\u0208\u0211\u0215\u021d\u0224\u022e\u0231\u0233\u023f\u0242\u0244"+
		"\u0246\u024c\u0250\u0254\u0258\u025d\u0265\u0267\u026a\u026f\u0274\u0278"+
		"\u027e\u0284\u0286\u028c\u0291\u0298\u029f\u02a2\u02ae\u02bc\u02c2\u02d9"+
		"\u02dd\u02e0\u02e7\u02ec\u02f2\u02f9\u02fc\u02ff\u0304\u0308\u0310\u0314"+
		"\u031a\u031d\u0325\u032a\u0330\u0344\u0348\u034d\u0353\u035b\u035e\u0363"+
		"\u0369\u0370\u0374\u0379\u037e\u0383\u0387\u038b\u038e\u0391\u039c\u03a0"+
		"\u03a9\u03ae\u03b6\u03ba\u03cf\u03db\u03e4\u03ea\u03f9\u03fe\u040e\u0411"+
		"\u0417\u041d\u0423\u0438\u043d\u0442\u0447";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}