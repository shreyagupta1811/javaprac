import java.util.*;

class B{
	public static void main(String[] args){
            ArrayList<Integer> list=new ArrayList<Integer>();

			list.add(34);
			list.add(12);
			list.add(78);

			//case 3
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext()){
                 Integer i=itr.next();
				 System.out.println(i+"-");
             
			 //case 2
			/* Iterator itr=list.iterator();
			while(itr.hasNext()){
                 Integer i=(Integer)itr.next();
				 System.out.println(i+"-");*/
			
             //case 1
			/*Iterator itr=list.iterator();
			while(itr.hasNext()){
                 Integer i=itr.next();
				 System.out.println(i+"-");*/
			}
		}
}
//case 1---Object can not be converted to String.