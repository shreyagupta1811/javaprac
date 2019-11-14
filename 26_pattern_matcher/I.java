import java.util.regex.Pattern;
import java.util.regex.Matcher;

class I{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\s");
		Matcher m = p.matcher("abc123456mno");
		
		System.out.println(m.find());
		System.out.println(m.group());
		//System.out.println(m.start());
		//System.out.println(m.end());
	}
}
/*here also we will get the exception called the IllegelStateException becoz here on calling finf() we will get the result false after that still we 
are calling the group()*/