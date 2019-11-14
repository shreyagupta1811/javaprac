import java.util.regex.Pattern;
import java.util.regex.Matcher;

class D{
         public static void main(String[] args){
              Pattern p=Pattern.compile("\\d");
			  Matcher m=p.matcher("mohan is 8 year boy he is in 8th standard and scored 8 out of 10 in maths");

			  System.out.println("mohan is 8 year boy he is in 8th standard and scored 8 out of 10 in maths");
			  while(m.find()){
                     System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
			  }
		 }
}
/* here \\d can count no of single digit from 0-9*/