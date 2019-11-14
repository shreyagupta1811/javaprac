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

	public boolean equals(Object obj){
           Student s1=this;
		   Student s2=(Student)obj;

		   String nm1=s1.name;
		   String nm2=s2.name;

		   System.out.println(nm1+"-"+nm2);

		   return nm1.equals(nm2);
	}

}
class S{
	public static void main(String[] args){
           ArrayList a=new ArrayList();
		   a.add(new Student("mohan",12));
		   a.add(new Student("sohan",23));
		   a.add(new Student("rohan",34));
		   a.add(new Student("gohan",45));
		   a.add(new Student("tohan",33));

		   System.out.println(a);
		   Student s=new Student("mohan",12);
		   System.out.println(a.remove(s));
		   System.out.println(a);
	}
}