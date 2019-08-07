class LivingBeing{ }
class HumanBeing extends LivingBeing{ }
class Animal extends LivingBeing{ }
class Plants extends LivingBeing{ }
class Dog extends Animal{ }
class BDog extends Dog{ }
class test{
       public static void main(String[] args){
		   //case 1
           //LivingBeing  x = new HumanBeing();
		   //System.out.println(x);
//****************case 1 not included*****************
		   //case 2
		   //BDog  x=new BDog();
		   		   
            //case 3
			//Dog  x=new BDog();

			//case 4
			//Animal   x= new BDog();

			//case 5
		  //LivingBeing x= new BDog();

		  //case 6
		  //Object  x=new BDog();

		  //case 7(illegal code )
		 //HumanBeing x =new BDog();
	   }
}