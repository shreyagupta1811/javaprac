import java.io.*;

class D{
	public static void main(String[] args){
          File f=new File("a.txt");
		  try{
			  FileInputStream fis=new FileInputStream (f);
               ObjectInputStream ois=new ObjectInputStream(fis);
			   A x=(A)ois.readObject();

			   System.out.println(x.a);
			   System.out.println(x.b);
		  }catch(ClassNotFoundException e){
                     e.printStackTrace();
	       }catch(FileNotFoundException e){
                     e.printStackTrace();
         	}catch(IOException e){
                    e.printStackTrace();
     	}
	}
}