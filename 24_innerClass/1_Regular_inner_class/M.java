class M{

	public static void main(String[] args){
             M m=new M();
			 X x=m.new X();
			 x.pro();
	}

	class X{
		void pro(){
                 System.out.println(f);
		}
	}
	private float f=20.9f;
}
/*private member of any class is only accessible to its inside but now the inner class is also a mamber of its own class 
so private member is accessible to inner class also*/
//here inner class ne outer class k private member ko access kiya h .