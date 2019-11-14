import java.io.File;

class D{
	public static void main(String[] args){
             File f=new File("abc.txt");
			 //case 1
			 //System.out.println(f);

			 //case 2
			// System.out.println("#######"+f.getAbsolutePath());
			
			//case 3
			//File f2=f.getAbsoluteFile();
			//System.out.println("~~~~~~"+f2);

			//case 4
				//File f2=f.getAbsoluteFile();
             //System.out.println(f==f2);
	}
}
/*case 1--generally any obj ref variable will return classname@hexcode but here toString in file class is overwrite in such a way 
that it returns filepath*/

/*case 2--here we call getAbsolutePath() on current relative file name it will return String in the form of Absolute file path */

/*case 3--here we call getAbsoluteFile() on current relative file path which returns a new file class object which stores the 
absolute path of that file*/

/*case 4 is to prove that  the file which we form is different from the file created b the method getAbsolute file if different ... 
as there ref code is different*/