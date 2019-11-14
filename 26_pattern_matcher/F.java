import java.util.regex.Pattern;
import java.util.regex.Matcher;

class F{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\w");

		Matcher m = p.matcher("#@2$_%a&F$");
		
		System.out.println("#@2$_%a&F$");
		while(m.find()){
			System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
		}
	}
}
//here \w is used to find no of char a-z,A-Z,0-9