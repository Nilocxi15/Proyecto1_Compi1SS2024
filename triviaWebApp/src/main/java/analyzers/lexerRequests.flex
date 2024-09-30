/*------------  1ra Area: Codigo de Usuario ---------*/
//------> Paquetes,importaciones
package analyzers;

import java_cup.runtime.*;
import java.util.LinkedList;
import models.TError;

/*------------  2da Area: Opciones y Declaraciones ---------*/
%%
%{
    //Codigo de usuario en sintaxis java
    public static LinkedList<TError> TablaEL = new LinkedList<TError>();
%}

//-------> Directivas
%public
%class L_Analyzer_Requests
%cupsym Symbols_Requests
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

realizarSolitud = "realizar_solicitud"
realizarSolicitudes = "realizar_solicitudes"
finSolicitudRealizada = "fin_solicitud_realizada"
finSolicitudesRealizadas = "fin_solicitudes_realizadas"

usuarioNuevo = "USUARIO_NUEVO"
modificarUsuario = "MODIFICAR_USUARIO"
usuarioAntiguo = "USUARIO_ANTIGUO"
eliminarUsuario = "ELIMINAR_USUARIO"
nuevoPassword = "NUEVO_PASSWORD"
datosUsuario = "DATOS_USUARIO"
usuario = "USUARIO"
password = "PASSWORD"
nombre = "NOMBRE"
institucion = "INSTITUCION"
fechaCreacion = "FECHA_CREACION"
nuevaTrivia = "NUEVA_TRIVIA"
parametrosTrivia = "PARAMETROS_TRIVIA"
idTriviaSentence = "ID_TRIVIA"
tiempoPregunta = "TIEMPO_PREGUNTA"
tema = "TEMA"
usuarioCreacion = "USUARIO_CREACION"
fechaModificacion = "FECHA_MODIFICACION"
eliminarTrivia = "ELIMINAR_TRIVIA"

niValue = [A-Z]+
time = [0-9]+
values = [A-Za-z0-9_ÁÉÍÓÚáéíóúñÑ]+
idTrivia = "$" {values}
day = [0-3][0-9]
month = [0-1][0-9]
year = [1-2][0-9][0-9][0-9]
date = {day} "/" {month} "/" {year}

//------> Estados

%%

/*------------  3ra Area: Reglas Lexicas ---------*/

//-----> Simbolos
<YYINITIAL> "<"     {System.out.println("Reconocio "+yytext()+" menor que"); return new Symbol(Symbols_Requests.LessThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ">"     {System.out.println("Reconocio "+yytext()+" mayor que"); return new Symbol(Symbols_Requests.GreaterThan, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "?"     {System.out.println("Reconocio "+yytext()+" interrogacion"); return new Symbol(Symbols_Requests.QuestionMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "="     {System.out.println("Reconocio "+yytext()+" igual"); return new Symbol(Symbols_Requests.Equal, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "\""    {System.out.println("Reconocio "+yytext()+" comillas"); return new Symbol(Symbols_Requests.QuotationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "!"     {System.out.println("Reconocio "+yytext()+" exclamacion"); return new Symbol(Symbols_Requests.ExclamationMark, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ":"     {System.out.println("Reconocio "+yytext()+" dos puntos"); return new Symbol(Symbols_Requests.Colon, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> ","     {System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(Symbols_Requests.Comma, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> "{"     {System.out.println("Reconocio "+yytext()+" llave izquierda"); return new Symbol(Symbols_Requests.LeftBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "}"     {System.out.println("Reconocio "+yytext()+" llave derecha"); return new Symbol(Symbols_Requests.RightBrace, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "["     {System.out.println("Reconocio "+yytext()+" corchete izquierdo"); return new Symbol(Symbols_Requests.LeftBracket, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> "]"     {System.out.println("Reconocio "+yytext()+" corchete derecho"); return new Symbol(Symbols_Requests.RightBracket, (yycolumn + 1), (yyline + 1), yytext());}

//------> Simbolos Expresiones Regulares
<YYINITIAL> {xson}                      {System.out.println("Reconocio "+yytext()+" xson"); return new Symbol(Symbols_Requests.XSONsentence, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {version}                   {System.out.println("Reconocio "+yytext()+" version"); return new Symbol(Symbols_Requests.Version, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {versionNumber}             {System.out.println("Reconocio "+yytext()+" version number"); return new Symbol(Symbols_Requests.VersionNumber, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {realizarSolitud}           {System.out.println("Reconocio "+yytext()+" realizar solicitud"); return new Symbol(Symbols_Requests.RealizarSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {realizarSolicitudes}       {System.out.println("Reconocio "+yytext()+" realizar solicitudes"); return new Symbol(Symbols_Requests.RealizarSolicitudes, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {finSolicitudRealizada}     {System.out.println("Reconocio "+yytext()+" fin solicitud realizada"); return new Symbol(Symbols_Requests.FinSolicitud, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {finSolicitudesRealizadas}  {System.out.println("Reconocio "+yytext()+" fin solicitudes realizadas"); return new Symbol(Symbols_Requests.FinSolicitudes, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {usuarioNuevo} {            System.out.println("Reconocio "+yytext()+" usuario nuevo"); return new Symbol(Symbols_Requests.UsuarioNuevo, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {modificarUsuario}          {System.out.println("Reconocio "+yytext()+" modificar usuario"); return new Symbol(Symbols_Requests.ModificarUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {eliminarUsuario}           {System.out.println("Reconocio "+yytext()+" eliminar usuario"); return new Symbol(Symbols_Requests.EliminarUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {datosUsuario}              {System.out.println("Reconocio "+yytext()+" datos usuario"); return new Symbol(Symbols_Requests.DatosUsuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuario}                   {System.out.println("Reconocio "+yytext()+" usuario"); return new Symbol(Symbols_Requests.Usuario, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {password}                  {System.out.println("Reconocio "+yytext()+" password"); return new Symbol(Symbols_Requests.Password, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {nombre}                    {System.out.println("Reconocio "+yytext()+" nombre"); return new Symbol(Symbols_Requests.Nombre, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {institucion}               {System.out.println("Reconocio "+yytext()+" institucion"); return new Symbol(Symbols_Requests.Institucion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {fechaCreacion}             {System.out.println("Reconocio "+yytext()+" fecha de creacion"); return new Symbol(Symbols_Requests.FechaCreacion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {nuevaTrivia}               {System.out.println("Reconocio "+yytext()+" nueva trivia"); return new Symbol(Symbols_Requests.NuevaTrivia, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {parametrosTrivia}          {System.out.println("Reconocio "+yytext()+" parametros trivia"); return new Symbol(Symbols_Requests.ParametrosTrivia, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {idTriviaSentence}          {System.out.println("Reconocio "+yytext()+" sentencia id trivia"); return new Symbol(Symbols_Requests.IDTriviaSentence, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {tiempoPregunta}            {System.out.println("Reconocio "+yytext()+" tiempo pregunta"); return new Symbol(Symbols_Requests.TiempoPregunta, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {tema}                      {System.out.println("Reconocio "+yytext()+" tema"); return new Symbol(Symbols_Requests.Tema, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuarioCreacion}           {System.out.println("Reconocio "+yytext()+" usuario creacion"); return new Symbol(Symbols_Requests.UsuarioCreacion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {usuarioAntiguo}            {System.out.println("Reconocio "+yytext()+" usuario antiguo"); return new Symbol(Symbols_Requests.UsuarioAntiguo, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {nuevoPassword}             {System.out.println("Reconocio "+yytext()+" nuevo password"); return new Symbol(Symbols_Requests.NuevoPassword, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {fechaModificacion}         {System.out.println("Reconocio "+yytext()+" fecha modificacion"); return new Symbol(Symbols_Requests.FechaModificacion, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {eliminarTrivia}            {System.out.println("Reconocio "+yytext()+" eliminar trivia"); return new Symbol(Symbols_Requests.EliminarTrivia, (yycolumn + 1), (yyline + 1), yytext());}

<YYINITIAL> {niValue}                   {System.out.println("Reconocio "+yytext()+" valor de NI"); return new Symbol(Symbols_Requests.NIValue, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {time}                      {System.out.println("Reconocio "+yytext()+" tiempo"); return new Symbol(Symbols_Requests.Time, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {values}                    {System.out.println("Reconocio "+yytext()+" valor"); return new Symbol(Symbols_Requests.UPValue, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {idTrivia}                  {System.out.println("Reconocio "+yytext()+" id trivia"); return new Symbol(Symbols_Requests.IDTrivia, (yycolumn + 1), (yyline + 1), yytext());}
<YYINITIAL> {date}                      {System.out.println("Reconocio "+yytext()+" fecha"); return new Symbol(Symbols_Requests.Date, (yycolumn + 1), (yyline + 1), yytext());}

{WhiteSpace} {/* ignore whitespace */}

//------> Errores Lexicos
.                       {System.out.println("Error Lexico "+yytext()+" Linea: "+(yyline+1)+" Columna: "+(yycolumn+1));
                        TError datos = new TError(yytext(),yyline + 1,yycolumn + 1,"Error Lexico","Simbolo no existe en el lenguaje");
                        TablaEL.add(datos);}