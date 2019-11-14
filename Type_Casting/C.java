class Animal{ }
class Cat extends  Animal{ }
class Cow extends  Animal{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
class C{
	public static void main(String[]  args){
		//case 1  ----NOT conversion required----------
		/*
          //Cat c=new Cat();
		  //Cow x=new Cow();
		  //Dog d=new Dog();
		  //BDog b=new BDog();
		  */

         //case 2    ------Widdenning conversion automatically converted---------
		 /*
		 //Animal a=new Cat();
		 //Animal a = new Cow();
		 //Animal a=new Dog();
		 //Animal a= new BDog();
		 */

		 //case 3   -----------narrowing conversion--------conversion done by programmer----------
		 //Animal x=new Dog();
		 //Dog y=x;

		// Animal x=new Dog();
		 //Dog y=(Dog)x;
	}
}