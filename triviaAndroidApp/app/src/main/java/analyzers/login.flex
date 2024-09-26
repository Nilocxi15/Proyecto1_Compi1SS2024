/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones

package analyzers;

import java_cup.runtime.*;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%

//-------> Directivas
%public
%class L_Analyzer_login
%cupsym Symbols_login
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
envioRespuesta = "envio_respuesta"
ok = "Ok"
error = "Error"
finEnvioRespuesta = "fin_envio_respuesta"

loginUsuario = "LOGIN_USUARIO"
respuesta = "RESPUESTA"
status = "STATUS"
usuario = "USUARIO"

userValue = [A-Z]+

//------> Estados

%%

/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "<"     {System.out.println("Reconocio "+yytext()+" menor que"); return new Symbol(Symbols_login.LessThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ">"     {System.out.println("Reconocio "+yytext()+" mayor que"); return new Symbol(Symbols_login.GreaterThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "?"     {System.out.println("Reconocio "+yytext()+" interrogacion"); return new Symbol(Symbols_login.QuestionMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "="     {System.out.println("Reconocio "+yytext()+" igual"); return new Symbol(Symbols_login.Equal, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "\""    {System.out.println("Reconocio "+yytext()+" comillas"); return new Symbol(Symbols_login.QuotationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "!"     {System.out.println("Reconocio "+yytext()+" exclamacion"); return new Symbol(Symbols_login.ExclamationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ":"     {System.out.println("Reconocio "+yytext()+" dos puntos"); return new Symbol(Symbols_login.Colon, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "{"     {System.out.println("Reconocio "+yytext()+" llave izquierda"); return new Symbol(Symbols_login.LeftBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "}"     {System.out.println("Reconocio "+yytext()+" llave derecha"); return new Symbol(Symbols_login.RightBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "["     {System.out.println("Reconocio "+yytext()+" corchete izquierdo"); return new Symbol(Symbols_login.LeftBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "]"     {System.out.println("Reconocio "+yytext()+" corchete derecho"); return new Symbol(Symbols_login.RightBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ","     {System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Symbols_login.Comma, (yycolumn + 1), (yyline + 1), yytext());}

//-------> Simbolos ER
<YYINITIAL> {xson}               {System.out.println("Reconocio "+yytext()+" xson"); return new Symbol(Symbols_login.Xson, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {version}           {System.out.println("Reconocio "+yytext()+" version"); return new Symbol(Symbols_login.Version, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {versionNumber}     {System.out.println("Reconocio "+yytext()+" versionNumber"); return new Symbol(Symbols_login.VersionNumber, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {envioRespuesta}     {System.out.println("Reconocio "+yytext()+" envioRespuesta"); return new Symbol(Symbols_login.EnvioRespuesta, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {ok}                 {System.out.println("Reconocio "+yytext()+" ok"); return new Symbol(Symbols_login.Ok, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {error}             {System.out.println("Reconocio "+yytext()+" error"); return new Symbol(Symbols_login.Error, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {finEnvioRespuesta} {System.out.println("Reconocio "+yytext()+" finEnvioRespuesta"); return new Symbol(Symbols_login.FinEnvioRespuesta, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {loginUsuario}       {System.out.println("Reconocio "+yytext()+" loginUsuario"); return new Symbol(Symbols_login.LoginUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {respuesta}         {System.out.println("Reconocio "+yytext()+" respuesta"); return new Symbol(Symbols_login.Respuesta, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {status}             {System.out.println("Reconocio "+yytext()+" status"); return new Symbol(Symbols_login.Status, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuario}           {System.out.println("Reconocio "+yytext()+" usuario"); return new Symbol(Symbols_login.Usuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {userValue}         {System.out.println("Reconocio "+yytext()+" userValue"); return new Symbol(Symbols_login.UserValue, (yycolumn + 1), (yyline + 1), yytext());}
{WhiteSpace} {/* Ignorar espacios en blanco */}

//------> Errores Lexicos
. { System.out.println("Error: Caracter no valido: " + yytext()); }