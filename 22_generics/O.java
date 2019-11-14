import java.util.*;

class O{
	public static void main(String[] args){
            //case 1
		 /*ArrayList<Number> a1=new ArrayList<Integer>(); 
		 ArrayList<Number> a2=new ArrayList<Long>(); 
		 ArrayList<Number> a3=new ArrayList<Byte>();
          ArrayList<Number> a4=new ArrayList<Float>();
		  ArrayList<Number> a5=new ArrayList<Short>();*/
		  
		  //case 2
            ArrayList<? extends Number> a1=new ArrayList<Integer>(); 
		 ArrayList<? extends Number> a2=new ArrayList<Long>(); 
		 ArrayList<? extends Number> a3=new ArrayList<Byte>();
          ArrayList<? extends Number> a4=new ArrayList<Float>();
		  ArrayList<? extends Number> a5=new ArrayList<Short>();
		  //a1.add(12);         //error
	}
}
//now u can assign a child typesafe ArrayList in a Parent typesafe Arraylist by use of<? extends Number.>
//this technique can be only used in one case u can not call add on a1/a2/a3...etc