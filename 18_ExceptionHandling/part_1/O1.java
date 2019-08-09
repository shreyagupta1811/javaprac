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
        }catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("AIOBE"); 
		}
		  System.out.println("####################################");
		  System.out.println("~~~~~~~~~~~~6"); 
	}
}
//here there is not appropriate catch block for the problem in try block so whole program crash and main method popout and our 
//most imp code not runs this create a major problem.