class N{
  	public static void main(String[] args){
           String s="mohan";
		   String t="MOHAN";

		 String y=s.toUpperCase();
		 System.out.println(t==y);
 	}
}
/*here there are two object form in non pool area whose refrence code return in s & t,&when method calls on s a fresh new object forms in 
heap area whose refrence code returns in y ,....on checking t==y we gwt false becoz they have diffrent ref code in it.*/