class X{
	private X(){

	}
	//case 3
       /*static  X createObject(){
        X a =new X();
            return a;
	}*/

	//case 2
	/*X createObject(){
        X a =new X();
            return a;
	}*/
	
}
class F {
	public static void main(String[] args){
		//case 3
         // X.createObject();

		//case 2
		/*X y =new X();
		y.createObject();*/

		//case1
        X y=new X();
	}
}
//the main point is that the correct way to  call any private constructor is that u can make 
//a static method through which u can call that private constructor .