import java.util.*;
class A{
	public static void main(String[] args){
           Integer[ ]  arr={14,76,52,1};

		   List list=Arrays.asList(arr);
            //case 1
		  /* System.out.println(list);
		   arr[1]=100;
		   System.out.println(list);*/

                  //  System.out.println("############################3");

		   //case 2
		   /*for(Integer i:arr){
                  System.out.println(i+"~");
		   }
		   list.set(2,200);
		   System.out.println();
		   for(Integer i:arr){
                    System.out.println(i+"~");
		   }*/
	
		   //case 3
		  /*list.add(11);
		   list.remove(52);
		   System.out.println(list.contains(52));*/
	}
}
/*in asList() arrays and the List are the backedList and the changes in list will reflect in array so we can not call the methods like add and remove
that  will modify the list*/
//UnSupportedException Throws.