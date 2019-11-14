class Student{

}
class D{
	public static void main(String[] args){
          Student s=new Student();

		  System.out.println(s.toString());
		  System.out.println(s.hashCode());
		  System.out.println(Integer.toHexString(s.hashCode()));
	}
}
/*here the imp is the new method of wrapper class integer that is toHexString through which we can proove that the toStyring call 
on the object hand the hashcode call on the object are giving the same result*/