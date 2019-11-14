import java.io.File;

class K{
	public static void main(String[] args){
           File f=new File("abc");
		   String[ ] arr=f.list();
		   
		   for(int i=0;i<arr.length;i++){  //instead of this u can also use the enhanced for loop.
		   System.out.println(arr[i]);
		   }
	}
}
/*here we are reading all files and folders that are creating inside the existing folder by calling a method list() which returns 
the array of files and folder*/