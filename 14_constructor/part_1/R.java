class R{
	R(){
          System.out.println("R()");
	}
	R(int x){
		this();
        System.out.println("R(int x)");
	}
	public static void main(String[] args){
          R r = new R(12);
		  System.out.println("main method");
	}
}