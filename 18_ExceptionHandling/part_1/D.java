 class D{
	 public static void main(String[] args){
           System.out.println("~~~~~~~~~~1");

            int val=Integer.parseInt("12a");
              System.out.println(val);

		   System.out.println("~~~~~~~~~~2");
	 }
 }
 /*parse is a static method of wrapper class Integer on which we can pass any string but that string must be a numeric and it return 
 that numeric  string into primitive int ,so return type is int.....if u pass any invalid string in the argument than we have to 
 experience a runtime exception  called NumberFormatException.*/