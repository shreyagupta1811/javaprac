import java.util.HashMap;
class E{
	public static void main(String[] args){
           HashMap map=new HashMap();

          map.put("mohan",12);
		  map.put("sohan",34);
		  map.put("rohan",43);
	      map.put("gohan",20);
		 map.put("tohan",6);

          System.out.println(map);
		  System.out.println(map.get("rohan"));
		  System.out.println(map.get("ehon"));
		  System.out.println(map);
	}	 
}
//get() also call return value for the corresponding parsed key and return null for the non key value.

