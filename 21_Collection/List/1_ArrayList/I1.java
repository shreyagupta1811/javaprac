import java.util.ArrayList;
class I1{
	public static void main(String[] args){
           ArrayList a=new ArrayList();
		   a.add(10);
           a.add(20);
		   a.add(30);
		    a.add(40);
		   a.add(50);

		   System.out.println(a.contains(90));
		   System.out.println(a.contains(10));
	}
}
/*contains method have boolean parametrized which returns true if the parsed value is present in the Arraylist and retrurns 
false if parsed value not present in the arraylist*/