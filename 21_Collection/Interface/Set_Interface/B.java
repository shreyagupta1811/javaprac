	import java.util.TreeSet;

class B{
	public static void main(String[] args){
		TreeSet set = new TreeSet();

		set.add(78);
		set.add(34);
		set.add(56);
		set.add(28);
		set.add(2);
		set.add(62);
		set.add(12);

        System.out.println(set);
		//case 1
		//System.out.println(set.ceiling(56));
		//System.out.println(set.ceiling(37));
		//System.out.println(set.ceiling(99));

         //case 2
		 //System.out.println(set.floor(38));
		// System.out.println(set.floor(62));
		// System.out.println(set.floor(1));

		//case 3
		//System.out.println(set.headSet(56));  //strictly portion of element smaller than parsed value.
		//System.out.println(set.headSet(56,true));  //on parsing true last element include 
		//System.out.println(set.headSet(56,false));    //on parse false it not include the last element.

		//case 4
			//System.out.println(set.tailSet(12));  //strictly portion of element greater than parsed value including he value.
		//System.out.println(set.tailSet(12,true));  //on parsing true last element include 
		//System.out.println(set.tailSet(12,false));    //on parse false it not include the last element.
	}
}
//case 1---ceiling() return the least element which is greater than or equal to the parsed element.
//case 2--floor() return the greatest element that is smaller than and equal to the parsed element.
