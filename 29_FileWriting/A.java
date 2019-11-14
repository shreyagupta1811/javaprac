import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class A{
	public static void main(String[] args){
            File f=new File("abc.txt");
               try{
                        FileWriter fw=new FileWriter(f);
			   }catch(IOException e){
                       e.printStackTrace();
			   }
			
	}
}
/*point 1---here we are using the one parametrized constructor of FileWriter class in which we have to pass File object. thats 
why import File class*/
/*point 2----as we are using FileWriter class so its constructor call*/
/*point 3-----FileWriter class constructor through IOException so we have to declare it in try catcg block and import IOException*/
/*point 4-----if the  parsed file object having file path that does not exist than FileWriter constructor make this file in the same folder
where existing folder runs*/