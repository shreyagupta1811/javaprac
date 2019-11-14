import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class E{
	public static void main(String[] args){
           try{
				  FileReader fr=new FileReader("pqr.txt");
				  //case 1----2nd way to use the while loop
				   int ch=0;
				  while((ch=fr.read())!=-1){
                          System.out.println((char)ch);
				  }
		   }catch(FileNotFoundException e){
                   e.printStackTrace();
		   }catch(IOException e){
                  e.printStackTrace();
		   }
	}
}