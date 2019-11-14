class E{
	static void pro(byte b){
           System.out.println(b);
	}
	public static void main(String[] args){
		int a=2;
		//case 1   ---------NOT OK--------
         /*pro(a);*/

		 //case 2   ----------NOT OK--------
		// pro(2);

		//case 3   ----------OK---------
		//pro((byte)2);
		
		//case 4    ---------OK----------
		//pro((byte)a);
	}
}
/*the main point is that the law we discussed is only valid for assignment by using = but here we are passing int constant or variable through 
argumnet so here we must have to typecast there is no excemption by java for all the three case (byte ,short,char)*/