// $ANTLR ANTLRVersion> GrammarHighlighterLexerBase.java generatedTimestamp>
/*
 *  Copyright (c) 2012 Sam Harwell, Tunnel Vision Laboratories LLC
 *  All rights reserved.
 *
 *  The source code of this document is proprietary work, and is not licensed for
 *  distribution. For information about licensing, contact Sam Harwell at:
 *      sam@tunnelvisionlabs.com
 */
package org.antlr.works.editor.grammar.highlighter4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

public class GrammarHighlighterLexerBase extends Lexer {
	public static final int
		InvalidGrammarOption=1, ValidGrammarOption=2, LEXER=3, PARSER=4, CATCH=5, 
		FINALLY=6, GRAMMAR=7, PRIVATE=8, PROTECTED=9, PUBLIC=10, RETURNS=11, THROWS=12, 
		IMPORT=13, FRAGMENT=14, TOKENS=15, OPTIONS=16, MODE=17, LOCALS=18, TREE=19, 
		SCOPE=20, OPEN_ELEMENT_OPTION=21, CLOSE_ELEMENT_OPTION=22, AMPERSAND=23, 
		COMMA=24, QUESTION=25, TREE_BEGIN=26, LPAREN=27, RPAREN=28, COLON=29, 
		STAR=30, PLUS=31, ASSIGN=32, PLUS_ASSIGN=33, IMPLIES=34, REWRITE=35, SEMI=36, 
		ROOT=37, BANG=38, OR=39, WILDCARD=40, ETC=41, RANGE=42, NOT=43, LBRACK=44, 
		RBRACK=45, LCURLY=46, RCURLY=47, DOLLAR=48, LABEL=49, IDENTIFIER=50, INT=51, 
		DIRECTIVE=52, REFERENCE=53, WS=54, NEWLINE=55, COMMENT=56, ML_COMMENT=57, 
		CHAR_LITERAL=58, STRING_LITERAL=59, ANYCHAR=60, BlockComment_NEWLINE=61, 
		CONTINUE_ML_COMMENT=62, END_ML_COMMENT=63, ML_COMMENT_STAR=64, BlockComment_ANYCHAR=65, 
		ArgAction_NEWLINE=66, ArgAction_LBRACK=67, ArgAction_RBRACK=68, ArgAction_TEXT=69, 
		ArgAction_CHAR_LITERAL=70, ArgAction_STRING_LITERAL=71, ArgAction_ESCAPE=72, 
		ArgAction_REFERENCE=73, ArgAction_SPECIAL=74, ArgAction_ANYCHAR=75, NonActionBrace_NEWLINE=76, 
		NonActionBrace_WS=77, NonActionBrace_LCURLY=78, Action_NEWLINE=79, Action_COMMENT=80, 
		Action_ML_COMMENT=81, Action_LCURLY=82, Action_RCURLY=83, Action_TEXT=84, 
		Action_CHAR_LITERAL=85, Action_STRING_LITERAL=86, Action_ESCAPE=87, Action_REFERENCE=88, 
		Action_SPECIAL=89, Action_ANYCHAR=90, LexerCharSet_NEWLINE=91, LexerCharSet_ESCAPE=92, 
		LexerCharSet_TEXT=93, LexerCharSet_RBRACK=94;
	public static final int BlockComment = 1;
	public static final int ArgAction = 2;
	public static final int NonActionBrace = 3;
	public static final int Action = 4;
	public static final int LexerCharSet = 5;
	public static String[] modeNames = {
		"DEFAULT_MODE", "BlockComment", "ArgAction", "NonActionBrace", "Action", 
		"LexerCharSet"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"InvalidGrammarOption", "ValidGrammarOption", "'lexer'", "'parser'", "'catch'", 
		"'finally'", "'grammar'", "'private'", "'protected'", "'public'", "'returns'", 
		"'throws'", "'import'", "'fragment'", "TOKENS", "OPTIONS", "'mode'", "'locals'", 
		"'tree'", "'scope'", "'<'", "'>'", "'@'", "','", "'?'", "'^('", "'('", 
		"')'", "':'", "STAR", "'+'", "'='", "'+='", "'=>'", "'->'", "';'", "'^'", 
		"'!'", "'|'", "'.'", "'...'", "'..'", "'~'", "'['", "']'", "LCURLY", "'}'", 
		"'$'", "LABEL", "IDENTIFIER", "INT", "DIRECTIVE", "REFERENCE", "WS", "NEWLINE", 
		"COMMENT", "ML_COMMENT", "CHAR_LITERAL", "STRING_LITERAL", "ANYCHAR", 
		"BlockComment_NEWLINE", "CONTINUE_ML_COMMENT", "'*/'", "'*'", "BlockComment_ANYCHAR", 
		"ArgAction_NEWLINE", "ArgAction_LBRACK", "ArgAction_RBRACK", "ArgAction_TEXT", 
		"ArgAction_CHAR_LITERAL", "ArgAction_STRING_LITERAL", "ArgAction_ESCAPE", 
		"ArgAction_REFERENCE", "ArgAction_SPECIAL", "ArgAction_ANYCHAR", "NonActionBrace_NEWLINE", 
		"NonActionBrace_WS", "NonActionBrace_LCURLY", "Action_NEWLINE", "Action_COMMENT", 
		"Action_ML_COMMENT", "Action_LCURLY", "Action_RCURLY", "Action_TEXT", 
		"Action_CHAR_LITERAL", "Action_STRING_LITERAL", "Action_ESCAPE", "Action_REFERENCE", 
		"Action_SPECIAL", "Action_ANYCHAR", "LexerCharSet_NEWLINE", "LexerCharSet_ESCAPE", 
		"LexerCharSet_TEXT", "LexerCharSet_RBRACK"
	};
	public static final String[] ruleNames = {
		"LEXER", "PARSER", "CATCH", "FINALLY", "GRAMMAR", "PRIVATE", "PROTECTED", 
		"PUBLIC", "RETURNS", "THROWS", "IMPORT", "FRAGMENT", "TOKENS", "OPTIONS", 
		"MODE", "LOCALS", "TREE", "SCOPE", "OPEN_ELEMENT_OPTION", "CLOSE_ELEMENT_OPTION", 
		"AMPERSAND", "COMMA", "QUESTION", "TREE_BEGIN", "LPAREN", "RPAREN", "COLON", 
		"STAR", "PLUS", "ASSIGN", "PLUS_ASSIGN", "IMPLIES", "REWRITE", "SEMI", 
		"ROOT", "BANG", "OR", "WILDCARD", "ETC", "RANGE", "NOT", "LBRACK", "RBRACK", 
		"LCURLY", "RCURLY", "DOLLAR", "LABEL", "IDENTIFIER", "INT", "DIRECTIVE", 
		"REFERENCE", "WS", "NEWLINE", "COMMENT", "ML_COMMENT", "CHAR_LITERAL", 
		"STRING_LITERAL", "IGNORED", "XDIGIT", "ANYCHAR", "BlockComment_NEWLINE", 
		"CONTINUE_ML_COMMENT", "END_ML_COMMENT", "ML_COMMENT_STAR", "BlockComment_ANYCHAR", 
		"ArgAction_NEWLINE", "ArgAction_LBRACK", "ArgAction_RBRACK", "ArgAction_TEXT", 
		"ArgAction_CHAR_LITERAL", "ArgAction_STRING_LITERAL", "ArgAction_ESCAPE", 
		"ArgAction_REFERENCE", "ArgAction_SPECIAL", "ArgAction_ANYCHAR", "NonActionBrace_NEWLINE", 
		"NonActionBrace_WS", "NonActionBrace_LCURLY", "Action_NEWLINE", "Action_COMMENT", 
		"Action_ML_COMMENT", "Action_LCURLY", "Action_RCURLY", "Action_TEXT", 
		"Action_CHAR_LITERAL", "Action_STRING_LITERAL", "Action_ESCAPE", "Action_REFERENCE", 
		"Action_SPECIAL", "Action_ANYCHAR", "LexerCharSet_NEWLINE", "LexerCharSet_ESCAPE", 
		"LexerCharSet_TEXT", "LexerCharSet_RBRACK"
	};


	protected int getMultilineCommentType() {
	    return _modeStack.peek()==DEFAULT_MODE ? ML_COMMENT : Action_ML_COMMENT;
	}

	protected void handleBeginArgAction() {
	    throw new UnsupportedOperationException();
	}


	public GrammarHighlighterLexerBase(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN);
	}

	@Override
	public String getGrammarFileName() { return "GrammarHighlighterLexerBase.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }


	@Override
	public void action(RuleContext<Integer> _localctx, int ruleIndex, int actionIndex) {
		switch ( ruleIndex ) {
			case 0 : LEXER_action(_localctx, actionIndex); break;

			case 1 : PARSER_action(_localctx, actionIndex); break;

			case 2 : CATCH_action(_localctx, actionIndex); break;

			case 3 : FINALLY_action(_localctx, actionIndex); break;

			case 4 : GRAMMAR_action(_localctx, actionIndex); break;

			case 5 : PRIVATE_action(_localctx, actionIndex); break;

			case 6 : PROTECTED_action(_localctx, actionIndex); break;

			case 7 : PUBLIC_action(_localctx, actionIndex); break;

			case 8 : RETURNS_action(_localctx, actionIndex); break;

			case 9 : THROWS_action(_localctx, actionIndex); break;

			case 10 : IMPORT_action(_localctx, actionIndex); break;

			case 11 : FRAGMENT_action(_localctx, actionIndex); break;

			case 12 : TOKENS_action(_localctx, actionIndex); break;

			case 13 : OPTIONS_action(_localctx, actionIndex); break;

			case 14 : MODE_action(_localctx, actionIndex); break;

			case 15 : LOCALS_action(_localctx, actionIndex); break;

			case 16 : TREE_action(_localctx, actionIndex); break;

			case 17 : SCOPE_action(_localctx, actionIndex); break;

			case 18 : OPEN_ELEMENT_OPTION_action(_localctx, actionIndex); break;

			case 19 : CLOSE_ELEMENT_OPTION_action(_localctx, actionIndex); break;

			case 20 : AMPERSAND_action(_localctx, actionIndex); break;

			case 21 : COMMA_action(_localctx, actionIndex); break;

			case 22 : QUESTION_action(_localctx, actionIndex); break;

			case 23 : TREE_BEGIN_action(_localctx, actionIndex); break;

			case 24 : LPAREN_action(_localctx, actionIndex); break;

			case 25 : RPAREN_action(_localctx, actionIndex); break;

			case 26 : COLON_action(_localctx, actionIndex); break;

			case 27 : STAR_action(_localctx, actionIndex); break;

			case 28 : PLUS_action(_localctx, actionIndex); break;

			case 29 : ASSIGN_action(_localctx, actionIndex); break;

			case 30 : PLUS_ASSIGN_action(_localctx, actionIndex); break;

			case 31 : IMPLIES_action(_localctx, actionIndex); break;

			case 32 : REWRITE_action(_localctx, actionIndex); break;

			case 33 : SEMI_action(_localctx, actionIndex); break;

			case 34 : ROOT_action(_localctx, actionIndex); break;

			case 35 : BANG_action(_localctx, actionIndex); break;

			case 36 : OR_action(_localctx, actionIndex); break;

			case 37 : WILDCARD_action(_localctx, actionIndex); break;

			case 38 : ETC_action(_localctx, actionIndex); break;

			case 39 : RANGE_action(_localctx, actionIndex); break;

			case 40 : NOT_action(_localctx, actionIndex); break;

			case 41 : LBRACK_action(_localctx, actionIndex); break;

			case 42 : RBRACK_action(_localctx, actionIndex); break;

			case 43 : LCURLY_action(_localctx, actionIndex); break;

			case 44 : RCURLY_action(_localctx, actionIndex); break;

			case 45 : DOLLAR_action(_localctx, actionIndex); break;

			case 46 : LABEL_action(_localctx, actionIndex); break;

			case 47 : IDENTIFIER_action(_localctx, actionIndex); break;

			case 48 : INT_action(_localctx, actionIndex); break;

			case 49 : DIRECTIVE_action(_localctx, actionIndex); break;

			case 50 : REFERENCE_action(_localctx, actionIndex); break;

			case 51 : WS_action(_localctx, actionIndex); break;

			case 52 : NEWLINE_action(_localctx, actionIndex); break;

			case 53 : COMMENT_action(_localctx, actionIndex); break;

			case 54 : ML_COMMENT_action(_localctx, actionIndex); break;

			case 55 : CHAR_LITERAL_action(_localctx, actionIndex); break;

			case 56 : STRING_LITERAL_action(_localctx, actionIndex); break;

			case 57 : IGNORED_action(_localctx, actionIndex); break;

			case 58 : XDIGIT_action(_localctx, actionIndex); break;

			case 59 : ANYCHAR_action(_localctx, actionIndex); break;

			case 60 : BlockComment_NEWLINE_action(_localctx, actionIndex); break;

			case 61 : CONTINUE_ML_COMMENT_action(_localctx, actionIndex); break;

			case 62 : END_ML_COMMENT_action(_localctx, actionIndex); break;

			case 63 : ML_COMMENT_STAR_action(_localctx, actionIndex); break;

			case 64 : BlockComment_ANYCHAR_action(_localctx, actionIndex); break;

			case 65 : ArgAction_NEWLINE_action(_localctx, actionIndex); break;

			case 66 : ArgAction_LBRACK_action(_localctx, actionIndex); break;

			case 67 : ArgAction_RBRACK_action(_localctx, actionIndex); break;

			case 68 : ArgAction_TEXT_action(_localctx, actionIndex); break;

			case 69 : ArgAction_CHAR_LITERAL_action(_localctx, actionIndex); break;

			case 70 : ArgAction_STRING_LITERAL_action(_localctx, actionIndex); break;

			case 71 : ArgAction_ESCAPE_action(_localctx, actionIndex); break;

			case 72 : ArgAction_REFERENCE_action(_localctx, actionIndex); break;

			case 73 : ArgAction_SPECIAL_action(_localctx, actionIndex); break;

			case 74 : ArgAction_ANYCHAR_action(_localctx, actionIndex); break;

			case 75 : NonActionBrace_NEWLINE_action(_localctx, actionIndex); break;

			case 76 : NonActionBrace_WS_action(_localctx, actionIndex); break;

			case 77 : NonActionBrace_LCURLY_action(_localctx, actionIndex); break;

			case 78 : Action_NEWLINE_action(_localctx, actionIndex); break;

			case 79 : Action_COMMENT_action(_localctx, actionIndex); break;

			case 80 : Action_ML_COMMENT_action(_localctx, actionIndex); break;

			case 81 : Action_LCURLY_action(_localctx, actionIndex); break;

			case 82 : Action_RCURLY_action(_localctx, actionIndex); break;

			case 83 : Action_TEXT_action(_localctx, actionIndex); break;

			case 84 : Action_CHAR_LITERAL_action(_localctx, actionIndex); break;

			case 85 : Action_STRING_LITERAL_action(_localctx, actionIndex); break;

			case 86 : Action_ESCAPE_action(_localctx, actionIndex); break;

			case 87 : Action_REFERENCE_action(_localctx, actionIndex); break;

			case 88 : Action_SPECIAL_action(_localctx, actionIndex); break;

			case 89 : Action_ANYCHAR_action(_localctx, actionIndex); break;

			case 90 : LexerCharSet_NEWLINE_action(_localctx, actionIndex); break;

			case 91 : LexerCharSet_ESCAPE_action(_localctx, actionIndex); break;

			case 92 : LexerCharSet_TEXT_action(_localctx, actionIndex); break;

			case 93 : LexerCharSet_RBRACK_action(_localctx, actionIndex); break;
		}
	}
	public void DOLLAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void CLOSE_ELEMENT_OPTION_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void PROTECTED_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_NEWLINE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 10 : _type = NEWLINE;  break;
		}
	}
	public void END_ML_COMMENT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 2 : _type =  getMultilineCommentType(); popMode(); break;
		}
	}
	public void STAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LBRACK_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 0 : handleBeginArgAction(); break;
		}
	}
	public void NonActionBrace_NEWLINE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 15 : _type = NEWLINE;  break;
		}
	}
	public void FRAGMENT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_STRING_LITERAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LexerCharSet_ESCAPE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NOT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_SPECIAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 22 : _type = Action_TEXT;  break;
		}
	}
	public void Action_NEWLINE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 18 : _type = NEWLINE;  break;
		}
	}
	public void DIRECTIVE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void TREE_BEGIN_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LPAREN_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_REFERENCE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ML_COMMENT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 7 : pushMode(BlockComment);  break;
		}
	}
	public void RPAREN_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void IMPORT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_CHAR_LITERAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void STRING_LITERAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_ANYCHAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 14 : _type = ANYCHAR;  break;
		}
	}
	public void SCOPE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void TREE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ETC_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void COMMA_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void IDENTIFIER_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_RCURLY_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 21 : popMode(); _type = Action_TEXT;  break;
		}
	}
	public void NonActionBrace_WS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 16 : _type = WS;  break;
		}
	}
	public void WILDCARD_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_ESCAPE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ANYCHAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void PLUS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_ML_COMMENT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 19 : pushMode(BlockComment);  break;
		}
	}
	public void IGNORED_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_ANYCHAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 23 : _type = ANYCHAR;  break;
		}
	}
	public void ML_COMMENT_STAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 3 : _type =  getMultilineCommentType(); break;
		}
	}
	public void COMMENT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_REFERENCE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void MODE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void GRAMMAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_SPECIAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 13 : _type = Action_TEXT;  break;
		}
	}
	public void RETURNS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LexerCharSet_TEXT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void RBRACK_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LOCALS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LexerCharSet_NEWLINE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 24 : _type = NEWLINE; popMode();  break;
		}
	}
	public void ArgAction_CHAR_LITERAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void IMPLIES_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void PRIVATE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_LBRACK_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 11 : _type = LBRACK; pushMode(ArgAction);  break;
		}
	}
	public void ArgAction_RBRACK_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 12 : _type = RBRACK; popMode();  break;
		}
	}
	public void AMPERSAND_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void REFERENCE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void TOKENS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 4 : pushMode(NonActionBrace);  break;
		}
	}
	public void RANGE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void THROWS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LCURLY_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 6 : _type = Action_TEXT; pushMode(Action);  break;
		}
	}
	public void BANG_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void INT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void SEMI_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ROOT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void NonActionBrace_LCURLY_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 17 : _type = LCURLY; popMode();  break;
		}
	}
	public void REWRITE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void COLON_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_STRING_LITERAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void OPEN_ELEMENT_OPTION_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void WS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_COMMENT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void BlockComment_ANYCHAR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 9 : _type = ANYCHAR;  break;
		}
	}
	public void NEWLINE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void QUESTION_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void CHAR_LITERAL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void FINALLY_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_ESCAPE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LABEL_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LEXER_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void LexerCharSet_RBRACK_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 25 : _type = RBRACK; popMode();  break;
		}
	}
	public void XDIGIT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ArgAction_TEXT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void CONTINUE_ML_COMMENT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 1 : _type =  getMultilineCommentType(); break;
		}
	}
	public void OR_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void RCURLY_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void ASSIGN_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void PLUS_ASSIGN_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_TEXT_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void Action_LCURLY_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 20 : pushMode(Action); _type = Action_TEXT;  break;
		}
	}
	public void CATCH_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void PARSER_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void PUBLIC_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
		}
	}
	public void OPTIONS_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 5 : pushMode(NonActionBrace);  break;
		}
	}
	public void BlockComment_NEWLINE_action(RuleContext<Integer> _localctx, int actionIndex) {
		switch ( actionIndex ) {
			case 8 : _type = NEWLINE;  break;
		}
	}

	public static final String _serializedATN =
		"\2^\u02c9\6\uffff\6\uffff\6\uffff\6\uffff\6\uffff\6\uffff\2\0\7\0\2\1"+
		"\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2"+
		"\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16\7\16\2\17\7\17\2\20\7\20\2\21\7"+
		"\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25\7\25\2\26\7\26\2\27\7\27\2\30\7"+
		"\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34\7\34\2\35\7\35\2\36\7\36\2\37\7"+
		"\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2%\7%\2&\7&\2\'\7\'\2(\7(\2)\7)\2"+
		"*\7*\2+\7+\2,\7,\2-\7-\2.\7.\2/\7/\2\60\7\60\2\61\7\61\2\62\7\62\2\63"+
		"\7\63\2\64\7\64\2\65\7\65\2\66\7\66\2\67\7\67\28\78\29\79\2:\7:\2;\7;"+
		"\2<\7<\2=\7=\2>\7>\2?\7?\2@\7@\2A\7A\2B\7B\2C\7C\2D\7D\2E\7E\2F\7F\2G"+
		"\7G\2H\7H\2I\7I\2J\7J\2K\7K\2L\7L\2M\7M\2N\7N\2O\7O\2P\7P\2Q\7Q\2R\7R"+
		"\2S\7S\2T\7T\2U\7U\2V\7V\2W\7W\2X\7X\2Y\7Y\2Z\7Z\2[\7[\2\\\7\\\2]\7]\1"+
		"\0\1\0\1\0\1\0\1\0\1\0\1\1\1\1\1\1\1\1\1\1\1\1\1\1\1\2\1\2\1\2\1\2\1\2"+
		"\1\2\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\3\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1\4\1"+
		"\5\1\5\1\5\1\5\1\5\1\5\1\5\1\5\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6\1\6"+
		"\1\7\1\7\1\7\1\7\1\7\1\7\1\7\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\b\1\t\1\t\1"+
		"\t\1\t\1\t\1\t\1\t\1\n\1\n\1\n\1\n\1\n\1\n\1\n\1\13\1\13\1\13\1\13\1\13"+
		"\1\13\1\13\1\13\1\13\1\f\1\f\1\f\1\f\1\f\1\f\1\f\1\f\0\1\f\1\f\1\f\1\f"+
		"\1\r\1\r\1\r\1\r\1\r\1\r\1\r\1\r\1\r\0\1\r\1\r\1\r\1\r\1\16\1\16\1\16"+
		"\1\16\1\16\1\17\1\17\1\17\1\17\1\17\1\17\1\17\1\20\1\20\1\20\1\20\1\20"+
		"\1\21\1\21\1\21\1\21\1\21\1\21\1\22\1\22\1\23\1\23\1\24\1\24\1\25\1\25"+
		"\1\26\1\26\1\27\1\27\1\27\1\30\1\30\1\31\1\31\1\32\1\32\1\33\1\33\1\34"+
		"\1\34\1\35\1\35\1\36\1\36\1\36\1\37\1\37\1\37\1 \1 \1 \1!\1!\1\"\1\"\1"+
		"#\1#\1$\1$\1%\1%\1&\1&\1&\1&\1\'\1\'\1\'\1(\1(\1)\0\1)\1)\1*\1*\1+\1+"+
		"\1+\1+\1,\1,\1-\1-\1.\0\1.\0\1.\0\3.\b.\1.\1.\1/\0\1/\0\5/\b/\n/\f/\u01a4"+
		"\t/\1\60\0\4\60\b\60\13\60\f\60\u01a9\1\61\0\1\61\1\61\1\62\0\1\62\1\62"+
		"\1\63\0\4\63\b\63\13\63\f\63\u01b7\1\64\0\3\64\b\64\1\64\1\64\1\65\1\65"+
		"\1\65\1\65\0\5\65\b\65\n\65\f\65\u01c8\t\65\1\66\1\66\1\66\1\66\1\66\1"+
		"\67\0\1\67\0\1\67\0\1\67\0\5\67\b\67\n\67\f\67\u01da\t\67\1\67\0\3\67"+
		"\b\67\18\0\18\0\18\0\18\0\58\b8\n8\f8\u01eb\t8\18\0\38\b8\19\0\59\b9\n"+
		"9\f9\u01f6\t9\1:\0\1:\0\1:\0\3:\b:\1;\1;\1<\1<\1<\1<\1=\0\4=\b=\13=\f"+
		"=\u0209\1=\1=\1>\1>\1>\1>\1>\1?\0\1?\1?\1@\1@\1@\1@\1A\1A\1A\1A\1B\1B"+
		"\1B\1B\1C\1C\1C\1C\1D\0\4D\bD\13D\fD\u022a\1E\1E\1F\1F\1G\0\1G\0\1G\0"+
		"\1G\0\1G\0\1G\0\1G\0\1G\0\1G\0\1G\0\1G\0\1G\0\1G\0\1G\0\1G\0\1G\1G\3G"+
		"\bG\1H\1H\1I\1I\1I\1I\1J\1J\1J\1J\1K\1K\1K\1K\1L\1L\1L\1L\1M\1M\1M\1M"+
		"\1N\1N\1N\1N\1O\1O\1O\1O\0\5O\bO\nO\fO\u0275\tO\1P\1P\1P\1P\1P\1Q\1Q\1"+
		"Q\1Q\1R\1R\1R\1R\1S\0\4S\bS\13S\fS\u0287\1T\1T\1U\1U\1V\0\1V\0\1V\0\1"+
		"V\0\1V\0\1V\0\1V\0\1V\0\1V\0\1V\0\1V\0\1V\0\1V\0\1V\0\1V\1V\3V\bV\1W\1"+
		"W\1X\1X\1X\1X\1Y\1Y\1Y\1Y\1Z\1Z\1Z\1Z\1[\0\1[\1[\1\\\0\4\\\b\\\13\\\f"+
		"\\\u02c3\1]\1]\1]\1]^\6\3\uffff\b\4\uffff\n\5\uffff\f\6\uffff\16\7\uffff"+
		"\20\b\uffff\22\t\uffff\24\n\uffff\26\13\uffff\30\f\uffff\32\r\uffff\34"+
		"\16\uffff\36\17\4 \20\5\"\21\uffff$\22\uffff&\23\uffff(\24\uffff*\25\uffff"+
		",\26\uffff.\27\uffff\60\30\uffff\62\31\uffff\64\32\uffff\66\33\uffff8"+
		"\34\uffff:\35\uffff<\36\uffff>\37\uffff@ \uffffB!\uffffD\"\uffffF#\uffff"+
		"H$\uffffJ%\uffffL&\uffffN\'\uffffP(\uffffR)\uffffT*\uffffV+\uffffX,\0"+
		"Z-\uffff\\.\6^/\uffff`\60\uffffb\61\uffffd\62\ufffff\63\uffffh\64\uffff"+
		"j\65\uffffl\66\uffffn\67\uffffp8\uffffr9\7t:\uffffv;\uffffx\0\uffffz\0"+
		"\uffff|<\uffff~=\b\u0080>\1\u0082?\2\u0084@\3\u0086A\t\u0088B\n\u008a"+
		"C\13\u008cD\f\u008eE\uffff\u0090F\uffff\u0092G\uffff\u0094H\uffff\u0096"+
		"I\uffff\u0098J\r\u009aK\16\u009cL\17\u009eM\20\u00a0N\21\u00a2O\22\u00a4"+
		"P\uffff\u00a6Q\23\u00a8R\24\u00aaS\25\u00acT\uffff\u00aeU\uffff\u00b0"+
		"V\uffff\u00b2W\uffff\u00b4X\uffff\u00b6Y\26\u00b8Z\27\u00ba[\30\u00bc"+
		"\\\uffff\u00be]\uffff\u00c0^\31\6\0\1\2\3\4\5\16\3AZ__az\4\609AZ__az\2"+
		"\t\t  \2\n\n\r\r\4\n\n\r\r\'\'\\\\\4\n\n\r\r\"\"\\\\\3\t\n\r\r  \3\n\n"+
		"\r\r**\t\n\n\r\r\"\"$$\'\'//[]{{}}\3$$//\\\\\2\n\n\r\r\t\n\n\r\r\"\"$"+
		"$\'\'//\\\\{{}}\3$$//\\\\\3\n\n\r\r\\]\u02a8\0\6\1\0\0\0\0\b\1\0\0\0\0"+
		"\n\1\0\0\0\0\f\1\0\0\0\0\16\1\0\0\0\0\20\1\0\0\0\0\22\1\0\0\0\0\24\1\0"+
		"\0\0\0\26\1\0\0\0\0\30\1\0\0\0\0\32\1\0\0\0\0\34\1\0\0\0\0\36\1\0\0\0"+
		"\0 \1\0\0\0\0\"\1\0\0\0\0$\1\0\0\0\0&\1\0\0\0\0(\1\0\0\0\0*\1\0\0\0\0"+
		",\1\0\0\0\0.\1\0\0\0\0\60\1\0\0\0\0\62\1\0\0\0\0\64\1\0\0\0\0\66\1\0\0"+
		"\0\08\1\0\0\0\0:\1\0\0\0\0<\1\0\0\0\0>\1\0\0\0\0@\1\0\0\0\0B\1\0\0\0\0"+
		"D\1\0\0\0\0F\1\0\0\0\0H\1\0\0\0\0J\1\0\0\0\0L\1\0\0\0\0N\1\0\0\0\0P\1"+
		"\0\0\0\0R\1\0\0\0\0T\1\0\0\0\0V\1\0\0\0\0X\1\0\0\0\0Z\1\0\0\0\0\\\1\0"+
		"\0\0\0^\1\0\0\0\0`\1\0\0\0\0b\1\0\0\0\0d\1\0\0\0\0f\1\0\0\0\0h\1\0\0\0"+
		"\0j\1\0\0\0\0l\1\0\0\0\0n\1\0\0\0\0p\1\0\0\0\0r\1\0\0\0\0t\1\0\0\0\0v"+
		"\1\0\0\0\0|\1\0\0\0\1~\1\0\0\0\1\u0080\1\0\0\0\1\u0082\1\0\0\0\1\u0084"+
		"\1\0\0\0\1\u0086\1\0\0\0\2\u0088\1\0\0\0\2\u008a\1\0\0\0\2\u008c\1\0\0"+
		"\0\2\u008e\1\0\0\0\2\u0090\1\0\0\0\2\u0092\1\0\0\0\2\u0094\1\0\0\0\2\u0096"+
		"\1\0\0\0\2\u0098\1\0\0\0\2\u009a\1\0\0\0\3\u009c\1\0\0\0\3\u009e\1\0\0"+
		"\0\3\u00a0\1\0\0\0\4\u00a2\1\0\0\0\4\u00a4\1\0\0\0\4\u00a6\1\0\0\0\4\u00a8"+
		"\1\0\0\0\4\u00aa\1\0\0\0\4\u00ac\1\0\0\0\4\u00ae\1\0\0\0\4\u00b0\1\0\0"+
		"\0\4\u00b2\1\0\0\0\4\u00b4\1\0\0\0\4\u00b6\1\0\0\0\4\u00b8\1\0\0\0\5\u00ba"+
		"\1\0\0\0\5\u00bc\1\0\0\0\5\u00be\1\0\0\0\5\u00c0\1\0\0\0\6\u00c2\1\0\0"+
		"\0\b\u00c8\1\0\0\0\n\u00cf\1\0\0\0\f\u00d5\1\0\0\0\16\u00dd\1\0\0\0\20"+
		"\u00e5\1\0\0\0\22\u00ed\1\0\0\0\24\u00f7\1\0\0\0\26\u00fe\1\0\0\0\30\u0106"+
		"\1\0\0\0\32\u010d\1\0\0\0\34\u0114\1\0\0\0\36\u011d\1\0\0\0 \u012a\1\0"+
		"\0\0\"\u0138\1\0\0\0$\u013d\1\0\0\0&\u0144\1\0\0\0(\u0149\1\0\0\0*\u014f"+
		"\1\0\0\0,\u0151\1\0\0\0.\u0153\1\0\0\0\60\u0155\1\0\0\0\62\u0157\1\0\0"+
		"\0\64\u0159\1\0\0\0\66\u015c\1\0\0\08\u015e\1\0\0\0:\u0160\1\0\0\0<\u0162"+
		"\1\0\0\0>\u0164\1\0\0\0@\u0166\1\0\0\0B\u0168\1\0\0\0D\u016b\1\0\0\0F"+
		"\u016e\1\0\0\0H\u0171\1\0\0\0J\u0173\1\0\0\0L\u0175\1\0\0\0N\u0177\1\0"+
		"\0\0P\u0179\1\0\0\0R\u017b\1\0\0\0T\u017f\1\0\0\0V\u0182\1\0\0\0X\u0184"+
		"\1\0\0\0Z\u0188\1\0\0\0\\\u018a\1\0\0\0^\u018e\1\0\0\0`\u0190\1\0\0\0"+
		"b\u0192\1\0\0\0d\u019c\1\0\0\0f\u01a7\1\0\0\0h\u01ab\1\0\0\0j\u01af\1"+
		"\0\0\0l\u01b5\1\0\0\0n\u01bb\1\0\0\0p\u01bf\1\0\0\0r\u01c9\1\0\0\0t\u01ce"+
		"\1\0\0\0v\u01df\1\0\0\0x\u01f4\1\0\0\0z\u01fd\1\0\0\0|\u01ff\1\0\0\0~"+
		"\u0201\1\0\0\0\u0080\u0207\1\0\0\0\u0082\u020d\1\0\0\0\u0084\u0212\1\0"+
		"\0\0\u0086\u0216\1\0\0\0\u0088\u021a\1\0\0\0\u008a\u021e\1\0\0\0\u008c"+
		"\u0222\1\0\0\0\u008e\u0228\1\0\0\0\u0090\u022c\1\0\0\0\u0092\u022e\1\0"+
		"\0\0\u0094\u0230\1\0\0\0\u0096\u0252\1\0\0\0\u0098\u0254\1\0\0\0\u009a"+
		"\u0258\1\0\0\0\u009c\u025c\1\0\0\0\u009e\u0260\1\0\0\0\u00a0\u0264\1\0"+
		"\0\0\u00a2\u0268\1\0\0\0\u00a4\u026c\1\0\0\0\u00a6\u0276\1\0\0\0\u00a8"+
		"\u027b\1\0\0\0\u00aa\u027f\1\0\0\0\u00ac\u0285\1\0\0\0\u00ae\u0289\1\0"+
		"\0\0\u00b0\u028b\1\0\0\0\u00b2\u028d\1\0\0\0\u00b4\u02ad\1\0\0\0\u00b6"+
		"\u02af\1\0\0\0\u00b8\u02b3\1\0\0\0\u00ba\u02b7\1\0\0\0\u00bc\u02bb\1\0"+
		"\0\0\u00be\u02c1\1\0\0\0\u00c0\u02c5\1\0\0\0\u00c2\u00c3\5l\0\0\u00c3"+
		"\u00c4\5e\0\0\u00c4\u00c5\5x\0\0\u00c5\u00c6\5e\0\0\u00c6\u00c7\5r\0\0"+
		"\u00c7\7\1\0\0\0\u00c8\u00c9\5p\0\0\u00c9\u00ca\5a\0\0\u00ca\u00cb\5r"+
		"\0\0\u00cb\u00cc\5s\0\0\u00cc\u00cd\5e\0\0\u00cd\u00ce\5r\0\0\u00ce\t"+
		"\1\0\0\0\u00cf\u00d0\5c\0\0\u00d0\u00d1\5a\0\0\u00d1\u00d2\5t\0\0\u00d2"+
		"\u00d3\5c\0\0\u00d3\u00d4\5h\0\0\u00d4\13\1\0\0\0\u00d5\u00d6\5f\0\0\u00d6"+
		"\u00d7\5i\0\0\u00d7\u00d8\5n\0\0\u00d8\u00d9\5a\0\0\u00d9\u00da\5l\0\0"+
		"\u00da\u00db\5l\0\0\u00db\u00dc\5y\0\0\u00dc\r\1\0\0\0\u00dd\u00de\5g"+
		"\0\0\u00de\u00df\5r\0\0\u00df\u00e0\5a\0\0\u00e0\u00e1\5m\0\0\u00e1\u00e2"+
		"\5m\0\0\u00e2\u00e3\5a\0\0\u00e3\u00e4\5r\0\0\u00e4\17\1\0\0\0\u00e5\u00e6"+
		"\5p\0\0\u00e6\u00e7\5r\0\0\u00e7\u00e8\5i\0\0\u00e8\u00e9\5v\0\0\u00e9"+
		"\u00ea\5a\0\0\u00ea\u00eb\5t\0\0\u00eb\u00ec\5e\0\0\u00ec\21\1\0\0\0\u00ed"+
		"\u00ee\5p\0\0\u00ee\u00ef\5r\0\0\u00ef\u00f0\5o\0\0\u00f0\u00f1\5t\0\0"+
		"\u00f1\u00f2\5e\0\0\u00f2\u00f3\5c\0\0\u00f3\u00f4\5t\0\0\u00f4\u00f5"+
		"\5e\0\0\u00f5\u00f6\5d\0\0\u00f6\23\1\0\0\0\u00f7\u00f8\5p\0\0\u00f8\u00f9"+
		"\5u\0\0\u00f9\u00fa\5b\0\0\u00fa\u00fb\5l\0\0\u00fb\u00fc\5i\0\0\u00fc"+
		"\u00fd\5c\0\0\u00fd\25\1\0\0\0\u00fe\u00ff\5r\0\0\u00ff\u0100\5e\0\0\u0100"+
		"\u0101\5t\0\0\u0101\u0102\5u\0\0\u0102\u0103\5r\0\0\u0103\u0104\5n\0\0"+
		"\u0104\u0105\5s\0\0\u0105\27\1\0\0\0\u0106\u0107\5t\0\0\u0107\u0108\5"+
		"h\0\0\u0108\u0109\5r\0\0\u0109\u010a\5o\0\0\u010a\u010b\5w\0\0\u010b\u010c"+
		"\5s\0\0\u010c\31\1\0\0\0\u010d\u010e\5i\0\0\u010e\u010f\5m\0\0\u010f\u0110"+
		"\5p\0\0\u0110\u0111\5o\0\0\u0111\u0112\5r\0\0\u0112\u0113\5t\0\0\u0113"+
		"\33\1\0\0\0\u0114\u0115\5f\0\0\u0115\u0116\5r\0\0\u0116\u0117\5a\0\0\u0117"+
		"\u0118\5g\0\0\u0118\u0119\5m\0\0\u0119\u011a\5e\0\0\u011a\u011b\5n\0\0"+
		"\u011b\u011c\5t\0\0\u011c\35\1\0\0\0\u011d\u011e\5t\0\0\u011e\u011f\5"+
		"o\0\0\u011f\u0120\5k\0\0\u0120\u0121\5e\0\0\u0121\u0122\5n\0\0\u0122\u0123"+
		"\5s\0\0\u0123\u0124\1\0\0\0\u0124\u0126\3x9\0\u0126\u0127\5{\0\0\u0127"+
		"\u0128\1\0\0\0\u0128\u0129\6\f\4\0\u0129\37\1\0\0\0\u012a\u012b\5o\0\0"+
		"\u012b\u012c\5p\0\0\u012c\u012d\5t\0\0\u012d\u012e\5i\0\0\u012e\u012f"+
		"\5o\0\0\u012f\u0130\5n\0\0\u0130\u0131\5s\0\0\u0131\u0132\1\0\0\0\u0132"+
		"\u0134\3x9\0\u0134\u0135\5{\0\0\u0135\u0136\1\0\0\0\u0136\u0137\6\r\5"+
		"\0\u0137!\1\0\0\0\u0138\u0139\5m\0\0\u0139\u013a\5o\0\0\u013a\u013b\5"+
		"d\0\0\u013b\u013c\5e\0\0\u013c#\1\0\0\0\u013d\u013e\5l\0\0\u013e\u013f"+
		"\5o\0\0\u013f\u0140\5c\0\0\u0140\u0141\5a\0\0\u0141\u0142\5l\0\0\u0142"+
		"\u0143\5s\0\0\u0143%\1\0\0\0\u0144\u0145\5t\0\0\u0145\u0146\5r\0\0\u0146"+
		"\u0147\5e\0\0\u0147\u0148\5e\0\0\u0148\'\1\0\0\0\u0149\u014a\5s\0\0\u014a"+
		"\u014b\5c\0\0\u014b\u014c\5o\0\0\u014c\u014d\5p\0\0\u014d\u014e\5e\0\0"+
		"\u014e)\1\0\0\0\u014f\u0150\5<\0\0\u0150+\1\0\0\0\u0151\u0152\5>\0\0\u0152"+
		"-\1\0\0\0\u0153\u0154\5@\0\0\u0154/\1\0\0\0\u0155\u0156\5,\0\0\u0156\61"+
		"\1\0\0\0\u0157\u0158\5?\0\0\u0158\63\1\0\0\0\u0159\u015a\5^\0\0\u015a"+
		"\u015b\5(\0\0\u015b\65\1\0\0\0\u015c\u015d\5(\0\0\u015d\67\1\0\0\0\u015e"+
		"\u015f\5)\0\0\u015f9\1\0\0\0\u0160\u0161\5:\0\0\u0161;\1\0\0\0\u0162\u0163"+
		"\5*\0\0\u0163=\1\0\0\0\u0164\u0165\5+\0\0\u0165?\1\0\0\0\u0166\u0167\5"+
		"=\0\0\u0167A\1\0\0\0\u0168\u0169\5+\0\0\u0169\u016a\5=\0\0\u016aC\1\0"+
		"\0\0\u016b\u016c\5=\0\0\u016c\u016d\5>\0\0\u016dE\1\0\0\0\u016e\u016f"+
		"\5-\0\0\u016f\u0170\5>\0\0\u0170G\1\0\0\0\u0171\u0172\5;\0\0\u0172I\1"+
		"\0\0\0\u0173\u0174\5^\0\0\u0174K\1\0\0\0\u0175\u0176\5!\0\0\u0176M\1\0"+
		"\0\0\u0177\u0178\5|\0\0\u0178O\1\0\0\0\u0179\u017a\5.\0\0\u017aQ\1\0\0"+
		"\0\u017b\u017c\5.\0\0\u017c\u017d\5.\0\0\u017d\u017e\5.\0\0\u017eS\1\0"+
		"\0\0\u017f\u0180\5.\0\0\u0180\u0181\5.\0\0\u0181U\1\0\0\0\u0182\u0183"+
		"\5~\0\0\u0183W\1\0\0\0\u0184\u0186\5[\0\0\u0186\u0187\6)\0\0\u0187Y\1"+
		"\0\0\0\u0188\u0189\5]\0\0\u0189[\1\0\0\0\u018a\u018b\5{\0\0\u018b\u018c"+
		"\1\0\0\0\u018c\u018d\6+\6\0\u018d]\1\0\0\0\u018e\u018f\5}\0\0\u018f_\1"+
		"\0\0\0\u0190\u0191\5$\0\0\u0191a\1\0\0\0\u0192\u0194\3d/\0\u0194\u0198"+
		"\3x9\0\u0196\u0199\5+\0\0\u0198\u0196\1\0\0\0\u0198\u0199\1\0\0\0\u0199"+
		"\u019a\1\0\0\0\u019a\u019b\5=\0\0\u019bc\1\0\0\0\u019c\u01a2\7\0\0\0\u019e"+
		"\u01a1\7\1\0\0\u01a0\u019e\1\0\0\0\u01a1\u01a4\1\0\0\0\u01a2\u01a0\1\0"+
		"\0\0\u01a2\u01a3\1\0\0\0\u01a3e\1\0\0\0\u01a4\u01a2\1\0\0\0\u01a5\u01a8"+
		"\2\609\0\u01a7\u01a5\1\0\0\0\u01a8\u01a9\1\0\0\0\u01a9\u01a7\1\0\0\0\u01a9"+
		"\u01aa\1\0\0\0\u01aag\1\0\0\0\u01ab\u01ad\5@\0\0\u01ad\u01ae\3d/\0\u01ae"+
		"i\1\0\0\0\u01af\u01b1\5$\0\0\u01b1\u01b2\3d/\0\u01b2k\1\0\0\0\u01b3\u01b6"+
		"\7\2\0\0\u01b5\u01b3\1\0\0\0\u01b6\u01b7\1\0\0\0\u01b7\u01b5\1\0\0\0\u01b7"+
		"\u01b8\1\0\0\0\u01b8m\1\0\0\0\u01b9\u01bc\5\r\0\0\u01bb\u01b9\1\0\0\0"+
		"\u01bb\u01bc\1\0\0\0\u01bc\u01bd\1\0\0\0\u01bd\u01be\5\n\0\0\u01beo\1"+
		"\0\0\0\u01bf\u01c0\5/\0\0\u01c0\u01c1\5/\0\0\u01c1\u01c6\1\0\0\0\u01c2"+
		"\u01c5\b\3\0\0\u01c4\u01c2\1\0\0\0\u01c5\u01c8\1\0\0\0\u01c6\u01c4\1\0"+
		"\0\0\u01c6\u01c7\1\0\0\0\u01c7q\1\0\0\0\u01c8\u01c6\1\0\0\0\u01c9\u01ca"+
		"\5/\0\0\u01ca\u01cb\5*\0\0\u01cb\u01cc\1\0\0\0\u01cc\u01cd\6\66\7\0\u01cd"+
		"s\1\0\0\0\u01ce\u01d8\5\'\0\0\u01d0\u01d2\5\\\0\0\u01d2\u01d7\t\0\0\0"+
		"\u01d4\u01d7\b\4\0\0\u01d6\u01d0\1\0\0\0\u01d6\u01d4\1\0\0\0\u01d7\u01da"+
		"\1\0\0\0\u01d8\u01d6\1\0\0\0\u01d8\u01d9\1\0\0\0\u01d9\u01dd\1\0\0\0\u01da"+
		"\u01d8\1\0\0\0\u01db\u01de\5\'\0\0\u01dd\u01db\1\0\0\0\u01dd\u01de\1\0"+
		"\0\0\u01deu\1\0\0\0\u01df\u01e9\5\"\0\0\u01e1\u01e3\5\\\0\0\u01e3\u01e8"+
		"\t\0\0\0\u01e5\u01e8\b\5\0\0\u01e7\u01e1\1\0\0\0\u01e7\u01e5\1\0\0\0\u01e8"+
		"\u01eb\1\0\0\0\u01e9\u01e7\1\0\0\0\u01e9\u01ea\1\0\0\0\u01ea\u01ee\1\0"+
		"\0\0\u01eb\u01e9\1\0\0\0\u01ec\u01ef\5\"\0\0\u01ee\u01ec\1\0\0\0\u01ee"+
		"\u01ef\1\0\0\0\u01efw\1\0\0\0\u01f0\u01f3\7\6\0\0\u01f2\u01f0\1\0\0\0"+
		"\u01f3\u01f6\1\0\0\0\u01f4\u01f2\1\0\0\0\u01f4\u01f5\1\0\0\0\u01f5y\1"+
		"\0\0\0\u01f6\u01f4\1\0\0\0\u01f7\u01fe\2\609\0\u01f9\u01fe\2af\0\u01fb"+
		"\u01fe\2AF\0\u01fd\u01f7\1\0\0\0\u01fd\u01f9\1\0\0\0\u01fd\u01fb\1\0\0"+
		"\0\u01fe{\1\0\0\0\u01ff\u0200\t\0\0\0\u0200}\1\0\0\0\u0201\u0202\3n\64"+
		"\0\u0202\u0203\1\0\0\0\u0203\u0204\6<\b\0\u0204\177\1\0\0\0\u0205\u0208"+
		"\b\7\0\0\u0207\u0205\1\0\0\0\u0208\u0209\1\0\0\0\u0209\u0207\1\0\0\0\u0209"+
		"\u020a\1\0\0\0\u020a\u020b\1\0\0\0\u020b\u020c\6=\1\0\u020c\u0081\1\0"+
		"\0\0\u020d\u020e\5*\0\0\u020e\u020f\5/\0\0\u020f\u0210\1\0\0\0\u0210\u0211"+
		"\6>\2\0\u0211\u0083\1\0\0\0\u0212\u0214\5*\0\0\u0214\u0215\6?\3\0\u0215"+
		"\u0085\1\0\0\0\u0216\u0217\t\0\0\0\u0217\u0218\1\0\0\0\u0218\u0219\6@"+
		"\t\0\u0219\u0087\1\0\0\0\u021a\u021b\3n\64\0\u021b\u021c\1\0\0\0\u021c"+
		"\u021d\6A\n\0\u021d\u0089\1\0\0\0\u021e\u021f\5[\0\0\u021f\u0220\1\0\0"+
		"\0\u0220\u0221\6B\13\0\u0221\u008b\1\0\0\0\u0222\u0223\5]\0\0\u0223\u0224"+
		"\1\0\0\0\u0224\u0225\6C\f\0\u0225\u008d\1\0\0\0\u0226\u0229\b\b\0\0\u0228"+
		"\u0226\1\0\0\0\u0229\u022a\1\0\0\0\u022a\u0228\1\0\0\0\u022a\u022b\1\0"+
		"\0\0\u022b\u008f\1\0\0\0\u022c\u022d\3t\67\0\u022d\u0091\1\0\0\0\u022e"+
		"\u022f\3v8\0\u022f\u0093\1\0\0\0\u0230\u0250\5\\\0\0\u0232\u0251\5n\0"+
		"\0\u0234\u0251\5r\0\0\u0236\u0251\5t\0\0\u0238\u0251\5b\0\0\u023a\u0251"+
		"\5f\0\0\u023c\u0251\5\"\0\0\u023e\u0251\5\'\0\0\u0240\u0251\5\\\0\0\u0242"+
		"\u0251\5>\0\0\u0244\u0251\5]\0\0\u0246\u0248\5u\0\0\u0248\u024a\3z:\0"+
		"\u024a\u024c\3z:\0\u024c\u024e\3z:\0\u024e\u024f\3z:\0\u024f\u0251\1\0"+
		"\0\0\u0250\u0232\1\0\0\0\u0250\u0234\1\0\0\0\u0250\u0236\1\0\0\0\u0250"+
		"\u0238\1\0\0\0\u0250\u023a\1\0\0\0\u0250\u023c\1\0\0\0\u0250\u023e\1\0"+
		"\0\0\u0250\u0240\1\0\0\0\u0250\u0242\1\0\0\0\u0250\u0244\1\0\0\0\u0250"+
		"\u0246\1\0\0\0\u0251\u0095\1\0\0\0\u0252\u0253\3j\62\0\u0253\u0097\1\0"+
		"\0\0\u0254\u0255\7\t\0\0\u0255\u0256\1\0\0\0\u0256\u0257\6I\r\0\u0257"+
		"\u0099\1\0\0\0\u0258\u0259\t\0\0\0\u0259\u025a\1\0\0\0\u025a\u025b\6J"+
		"\16\0\u025b\u009b\1\0\0\0\u025c\u025d\3n\64\0\u025d\u025e\1\0\0\0\u025e"+
		"\u025f\6K\17\0\u025f\u009d\1\0\0\0\u0260\u0261\3l\63\0\u0261\u0262\1\0"+
		"\0\0\u0262\u0263\6L\20\0\u0263\u009f\1\0\0\0\u0264\u0265\3\\+\0\u0265"+
		"\u0266\1\0\0\0\u0266\u0267\6M\21\0\u0267\u00a1\1\0\0\0\u0268\u0269\3n"+
		"\64\0\u0269\u026a\1\0\0\0\u026a\u026b\6N\22\0\u026b\u00a3\1\0\0\0\u026c"+
		"\u026d\5/\0\0\u026d\u026e\5/\0\0\u026e\u0273\1\0\0\0\u026f\u0272\b\n\0"+
		"\0\u0271\u026f\1\0\0\0\u0272\u0275\1\0\0\0\u0273\u0271\1\0\0\0\u0273\u0274"+
		"\1\0\0\0\u0274\u00a5\1\0\0\0\u0275\u0273\1\0\0\0\u0276\u0277\5/\0\0\u0277"+
		"\u0278\5*\0\0\u0278\u0279\1\0\0\0\u0279\u027a\6P\23\0\u027a\u00a7\1\0"+
		"\0\0\u027b\u027c\5{\0\0\u027c\u027d\1\0\0\0\u027d\u027e\6Q\24\0\u027e"+
		"\u00a9\1\0\0\0\u027f\u0280\5}\0\0\u0280\u0281\1\0\0\0\u0281\u0282\6R\25"+
		"\0\u0282\u00ab\1\0\0\0\u0283\u0286\b\13\0\0\u0285\u0283\1\0\0\0\u0286"+
		"\u0287\1\0\0\0\u0287\u0285\1\0\0\0\u0287\u0288\1\0\0\0\u0288\u00ad\1\0"+
		"\0\0\u0289\u028a\3t\67\0\u028a\u00af\1\0\0\0\u028b\u028c\3v8\0\u028c\u00b1"+
		"\1\0\0\0\u028d\u02ab\5\\\0\0\u028f\u02ac\5n\0\0\u0291\u02ac\5r\0\0\u0293"+
		"\u02ac\5t\0\0\u0295\u02ac\5b\0\0\u0297\u02ac\5f\0\0\u0299\u02ac\5\"\0"+
		"\0\u029b\u02ac\5\'\0\0\u029d\u02ac\5\\\0\0\u029f\u02ac\5>\0\0\u02a1\u02a3"+
		"\5u\0\0\u02a3\u02a5\3z:\0\u02a5\u02a7\3z:\0\u02a7\u02a9\3z:\0\u02a9\u02aa"+
		"\3z:\0\u02aa\u02ac\1\0\0\0\u02ab\u028f\1\0\0\0\u02ab\u0291\1\0\0\0\u02ab"+
		"\u0293\1\0\0\0\u02ab\u0295\1\0\0\0\u02ab\u0297\1\0\0\0\u02ab\u0299\1\0"+
		"\0\0\u02ab\u029b\1\0\0\0\u02ab\u029d\1\0\0\0\u02ab\u029f\1\0\0\0\u02ab"+
		"\u02a1\1\0\0\0\u02ac\u00b3\1\0\0\0\u02ad\u02ae\3j\62\0\u02ae\u00b5\1\0"+
		"\0\0\u02af\u02b0\7\f\0\0\u02b0\u02b1\1\0\0\0\u02b1\u02b2\6X\26\0\u02b2"+
		"\u00b7\1\0\0\0\u02b3\u02b4\t\0\0\0\u02b4\u02b5\1\0\0\0\u02b5\u02b6\6Y"+
		"\27\0\u02b6\u00b9\1\0\0\0\u02b7\u02b8\3n\64\0\u02b8\u02b9\1\0\0\0\u02b9"+
		"\u02ba\6Z\30\0\u02ba\u00bb\1\0\0\0\u02bb\u02bd\5\\\0\0\u02bd\u02be\t\0"+
		"\0\0\u02be\u00bd\1\0\0\0\u02bf\u02c2\b\r\0\0\u02c1\u02bf\1\0\0\0\u02c2"+
		"\u02c3\1\0\0\0\u02c3\u02c1\1\0\0\0\u02c3\u02c4\1\0\0\0\u02c4\u00bf\1\0"+
		"\0\0\u02c5\u02c6\5]\0\0\u02c6\u02c7\1\0\0\0\u02c7\u02c8\6]\31\0\u02c8"+
		"\u00c1\1\0\0\0\33\0\1\1\1\2\1\3\1\4\1\5\1\u0198\1\u01a2\1\u01a9\1\u01b7"+
		"\1\u01bb\1\u01c6\1\u01d6\1\u01d8\1\u01dd\1\u01e7\1\u01e9\1\u01ee\1\u01f4"+
		"\1\u01fd\1\u0209\1\u022a\1\u0250\1\u0273\1\u0287\1\u02ab\1\u02c3\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}