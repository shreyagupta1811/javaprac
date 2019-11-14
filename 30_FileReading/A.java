import java.io.FileReader;
import java.io.FileNotFoundException;

class A{
	public static void main(String[] args){
             try{
                     FileReader fr=new FileReader("Afile.txt");
			 }catch(FileNotFoundException e){
                      e.printStackTrace();
			 }
	}
}
/*here we are calling the FileReader(String pathname) constructor it throws the FileNotFoundException if the parsed file does 
not exists and if present than successfully compile*/