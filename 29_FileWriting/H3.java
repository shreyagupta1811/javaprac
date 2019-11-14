import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class H3{
	public static void main(String[] args) throws IOException{
		try{
			FileWriter fw=new FileWriter("shreya.txt");
            PrintWriter pw=new PrintWriter(fw);
           //case 1
		   //pw.print("hii how are you");
		   //pw.print("i hope u will be fine");
		   //case 2
		   /*pw.print(34);
		   pw.print(65);*/

		   pw.flush();
		   pw.close();
	    }catch(FileNotFoundException e){
                e.printStackTrace();
		}
	}
}
//here we are using the print() that will print the other line in the same line .
