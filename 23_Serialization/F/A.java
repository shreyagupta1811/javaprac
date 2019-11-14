import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class A{
	public static void main(String[] args){
           Student s=new Student();
		   s.name="Rajesh";
		   s.age=20;
		   s.branch="Civil";
		   s.degree="BE";
		   s.sem="5th";
		   File f=new File("e.txt");
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