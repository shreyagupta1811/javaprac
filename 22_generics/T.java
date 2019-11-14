import java.util.*;

class T{
	public static void main(String[] args){
		//case 1---------OK
               /*ArrayList a1=new ArrayList<Integer>();
			   ArrayList a2=new ArrayList<String>();
			   ArrayList a3=new ArrayList<Long>();
			   ArrayList a4=new ArrayList<Animal>();
			  ArrayList a5=new ArrayList<Car>();
			  ArrayList a6=new ArrayList<Cat>();*/

			  //case 2-----------NOT OK
			   /* ArrayList<Object> a1=new ArrayList<Integer>();
			   ArrayList<Object> a2=new ArrayList<String>();
			   ArrayList <Object>a3=new ArrayList<Long>();
			   ArrayList <Object> a4=new ArrayList<Animal>();
			  ArrayList<Object> a5=new ArrayList<Car>();
			  ArrayList<Object> a6=new ArrayList<Cat>();*/

			  //case 3-----------------OK
			 /*ArrayList<?> a1=new ArrayList<Integer>();
			   ArrayList <?>a2=new ArrayList<String>();
			   ArrayList<?> a3=new ArrayList<Long>();
			   ArrayList <?>a4=new ArrayList<Animal>();
			  ArrayList <?>a5=new ArrayList<Car>();
			  ArrayList <?>a6=new ArrayList<Cat>();*/

			  //case 4----------OK
			 /* ArrayList <? extends Object>a1=new ArrayList<Integer>();
			   ArrayList <? extends Object> a2=new ArrayList<String>();
			   ArrayList <? extends Object> a3=new ArrayList<Long>();
			   ArrayList  <? extends Object>a4=new ArrayList<Animal>();
			  ArrayList  <? extends Object>a5=new ArrayList<Car>();
			  ArrayList  <? extends Object>a6=new ArrayList<Cat>();*/
	}
}
class Car{ }