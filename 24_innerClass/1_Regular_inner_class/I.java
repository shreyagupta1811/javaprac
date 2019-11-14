class X{
	class Y{

	}
}
class I{
	public static void main(String[] args){
            X x=new X();
			//case 1
			//x.new Y();
            
			 //case 2-----not OK
			 //Y y=x.new Y();

			 //case 3
                //X.Y y=x.new Y();
	}
} 
/*the variable in which u store the object of inner class Y can be refrenced */ 