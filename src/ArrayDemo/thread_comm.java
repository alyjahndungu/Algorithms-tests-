/**
 *
 */
package ArrayDemo;

/**
 * @author snipper
 *
 */
public class thread_comm {

	/**
	 * testing the communacation between two threads
	 */
  boolean flag=false;
    public synchronized void Question(String message){
    	if(flag){
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

    	}
    	System.out.println(message);
    	flag=true;
    	notify();
    }

    public synchronized void Answer(String message){
    	if(!flag){
    		try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	System.out.println(message);
    	flag=false;
    	notify();
    }
	/**
	 * generate other classes below
	 */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		 thread_comm tc=new thread_comm();
		   new T1(tc);
		   new T2(tc);
	   }

}

   class T1 implements Runnable{
	   thread_comm tm;
	   String [] s1={"Hi", "How are you?", "Im also doing fine!"};

	   public T1(thread_comm tm1){
		   this.tm=tm1;
		   new Thread(this, "Question").start();
	   }

	@Override
	public void run() {
		for(int i=0;i<s1.length;i++){
			tm.Question(s1[i]);
		}

	}

   }


   class T2 implements Runnable{
	   thread_comm tm;
	   String [] s2={"Hi", "I am good, what about you?", "Great!!"};

	   public T2( thread_comm tm2){
		   this.tm=tm2;
		   new Thread(this, "Answer").start();


	   }
	@Override
	public void run() {
		for(int i=0;i<s2.length;i++){
			tm.Answer(s2[i]);
		}

	}

   }





