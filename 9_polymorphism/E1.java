class test{
	public static void main(String[] args){
          //case 1
		 LivingBeing  x = new Plants ();
		  x.pro();
		  x.pro1();
		  x.pro2();
		  x.pro3();
     }
}
class LivingBeing{
           void pro(){
            System.out.println("i m livingbeing");
         }
}
class  Human extends LivingBeing{
            void pro1(){
               System.out.println("i m human ");
			}
}
class Animal extends LivingBeing{ 
           void pro2(){
            System.out.println("i m animal");
         }
}
class Plants extends LivingBeing{ 
               void pro3(){
            System.out.println("i m plant");
         }
}
