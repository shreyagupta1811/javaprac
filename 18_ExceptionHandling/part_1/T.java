class T{
	public static void main(String[] args){
              System.out.println("~~~~~~~~~~~~~~~~~1");
                A.abc();
			  System.out.println("~~~~~~~~~~~~~~~~~2");
	}
}
class A{
     static void abc(){
        B.mno();
	    System.out.println("~~~~~~~~~~~~~~~~~3");
	 }
}
class B{
    static void mno(){
         C.pqr();
	System.out.println("~~~~~~~~~~~~~~~~~4");
	}
}
class C{
	   static void pqr(){
		   System.out.println("~~~~~~~~~~~~~~~~5");
          String s=null;
		  System.out.println(s.length());
           System.out.println("~~~~~~~~~~~~~~~~~6");
	   }
}
//stack trace contain along with the method  class name.