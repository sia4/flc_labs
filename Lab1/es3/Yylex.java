/* The following code was generated by JFlex 1.4.3 on 12/01/18 15:32 */



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/01/18 15:32 from the specification file
 * <tt>scanner.jflex</tt>
 */
class Yylex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\1\2\0\1\2\24\0\1\35\1\34\6\0\1\41\1\37"+
    "\1\0\1\37\1\0\1\40\12\3\2\0\1\42\1\43\1\42\2\0"+
    "\32\36\4\0\1\36\1\0\1\4\1\10\1\14\1\21\1\12\1\22"+
    "\1\26\1\16\1\20\1\36\1\13\1\23\1\24\1\17\1\7\1\32"+
    "\1\36\1\11\1\15\1\6\1\5\1\33\1\30\1\25\1\31\1\27"+
    "\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\20\3\2\1\3\4\17\3\2\5"+
    "\6\3\3\0\1\6\2\0\30\3\2\0\2\7\1\0"+
    "\15\3\2\0\7\3\2\0\2\3\3\0\2\10";

  private static int [] zzUnpackAction() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\220\0\264\0\330\0\374"+
    "\0\u0120\0\u0144\0\u0168\0\u018c\0\u01b0\0\u01d4\0\u01f8\0\u021c"+
    "\0\u0240\0\u0264\0\u0288\0\u02ac\0\u02d0\0\44\0\u02f4\0\u0318"+
    "\0\u033c\0\u0360\0\u0384\0\u03a8\0\u03cc\0\u03f0\0\u0414\0\u0438"+
    "\0\u045c\0\u0480\0\u04a4\0\u04c8\0\u04ec\0\u0510\0\u0534\0\330"+
    "\0\u0558\0\u057c\0\u05a0\0\u05c4\0\u05e8\0\u060c\0\u0630\0\u0654"+
    "\0\u0678\0\u02d0\0\44\0\u069c\0\u06c0\0\u06e4\0\u0708\0\u072c"+
    "\0\u0750\0\u0774\0\u0798\0\u07bc\0\u07e0\0\u0804\0\u0828\0\u084c"+
    "\0\u0870\0\u0894\0\u08b8\0\u08dc\0\u0900\0\u0924\0\u0948\0\u096c"+
    "\0\u0990\0\u09b4\0\u09d8\0\u09fc\0\u0a20\0\u0a44\0\u0a68\0\44"+
    "\0\u069c\0\u0a8c\0\u0ab0\0\u0ad4\0\u0af8\0\u0b1c\0\u0b40\0\u0b64"+
    "\0\u0b88\0\u0bac\0\u0bd0\0\u0bf4\0\u0c18\0\u0c3c\0\u0c60\0\u0c84"+
    "\0\u0ca8\0\u0ccc\0\u0cf0\0\u0d14\0\u0d38\0\u0d5c\0\u0d80\0\u0da4"+
    "\0\u0dc8\0\u0dec\0\u0e10\0\u0e34\0\u0e58\0\u0e7c\0\u0ea0\0\44"+
    "\0\u0ea0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\7\1\13\1\14\2\7\1\15\1\16\1\17"+
    "\1\20\2\7\1\21\1\7\1\22\2\7\1\23\1\24"+
    "\1\25\1\7\1\26\1\27\1\26\2\30\47\0\1\3"+
    "\43\0\2\7\1\31\26\7\2\0\1\7\10\0\14\7"+
    "\1\32\14\7\2\0\1\7\10\0\26\7\1\33\2\7"+
    "\2\0\1\7\10\0\31\7\2\0\1\7\10\0\6\7"+
    "\1\34\22\7\2\0\1\7\10\0\7\7\1\35\21\7"+
    "\2\0\1\7\10\0\14\7\1\36\3\7\1\37\1\7"+
    "\1\40\6\7\2\0\1\7\10\0\1\7\1\37\2\7"+
    "\1\41\6\7\1\42\15\7\2\0\1\7\10\0\3\7"+
    "\1\43\7\7\1\44\1\7\1\45\7\7\1\46\3\7"+
    "\2\0\1\7\10\0\14\7\1\47\2\7\1\50\11\7"+
    "\2\0\1\7\10\0\4\7\1\51\2\7\1\52\21\7"+
    "\2\0\1\7\10\0\4\7\1\53\13\7\1\54\10\7"+
    "\2\0\1\7\10\0\4\7\1\55\24\7\2\0\1\7"+
    "\10\0\4\7\1\31\24\7\2\0\1\7\10\0\13\7"+
    "\1\56\15\7\2\0\1\7\10\0\4\7\1\57\24\7"+
    "\2\0\1\7\25\0\1\60\1\61\22\0\35\62\1\63"+
    "\6\62\40\0\1\64\1\65\45\0\1\26\3\0\3\7"+
    "\1\66\25\7\2\0\1\7\10\0\12\7\1\67\2\7"+
    "\1\70\13\7\2\0\1\7\10\0\27\7\1\71\1\7"+
    "\2\0\1\7\10\0\7\7\1\72\21\7\2\0\1\7"+
    "\10\0\3\7\1\73\17\7\1\74\5\7\2\0\1\7"+
    "\10\0\2\7\1\75\26\7\2\0\1\7\10\0\12\7"+
    "\1\76\16\7\2\0\1\7\10\0\7\7\1\77\21\7"+
    "\2\0\1\7\10\0\14\7\1\100\14\7\2\0\1\7"+
    "\10\0\1\7\1\53\27\7\2\0\1\7\10\0\1\7"+
    "\1\101\4\7\1\102\22\7\2\0\1\7\10\0\4\7"+
    "\1\103\24\7\2\0\1\7\10\0\23\7\1\104\1\105"+
    "\4\7\2\0\1\7\10\0\15\7\1\106\13\7\2\0"+
    "\1\7\10\0\3\7\1\50\25\7\2\0\1\7\10\0"+
    "\2\7\1\107\26\7\2\0\1\7\10\0\17\7\1\110"+
    "\11\7\2\0\1\7\10\0\6\7\1\50\22\7\2\0"+
    "\1\7\10\0\4\7\1\111\24\7\2\0\1\7\10\0"+
    "\14\7\1\112\14\7\2\0\1\7\10\0\15\7\1\113"+
    "\13\7\2\0\1\7\10\0\15\7\1\114\2\7\1\115"+
    "\10\7\2\0\1\7\24\0\1\116\36\0\1\117\31\0"+
    "\1\64\1\120\1\121\41\64\41\65\1\122\2\65\3\0"+
    "\4\7\1\50\24\7\2\0\1\7\10\0\15\7\1\123"+
    "\13\7\2\0\1\7\10\0\4\7\1\124\24\7\2\0"+
    "\1\7\10\0\7\7\1\125\21\7\2\0\1\7\10\0"+
    "\1\7\1\126\27\7\2\0\1\7\10\0\2\7\1\77"+
    "\26\7\2\0\1\7\10\0\15\7\1\127\13\7\2\0"+
    "\1\7\10\0\21\7\1\50\7\7\2\0\1\7\10\0"+
    "\7\7\1\50\21\7\2\0\1\7\10\0\6\7\1\124"+
    "\22\7\2\0\1\7\10\0\3\7\1\130\6\7\1\47"+
    "\16\7\2\0\1\7\10\0\3\7\1\131\25\7\2\0"+
    "\1\7\10\0\2\7\1\132\26\7\2\0\1\7\10\0"+
    "\6\7\1\47\22\7\2\0\1\7\10\0\14\7\1\133"+
    "\14\7\2\0\1\7\10\0\7\7\1\134\21\7\2\0"+
    "\1\7\10\0\3\7\1\135\25\7\2\0\1\7\10\0"+
    "\5\7\1\113\23\7\2\0\1\7\10\0\1\7\1\136"+
    "\27\7\2\0\1\7\10\0\1\7\1\47\27\7\2\0"+
    "\1\7\10\0\23\7\1\50\5\7\2\0\1\7\10\0"+
    "\20\7\1\76\10\7\2\0\1\7\10\0\16\7\1\50"+
    "\12\7\2\0\1\7\10\0\1\7\1\137\27\7\2\0"+
    "\1\7\21\0\1\140\51\0\1\141\21\0\40\65\1\120"+
    "\1\122\2\65\3\0\23\7\1\104\5\7\2\0\1\7"+
    "\10\0\14\7\1\50\14\7\2\0\1\7\10\0\16\7"+
    "\1\142\12\7\2\0\1\7\10\0\10\7\1\50\20\7"+
    "\2\0\1\7\10\0\12\7\1\143\16\7\2\0\1\7"+
    "\10\0\15\7\1\144\13\7\2\0\1\7\10\0\15\7"+
    "\1\145\13\7\2\0\1\7\10\0\11\7\1\47\17\7"+
    "\2\0\1\7\10\0\7\7\1\114\21\7\2\0\1\7"+
    "\10\0\4\7\1\146\24\7\2\0\1\7\10\0\11\7"+
    "\1\147\17\7\2\0\1\7\10\0\2\7\1\150\26\7"+
    "\2\0\1\7\10\0\3\7\1\56\25\7\2\0\1\7"+
    "\30\0\1\151\40\0\1\152\26\0\7\7\1\146\21\7"+
    "\2\0\1\7\10\0\3\7\1\153\25\7\2\0\1\7"+
    "\10\0\14\7\1\154\14\7\2\0\1\7\10\0\11\7"+
    "\1\50\17\7\2\0\1\7\10\0\17\7\1\50\11\7"+
    "\2\0\1\7\10\0\13\7\1\50\15\7\2\0\1\7"+
    "\10\0\20\7\1\47\10\7\2\0\1\7\12\0\1\155"+
    "\55\0\1\156\27\0\7\7\1\53\21\7\2\0\1\7"+
    "\10\0\2\7\1\76\26\7\2\0\1\7\26\0\1\156"+
    "\34\0\1\157\31\0\1\157\1\160\1\161\41\157";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3780];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\23\1\1\11\31\1\3\0\1\11\2\0"+
    "\30\1\2\0\1\11\1\1\1\0\15\1\2\0\7\1"+
    "\2\0\2\1\3\0\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[113];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Yylex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 102) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { Htmllib.textPrint(yytext());
          }
        case 9: break;
        case 6: 
          { Htmllib.colPrint(Htmllib.C_RED); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
          }
        case 10: break;
        case 3: 
          { Htmllib.colPrint(Htmllib.C_GREEN); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
          }
        case 11: break;
        case 2: 
          { Htmllib.colPrint(Htmllib.C_LRED); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
          }
        case 12: break;
        case 7: 
          { Htmllib.colPrint(Htmllib.C_CYAN); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
          }
        case 13: break;
        case 8: 
          { Htmllib.colPrint(Htmllib.C_LGREEN); 
    Htmllib.textPrint(yytext());
    Htmllib.endtagPrint();
          }
        case 14: break;
        case 5: 
          { Htmllib.colPrint(Htmllib.C_LBLUE); 
    Htmllib.textPrint(yytext());  
    Htmllib.endtagPrint();
          }
        case 15: break;
        case 4: 
          { Htmllib.colPrint(Htmllib.C_BLUE); 
    Htmllib.textPrint(yytext()); 
    Htmllib.endtagPrint();
          }
        case 16: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}