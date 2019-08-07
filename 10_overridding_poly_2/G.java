//case 1(legal return type)
/*class A{
	void pro(){

	}
}
class B extends A{
       void pro(){

	   }
}*/

//case 2(illegal return type)
class A{
	void  pro(){
	}
}
class B extends A{
	int pro(){
     return 0;
	}
}

