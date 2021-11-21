// Generated from assign.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class assignParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Variable=1, Constant=2, Return=3, Void=4, Main=5, If=6, Else=7, While=8, 
		Begin=9, End=10, Is=11, Integer=12, Boolean=13, Skipping=14, NEG=15, ASSIGN=16, 
		ADD=17, SEMI=18, MINUS=19, OR=20, AND=21, LBR=22, RBR=23, EQL=24, NEQL=25, 
		LESS=26, LESSEQ=27, GREATER=28, GREATEREQ=29, COLON=30, COMMA=31, BOOL=32, 
		ID=33, NUMBER=34, COMMENT=35, LINE_COMMENT=36, WS=37;
	public static final int
		RULE_prog = 0, RULE_stm = 1, RULE_expr = 2, RULE_cond = 3, RULE_var_decl = 4, 
		RULE_stmblock = 5, RULE_const_decl = 6, RULE_decl = 7, RULE_func = 8, 
		RULE_decl_lst = 9, RULE_main = 10, RULE_func_lst = 11, RULE_para_lst = 12, 
		RULE_nemp_paralst = 13, RULE_nemp_arglst = 14, RULE_arglst = 15, RULE_type = 16, 
		RULE_comp_op = 17, RULE_frag = 18, RULE_bin_arith_op = 19;
	public static final String[] ruleNames = {
		"prog", "stm", "expr", "cond", "var_decl", "stmblock", "const_decl", "decl", 
		"func", "decl_lst", "main", "func_lst", "para_lst", "nemp_paralst", "nemp_arglst", 
		"arglst", "type", "comp_op", "frag", "bin_arith_op"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "'~'", "':='", "'+'", "';'", "'-'", "'|'", "'&'", "'('", 
		"')'", "'='", "'!='", "'<'", "'<='", "'>'", "'>='", "':'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "Variable", "Constant", "Return", "Void", "Main", "If", "Else", 
		"While", "Begin", "End", "Is", "Integer", "Boolean", "Skipping", "NEG", 
		"ASSIGN", "ADD", "SEMI", "MINUS", "OR", "AND", "LBR", "RBR", "EQL", "NEQL", 
		"LESS", "LESSEQ", "GREATER", "GREATEREQ", "COLON", "COMMA", "BOOL", "ID", 
		"NUMBER", "COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "assign.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public assignParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public Decl_lstContext decl_lst() {
			return getRuleContext(Decl_lstContext.class,0);
		}
		public Func_lstContext func_lst() {
			return getRuleContext(Func_lstContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			decl_lst();
			setState(41);
			func_lst();
			setState(42);
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

	public static class StmContext extends ParserRuleContext {
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStmContext extends StmContext {
		public TerminalNode ID() { return getToken(assignParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(assignParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(assignParser.SEMI, 0); }
		public AssignStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitAssignStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmContext extends StmContext {
		public TerminalNode Begin() { return getToken(assignParser.Begin, 0); }
		public StmblockContext stmblock() {
			return getRuleContext(StmblockContext.class,0);
		}
		public TerminalNode End() { return getToken(assignParser.End, 0); }
		public BlockStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitBlockStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgStmContext extends StmContext {
		public TerminalNode ID() { return getToken(assignParser.ID, 0); }
		public TerminalNode LBR() { return getToken(assignParser.LBR, 0); }
		public ArglstContext arglst() {
			return getRuleContext(ArglstContext.class,0);
		}
		public TerminalNode RBR() { return getToken(assignParser.RBR, 0); }
		public TerminalNode SEMI() { return getToken(assignParser.SEMI, 0); }
		public ArgStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitArgStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmContext extends StmContext {
		public TerminalNode While() { return getToken(assignParser.While, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode Begin() { return getToken(assignParser.Begin, 0); }
		public StmblockContext stmblock() {
			return getRuleContext(StmblockContext.class,0);
		}
		public TerminalNode End() { return getToken(assignParser.End, 0); }
		public WhileStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitWhileStm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends StmContext {
		public TerminalNode Skipping() { return getToken(assignParser.Skipping, 0); }
		public TerminalNode SEMI() { return getToken(assignParser.SEMI, 0); }
		public SkipContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfStmContext extends StmContext {
		public TerminalNode If() { return getToken(assignParser.If, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> Begin() { return getTokens(assignParser.Begin); }
		public TerminalNode Begin(int i) {
			return getToken(assignParser.Begin, i);
		}
		public List<StmblockContext> stmblock() {
			return getRuleContexts(StmblockContext.class);
		}
		public StmblockContext stmblock(int i) {
			return getRuleContext(StmblockContext.class,i);
		}
		public List<TerminalNode> End() { return getTokens(assignParser.End); }
		public TerminalNode End(int i) {
			return getToken(assignParser.End, i);
		}
		public TerminalNode Else() { return getToken(assignParser.Else, 0); }
		public IfStmContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitIfStm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stm);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new AssignStmContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(ID);
				setState(45);
				match(ASSIGN);
				setState(46);
				expr();
				setState(47);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new ArgStmContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(ID);
				setState(50);
				match(LBR);
				setState(51);
				arglst();
				setState(52);
				match(RBR);
				setState(53);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new BlockStmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				match(Begin);
				setState(56);
				stmblock();
				setState(57);
				match(End);
				}
				break;
			case 4:
				_localctx = new IfStmContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				match(If);
				setState(60);
				cond(0);
				setState(61);
				match(Begin);
				setState(62);
				stmblock();
				setState(63);
				match(End);
				setState(64);
				match(Else);
				setState(65);
				match(Begin);
				setState(66);
				stmblock();
				setState(67);
				match(End);
				}
				break;
			case 5:
				_localctx = new WhileStmContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				match(While);
				setState(70);
				cond(0);
				setState(71);
				match(Begin);
				setState(72);
				stmblock();
				setState(73);
				match(End);
				}
				break;
			case 6:
				_localctx = new SkipContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
				match(Skipping);
				setState(76);
				match(SEMI);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FragOpContext extends ExprContext {
		public FragContext frag() {
			return getRuleContext(FragContext.class,0);
		}
		public FragOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitFragOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOpContext extends ExprContext {
		public TerminalNode LBR() { return getToken(assignParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(assignParser.RBR, 0); }
		public ExprOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitExprOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOpContext extends ExprContext {
		public List<FragContext> frag() {
			return getRuleContexts(FragContext.class);
		}
		public FragContext frag(int i) {
			return getRuleContext(FragContext.class,i);
		}
		public Bin_arith_opContext bin_arith_op() {
			return getRuleContext(Bin_arith_opContext.class,0);
		}
		public BinOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitBinOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArgOpContext extends ExprContext {
		public TerminalNode ID() { return getToken(assignParser.ID, 0); }
		public TerminalNode LBR() { return getToken(assignParser.LBR, 0); }
		public ArglstContext arglst() {
			return getRuleContext(ArglstContext.class,0);
		}
		public TerminalNode RBR() { return getToken(assignParser.RBR, 0); }
		public ArgOpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitArgOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new BinOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				frag();
				setState(80);
				bin_arith_op();
				setState(81);
				frag();
				}
				break;
			case 2:
				_localctx = new ExprOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LBR);
				setState(84);
				expr();
				setState(85);
				match(RBR);
				}
				break;
			case 3:
				_localctx = new ArgOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(ID);
				setState(88);
				match(LBR);
				setState(89);
				arglst();
				setState(90);
				match(RBR);
				}
				break;
			case 4:
				_localctx = new FragOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				frag();
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

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegCondContext extends CondContext {
		public TerminalNode NEG() { return getToken(assignParser.NEG, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NegCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitNegCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrAndCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode OR() { return getToken(assignParser.OR, 0); }
		public TerminalNode AND() { return getToken(assignParser.AND, 0); }
		public OrAndCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitOrAndCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompOpCondContext extends CondContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public CompOpCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitCompOpCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LRCondContext extends CondContext {
		public TerminalNode LBR() { return getToken(assignParser.LBR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RBR() { return getToken(assignParser.RBR, 0); }
		public LRCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitLRCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NegCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96);
				match(NEG);
				setState(97);
				cond(4);
				}
				break;
			case 2:
				{
				_localctx = new LRCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(LBR);
				setState(99);
				cond(0);
				setState(100);
				match(RBR);
				}
				break;
			case 3:
				{
				_localctx = new CompOpCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				expr();
				setState(103);
				comp_op();
				setState(104);
				expr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OrAndCondContext(new CondContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_cond);
					setState(108);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(109);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(110);
					cond(2);
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode Variable() { return getToken(assignParser.Variable, 0); }
		public TerminalNode ID() { return getToken(assignParser.ID, 0); }
		public TerminalNode COLON() { return getToken(assignParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(assignParser.SEMI, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Variable);
			setState(117);
			match(ID);
			setState(118);
			match(COLON);
			setState(119);
			type();
			setState(120);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmblockContext extends ParserRuleContext {
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public StmblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmblock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitStmblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmblockContext stmblock() throws RecognitionException {
		StmblockContext _localctx = new StmblockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmblock);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << If) | (1L << While) | (1L << Begin) | (1L << Skipping) | (1L << ID))) != 0)) {
					{
					{
					setState(122);
					stm();
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode Constant() { return getToken(assignParser.Constant, 0); }
		public TerminalNode ID() { return getToken(assignParser.ID, 0); }
		public TerminalNode COLON() { return getToken(assignParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(assignParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(assignParser.SEMI, 0); }
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitConst_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(Constant);
			setState(132);
			match(ID);
			setState(133);
			match(COLON);
			setState(134);
			type();
			setState(135);
			match(ASSIGN);
			setState(136);
			expr();
			setState(137);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_decl);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Variable:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				var_decl();
				}
				break;
			case Constant:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				const_decl();
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

	public static class FuncContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(assignParser.ID, 0); }
		public List<TerminalNode> LBR() { return getTokens(assignParser.LBR); }
		public TerminalNode LBR(int i) {
			return getToken(assignParser.LBR, i);
		}
		public Para_lstContext para_lst() {
			return getRuleContext(Para_lstContext.class,0);
		}
		public List<TerminalNode> RBR() { return getTokens(assignParser.RBR); }
		public TerminalNode RBR(int i) {
			return getToken(assignParser.RBR, i);
		}
		public TerminalNode Is() { return getToken(assignParser.Is, 0); }
		public Decl_lstContext decl_lst() {
			return getRuleContext(Decl_lstContext.class,0);
		}
		public TerminalNode Begin() { return getToken(assignParser.Begin, 0); }
		public StmblockContext stmblock() {
			return getRuleContext(StmblockContext.class,0);
		}
		public TerminalNode Return() { return getToken(assignParser.Return, 0); }
		public TerminalNode SEMI() { return getToken(assignParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode End() { return getToken(assignParser.End, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			type();
			setState(144);
			match(ID);
			setState(145);
			match(LBR);
			setState(146);
			para_lst();
			setState(147);
			match(RBR);
			setState(148);
			match(Is);
			setState(149);
			decl_lst();
			setState(150);
			match(Begin);
			setState(151);
			stmblock();
			setState(152);
			match(Return);
			setState(153);
			match(LBR);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LBR) | (1L << BOOL) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(154);
				expr();
				}
			}

			setState(157);
			match(RBR);
			setState(158);
			match(SEMI);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==End) {
				{
				setState(159);
				match(End);
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

	public static class Decl_lstContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public Decl_lstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_lst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitDecl_lst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_lstContext decl_lst() throws RecognitionException {
		Decl_lstContext _localctx = new Decl_lstContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_decl_lst);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Variable || _la==Constant) {
					{
					{
					setState(162);
					decl();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(assignParser.Main, 0); }
		public TerminalNode Begin() { return getToken(assignParser.Begin, 0); }
		public Decl_lstContext decl_lst() {
			return getRuleContext(Decl_lstContext.class,0);
		}
		public StmblockContext stmblock() {
			return getRuleContext(StmblockContext.class,0);
		}
		public TerminalNode End() { return getToken(assignParser.End, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Main);
			setState(172);
			match(Begin);
			setState(173);
			decl_lst();
			setState(174);
			stmblock();
			setState(175);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_lstContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public Func_lstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_lst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitFunc_lst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_lstContext func_lst() throws RecognitionException {
		Func_lstContext _localctx = new Func_lstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_func_lst);
		int _la;
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Integer) | (1L << Boolean))) != 0)) {
					{
					{
					setState(177);
					func();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Para_lstContext extends ParserRuleContext {
		public Nemp_paralstContext nemp_paralst() {
			return getRuleContext(Nemp_paralstContext.class,0);
		}
		public Para_lstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para_lst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitPara_lst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Para_lstContext para_lst() throws RecognitionException {
		Para_lstContext _localctx = new Para_lstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_para_lst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(186);
				nemp_paralst();
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

	public static class Nemp_paralstContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(assignParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(assignParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(assignParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(assignParser.COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Nemp_paralstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_paralst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitNemp_paralst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_paralstContext nemp_paralst() throws RecognitionException {
		Nemp_paralstContext _localctx = new Nemp_paralstContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nemp_paralst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ID);
			setState(190);
			match(COLON);
			setState(191);
			type();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				match(ID);
				setState(194);
				match(COLON);
				setState(195);
				type();
				}
				}
				setState(200);
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

	public static class Nemp_arglstContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(assignParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(assignParser.ID, i);
		}
		public Nemp_arglstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arglst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitNemp_arglst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nemp_arglstContext nemp_arglst() throws RecognitionException {
		Nemp_arglstContext _localctx = new Nemp_arglstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_nemp_arglst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(ID);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(202);
				match(COMMA);
				setState(203);
				match(ID);
				}
				}
				setState(208);
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

	public static class ArglstContext extends ParserRuleContext {
		public Nemp_arglstContext nemp_arglst() {
			return getRuleContext(Nemp_arglstContext.class,0);
		}
		public ArglstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglst; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitArglst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglstContext arglst() throws RecognitionException {
		ArglstContext _localctx = new ArglstContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arglst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(209);
				nemp_arglst();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(assignParser.Integer, 0); }
		public TerminalNode Boolean() { return getToken(assignParser.Boolean, 0); }
		public TerminalNode Void() { return getToken(assignParser.Void, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Void) | (1L << Integer) | (1L << Boolean))) != 0)) ) {
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQL() { return getToken(assignParser.EQL, 0); }
		public TerminalNode NEQL() { return getToken(assignParser.NEQL, 0); }
		public TerminalNode LESS() { return getToken(assignParser.LESS, 0); }
		public TerminalNode LESSEQ() { return getToken(assignParser.LESSEQ, 0); }
		public TerminalNode GREATER() { return getToken(assignParser.GREATER, 0); }
		public TerminalNode GREATEREQ() { return getToken(assignParser.GREATEREQ, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitComp_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQL) | (1L << NEQL) | (1L << LESS) | (1L << LESSEQ) | (1L << GREATER) | (1L << GREATEREQ))) != 0)) ) {
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

	public static class FragContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(assignParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(assignParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(assignParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(assignParser.BOOL, 0); }
		public TerminalNode LBR() { return getToken(assignParser.LBR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RBR() { return getToken(assignParser.RBR, 0); }
		public ArglstContext arglst() {
			return getRuleContext(ArglstContext.class,0);
		}
		public FragContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitFrag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragContext frag() throws RecognitionException {
		FragContext _localctx = new FragContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_frag);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				match(MINUS);
				setState(218);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(219);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(220);
				match(BOOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(221);
				match(LBR);
				setState(222);
				expr();
				setState(223);
				match(RBR);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(ID);
				setState(226);
				match(LBR);
				setState(227);
				arglst();
				setState(228);
				match(RBR);
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

	public static class Bin_arith_opContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(assignParser.ADD, 0); }
		public TerminalNode MINUS() { return getToken(assignParser.MINUS, 0); }
		public Bin_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_arith_op; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof assignVisitor ) return ((assignVisitor<? extends T>)visitor).visitBin_arith_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_arith_opContext bin_arith_op() throws RecognitionException {
		Bin_arith_opContext _localctx = new Bin_arith_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bin_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==MINUS) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5m\n\5\3\5\3\5\3\5\7\5r\n\5\f\5\16\5u\13\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\7\5\7\u0084\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009e\n\n\3\n\3\n\3\n\5\n\u00a3\n"+
		"\n\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9\13\13\3\13\5\13\u00ac\n\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u00b5\n\r\f\r\16\r\u00b8\13\r\3\r\5\r\u00bb"+
		"\n\r\3\16\5\16\u00be\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00c7"+
		"\n\17\f\17\16\17\u00ca\13\17\3\20\3\20\3\20\7\20\u00cf\n\20\f\20\16\20"+
		"\u00d2\13\20\3\21\5\21\u00d5\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e9\n\24"+
		"\3\25\3\25\3\25\2\3\b\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"\2\6\3\2\26\27\4\2\6\6\16\17\3\2\32\37\4\2\23\23\25\25\2\u00f5\2*\3\2"+
		"\2\2\4O\3\2\2\2\6_\3\2\2\2\bl\3\2\2\2\nv\3\2\2\2\f\u0083\3\2\2\2\16\u0085"+
		"\3\2\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u00ab\3\2\2\2\26\u00ad\3"+
		"\2\2\2\30\u00ba\3\2\2\2\32\u00bd\3\2\2\2\34\u00bf\3\2\2\2\36\u00cb\3\2"+
		"\2\2 \u00d4\3\2\2\2\"\u00d6\3\2\2\2$\u00d8\3\2\2\2&\u00e8\3\2\2\2(\u00ea"+
		"\3\2\2\2*+\5\24\13\2+,\5\30\r\2,-\5\26\f\2-\3\3\2\2\2./\7#\2\2/\60\7\22"+
		"\2\2\60\61\5\6\4\2\61\62\7\24\2\2\62P\3\2\2\2\63\64\7#\2\2\64\65\7\30"+
		"\2\2\65\66\5 \21\2\66\67\7\31\2\2\678\7\24\2\28P\3\2\2\29:\7\13\2\2:;"+
		"\5\f\7\2;<\7\f\2\2<P\3\2\2\2=>\7\b\2\2>?\5\b\5\2?@\7\13\2\2@A\5\f\7\2"+
		"AB\7\f\2\2BC\7\t\2\2CD\7\13\2\2DE\5\f\7\2EF\7\f\2\2FP\3\2\2\2GH\7\n\2"+
		"\2HI\5\b\5\2IJ\7\13\2\2JK\5\f\7\2KL\7\f\2\2LP\3\2\2\2MN\7\20\2\2NP\7\24"+
		"\2\2O.\3\2\2\2O\63\3\2\2\2O9\3\2\2\2O=\3\2\2\2OG\3\2\2\2OM\3\2\2\2P\5"+
		"\3\2\2\2QR\5&\24\2RS\5(\25\2ST\5&\24\2T`\3\2\2\2UV\7\30\2\2VW\5\6\4\2"+
		"WX\7\31\2\2X`\3\2\2\2YZ\7#\2\2Z[\7\30\2\2[\\\5 \21\2\\]\7\31\2\2]`\3\2"+
		"\2\2^`\5&\24\2_Q\3\2\2\2_U\3\2\2\2_Y\3\2\2\2_^\3\2\2\2`\7\3\2\2\2ab\b"+
		"\5\1\2bc\7\21\2\2cm\5\b\5\6de\7\30\2\2ef\5\b\5\2fg\7\31\2\2gm\3\2\2\2"+
		"hi\5\6\4\2ij\5$\23\2jk\5\6\4\2km\3\2\2\2la\3\2\2\2ld\3\2\2\2lh\3\2\2\2"+
		"ms\3\2\2\2no\f\3\2\2op\t\2\2\2pr\5\b\5\4qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2"+
		"st\3\2\2\2t\t\3\2\2\2us\3\2\2\2vw\7\3\2\2wx\7#\2\2xy\7 \2\2yz\5\"\22\2"+
		"z{\7\24\2\2{\13\3\2\2\2|~\5\4\3\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0084\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\177\3\2\2\2\u0083\u0082\3\2\2\2\u0084\r\3\2\2\2\u0085\u0086"+
		"\7\4\2\2\u0086\u0087\7#\2\2\u0087\u0088\7 \2\2\u0088\u0089\5\"\22\2\u0089"+
		"\u008a\7\22\2\2\u008a\u008b\5\6\4\2\u008b\u008c\7\24\2\2\u008c\17\3\2"+
		"\2\2\u008d\u0090\5\n\6\2\u008e\u0090\5\16\b\2\u008f\u008d\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\21\3\2\2\2\u0091\u0092\5\"\22\2\u0092\u0093\7#\2"+
		"\2\u0093\u0094\7\30\2\2\u0094\u0095\5\32\16\2\u0095\u0096\7\31\2\2\u0096"+
		"\u0097\7\r\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7\13\2\2\u0099\u009a"+
		"\5\f\7\2\u009a\u009b\7\5\2\2\u009b\u009d\7\30\2\2\u009c\u009e\5\6\4\2"+
		"\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\7\31\2\2\u00a0\u00a2\7\24\2\2\u00a1\u00a3\7\f\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\23\3\2\2\2\u00a4\u00a6\5\20\t\2\u00a5\u00a4"+
		"\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00ac\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2"+
		"\2\2\u00ab\u00aa\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ae\7\7\2\2\u00ae\u00af"+
		"\7\13\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\f\2"+
		"\2\u00b2\27\3\2\2\2\u00b3\u00b5\5\22\n\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00bb\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb\31\3\2\2\2\u00bc\u00be\5\34\17\2\u00bd\u00bc\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\33\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0\u00c1\7 \2\2"+
		"\u00c1\u00c8\5\"\22\2\u00c2\u00c3\7!\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c5"+
		"\7 \2\2\u00c5\u00c7\5\"\22\2\u00c6\u00c2\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\35\3\2\2\2\u00ca\u00c8\3\2\2"+
		"\2\u00cb\u00d0\7#\2\2\u00cc\u00cd\7!\2\2\u00cd\u00cf\7#\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\37\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\5\36\20\2\u00d4\u00d3\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5!\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7#\3\2"+
		"\2\2\u00d8\u00d9\t\4\2\2\u00d9%\3\2\2\2\u00da\u00e9\7#\2\2\u00db\u00dc"+
		"\7\25\2\2\u00dc\u00e9\7#\2\2\u00dd\u00e9\7$\2\2\u00de\u00e9\7\"\2\2\u00df"+
		"\u00e0\7\30\2\2\u00e0\u00e1\5\6\4\2\u00e1\u00e2\7\31\2\2\u00e2\u00e9\3"+
		"\2\2\2\u00e3\u00e4\7#\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00e6\5 \21\2\u00e6"+
		"\u00e7\7\31\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00da\3\2\2\2\u00e8\u00db\3"+
		"\2\2\2\u00e8\u00dd\3\2\2\2\u00e8\u00de\3\2\2\2\u00e8\u00df\3\2\2\2\u00e8"+
		"\u00e3\3\2\2\2\u00e9\'\3\2\2\2\u00ea\u00eb\t\5\2\2\u00eb)\3\2\2\2\24O"+
		"_ls\177\u0083\u008f\u009d\u00a2\u00a7\u00ab\u00b6\u00ba\u00bd\u00c8\u00d0"+
		"\u00d4\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}