class F{
	int [ ] x = new int[3];
	public static void main(String[] args){
          F e = new F();
		  System.out.println(e.x.length);
		  e.x[0]=10;
		  e.x[1]=20;
		  e.x[2]=30;

		  System.out.println(e.x[0]);
		    System.out.println(e.x[1]);
		  System.out.println(e.x[2]);
           
	}
}