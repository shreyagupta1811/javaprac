import java.util.regex.Pattern;
import java.util.regex.Matcher;

class E{
         public static void main(String[] args){
              Pattern p=Pattern.compile("\\d\\d");
			  Matcher m=p.matcher("mohan is 18 year boy he is in 12th standard and scored 70 out of 80 in maths");

			  System.out.println("mohan is 18 year boy he is in 12th standard and scored 70 out of 80 in maths");
			  while(m.find()){
                     System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
			  }
		 }
}
/* here \\d\\d can count no of two digit number*/