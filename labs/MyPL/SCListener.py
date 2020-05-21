# Generated from SC.g4 by ANTLR 4.8
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .SCParser import SCParser
else:
    from SCParser import SCParser

# This class defines a complete listener for a parse tree produced by SCParser.
class SCListener(ParseTreeListener):

    # Enter a parse tree produced by SCParser#scan.
    def enterScan(self, ctx:SCParser.ScanContext):
        pass

    # Exit a parse tree produced by SCParser#scan.
    def exitScan(self, ctx:SCParser.ScanContext):
        pass


    # Enter a parse tree produced by SCParser#var_decl.
    def enterVar_decl(self, ctx:SCParser.Var_declContext):
        pass

    # Exit a parse tree produced by SCParser#var_decl.
    def exitVar_decl(self, ctx:SCParser.Var_declContext):
        pass



del SCParser