import java.io.FileWriter;
import java.io.IOException;

class B{
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

			}catch(IOException e){
                  e.printStackTrace();
			}
	}
}
/*here we are calling FileWriter constructor that ceate a xyz txt file than we call a write method that is single character parametrized
write(character) but on compilation we observe that xyz file created but inside it the character does not print but they are weitten in 
buffer*/