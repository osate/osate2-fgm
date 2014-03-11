package org.osate.xtext.aadl2.featuregroupmapping.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFeatureGroupMappingLexer extends Lexer {
    public static final int RULE_ID=15;
    public static final int KEYWORD_6=8;
    public static final int KEYWORD_7=9;
    public static final int KEYWORD_8=5;
    public static final int KEYWORD_9=6;
    public static final int KEYWORD_1=11;
    public static final int KEYWORD_5=7;
    public static final int KEYWORD_4=10;
    public static final int KEYWORD_3=13;
    public static final int KEYWORD_2=12;
    public static final int RULE_WS=16;
    public static final int RULE_SL_COMMENT=14;
    public static final int EOF=-1;
    public static final int KEYWORD_10=4;

    // delegates
    // delegators

    public InternalFeatureGroupMappingLexer() {;} 
    public InternalFeatureGroupMappingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalFeatureGroupMappingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g"; }

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:19:12: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:19:14: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'P' | 'p' ) ( 'P' | 'p' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:21:11: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:21:13: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'T' | 't' ) ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ( 'S' | 's' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:23:11: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:23:13: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'B' | 'b' ) ( 'R' | 'r' ) ( 'A' | 'a' ) ( 'R' | 'r' ) ( 'Y' | 'y' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:25:11: ( '<' '=' '>' )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:25:13: '<' '=' '>'
            {
            match('<'); 
            match('='); 
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:27:11: ( ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:27:13: ( 'E' | 'e' ) ( 'N' | 'n' ) ( 'D' | 'd' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:29:11: ( ( 'U' | 'u' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:29:13: ( 'U' | 'u' ) ( 'S' | 's' ) ( 'E' | 'e' )
            {
            if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:31:11: ( ':' ':' )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:31:13: ':' ':'
            {
            match(':'); 
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:33:11: ( '.' )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:33:13: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:35:11: ( ':' )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:35:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:37:11: ( ';' )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:37:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:17: ( '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:19: '--' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("--"); 

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:40: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:41: ( '\\r' )? '\\n'
                    {
                    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:41: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:41:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:43:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )* )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:43:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:43:31: ( ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:43:32: ( '_' )? ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:43:32: ( '_' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0=='_') ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:43:32: '_'
            	            {
            	            match('_'); 

            	            }
            	            break;

            	    }

            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:45:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:45:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:45:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\t' && LA6_0<='\n')||LA6_0=='\r'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:8: ( KEYWORD_10 | KEYWORD_8 | KEYWORD_9 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_4 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | RULE_SL_COMMENT | RULE_ID | RULE_WS )
        int alt7=13;
        alt7 = dfa7.predict(input);
        switch (alt7) {
            case 1 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:10: KEYWORD_10
                {
                mKEYWORD_10(); 

                }
                break;
            case 2 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:21: KEYWORD_8
                {
                mKEYWORD_8(); 

                }
                break;
            case 3 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:31: KEYWORD_9
                {
                mKEYWORD_9(); 

                }
                break;
            case 4 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:41: KEYWORD_5
                {
                mKEYWORD_5(); 

                }
                break;
            case 5 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:51: KEYWORD_6
                {
                mKEYWORD_6(); 

                }
                break;
            case 6 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:61: KEYWORD_7
                {
                mKEYWORD_7(); 

                }
                break;
            case 7 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:71: KEYWORD_4
                {
                mKEYWORD_4(); 

                }
                break;
            case 8 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:81: KEYWORD_1
                {
                mKEYWORD_1(); 

                }
                break;
            case 9 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:91: KEYWORD_2
                {
                mKEYWORD_2(); 

                }
                break;
            case 10 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:101: KEYWORD_3
                {
                mKEYWORD_3(); 

                }
                break;
            case 11 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:111: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:127: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // ../org.osate.xtext.aadl2.featuregroupmapping/src-gen/org/osate/xtext/aadl2/featuregroupmapping/parser/antlr/lexer/InternalFeatureGroupMappingLexer.g:1:135: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\1\uffff\3\12\1\uffff\1\12\1\22\5\uffff\5\12\2\uffff\2\12\1\32"+
        "\1\12\1\34\2\12\1\uffff\1\12\1\uffff\7\12\1\47\1\50\1\51\3\uffff";
    static final String DFA7_eofS =
        "\52\uffff";
    static final String DFA7_minS =
        "\1\11\1\101\1\116\1\111\1\uffff\1\123\1\72\5\uffff\1\120\1\124"+
        "\1\104\1\102\1\105\2\uffff\1\120\1\105\1\60\1\122\1\60\1\111\1\116"+
        "\1\uffff\1\101\1\uffff\1\116\1\104\1\122\1\107\1\123\1\131\1\123"+
        "\3\60\3\uffff";
    static final String DFA7_maxS =
        "\1\172\1\141\1\170\1\151\1\uffff\1\163\1\72\5\uffff\1\160\1\164"+
        "\1\144\1\142\1\145\2\uffff\1\160\1\145\1\172\1\162\1\172\1\151\1"+
        "\156\1\uffff\1\141\1\uffff\1\156\1\144\1\162\1\147\1\163\1\171\1"+
        "\163\3\172\3\uffff";
    static final String DFA7_acceptS =
        "\4\uffff\1\4\2\uffff\1\10\1\12\1\13\1\14\1\15\5\uffff\1\7\1\11"+
        "\7\uffff\1\5\1\uffff\1\6\12\uffff\1\2\1\3\1\1";
    static final String DFA7_specialS =
        "\52\uffff}>";
    static final String[] DFA7_transitionS = {
            "\2\13\2\uffff\1\13\22\uffff\1\13\14\uffff\1\11\1\7\13\uffff"+
            "\1\6\1\10\1\4\4\uffff\4\12\1\2\6\12\1\3\1\1\7\12\1\5\5\12\6"+
            "\uffff\4\12\1\2\6\12\1\3\1\1\7\12\1\5\5\12",
            "\1\14\37\uffff\1\14",
            "\1\16\11\uffff\1\15\25\uffff\1\16\11\uffff\1\15",
            "\1\17\37\uffff\1\17",
            "",
            "\1\20\37\uffff\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\23\37\uffff\1\23",
            "\1\24\37\uffff\1\24",
            "\1\25\37\uffff\1\25",
            "\1\26\37\uffff\1\26",
            "\1\27\37\uffff\1\27",
            "",
            "",
            "\1\30\37\uffff\1\30",
            "\1\31\37\uffff\1\31",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\33\37\uffff\1\33",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\1\35\37\uffff\1\35",
            "\1\36\37\uffff\1\36",
            "",
            "\1\37\37\uffff\1\37",
            "",
            "\1\40\37\uffff\1\40",
            "\1\41\37\uffff\1\41",
            "\1\42\37\uffff\1\42",
            "\1\43\37\uffff\1\43",
            "\1\44\37\uffff\1\44",
            "\1\45\37\uffff\1\45",
            "\1\46\37\uffff\1\46",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "\12\12\7\uffff\32\12\4\uffff\1\12\1\uffff\32\12",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_10 | KEYWORD_8 | KEYWORD_9 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_4 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | RULE_SL_COMMENT | RULE_ID | RULE_WS );";
        }
    }
 

}