abstract class W{
         int y=19;
		 W(){
                System.out.println("constructor in W class");
		 }
}
class S extends W{
	public static void main(String[] args){
		//case 1
            //W t = new W();

			//case 2
			//S x = new S();
			//System.out.println(x.y);
	}
}
//main point is that costructor of abstract class can not be called .