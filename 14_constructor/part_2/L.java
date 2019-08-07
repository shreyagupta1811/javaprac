class X{
        X(int y){
               System.out.println(y);
		}
}
class L extends X{
	int e=30;
	L(){
           super(e);
	}
	public static void main(String[] args){
       L z = new L();
	}
}