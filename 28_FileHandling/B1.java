import java.io.File;

class B1{
	public static void main(String[] args){
           File f=new File("abc.txt");
		   System.out.println(f.exists());
	}
}
//here we form abc.txt file in same folder where this B1 exist than call exists it returns true result.