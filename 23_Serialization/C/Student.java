import java.io.Serializable;
class Student extends Person implements Serializable{
	String branch;
	String sem;
	String degree;

	Student(String name,int age,String branch,String sem,String degree){
		        this.name=name;
				this.age=age;
               this.branch=branch;
			   this.sem=sem;
			   this.degree=degree;
	}
}