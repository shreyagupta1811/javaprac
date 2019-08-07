class LivingBeing{ }
class HumanBeing extends LivingBeing{ }
class Animal extends LivingBeing{ }
class Plants extends LivingBeing{ }
class test{
	public static void main(String[] args){
              LivingBeing  x=new HumanBeing();
			   LivingBeing  y=new Animal();
			   LivingBeing z =new Plants();

				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
	}
} 