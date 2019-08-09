class Q{
	public static void main(String[] args){
         System.out.println("~~~~~~~~~~1");
		 String s=null;
		 System.out.println(s.length());
		 try{
			 int x=Integer.parseInt(args[0]);
			 System.out.println("~~~~~~~~~~2");

			 int[] y={11,12,13};
			 System.out.println(y[x]);
			 System.out.println("~~~~~~~~~~3");

			 int a=12/x;
			 System.out.println(a);
			 System.out.println("~~~~~~~~~~4");

		 }catch(ArrayIndexOutOfBoundsException e){
                  System.out.println("~~~~~~~~~~5");
		 }catch(ArithmeticException e){
                   System.out.println("~~~~~~~~~~6");
		 }finally{
             System.out.println("###########################");
		 }
		 System.out.println("~~~~~~~~~~7");
	}
}
//if problem generating code is written out of try block than as soon as the rumtime exception caught main method popout without
//running finally block.
//##################################claws of finally block#############################