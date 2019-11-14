import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;

class H{
	public static void main(String[] args){
           try{
                  FileReader fr=new FileReader("mohan.txt");
				  BufferedReader br=new BufferedReader(fr);

				  String str=null;
				  while((str=br.readLine())!=null){
                          System.out.println(str+"~");
				  }
				  fr.close();
				  br.close();
		   }catch(FileNotFoundException e){
                    e.printStackTrace();
		   }catch(IOException e){
                   e.printStackTrace();
		   }
	}
}
/*here we are starting a new class of Reader class that ts BufferedReader class inside which we observe one constructor
BufferedReader(Reader obj) which does not throw any exception and one new mthod called readLine() which returns the string and 
read the String of one line without reading the terminator else return null.*/