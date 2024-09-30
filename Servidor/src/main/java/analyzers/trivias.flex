/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones

package analyzers;

import java_cup.runtime.*;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%

//-------> Directivas
%public
%class L_Analyzer_trivias
%cupsym Symbols_trivias
%cup
%char
%column
%full
%ignorecase
%line

//------> Expresiones Regulares
LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator} | [ \t\f]

header = "db.trivia"
idTriviaSentence = "ID_TRIVIA"
nombre = "NOMBRE"
tema = "TEMA"
tiempoPregunta = "TIEMPO_PREGUNTA"
usuarioCreacion = "USUARIO_CREACION"
estructura = "ESTRUCTURA"
idComponente = "ID_COMPONENTE_"[0-9]+
clase = "CLASE"
campoTexto = "CAMPO_TEXTO"
areaTexto = "AREA_TEXTO"
checkbox = "CHECKBOX"
radio = "RADIO"
fichero = "FICHERO"
combo = "COMBO"
textoVisible = "TEXTO_VISIBLE"
respuesta = "RESPUESTA"
filas = "FILAS"
columnas = "COLUMNAS"
opciones = "OPCIONES"

number = [0-9]+
text = [0-9A-Za-z_]+
idTrivia = "$" {text}
specialText = [0-9A-Za-z_¿?¡!#ÁÉÍÓÚáéíóúñÑ.|]+

//------> Estados

%%

/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "("   { System.out.println("Token: LeftPar, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.LeftPar); }
<YYINITIAL> ")"   { System.out.println("Token: RightPar, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.RightPar); }
<YYINITIAL> ","   { System.out.println("Token: Comma, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Comma); }
<YYINITIAL> ":"   { System.out.println("Token: Colon, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Colon); }
<YYINITIAL> "{"   { System.out.println("Token: LeftBrace, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.LeftBrace); }
<YYINITIAL> "}"   { System.out.println("Token: RightBrace, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.RightBrace); }
<YYINITIAL> "["   { System.out.println("Token: LeftBracket, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.LeftBracket); }
<YYINITIAL> "]"   { System.out.println("Token: RightBracket, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.RightBracket); }
<YYINITIAL> "\""  { System.out.println("Token: QuotationMark, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.QuotationMark); }


//-------> Simbolos ER
<YYINITIAL> {header} { System.out.println("Token: Header, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Header); }
<YYINITIAL> {idTriviaSentence} { System.out.println("Token: IdTriviaSentence, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.IdTriviaSentence); }
<YYINITIAL> {nombre} { System.out.println("Token: Nombre, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Nombre); }
<YYINITIAL> {tema} { System.out.println("Token: Tema, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Tema); }
<YYINITIAL> {tiempoPregunta} { System.out.println("Token: TiempoPregunta, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.TiempoPregunta); }
<YYINITIAL> {usuarioCreacion} { System.out.println("Token: UsuarioCreacion, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.UsuarioCreacion); }
<YYINITIAL> {estructura} { System.out.println("Token: Estructura, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Estructura); }
<YYINITIAL> {idComponente} { System.out.println("Token: IdComponente, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.IdComponente); }
<YYINITIAL> {clase} { System.out.println("Token: Clase, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Clase); }
<YYINITIAL> {campoTexto} { System.out.println("Token: CampoTexto, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.CampoTexto); }
<YYINITIAL> {areaTexto} { System.out.println("Token: AreaTexto, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.AreaTexto); }
<YYINITIAL> {checkbox} { System.out.println("Token: Checkbox, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Checkbox); }
<YYINITIAL> {radio} { System.out.println("Token: Radio, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Radio); }
<YYINITIAL> {fichero} { System.out.println("Token: Fichero, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Fichero); }
<YYINITIAL> {combo} { System.out.println("Token: Combo, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Combo); }
<YYINITIAL> {textoVisible} { System.out.println("Token: TextoVisible, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.TextoVisible); }
<YYINITIAL> {respuesta} { System.out.println("Token: Respuesta, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Respuesta); }
<YYINITIAL> {filas} { System.out.println("Token: Filas, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Filas); }
<YYINITIAL> {columnas} { System.out.println("Token: Columnas, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Columnas); }
<YYINITIAL> {opciones} { System.out.println("Token: Opciones, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Opciones); }

<YYINITIAL> {number} { System.out.println("Token: Number, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.Number, yytext()); }
<YYINITIAL> {idTrivia} { System.out.println("Token: IdTrivia, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.IdTrivia, yytext()); }
<YYINITIAL> {specialText} { System.out.println("Token: SpecialText, Line: " + yyline + ", Column: " + yycolumn); return new Symbol(Symbols_trivias.SpecialText, yytext()); }

{WhiteSpace} {/* Ignorar espacios en blanco */}

//------> Errores Lexicos
. { System.out.println("Error: Caracter no valido: " + yytext()); }