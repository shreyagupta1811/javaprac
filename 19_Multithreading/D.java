class MyThread extends Thread{
	public void run(){
            for(int i=0;i<10;i++){
                     System.out.println("~~~~~~~~~~"+i);
			}
	}
}
class D{
	public static void main(String[] args){
             MyThread t=new MyThread();
			 t.start();
               for(int i=0;i<10;i++){
                     System.out.println("##########"+i);
			}
	}
}
//this exmple proves that scheduler gave chances to different thread to comlete its task.