import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class G{
	public static void main(String[] args) throws  IOException{
             FileWriter fw=new FileWriter("mohan.txt");
			 BufferedWriter bw=new BufferedWriter(fw);

			 bw.write("vikram is a good boy but ");
			 bw.newLine();
			 bw.write("sometimes he behave rudely");
			 bw.flush();
			 bw.close();
	}
}
//to change line here we are using a new method newLine().
