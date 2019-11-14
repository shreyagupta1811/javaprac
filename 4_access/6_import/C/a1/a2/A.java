package a1.a2;
//case3(important)this will access only that file that was made directly inside the B1
//import b1.*;

//case 4
//import b1.b2.*;

//case 6
//import b1.*.b2.*.b3.*;

//case5
//import b1.b2.b3.*;

//case2
/*import b1.D;
import b1.b2.B;
import b1.b2.b3.C;*/

class A{
	public static void main(String[] args){
		//case 1:
	      /* b1.D d=new b1.D();
		   b1.b2.B b=new b1.b2.B();
		   b1.b2.b3.C c =new b1.b2.b3.C();*/
		  
		D d=new D();
		  B b=new B();
		  C c =new C();

	}
}