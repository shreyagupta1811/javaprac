import java.io.FileWriter;
import java.io.IOException;

class A1{
	public static void main(String[ ] args){
		try{
           FileWriter fw=new FileWriter("mno.txt");
	      }catch(IOException e){
               e.printStackTrace();
		  }
	}
}
/*here we are using another single parametrized constructor FILeWriter(String pathname) ig the parsed file path does not exist than 
FileWriter constructor create this file*/