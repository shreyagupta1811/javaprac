class J{
	{
          System.out.println("inside init block-----------------b");
	}
	{
           System.out.println("inside init block----------------A");
	}
	public static void main(String[] args){
       System.out.println("main starts");
           J x = new J();
	   System.out.println("main  ends");
	}
}
//this program is discussed to see the sequence of init block  