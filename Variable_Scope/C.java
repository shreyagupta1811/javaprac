class C{
	public static void main(String[] args){
          try{
                   int i=10;
				   //case 1
				   //System.out.println(i);
		  }catch(NullPointerException e){
                  e.printStackTrace();
				    //case 2
             //System.out.println(i);
		  }
		  //case 3
             //System.out.println(i);
	}
}
/*only case 1 is valid becoz i is local variable of try block and in the scope after that its scope vanish.