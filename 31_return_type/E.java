class E{
	public static void main(String[] args){
             byte b=2;
			 short s=20;
			 char c='a';
			 int i =123;

			 long l=123435L;
			 float f=2.45f;
			 double d=45.67;

			 boolean bol=true;
             //case 1----OK
			 //int x=b;
			 //int x=s;
			// int x=c;

			//case 2---oK
			//int x=(int)l;
           // int x=(int)f;
			//  int x=(int)d;

			//case 3---NOT OKK
			//int x=bol;
			//int x=(int)bol;
	}
}
//in case 1 we can directly assign the value to the int becoz byte,short,char are smaller type than int
//in case 2 we have to type cast it into int
//in case u never assign it even agter type casting.