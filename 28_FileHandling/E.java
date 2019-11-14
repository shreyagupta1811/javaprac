import java.io.File;
import java.io.IOException;

class E{
	public static void main(String[] args){
		File f=new File("abc.txt");

	  System.out.println(f.exists());
	  try{
	  System.out.println(f.createNewFile());
	  }catch(IOException e){
                e.printStackTrace();
	  }
	  System.out.println(f.exists());
	}
}
/*here in this we are calling another method createNewFile having return type boolean ...the task of this method  is if the
file is not exist it return true and create the file....but if file is already created than it returns false and no new file of that
name is created*/