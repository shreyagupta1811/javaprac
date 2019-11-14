	class O{
      int y=10;

	  void pro(){
               System.out.println("pro() in class O");
	  }

	  class X extends P{
		  void abc(){
                     System.out.println(y);
		  }
	  }

	  public static void main(String[] args){
           O o=new O();
		   X x=o.new X();
		   x.abc();
		   x.pro();
	  }
}
class P{
     int y=20;

	 void pro(){
                System.out.println("pro() in class P");
	 }
}
/*if we are accessing a variable inside the inner class that is having two version  one that is made in outer class and other that is made 
inside the parent class of inner class so inner class access the variable of its parent first*/
//access step
//inside method jiske andar se call kar rahe h ,then in class jiske andar method h ,then parent class.