class C{
	public static void main(String[] args){
		String a="mohan";
          String s=new String(a);
		  String t=new String(a);

		  System.out.println(a);
		   System.out.println(s);
		    System.out.println(t);

		  System.out.println(s==t );
		   System.out.println(a==t );
		    System.out.println(s==a);
	}
}
//here three object forn one in pool area & two in nonpool area ,s & t  holds ref var of two two diff objects hece s==t gives false