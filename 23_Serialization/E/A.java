import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class A{
    public static void main(String[] args){
	       Student s=new Student("vikram",20);
		   File f=new File("d.txt");
		   try{
                   FileOutputStream fos=new FileOutputStream(f);
				   ObjectOutputStream oos=new ObjectOutputStream(fos);
				   oos.writeObject(s);
		   }catch(FileNotFoundException e){
                    e.printStackTrace();
		   }catch(IOException e){
                     e.printStackTrace();
		   }
	}
}