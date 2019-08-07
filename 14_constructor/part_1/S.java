class X{
	X(){
          System.out.println("X()");
	}
	X(float f){
		this();
          System.out.println("X(float f)");
	}
}
class S extends X{
	S(){
		this(13);
          System.out.println("S()");
	}
	S(int i){
		super(2.3f);
          System.out.println("S(int i)");
	}
	public static void main(String[] args){
          S w = new S(12);
		  System.out.println("main()");
	}
}