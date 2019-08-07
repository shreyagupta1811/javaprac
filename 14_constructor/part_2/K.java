class K{
	static int count=0;
	K(){
         count++;
	}
	public static void main(String[] args){
              K a1= new K();
			  K a2= new K();
			   K a3=new K();
			  K  a4=new K();

			  System.out.println(count);
			  System.out.println(count);
			  System.out.println(count);
			  System.out.println(count);
	}
}
//here 4 times you get 4 by print statement as your count increase every time when your call the constructor