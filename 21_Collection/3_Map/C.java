import java.util.HashMap;
class C{
	public static void main(String[] args){
           HashMap map=new HashMap();

          map.put("mohan",12);
		  map.put("sohan",34);
		  map.put("rohan",43);
	      map.put("gohan",20);
		 map.put("tohan",6);

          System.out.println(map);
		  System.out.println(map.containsKey("mohan"));
		 System.out.println(map.containsKey("eohan"));
	}
}
