class W{
	static  void pro(float...f){
            System.out.println("primitive float");
	}
	static void pro(Float...f){
          System.out.println("wrapper class Float ");
	}
	public static void main(String[] args){
		  //case 1
           // pro(12.3f,3.67f);
		   //case 2
		  // pro(new Float(1.3),new Float(4.5));
	}
}
//in both the cases the primitive float and wrapper class float there is ambiguity that which method will run.