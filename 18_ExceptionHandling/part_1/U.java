class U{
	public static void main(String[] args){
          System.out.println("~~~~~~~~~~~~~1");
		  try{
                int y=12/0;
				 System.out.println("~~~~~~~~~~~~~2");
		  }catch(ArithmeticException e){
			  // System.out.println(e.getMessage());
                  //System.out.println(e);
				 // e.printStackTrace();
		  }
		   System.out.println("~~~~~~~~~~~~~3");
	}
}
/*here we are using two important method of class throwable ....both having return type void ....one of them printstackTrace is already 
printing the tracing so there is no need to write it inside the syatem.out.println()*/