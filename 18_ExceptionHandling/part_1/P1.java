class P1{
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
        }finally{
                 System.out.println("####################################");
		}
		 System.out.println("~~~~~~~~~~~~5"); 
	}
}
//finally block also work when there is no catch block for try block problems