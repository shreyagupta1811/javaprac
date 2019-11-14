import java.util.regex.Pattern;
import java.util.regex.Matcher;

class B{
	public static void main(String[] args){
            Pattern p=Pattern.compile("mohan");
			Matcher m=p.matcher("mohan is a good boy");

			System.out.println(m);    //matcher class matcher()
			System.out.println(m.pattern());     //matcher class pattern()
			System.out.println(p);          //pattern class compile()
			System.out.println(p.pattern());       //pattern class pattern()
	}
}
/*here we are calling the matcher class match() which return the match in specific syntax ...pattern() of Matcher 
class also retun the pattern */