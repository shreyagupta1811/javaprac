import java.util.ArrayList;

class X{
	public static void main(String[] args){
		ArrayList list = new ArrayList();

		list.add("mohan");
		list.add("sohan");
		list.add("rohan");
		list.add("gohan");
		list.add("tohan");		
		
		System.out.println(list);
		
		int len = list.size(); 
		for(int i=0;i<list.size();i++){
			System.out.println(list.remove(0));
		}

		System.out.println(list);
	}
}
/*here on using size in for loop not all the elemnets remove becoz size decrease every time whwn the Arraylist srink on 
deletion of elements*/