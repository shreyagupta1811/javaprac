import java.util.*;

class Q{
	public static void main(String[] args){
          ArrayList<Integer> a=new ArrayList<Integer>();
		  a.add(12);
		  a.add(45);
		  a.add(89);

		  ArrayList<? extends Number> b=a;
		  //case 1
		  //b.add(67);
	      // b.set(1,100);

		  //case 2
	        /* Integer i= (Integer)b.get(2);
			 System.out.println(i);*/
			// System.out.println(b.remove(2));
	 } 
}
/*by this polymorphic assignment of ArraayList we can call  remove and add method becoz they do not modify ArrayList 
but the set and the add method will modify the ArrayList so u can not call here*/