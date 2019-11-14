import java.util.*;

class S{
	public static void  main(String[] args){
          //case 1---not OK
		  //ArrayList<A> a= new ArrayList<B>(); 	 
		  //case 2----ok
		  //ArrayList<? extends A>a=new ArrayList<B>();
		//  ArrayList<? implements A>a=new ArrayList<B>();  //NOT OKKK
	}
}
interface A{ }
class B implements A{ }
//we can not assign a inteface and its child in a generic polymorphism byt by concepty of extends we can achieve this.