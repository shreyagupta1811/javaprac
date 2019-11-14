import java.io.File;

class H{
	public static void main(String[] args){
           File f1=new File("abc.txt");
           File f2=new File("mohan.txt");

            
		   System.out.println(f1.renameTo(f2));
	}
}
//here we are using another method called renameTo() it will calls in similar way as equals() or compareTo() calls ...it is used to
//rename the existing file . 