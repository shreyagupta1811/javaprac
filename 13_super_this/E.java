interface X{
     int a=10;

}
interface Y{
	int a=20;
}
class E implements X,Y{
	int a=30;
	void pro(){
          int a=40;
		  System.out.println(a);
		  System.out.println(this.a);
		  System.out.println(Y.a);
		  System.out.println(X.a);
	}
	public static void main(String[] args){
           E e = new E();
		   e.pro();
	}

}
/*the main point is that when both the interface is having same variable than u can call them through their class name as 
used in line 14 & line 15.