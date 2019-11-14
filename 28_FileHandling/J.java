import java.io.File;

class J{
	public static void main(String[] args){
            File f=new File("abc/xyz/dinesh.txt");

			System.out.println(f.delete());
			System.out.println(f.exists());
	}
}
//here  we are calling a delete() which is used to delete an existing file.