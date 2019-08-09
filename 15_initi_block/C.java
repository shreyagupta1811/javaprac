class C{
	static{
         System.out.println("hey everyone");
	}
	public static void main(String[] args){
           C x1= new C();
           C x2 = new C();
		   C x3 = new C();
	}
}
/*here in this program print statement runs only once when main class load than static initialization block get
frame memory in the stack before main methid execution.*/