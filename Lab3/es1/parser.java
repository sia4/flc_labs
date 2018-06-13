
//----------------------------------------------------
// The following code was generated by CUP v0.10k
// Sat Jan 13 12:34:00 CET 2018
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;

/** CUP v0.10k generated parser.
  * @version Sat Jan 13 12:34:00 CET 2018
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\065\000\002\002\004\000\002\003\003\000\002\003" +
    "\004\000\002\004\004\000\002\004\003\000\002\006\005" +
    "\000\002\010\005\000\002\010\003\000\002\011\003\000" +
    "\002\011\006\000\002\007\003\000\002\007\003\000\002" +
    "\005\004\000\002\005\003\000\002\012\003\000\002\012" +
    "\003\000\002\012\003\000\002\012\003\000\002\012\005" +
    "\000\002\013\006\000\002\014\003\000\002\014\006\000" +
    "\002\014\006\000\002\016\007\000\002\016\005\000\002" +
    "\026\005\000\002\020\005\000\002\027\005\000\002\025" +
    "\003\000\002\021\005\000\002\015\005\000\002\015\005" +
    "\000\002\015\003\000\002\015\004\000\002\022\003\000" +
    "\002\022\003\000\002\022\003\000\002\023\003\000\002" +
    "\023\003\000\002\023\003\000\002\023\003\000\002\017" +
    "\005\000\002\017\003\000\002\017\004\000\002\024\004" +
    "\000\002\024\003\000\002\024\003\000\002\024\003\000" +
    "\002\024\003\000\002\024\003\000\002\024\003\000\002" +
    "\024\003\000\002\024\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\126\000\006\033\007\034\004\001\002\000\004\042" +
    "\ufff6\001\002\000\004\002\130\001\002\000\004\042\117" +
    "\001\002\000\004\042\ufff7\001\002\000\022\002\000\005" +
    "\017\033\007\034\004\035\025\036\015\037\026\042\024" +
    "\001\002\000\022\002\ufffd\005\ufffd\033\ufffd\034\ufffd\035" +
    "\ufffd\036\ufffd\037\ufffd\042\ufffd\001\002\000\022\002\ufff3" +
    "\004\ufff3\005\ufff3\035\ufff3\036\ufff3\037\ufff3\042\ufff3\044" +
    "\ufff3\001\002\000\022\002\ufff1\004\ufff1\005\ufff1\035\ufff1" +
    "\036\ufff1\037\ufff1\042\ufff1\044\ufff1\001\002\000\004\016" +
    "\114\001\002\000\004\006\107\001\002\000\022\002\ufffe" +
    "\005\ufffe\033\ufffe\034\ufffe\035\ufffe\036\ufffe\037\ufffe\042" +
    "\ufffe\001\002\000\014\005\017\035\025\036\015\037\026" +
    "\042\024\001\002\000\022\002\ufff0\004\ufff0\005\ufff0\035" +
    "\ufff0\036\ufff0\037\ufff0\042\ufff0\044\ufff0\001\002\000\010" +
    "\040\033\041\037\042\024\001\002\000\022\002\ufff2\004" +
    "\ufff2\005\ufff2\035\ufff2\036\ufff2\037\ufff2\042\ufff2\044\ufff2" +
    "\001\002\000\016\002\uffff\005\017\035\025\036\015\037" +
    "\026\042\024\001\002\000\044\007\uffed\010\075\011\uffed" +
    "\012\uffed\013\uffed\014\uffed\015\uffed\016\uffed\017\uffed\022" +
    "\uffed\023\uffed\024\uffed\025\uffed\026\uffed\027\uffed\030\uffed" +
    "\031\uffed\001\002\000\004\006\031\001\002\000\010\040" +
    "\uffe5\041\uffe5\042\uffe5\001\002\000\020\002\ufff4\004\ufff4" +
    "\005\ufff4\035\ufff4\036\ufff4\037\ufff4\042\ufff4\001\002\000" +
    "\014\005\017\035\025\036\015\037\026\042\024\001\002" +
    "\000\016\006\035\013\032\032\041\040\033\041\037\042" +
    "\024\001\002\000\010\040\033\041\037\042\024\001\002" +
    "\000\040\007\uffdf\012\uffdf\013\uffdf\014\uffdf\015\uffdf\016" +
    "\uffdf\017\uffdf\022\uffdf\023\uffdf\024\uffdf\025\uffdf\026\uffdf" +
    "\027\uffdf\030\uffdf\031\uffdf\001\002\000\040\007\uffdd\012" +
    "\uffdd\013\uffdd\014\uffdd\015\uffdd\016\uffdd\017\uffdd\022\uffdd" +
    "\023\uffdd\024\uffdd\025\uffdd\026\uffdd\027\uffdd\030\uffdd\031" +
    "\uffdd\001\002\000\014\006\035\013\032\040\033\041\037" +
    "\042\024\001\002\000\026\007\066\016\045\022\053\023" +
    "\046\024\052\025\051\026\054\027\047\030\044\031\055" +
    "\001\002\000\040\007\uffde\012\uffde\013\uffde\014\uffde\015" +
    "\uffde\016\uffde\017\uffde\022\uffde\023\uffde\024\uffde\025\uffde" +
    "\026\uffde\027\uffde\030\uffde\031\uffde\001\002\000\036\007" +
    "\uffd7\012\061\013\063\014\060\015\062\016\uffd7\022\uffd7" +
    "\023\uffd7\024\uffd7\025\uffd7\026\uffd7\027\uffd7\030\uffd7\031" +
    "\uffd7\001\002\000\016\006\035\013\032\032\041\040\033" +
    "\041\037\042\024\001\002\000\040\007\uffe1\012\uffe1\013" +
    "\uffe1\014\uffe1\015\uffe1\016\uffe1\017\uffe1\022\uffe1\023\uffe1" +
    "\024\uffe1\025\uffe1\026\uffe1\027\uffe1\030\uffe1\031\uffe1\001" +
    "\002\000\026\007\uffd6\016\045\022\053\023\046\024\052" +
    "\025\051\026\054\027\047\030\uffd6\031\uffd6\001\002\000" +
    "\016\006\uffce\013\uffce\032\uffce\040\uffce\041\uffce\042\uffce" +
    "\001\002\000\004\016\057\001\002\000\016\006\uffd4\013" +
    "\uffd4\032\uffd4\040\uffd4\041\uffd4\042\uffd4\001\002\000\016" +
    "\006\uffd2\013\uffd2\032\uffd2\040\uffd2\041\uffd2\042\uffd2\001" +
    "\002\000\016\006\035\013\032\032\041\040\033\041\037" +
    "\042\024\001\002\000\016\006\uffd0\013\uffd0\032\uffd0\040" +
    "\uffd0\041\uffd0\042\uffd0\001\002\000\016\006\uffcf\013\uffcf" +
    "\032\uffcf\040\uffcf\041\uffcf\042\uffcf\001\002\000\016\006" +
    "\uffd3\013\uffd3\032\uffd3\040\uffd3\041\uffd3\042\uffd3\001\002" +
    "\000\016\006\uffd1\013\uffd1\032\uffd1\040\uffd1\041\uffd1\042" +
    "\uffd1\001\002\000\016\006\uffcd\013\uffcd\032\uffcd\040\uffcd" +
    "\041\uffcd\042\uffcd\001\002\000\026\007\uffd8\016\045\022" +
    "\053\023\046\024\052\025\051\026\054\027\047\030\044" +
    "\031\055\001\002\000\016\006\uffd5\013\uffd5\032\uffd5\040" +
    "\uffd5\041\uffd5\042\uffd5\001\002\000\014\006\uffda\013\uffda" +
    "\040\uffda\041\uffda\042\uffda\001\002\000\014\006\uffdc\013" +
    "\uffdc\040\uffdc\041\uffdc\042\uffdc\001\002\000\014\006\uffd9" +
    "\013\uffd9\040\uffd9\041\uffd9\042\uffd9\001\002\000\014\006" +
    "\uffdb\013\uffdb\040\uffdb\041\uffdb\042\uffdb\001\002\000\014" +
    "\006\035\013\032\040\033\041\037\042\024\001\002\000" +
    "\040\007\uffe2\012\061\013\063\014\060\015\062\016\uffe2" +
    "\017\uffe2\022\uffe2\023\uffe2\024\uffe2\025\uffe2\026\uffe2\027" +
    "\uffe2\030\uffe2\031\uffe2\001\002\000\014\005\uffe8\035\uffe8" +
    "\036\uffe8\037\uffe8\042\uffe8\001\002\000\014\007\070\012" +
    "\061\013\063\014\060\015\062\001\002\000\040\007\uffe3" +
    "\012\uffe3\013\uffe3\014\uffe3\015\uffe3\016\uffe3\017\uffe3\022" +
    "\uffe3\023\uffe3\024\uffe3\025\uffe3\026\uffe3\027\uffe3\030\uffe3" +
    "\031\uffe3\001\002\000\040\007\uffe0\012\uffe0\013\uffe0\014" +
    "\uffe0\015\uffe0\016\uffe0\017\uffe0\022\uffe0\023\uffe0\024\uffe0" +
    "\025\uffe0\026\uffe0\027\uffe0\030\uffe0\031\uffe0\001\002\000" +
    "\022\002\uffe9\004\uffe9\005\uffe9\035\uffe9\036\uffe9\037\uffe9" +
    "\042\uffe9\044\073\001\002\000\014\005\017\035\025\036" +
    "\015\037\026\042\024\001\002\000\022\002\uffea\004\uffea" +
    "\005\uffea\035\uffea\036\uffea\037\uffea\042\uffea\044\uffea\001" +
    "\002\000\006\040\077\042\024\001\002\000\004\011\101" +
    "\001\002\000\004\011\100\001\002\000\042\007\uffec\011" +
    "\uffec\012\uffec\013\uffec\014\uffec\015\uffec\016\uffec\017\uffec" +
    "\022\uffec\023\uffec\024\uffec\025\uffec\026\uffec\027\uffec\030" +
    "\uffec\031\uffec\001\002\000\042\007\uffeb\011\uffeb\012\uffeb" +
    "\013\uffeb\014\uffeb\015\uffeb\016\uffeb\017\uffeb\022\uffeb\023" +
    "\uffeb\024\uffeb\025\uffeb\026\uffeb\027\uffeb\030\uffeb\031\uffeb" +
    "\001\002\000\020\002\ufff5\004\ufff5\005\ufff5\035\ufff5\036" +
    "\ufff5\037\ufff5\042\ufff5\001\002\000\004\017\104\001\002" +
    "\000\022\002\uffe4\004\uffe4\005\uffe4\035\uffe4\036\uffe4\037" +
    "\uffe4\042\uffe4\044\uffe4\001\002\000\016\004\106\005\017" +
    "\035\025\036\015\037\026\042\024\001\002\000\022\002" +
    "\uffef\004\uffef\005\uffef\035\uffef\036\uffef\037\uffef\042\uffef" +
    "\044\uffef\001\002\000\016\006\035\013\032\032\041\040" +
    "\033\041\037\042\024\001\002\000\014\005\017\035\025" +
    "\036\015\037\026\042\024\001\002\000\022\002\uffe7\004" +
    "\uffe7\005\uffe7\035\uffe7\036\uffe7\037\uffe7\042\uffe7\044\uffe7" +
    "\001\002\000\026\007\113\016\045\022\053\023\046\024" +
    "\052\025\051\026\054\027\047\030\044\031\055\001\002" +
    "\000\014\005\uffe6\035\uffe6\036\uffe6\037\uffe6\042\uffe6\001" +
    "\002\000\014\006\035\013\032\040\033\041\037\042\024" +
    "\001\002\000\014\012\061\013\063\014\060\015\062\017" +
    "\116\001\002\000\022\002\uffee\004\uffee\005\uffee\035\uffee" +
    "\036\uffee\037\uffee\042\uffee\044\uffee\001\002\000\010\010" +
    "\125\017\ufff9\021\ufff9\001\002\000\006\017\123\021\122" +
    "\001\002\000\006\017\ufffa\021\ufffa\001\002\000\004\042" +
    "\117\001\002\000\022\002\ufffc\005\ufffc\033\ufffc\034\ufffc" +
    "\035\ufffc\036\ufffc\037\ufffc\042\ufffc\001\002\000\006\017" +
    "\ufffb\021\ufffb\001\002\000\004\040\126\001\002\000\004" +
    "\011\127\001\002\000\006\017\ufff8\021\ufff8\001\002\000" +
    "\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\126\000\012\003\004\004\007\006\010\007\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\010\117" +
    "\011\120\001\001\000\002\001\001\000\026\005\022\006" +
    "\015\007\005\012\026\013\011\014\013\016\012\020\021" +
    "\021\017\025\020\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\027\107" +
    "\001\001\000\002\001\001\000\022\005\104\012\026\013" +
    "\011\014\013\016\012\020\021\021\017\025\020\001\001" +
    "\000\002\001\001\000\006\014\033\022\102\001\001\000" +
    "\002\001\001\000\020\012\101\013\011\014\013\016\012" +
    "\020\021\021\017\025\020\001\001\000\002\001\001\000" +
    "\004\026\027\001\001\000\002\001\001\000\002\001\001" +
    "\000\020\012\071\013\011\014\013\016\012\020\021\021" +
    "\017\025\020\001\001\000\012\014\033\015\037\017\035" +
    "\022\041\001\001\000\006\014\033\022\070\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\014\033\015\066" +
    "\022\041\001\001\000\004\024\047\001\001\000\002\001" +
    "\001\000\004\023\063\001\001\000\012\014\033\015\037" +
    "\017\042\022\041\001\001\000\002\001\001\000\004\024" +
    "\047\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\014\033\015\037\017" +
    "\055\022\041\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\024\047\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\014\033\015\064\022\041\001\001\000\004\023\063" +
    "\001\001\000\002\001\001\000\004\023\063\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\020" +
    "\012\073\013\011\014\013\016\012\020\021\021\017\025" +
    "\020\001\001\000\002\001\001\000\004\014\075\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\020\012\101\013\011\014\013\016\012\020" +
    "\021\021\017\025\020\001\001\000\002\001\001\000\012" +
    "\014\033\015\037\017\111\022\041\001\001\000\020\012" +
    "\110\013\011\014\013\016\012\020\021\021\017\025\020" +
    "\001\001\000\002\001\001\000\004\024\047\001\001\000" +
    "\002\001\001\000\010\014\033\015\114\022\041\001\001" +
    "\000\004\023\063\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\011\123" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    // Redefinition of error functions
    public void report_error(String message, Object info) {
        System.err.print("ERROR: Syntax error");
        if (info instanceof Symbol)
            if (((Symbol)info).left != -1){
                int line = (((Symbol)info).left)+1;
                int column = (((Symbol)info).right)+1;
                System.err.print(" (line "+line+", column "+column+"): ");
            } else System.err.print(": ");
		else System.err.print(": ");
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // cmp ::= OR 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // cmp ::= AND 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // cmp ::= LET 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // cmp ::= GET 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // cmp ::= ELT 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // cmp ::= EGT 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // cmp ::= LT 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // cmp ::= GT 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // cmp ::= EQUAL EQUAL 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(18/*cmp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // exp ::= NOT exp 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*exp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // exp ::= e 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*exp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // exp ::= exp cmp exp 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(13/*exp*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // op ::= SLASH 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(17/*op*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // op ::= STAR 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(17/*op*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // op ::= MINUS 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(17/*op*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // op ::= PLUS 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(17/*op*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // t ::= name 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(16/*t*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // t ::= DOUBLE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(16/*t*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // t ::= INT 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(16/*t*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // e ::= MINUS t 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*e*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // e ::= t 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*e*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // e ::= e op e 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*e*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // e ::= ROPEN e RCLOSE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(11/*e*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // func ::= name_f t S 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(15/*func*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // name_f ::= PRINT 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(19/*name_f*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // while_cond ::= ROPEN exp RCLOSE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(21/*while_cond*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // while ::= WHILE while_cond body_el 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(14/*while*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // if_cond ::= ROPEN exp RCLOSE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(20/*if_cond*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // if ::= IF if_cond body_el 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(12/*if*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // if ::= IF if_cond body_el ELSE body_el 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(12/*if*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // name ::= VAR SOPEN name SCLOSE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*name*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // name ::= VAR SOPEN INT SCLOSE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*name*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // name ::= VAR 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(10/*name*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // init_el ::= name EQUAL e S 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(9/*init_el*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // body_el ::= GOPEN body GCLOSE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*body_el*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // body_el ::= func 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*body_el*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // body_el ::= if 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*body_el*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // body_el ::= while 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*body_el*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // body_el ::= init_el 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(8/*body_el*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // body ::= body_el 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*body*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // body ::= body body_el 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(3/*body*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // type ::= DOUBLE_TYPE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // type ::= INT_TYPE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(5/*type*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // variable ::= VAR SOPEN INT SCLOSE 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*variable*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // variable ::= VAR 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(7/*variable*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // var_list ::= variable 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*var_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // var_list ::= var_list COMMA variable 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(6/*var_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaration ::= type var_list S 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(4/*declaration*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // declaration_list ::= declaration 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*declaration_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaration_list ::= declaration_list declaration 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(2/*declaration_list*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= declaration_list body 
            { 
              Object RESULT = null;
		 System.out.println("Program correctly recognised"); 
              CUP$parser$result = new java_cup.runtime.Symbol(1/*program*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= declaration_list 
            { 
              Object RESULT = null;

              CUP$parser$result = new java_cup.runtime.Symbol(1/*program*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            { 
              Object RESULT = null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = new java_cup.runtime.Symbol(0/*$START*/, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-0)).right, RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

