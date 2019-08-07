class  G{
	public static void main(String[] args){
		//case 1
	//Animal  x = new Animal();
	//x.makeSound();
	
	//case 2
	//Animal x = new Cat();
	//x.makeSound();

	//Animal x = new Dog();
	//x.makeSound();
	}
}

class Animal{
    	void makeSound(){
              System.out.println("Animal Sound");
	}
}
class Cat extends Animal{
	   void makeSound(){
              System.out.println("Cat sound");
	}
}
class Cow extends Animal{
	   void makeSound(){
              System.out.println("Cow sound");
	}
}
class Dog extends Animal{
	      void makeSound(){
                 System.out.println("Dog sound");
	}
}uyt