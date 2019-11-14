import java.util.HashSet;
class Student{
	String name;
	int age;

	Student(String name,int age){
           this.name=name;
		   this.age=age;
	}
	public boolean equals(Object obj){
		Student s1 = this;
		Student s2 = (Student)obj;

		String nm1 = s1.name;
		String nm2 = s2.name;

		return nm1.equals(nm2);
	}

	public int hashCode(){
		return 12;
	}

	public String toString(){
		return name+"~"+age;
	}

}
class I{
	public static void main(String[] args){
         HashSet set=new HashSet();
		 set.add(new Student("mohan",12));
		 set.add(new Student("sohan",14));
		 set.add(new Student("rohan",16));
		 set.add(new Student("gohan",18));
		 set.add(new Student("tohan",20));

		 System.out.println(set);
		 System.out.println(set.size());
		 System.out.println(set.isEmpty());

		 Student s=new Student("sohan",14);
		 System.out.println(set.remove(s));
		 System.out.println(set.contains(s));

		  System.out.println(set);		
	}
}
//here all the methods work properly on user defined class Student.
//the hashcode method oerwrite here is correct but not a valid and optimize solution.
