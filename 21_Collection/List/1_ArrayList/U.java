import java.util.ArrayList;
class U{
	public static void main(String[] args){
              ArrayList a=new ArrayList();
			  a.add("mohan");
			  a.add("sohan");
			  a.add("rohan");
			  a.add("gohan");
			  a.add("tohan"); 

			  System.out.println(a);
			  //case 1
			  //System.out.println(a.set(5,"eohan"));
			  //case 2
                //a.add(5,"eohan");
				//case 3
				//a.add(6,"eohan");
               //System.out.println(a);
	}
}
/*set method will remove the element at the specified index and and in place of that new element will stored ...in case 2 new elemnt eohan 
add at index 5....and in case of 6 before filling element at index 5 will will insert elemet at index 6...give
ARRAY_INDEX_OUT_OF_BOUNDS_EXCEPTION*/