import java.util.HashSet;
class G{
	public static void main(String[] args){
             HashSet a=new HashSet();
			 a.add("mohan");
			 a.add("sohan");
			 a.add("rohan");
			 a.add("mohan");
			 a.add("gohan");
			 a.add("tohan");

			 System.out.println(a);
	}
}
//Set does not allowed duplicate records here mohan is two times but print only once