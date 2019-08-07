interface X{
	/*final static*/ int a=10;
}
class M implements X{
	public static void main(String[] args){
         System.out.println(a);
	}
}
//in interface variables are by default static and final
//here becoz variable is called directly in main mehod without dot operator