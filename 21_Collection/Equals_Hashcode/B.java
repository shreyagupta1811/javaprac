class Student {
	String name;
	int age;
	Student(String name,int age){
        this.name=name;
		this.age=age;
	}
    public boolean equals(Object obj){
            boolean flag=false;
             if(obj instanceof Student){
                     Student s1=this;
					 Student s2=(Student)obj;

					 String nm1=s1.name;
					 String nm2=s2.name;

					 int ag1=s1.age;
					 int ag2=s2.age;

					 if(nm1.equals(nm2)&&ag1==ag2){
                           return true;
					 }
            }
          return flag;
	}
}
class B{
	public static void main(String[] args){
         Student s1=new Student("mohan",11);
		    Student s2=new Student("mohan",11);

			Integer i=new Integer(11);

			//System.out.println(s1==s2);
			//System.out.println(s1.equals(s2));
			//System.out.println(s1.equals(i));
	}
}
//our implementation of object class equals now it compare on the basis of string and integer