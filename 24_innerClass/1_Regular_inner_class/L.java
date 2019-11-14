class L{
	int w=1;

	class X{
		void pro(){
           System.out.println(w);
		}
	}

	public static void main(String[] args){
            L e=new L();
			X x1=e.new X();
			e.w=10;
			x1.pro();

			 L f=new L();
			X x2=f.new X();
			f.w=20;
			x2.pro();
	}
}