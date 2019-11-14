import java.io.PrintWriter;
import java.io.FileNotFoundException;

class I{
	public static void main(String[] args){
		try{
                 PrintWriter pw=new PrintWriter("karthik.txt");

				 //difference between print and write() of PrintWriter class
				 //case 1
				// pw.write(true);
				 //pw.write(45.8);
                   
				  //case 2
				  //pw.println(true);
                  //pw.println(false);
                   //pw.println(56.8);

				 pw.flush();
				 pw.close();
		}catch(FileNotFoundException e){
               e.printStackTrace();
		}
	}
}
/*here write() is only for char and String parametrized so we can not pass the Boolean and float etc value but we have print() 
or println() method for boolean or float parametrized.*/