class X{
	static{
         System.out.println("good morning");
	}
	public static void main(String[] args){
          System.out.println("main starts~~~~");
           X a1= new X();
		   X a2 = new X();
		   X a3 = new X();
          System.out.println("main ends~~~~~");
	}
}
/*here also when main class load static init  block get stackup in stack and its statement get executed
before main method get memory in the stack*/