import java.util.*;

class J{
	public static void main(String[] args){
         //case 1
		/* ArrayList a=new ArrayList();
		 a.add(23);
		 a.add(23.5);
		 a.add(true);
		 a.add('a');
		 a.add("mohan");
		 System.out.println(a);*/

		 //case 2----------NOT OK
		 /* ArrayList<Integer> a=new ArrayList();
		 a.add(23);
		 a.add(23.5);
		 a.add(true);
		 a.add('a');
		 a.add("mohan");
		 System.out.println(a);*/

		 //case 3   
		  /*ArrayList a=new ArrayList<Integer>();
		 a.add(23);
		 a.add(23.5);
		 a.add(true);
		 a.add('a');
		 a.add("mohan");
		 System.out.println(a);*/
	}
}
//case 1----noth side non type safety valid
//case 2-----u can not assign a not assign a non type safe object in a type safe variable.
//case 3-----u can assign a type safe object in a non type safe variable. 