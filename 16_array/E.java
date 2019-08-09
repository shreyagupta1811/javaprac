class Student{
	String name;
	int age;
	Student(String name,int age){
         this.name=name;
		 this.age=age;
	}
}
class E{
	public static void main(String[] args){
          Student[] x = new Student[2];

          System.out.println(x[0]);
		   System.out.println(x[1]);
	}
}
//here we can make array object and simply print x[0] & x[1] so we get default value null.