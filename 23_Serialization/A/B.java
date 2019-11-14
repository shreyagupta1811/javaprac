//deserializable
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class B{
	public static void main(String[] args){
           File f=new File("abc.txt");
		   try{
						FileInputStream fis=new FileInputStream(f);
					   ObjectInputStream ois=new ObjectInputStream(fis);
					   Shape s=(Shape)ois.readObject();

					   System.out.println("length:"+s.l+"bredth"+s.b+"height:"+s.h);
		         }catch(FileNotFoundException e){
                         e.printStackTrace();
				 }catch(IOException e){
                          e.printStackTrace();
				 }catch(ClassNotFoundException e){
                         e.printStackTrace();
				 }
	}
}
//this is the code of deserialization in which we convert the abc.txt file into object of shape class.
//this was  done to save the state of the object.