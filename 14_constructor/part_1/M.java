class R{
   R(){
     System.out.println("hello");
     System.out.println(this);

   }
}
class Q extends R{
	Q(){
		 System.out.println("hiii");
        System.out.println(this);
	}
}
class M extends Q {
	public static void main(String[] args){
      M m = new M();
	  System.out.println(m);
	}
}
