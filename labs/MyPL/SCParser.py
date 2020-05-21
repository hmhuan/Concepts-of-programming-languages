# Generated from SC.g4 by ANTLR 4.8
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30")
        buf.write("\62\4\2\t\2\4\3\t\3\3\2\7\2\b\n\2\f\2\16\2\13\13\2\3\2")
        buf.write("\7\2\16\n\2\f\2\16\2\21\13\2\3\2\7\2\24\n\2\f\2\16\2\27")
        buf.write("\13\2\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2 \n\2\f\2")
        buf.write("\16\2#\13\2\5\2%\n\2\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3")
        buf.write(".\13\3\3\3\3\3\3\3\2\2\4\2\4\2\2\29\2$\3\2\2\2\4&\3\2")
        buf.write("\2\2\6\b\7\25\2\2\7\6\3\2\2\2\b\13\3\2\2\2\t\7\3\2\2\2")
        buf.write("\t\n\3\2\2\2\n%\3\2\2\2\13\t\3\2\2\2\f\16\7\24\2\2\r\f")
        buf.write("\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2\2\2\20%")
        buf.write("\3\2\2\2\21\17\3\2\2\2\22\24\7\26\2\2\23\22\3\2\2\2\24")
        buf.write("\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26%\3\2\2\2\27")
        buf.write("\25\3\2\2\2\30\32\7\27\2\2\31\30\3\2\2\2\32\35\3\2\2\2")
        buf.write("\33\31\3\2\2\2\33\34\3\2\2\2\34%\3\2\2\2\35\33\3\2\2\2")
        buf.write("\36 \7\30\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3")
        buf.write("\2\2\2\"%\3\2\2\2#!\3\2\2\2$\t\3\2\2\2$\17\3\2\2\2$\25")
        buf.write("\3\2\2\2$\33\3\2\2\2$!\3\2\2\2%\3\3\2\2\2&\'\7\7\2\2\'")
        buf.write(",\7\30\2\2()\7\21\2\2)+\7\30\2\2*(\3\2\2\2+.\3\2\2\2,")
        buf.write("*\3\2\2\2,-\3\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\20\2\2\60")
        buf.write("\5\3\2\2\2\t\t\17\25\33!$,")
        return buf.getvalue()


class SCParser ( Parser ):

    grammarFileName = "SC.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
                     "':'", "'.'" ]

    symbolicNames = [ "<INVALID>", "WS", "ASSIGN_OPR", "BIN_OPR", "KEYWORD", 
                      "TYPE", "LINE_COMMENT", "BLK_COMMENT", "LP", "RP", 
                      "LCB", "RCB", "LSB", "RSB", "SEMICOLON", "COMMA", 
                      "COLON", "DOT", "CHARLITERAL", "INTLITERAL", "BOOLEANLITERAL", 
                      "STRINGLITERAL", "IDENTIFIER" ]

    RULE_scan = 0
    RULE_var_decl = 1

    ruleNames =  [ "scan", "var_decl" ]

    EOF = Token.EOF
    WS=1
    ASSIGN_OPR=2
    BIN_OPR=3
    KEYWORD=4
    TYPE=5
    LINE_COMMENT=6
    BLK_COMMENT=7
    LP=8
    RP=9
    LCB=10
    RCB=11
    LSB=12
    RSB=13
    SEMICOLON=14
    COMMA=15
    COLON=16
    DOT=17
    CHARLITERAL=18
    INTLITERAL=19
    BOOLEANLITERAL=20
    STRINGLITERAL=21
    IDENTIFIER=22

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ScanContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INTLITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.INTLITERAL)
            else:
                return self.getToken(SCParser.INTLITERAL, i)

        def CHARLITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.CHARLITERAL)
            else:
                return self.getToken(SCParser.CHARLITERAL, i)

        def BOOLEANLITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.BOOLEANLITERAL)
            else:
                return self.getToken(SCParser.BOOLEANLITERAL, i)

        def STRINGLITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.STRINGLITERAL)
            else:
                return self.getToken(SCParser.STRINGLITERAL, i)

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.IDENTIFIER)
            else:
                return self.getToken(SCParser.IDENTIFIER, i)

        def getRuleIndex(self):
            return SCParser.RULE_scan

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterScan" ):
                listener.enterScan(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitScan" ):
                listener.exitScan(self)




    def scan(self):

        localctx = SCParser.ScanContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_scan)
        self._la = 0 # Token type
        try:
            self.state = 34
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 7
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==SCParser.INTLITERAL:
                    self.state = 4
                    self.match(SCParser.INTLITERAL)
                    self.state = 9
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 13
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==SCParser.CHARLITERAL:
                    self.state = 10
                    self.match(SCParser.CHARLITERAL)
                    self.state = 15
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 19
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==SCParser.BOOLEANLITERAL:
                    self.state = 16
                    self.match(SCParser.BOOLEANLITERAL)
                    self.state = 21
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 25
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==SCParser.STRINGLITERAL:
                    self.state = 22
                    self.match(SCParser.STRINGLITERAL)
                    self.state = 27
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 31
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==SCParser.IDENTIFIER:
                    self.state = 28
                    self.match(SCParser.IDENTIFIER)
                    self.state = 33
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Var_declContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TYPE(self):
            return self.getToken(SCParser.TYPE, 0)

        def IDENTIFIER(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.IDENTIFIER)
            else:
                return self.getToken(SCParser.IDENTIFIER, i)

        def SEMICOLON(self):
            return self.getToken(SCParser.SEMICOLON, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.COMMA)
            else:
                return self.getToken(SCParser.COMMA, i)

        def getRuleIndex(self):
            return SCParser.RULE_var_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVar_decl" ):
                listener.enterVar_decl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVar_decl" ):
                listener.exitVar_decl(self)




    def var_decl(self):

        localctx = SCParser.Var_declContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_var_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.match(SCParser.TYPE)
            self.state = 37
            self.match(SCParser.IDENTIFIER)
            self.state = 42
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==SCParser.COMMA:
                self.state = 38
                self.match(SCParser.COMMA)
                self.state = 39
                self.match(SCParser.IDENTIFIER)
                self.state = 44
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 45
            self.match(SCParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





