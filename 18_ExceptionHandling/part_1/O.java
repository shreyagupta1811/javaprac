class O{
	public static void main(String[] args){
		  System.out.println("~~~~~~~~~~~~1"); 
        try{
			int x=Integer.parseInt(args[0]);
			System.out.println("~~~~~~~~~~~~2"); 

			int y=12/x;
			System.out.println("~~~~~~~~~~~~3"); 

			  int[] z={11,12,13};
			 System.out.println(z[x]);
			System.out.println("~~~~~~~~~~~~4"); 
        }catch(ArithmeticException e){
                 System.out.println("AE"); 
		}catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("AIOBE"); 
		}
		  System.out.println("####################################");
		  System.out.println("~~~~~~~~~~~~6"); 
	}
}
//if we have very imp code in our program that must be run in every condition whether ther is problem generating code in try block or not
//whether there is a appropriate catch block for the problem than where we write it
