//deserializable
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

class B{
	public static void main(String[] args){
           File f=new File("mno.txt");
		   try{
						FileInputStream fis=new FileInputStream(f);
					   ObjectInputStream ois=new ObjectInputStream(fis);
					  Student s=(Student)ois.readObject();

					        System.out.println("Name-"+s.name);
					        System.out.println("age-"+s.age);
						    System.out.println("branch-"+s.branch);
							System.out.println("Semester-"+s.sem);
							System.out.println("degree-"+s.degree);
		         }catch(FileNotFoundException e){
                         e.printStackTrace();
				 }catch(IOException e){
                          e.printStackTrace();
				 }catch(ClassNotFoundException e){
                         e.printStackTrace();
				 }
	}
}
/*  here the non serializable parent class is not initialize by explicit value so they initialize by the default value 0 or null as in case of 
constructor*/