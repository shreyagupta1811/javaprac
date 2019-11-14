import java.io.FileWriter;
import java.io.IOException;

class C{
	public static void main(String[] args){
		    try{
                  FileWriter fw=new FileWriter("xyz.txt");

				      fw.write('K');
				      fw.write('a');
				      fw.write('r');
					  fw.write('t');
					  fw.write('h');
					  fw.write('i');
					  fw.write('k');

					  fw.flush();
                       fw.close();
			}catch(IOException e){
                  e.printStackTrace();
			}
	}
}
//on calling this flush() method the written character of buffer will transfer to our parsed file.
//always use close method after a flush becoz our input output libraries are intracted by this native enviroment by calling 
//this close method.
