class X{
	int a=100;
}
class Y extends X{
	int a=200;
	void pro(){
          int a=300;
		  System.out.println(a);
		  System.out.println(super.a);
		  System.out.println(this.a);
	}
}
class B extends Y{
	public static void main(String[] args){
         Y y= new Y();
		 y.pro();
	}
}
