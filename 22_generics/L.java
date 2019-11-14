import java.util.*;

class L{
	public static void main(String[] args){
            ArrayList<Integer>a=new ArrayList<Integer>();
			a.add(23);
		    a.add(56);
		    a.add(89);
			a.add(1);

            pro(a);
	}
	static void pro(ArrayList  list){
		    list.add("mohan");
			list.add(true);

			System.out.println(list);
	}
}
//a typesafe arrylist can be assign to non typesfe arrylist with hetrogenous records 