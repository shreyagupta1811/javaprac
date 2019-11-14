import java.util.*;

class K{
	public static void main(String[] args){
            ArrayList a=new ArrayList();
			a.add(23);
		    a.add(4.56);
		    a.add(true);
			a.add("mohan");

            pro(a);
	}
	static void pro(ArrayList<Integer> list){
		    list.add(67.34);
			list.add("mohan");

			System.out.println(list);
	}
} 
//a non typesafe arraylist variable can not assign in type safe arraylist with hetrogenous records