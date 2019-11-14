import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class D{
	public static void main(String[] args){
           try{
		           FileReader fr=new FileReader("xyz.txt");

				  int ch=fr.read();
				   while(ch!=-1){
                           System.out.println((char)ch);
						     ch=fr.read();
				   }
		   }catch(FileNotFoundException e){
                   e.printStackTrace();
		   }catch(IOException e){
                   e.printStackTrace();
		   }
	}
}
//instead o reading one by one chararacter we can directly used a while loop to read all the character.