class Circle{
	int radius;
	final static float PI=3.14f;

	void calcArea(){
	     System.out.println(PI *radius*radius);
	}
	public static void main(String[] args){
	    Circle c1 = new Circle();
		c1.radius=12;
		Circle c2 = new Circle();
		c2.radius=15;
		c1.calcArea();
		c2.calcArea();
		
	}
}