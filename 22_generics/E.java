import java.util.*;

class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }

class E{
	public static void main(String[] args){
           ArrayList<Integer> list=new ArrayList<Integer>();
            //case 1
		   /*Animal[ ] arr=new Cat[ 2];
		   arr[0]=new Cat();
		   arr[1]=new Dog();*/

		   //case 2
             ArrayList<Animal> a=new ArrayList<Cat>();
	}
}
/*ArrayStoreException ... at compile time its okk that in a arr variable of type array we can store Animal object by the rule of 
polymorphism we can assign a child class obj in a parent class variable...but at run time nor arr behave like a cat and ina cat 
object u cannot assign dog becoz cat is not a Dog*/ 
/*at compile time array gives u permission to assign a child class obj in a parent class variable but u cannot repeat this mistake 
in collection*/
//Rule 1-----TypeSaftey must be same on declaration and instantiation side.
