import java.util.ArrayList;
class E{
	public static void main(String[] args){
          ArrayList a=new ArrayList();
		  a.add(10);
		  a.add(20);
		  a.add(30);
		  a.add(40);
		  a.add(50);
		  System.out.println(a);
		  //System.out.println(a.remove(30));
		   System.out.println(a);
	}
}
/*here case 2 and 3 are same the only difference is in coding pattern in case  firsty we make object of integer class thamn parse it and 
in case 3 we directly pass ...............but the diff in case 1 and case 2 is that if we directly pass the integer in remove method it take it as
index parameterized remove() so we have to pass object to call remove(object parametrized)*/