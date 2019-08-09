class A{
	public static void main(String[] args){
		System.out.println("~~~~~~~~~~1");
          int x=12/0;
		  System.out.println("~~~~~~~~~~2");
	}
}
//as soon as in line 4 exception occurs jvm throw the object of that exception call and main methos popout from strack further there is no execution 
//and no other statements runs.
//ArithemeticException