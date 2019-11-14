import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

class C{
	public static void main(String[] args){
             File f=new File("efg.txt");
		   try{
		           FileReader fr=new FileReader(f);

				   int ch1= fr.read();
				   System.out.println((char)ch1);
				     int ch2= fr.read();
				   System.out.println((char)ch2);
				     int ch3= fr.read();
				   System.out.println((char)ch3);
				     int ch4= fr.read();
				   System.out.println((char)ch4);
				     int ch5= fr.read();
				   System.out.println((char)ch5);
				     int ch6= fr.read();
				   System.out.println((char)ch6);
				   //case 
				     int ch7= fr.read();
				   System.out.println((char)ch7);
				     int ch8= fr.read();
				   System.out.println((char)ch8);
				    
				   fr.close();
		   }catch(FileNotFoundException e){
                 e.printStackTrace();
		   }
		   catch(IOException e){
                  e.printStackTrace();
		   }
	}
}
/*it return -1 if the end of the stream is reached*/ 
//#############DOUBT##############