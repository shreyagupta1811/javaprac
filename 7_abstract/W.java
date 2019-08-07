abstract class W{
	abstract void pro();
}
abstract class Y extends W{
	abstract void mno();
}
class Z extends Y{
	//case 1----error
	/*void mno(){
	
	}*/

	//case 2-----no error
	/*void pro(){

	}
	void mno(){

	}*/

}
//class Z either be an abstract or it define method pro() becoz ultimately it comes when super inherited