import java.util.*;

class LivingBeing{ }
class Animal extends LivingBeing{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{ }

class R{
	public static void main(String[]  args){
               ArrayList<? super Dog> a1=new ArrayList<Dog>();
		       ArrayList<? super Dog> a2=new ArrayList<Animal>();
		       ArrayList<? super Dog> a3=new ArrayList<LivingBeing>();
			   ArrayList<? super Dog> a4=new ArrayList<Object>();

			   //case 1
			   //a4.add(new Object());
			   //a4.add(new LivingBeing());
			   //a4.add(new Animal());
			   
				//a4.add(new Dog());
				 //a4.add(new BDog());

				 //case 2
				// a3.add(new LivingBeing());
				 //a3.add(new Animal());
				 
				 //a3.add(new Dog());
				 //a3.add(new BDog());

				 //case 3
				 //a2.add(new Animal());
				 
				 //a2.add(new Dog());
				 //a2.add(new BDog());

				 //case 4
				// a1.add(new Dog());
				 //a1.add(new BDog());
	}
}
//only the last two comments of each case is a valis statement in polymorphic assignment of generics.
//the class that is written after is super keyword and its child can only be assigned in a generics.