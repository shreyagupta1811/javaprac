class X{
	final void pro(){
	    System.out.println("pro() is in X");
	}
}
class H{
	public static void main(String[] args){
		X x = new X();
		x.pro();
	}
}
//final methid of any class can be accessed from instantiation but cannot be modified.