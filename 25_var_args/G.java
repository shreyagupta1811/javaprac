class G{
	public static void main(String[] args){
        //  abc();
		  //abc(11);
		  //abc(11,12,13);
		  abc(new int[] {11,12,13,14});
	}
	static void abc(int...x){
         /*
		for(int temp:x){
                 System.out.println(temp);
		}*/

        /* for(int i=0;i<x.length;i++){
                   System.out.println(x[i]);
		 }*/
	}
}
/*here we are itterating on no of elements og var_args*/