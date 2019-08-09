class S{
	public static void main(String[] args){
	     String s="mohan12   _ --@#$45\n\u00af";

		 String[] t=s.split("\\d\\d");
          System.out.println(s);

		  for(String str:t){
                  System.out.println(str);         
		  }
	}
}
//all these example show the use of regex....regex is a lang based on special symbol ....in regex \d means any no from 0-9.