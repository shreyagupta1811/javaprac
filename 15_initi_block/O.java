class O{
	{
          System.out.println(this);
	}
	static{
         // System.out.println(this);
	}
	void pro(){
	      System.out.println(this);
	}
	static void pro1(){
          //System.out.println(this);
	}
}
//main point of this is that u can not use non static this from an static context.