import java.util.*;
class Employee implements Comparable<Employee>{
	String name;
	int age;

	Employee(String name,int age){
          this.name=name;
		  this.age=age;
	}
    public String toString(){
           return name+"~"+age;
		   }
    public int compareTo(Employee e){
           return this.name.compareTo(e.name);
	}
}
class D{
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
				 System.out.println();
				 for(Employee e:ar){
                             System.out.println(e);
				 }
	}
}
//comparision on the basis of name.

