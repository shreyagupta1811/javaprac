class S2{
	public static void main(String[] args){
              System.out.println("~~~~~~~~~~~~~~~1");
                abc();
			  System.out.println("~~~~~~~~~~~~~~~2");
	}
	static void abc(){
		    mno();
           System.out.println("~~~~~~~~~~~~~~~3");
	}
	static void mno(){
		try{
               pqr();
          }catch(ArithmeticException e){
                 System.out.println(e);
		  }
           System.out.println("~~~~~~~~~~~~~~~4");
	}
	static void pqr(){
          System.out.println("~~~~~~~~~~~~~~~5");
             int x=12/0;
		  System.out.println("~~~~~~~~~~~~~~~6");
	}
}