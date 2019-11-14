class  Student extends Pen { 
	public static void main(String[] args){
		Pen p=new Pen();
	  p.write();
	}
}
class  Pen{
	void write(){
	     System.out.println("hello world");
	}
}
//even if u inherit the parent class but u can still free to make the object ref var of parent class