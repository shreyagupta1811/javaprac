class test{
	public static void main(String[] args){
            //case 1
            /* C x = new C();
			 x.pro1();
			 x.pro2();
			 x.pro3();
			 System.out.println(x.toString());*/

			 //case 2
			/*B x = new C();
			 x.pro1();
			 x.pro2();
			 x.pro3();
			  System.out.println(x.toString());*/

			 //case 3
              /*A x = new C();
			  x.pro1();
			  x.pro2();
			  x.pro3();
			   System.out.println(x.toString());*/

			  //case 4
			  /*Object x = new C();
			  x.pro1();
			  x.pro2();
			  x.pro3();
			   System.out.println(x.toString());*/
	}
}
class A{
	void pro1(){
		System.out.println("pro1() i m in A");
	}
}
class B extends A{
	void pro2(){
		System.out.println("pro2() i m in B");
	}
}
class C extends B{
	void pro3(){
         System.out.println("pro3() i m in C");
	}
}
/*here in poly we can assign a child class object to a parent class variable when we do this object of child class behave or act like
a parent class and can access only those methods that are accessible by parent class.*/