import java.util.*;

class Employee implements Comparable<Employee>{
	String name;
	int age;

	Employee(String name,int age){
          this.name=name;
		  this.age=age;
	}

	 public int compareTo(Employee e){
			return e.name.compareTo(this.name);
	 }

    public String toString(){
        return name+"~"+age;
     }

}
class G{
	public static void main(String[] args){
               Employee[ ] arr={
                                                                 new Employee("mohan",12),
														         new Employee("sohan",67),
															     new Employee("rohan",23),
															     new Employee("gohan",2),
																 new Employee("tohan",90)
                                               };
                Arrays.sort(arr);
				Employee e=new Employee("mohan",23);
				System.out.println(Arrays.binarySearch(arr,e));
	}
}

