import java.util.TreeSet;

class A{
	public static void main(String[] args){
          TreeSet set=new TreeSet();

		  set.add(56);
		  set.add(14);
		  set.add(39);
		  set.add(20);
		  set.add(87);
		  set.add(2);

		  System.out.println(set);
		  //case 1
		  //System.out.println(set.first());
		  //case 2
		   //System.out.println(set.last());
		   //case 3
           // System.out.println(set.headSet(56));
		   //case 4
		   System.out.println(set.tailSet(20));
		   //case 5
	       // System.out.println(set.subSet(14,56));
	}
}
//case 1--first() will return the current smallest element from the sorted list.
//case 2--last() will  return the largest current element from the sorted  list.
//case 3--headSet() will returned the portion of list lower than the parsed elemnet.
//case 4--tailSet() will return the portion of list higher than the parsed element including the parsed element.
//case 5--subSet() will return the portion of set between fromElement and toElement including the toelement.