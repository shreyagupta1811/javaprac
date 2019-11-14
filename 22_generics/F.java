import java.util.*;

interface Animal{ }
abstract class Y{ }

class F{
	public static void main(String[] args){
		//case 1------ALLOWED
         /* ArrayList<Integer> a1=new ArrayList<Integer>();       //class type allowed
	      ArrayList<Animal> a2=new ArrayList<Animal>();        //interface allowed
		  ArrayList<Y> a3=new ArrayList<Y>();                               //abstract class allowed
		  ArrayList<char[ ]> a4=new ArrayList<char[ ]>();  */     //array of ant type allowed
         
            //case 2------NOT ALLOWED
			//ArrayList<int> a5=new ArrayList<int>();       
	}
}
//u can not use primitive type in typesafety