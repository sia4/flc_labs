/* The following code was generated by JFlex 1.4.3 on 12/01/18 19:07 */

/* Lab 2 - Ex 2
The generated file was memorized in the file output.html instead of stdout */

import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/01/18 19:07 from the specification file
 * <tt>scanner.jflex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int comment = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\22\1\26\2\0\1\25\22\0\1\12\1\2\13\0\1\3"+
    "\1\0\1\21\1\23\1\15\1\16\1\17\1\20\5\23\2\0\1\1"+
    "\1\24\1\4\2\0\1\6\1\7\1\14\1\14\1\11\2\14\1\13"+
    "\1\14\2\14\1\10\1\14\1\14\1\14\4\14\1\5\4\14\1\14"+
    "\1\14\4\0\1\14\1\0\1\6\1\7\1\14\1\14\1\11\2\14"+
    "\1\13\1\14\2\14\1\10\1\14\1\14\1\14\4\14\1\5\4\14"+
    "\1\14\1\14\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\0\1\1\2\2\3\1\1\3\1\4\5\0"+
    "\3\3\1\0\1\5\11\0\1\6\1\7\2\0\1\10"+
    "\1\0\1\11\1\0\1\12\1\0\1\13\23\0\1\14"+
    "\4\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[64];
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
    "\0\0\0\27\0\56\0\105\0\134\0\163\0\212\0\134"+
    "\0\241\0\270\0\317\0\346\0\375\0\u0114\0\u012b\0\u0142"+
    "\0\u0159\0\134\0\u0170\0\134\0\u0187\0\u019e\0\u01b5\0\u01cc"+
    "\0\u01e3\0\u01fa\0\u0211\0\u0228\0\u023f\0\134\0\134\0\u0256"+
    "\0\u026d\0\134\0\u0284\0\134\0\u029b\0\134\0\u02b2\0\134"+
    "\0\u02c9\0\u02e0\0\u02f7\0\u030e\0\u0325\0\u033c\0\u0353\0\u036a"+
    "\0\u0381\0\u0398\0\u03af\0\u03c6\0\u03dd\0\u03f4\0\u040b\0\u0422"+
    "\0\u0439\0\u0450\0\u0467\0\134\0\u047e\0\u0495\0\u04ac\0\u04c3";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[64];
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
    "\1\3\1\4\2\3\1\5\5\3\1\6\7\3\1\6"+
    "\2\3\1\7\1\10\3\11\1\12\23\11\1\3\1\0"+
    "\2\3\1\0\5\3\1\0\7\3\1\0\2\3\4\0"+
    "\1\13\2\0\1\14\4\15\1\0\1\16\1\15\4\0"+
    "\1\17\46\0\1\6\7\0\1\6\32\0\1\10\3\11"+
    "\1\0\23\11\3\20\1\21\1\22\22\20\3\0\1\23"+
    "\27\0\1\24\1\15\1\25\3\15\1\26\6\15\1\0"+
    "\1\26\1\15\7\0\1\24\5\15\1\26\6\15\1\0"+
    "\1\26\1\15\7\0\1\24\5\15\1\26\2\15\1\27"+
    "\1\30\1\31\1\32\1\0\1\26\1\15\10\0\1\33"+
    "\4\34\1\0\1\35\1\34\12\0\4\20\1\0\26\20"+
    "\1\36\22\20\3\0\1\37\27\0\1\24\2\15\1\40"+
    "\2\15\1\26\6\15\1\0\1\26\1\15\10\0\5\41"+
    "\1\26\2\41\5\0\1\26\10\0\1\42\5\15\1\43"+
    "\6\15\1\0\1\26\1\15\7\0\1\44\5\15\1\45"+
    "\6\15\1\0\1\26\1\15\7\0\1\46\5\15\1\47"+
    "\6\15\1\0\1\26\1\15\7\0\1\50\5\15\1\51"+
    "\6\15\1\0\1\26\1\15\7\0\1\24\1\34\1\52"+
    "\3\34\1\0\6\34\2\0\1\34\7\0\1\24\5\34"+
    "\1\0\6\34\2\0\1\34\7\0\1\24\5\34\1\0"+
    "\2\34\1\53\1\54\1\55\1\56\2\0\1\34\7\0"+
    "\1\24\3\15\1\57\1\15\1\26\6\15\1\0\1\26"+
    "\1\15\10\0\5\41\1\0\6\41\2\0\1\41\1\60"+
    "\7\0\5\61\1\43\2\61\5\0\1\26\11\0\5\62"+
    "\1\45\2\62\5\0\1\26\11\0\5\63\1\47\2\63"+
    "\5\0\1\26\11\0\5\64\1\51\2\64\5\0\1\26"+
    "\10\0\1\24\2\34\1\65\2\34\1\0\6\34\2\0"+
    "\1\34\7\0\1\42\5\34\1\0\6\34\2\0\1\34"+
    "\7\0\1\44\5\34\1\0\6\34\2\0\1\34\7\0"+
    "\1\46\5\34\1\0\6\34\2\0\1\34\7\0\1\50"+
    "\5\34\1\0\6\34\2\0\1\34\7\0\1\24\4\15"+
    "\1\66\1\26\6\15\1\0\1\26\1\15\3\0\1\60"+
    "\1\0\2\60\1\24\5\60\1\26\7\60\1\26\2\60"+
    "\7\0\5\61\1\0\6\61\2\0\1\61\1\67\7\0"+
    "\5\62\1\0\6\62\2\0\1\62\1\70\7\0\5\63"+
    "\1\0\6\63\2\0\1\63\1\71\7\0\5\64\1\0"+
    "\6\64\2\0\1\64\1\72\6\0\1\24\3\34\1\73"+
    "\1\34\1\0\6\34\2\0\1\34\7\0\1\74\5\15"+
    "\1\75\6\15\1\0\1\26\1\15\3\0\1\67\1\0"+
    "\2\67\1\42\5\67\1\43\7\67\1\26\2\67\2\0"+
    "\1\70\1\0\2\70\1\44\5\70\1\45\7\70\1\26"+
    "\2\70\2\0\1\71\1\0\2\71\1\46\5\71\1\47"+
    "\7\71\1\26\2\71\2\0\1\72\1\0\2\72\1\50"+
    "\5\72\1\51\7\72\1\26\2\72\6\0\1\24\4\34"+
    "\1\76\1\0\6\34\2\0\1\34\10\0\5\77\1\75"+
    "\2\77\5\0\1\26\10\0\1\74\5\34\1\0\6\34"+
    "\2\0\1\34\10\0\5\77\1\0\6\77\2\0\1\77"+
    "\1\100\2\0\1\100\1\0\2\100\1\74\5\100\1\75"+
    "\7\100\1\26\2\100\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1242];
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
    "\1\1\1\0\2\1\1\11\2\1\1\11\2\1\5\0"+
    "\2\1\1\11\1\0\1\11\11\0\2\11\2\0\1\11"+
    "\1\0\1\11\1\0\1\11\1\0\1\11\23\0\1\11"+
    "\4\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[64];
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

  /* user code: */
	FileWriter out;
	int numTags, numTables, numH1s, numH2s, numH3s, numH4s, numComm;
	
	private void writeOut(String s){
		try{
			out.write(s); 
			out.flush();
		}catch(Exception e){}
	}
	
	private void writeOut(){
		writeOut(yytext());
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
  	try{
		out = new FileWriter(new File("output.html"));
		numTags=numTables=numH1s=numH2s=numH3s=numH4s=numComm=0;
	}catch(IOException e){
		System.err.println(e);
	}
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
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
    while (i < 126) {
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    	// Total number of tags: comments are not considered as tags
	numTags = numTags + numTables + numH1s + numH2s + numH3s + numH4s;
	
	System.out.println("Total number of tags: "+numTags);
	System.out.println("Total number of table tags: "+numTables);
	System.out.println("Total number of h1 tags: "+numH1s);
	System.out.println("Total number of h2 tags: "+numH2s);
	System.out.println("Total number of h3 tags: "+numH3s);
	System.out.println("Total number of h4 tags: "+numH4s);
	System.out.println("Total number of comments: "+numComm);
        try{
            out.close();
        }catch(IOException e){
            System.err.println(e);
	}

    }
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
        case 4: 
          { System.out.print(yytext());
          }
        case 13: break;
        case 9: 
          { numH2s++; writeOut();
          }
        case 14: break;
        case 8: 
          { numH1s++; writeOut();
          }
        case 15: break;
        case 10: 
          { numH3s++; writeOut();
          }
        case 16: break;
        case 1: 
          { writeOut();
          }
        case 17: break;
        case 5: 
          { numTags++; writeOut();
          }
        case 18: break;
        case 12: 
          { numTables++; writeOut();
          }
        case 19: break;
        case 3: 
          { System.err.println("COMMENT: "+yytext());
          }
        case 20: break;
        case 7: 
          { numComm++; yybegin(comment);
          }
        case 21: break;
        case 2: 
          { System.out.println("ERRORE (Character not recognized): "+yytext());
          }
        case 22: break;
        case 11: 
          { numH4s++; writeOut();
          }
        case 23: break;
        case 6: 
          { yybegin(YYINITIAL);
          }
        case 24: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return YYEOF;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          scanner = new Lexer( new java.io.FileReader(argv[i]) );
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
