import java.util.ArrayList;
class C{
	public static void main(String[] args){
           ArrayList a=new ArrayList();

		   System.out.println(a);
		   a.add(34);
		    a.add(67);		   
            a.add(78);
			a.add(90);
			a.add(100);
			System.out.println(a);

			System.out.println(a.size());
			System.out.println(a.isEmpty());
	}
}
/*here in line 6 when we print object ref variable it doesnt print classname@refcode but print ArrayList representation becoz ArrayList 
ovverwite the toString method of object class*/
/*when we call add constructor only object form inside is no memory allocate when we call add function then each each element 
get memory*/
//######################################################################
//important- AUTOBOXING.
/*all the classes of collection interfece doesnt supprt primitive type in add method there is expected that object parse inside the 
paranthesis but java 5 support outoboxing in which int can be stored in integer class provided by wrapper class and its object 
stores inside the Arraylist.*/

