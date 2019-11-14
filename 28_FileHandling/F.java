import java.io.File;

class F{
	public static void main(String[] args){
            File f=new File("mno");

			System.out.println(f.exists());
			System.out.println(f.mkdir());
			System.out.println(f.exists());
	}
}
//this work in a similar way as the createNewFile() work for a file similarly this mkdirs works for a folder