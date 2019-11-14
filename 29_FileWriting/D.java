import java.io.FileWriter;
import java.io.IOException;

class D{
	public static void main(String[] args){
            try{
			        FileWriter fw=new FileWriter("ijk.txt");

					fw.write("my favorite food is pizza");
					fw.close();
			}catch(IOException e){
                   e.printStackTrace();
			}
	}
}
/*here we are using a write(String parametrized) and one more thing here without calling flush we diectly call the close() and 
observe that the file form having the String written */
//this is becoz close method first call flush than close.
//but is we do not want to close the file and only write it than we call flush
//but if we want to write and than close simultaneously we call the close().