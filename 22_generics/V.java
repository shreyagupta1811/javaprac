import java.util.*;

class Car{ }
class Bus{ }

class Rental<T>{
	ArrayList<T> a=new ArrayList<T>();

	void addRecords(T  t){
         a.add(t);
	}
	T  getRecords(){
           return a.remove(0);
	}
}
class V{
	public static void main(String[] args){
           Rental<Car> r1=new Rental<Car>();
		   Car c1=new Car();
		   r1.addRecords(c1);
		  // r1.addRecords(new Bus());
		   Car c2=r1.getRecords();

            Rental<Bus> r2=new Rental<Bus>();
		   Bus b1=new Bus();
		   r2.addRecords(b1);
		   Bus b2=r2.getRecords();

	}
}
//generics implementation