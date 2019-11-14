import java.util.ArrayList;
class Student{
	String name;
	int age;

	Student(String name,int age){
           this.name=name;
		   this.age=age;
	}
	//########################IMPORTANT PART######################
	public String toString(){
	         return name+"-"+age;
	}
	//####################IMPORTANT PART########################
	public boolean equals(Object obj){
           Student s1=this;
		   Student s2=(Student)obj;

		   String nm1=s1.name;
		   String nm2=s2.name;

		   System.out.println(nm1+"-"+nm2);

		   return nm1.equals(nm2);
	}
}
class R{
	public static void main(String[] args){
                 ArrayList a=new ArrayList();
				a.add(new Student("mohan",12));
				a.add(new Student("sohan",14));
				a.add(new Student("rohan",16));
			    a.add(new Student("gohan",18));
			    a.add(new Student("tohan",20));

                 Student s=new Student("gohan",12);
				System.out.println(a.contains(s));
	}
}
/*here on calling equals method object class equals run which compare the object ref variable but here the equals that runs inside the
contains will compare the string so we overwrite this method and write our own implementation */
