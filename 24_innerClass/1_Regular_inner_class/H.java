class X{
	int i=50;

	void pro(){
         System.out.println("heyy are u there");
	}
   
    class O  {

    }
}
class H{
	public static void main(String[] args){
          X x=new X();

		      //System.out.println(i);
		     //System.out.println(X.i);
		    // System.out.println(x.i);

			//pro();
			//X.pro();
			//x.pro();

			//new O();
			//X.new O();
			//x.new O();
	}
}
/*third way is the correct way to access the non static member of any other inside from any other class.*/