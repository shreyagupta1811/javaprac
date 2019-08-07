final class Z{
	void pro(){
		System.out.println("pro() in Z");
	}
}

class W extends Z{
  /*void pro(){
		System.out.println("pro in W");
	}*/
}

class D{
	public static void main(String[] args){
		W x = new W();
		x.pro();
	}
}
//u can't inherit final class and pro() not ovverride in W
