//serializable
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class A{
	public static void main(String[] args){
		City c=new City("jabalpur");
		State s =new State("MP");
		Address a=new Address(c,s);
		 Student st=new Student("mohan",12,a);
           File f=new File("bcd.txt");
		   try{
						FileOutputStream fos=new FileOutputStream(f);
					   ObjectOutputStream oos=new ObjectOutputStream(fos);
					   oos.writeObject(st);
		         }catch(FileNotFoundException e){
                         e.printStackTrace();
				 }catch(IOException e){
                          e.printStackTrace();
				 }
	}
}
//this is the code of serialization in which we convert the object of shape class into abc.txt fine 
