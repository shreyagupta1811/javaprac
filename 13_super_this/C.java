class X{
	static void pro(){
       System.out.println("pro() in X");
	}
}
class Y extends X{
	static void pro(){
	System.out.println("pro() in Y");
	}
	void abc(){
           pro();
		   this.pro();
		   super.pro();
	}
}
class C{
	public static void main(String[] args){
        Y a=new Y();
		a.abc();
	}
      	
}
//the main point of this program is that when u call an static member (method) of a class through this keyword which is 
//instance member which is not possible so this or super is replkaced by class name internally and the call is completed.