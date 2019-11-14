import java.io.*;

class A{
	public static void main(String[] args) throws IOException{
            Student s=new Student("mohan",12,new Address(new City("jabalpur"),new State("Mp")));
			new ObjectOutputStream(new FileOutputStream("g.txt")).writeObject(s);
	}
}