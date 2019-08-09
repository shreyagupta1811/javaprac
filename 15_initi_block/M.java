class X{
	int g=100;
}
class M extends X{
	{
         System.out.println(g);
	}
	//int g=200;
	public static void main(String[] args){
         M m = new  M();
	}
}
//main point of the prohgram is that  if instance var of class is below the init block than it gives erroe but if your class doesnot have
//instance var and your parent class have than successfully compile. 
