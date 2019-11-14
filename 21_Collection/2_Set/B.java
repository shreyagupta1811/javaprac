import java.util.HashSet;
class B{
	public static void main(String[] args){
	       HashSet set=new HashSet();
		   
		   set.add(11);
		  set.add(7);
		   set.add(98);
		   set.add(87);
		    set.add(56);
	        
			System.out.println(set);
			System.out.println(set.contains(98));
             System.out.println(set.contains(90));
			System.out.println(set);
	 }

}
//contains method check whether the parsed element is present or not and returns boolean value
