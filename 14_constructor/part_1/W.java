class W{
	final int a;
	final int b=10;

	W(){
        a=20;
	}
	public static void main(String[] args){
         W x = new W();
		 System.out.println(x.a);
		 System.out.println(x.b);
	}
}
//here  the main point of the code is that there is no error in line 2 as we know final variable must always be initialized
//but we initialize it in constructor & there is no problem becoz actual initializatio is inside the constructor