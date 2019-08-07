class X{
	static void pro(){
          System.out.println(" pro() in X");
	}
}
class Y extends X{
	static void pro(){
         System.out.println("pro() in Y");
    }
}
class test{
	 public static void main(String[] args){
           //case 1
		   /*X a= new X();
		   a.pro();*/

		   //case 2
		 /*  Y b = new Y();
		   b.pro();*/

		   //case 3
		  X a = new Y();
		   a.pro();
	 }
}