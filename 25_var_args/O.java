class O{
	public static void main(String... args){
          byte b=12;
		  short s=123;
		  char c='a';
		  int i=1234;
		  long l=324L;
		  float f=2.45f;
		  double d=5.98;

		  int temp1=b;
		  int temp2=s;
		  int temp3=c;
		  int temp4=i;

		  int temp5=(int)l;
		  int temp6=(int)f;
		  int temp=(int)d;
	}
}
//here we are discussing two points
//first we can assign ... in place of []
//we can not assign long ,float,double in int ...due to lossy conversion.