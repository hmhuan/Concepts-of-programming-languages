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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 ")
        buf.write("\21\4\2\t\2\3\2\6\2\6\n\2\r\2\16\2\7\3\2\6\2\13\n\2\r")
        buf.write("\2\16\2\f\5\2\17\n\2\3\2\2\2\3\2\2\2\2\22\2\16\3\2\2\2")
        buf.write("\4\6\7\36\2\2\5\4\3\2\2\2\6\7\3\2\2\2\7\5\3\2\2\2\7\b")
        buf.write("\3\2\2\2\b\17\3\2\2\2\t\13\7\37\2\2\n\t\3\2\2\2\13\f\3")
        buf.write("\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\5\3\2\2")
        buf.write("\2\16\n\3\2\2\2\17\3\3\2\2\2\5\7\f\16")
        return buf.getvalue()


class SCParser ( Parser ):

    grammarFileName = "SC.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "<INVALID>", "'Program'", 
                     "'if'", "'boolean'", "'break'", "'callout'", "'class'", 
                     "'continue'", "'else'", "'for'", "'int'", "'return'", 
                     "'void'" ]

    symbolicNames = [ "<INVALID>", "WS", "BIN_OPR", "ARITH_OPR", "REL_OPR", 
                      "EQ_OPR", "COND_OPR", "PROGRAM", "IF", "BOOLEAN", 
                      "BREAK", "CALL_OUT", "CLASS", "CONTINUE", "ELSE", 
                      "FOR", "INT", "RETURN", "VOID", "TYPE", "LINE_COMMENT", 
                      "BLK_COMMENT", "DEC_DIGITS", "HEX_DIGITS", "INTLITERAL", 
                      "BOOLEANLITERAL", "STRINGLITERAL", "STR_CHAR", "LITERAL", 
                      "IDENTIFIER", "ALPHA_NUM" ]

    RULE_scan = 0

    ruleNames =  [ "scan" ]

    EOF = Token.EOF
    WS=1
    BIN_OPR=2
    ARITH_OPR=3
    REL_OPR=4
    EQ_OPR=5
    COND_OPR=6
    PROGRAM=7
    IF=8
    BOOLEAN=9
    BREAK=10
    CALL_OUT=11
    CLASS=12
    CONTINUE=13
    ELSE=14
    FOR=15
    INT=16
    RETURN=17
    VOID=18
    TYPE=19
    LINE_COMMENT=20
    BLK_COMMENT=21
    DEC_DIGITS=22
    HEX_DIGITS=23
    INTLITERAL=24
    BOOLEANLITERAL=25
    STRINGLITERAL=26
    STR_CHAR=27
    LITERAL=28
    IDENTIFIER=29
    ALPHA_NUM=30

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.8")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ScanContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(SCParser.LITERAL)
            else:
                return self.getToken(SCParser.LITERAL, i)

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
            self.state = 12
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [SCParser.LITERAL]:
                self.enterOuterAlt(localctx, 1)
                self.state = 3 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 2
                    self.match(SCParser.LITERAL)
                    self.state = 5 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==SCParser.LITERAL):
                        break

                pass
            elif token in [SCParser.IDENTIFIER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 8 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 7
                    self.match(SCParser.IDENTIFIER)
                    self.state = 10 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not (_la==SCParser.IDENTIFIER):
                        break

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





