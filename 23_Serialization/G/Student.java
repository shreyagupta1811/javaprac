import java.io.*;

class Student implements Serializable{
      String name;
	  int age;
	  transient Address address;

	  Student(String name,int age,Address address){
                 this.name=name;
				 this.age=age;
				 this.address=address;
	  }
	  private void writeObject(ObjectOutputStream oos){
		  try{
						oos.defaultWriteObject();  //this method automatically wite all the non static and non transient property of the Student class.
						oos.writeObject(address.city.cityName);    //by caling WriteObject of ObjectoutStream we can call the transient property of student class.
						oos.writeObject(address.state.stateName);
		  }catch(IOException e){
                    e.printStackTrace();
		  }
	  } 
	  private void readObject(ObjectInputStream ois){
		  try{
						  ois.defaultReadObject();
						  String ctName=(String)ois.readObject();
						  String stName=(String)ois.readObject();
						 // Address add=new Address(new City(ctName),new State(stName));
		  }catch(ClassNotFoundException e){
                     e.printStackTrace();
		  }catch(IOException e){
                       e.printStackTrace();
		  }
	  }
}