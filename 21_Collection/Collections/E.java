import java.util.ArrayList;
import java.util.Collections;

class E{
	public static void main(String[] args){
          ArrayList list=new ArrayList();

		      list.add(56);
		      list.add(89);
		      list.add(15);
			  list.add(9);
			  list.add(99);
			  list.add(67);
			  list.add(82);

			  Collections.sort(list);
			   System.out.println(list);

			//   System.out.println(Collections.binarySearch(list,99));
			//System.out.println(Collections.binarySearch(list,9));

			//System.out.println(Collections.binarySearch(list,33));
			//System.out.println(Collections.binarySearch(list,100));
	}
}