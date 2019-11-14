import java.util.ArrayList;
class G{
	public static void main(String[] args){
          ArrayList a=new ArrayList();
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40);
		  a.add(50);
		  System.out.println(a);
		  System.out.println(a.remove(new Integer(100)));
            System.out.println(a);
	}
}
//here we pass the value inside the remove method we does not exist so it return false. 