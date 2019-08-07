class F{
	int x;
	float y;
	char c='A';
	boolean b;

	//compiler supplied code
	/*F(){
           this.x=0;
		   this.y=0.0;
		   this.b=false;
		   this.char='A';
	}*/

	public static void main(String[] args){
        F f=new F();
		System.out.println(f.x);
		System.out.println(f.y);
		System.out.println(f.b);
		System.out.println(f.c);
	}
}