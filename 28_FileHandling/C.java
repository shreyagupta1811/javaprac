import java.io.File;

class C{
	public static void main(String[] args){
		     //case 1
            // File f=new File("abc.txt");
            //case 2
           File f=new File("mno");

			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
	}
}
/*here we are calling the two methods isDirectory() it returns true if dir found otherwise false similarly isFile() returns True if file exist
and returns false if not exist.*/