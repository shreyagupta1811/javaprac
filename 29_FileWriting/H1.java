import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class H1{
	public static void main(String[] args) throws IOException{
		try{
			FileWriter fw=new FileWriter("tohan.txt");
            PrintWriter pw=new PrintWriter(fw);

		   pw.println("hii how are you");
		   pw.println("i hope u will be fine");

		   pw.flush();
		   pw.close();
	    }catch(FileNotFoundException e){
                e.printStackTrace();
		}
	}
}
//here we are using the PrintWriter(Writer obj)object parametrized constructor.