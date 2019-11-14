class E{
	public static void main(String[] args){
              abc();   //no pamarterized allowed   
			  abc(11);      //one pamarterized allowed   
			  abc(11,12,13,14);      //multiple  pamarterized allowed   
			  abc(new int[] {11,12,13});     //array pamarterized allowed   
	}
	 static void abc(int...x){

	}
}
/* when we pass the var-args (variable arguments) then it can handle no parametrized,one,multiple,and arry parametrized */
//...=[ ]