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
	public String toString(){
		return name+"~"+age;
	}
}
class H{
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
/*all the 5 key methods of Collection interface will be inherited to all they work well on the HAShCode class but on user defined class 
Student it will not work properly for this we have to do hash based Collection for this we have to overwrite the equals method which is 
called from inside thge contains method and also overwrite the Hashcode method of Object class*/
