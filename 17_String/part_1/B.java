//case 1
/*class B{
	public static void main(String[] args){
           String s="mohan";
		   String t="mohan";
		   System.out.println(s);
            System.out.println(s==t);
	}
}*/
//the main point is that s==t returns the output true this shows that s & t are pointing to the same object

//case 2
/*class B{
	public static void main(String[] args){
           String s="mohan";
		   String t="mohan";
		   s="mihaan";
            System.out.println(s==t);
	}
}*/
//here when we change the string of s now both s& t are pointing to two diff object now s==t is false