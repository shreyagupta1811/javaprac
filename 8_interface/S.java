interface X{
	void pro();
}
class W implements X{
	public void pro(){

	}
}
//case 1(legal code)
/*class S extends W implements X{

}*/

//case 2
/*class S implements X extends W{

}*/

//we can extend and implement any class & interface simultaneously but we must maintain the sequence