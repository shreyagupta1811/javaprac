class X{
	public static void main(String[] ars){
         String s="mohan";
		 String t=new String(s);

		 //case 1
		 //System.out.println(s==t);

		 //case 2
		 //System.out.println(s.equals(t));
		 //or
		 //System.out.println(t.equals(s));
	}
}
//java architech overwrite the equals method of object class and write their own logic ....object class logic checks only refrence code but 
//String logic exactly match each character of the string and hence give diff ans.