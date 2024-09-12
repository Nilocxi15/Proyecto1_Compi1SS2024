/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package analyzers;

import java_cup.runtime.*;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%

//-------> Directivas
%public
%class L_Analyzer
%cupsym Symbols
%cup
%char
%column
%full
%ignorecase
%line

//------> Expresiones Regulares
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]
xson = "xson"
version = "version"
versionNumber = "1.0"
realizarSolicitud = "realizar_solicitud"
requestName = [A-Z_]+
values = [A-Za-z0-9_ÁÉÍÓÚáéíóúñÑ]+
finSolicitudRealizada = "fin_solicitud_realizada"

//------> Estados

%%

/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "<"     {System.out.println("Reconocio "+yytext()+" menor que"); return new Symbol(Symbols.LessThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ">"     {System.out.println("Reconocio "+yytext()+" mayor que"); return new Symbol(Symbols.GreaterThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "?"     {System.out.println("Reconocio "+yytext()+" interrogacion"); return new Symbol(Symbols.QuestionMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "="     {System.out.println("Reconocio "+yytext()+" igual"); return new Symbol(Symbols.Equal, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "\""    {System.out.println("Reconocio "+yytext()+" comillas"); return new Symbol(Symbols.QuotationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "!"     {System.out.println("Reconocio "+yytext()+" exclamacion"); return new Symbol(Symbols.ExclamationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ":"     {System.out.println("Reconocio "+yytext()+" dos puntos"); return new Symbol(Symbols.Colon, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "{"     {System.out.println("Reconocio "+yytext()+" llave izquierda"); return new Symbol(Symbols.LeftBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "}"     {System.out.println("Reconocio "+yytext()+" llave derecha"); return new Symbol(Symbols.RightBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "["     {System.out.println("Reconocio "+yytext()+" corchete izquierdo"); return new Symbol(Symbols.LeftBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "]"     {System.out.println("Reconocio "+yytext()+" corchete derecho"); return new Symbol(Symbols.RightBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ","     {System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Symbols.Comma, (yycolumn + 1), (yyline + 1), yytext());}

//-------> Simbolos ER
<YYINITIAL> {xson} {System.out.println("Reconocio "+yytext()+" xson"); return new Symbol(Symbols.XSONsentence, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {version} {System.out.println("Reconocio "+yytext()+" version"); return new Symbol(Symbols.Version, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {versionNumber} {System.out.println("Reconocio "+yytext()+" numero de version"); return new Symbol(Symbols.VersionNumber, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {realizarSolicitud} {System.out.println("Reconocio "+yytext()+" realizar solicitud"); return new Symbol(Symbols.RealizarSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {finSolicitudRealizada} {System.out.println("Reconocio "+yytext()+" fin solicitud finalizada"); return new Symbol(Symbols.FinSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {requestName} {System.out.println("Reconocio "+yytext()+" nombre de solicitud"); return new Symbol(Symbols.RequestName, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {values} {System.out.println("Reconocio "+yytext()+" valores"); return new Symbol(Symbols.Values, (yycolumn + 1), (yyline + 1), yytext());}
{WhiteSpace} {/* Ignorar espacios en blanco */}

//------> Errores Lexicos
. { System.out.println("Error: Caracter no valido: " + yytext()); }