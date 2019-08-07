final class Y{
	int y = 89;
}

class C{
	public static void main(String[] args){
		Y a = new Y();
		a.y = 56;
		System.out.println(a.y);
	}
}
// we can access and modify variable of any final class through instantiation in java