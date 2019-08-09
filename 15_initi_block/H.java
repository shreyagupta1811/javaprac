class X{
     int x=10;
}
class H extends X{
           int x=20;
	{
          int x=30;
		  System.out.println(x);
		  System.out.println(this.x);
		  System.out.println(super.x);
	}
	public static void main(String[] args){
              H a = new H();
	}
}