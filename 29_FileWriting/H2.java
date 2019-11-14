import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class H2{
	public static void main(String[] args) throws IOException{
		try{
			File f=new File("gohan.txt");
            PrintWriter pw=new PrintWriter(f);

		   pw.println("hii how are you");
		   pw.println("i hope u will be fine");

		   pw.flush();
		   pw.close();
	    }catch(FileNotFoundException e){
                e.printStackTrace();
		}
	}
}
//here we are using the PrintWriter(File file)object parametrized constructor.