import java.util.*;
class Employee{
	String name;
	int age;

	Employee(String name,int age){
          this.name=name;
		  this.age=age;
	}
    public String toString(){
           return name+"~"+age;
		   }
}
class C{
	public static void main(String[] args){
           Employee[ ] ar={
                                                  new Employee("mohan",12),
                                                  new Employee("sohan",56),
                                                  new Employee("rohan",23),
                                                   new Employee("gohan",89)
		                                 };
                 for(Employee e:ar){
                             System.out.println(e);
				 }
				 Arrays.sort(ar);
				 for(Employee e:ar){
                             System.out.println(e);
				 }
	}
}
//classcasteexception ---employee cannot be converted to comparable
//sorting on what basis either on name or age?????