class L{
	public static void main(String[] args){
            String s="java";
			String t=s.replace('a','o');
			
			System.out.println(s);
             System.out.println(t);

			 System.out.println(s==t);
	}
}
//String manipulation object form in the non pool area of the heap.here to replace the a by o one new copy of this object form in 
//non pool area and its refrence code return in t

//this was prooved by the statement s==t is false. that they have refrence code  of diff object