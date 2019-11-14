import java.io.PrintWriter;
import java.io.IOException;

class J1{
	public static void main(String[] args) throws IOException{
            PrintWriter pw=new PrintWriter("lmn.txt");

			char[ ] arr={'A','i','s','h','w','a','r','y','a'};
			pw.write(arr);

			pw.close();
	}
}
//writ(char[ ] c) array parametrized method of PrintWriter class.