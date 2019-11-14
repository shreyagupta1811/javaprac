 import java.io.File;

class I{
	public static void main(String[] args){
           File f1=new File("mohan.txt");
		   File f2=new File("abc/xyz/dinesh.txt");

		   System.out.println(f1.renameTo(f2));
	}
}
//renameTo() is so poweful we can transfer the text file in some another empty folder.