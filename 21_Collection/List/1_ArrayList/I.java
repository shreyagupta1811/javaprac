import java.util.ArrayList;
class I{
	public static void main(String[] args){
           ArrayList a=new ArrayList();
		   a.add("mohan");
           a.add("sohan");
		   a.add("gohan");
		    a.add("rohan");
		   a.add("tohan");

		   System.out.println(a.contains("gohan"));
		   System.out.println(a.contains("geeta"));
	}
}
/*contains method have boolean parametrized which returns true if the parsed value is present in the Arraylist and retrurns 
false if parsed value not present in the arraylist*/