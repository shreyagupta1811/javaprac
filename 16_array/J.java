class City{
     String cityName;
       City(String cityName){
                 this.cityName=cityName;
	   }
}
class State{
      String stateName;
          State(String stateName){
			  this.stateName=stateName;
		  }
}
class Address{
     City city;
	 State state;
           Address(City city,State state){
                  this.city=city;
				  this.state=state;
		   }


}
class Student{
          String name;
		  int age;
		  Address address;
		      Student(String name,int age,Address address){
                      this.name=name;
					  this.age=age;
					  this.address=address;
			  }

}
class J{
	public static void main(String[] args){
          Student[] x=new Student[2];

		  x[0]=new Student("mohan",23,new Address(new City("jabalpur"),new State("MP")));
		  x[1]=new Student("Shreya",22,new Address(new City("mumbai"),new State("Maharashtra")));

		  System.out.println(x[0].address.city.cityName);
		   System.out.println(x[1].address.state.stateName);
	}
}
//imp point is the way of access.