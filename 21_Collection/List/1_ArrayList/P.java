import java.util.ArrayList;
class Student{
	String name;
	int age;

	Student(String name,int age){
           this.name=name;
		   this.age=age;
	}
	public String toString(){
	         return name+"-"+age;
	}
}
class P{
	public static void main(String[] args){
                 ArrayList a=new ArrayList();
				a.add(new Student("mohan",12));
				a.add(new Student("sohan",14));
				a.add(new Student("rohan",16));
			    a.add(new Student("gohan",18));
			    a.add(new Student("tohan",20));

				System.out.println(a);
	}
}