class Animal{ }
class Cat extends Animal{ }
class Dog extends Animal{ }
class Bus{ }
class H{
	public static void main(String[] args){
              Animal a=new Cat();
			 //Cat c=(Cat)a;
              // Dog d=(Dog)a;  //-----at runtime it checks that a stores object of cat & cat doest have parent child relation with Dog so fails----
			  //Bus b=(Bus)a;
	}
}
