
%%

%standalone
%class Lex
%unicode

nl		=  \n|\r|\r\n
digit		=  [0-9]
letter  	=  [^\r\n\\/:*?\"<> |0-9]
id 		=  ({letter}|{digit})+

%%

^({letter}:)?(\\)?({id}\\)*{id}("."{id})?$	{System.out.println("CORRECT PATH: " + yytext());}
^.+$						{System.out.println("NOT CORRECT PATH: " + yytext());}

{nl}					 	{;}
