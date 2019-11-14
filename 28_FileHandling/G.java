import java.io.File;

class G{
	public static void main(String[] args){
           File f=new File("abc/xyz");
            //case 1
           //System.out.println(f.mkdir());
			//case 2
			//System.out.println(f.mkdirs());
	}
}
/*here we are parsing a folder path xyz which is inside the abc folder ....mkdir() can not form folder inside the folder but 
we have another method in API called mkdirs() which can form folder inside another folder*/ 