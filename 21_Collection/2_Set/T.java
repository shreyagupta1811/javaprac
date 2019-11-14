import java.util.PriorityQueue;
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
class T{
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
             PriorityQueue queue=new PriorityQueue(comp);

			 queue.offer(new Student("mohan",12));
			  queue.offer(new Student("sohan",14));
			  queue.offer(new Student("gohan",15));
			  queue.offer(new Student("rohan",18));
			 queue.offer(new Student("tohan",21));

			 //case 1
			 //System.out.println(queue);
               
			   //case 2
			 System.out.println(queue.poll());
			 System.out.println(queue.poll());
			 System.out.println(queue.poll());
			 System.out.println(queue.poll());
			System.out.println(queue.poll());
	}
}
//in Queue on printing Queue we will not get the correct outcome in case of name.
//in case 2 we get the correct outcome on using poll() which is used to print the removed element.

