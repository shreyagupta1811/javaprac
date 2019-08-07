class G{
	int a=10;
	void pro(){
         int a=20;
		 System.out.println(this);
		 System.out.println(a);
		 System.out.println(this.a);
	}
 	public static void main(String[] args){
           G g1=new G();
		    System.out.println(g1);
			g1.pro();

			G g2=new G();
			 System.out.println(g2);
			 g2.a=30;
			  g2.pro();
			  
			
	}
}
