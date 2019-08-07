class X{
	void pro(){
          System.out.println("  pro() in X");
	}
}
class Y extends X{
	void pro(){
       System.out.println("  pro() in Y");
	}
}
class test{
	public static void main(String[] args){08-03-2019
          //case 1
		  /*X a = new X();
		  a.pro();*/

		  //case 2
		  /*Y  b = new Y();
		  b.pro();*/

		  //case 3
		 // X a = new Y();
		  a.pro();

		  //case 4
		 // Y b = new X();  //invalid code u cant assigh object of parent class in child class.
		  //b.pro();


	}
      
}