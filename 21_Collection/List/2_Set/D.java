import java.util.HashSet;
class D{
	public static void main(String[] args){
           HashSet set=new HashSet();
		 set.add("mohan");
		 set.add("sohan");
	     set.add("rohan");
	     set.add("gohan");
		set.add("tohan");

		System.out.println(set);
		System.out.println(set.isEmpty());
		 System.out.println(set.size());

		 System.out.println(set.remove("mohan"));
		 System.out.println(set.remove("eohan"));

		 System.out.println(set.contains("mohan"));
		 System.out.println(set.contains("eohan"));

		 System.out.println(set);
	}
}
/*contains method work wrong becoz inside the contains method equals method run and it compre ref code but here contains compare
string*/