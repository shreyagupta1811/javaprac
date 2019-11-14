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

				   if(nm1.equals(nm2)){
                        flag=true;
				   }
			 }
			 return flag;
	}
      public int hashCode(){
               int sum=0;
			   String abcd= " abcdefghijklmnopqrstuvwxyz";

			   for(int i=0;i<name.length();i++){
                              sum+=abcd.indexOf(name.charAt(i));
			   }
			   System.out.println("hashcode"+sum);
			   return sum;
	  }
	        public String toString(){
                    return name+"-"+age;
			}
	  }
class D{
		  public static void main(String[] args){
              Student s1=new Student("mohan",11);
			  Student s2=new Student("mohan",45);
			  Student s3=new Student("hanmo",34);
		      Student s4=new Student("rajesh",2);

			  //contract 1-if on one object we repeatedly call the hashcode method on a same JVM execution than each time it return 
			  //the same ref code.but the ref code of same object in one execution may be different from the REF CODE Of same obj in other execution
			  System.out.println(s1.hashCode());
			  System.out.println(s1.hashCode());
			  System.out.println(s1.hashCode());

			  //contract 2-if two object are equals according to equals method than than on calling hascode method on the same 
			  //object must return the same integer.
			   System.out.println(s1.equals(s2));
			  System.out.println(s1.hashCode());
			  System.out.println(s2.hashCode());

			  //contract 3-if two object according to  equals are not same than it is not compulsory that they produce 
			  //unequal results on calling the hashcode method.
			   System.out.println(s1.equals(s3));
			  System.out.println(s1.hashCode());
			  System.out.println(s3.hashCode());
           }
	  }
	  //hascode is laso a contract method of object class so before overwriting the hashcode methode we must take of all the 
	  //3 contract of hascode method.
	 