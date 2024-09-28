
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analyzers;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import models.login;
import models.newUser;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class S_Analyzer_main extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Symbols_main.class;
}

  /** Default constructor. */
  @Deprecated
  public S_Analyzer_main() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public S_Analyzer_main(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public S_Analyzer_main(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\031\000\002\002\004\000\002\002\015\000\002\002" +
    "\003\000\002\002\003\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\007\061\000\002\004\027\000" +
    "\002\004\004\000\002\010\013\000\002\010\011\000\002" +
    "\010\003\000\002\011\012\000\002\011\012\000\002\011" +
    "\012\000\002\011\012\000\002\011\012\000\002\011\003" +
    "\000\002\005\071\000\002\006\051\000\002\012\003\000" +
    "\002\012\003\000\002\013\004\000\002\013\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\320\000\006\003\004\004\005\001\002\000\004\002" +
    "\ufffe\001\002\000\004\006\011\001\002\000\004\002\uffff" +
    "\001\002\000\004\002\010\001\002\000\004\002\001\001" +
    "\002\000\004\010\012\001\002\000\004\011\013\001\002" +
    "\000\004\007\014\001\002\000\004\013\015\001\002\000" +
    "\004\012\016\001\002\000\004\013\017\001\002\000\004" +
    "\006\020\001\002\000\004\005\021\001\002\000\006\003" +
    "\024\004\027\001\002\000\004\002\ufffb\001\002\000\004" +
    "\002\000\001\002\000\006\003\024\004\316\001\002\000" +
    "\004\002\ufffc\001\002\000\004\002\ufffd\001\002\000\006" +
    "\006\031\014\030\001\002\000\004\015\151\001\002\000" +
    "\004\010\032\001\002\000\004\011\033\001\002\000\004" +
    "\007\034\001\002\000\004\013\035\001\002\000\004\012" +
    "\036\001\002\000\004\013\037\001\002\000\004\006\040" +
    "\001\002\000\004\005\041\001\002\000\004\004\042\001" +
    "\002\000\004\014\043\001\002\000\004\015\044\001\002" +
    "\000\004\016\045\001\002\000\004\013\046\001\002\000" +
    "\006\020\047\021\050\001\002\000\004\013\102\001\002" +
    "\000\004\013\051\001\002\000\004\005\052\001\002\000" +
    "\004\023\053\001\002\000\004\013\054\001\002\000\004" +
    "\036\055\001\002\000\004\013\056\001\002\000\004\016" +
    "\057\001\002\000\004\025\060\001\002\000\004\023\061" +
    "\001\002\000\004\013\062\001\002\000\004\032\063\001" +
    "\002\000\004\013\064\001\002\000\004\016\065\001\002" +
    "\000\004\013\066\001\002\000\006\030\071\041\067\001" +
    "\002\000\004\013\uffeb\001\002\000\004\013\072\001\002" +
    "\000\004\013\uffec\001\002\000\004\024\073\001\002\000" +
    "\004\026\074\001\002\000\004\024\075\001\002\000\004" +
    "\004\076\001\002\000\004\031\077\001\002\000\004\014" +
    "\100\001\002\000\004\005\101\001\002\000\004\002\uffed" +
    "\001\002\000\004\005\103\001\002\000\004\023\104\001" +
    "\002\000\004\013\105\001\002\000\004\036\106\001\002" +
    "\000\004\013\107\001\002\000\004\016\110\001\002\000" +
    "\004\025\111\001\002\000\004\023\112\001\002\000\004" +
    "\013\113\001\002\000\004\037\114\001\002\000\004\013" +
    "\115\001\002\000\004\016\116\001\002\000\004\013\117" +
    "\001\002\000\006\030\071\041\067\001\002\000\004\013" +
    "\121\001\002\000\004\027\122\001\002\000\004\013\123" +
    "\001\002\000\004\017\124\001\002\000\004\013\125\001" +
    "\002\000\004\016\126\001\002\000\004\013\127\001\002" +
    "\000\006\030\071\041\067\001\002\000\004\013\131\001" +
    "\002\000\004\027\132\001\002\000\004\013\133\001\002" +
    "\000\004\040\134\001\002\000\004\013\135\001\002\000" +
    "\004\016\136\001\002\000\004\013\137\001\002\000\006" +
    "\030\071\041\067\001\002\000\004\013\141\001\002\000" +
    "\004\024\142\001\002\000\004\026\143\001\002\000\004" +
    "\024\144\001\002\000\004\004\145\001\002\000\004\031" +
    "\146\001\002\000\004\014\147\001\002\000\004\005\150" +
    "\001\002\000\004\002\uffee\001\002\000\004\016\152\001" +
    "\002\000\004\013\153\001\002\000\006\017\154\022\155" +
    "\001\002\000\004\013\215\001\002\000\004\013\156\001" +
    "\002\000\004\005\157\001\002\000\004\023\160\001\002" +
    "\000\004\013\161\001\002\000\004\036\162\001\002\000" +
    "\004\013\163\001\002\000\004\016\164\001\002\000\004" +
    "\025\165\001\002\000\004\023\166\001\002\000\004\013" +
    "\167\001\002\000\004\032\170\001\002\000\004\013\171" +
    "\001\002\000\004\016\172\001\002\000\004\013\173\001" +
    "\002\000\006\030\071\041\067\001\002\000\004\013\175" +
    "\001\002\000\004\027\176\001\002\000\004\013\177\001" +
    "\002\000\004\033\200\001\002\000\004\013\201\001\002" +
    "\000\004\016\202\001\002\000\004\013\203\001\002\000" +
    "\006\030\071\041\067\001\002\000\004\013\205\001\002" +
    "\000\004\024\206\001\002\000\004\026\207\001\002\000" +
    "\004\024\210\001\002\000\004\004\211\001\002\000\004" +
    "\031\212\001\002\000\004\014\213\001\002\000\004\005" +
    "\214\001\002\000\004\002\ufffa\001\002\000\004\005\216" +
    "\001\002\000\004\023\217\001\002\000\004\013\220\001" +
    "\002\000\004\036\221\001\002\000\004\013\222\001\002" +
    "\000\004\016\223\001\002\000\004\025\224\001\002\000" +
    "\006\003\226\023\225\001\002\000\006\003\237\013\236" +
    "\001\002\000\004\026\ufff5\001\002\000\004\026\230\001" +
    "\002\000\004\024\231\001\002\000\004\004\232\001\002" +
    "\000\004\031\233\001\002\000\004\014\234\001\002\000" +
    "\004\005\235\001\002\000\004\002\ufff9\001\002\000\014" +
    "\032\252\033\251\034\254\035\253\042\250\001\002\000" +
    "\010\003\uffef\013\uffef\024\uffef\001\002\000\006\003\237" +
    "\013\236\001\002\000\006\003\237\013\236\001\002\000" +
    "\006\003\237\013\236\001\002\000\006\003\237\013\236" +
    "\001\002\000\004\024\245\001\002\000\006\026\ufff6\027" +
    "\246\001\002\000\006\003\226\023\225\001\002\000\004" +
    "\026\ufff7\001\002\000\004\013\307\001\002\000\004\013" +
    "\301\001\002\000\004\013\273\001\002\000\004\013\265" +
    "\001\002\000\004\013\255\001\002\000\004\016\256\001" +
    "\002\000\004\013\257\001\002\000\004\041\260\001\002" +
    "\000\006\013\uffe9\041\260\001\002\000\004\013\262\001" +
    "\002\000\004\027\263\001\002\000\010\003\ufff2\013\ufff2" +
    "\024\ufff2\001\002\000\004\013\uffea\001\002\000\004\016" +
    "\266\001\002\000\004\013\267\001\002\000\004\041\260" +
    "\001\002\000\004\013\271\001\002\000\004\027\272\001" +
    "\002\000\010\003\ufff1\013\ufff1\024\ufff1\001\002\000\004" +
    "\016\274\001\002\000\004\013\275\001\002\000\006\030" +
    "\071\041\067\001\002\000\004\013\277\001\002\000\004" +
    "\027\300\001\002\000\010\003\ufff4\013\ufff4\024\ufff4\001" +
    "\002\000\004\016\302\001\002\000\004\013\303\001\002" +
    "\000\006\030\071\041\067\001\002\000\004\013\305\001" +
    "\002\000\004\027\306\001\002\000\010\003\ufff3\013\ufff3" +
    "\024\ufff3\001\002\000\004\016\310\001\002\000\004\013" +
    "\311\001\002\000\004\043\312\001\002\000\004\013\313" +
    "\001\002\000\004\027\314\001\002\000\010\003\ufff0\013" +
    "\ufff0\024\ufff0\001\002\000\004\002\ufff8\001\002\000\004" +
    "\014\317\001\002\000\004\015\320\001\002\000\004\016" +
    "\321\001\002\000\004\013\322\001\002\000\004\017\154" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\320\000\006\002\006\007\005\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\003" +
    "\022\004\025\005\024\006\021\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\004\314\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\067\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\117\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\127\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\137\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\173\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\203\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\010" +
    "\226\001\001\000\004\011\237\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\011" +
    "\240\001\001\000\004\011\241\001\001\000\004\011\242" +
    "\001\001\000\004\011\243\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\246\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\260\001\001\000\004\013\263\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\013\267\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\275\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\303\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$S_Analyzer_main$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$S_Analyzer_main$actions(this);
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
    return action_obj.CUP$S_Analyzer_main$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    public String requestName = null;

    public String userName = null;
    public String password = null;
    public String name = null;
    public String institution = null;
    public String date = null;

    private int blockCount = 0;

    public static LinkedList<login> loginList = new LinkedList<login>();
    public static LinkedList<newUser> newUserList = new LinkedList<newUser>();

    private LinkedList<String> userNameList = new LinkedList<String>();
    private LinkedList<String> passwordList = new LinkedList<String>();
    private LinkedList<String> nameList = new LinkedList<String>();
    private LinkedList<String> institutionList = new LinkedList<String>();
    private LinkedList<String> dateList = new LinkedList<String>();

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

        login data = new login("error", "errror");
        loginList.add(0, data);
        requestName = "error";
        cleandata();
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

        login data = new login("error", "errror");
        loginList.add(0, data);
        requestName = "error";
        cleandata();
    }

    private void cleandata(){
        requestName = "error";
        userName = "error";
        password = "error";
        name = "error";
        institution = "error";
        date = "error";
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$S_Analyzer_main$actions {




  private final S_Analyzer_main parser;

  /** Constructor */
  CUP$S_Analyzer_main$actions(S_Analyzer_main parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer_main$do_action_part00000000(
    int                        CUP$S_Analyzer_main$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer_main$parser,
    java.util.Stack            CUP$S_Analyzer_main$stack,
    int                        CUP$S_Analyzer_main$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$S_Analyzer_main$result;

      /* select the action based on the action number */
      switch (CUP$S_Analyzer_main$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)).value;
		RESULT = start_val;
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$S_Analyzer_main$parser.done_parsing();
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= LessThan QuestionMark XSONsentence Version Equal QuotationMark VersionNumber QuotationMark QuestionMark GreaterThan SINGLEREQUEST 
            {
              String RESULT =null;
		System.out.println("Sentencia correcta y aceptada");
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-10)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= LOGINUSUARIO 
            {
              String RESULT =null;

              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= error 
            {
              String RESULT =null;
		System.out.println("Error en la sentencia inicial");
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SINGLEREQUEST ::= USUARIONUEVO 
            {
              String RESULT =null;

              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("SINGLEREQUEST",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SINGLEREQUEST ::= MODIFICARUSUARIO 
            {
              String RESULT =null;

              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("SINGLEREQUEST",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SINGLEREQUEST ::= ELIMINARUSUARIO 
            {
              String RESULT =null;

              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("SINGLEREQUEST",1, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // LOGINUSUARIO ::= LessThan QuestionMark XSONsentence Version Equal QuotationMark VersionNumber QuotationMark QuestionMark GreaterThan LessThan ExclamationMark RealizarSolicitud Colon QuotationMark LoginUsuario QuotationMark GreaterThan LeftBrace QuotationMark DatosUsuario QuotationMark Colon LeftBracket LeftBrace QuotationMark Usuario QuotationMark Colon QuotationMark VALUES QuotationMark Comma QuotationMark Password QuotationMark Colon QuotationMark VALUES QuotationMark RightBrace RightBracket RightBrace LessThan FinSolicitud ExclamationMark GreaterThan 
            {
              String RESULT =null;
		int usernameleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-16)).left;
		int usernameright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-16)).right;
		String username = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-16)).value;
		int passwordleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-8)).left;
		int passwordright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-8)).right;
		String password = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-8)).value;
		System.out.println("Sentencia de login reconocida y aceptada");
                   requestName = "login";
                   login data = new login(username, password);
                   loginList.add(0, data);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("LOGINUSUARIO",5, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-46)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // USUARIONUEVO ::= LessThan ExclamationMark RealizarSolicitud Colon QuotationMark UsuarioNuevo QuotationMark GreaterThan LeftBrace QuotationMark DatosUsuario QuotationMark Colon LeftBracket NEWUSERLOOP RightBracket RightBrace LessThan FinSolicitud ExclamationMark GreaterThan 
            {
              String RESULT =null;
		requestName = "nuevo";
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("USUARIONUEVO",2, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-20)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // USUARIONUEVO ::= error USUARIONUEVO 
            {
              String RESULT =null;
		System.out.println("Error en la declaración de USUARIONUEVO"); 
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("USUARIONUEVO",2, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // NEWUSERLOOP ::= LeftBrace NEWUSERBLOCK NEWUSERBLOCK NEWUSERBLOCK NEWUSERBLOCK NEWUSERBLOCK RightBrace Comma NEWUSERLOOP 
            {
              String RESULT =null;
		newUser data = new newUser(userNameList.poll(), passwordList.poll(), nameList.poll(), institutionList.poll(), dateList.poll());
                newUserList.add(data);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERLOOP",6, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-8)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NEWUSERLOOP ::= LeftBrace NEWUSERBLOCK NEWUSERBLOCK NEWUSERBLOCK NEWUSERBLOCK NEWUSERBLOCK RightBrace 
            {
              String RESULT =null;
		newUser data = new newUser(userNameList.poll(), passwordList.poll(), nameList.poll(), institutionList.poll(), dateList.poll());
                newUserList.add(data);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERLOOP",6, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-6)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // NEWUSERLOOP ::= error 
            {
              String RESULT =null;
		System.out.println("Error en la declaración de NEWUSERLOOP"); 
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERLOOP",6, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // NEWUSERBLOCK ::= QuotationMark Usuario QuotationMark Colon QuotationMark VALUES QuotationMark Comma 
            {
              String RESULT =null;
		int usernameValleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).left;
		int usernameValright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).right;
		String usernameVal = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).value;
		userName = (String) usernameVal;
                userNameList.add(userName);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERBLOCK",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NEWUSERBLOCK ::= QuotationMark Password QuotationMark Colon QuotationMark VALUES QuotationMark Comma 
            {
              String RESULT =null;
		int passwordValleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).left;
		int passwordValright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).right;
		String passwordVal = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).value;
		password = (String) passwordVal;
                 passwordList.add(password);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERBLOCK",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // NEWUSERBLOCK ::= QuotationMark Nombre QuotationMark Colon QuotationMark NAMES QuotationMark Comma 
            {
              String RESULT =null;
		int nameValleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).left;
		int nameValright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).right;
		String nameVal = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).value;
		name = (String) nameVal;
                nameList.add(name);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERBLOCK",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // NEWUSERBLOCK ::= QuotationMark Institucion QuotationMark Colon QuotationMark NAMES QuotationMark Comma 
            {
              String RESULT =null;
		int institutionValleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).left;
		int institutionValright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).right;
		String institutionVal = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).value;
		institution = (String) institutionVal;
                institutionList.add(institution);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERBLOCK",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // NEWUSERBLOCK ::= QuotationMark FechaCreacion QuotationMark Colon QuotationMark Date QuotationMark Comma 
            {
              String RESULT =null;
		int dateValleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).left;
		int dateValright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).right;
		String dateVal = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-2)).value;
		date = (String) dateVal;
                dateList.add(date);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERBLOCK",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-7)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // NEWUSERBLOCK ::= error 
            {
              String RESULT =null;
		System.out.println("Error en la declaración de NEWUSERBLOCK");
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NEWUSERBLOCK",7, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // MODIFICARUSUARIO ::= LessThan QuestionMark XSONsentence Version Equal QuotationMark VersionNumber QuotationMark QuestionMark GreaterThan LessThan ExclamationMark RealizarSolicitud Colon QuotationMark ModificarUsuario QuotationMark GreaterThan LeftBrace QuotationMark DatosUsuario QuotationMark Colon LeftBracket LeftBrace QuotationMark UsuarioAntiguo QuotationMark Colon QuotationMark VALUES QuotationMark Comma QuotationMark UsuarioNuevo QuotationMark Colon QuotationMark VALUES QuotationMark Comma QuotationMark NuevoPassword QuotationMark Colon QuotationMark VALUES QuotationMark RightBrace RightBracket RightBrace LessThan FinSolicitud ExclamationMark GreaterThan 
            {
              String RESULT =null;
		System.out.println("Sentencia de modificacion de usuario reconocida y aceptada");
                    requestName = "modificar";
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("MODIFICARUSUARIO",3, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-54)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ELIMINARUSUARIO ::= LessThan QuestionMark XSONsentence Version Equal QuotationMark VersionNumber QuotationMark QuestionMark GreaterThan LessThan ExclamationMark RealizarSolicitud Colon QuotationMark EliminarUsuario QuotationMark GreaterThan LeftBrace QuotationMark DatosUsuario QuotationMark Colon LeftBracket LeftBrace QuotationMark Usuario QuotationMark Colon QuotationMark VALUES QuotationMark RightBrace RightBracket RightBrace LessThan FinSolicitud ExclamationMark GreaterThan 
            {
              String RESULT =null;
		System.out.println("Sentencia de eliminacion de usuario reconocida y aceptada");
                    requestName = "eliminar";
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("ELIMINARUSUARIO",4, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-38)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // VALUES ::= Values 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.peek()).value;
		RESULT = String.valueOf(a);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("VALUES",8, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // VALUES ::= niValue 
            {
              String RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.peek()).value;
		RESULT = String.valueOf(b);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("VALUES",8, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // NAMES ::= niValue NAMES 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.peek()).value;
		RESULT = String.valueOf(a) + " " + String.valueOf(b);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NAMES",9, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.elementAt(CUP$S_Analyzer_main$top-1)), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // NAMES ::= niValue 
            {
              String RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$S_Analyzer_main$stack.peek()).value;
		RESULT = String.valueOf(b);
              CUP$S_Analyzer_main$result = parser.getSymbolFactory().newSymbol("NAMES",9, ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), ((java_cup.runtime.Symbol)CUP$S_Analyzer_main$stack.peek()), RESULT);
            }
          return CUP$S_Analyzer_main$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$S_Analyzer_main$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$S_Analyzer_main$do_action(
    int                        CUP$S_Analyzer_main$act_num,
    java_cup.runtime.lr_parser CUP$S_Analyzer_main$parser,
    java.util.Stack            CUP$S_Analyzer_main$stack,
    int                        CUP$S_Analyzer_main$top)
    throws java.lang.Exception
    {
              return CUP$S_Analyzer_main$do_action_part00000000(
                               CUP$S_Analyzer_main$act_num,
                               CUP$S_Analyzer_main$parser,
                               CUP$S_Analyzer_main$stack,
                               CUP$S_Analyzer_main$top);
    }
}

}
