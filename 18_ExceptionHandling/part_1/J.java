class J{
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
           
             String s=null;
			 System.out.println(s.length());
			 System.out.println("~~~~~~~~~~5");
        }catch(ArithmeticException e){
                 System.out.println("AE"); 
		}catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("AIOBE"); 
		}catch(NullPointerException e){
                    System.out.println("NPE"); 
		}
		  System.out.println("~~~~~~~~~~~~6"); 
	}
}
/*here we can pass the number through args which read the input at index at 0*/