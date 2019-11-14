//serializable
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class A{
	public static void main(String[] args){
		  Shape s=new Shape(10,11,12);
           File f=new File("abc.txt");
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
//this is the code of serialization in which we convert the object of shape class into abc.txt fine 