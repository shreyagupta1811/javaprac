class B{
	public static void main(String[] args){
            //case 1
			/*byte b=20;
			System.out.println(b);*/

			//case 2
			/*short s=200;
			System.out.println(s);*/

			//case 3
			/*char c=2000;
			System.out.println(c);*/

			//case 4   --------CLAWS OF THIS LAW----------
			/*int a=2;
			byte b=a;
			System.out.println(b);*/

			//case 5   -----SOLUTION OF CASE4----------
			/*int a=2;
			byte b=(byte)a;
			System.out.println(b);*/

			//case 6   ------INVALID CASE (becoz the value assign is out of range of bye data type)---------------------
			/*byte b=200;
			System.out.println(b);*/

			//case 7
			/*byte b=(byte)200;
			System.out.println(b);*/
	}
}
//the main point of this program is the law which is used here is valid with its two condition-
/*1.the value assign must be in the range.
2.it must be a integer constat.*/