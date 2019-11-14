class B{
	public static void main(String[] args){
         //char x='A';
         // char x='a';
		  //char x='7';
		  //char x='$';
           
		   //-------NOT OK---------
		  //char x='ab';
		  
		  //char x=' ' ';   
		   //char x='\'';

		  //char x='\';
           //char x='\\';

		   //char x='\u6562';

		   //char x=0;
		   //char x=68;
		   //char x=97;
           //char x=65535;
           //char x=65336;  //------NOT ok----

//escape sequence allows u to write 3 digit octal no corresponding to this there is one char.
			//char x='\127';
			//char x='\12';
			//char x='\1';
			//char x='\1273';          //this was out of range here only 3 digit no is allowed

//we can also assign a char value to int variable it will print the ascai value corresponding to that char.
			//int x='A';
		      // int x='a';
		  System.out.println(x);
	}
}