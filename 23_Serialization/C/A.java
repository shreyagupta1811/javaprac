import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class A{
	public static void main(String[] args){
           Student s=new Student("ganesh",12,"CS","Btech","5th");
		  /* s.name="ganesh";
		   s.age=15;
		   s.branch="CS";
		   s.degree="Btech";
		   s.sem="5th";*/
		   File f=new File("mno.txt");
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