import java.util.*;

class Car{ }
class Bus{ }

class CarRental{
	ArrayList<Car> c=new ArrayList<Car>();

	void addCar(Car car){
             c.add(car);
	}
	Car getCar(){
           return c.remove(0);
	}
}

class BusRental{
	ArrayList<Bus> b=new ArrayList<Bus>();

	void addBus(Bus bus){
           b.add(bus);
	}
	Bus getBus(){
                  return b.remove(0);
	}
}
class U{
	public static void main(String[] args){
               CarRental cr=new CarRental();
                   
                 Car car=new Car();
			   cr.addCar(car);

			   Car c1=cr.getCar();
	}
}
//real world application of generics.