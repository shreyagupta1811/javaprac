import java.util.*;

class D{
	public static void main(String[] args){
           ArrayList<Integer> list=new ArrayList<Integer>();

		     list.add(23);
		     list.add(11);
			 list.add(67);
			 list.add(87);
           
			Integer i=list.get(3);
			System.out.println(i);
	}
}
/*this code is valid becoz onbehalf of programmer compiler typecaste (Integer)on line 12.so compilation pass.but before excecution 
compiler erase all the typesafety by using type Eraser*/