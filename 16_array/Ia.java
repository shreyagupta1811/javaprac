class Student{
	String name;
	int age;

	Student(String name,int age){
         this.name=name;
		 this.age=age;
	}
}
class Ia{
	public static void main(String[] args){
            Student s1= new Student("anukriti",22);
			Student s2= new Student("aarya",24);
			Student s3= new Student("kanishka",26);

			System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
  

	}
}