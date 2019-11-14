import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
class G{
	public static void main(String[] args){
          ArrayList list=new ArrayList();

		   list.add(new Student("mohan",12));
		   list.add(new Student("sohan",45));
		   list.add(new Student("rohan",7));
		   list.add(new Student("gohan",82));
		  list.add(new Student("tohan",99));
           
		   NameRevSort  nrs=new NameRevSort();
		 Collections.sort(list,nrs);
		 System.out.println(list);
		 //case 1
          // Student s=new Student("tohan",99);
		 //System.out.println(Collections.binarySearch(list, s,nrs));

		 //case 2
		// Student s=new Student("karthik",4);
		// System.out.println(Collections.binarySearch(list, s,nrs));

		//case 3----error---sort karte time jis comparator k use karte h search karte time bhi usse hi paas karte h otherwise error
		//Student s=new Student("tohan",99);
		//System.out.println(Collections.binarySearch(list, s,ars));
	
	}
}
/*here we are using a binarSearch() which is three parametrized in which we have to pass the list on which we perform searching ,
then pass key which is to be searched ,than pass on what basis sorting is done*/