import java.util.ArrayList;

class A{
	public static void main(String[] args){
          ArrayList list=new ArrayList();

		              list.add("mohan");
		  	          list.add("sohan");
			  	      list.add("rohan");
				  	  list.add("gohan");

					  Object[ ] arr=list.toArray();
					  for(Object obj:arr){
                              System.out.println(obj);
					  }
					 
	}
}
//toArray() single parametrized method of list class it return the array of element that are stored in list.
//here the return type of array of type object