//case 1(sir code)
/*class X{
	private X(){

	}
	X(int a){
           this();
	}
}
class F{
	public static void main(String[] args){
	      X x = new X(11);
	}
}*/
//this is a valid method to call the private constructor of a class but it has no significance

//case 2
/*class X{
	private X(){

	}
	X(int a){
           this();
	}
}
class F extends X{
	F(){
         super(10);
	}
	public static void main(String[] args){
	      F x = new F();
		  
	}
}*/