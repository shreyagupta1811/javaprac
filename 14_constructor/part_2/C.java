class C{
	C(){
           this(2);
	}
	C(int a){
          this();
	}
}
//this is recursive call of two constructor to each other and it will run infinite times.