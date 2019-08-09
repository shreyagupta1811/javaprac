import java.io.*;
//case 3
/*class W{
	public static void main(String[] args)throws FileNotFoundException {
		File f = new File("abc.txt");
         FileReader a=new FileReader(f);
		System.out.println("----1");
	}
}*/

//case 2
/*class W{
	public static void main(String[] args){
         File f=new File("abc.txt");
		 try{
		 FileReader  a =new FileReader(f);
		 }catch(FileNotFoundException e){
                 e.printStackTrace();
			 //  System.out.println(e.getMessage());
		 }

		 System.out.println("~~~~~~~~~~1");
	}
}*/

//case 1
/*
class W{
	public static void main(String[] args){
         File f=new File("abc.txt");
		 FileReader  a =new FileReader(f);

		 System.out.println("~~~~~~~~~~1");
	}
}*/
/*according to java if there is any problem occuring in yopur program which belongs to the category of checked exception then
compiler checks  u must have to handle it or if (u are not capable to handle it thanm now declare it using throws keyword in the 
signature of main method*/
