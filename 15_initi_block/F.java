class X{
	X(){
         System.out.println("X() in class X");
	}
	{
          System.out.println("block in class X");
	}
}
class F extends X{
	F(){
         System.out.println("F() in class F");
	}
	{
        System.out.println("block in class F");
	}
	public static void main(String[] args){
          System.out.println("main starts~~~~~~");
            F f = new F();
		  System.out.println("main ends ~~~~~~~");
	}

}

