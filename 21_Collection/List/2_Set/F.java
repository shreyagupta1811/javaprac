//case 1
/*import java.util.HashSet;
import java.util.Iterator;
class F{
	public static void main(String[] args){
             // HashSet set=new HashSet();
                HashSet<String>set=new HashSet<String>();
			  set.add("mohan");
			  set.add("sohan");
			  set.add("rohan");
			  set.add("gohan");
			  set.add("tohan");

			  Iterator<String> itr=set.iterator();
			  while(itr.hasNext()){
                   System.out.println(itr.next());
			  }
	}
}*/
/*Iterator interface is a type safe interface so while using we have to give it type*/
//case 2
/*import java.util.HashSet;
import java.util.Iterator;
class F{
	public static void main(String[] args){
             // HashSet set=new HashSet();
                HashSet<String>set=new HashSet<String>();
			  set.add(10);
			  set.add(11);
			  set.add(12);
			  set.add(13);
			  set.add(14.);

			  Iterator<String> itr=set.iterator();
			  while(itr.hasNext()){
                   System.out.println(itr.next());
			  }
     	}
	}*/
	/*in  case of case2 if we type safe hashset and iterator than u can not add integer*/

	//case3
/*import java.util.HashSet;
import java.util.Iterator;
class F{
	public static void main(String[] args){
             // HashSet set=new HashSet();
                HashSet<int>set=new HashSet<int>();
			  set.add(10);
			  set.add(11);
			  set.add(12);
			  set.add(13);
			  set.add(14);

			  Iterator<int> itr=set.iterator();
			  while(itr.hasNext()){
                   System.out.println(itr.next());
			  }
	}
}*/