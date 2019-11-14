class L{
	static int a=10;
	public static void main(String[] args){
            if(12<15){
				     int a=20;
                     System.out.println(a+"~~~~~~~");
			}
	}
}
/*here they is no prblem arise regarding the two variable declarartion a becoz first a is a class class variable it get the memory in class 
class object in a heap and other get memory in main() in a stack so no clash occur*/