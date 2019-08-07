//case 1
//public access controlled method
/*class A{
	public void pro(){
	
	}
}
class  B extends A{
	public void pro(){
	
	}
}*/
//case 2(illegal code)
/*class A{
	public void pro(){
	
	}
}
class  B extends A{
	protected void pro(){
	
	}
}*/
//we can assign either same or wider access privilage in child class method.