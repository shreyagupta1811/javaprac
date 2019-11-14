import java.util.ArrayList;

class A{
	public static void main(String[] args){
		//case 1
        //  ArrayList list=new ArrayList();
         
		 //case 2
                // ArrayList<Integer> list=new ArrayList<Integer>();   //error in  12,13,14
                  // ArrayList<String> list=new ArrayList<String>();   //error in line 11,12,13 
                  list.add(34);
				  list.add(68.9);
                  list.add(true);
                  list.add("mohan");

				  System.out.println(list);
	}
}
//without applying typesafety we can store hetrogenous records in ArrayList