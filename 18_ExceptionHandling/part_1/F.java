class F{
	public static void main(String[] args){
          System.out.println("~~~~~~~~~~1");
		      try{
			  String s=null;
			  int i=s.length();
			  System.out.println("~~~~~~~~~~a");
			  }catch(NullPointerException e){
				  System.out.println("NPE");
			}
            System.out.println("~~~~~~~~~~2");
	}
}