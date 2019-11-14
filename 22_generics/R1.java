import java.util.*;

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }

class R1{
	public static void main(String[]  args){
		       ArrayList<? super Animal> a2=new ArrayList<Animal>();
		       ArrayList<? super Animal> a3=new ArrayList<LivingBeing>();
			   ArrayList<? super Animal> a4=new ArrayList<Object>();

			   //case 1
			   //a4.add(new Object());
			   //a4.add(new LivingBeing());

			   //a4.add(new Animal());
			   
				 //case 2
				// a3.add(new LivingBeing());
				 
				 //a3.add(new Animal());

				 //case 3
				 //a2.add(new Animal());
	}
}
