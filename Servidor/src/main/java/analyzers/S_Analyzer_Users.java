
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analyzers;

import java_cup.runtime.Symbol;
import models.User;
import filesManager.readFiles;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class S_Analyzer_Users extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Symbols_Users.class;
}

  /** Default constructor. */
  @Deprecated
  public S_Analyzer_Users() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public S_Analyzer_Users(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public S_Analyzer_Users(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\015\000\002\002\004\000\002\002\003\000\002\003" +
    "\006\000\002\004\007\000\002\005\033\000\002\006\003" +
    "\000\002\006\002\000\002\007\012\000\002\007\012\000" +
    "\002\010\012\000\002\010\012\000\002\011\003\000\002" +
    "\011\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\004\013\005\001\002\000\004\002\000\001" +
    "\002\000\004\004\010\001\002\000\004\002\007\001\002" +
    "\000\004\002\001\001\002\000\004\006\011\001\002\000" +
    "\004\011\014\001\002\000\004\005\013\001\002\000\004" +
    "\002\uffff\001\002\000\004\014\070\001\002\000\004\011" +
    "\023\001\002\000\004\007\017\001\002\000\004\010\020" +
    "\001\002\000\006\005\ufffb\006\011\001\002\000\004\005" +
    "\ufffe\001\002\000\004\005\ufffc\001\002\000\004\015\056" +
    "\001\002\000\004\011\025\001\002\000\004\016\026\001" +
    "\002\000\004\011\027\001\002\000\004\012\030\001\002" +
    "\000\004\011\031\001\002\000\004\020\033\001\002\000" +
    "\004\011\035\001\002\000\006\011\ufff6\020\033\001\002" +
    "\000\004\011\ufff5\001\002\000\004\010\036\001\002\000" +
    "\004\011\037\001\002\000\004\017\040\001\002\000\004" +
    "\011\041\001\002\000\004\012\042\001\002\000\004\011" +
    "\043\001\002\000\004\020\033\001\002\000\004\011\045" +
    "\001\002\000\004\010\046\001\002\000\004\011\047\001" +
    "\002\000\004\022\050\001\002\000\004\011\051\001\002" +
    "\000\004\012\052\001\002\000\004\011\053\001\002\000" +
    "\004\023\054\001\002\000\004\011\055\001\002\000\004" +
    "\007\ufffd\001\002\000\004\011\057\001\002\000\004\012" +
    "\060\001\002\000\004\011\061\001\002\000\006\020\062" +
    "\021\063\001\002\000\004\011\066\001\002\000\004\011" +
    "\064\001\002\000\004\010\065\001\002\000\004\011\ufff8" +
    "\001\002\000\004\010\067\001\002\000\004\011\ufff7\001" +
    "\002\000\004\011\071\001\002\000\004\012\072\001\002" +
    "\000\004\011\073\001\002\000\006\020\074\021\075\001" +
    "\002\000\004\011\100\001\002\000\004\011\076\001\002" +
    "\000\004\010\077\001\002\000\004\011\ufffa\001\002\000" +
    "\004\010\101\001\002\000\004\011\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\077\000\006\002\005\003\003\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\011\001\001\000\006\005\015\007\014\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\023\001\001\000\002\001\001\000\002\001" +
    "\001\000\006\004\021\006\020\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\031\001\001\000\002\001\001\000" +
    "\004\011\033\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\011\043\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$S_Analyzer_Users$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$S_Analyzer_Users$actions(this);
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
    return action_obj.CUP$S_Analyzer_Users$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    //Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s)
    {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!!!!!! Error Sintactico Recuperado !!!!!!!");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

    }

    //Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!!!!!! Error Sintactico, Panic Mode !!!!!!! ");
        System.out.println("\t\tLexema: "+lexema);
        System.out.println("\t\tFila: "+fila);
        System.out.println("\t\tColumna: "+columna);

    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$S_Analyzer_Users$actions {



  private final S_Analyzer_Users parser;

  /** Constructor */
  CUP$S_Analyzer_Users$actions(S_Analyzer_Users parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer_Users$do_action_part00000000(
    int                        CUP$S_Analyzer_Users$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer_Users$parser,
    java.util.Stack            CUP$S_Analyzer_Users$stack,
    int                        CUP$S_Analyzer_Users$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$S_Analyzer_Users$result;

      /* select the action based on the action number */
      switch (CUP$S_Analyzer_Users$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)).value;
		RESULT = start_val;
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$S_Analyzer_Users$parser.done_parsing();
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= A 
            {
              String RESULT =null;

              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // A ::= Init OpenParenthesis B CloseParenthesis 
            {
              String RESULT =null;

              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("A",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-3)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // B ::= LeftBrace C RightBrace Comma D 
            {
              String RESULT =null;

              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("B",2, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-4)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // C ::= E F QuotationMark Name QuotationMark Colon QuotationMark G QuotationMark Comma QuotationMark Institution QuotationMark Colon QuotationMark G QuotationMark Comma QuotationMark FechaCreacion QuotationMark Colon QuotationMark Date QuotationMark 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-24)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-24)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-24)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-23)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-23)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-23)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-17)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-17)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-17)).value;
		int dleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-9)).left;
		int dright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-9)).right;
		String d = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-9)).value;
		String userName = String.valueOf(a);
        String password = String.valueOf(b);
        String name = String.valueOf(c);
        String institution = String.valueOf(d);
        User data = new User(userName, password, name, institution);
        readFiles.usersList.add(data);
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("C",3, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-24)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // D ::= B 
            {
              String RESULT =null;

              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // D ::= 
            {
              String RESULT =null;

              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("D",4, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // E ::= QuotationMark User QuotationMark Colon QuotationMark UPValue QuotationMark Comma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).value;
		RESULT = String.valueOf(a);
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("E",5, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // E ::= QuotationMark User QuotationMark Colon QuotationMark NIValue QuotationMark Comma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).value;
		RESULT = String.valueOf(a);
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("E",5, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // F ::= QuotationMark Password QuotationMark Colon QuotationMark UPValue QuotationMark Comma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).value;
		RESULT = String.valueOf(a);
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("F",6, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // F ::= QuotationMark Password QuotationMark Colon QuotationMark NIValue QuotationMark Comma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-2)).value;
		RESULT = String.valueOf(a);
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("F",6, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // G ::= NIValue 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.peek()).value;
		RESULT = String.valueOf(a);
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("G",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // G ::= NIValue G 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_Users$stack.peek()).value;
		RESULT = String.valueOf(a)+" "+String.valueOf(b);
              CUP$S_Analyzer_Users$result = parser.getSymbolFactory().newSymbol("G",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.elementAt(CUP$S_Analyzer_Users$top-1)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_Users$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_Users$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$S_Analyzer_Users$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer_Users$do_action(
    int                        CUP$S_Analyzer_Users$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer_Users$parser,
    java.util.Stack            CUP$S_Analyzer_Users$stack,
    int                        CUP$S_Analyzer_Users$top)
    throws java.lang.Exception
    {
              return CUP$S_Analyzer_Users$do_action_part00000000(
                               CUP$S_Analyzer_Users$act_num,
                               CUP$S_Analyzer_Users$parser,
                               CUP$S_Analyzer_Users$stack,
                               CUP$S_Analyzer_Users$top);
    }
}

}
