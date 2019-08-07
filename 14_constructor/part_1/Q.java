//case1
/*class Q{
	Q(){
           this(true);
		   super();
	}
	Q(boolean b){

	}
}*/
//super may be the first statement of any constructor

//case 2
/*class Q{
	Q(){
            super();
		   this(true);
		  
	}
	Q(boolean b){

	}
}*/
//this may be the first line of the constructor

//case 3
/*class Q{
	Q(){
          super();               this(true);
	}
	Q(boolean b){

	}
}*/
//illegal way of writting