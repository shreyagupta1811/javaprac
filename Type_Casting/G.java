class G{
	public static void main(String[] args){
		//case1
        // byte b=12;
		// byte b='A'; //though it is narrowing conversion but ASCAI value is within the range of byte so type castiong is excempted
		
		//casec2
		//byte b='a'+'a';  //addition of ASCAI value of 2 ais greater than the range of byte so hee type casting is requires.
	    //byte b='A'+'A';
		//short s='A'+'A';

		//case 3   ------NOT OK---------
		/*byte b=1;
		short s='A'+b;*/

         //case 4  -----------OK----------
		/*byte b=1;
		short s='A'+1;*/
	}
}