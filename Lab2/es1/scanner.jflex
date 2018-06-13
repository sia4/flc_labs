
%%

%class Lexer
%unicode
%standalone

nl		= \r|\n|\r\n

comment		= "/*"~"*/"

integer 	=  ([1-9][0-9]*|0)
double 		= (([0-9]+\.[0-9]*) | ([0-9]*\.[0-9]+)) (e|E('+'|'-')?[0-9]+)?
var		= [A-Za-z_][A-Za-z0-9_]* 

%%

"{" 	{System.out.print("GO ");}
"}"		{System.out.print("GC ");}
"("		{System.out.print("RO ");}
")"		{System.out.print("RC ");}
"["		{System.out.print("SO ");}
"]"		{System.out.print("SC ");}
"+"		{System.out.print("PLUS ");}
"-"		{System.out.print("MIN ");}
"*"		{System.out.print("ST ");}
"/"		{System.out.print("SL ");}
"="		{System.out.print("EQ ");}
";"		{System.out.print("S ");}
"."		{System.out.print("PD ");}
","		{System.out.print("C ");}
"<"		{System.out.print("LT ");}
">"		{System.out.print("GT ");}
"&"		{System.out.print("AND ");}
"|"		{System.out.print("OR ");}
"!"		{System.out.print("EP ");}
int		{System.out.print("INT_TYPE ");}
double		{System.out.print("DOUBLE_TYPE ");}
if		{System.out.print("IF ");}
else		{System.out.print("ELSE ");}
while		{System.out.print("WHILE ");}
print		{System.out.print("PRINT ");}

{integer}	{System.out.print("INT:"+ yytext() + " ");}
{double}	{System.out.print("DOUBLE:"+ yytext() + " ");}
{var}		{System.out.print("ID:"+ yytext() + " ");}

{comment}|{nl}|" "|\t|#include.*{nl}	{;}

. 		{System.err.println("SCANNER ERROR: "+yytext());}
