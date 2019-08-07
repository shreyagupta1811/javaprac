class X{
	X(){
          System.out.println("hello in X()");
	}
}
class Y extends X{
     Y(){
            System.out.println("hello in Y()");
	 }
}
class H extends Y{
      public static void main(String[] args){
            H h = new H();
			System.out.println("hello in H()");
	  }
}