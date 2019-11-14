import java.io.File;

class A{
	public static void main(String[] args){
		    System.out.println("~~~~~~~~~~~~~1");
           File f=new File("abc.txt");
		   System.out.println("~~~~~~~~~~~~~2");
	}
}
//here we are using a class File which is inside the Io package and use a String parametrized constructor to make file object.
//this constructor will simply convert the String path into abstract path. 
//here on calling constructor abc text file does not create but the String representation of path will be converted to Absolute path