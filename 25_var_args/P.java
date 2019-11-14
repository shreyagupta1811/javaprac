class P{
	static void pro(int...x){
          for(int a:x){
                 System.out.println(a);
		  }
	}
	public static void main(String...y){
             byte b=12;
			 short s=120;
			 char c='g';
			 int i=1234;
			 long l=3245l;
			 float f=3.67f;
			 double d=7.89;

			 pro(b,s,c,i,(int)l,(int)f,(int)d);
	}
}