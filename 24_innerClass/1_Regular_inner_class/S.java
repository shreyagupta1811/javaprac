class X{
	int a=11;
	  class A{
		  int a=12;
		      class B{
				  int a=13;
				       class C{
						   int a=14;
						   void abc(){
                                 System.out.println(a);
								  System.out.println(this.a);
								  System.out.println(B.this.a);
								  System.out.println(A.this.a);
								  System.out.println(X.this.a);
						   }
				       }
		      }
	  }
}
class S{
	public static void main(String[] args){
              X x=new X();
			  X.A a=x.new A();
			  X.A.B b=a.new B();
			  X.A.B.C c=b.new C();
			  c.abc();
	}
}