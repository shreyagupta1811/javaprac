import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class E{
	public static void main(String[] args){
            File f=new File("pqr.txt");
			try{
                  FileWriter fw=new FileWriter(f);

				  BufferedWriter bw=new BufferedWriter(fw);  //poly assignment chid class FileWriter Object assign instead of Writer class
				  bw.write("mohan is a good boy and he is intellegent");
				  bw.flush();
				  bw.close();
			}catch(IOException e){
                     e.printStackTrace();
			}
	}
}
/*here we are using the Buffered class constructor inside which writer class obj have to be assigned