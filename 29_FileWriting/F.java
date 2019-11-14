import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class F{
	public static void main(String[] args) throws  IOException{
             FileWriter fw=new FileWriter("mohan.txt");
			 BufferedWriter bw=new BufferedWriter(fw);

			 bw.write("vikram is a good boy but  \n sometimes he behave rudely");
			 bw.flush();
			 bw.close();
	}
}
//here we are using \n for new line but it doesnt work 