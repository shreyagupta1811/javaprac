class A{
	  static  void pro(int a){
               System.out.println("pro(int)");
	   }
	    static void pro(float f){
              System.out.println("pro(float)");
	}
	public static void main(String[] args){
        pro(1.2f);
		pro(11);
	}
}
// in case of method overloading it decides at run time that which method is called & it decides by the type 
// of parameter passed during the method call.