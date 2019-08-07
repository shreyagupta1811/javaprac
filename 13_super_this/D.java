class X{
      static int a=10;
}
class Y extends X{
      static int a=20;
	 /*static*/ void abc(){
             int a=30;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(super.a);
	  }
}
class D{
	public static void main(String[] args){
         Y y = new Y();
		 y.abc();
	}
}
//this() & super() are not used inside static method
//the main point of this program is same as discussed in C.java for method.