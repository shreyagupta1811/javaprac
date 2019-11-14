class Student{
	private String name;
	private int age;

	public void setName(String name){
		//logic of validation later on proceed
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
class C{
	public static void main(String[] args){
			Student s = new Student();
					s.setName("moh@n");
					System.out.println(s.getName());
					s.setAge(24);
					System.out.println(s.getAge());
	}
}