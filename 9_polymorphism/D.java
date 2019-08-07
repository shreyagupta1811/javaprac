class A{ }
class B extends A{ }
class test{
	   public static void main(String[] args){
           //case 1
            A x = new B();

			//case 2
			//B y = new A();
	   }
}
//in polymorphism u can assign a child class object into parent class variable but u cannot assign a parent class object in a child class variable