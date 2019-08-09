class C{
	public static void main(String[] ars){
          String a="mohan";
		  String b=new String(a);

		  System.out.println(a==b);
		  System.out.println(a.equals(b));
	}
}
/*equality operator(==) checks refrence code store in ref var but equals method check exactly the string*/