class Car{ }
class Sportscar extends Car{ }
class E{
	static void pro(Car r){
          System.out.println("pro(car)");
	}
	static void pro(Sportscar s){
         System.out.println("pro(Sportscar)");
	}
	public static void main(String[] args){
       Car c = new Sportscar();
	   pro(c);
	}
}
//when method is static only the type of the object reference variable decide which method