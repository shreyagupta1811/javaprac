import java.io.*;
class Y1{
	public static void main(String[] args){
           try{
				throw new lowBalanceException();
		   }catch(Throwable e){
                  e.printStackTrace();
		   }
	}
}
class lowBalanceException extends Throwable{

}
/*here we establish relation between lowbalanceexception class and throwable class so now its okk*/
