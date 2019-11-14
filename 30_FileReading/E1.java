import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

class E1{
	public static void main(String[] args){
		try{
              FileReader  fr=new FileReader("mno.txt");

			  int ch=fr.read();
			  do{
                    System.out.println((char)ch);
					ch=fr.read();
			  }while(ch!=-1);
	        }catch(FileNotFoundException e){
                   e.printStackTrace();
			}catch(IOException e){
                  e.printStackTrace();
			}
	}
}
//to read all tyhe character together we use do while loop.