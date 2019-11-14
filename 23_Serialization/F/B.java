import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

class B{
	public static void main(String[]  args){
              File f=new File("e.txt");
			  try{
							 FileInputStream fis=new FileInputStream(f);
							 ObjectInputStream ois=new ObjectInputStream(fis);
							 Student s=(Student)ois.readObject();

							    System.out.println("Name:  "+s.name);
							    System.out.println("Age: "+s.age);
								System.out.println("Branch: "+s.branch);
							    System.out.println("Semester: "+s.sem);
								System.out.println("Degree: "+s.degree);

                       }catch(ClassNotFoundException e){
                       e.printStackTrace();
			  }catch(FileNotFoundException e){
                        e.printStackTrace();
			  }catch(IOException e){
                        e.printStackTrace();
			  }
	}
}
/*the case where your child class is serializable and the parent class is not serializable than the property of parent class do not serialize
do while (not save in txt file) but on deserialization they act as constructor means they initialize by Default value id not given an explicit 
value otherwise initialize by explicit value.*/