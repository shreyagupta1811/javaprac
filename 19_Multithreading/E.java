 class MyThread extends Thread{
	 public void run(){
                  System.out.println(Thread.currentThread().getName()+"~~~~~~~~~run()");
	 }
}
class E{
	public static void main(String[] args){
         MyThread t=new MyThread();
		 t.setName("mohan");
		 t.start();
          // t.run();
            System.out.println(Thread.currentThread().getName()+"~~~~~~~~~main()");
 	}
}
//there is no need to call the run method for fresf new thread of execution is will call automatically when we call the start method ..
//whenever u call  the run method it always stack in main thread above the main method .