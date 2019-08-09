class P4{
	public static void main(String[] args){
           try{
                 int x=12/0;
		   }finally{
                 System.out.println("#############");
		   }finally{
                 System.out.println("@@@@@@@@@@@@");
		   }
	}
}
//this is not valid u can make only one finally block for one try .....here u experience error 
//finally without try for 2nd finally block at line 7.