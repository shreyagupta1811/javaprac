import java.util.*;
class Employee {
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
class NameRevSort implements Comparator<Employee>{
           public int compare(Employee e1,Employee e2){
		   return e2.name.compareTo(e1.name);
		   }
}
class E{
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
				 Arrays.sort(ar,new NameRevSort());
				 System.out.println();
				 for(Employee e:ar){
                             System.out.println(e);
				 }
	}
}


