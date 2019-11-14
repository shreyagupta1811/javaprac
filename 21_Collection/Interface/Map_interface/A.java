import java.util.TreeMap;

class A{
	public static void main(String[] args){
            TreeMap map=new TreeMap();
	
		     map.put("mohan",12);
			map.put("sohan",45);
			map.put("rohan",32);
			map.put("tohan",26);
			map.put("gohan",7);
		
		   System.out.println(map);
		   //case 1
		   //System.out.println(map.firstKey());

		     //casec 2
		   //System.out.println(map.lastKey());
		   
		   //case 3
		   //System.out.println(map.headMap("rohan"));
		   //System.out.println(map.headMap("gohan"));  
		  // System.out.println(map.headMap("dinesh"));  //if the parsed key is not present than it return the empty map. not a null value.
		  
		  //case 4
		// System.out.println(map.tailMap("mohan"));  // here the parsed element is included.
		 //System.out.println(map.headMap("eohan"));
	}
}
//case 1--firstKey() return the first or smallest key value of the sorted map
//case 2--lastKey() returns the largest  or last key value og the sorted map
//case 3--headMap()  returns the element smaller than the parsed element .if the element parsed is not present it returns the empty
//map
//case 4--tailMap() return the largest element than the parsed element including the parsed elements