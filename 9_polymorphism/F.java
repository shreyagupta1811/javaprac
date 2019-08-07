//doubt ***************************************************
class F{
	public static void main(String[] args){
      Cat c = new Cat();
	  callSound(c);

	  Cow w = new Cow();
	  callSound(w);

	  Dog d = new Dog();
	  callSound(d);
     }

	static void callSound(Animal c){
     c.makesound();
	 }

	/* static void callSound(Cow c){
     c.makesound();
	 }

	 static void callSound(Cat c){
     c.makesound();
	 }

	 static void callSound(Dog c){
     c.makesound();
	 }*/

}
class  Animal{
	void makesound(){
    System.out.println("Animal sound");
	}
}
class Cat extends Animal{
	void makesound(){
     System.out.println("cat sound");
	}
}
class Cow extends Animal{
	void makesound(){
    System.out.println("Cow sound");
	}
}
class Dog extends Animal{
	void makesound(){
		System.out.println("Dog sound");
	}
}