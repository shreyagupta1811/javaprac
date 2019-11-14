import java.util.TreeSet;

class Student implements Comparable{
	String name;
	Integer age;

	Student(String name,Integer age){
          this.name=name;
		  this.age=age;
	}
	public int compareTo(Object o){
           Student s1=this;
		   Student s2=(Student)o;

		   String nm1=s1.name;
		   String nm2=s2.name;

		   Integer ag1=s1.age;
		   Integer ag2=s2.age;

		  // return nm1.compareTo(nm2);
		  //return ag1.compareTo(ag2);
	}
	public String toString(){
          return name+"~"+age;
	}
}
class P{
	public static void main(String[] args){
              TreeSet set=new TreeSet();

			  set.add(new Student("mohan",12));
			   set.add(new Student("sohan",55));
			   set.add(new Student("rohan",34));
			   set.add(new Student("gohan",7));
			   set.add(new Student("tohan",20));

			   System.out.println(set);
	}
}
//compare to here calls on the name property of student name are arranged in acessending order of there alphabets.
//at one time compareTo can work on only one property.