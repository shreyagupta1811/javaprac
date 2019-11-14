class MyThread extends Thread{
	public void run(){

	}
}
class I{
	public static void main(String[] args){
          MyThread t=new MyThread();
		  //case 1
		  //t.setPriority(10);

		  //case 2
		  //t.setPriority(12);
	}
}
//here we know that we can assign a priority from 1 to 10 but here we pass the priority as 12 so setpriority gave exception called
//illegalArgumentException