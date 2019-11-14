class Student{
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

				   if(nm1.equals(nm2) && ag1==ag2){
                        return true;
				   }
			 }
			 return flag;
	}
}
class C{
	public static void main(String[] args){
           Student s1=new Student("mohan",12);
		   Student s2=new Student("mohan",12);
		   Student s3=new Student("mohan",12);

		   //contract 1-for a non null value x x.equals(x) should always give true result------------reflexive
		   System.out.println(s1.equals(s1));
		   System.out.println(s2.equals(s2));
		   System.out.println(s3.equals(s3));

		   //contract 2-for a non null value x and y....x.equals(y) should result true only if y.equals(x )results true.--------Symmetric
		      System.out.println(s1.equals(s2));
		   System.out.println(s2.equals(s1));
		  
		  //contract 3-for a non null value x ,y,z.....x.equals(y)give true and y.equals(z) give true so z.equals(x) should also returns true -------transitive
             System.out.println(s1.equals(s2));
		   System.out.println(s2.equals(s3));
		   System.out.println(s3.equals(s1));

		   //constract 4-for a non null value x and y multiple invocation of x.equals(y) should give same result every time ...if give true every time ut gives true 
		   //and if give false everytime give false----------------consistent
		    System.out.println(s1.equals(s2));
		   System.out.println(s1.equals(s2));
		   System.out.println(s1.equals(s2));
		    System.out.println(s1.equals(s2));

			//contract 5-for a non null ref value x x.equals(null) will always return a false results.
			 System.out.println(s1.equals(null));
		   System.out.println(s2.equals(null));
		   System.out.println(s3.equals(null));
		 

	}
}
//equals method of Object class is a contract method when we overwrite a contract method we have to take care of all the contracts.