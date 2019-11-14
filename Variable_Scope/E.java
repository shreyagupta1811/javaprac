class E{
	public static void main(String[] args){
          int y=5;
          abc();
	}
	 static void abc(){
         System.out.println(y);
	 }
} 
/*here we declare loacal variable y inside main method and we accesing it in abc() where y is out of scope becoz when the call of 
abc() resumes mainmethod() is hault and all its variable is out of scope so no y variable found*/