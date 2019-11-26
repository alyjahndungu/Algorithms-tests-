package ArrayDemo;

public class DemoThreads extends Thread{

	public void run() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<10;i++){
			printMsg();
		}
	}

	private void printMsg() {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		String name=t.getName();
		System.out.println("Name= " +name);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demonstration of checking whether thread is alive or not
		DemoThreads  dt=new DemoThreads();
		dt.setName("Alive thread");
		System.out.println("before start(), dt.isAlive()=" +dt.isAlive());
		  //thread starts running
		dt.start();
		System.out.println("just after start(), dt.isAlive()=" +dt.isAlive());
         for(int i=0;i<10;i++){
        	 dt.printMsg();
         }
         System.out.println("At the end of main, dt.isAlive()=" +dt.isAlive());

       

	}

}


