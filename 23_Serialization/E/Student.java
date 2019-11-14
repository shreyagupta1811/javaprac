import java.io.Serializable;

class Student implements Serializable{
	transient String name;
	int age;

	Student(String name,int age){
         this.name=name;
		 this.age=age;
	}
}