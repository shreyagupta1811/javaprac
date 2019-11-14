//deserializable
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class B{
	public static void main(String[] args){
           File f=new File("bcd.txt");
		   try{
						FileInputStream fis=new FileInputStream(f);
					   ObjectInputStream ois=new ObjectInputStream(fis);
					   Student s=(Student)ois.readObject();

					   System.out.println("Name:"+s.name+"......Age"+s.age+".......city"+s.address.city.cityName+".....State:"+s.address.state.stateName);
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