import java.util.regex.Pattern;
import java.util.regex.Matcher;

class O{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[d-t&&[m-x]]");
		Matcher m = p.matcher("hex code of three where question");
		
		System.out.println("hex code of three where question");
		
		while(m.find()){
			System.out.println(">"+m.group()+"<"+m.start()+"~"+m.end());
		}
	}
}
//the alphabet that are comman in both d-t and m-x are noticed 