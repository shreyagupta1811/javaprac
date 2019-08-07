class X {
        X(int y){
                System.out.println(y);
		}
}
class N extends X{
	int pro(){
          return 12;
	}
	N(){
         super(pro());
	}
	public static void main(String[] args){
          N n = new N();
		  n.pro();
	}
}
//the point disscused here is that before pro() method comes in stack it will call by the constructor ,so its too early to call it.