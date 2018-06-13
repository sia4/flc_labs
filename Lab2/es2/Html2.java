/* The following code was generated by JFlex 1.4.3 on 12/01/18 19:20 */


import java.io.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/01/18 19:20 from the specification file
 * <tt>scanner2.jflex</tt>
 */
class Html2 {

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
    "\11\0\1\12\1\31\2\0\1\30\22\0\1\12\1\2\13\0\1\3"+
    "\1\0\1\20\1\26\1\14\1\15\1\16\1\17\5\26\2\0\1\1"+
    "\1\27\1\4\2\0\1\6\1\7\2\25\1\11\2\25\1\13\3\25"+
    "\1\10\1\23\1\22\5\25\1\5\6\25\4\0\1\25\1\0\1\6"+
    "\1\7\2\25\1\11\2\25\1\13\3\25\1\10\1\23\1\22\5\25"+
    "\1\5\6\25\1\21\1\0\1\24\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\2\1\2\2\10\0\1\3\11\0\1\4\1\5"+
    "\2\0\1\6\1\0\1\7\1\0\1\10\1\0\1\11"+
    "\26\0\1\12\5\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[63];
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
    "\0\0\0\32\0\64\0\116\0\64\0\150\0\202\0\234"+
    "\0\266\0\320\0\352\0\u0104\0\u011e\0\u0138\0\64\0\u0152"+
    "\0\u016c\0\u0186\0\u01a0\0\u01ba\0\u01d4\0\u01ee\0\u0208\0\u0222"+
    "\0\64\0\64\0\u023c\0\u0256\0\64\0\u0270\0\64\0\u028a"+
    "\0\64\0\u02a4\0\64\0\u02be\0\u02d8\0\u02f2\0\u030c\0\u0326"+
    "\0\u0340\0\u035a\0\u0374\0\u038e\0\u03a8\0\u03c2\0\u03dc\0\u03f6"+
    "\0\u0410\0\u042a\0\u0444\0\u045e\0\u0478\0\u0492\0\u04ac\0\u04c6"+
    "\0\u04e0\0\64\0\u04fa\0\u0514\0\u052e\0\u0548\0\u0562";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[63];
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
    "\1\3\1\4\27\3\4\5\1\6\26\5\34\0\1\7"+
    "\2\0\1\10\4\11\1\0\1\12\4\0\1\13\1\14"+
    "\2\11\1\0\1\11\7\0\1\15\31\0\1\16\32\0"+
    "\1\17\1\11\1\20\3\11\1\21\5\11\2\0\2\11"+
    "\1\0\2\11\7\0\1\17\5\11\1\21\5\11\2\0"+
    "\2\11\1\0\2\11\7\0\1\17\5\11\1\21\1\11"+
    "\1\22\1\23\1\24\1\25\2\0\2\11\1\0\2\11"+
    "\10\0\1\26\5\0\1\27\40\0\1\30\13\0\1\31"+
    "\30\0\1\32\32\0\1\17\2\11\1\33\2\11\1\21"+
    "\5\11\2\0\2\11\1\0\2\11\10\0\5\34\1\21"+
    "\1\34\6\0\2\34\1\0\1\34\10\0\1\35\5\11"+
    "\1\36\5\11\2\0\2\11\1\0\2\11\7\0\1\37"+
    "\5\11\1\40\5\11\2\0\2\11\1\0\2\11\7\0"+
    "\1\41\5\11\1\42\5\11\2\0\2\11\1\0\2\11"+
    "\7\0\1\43\5\11\1\44\5\11\2\0\2\11\1\0"+
    "\2\11\11\0\1\45\37\0\1\46\1\47\1\50\1\51"+
    "\20\0\1\52\27\0\1\17\3\11\1\53\1\11\1\21"+
    "\5\11\2\0\2\11\1\0\2\11\10\0\5\34\1\0"+
    "\5\34\2\0\2\34\1\0\2\34\1\54\7\0\5\55"+
    "\1\36\1\55\6\0\2\55\1\0\1\55\11\0\5\56"+
    "\1\40\1\56\6\0\2\56\1\0\1\56\11\0\5\57"+
    "\1\42\1\57\6\0\2\57\1\0\1\57\11\0\5\60"+
    "\1\44\1\60\6\0\2\60\1\0\1\60\13\0\1\61"+
    "\26\0\1\35\31\0\1\37\31\0\1\41\31\0\1\43"+
    "\50\0\1\62\12\0\1\17\4\11\1\63\1\21\5\11"+
    "\2\0\2\11\1\0\2\11\3\0\1\54\1\0\2\54"+
    "\1\17\5\54\1\21\15\54\7\0\5\55\1\0\5\55"+
    "\2\0\2\55\1\0\2\55\1\64\7\0\5\56\1\0"+
    "\5\56\2\0\2\56\1\0\2\56\1\65\7\0\5\57"+
    "\1\0\5\57\2\0\2\57\1\0\2\57\1\66\7\0"+
    "\5\60\1\0\5\60\2\0\2\60\1\0\2\60\1\67"+
    "\12\0\1\70\32\0\1\71\24\0\1\72\5\11\1\73"+
    "\5\11\2\0\2\11\1\0\2\11\3\0\1\64\1\0"+
    "\2\64\1\35\5\64\1\36\15\64\2\0\1\65\1\0"+
    "\2\65\1\37\5\65\1\40\15\65\2\0\1\66\1\0"+
    "\2\66\1\41\5\66\1\42\15\66\2\0\1\67\1\0"+
    "\2\67\1\43\5\67\1\44\15\67\13\0\1\74\44\0"+
    "\1\75\12\0\5\76\1\73\1\76\6\0\2\76\1\0"+
    "\1\76\10\0\1\72\31\0\1\17\32\0\5\76\1\0"+
    "\5\76\2\0\2\76\1\0\2\76\1\77\2\0\1\77"+
    "\1\0\2\77\1\72\5\77\1\73\15\77\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[1404];
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
    "\2\0\1\11\1\1\1\11\1\1\10\0\1\11\11\0"+
    "\2\11\2\0\1\11\1\0\1\11\1\0\1\11\1\0"+
    "\1\11\26\0\1\11\5\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[63];
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
  Html2(java.io.Reader in) {
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
  Html2(java.io.InputStream in) {
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
    while (i < 112) {
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
    	numTags = numTags + numTables + numH1s + numH2s + numH3s + numH4s;
	
	System.out.println("Total number of tags: "+numTags);
	System.out.println("Total number of table tags: "+numTables);
	System.out.println("Total number of h1 tags: "+numH1s);
	System.out.println("Total number of h2 tags: "+numH2s);
	System.out.println("Total number of h3 tags: "+numH3s);
	System.out.println("Total number of h4 tags: "+numH4s);
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
        case 2: 
          { System.out.print(yytext());
          }
        case 11: break;
        case 5: 
          { yybegin(comment);
          }
        case 12: break;
        case 7: 
          { numH2s++; writeOut();
          }
        case 13: break;
        case 6: 
          { numH1s++; writeOut();
          }
        case 14: break;
        case 8: 
          { numH3s++; writeOut();
          }
        case 15: break;
        case 1: 
          { writeOut();
          }
        case 16: break;
        case 3: 
          { numTags++; writeOut();
          }
        case 17: break;
        case 10: 
          { numTables++; writeOut();
          }
        case 18: break;
        case 9: 
          { numH4s++; writeOut();
          }
        case 19: break;
        case 4: 
          { yybegin(YYINITIAL);
          }
        case 20: break;
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
      System.out.println("Usage : java Html2 <inputfile>");
    }
    else {
      for (int i = 0; i < argv.length; i++) {
        Html2 scanner = null;
        try {
          scanner = new Html2( new java.io.FileReader(argv[i]) );
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
