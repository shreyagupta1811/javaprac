//most imporatant example of the day
class circle{
	 int r; //u can also mark int r as static but its not programitically correct
	 static float pi = 3.14f; //since pi is comman so, mark it as static is valid .
     //case 1(invalid)we can not call a non static variable r from static context
	/*static  void calcArea(){
		System.out.println(pi*r*r);
	}*/

	//case 2(valid)
      void calcArea(){
		System.out.println(pi*r*r);
	}

	static void  defineCircle(){
            System.out.println(" circle is a .........");
	}

	public static void main(String[] args){
	    circle c1 = new circle();
		c1.r=12;

         circle c2= new circle();
		c2.r=15;

        c1.defineCircle();
		c1.calcArea();

		 c2.defineCircle();
		c2.calcArea();
     }
}