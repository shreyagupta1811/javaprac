//invalid case
// case 2
/*package b1.b2;

class C extends B{
	public static void main(String[] args){
	            B x = new B();
				System.out.println(x.y);
	}
}*/

//valid case if u want to access variable of class A
//case 1
/*package b1.b2;
import a1.a2.a3.A;
class C extends A{
	public static void main(String[] args){
	            C x = new C();
				System.out.println(x.y);
	}
}*/