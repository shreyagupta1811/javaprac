class Student{
	String name;
	int age;
	String college;
	String address;
}
class T{
	public static void main(String[] args){
            Student s = new Student();

			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.college);
			System.out.println(s.address);
			

            s.name="kritika";
			s.age=10;
			s.college="GGCT";
			s.address="jbp";
			
			System.out.println(s.name);
			System.out.println(s.age); 
			System.out.println(s.college);
			System.out.println(s.address);

		}
}