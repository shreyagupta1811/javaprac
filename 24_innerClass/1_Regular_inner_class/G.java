class X{
	int a=100;

	void pro(){
         System.out.println("i m in class G");
	}

	class N{

	}
}
class G{
	public static void main(String[] args){
             //System.out.println(a);
			//System.out.println(X.a);

			//pro();
			 //X.pro();

			 //new N();
			 //X.new N();
	}
}
/*all cases are wrong becoz class Name create class context and from class context we can not call instance context*/ 