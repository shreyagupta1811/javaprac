import java.util.*;

class P{
	public static void main(String[] args){
         ArrayList<Integer> a=new ArrayList<Integer>();
		 a.add(12);
		 a.add(45);
		 a.add(90);

		 pro(a);

		   ArrayList<Long> a1=new ArrayList<Long>();
		 a1.add(12L);
		 a1.add(45L);
		 a1.add(90L);

		 pro(a1);
	}
	static void pro(ArrayList<? extends Number> x){
             System.out.println("##########");
	}
	/*static void pro(ArrayList<Long> y){
                    System.out.println("@@@@@@@@@@");
	}
	static void pro(ArrayList< Integer> z){
                   System.out.println("**********");
	}*/
}
