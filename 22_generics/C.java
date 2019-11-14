import java.util.*;

class C{
	public static void main(String[] args){
           ArrayList list=new ArrayList();

		     list.add(23);
		     list.add(11);
			 list.add(67);
			 list.add(87);

			 //case 3----solution of case 2
                  /*Integer i=(Integer)list.get(2);
			  System.out.println(i);*/

			 //case 2----NOT ok
			  /*Integer i=list.get(2);
			  System.out.println(i);*/
			  
			 //case 1-----valid
			 //System.out.println(list.get(2));
	}
}
//in case 1--we know that get() return the object and when it call inside the sout() than it calls toString of integer and return int value.
//in case 2--we directly call the get() and store it in Integer variable but get() return object and objct can not be converted to Integer
//case 3--to solve the problem of case 2 we typecast get() in case 3