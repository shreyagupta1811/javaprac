import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class F{
	public static void main(String[] args) {
		try{
               FileReader fr=new FileReader("ijk.txt");
			   char[ ] arr=new char[10];
			   int x=0;
			   while((x=fr.read(arr))!=-1){
                     for(char ch:arr){
                          System.out.print(ch);
					 }
			   }
		}catch(FileNotFoundException e){
              e.printStackTrace();
		}catch(IOException e){
              e.printStackTrace();
		}
	}
}
/*here we are using the another overloaded version of read() method of reader class where we have to pass array of character as a 
parameter and it return the read characer and return -1 at the end of the stream reached*/