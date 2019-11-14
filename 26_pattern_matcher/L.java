import java.util.regex.Pattern;
import java.util.regex.Matcher;

class L{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[^xtwq]");
		Matcher m = p.matcher("hex code of three where question");
		
		System.out.println("hex code of three where question");
		
		while(m.find()){
			System.out.println(">"+m.group()+"<"+m.start()+"~"+m.end());
		}
	}
}
//here we will get the alphabet other than xtwq as ^  was written at the starting .