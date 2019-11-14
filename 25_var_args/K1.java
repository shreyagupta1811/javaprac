class K1{
	public static void main(String[] args){
		//case 1
          // pro();

		  //case 2
		 // pro(11);

		 //case 3
		 pro(11,12,13,14);
	}
	static void pro(int x,int...y){
           System.out.println(x);
		   for(int i:y){
                   System.out.println(i);
		   }
	}
}
//case 1--we are calling no parametrized method and for var-args zero parametrized allowed but for int we must have to pass.
//case 2--here we are calling one parametrized method this will store in int and for var-args it is zero parametrized.
//case 3-11 store int int and after this all are stored in var-args as it allows multiple no of arguments.