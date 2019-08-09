class X{
	X(){
             System.out.println("X() in class X");
	}
	static{
               System.out.println("static block of class X");
	}
	{
               System.out.println("instance block of class X");
	}
}
class G extends X{
	G(){
            System.out.println("G() in class G");
	}
	static{
              System.out.println("static block in class G");
	}
	{
                System.out.println("instance block of class G");
	}
	public static void main(String[] args){
          System.out.println("main starts~~~~~~~~~");
                    G g = new G();
		    System.out.println("main ends~~~~~~~~~");
	}
}
//the two main point of this program about the initialization block are following-
//instance code block execute when the constructor call
//sratic code block execute when main class load