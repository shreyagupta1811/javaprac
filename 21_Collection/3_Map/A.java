import java.util.HashMap;
class A{
	public static void main(String[] args){
           HashMap map=new HashMap();

          map.put("mohan",12);
		  map.put("sohan",34);
		  map.put("rohan",43);
	      map.put("gohan",20);
		 map.put("tohan",6);
		  map.put("mohan",22);

          System.out.println(map);
	}
}
//duplicate key are not allowed ina map 
//the way map represent is different from collection.........it is in curley braces.