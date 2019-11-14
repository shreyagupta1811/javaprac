class N{
	class Y{
		private int i=10;
	}

	public static void main(String[] args){
           N n=new N();
		   Y y=n.new Y();
		   System.out.println(y.i);
	}
}
/*here private member of inner class can be accessible to outer class*/
//inner class and outer class have strong intimate relationship both can access private member of each other.