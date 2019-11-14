import java.io.File;

class L{
	public static void main(String[] args){
		//case A----here we are using two parametrized constructor File(String parent,String child)
          /*
		//case 1
          //File f=new File("E:/my_java/java_prac/28_FileHandling/myFolder/currentFolder/shreya.txt");
		 //case 2
		 //File f=new File("E:/my_java/java_prac/28_FileHandling","myFolder/currentFolder/shreya.txt");
		   //case 3
          // File f=new File("E:/my_java/java_prac/28_FileHandling/myFolder/currentFolder","shreya.txt");
		   System.out.println(f.exists());
		   */

		   //case B---here we are using one more two parametrized constructor File(File parent,String child)
		   /*File f1=new File("E:/my_java/java_prac/28_FileHandling");
		   File f2=new File(f1,"old");

		   System.out.println(f2.exists());*/
	}
}
//here we are using two more constructor of file class.