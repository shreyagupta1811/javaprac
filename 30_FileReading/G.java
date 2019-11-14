import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;

class G{
	public static void main(String[] args) {
		try{
               FileReader fr=new FileReader("ijk.txt");
			   char[ ] arr=new char[10];
			   int x=0;
			   while((x=fr.read(arr))!=-1){
                     for(char ch:arr){
                          System.out.print(ch);
					 }
					 //**************************************
					 Arrays.fill(arr,'\0');
					 //************************************
			   }
		}catch(FileNotFoundException e){
              e.printStackTrace();
		}catch(IOException e){
              e.printStackTrace();
		}
	}
}
/*here to ovoid the extra words at the end of the readed character we use the static method of Arrays class of util package named as
static void fill(char[ ],char val)*/