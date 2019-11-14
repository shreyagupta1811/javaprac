import java.util.*;

class N{
	public static void main(String[] args){
         ArrayList<Integer> a=new ArrayList<Integer>();
		 a.add(12);
		 a.add(45);
		 a.add(90);

		 pro(a);
	}
	static void pro(ArrayList<Number> x){
             System.out.println("##########");
	}
	/*static void pro(ArrayList<Long> y){
                    System.out.println("@@@@@@@@@@");
	}
	static void pro(ArrayList<Integer> z){
                   System.out.println("**********");
	}*/
}
//here Number is a parent of class Integer but ArrayList<Integer>  can not be converted to its parent class ArrayList<Number>.