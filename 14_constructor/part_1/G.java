class G{
	int y=90;
	G(){
		//case 1
       this. y=99;

	   int y=20;  //this is a local variable of a constructor co-incidently it was same as the instance variable of a class
	   System.out.println(y);
	}
	public static void main(String[] args){
          G g=new G();
		  System.out.println(g.y);
		    
	}
}