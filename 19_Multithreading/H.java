class MyThread extends Thread{
	public void run(){

	}
}
class YourThread  extends Thread{
	public void run(){

	}
}
class H{
	public static void main(String[] args){
             MyThread t1=new MyThread();
			 t1.setName("Mohan");
			 t1.setPriority(7);

			 YourThread t2=new YourThread();
			  t2.setName("ganesh");
			   t2.setPriority(6);

			 Thread t3=Thread.currentThread();
			  t3.setName("vinayak");
			   t3.setPriority(5);

			 System.out.println(t1.getName());
			 System.out.println(t1.getId());
			System.out.println(t1.getPriority());
			System.out.println(t1.isAlive());

				   System.out.println("######################");

		    System.out.println(t2.getName());
			System.out.println(t2.getId());
		     System.out.println(t2.getPriority());
			System.out.println(t2.isAlive());

				 System.out.println("##################");

			System.out.println(t3.getName());
			System.out.println(t3.getId());
			System.out.println(t3.getPriority());
			System.out.println(t3.isAlive());
	}
}