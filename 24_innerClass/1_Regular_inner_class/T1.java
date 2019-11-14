class T1{
	protected class X{

	}

	public static void main(String[] args){
        X x=new T1().new X();
	}
}
/*we know that on class we can only mark as default and public access modifier but inner class is a member of any class so we can 
mark it as protected*/