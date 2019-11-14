import java.io.PrintWriter;
import java.io.FileNotFoundException;

class H{
	public static void main(String[] args){
		try{
           PrintWriter pw=new PrintWriter("rohan.txt");

		   pw.println("hii how are you");
		   pw.println("i hope u will be fine");

		   pw.flush();
		   pw.close();
	    }catch(FileNotFoundException e){
                e.printStackTrace();
		}
	}
}
//here we are using the PrintWriter(String pathname) constructor.
//and also using the Println() that can print the next statement from new line.