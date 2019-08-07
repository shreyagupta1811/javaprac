class Car{ }
class Sportscar extends Car{ }
class  Acar extends Sportscar{ }
class F extends Acar{
	static void pro(Sportscar s){
            System.out.println("pro(sportscar)");
	}
	static void pro(Car c){
           System.out.println("pro(car)");
	}
	static void pro(Acar a){
             System.out.println("pro(Acar)");
	}
	   public static void main(String[] args){
             Sportscar x=new Acar();
			// Car x =new Car();
              F f = new F();
			  f.pro(x );
	}
}