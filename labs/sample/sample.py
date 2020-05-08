from antlr4 import *
from ExprLexer import ExprLexer
from ExprListener import ExprListener
from ExprParser import ExprParser
import sys

class HelloPrintListener(ExprListener):
    def enterHi(self, ctx):
        print("Hello: %s" % ctx.ID())

def main():
    lexer = ExprLexer(StdinStream())
    stream = CommonTokenStream(lexer)
    parser = ExprParser(stream)
    tree = parser.hi()
    print(tree.toStringTree(recog=parser))
    printer = HelloPrintListener()
    walker = ParseTreeWalker()
    walker.walk(printer, tree)

if __name__ == '__main__':
    print('started..')
    main()