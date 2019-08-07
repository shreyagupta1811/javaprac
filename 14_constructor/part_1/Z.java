class X{
           X(float e){
	     System.out.println("X()");		      
	}
}
class Z extends X{
	public static void main(String[] args){
            System.out.println("main------start");
             Z i = new Z();
			System.out.println("main------ends");
	}
}
//the main point of this code is that we call no parameterized constructor but in parent class there is a constructor 
//of float parameterized

