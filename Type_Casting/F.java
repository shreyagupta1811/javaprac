class F{
	public static void main(String[] args){
           System.out.println(pro());
	}
	static byte pro(){
		//case 1
           //return 20;

		   //case 2
		  /* int a=2;
		   return (byte)a;*/

		   //case 3  -----OUT of Range--------
           //   return 300;

		   //case 4
		   //return (byte)300;
	}
}
//that law will be valid incase of return type but for (out of range value or assignment through variable)requires typecasting.
