import java.util.ArrayList;
class V{
	public static void main(String[] args){
              ArrayList a=new ArrayList();
			 a.add("mohan");
			 a.add("sohan");
			 a.add("rohan");
			 a.add("gohan");
			 a.add("tohan");

			 for(int i=0;i<a.size();i++){
                        System.out.println(a.remove(i));
			 }
	}
}
/*here we call remove method on the arraylist for i=0 0th element remove that is mohan and the reindexing done */
//here on each ittertion the value of size decrease .
