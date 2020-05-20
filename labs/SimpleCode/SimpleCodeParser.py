# $ANTLR 3.4 SimpleCode.g 2020-05-20 08:51:36

import sys
from antlr3 import *
from antlr3.compat import set, frozenset



# for convenience in actions
HIDDEN = BaseRecognizer.HIDDEN

# token types
EOF=-1
ID=4
INT=5
WS=6

# token names
tokenNames = [
    "<invalid>", "<EOR>", "<DOWN>", "<UP>",
    "ID", "INT", "WS"
]




class SimpleCodeParser(Parser):
    grammarFileName = "SimpleCode.g"
    api_version = 1
    tokenNames = tokenNames

    def __init__(self, input, state=None, *args, **kwargs):
        if state is None:
            state = RecognizerSharedState()

        super(SimpleCodeParser, self).__init__(input, state, *args, **kwargs)




        self.delegates = []






    # $ANTLR start "a"
    # SimpleCode.g:5:1: a : ID INT ;
    def a(self, ):
        try:
            try:
                # SimpleCode.g:5:3: ( ID INT )
                # SimpleCode.g:5:5: ID INT
                pass 
                self.match(self.input, ID, self.FOLLOW_ID_in_a22)

                self.match(self.input, INT, self.FOLLOW_INT_in_a24)




            except RecognitionException, re:
                self.reportError(re)
                self.recover(self.input, re)

        finally:
            pass
        return 

    # $ANTLR end "a"



 

    FOLLOW_ID_in_a22 = frozenset([5])
    FOLLOW_INT_in_a24 = frozenset([1])



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import ParserMain
    main = ParserMain("SimpleCodeLexer", SimpleCodeParser)

    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)



if __name__ == '__main__':
    main(sys.argv)
