class A{
	void pro(){
	       System.out.println("hello Good morning");
	}
}
class B extends A{
	public static void main(String[] args){
		B x=new B();
	        System.out.println(x.toString());
			//x.abc();
			x.pro();
	}
}