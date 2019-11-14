import java.io.File;

class B{
	public static void main(String[] args){
           File f=new File("abc.txt");
		   System.out.println(f.exists());
	}
}
//here we are calling the exists() it return true if there is any such file or folder is made inside the same folder where this B file form....if
//exists return true otherwise returns false.