package ArrayDemo;

class MyThread extends Thread {
    boolean stop=false;
      public void run(){
   	   while(true){
   		   if(stop){
   			   return;
   		   }
   	   }
      }

   public static void main(String [] args){
	   //Checking whether the tread has stopped or not
       Thread trr=new MyThread();
       trr.start();
       	if(trr.isAlive()){
       		System.out.println("Thread has not finished");
       	}else{
       		System.out.println("Finished");
       	}
       try {
			trr.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   }

}