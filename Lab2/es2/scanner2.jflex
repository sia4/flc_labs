
import java.io.*;

%%

%class Html2
%unicode
%standalone
%caseless

%xstate comment

%{
	FileWriter out;
	int numTags, numTables, numH1s, numH2s, numH3s, numH4s, numComm;
	
	private void writeOut(String s){
		try{
			out.write(s); 
			out.flush();
		}catch(Exception e){}
	}
	
	private void writeOut(){
		writeOut(yytext());
	}
%}

%init{
	try{
		out = new FileWriter(new File("output.html"));
		numTags=numTables=numH1s=numH2s=numH3s=numH4s=numComm=0;
	}catch(IOException e){
		System.err.println(e);
	}
%init}

%eof{
	numTags = numTags + numTables + numH1s + numH2s + numH3s + numH4s;
	
	System.out.println("Total number of tags: "+numTags);
	System.out.println("Total number of table tags: "+numTables);
	System.out.println("Total number of h1 tags: "+numH1s);
	System.out.println("Total number of h2 tags: "+numH2s);
	System.out.println("Total number of h3 tags: "+numH3s);
	System.out.println("Total number of h4 tags: "+numH4s);
        try{
            out.close();
        }catch(IOException e){
            System.err.println(e);
	}
%eof}

comm 	= "<!--"
eofcomm = "-->"

table 	= ("<table")((" "|\t)+{att})*(">")
h1 		= ("<h1")((" "|\t)+{att})*(">")
h2 		= ("<h2")((" "|\t)+{att})*(">")
h3 		= ("<h3")((" "|\t)+{att})*(">")
h4 		= ("<h4")((" "|\t)+{att})*(">")

tablec 	= ("</table>")
h1c 	= ("</h1>")
h2c 	= ("</h2>")
h3c 	= ("</h3>")
h4c 	= ("</h4>")

tag 	= \<{name}((" "|\t)+{att})*\>
tagc 	= \<\{name}\>
name 	= [a-zA-Z_][a-zA-Z0-9_]*
att 	= {name}\=[^ \t\n\r<>]*

%%

{comm}  { yybegin(comment);}
<comment>{eofcomm} {yybegin(YYINITIAL);}

{table} { numTables++; writeOut(); }
{h1}    { numH1s++; writeOut(); }
{h2}    { numH2s++; writeOut(); }
{h3}    { numH3s++; writeOut(); }
{h4}    { numH4s++; writeOut(); }
{tag}   { numTags++; writeOut(); }

{tablec} { numTables++; writeOut(); }
{h1c}    { numH1s++; writeOut(); }
{h2c}    { numH2s++; writeOut(); }
{h3c}    { numH3s++; writeOut(); }
{h4c}    { numH4s++; writeOut(); }
{tagc}   { numTags++; writeOut(); } 

. 		 { writeOut(); } 		

