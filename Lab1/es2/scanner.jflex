
%%

%standalone
%class Http
%unicode

nl	= \n|\r|\r\n

schema        	= http|ftp|gopher|https|nntp|file

escape        	= %[0-9A-F][0-9A-F]

name          	= ([^\n\r%/<>:.\\#]|{escape})+ 
firstlevel    	= it|com|gov|edu|net|uk|fr|de|ne|jp|ch
domain        	= {name}.{name}(.{name})*.{firstlevel}

ip_el		= [0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]
ip_addr 	= ({ip_el}"."){3}{ip_el}

port 		= [1-9][0-9]{0,3}

%%

^{schema}"://"({domain}|{ip_addr})(":"{port})?("/"{name})*("/"|("/"{name}"."{name}("#"{name})?))?$	{System.out.println("Correct url: " + yytext());} 
.*											{System.out.println("Incorrect url: " + yytext());}
{nl}											{;}
