import java.io.*;

class S{
	public static void main(String[] args){
		   A a=new A();
          File f=new File("a.txt");
		  try{
                  FileOutputStream fos=new FileOutputStream(f);
				  ObjectOutputStream oos=new ObjectOutputStream(fos);
                   oos.writeObject(a);
		  }catch(FileNotFoundException e){
                  e.printStackTrace();
		  }catch(IOException e){
                 e.printStackTrace();
		  }
	}
}