class R{
	char c='A';
}
class Q extends R{
	float  e=1.22f;
}
	class L extends Q{
		int x;
		public static void main(String[] args){
             L l =new L();
			  System.out.println(l.c);
			  System.out.println(l.e);
			  System.out.println(l.x);
		}
	}