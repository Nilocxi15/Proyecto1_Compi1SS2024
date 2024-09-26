// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: users.jflex

/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package analyzers;

import java_cup.runtime.*;

/*------------  2da Area: Opciones y Declaraciones ---------*/

@SuppressWarnings("fallthrough")
public class L_Analyzer_Users implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  3,  1,  4,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0,  5,  0,  0,  0,  0,  0,  6,  7,  0,  0,  8,  0,  9, 10, 
    11, 12, 13, 14, 15, 15, 15, 15, 15, 15, 16,  0,  0,  0,  0,  0, 
     0, 17, 18, 19, 20, 21, 22, 23, 24, 25, 23, 23, 23, 26, 27, 28, 
    29, 23, 30, 31, 32, 33, 23, 34, 23, 23, 23,  0,  0,  0,  0, 35, 
     0, 36, 37, 38, 39, 40, 41, 42, 43, 44, 42, 42, 42, 45, 46, 47, 
    48, 42, 49, 50, 51, 52, 42, 53, 42, 42, 42, 54,  0, 55,  0,  0, 
     0,  0,  0,  0,  0,  3,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\1\6\2\7"+
    "\1\10\7\11\6\7\1\12\1\13\1\7\1\11\1\7"+
    "\1\11\1\7\1\11\1\7\1\11\1\7\1\11\1\7"+
    "\1\11\1\7\2\0\1\11\1\7\1\11\1\7\1\11"+
    "\1\7\1\11\1\7\1\11\1\7\2\0\1\11\1\7"+
    "\1\11\1\7\1\11\1\7\1\11\1\7\1\11\1\7"+
    "\2\0\1\11\1\7\1\11\1\7\1\11\1\7\1\11"+
    "\1\7\1\11\1\7\2\0\1\7\1\11\1\7\2\14"+
    "\1\11\1\7\1\11\1\7\2\0\1\7\1\11\1\7"+
    "\1\11\1\7\2\15\1\0\1\16\1\7\1\11\1\7"+
    "\2\17\1\0\1\7\1\11\1\7\1\20\1\7\1\11"+
    "\2\7\2\21\2\7\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[116];
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
    "\0\0\0\70\0\70\0\160\0\70\0\70\0\70\0\70"+
    "\0\250\0\340\0\70\0\u0118\0\u0150\0\u0188\0\u01c0\0\u01f8"+
    "\0\u0230\0\u0268\0\u02a0\0\u02d8\0\u0310\0\u0348\0\u0380\0\u03b8"+
    "\0\70\0\70\0\u03f0\0\u0428\0\u0460\0\u0498\0\u04d0\0\u0508"+
    "\0\u0540\0\u0578\0\u05b0\0\u05e8\0\u0620\0\u0658\0\u0690\0\u06c8"+
    "\0\u0700\0\u0738\0\u0770\0\u07a8\0\u07e0\0\u0818\0\u0850\0\u0888"+
    "\0\u08c0\0\u08f8\0\u0930\0\u0968\0\u09a0\0\u09d8\0\u0a10\0\u0a48"+
    "\0\u0a80\0\u0ab8\0\u0af0\0\u0b28\0\u0b60\0\u0b98\0\u0bd0\0\u0c08"+
    "\0\u0c40\0\u0c78\0\u0cb0\0\u0ce8\0\u0d20\0\u0d58\0\u0d90\0\u0dc8"+
    "\0\u0e00\0\u0e38\0\u0e70\0\u0ea8\0\u0ee0\0\u0f18\0\u0f50\0\u0f88"+
    "\0\u0118\0\340\0\u0fc0\0\u0ff8\0\u1030\0\u1068\0\u10a0\0\u10d8"+
    "\0\u1110\0\u1148\0\u1180\0\u11b8\0\u11f0\0\u0118\0\340\0\u1228"+
    "\0\70\0\u1260\0\u1298\0\u12d0\0\u0118\0\340\0\u1308\0\u1340"+
    "\0\u1378\0\u13b0\0\70\0\u13e8\0\u1420\0\u1458\0\u1490\0\u0118"+
    "\0\340\0\u14c8\0\u1500\0\340";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[116];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\2\2\4\11\1\12\1\13\3\14\1\15\1\14\1\16"+
    "\2\14\1\17\1\14\1\20\1\14\1\21\3\14\1\22"+
    "\1\14\4\12\1\23\1\12\1\24\2\12\1\25\1\12"+
    "\1\26\1\12\1\27\3\12\1\30\1\12\1\31\1\32"+
    "\72\0\1\3\100\0\5\33\1\0\45\12\15\0\5\12"+
    "\1\0\45\12\15\0\5\12\1\0\22\14\23\12\15\0"+
    "\5\12\1\0\1\14\1\34\20\14\2\12\1\35\20\12"+
    "\15\0\5\12\1\0\4\14\1\36\15\14\5\12\1\37"+
    "\15\12\15\0\5\12\1\0\12\14\1\40\7\14\13\12"+
    "\1\41\7\12\15\0\5\12\1\0\13\14\1\42\6\14"+
    "\14\12\1\43\6\12\15\0\5\12\1\0\1\44\21\14"+
    "\1\12\1\45\21\12\15\0\5\12\1\0\16\14\1\46"+
    "\3\14\17\12\1\47\3\12\15\0\5\12\1\0\1\12"+
    "\1\35\22\12\1\35\20\12\15\0\5\12\1\0\4\12"+
    "\1\37\22\12\1\37\15\12\15\0\5\12\1\0\12\12"+
    "\1\41\22\12\1\41\7\12\15\0\5\12\1\0\13\12"+
    "\1\43\22\12\1\43\6\12\15\0\5\12\1\0\1\45"+
    "\22\12\1\45\21\12\15\0\5\12\1\0\16\12\1\47"+
    "\22\12\1\47\3\12\14\0\1\50\5\12\1\0\45\12"+
    "\13\0\1\51\1\0\5\12\1\0\22\14\23\12\13\0"+
    "\1\51\1\0\5\12\1\0\45\12\15\0\5\12\1\0"+
    "\2\14\1\52\17\14\3\12\1\53\17\12\15\0\5\12"+
    "\1\0\2\12\1\53\22\12\1\53\17\12\15\0\5\12"+
    "\1\0\16\14\1\54\3\14\17\12\1\55\3\12\15\0"+
    "\5\12\1\0\16\12\1\55\22\12\1\55\3\12\15\0"+
    "\5\12\1\0\11\14\1\56\10\14\12\12\1\57\10\12"+
    "\15\0\5\12\1\0\11\12\1\57\22\12\1\57\10\12"+
    "\15\0\5\12\1\0\16\14\1\60\3\14\17\12\1\61"+
    "\3\12\15\0\5\12\1\0\16\12\1\61\22\12\1\61"+
    "\3\12\15\0\5\12\1\0\20\14\1\62\1\14\21\12"+
    "\1\63\1\12\15\0\5\12\1\0\20\12\1\63\22\12"+
    "\1\63\1\12\15\0\2\64\114\0\1\65\22\0\1\65"+
    "\16\0\5\12\1\0\7\14\1\66\12\14\10\12\1\67"+
    "\12\12\15\0\5\12\1\0\7\12\1\67\22\12\1\67"+
    "\12\12\15\0\5\12\1\0\17\14\1\70\2\14\20\12"+
    "\1\71\2\12\15\0\5\12\1\0\17\12\1\71\22\12"+
    "\1\71\2\12\15\0\5\12\1\0\1\14\1\72\20\14"+
    "\2\12\1\73\20\12\15\0\5\12\1\0\1\12\1\73"+
    "\22\12\1\73\20\12\15\0\5\12\1\0\16\14\1\74"+
    "\3\14\17\12\1\75\3\12\15\0\5\12\1\0\16\12"+
    "\1\75\22\12\1\75\3\12\15\0\5\12\1\0\1\76"+
    "\21\14\1\12\1\77\21\12\15\0\5\12\1\0\1\77"+
    "\22\12\1\77\21\12\15\0\5\100\107\0\1\101\22\0"+
    "\1\101\20\0\5\12\1\0\1\102\21\14\1\12\1\103"+
    "\21\12\15\0\5\12\1\0\1\103\22\12\1\103\21\12"+
    "\15\0\5\12\1\0\10\14\1\104\11\14\11\12\1\105"+
    "\11\12\15\0\5\12\1\0\10\12\1\105\22\12\1\105"+
    "\11\12\15\0\5\12\1\0\15\14\1\106\4\14\16\12"+
    "\1\107\4\12\15\0\5\12\1\0\15\12\1\107\22\12"+
    "\1\107\4\12\15\0\5\12\1\0\21\14\1\110\22\12"+
    "\1\111\15\0\5\12\1\0\21\12\1\111\22\12\1\111"+
    "\15\0\5\12\1\0\15\14\1\112\4\14\16\12\1\113"+
    "\4\12\15\0\5\12\1\0\15\12\1\113\22\12\1\113"+
    "\4\12\14\0\1\114\102\0\1\115\22\0\1\115\32\0"+
    "\5\12\1\0\22\14\1\116\22\12\15\0\5\12\1\0"+
    "\22\12\1\116\22\12\15\0\5\12\1\0\17\14\1\117"+
    "\2\14\20\12\1\120\2\12\15\0\5\12\1\0\17\12"+
    "\1\120\22\12\1\120\2\12\15\0\5\12\1\0\4\14"+
    "\1\121\15\14\5\12\1\122\15\12\15\0\5\12\1\0"+
    "\4\12\1\122\22\12\1\122\15\12\15\0\5\12\1\0"+
    "\13\14\1\123\6\14\14\12\1\124\6\12\15\0\5\12"+
    "\1\0\13\12\1\124\22\12\1\124\6\12\15\0\5\12"+
    "\1\0\10\14\1\125\11\14\11\12\1\126\11\12\15\0"+
    "\5\12\1\0\10\12\1\126\22\12\1\126\11\12\16\0"+
    "\2\127\110\0\1\130\22\0\1\130\21\0\5\12\1\0"+
    "\2\12\1\131\22\12\1\131\17\12\15\0\5\12\1\0"+
    "\20\14\1\132\1\14\21\12\1\133\1\12\15\0\5\12"+
    "\1\0\20\12\1\133\22\12\1\133\1\12\15\0\5\12"+
    "\1\0\15\14\1\134\4\14\16\12\1\135\4\12\15\0"+
    "\5\12\1\0\15\12\1\135\22\12\1\135\4\12\15\0"+
    "\5\12\1\0\13\14\1\136\6\14\14\12\1\137\6\12"+
    "\15\0\5\12\1\0\13\12\1\137\22\12\1\137\6\12"+
    "\15\0\5\140\107\0\1\141\22\0\1\141\20\0\5\12"+
    "\1\0\15\12\1\142\22\12\1\142\4\12\15\0\5\12"+
    "\1\0\2\14\1\143\17\14\3\12\1\144\17\12\15\0"+
    "\5\12\1\0\2\12\1\144\22\12\1\144\17\12\15\0"+
    "\5\12\1\0\3\14\1\145\16\14\4\12\1\146\16\12"+
    "\15\0\5\12\1\0\3\12\1\146\22\12\1\146\16\12"+
    "\15\0\5\147\63\0\5\12\1\0\4\12\1\150\22\12"+
    "\1\150\15\12\15\0\5\12\1\0\10\14\1\151\11\14"+
    "\11\12\1\152\11\12\15\0\5\12\1\0\10\12\1\152"+
    "\22\12\1\152\11\12\15\0\5\153\63\0\5\12\1\0"+
    "\1\154\22\12\1\154\21\12\15\0\5\12\1\0\13\14"+
    "\1\155\6\14\14\12\1\156\6\12\15\0\5\12\1\0"+
    "\13\12\1\156\22\12\1\156\6\12\15\0\5\12\1\0"+
    "\2\12\1\157\22\12\1\157\17\12\15\0\5\12\1\0"+
    "\12\14\1\160\7\14\13\12\1\161\7\12\15\0\5\12"+
    "\1\0\12\12\1\161\22\12\1\161\7\12\15\0\5\12"+
    "\1\0\10\12\1\162\22\12\1\162\11\12\15\0\5\12"+
    "\1\0\13\12\1\163\22\12\1\163\6\12\15\0\5\12"+
    "\1\0\12\12\1\164\22\12\1\164\7\12\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5432];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\4\11\2\1\1\11\15\1\2\11"+
    "\15\1\2\0\12\1\2\0\12\1\2\0\12\1\2\0"+
    "\11\1\2\0\7\1\1\0\1\11\5\1\1\0\3\1"+
    "\1\11\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[116];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public L_Analyzer_Users(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(Symbols_Users.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Error: Caracter no valido: " + yytext());
            }
          // fall through
          case 19: break;
          case 2:
            { /* Ignorar espacios en blanco */
            }
          // fall through
          case 20: break;
          case 3:
            { return new Symbol(Symbols_Users.QuotationMark, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 21: break;
          case 4:
            { return new Symbol(Symbols_Users.OpenParenthesis, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 22: break;
          case 5:
            { return new Symbol(Symbols_Users.CloseParenthesis, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 23: break;
          case 6:
            { return new Symbol(Symbols_Users.Comma, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 24: break;
          case 7:
            { return new Symbol(Symbols_Users.UPValue, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 25: break;
          case 8:
            { return new Symbol(Symbols_Users.Colon, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 26: break;
          case 9:
            { return new Symbol(Symbols_Users.NIValue, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 27: break;
          case 10:
            { return new Symbol(Symbols_Users.LeftBrace, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 28: break;
          case 11:
            { return new Symbol(Symbols_Users.RightBrace, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 29: break;
          case 12:
            { return new Symbol(Symbols_Users.Name, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 30: break;
          case 13:
            { return new Symbol(Symbols_Users.User, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 31: break;
          case 14:
            { return new Symbol(Symbols_Users.Init, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 32: break;
          case 15:
            { return new Symbol(Symbols_Users.Password, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 33: break;
          case 16:
            { return new Symbol(Symbols_Users.Date, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 34: break;
          case 17:
            { return new Symbol(Symbols_Users.Institution, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 35: break;
          case 18:
            { return new Symbol(Symbols_Users.FechaCreacion, (yycolumn + 1), (yyline + 1), yytext());
            }
          // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
