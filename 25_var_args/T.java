class T{
	public static void main(String... args){
           Dog[] d={new Dog(),new Dog()};
		   pro(d);
	}
	static void pro(Animal...a){
              for(Animal aml:a){
                   System.out.println(aml);
			  }
	}
}
class Animal{

}
class Dog extends Animal{

}