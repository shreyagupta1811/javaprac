import java.util.HashSet;
class A{
	public static void main(String[] args){
	       HashSet set=new HashSet();
		   
		   set.add(11);
		  set.add(7);
		   set.add(98);
		   set.add(87);
		    set.add(56);
	        
			System.out.println(set);
			System.out.println(set.remove(11));
			System.out.println(set.remove(91));
			System.out.println(set);
	 }

}
/*haset implements collection interface so all the methods of collection interface are used in HashSet but Hashset is not ordered
not sorted so on calling add elements are print in unordered form*/
/*remove method in setis overwrite having boolean return type and on passing the integer it take as an element and check whether parsed 
element is present or not*/