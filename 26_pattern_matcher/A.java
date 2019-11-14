import java.util.regex.Pattern;

class A{
	public static void main(String[] args){
         Pattern p=Pattern.compile("hello");
		 System.out.println(p);    //patern overwrite the toString so instead of ref code it return the parsed word.

		 System.out.println(p.pattern());
		  System.out.println(p.matcher("hello everyone"));
	}
}
/*here we are discussing that Pattern class have private constructor so we call the method to create the object compile() 
which returns the pattern passed in compile and the matcher(char sequence) of pattern class return the matcher*/
//matcher return some specific type of syntax.