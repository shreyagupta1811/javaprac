class I{
	static{
           System.out.println("static init blocl---------------A");
	}
	static{
             System.out.println("static init block--------------------B");
	}
	static{
             System.out.println("static init block ------------------C");
	}
	public static void main(String[] args){
           System.out.println("inside the main method");
	}
}
//the main point of this method is that the sequence in which the static iniot block written will execute in the same sequence