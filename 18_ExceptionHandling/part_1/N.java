class N{
	public static void main(){
             System.out.println("~~~~~~~~~1");
         try{
               int x=12/0;
			   System.out.println("~~~~~~~~~~2");

			   int[ ] y={11,12,13};
			   System.out.println(y[3]);
			   System.out.println("~~~~~~~~~~~3");

			   String s=null;
			   System.out.println(s.length());
			    System.out.println("~~~~~~~~~4");
       	 }
		  System.out.println("~~~~~~~~~5");
		 catch(Exception e){
                 System.out.println("###############"+e);
		 }
		 System.out.println("~~~~~~~~~6");
	}
}
//here two error occurs at compiletime one ...catch without try or....try without catch