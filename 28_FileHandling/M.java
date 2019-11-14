import java.io.File;

class M{
	public static void main(String[] args){
            File f=new File("abc");

			System.out.println(f.exists());
		    System.out.println(f.delete());
	         System.out.println(f.exists());
	}
}
/*here on calling delete() on  the folder abc does not delete becoz inside this abc folder there is many such files and folder ...
before deleting folder abc we have to delete inside file and folder using delete() recursively*/