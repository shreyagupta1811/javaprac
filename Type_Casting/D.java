class Animal{
     void go(){
	      System.out.println("Animal go");
	 }
}
class Dog extends Animal{
        void go(){
            System.out.println("Dog go");
		}
		void abc(){
            System.out.println("abc() in dog class");
		}
}
class D{
	public static void main(String[] args){
          Animal  x=new Dog();
		  x.go();
		//Animal x=(Animal)new Dog();
		  Dog d=(Dog)x;
		  d.abc();
	}
}