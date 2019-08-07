/*final*/ class M{
	void pro(){
	     System.out.println("pro() is in M");
	}
	final void abc(){
	  System.out.println("abc() is in M");
	}
	void pqr(){
       System.out.println("pqr() is in M");
	}
}
class G extends M{
       void pro(){
	     System.out.println("pro() is in  G");
	}
	 void abc(){
	  System.out.println("abc() is in G");
	}
	void pqr(){
       System.out.println("pqr() is in G");
	}
   public static void main(String[] args){
           G g=new G();
		   g.pro();
		   g.abc();
		   g.pqr();
   }
}
//there are two errors one that final class can't be inherit and
// final method of any class can not be reimplemented.