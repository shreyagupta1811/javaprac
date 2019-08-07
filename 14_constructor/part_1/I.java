class I{
	int x=10;
	float y;
	boolean b;

	//constructor implicit code
     I(){
           /* super();
			this.x=10;
			this.y=0.0;
			this.b=false;*/
	 }

	 public static void main(String[] args){
          I i=new I();
		  System.out.println("hello my code");
	 }
}
//first line of default constructor is always super(); but whwn u make constructor in yiour class by yourself than u can write either 
//super(); or this(); which indicate to its current parent class onstructor.