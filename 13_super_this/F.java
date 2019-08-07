class F{
	int a=100;
    void pro(){
         int a=200;
		 //case 1(illegal)
		 //System.out.println(f);

		 System.out.println(a);

		 System.out.println(this);

		 System.out.println(this.a);
	}
}
class test{
    public static void main(String[] args){
           F f = new F();
		   //case 1(legal)
		   System.out.println(f);
		   System.out.println(f.a);
		   f.pro();
	}
}
//here the main points are following-
/*firstly u can not print object refrence variable in method becoz at that moment the main method is hault and all the local
variables are out of scope.
but u call call thif local variable of main method through this keyword.becoz this keyword has a relation with f*/.