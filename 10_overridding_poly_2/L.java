//case1
//default access controlled method
/*class A{
	void pro(){

	}
}
class B extends A{
	void pro(){

	}
}*/
//case 2
/*class A{
	void pro(){

	}
}
class B extends A{
	protected void pro(){

	}
}*/

//case 3
/*class A{
	void pro(){

	}
}
class B extends A{
	public void pro(){

	}
}*/

//case 4 (illegal code)
/*class A{
	void pro(){

	}
}
class B extends A{
	private void pro(){

	}
}*/