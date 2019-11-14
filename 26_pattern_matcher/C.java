import java.util.regex.Pattern;
import java.util.regex.Matcher;

class C{
         public static void main(String[] args){
              Pattern p=Pattern.compile("mohan");
			  Matcher m=p.matcher("mohan is a mohan boy ,he is reading mohan book");

			  System.out.println("mohan is a mohan boy ,he is reading mohan book");
			  while(m.find()){
                     System.out.println(m.group()+"~ start index:"+m.start()+" and end index: "+m.end());
			  }
		 }
}
/*here we are calling find method it return true if the exact match found and if finf return true than only we call the mathod group(),
start(),end()*/