import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class A{
	public static void main(String[] args){
		   Address add=new Address();
           Student s=new Student("mohan",15,add);
		   File f=new File("pqr.txt");
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