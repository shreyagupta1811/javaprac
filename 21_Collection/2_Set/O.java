import java.util.TreeSet;
class Student{
      String name;
	  int age;

	  Student(String name,int age){
             this.name=name;
			 this.age=age;
	  }
	  public String toString(){
            return name="-"+age;
	  }
}
class O{
	public static void main(String[] args){
           TreeSet set=new TreeSet();

		   set.add(new Student("mohan",12));
		   set.add(new Student("sohan",45));
		   set.add(new Student("rohan",23));
			set.add(new Student("gohan",54));
			set.add(new Student("tohan",20));

			System.out.println(set);
	}
}
//this program gives an exception the classCastException becoz TreeSet is a Sorted class so on which basis it do sorting ...
//either on the basis of name or on the basis of age.