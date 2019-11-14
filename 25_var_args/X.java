class X{
	static void abc(float...f){
               System.out.println("var-args of float");
	} 
	static void abc(float[] f){
               System.out.println("array of float");
	}
	public static void main(String[] args){
             abc(1.34f,4.5f,6,98f);
	}
}
//compilation fail
/* according to compiler the program should write one at a time either vet-args or arrau*/