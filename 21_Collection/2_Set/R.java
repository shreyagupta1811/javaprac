import java.util.TreeSet;
import java.util.Comparator;
import java.io.Console;

class Student{
	String name;
	Integer age;

	Student(String name,Integer age){
           this.name=name;
		   this.age=age;
	}
	public String toString(){
            return name+"-"+age;
	}
}
class NameSort implements Comparator<Student>{
	public int compare(Student s1,Student s2){
   
		  return s1.name.compareTo(s2.name);
	}

}
class NameRevSort implements Comparator<Student>{
          public int compare(Student s1,Student s2){
   
		  return s2.name.compareTo(s1.name);
	}
	
}
class AgeSort implements Comparator<Student>{
       public int compare(Student s1,Student s2){
   
		  return s1.age.compareTo(s2.age);
	}     	
}
class AgeRevSort implements Comparator<Student>{
           public int compare(Student s1,Student s2){
   
		  return s2.age.compareTo(s1.age);
	} 
}
class R{
	public static void main(String[] args){
		Console c=System.console();
		System.out.println("enter 1 for NS, enter 2 for NRS, enter  3 for AS,enter 4 for ARS: ");

		String input= c.readLine();
		int  value=Integer.parseInt(input);

		Comparator comp=null;
		if(value==1){
             comp=new NameSort();
		}else if(value==2){
                comp=new NameRevSort();
		}else if(value==3){
                 comp=new AgeSort();
		}else if(value==4){
              comp=new AgeRevSort();
		}
             TreeSet set=new TreeSet(comp);

			 set.add(new Student("mohan",12));
			  set.add(new Student("sohan",14));
			  set.add(new Student("gohan",15));
			  set.add(new Student("rohan",18));
			 set.add(new Student("tohan",21));

			 System.out.println(set);
	}
}
//Comparator is a generics interface to implement generics we have to type same and instead of passing the object var we directly 
//pass our class.
