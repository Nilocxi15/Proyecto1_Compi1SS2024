/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package analyzers;

import java_cup.runtime.*;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%

//-------> Directivas
%public
%class L_Analyzer_main
%cupsym Symbols_main
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

usuario = "USUARIO"
password = "PASSWORD"
nombre = "NOMBRE"
institucion = "INSTITUCION"
usuarioNuevo = "USUARIO_NUEVO"
usuarioAntiguo = "USUARIO_ANTIGUO"
nuevoPassword = "NUEVO_PASSWORD"
modificarUsuario = "MODIFICAR_USUARIO"
eliminarUsuario = "ELIMINAR_USUARIO"
loginUsuario = "LOGIN_USUARIO"
datosUsuario = "DATOS_USUARIO"
fechaCreacion = "FECHA_CREACION"
nuevaTrivia = "NUEVA_TRIVIA"
parametrosTrivia = "PARAMETROS_TRIVIA"
idTriviaSentence = "ID_TRIVIA"
tiempoPregunta = "TIEMPO_PREGUNTA"
tema = "TEMA"
usuarioCreacion = "USUARIO_CREACION"
listaTrivias = "LISTA_TRIVIAS"

realizarSolicitud = "realizar_solicitud"
realizarSolicitudes = "realizar_solicitudes"

niValue = [A-Z]+
time = [0-9]+
values = [A-Za-z0-9_ÁÉÍÓÚáéíóúñÑ]+
idTrivia = "$" {values}
day = [0-3][0-9]
month = [0-1][0-9]
year = [1-2][0-9][0-9][0-9]
date = {day} "/" {month} "/" {year}
finSolicitudRealizada = "fin_solicitud_realizada"
finSolicitudesRealizadas = "fin_solicitudes_realizadas"

//------> Estados

%%

/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "<"     {System.out.println("Reconocio "+yytext()+" menor que"); return new Symbol(Symbols_main.LessThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ">"     {System.out.println("Reconocio "+yytext()+" mayor que"); return new Symbol(Symbols_main.GreaterThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "?"     {System.out.println("Reconocio "+yytext()+" interrogacion"); return new Symbol(Symbols_main.QuestionMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "="     {System.out.println("Reconocio "+yytext()+" igual"); return new Symbol(Symbols_main.Equal, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "\""    {System.out.println("Reconocio "+yytext()+" comillas"); return new Symbol(Symbols_main.QuotationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "!"     {System.out.println("Reconocio "+yytext()+" exclamacion"); return new Symbol(Symbols_main.ExclamationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ":"     {System.out.println("Reconocio "+yytext()+" dos puntos"); return new Symbol(Symbols_main.Colon, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "{"     {System.out.println("Reconocio "+yytext()+" llave izquierda"); return new Symbol(Symbols_main.LeftBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "}"     {System.out.println("Reconocio "+yytext()+" llave derecha"); return new Symbol(Symbols_main.RightBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "["     {System.out.println("Reconocio "+yytext()+" corchete izquierdo"); return new Symbol(Symbols_main.LeftBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "]"     {System.out.println("Reconocio "+yytext()+" corchete derecho"); return new Symbol(Symbols_main.RightBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ","     {System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Symbols_main.Comma, (yycolumn + 1), (yyline + 1), yytext());}

//-------> Simbolos ER
<YYINITIAL> {xson} {System.out.println("Reconocio "+yytext()+" xson"); return new Symbol(Symbols_main.XSONsentence, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {version} {System.out.println("Reconocio "+yytext()+" version"); return new Symbol(Symbols_main.Version, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {versionNumber} {System.out.println("Reconocio "+yytext()+" numero de version"); return new Symbol(Symbols_main.VersionNumber, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuario} {System.out.println("Reconocio "+yytext()+" usuario"); return new Symbol(Symbols_main.Usuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {password} {System.out.println("Reconocio "+yytext()+" password"); return new Symbol(Symbols_main.Password, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {nombre} {System.out.println("Reconocio "+yytext()+" nombre"); return new Symbol(Symbols_main.Nombre, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {institucion} {System.out.println("Reconocio "+yytext()+" institucion"); return new Symbol(Symbols_main.Institucion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {fechaCreacion} {System.out.println("Reconocio "+yytext()+" fecha de creacion"); return new Symbol(Symbols_main.FechaCreacion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {datosUsuario} {System.out.println("Reconocio "+yytext()+" datos usuario"); return new Symbol(Symbols_main.DatosUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {realizarSolicitud} {System.out.println("Reconocio "+yytext()+" realizar solicitud"); return new Symbol(Symbols_main.RealizarSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {realizarSolicitudes} {System.out.println("Reconocio "+yytext()+" realizar solicitudes"); return new Symbol(Symbols_main.RealizarSolicitudes, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuarioNuevo} {System.out.println("Reconocio "+yytext()+" usuario nuevo"); return new Symbol(Symbols_main.UsuarioNuevo, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuarioAntiguo} {System.out.println("Reconocio "+yytext()+" usuario antiguo"); return new Symbol(Symbols_main.UsuarioAntiguo, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {nuevoPassword} {System.out.println("Reconocio "+yytext()+" nuevo password"); return new Symbol(Symbols_main.NuevoPassword, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {modificarUsuario} {System.out.println("Reconocio "+yytext()+" modificar usuario"); return new Symbol(Symbols_main.ModificarUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {eliminarUsuario} {System.out.println("Reconocio "+yytext()+" eliminar usuario"); return new Symbol(Symbols_main.EliminarUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {loginUsuario} {System.out.println("Reconocio "+yytext()+" login usuario"); return new Symbol(Symbols_main.LoginUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {nuevaTrivia} {System.out.println("Reconocio "+yytext()+" nueva trivia"); return new Symbol(Symbols_main.NuevaTrivia, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {parametrosTrivia} {System.out.println("Reconocio "+yytext()+" parametros trivia"); return new Symbol(Symbols_main.ParametrosTrivia, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {idTriviaSentence} {System.out.println("Reconocio "+yytext()+" id trivia"); return new Symbol(Symbols_main.IDTriviaSentence, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {tiempoPregunta} {System.out.println("Reconocio "+yytext()+" tiempo de pregunta"); return new Symbol(Symbols_main.TiempoPregunta, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {tema} {System.out.println("Reconocio "+yytext()+" tema"); return new Symbol(Symbols_main.Tema, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuarioCreacion} {System.out.println("Reconocio "+yytext()+" usuario de creacion"); return new Symbol(Symbols_main.UsuarioCreacion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {listaTrivias} {System.out.println("Reconocio "+yytext()+" lista de trivias"); return new Symbol(Symbols_main.ListaTrivias, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {finSolicitudRealizada} {System.out.println("Reconocio "+yytext()+" fin solicitud finalizada"); return new Symbol(Symbols_main.FinSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {finSolicitudesRealizadas} {System.out.println("Reconocio "+yytext()+" fin solicitudes finalizadas"); return new Symbol(Symbols_main.FinSolicitudes, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {niValue} {System.out.println("Reconocio "+yytext()+" valor de nombre"); return new Symbol(Symbols_main.niValue, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {time} {System.out.println("Reconocio "+yytext()+" tiempo"); return new Symbol(Symbols_main.Time, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {values} {System.out.println("Reconocio "+yytext()+" valores"); return new Symbol(Symbols_main.Values, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {idTrivia} {System.out.println("Reconocio "+yytext()+" id trivia"); return new Symbol(Symbols_main.IDTrivia, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {date} {System.out.println("Reconocio "+yytext()+" fecha"); return new Symbol(Symbols_main.Date, (yycolumn + 1), (yyline + 1), yytext());}
{WhiteSpace} {/* Ignorar espacios en blanco */}

//------> Errores Lexicos
. { System.out.println("Error: Caracter no valido: " + yytext()); }