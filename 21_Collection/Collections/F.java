import java.util.Collections;
import java.util.ArrayList;


class Student implements Comparable<Student> {
	String name;
	int age;

	Student(String name,int age){
           this.name=name;
		   this.age=age;
	}
	public String toString(){
         return name+"-"+age;
	}
	public int compareTo(Student s){
            return this.name.compareTo(s.name);
	}

}
class F{
	public static void main(String[] args){
             ArrayList list=new ArrayList();

			            list.add(new Student("mohan",12));
				        list.add(new Student("sohan",45));
					    list.add(new Student("rohan",78));
						list.add(new Student("gohan",7));
						list.add(new Student("tohan",20));

					Collections.sort(list);
					System.out.println(list);
					//case 1
					//Student s=new Student("gohan",7);
					//System.out.println(Collections.binarySearch(list,s));
                      //case 2
					//Student s=new Student("gohan ",67);
					//System.out.println(Collections.binarySearch(list,s));
					//case 3
					//Student s=new Student("ritesh ",12);
					//System.out.println(Collections.binarySearch(list,s));
	}
}
//here in binary search we are parsing those key,value pair that is not present but still ans comes but in negative value that
//negative value can be calculated by formula ....(-(insertion index)-1).*/ 

