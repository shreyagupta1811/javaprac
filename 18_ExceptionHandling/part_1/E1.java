class E1{
	public static void main(String[] args){
          System.out.println("~~~~~~~~~~~~1");
           try{
                   int y=12/0;
				   System.out.println("~~~~~~~~~~~~a");
			}catch(NullPointerException e){
                    System.out.println("AE");
			}
          System.out.println("~~~~~~~~~~~~2");
	}
}
/*if there is not proper Exception in catch block than catch block not run control go to JVM and it give runtimeException*/