class H{
	public static void main(String[] args){
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
		 }catch(Exception e){
                 System.out.println("###############"+e);
		 }
		 System.out.println("~~~~~~~~~5");
	}
}
/*for multiple problem if there is only one catch block than thre is no problem this catch block is called catchall......but this is not a
reliable code*/