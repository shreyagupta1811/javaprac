class V{
	public static void main(String[] args){
               String s="mohan is a mohan boy";
			   //String t=s.replace("mohan","ganesh");
			   String t=s.replace("sumesh","ganesh");

			   System.out.println(s);
			   System.out.println(t);
			   System.out.println(s==t);
	}
}
//here both the s and t are reffering to the same object hance hold the same refrence code and give the output true
//becoz to replace with ganesh there is no sumesh in the string so no new object will form and hence pointing to same object form in the 
//pool area of the heap.