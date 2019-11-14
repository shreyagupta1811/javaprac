import java.io.FileWriter;
import java.io.IOException;

class J{
	public static void main(String[] args) throws IOException{
            FileWriter fw=new FileWriter("wxy.txt");

			char[ ] arr={'A','i','s','h','w','a','r','y','a'};
			fw.write(arr);

			fw.close();
	}
}