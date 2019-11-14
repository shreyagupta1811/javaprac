import java.util.regex.Pattern;
import java.util.regex.Matcher;

class G{
	public static void main(String[] args){
		Pattern p = Pattern.compile("\\w\\w");

		Matcher m = p.matcher("#@2a$_G%a1&F4$");
		
		System.out.println("#@2a$_G%a1&F4$");
		while(m.find()){
			System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
		}
	}
}
//here \w\w means no of char a-z,A-Z,0-9 come simultaneously