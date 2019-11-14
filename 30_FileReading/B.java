import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class B{
	public static void main(String[] args){
             File f=new File("abc.txt");
		   try{
		           FileReader fr=new FileReader(f);

				   int ch1= fr.read();
				   System.out.println((char)ch1);
				     int ch2= fr.read();
				   System.out.println((char)ch2);
				     int ch3= fr.read();
				   System.out.println((char)ch3);
				     int ch4= fr.read();
				   System.out.println((char)ch4);
				     int ch5= fr.read();
				   System.out.println((char)ch5);
				     int ch6= fr.read();
				   System.out.println((char)ch6);
				    
				   fr.close();
		   }catch(FileNotFoundException e){
                 e.printStackTrace();
		   }
		   catch(IOException e){
                  e.printStackTrace();
		   }
	}
}
/*here we are using the FileReader(File obj ) parametrized constructor*/
/*here we use the read() that return the int .this method read the character as integer from 0 to 65535 but here
we typecaste it into char */