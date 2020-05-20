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


class SimpleCodeLexer(Lexer):

    grammarFileName = "SimpleCode.g"
    api_version = 1

    def __init__(self, input=None, state=None):
        if state is None:
            state = RecognizerSharedState()
        super(SimpleCodeLexer, self).__init__(input, state)

        self.delegates = []






    # $ANTLR start "ID"
    def mID(self, ):
        try:
            _type = ID
            _channel = DEFAULT_CHANNEL

            # SimpleCode.g:6:4: ( ( 'a' .. 'z' )+ )
            # SimpleCode.g:6:6: ( 'a' .. 'z' )+
            pass 
            # SimpleCode.g:6:6: ( 'a' .. 'z' )+
            cnt1 = 0
            while True: #loop1
                alt1 = 2
                LA1_0 = self.input.LA(1)

                if ((97 <= LA1_0 <= 122)) :
                    alt1 = 1


                if alt1 == 1:
                    # SimpleCode.g:
                    pass 
                    if (97 <= self.input.LA(1) <= 122):
                        self.input.consume()
                    else:
                        mse = MismatchedSetException(None, self.input)
                        self.recover(mse)
                        raise mse




                else:
                    if cnt1 >= 1:
                        break #loop1

                    eee = EarlyExitException(1, self.input)
                    raise eee

                cnt1 += 1




            self._state.type = _type
            self._state.channel = _channel
        finally:
            pass

    # $ANTLR end "ID"



    # $ANTLR start "INT"
    def mINT(self, ):
        try:
            _type = INT
            _channel = DEFAULT_CHANNEL

            # SimpleCode.g:7:5: ( ( '0' .. '9' )+ )
            # SimpleCode.g:7:7: ( '0' .. '9' )+
            pass 
            # SimpleCode.g:7:7: ( '0' .. '9' )+
            cnt2 = 0
            while True: #loop2
                alt2 = 2
                LA2_0 = self.input.LA(1)

                if ((48 <= LA2_0 <= 57)) :
                    alt2 = 1


                if alt2 == 1:
                    # SimpleCode.g:
                    pass 
                    if (48 <= self.input.LA(1) <= 57):
                        self.input.consume()
                    else:
                        mse = MismatchedSetException(None, self.input)
                        self.recover(mse)
                        raise mse




                else:
                    if cnt2 >= 1:
                        break #loop2

                    eee = EarlyExitException(2, self.input)
                    raise eee

                cnt2 += 1




            self._state.type = _type
            self._state.channel = _channel
        finally:
            pass

    # $ANTLR end "INT"



    # $ANTLR start "WS"
    def mWS(self, ):
        try:
            _type = WS
            _channel = DEFAULT_CHANNEL

            # SimpleCode.g:8:4: ( ( ' ' | '\\n' | '\\r' ) )
            # SimpleCode.g:8:6: ( ' ' | '\\n' | '\\r' )
            pass 
            if self.input.LA(1) == 10 or self.input.LA(1) == 13 or self.input.LA(1) == 32:
                self.input.consume()
            else:
                mse = MismatchedSetException(None, self.input)
                self.recover(mse)
                raise mse



            #action start
            _channel=HIDDEN;
            #action end




            self._state.type = _type
            self._state.channel = _channel
        finally:
            pass

    # $ANTLR end "WS"



    def mTokens(self):
        # SimpleCode.g:1:8: ( ID | INT | WS )
        alt3 = 3
        LA3 = self.input.LA(1)
        if LA3 == 97 or LA3 == 98 or LA3 == 99 or LA3 == 100 or LA3 == 101 or LA3 == 102 or LA3 == 103 or LA3 == 104 or LA3 == 105 or LA3 == 106 or LA3 == 107 or LA3 == 108 or LA3 == 109 or LA3 == 110 or LA3 == 111 or LA3 == 112 or LA3 == 113 or LA3 == 114 or LA3 == 115 or LA3 == 116 or LA3 == 117 or LA3 == 118 or LA3 == 119 or LA3 == 120 or LA3 == 121 or LA3 == 122:
            alt3 = 1
        elif LA3 == 48 or LA3 == 49 or LA3 == 50 or LA3 == 51 or LA3 == 52 or LA3 == 53 or LA3 == 54 or LA3 == 55 or LA3 == 56 or LA3 == 57:
            alt3 = 2
        elif LA3 == 10 or LA3 == 13 or LA3 == 32:
            alt3 = 3
        else:
            nvae = NoViableAltException("", 3, 0, self.input)

            raise nvae


        if alt3 == 1:
            # SimpleCode.g:1:10: ID
            pass 
            self.mID()



        elif alt3 == 2:
            # SimpleCode.g:1:13: INT
            pass 
            self.mINT()



        elif alt3 == 3:
            # SimpleCode.g:1:17: WS
            pass 
            self.mWS()








 



def main(argv, stdin=sys.stdin, stdout=sys.stdout, stderr=sys.stderr):
    from antlr3.main import LexerMain
    main = LexerMain(SimpleCodeLexer)

    main.stdin = stdin
    main.stdout = stdout
    main.stderr = stderr
    main.execute(argv)



if __name__ == '__main__':
    main(sys.argv)
