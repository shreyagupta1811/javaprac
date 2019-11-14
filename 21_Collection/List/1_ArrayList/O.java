import java.util.ArrayList;
import java.util.Iterator;
class O{
	public static void main(String[] args){
               ArrayList a=new ArrayList();
			 a.add("mohan");
			 a.add("sohan");
			a.add("rohan");
			a.add("gohan");
			a.add("tohan");
			Iterator itr= a.iterator();
			while(itr.hasNext()){
                     System.out.println(itr.next());
			}
	}
}
/*iterator is a interface implemented by the collection class ,collection class having method itterator() we is used to itterate on 
the elements of the collection ...itterator iterface having three methosa hasNext(),next() and remove*/
//hasNext method  having return type boolean it return true if there is next elements in the collection
//next method having return type elemnents it return the elements of the collection