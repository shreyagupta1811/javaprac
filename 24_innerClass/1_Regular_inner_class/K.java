class K{
	int y=90;

	class X{
		void pro(){
               System.out.println(y);
		}
	}

	void mno(){
         System.out.println(y);
	}

	public static void main(String[] args){
	     	K k=new K();
           /*System.out.println(k.y);
		   k.mno();*/

		  // k.new X().pro();
		  //or
		  //new K().new X().pro();

	}
}