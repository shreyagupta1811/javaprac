class X{ 
	int a= 20;
}
class Y extends X{
	int a= 40;
}
class  test{
	public static void main(String[] args){
          //case 1
		 /* X x= new X();
		  System.out.println(x.a);*/

		  //case 2
		  /*Y y = new Y();
		   System.out.println(y.a);*/

		   //case 3
		    X x = new Y();
		   System.out.println(x.a);
     }
}
//variable only depends on the the class type whether it is static or non static.


