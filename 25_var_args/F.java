class F{
	public static void main(String[] args){
              //abc();
			 // abc(11);
			 // abc(11,12,13);
			//  abc(new int[]{11,12,13,14});
	}
	static void abc(int...x){
           //System.out.println(x);
		   System.out.println(x.length);
	}
}
/* here on printing x  we will get the ref code*/
/* similar to array in var_args there is length property which returns the no of elements  in var_args*/