class F{
       int i=30;

	   void abc(){
		   //case 1
           // System.out.println(i);
			//M m=new M();

			//case 2
			//System.out.println(this.i);
			//M m=this.new M();
	   }

	   class M{

	   }
	   public static void main(String[] args){
                 F f=new F();
				 f.abc();

                   //case 3
				 //M w=new M();
				// M w=f.new M();
				 
	   }
}
//case1
/*ek instance level member ko static contect m access karne k liye dot operator k usse karke batana padta h ki wo kiske context m run ho raha h */
//case 2
/*ek non static method k andar se doosre class k non static member bina dot operator k ek hi case m kar skte h wo h inner Class*/
//becoz inner class have a intimate relation with outer class.