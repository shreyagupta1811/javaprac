import java.io.FileWriter;
import java.io.IOException;

class K{
	public static void main(String[] args) throws IOException{
		//case 1
         //FileWriter fw=new FileWriter("cde.txt");
         //case 2
           //FileWriter fw=new FileWriter("cde.txt",true);
           //case 3
		   // FileWriter fw=new FileWriter("cde.txt",false);//it will behave as case 1
          fw.write("suryaveer");
		  fw.close();
	}
}
//case 1----in FileWriter() constructor if u change value of in write it will overwrite
/*case 2----but the two parametrized constructor of file write class if we pass true than the new string will we add at the end of 
the first string instead of adding from first alphabet.FileWriter(String pathname, )boolean append*/