class X{
	int a=10;
	static float b=20.6f;
}
class J{
	public static void main(String[] args){
		//case 1
         // System.out.println(a);
		 // System.out.println(b);

		 //case 2----valid
		/* X x=new X();
		 System.out.println(x.a);
		  System.out.println(x.b);*/

		  //case 3-----valid
		  //System.out.println(new X().a);
		   //System.out.println(X.b);
	}
}