 class MyThread extends Thread{
	 public void run(){
                  System.out.println(Thread.currentThread().getName()+"~~~~~~~~~run()");
	 }
}
class F{
	public static void main(String[] args){
         MyThread t=new MyThread();
		 t.setName("mohan");
		 t.start();
         t.start();
            System.out.println(Thread.currentThread().getName()+"~~~~~~~~~main()");
 	}
}
//we do not call the start method more than one time on a single object. it will give the exception IllegalThreadStateException.
