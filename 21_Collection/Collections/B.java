import java.util.Collections;
import java.util.ArrayList;

class Student {
	String name;
	int age;

	Student(String name,int age){
           this.name=name;
		   this.age=age;
	}
	public String toString(){
         return name+"-"+age;
	}
}
class B{
	public static void main(String[] args){
             ArrayList list=new ArrayList();

			            list.add(new Student("mohan",12));
				        list.add(new Student("sohan",45));
					    list.add(new Student("rohan",78));
						list.add(new Student("gohan",7));
						list.add(new Student("tohan",20));

					System.out.println(list);
					Collections.sort(list);
					System.out.println(list);
	}
}
//sort method does not work on the user defined class give exception classCasteException student can not be converted to 
//Comparable.