class Student{
	String name;
	int age;
	Student(String name,int age){
           this.name=name;
		   this.age=age;
	}
}
class A{
	public static void main(String[] args){
               Student s1=new Student("mohan",34);
			   Student s2=new Student("mohan",34);

			   System.out.println(s1==s2);
			   System.out.println(s1.equals(s2));
	}
}
//this was a equals implementation oif Object class which can compare the ref code of two object even having the same value
