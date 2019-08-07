class Shape{
	int l;
	int w;
	int h;

	Shape(int l){
          this.l=l;
     }

	 Shape(int l,int w){
          this.l=l;
		  this.w=w;
	 }

	 Shape(int l,int w,int h){
		 this(l,w);
             //this.l=l;
			// this.w=w;
			 this.h=h;
			 }
}
class X{
	public static void main(String[] args){
			   Shape s = new Shape(12,14,16);

		      System.out.println("length:"+s.l);
			  System.out.println("width:"+s.w);
			  System.out.println("height:"+s.h);
	}
}