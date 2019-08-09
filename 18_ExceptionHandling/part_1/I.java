class I{
	public static void main(String[] args){
          System.out.println("~~~~~~~~~~~1");
		  try{
			  int x=12/0;
			   System.out.println("~~~~~~~~~2");

			   int[]  y={11,12,13};
			   System.out.println(y[3]);
			    System.out.println("~~~~~~~~~3");

				String s=null;
				System.out.println(s.length()); 
				System.out.println("~~~~~~~~~4");

		  }catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("AIOBE"); 
		  }catch(ArithmeticException e){
                     System.out.println("AE"); 
		  }catch(NullPointerException e){
                      System.out.println("NPE"); 
		  }
		   System.out.println("~~~~~~~~~5");
	}
}
/*here we can form multiple catch block of multiple problems in a try block .....catch block  run in topdown manner.as spon as 
appropriate catch block runs method popout from the stack */