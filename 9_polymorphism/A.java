class A{ }
class B extends A{ }
class C extends B{ }
class E extends B{ }
class D extends C{ }
class test{
	public static void main(String[]  args){
		     //case 1
            // D x = new D();
		      //System.out.println(x);
			  
			  //case 2
			   //C x= new D();
			  //System.out.println(x);
              
			  //case 3
			//  B x = new D();
			  //System.out.println(x);

			  //case 4
			  //A x=new D();
			  //System.out.println(x);

			  //case 5
               //Object x=new D();
			   //System.out.println(x);
                
				//case 6(illegal code gives error)
				//E x= new D();
				//System.out.println(x);

    }
}
//in case 6 u find the error becoz we can assigh a child class object in  parent class variable but here E is neither a parent nor foun in linear 
//inheriitance tree of parent than compile time fail
