/**
 *
 */
package ArrayDemo;

/**
 * @author snipper
 *
 */


	public class QueueDemo {

		private int capacity;
	    int queueArr[];
	    int front = 0;
	    int back = -1;
	    int currentSize = 0;

		public QueueDemo(int queueSize){
	        this.capacity = queueSize;
	        queueArr = new int[this.capacity];
		}

		/**
		 * @param args
		 */
		public static void main(String[] args) {

			QueueDemo qd = new QueueDemo(10);

			qd.enqueue(1);
			qd.enqueue(2);
			qd.enqueue(3);
			qd.enqueue(4);
			qd.enqueue(5);
			qd.enqueue(6);
			qd.enqueue(7);
			qd.enqueue(8);
			qd.enqueue(9);
			qd.enqueue(10);
			qd.enqueue(1111);


		}
		

		public void enqueue(int item) {
	        if (isQueueFull()) {
	            System.out.println("Imejaa!!! Unable to add element: "+item);
	        } else {
	            back++;
	            /*if(back == capacity-1){
	                back = 0;
	            }*/
	            queueArr[back] = item;
	            currentSize++;
	            System.out.println("Element " + item+ " is pushed to Queue !");
	        }
	    }

		public boolean isQueueFull(){
	        boolean status = false;
	        if (currentSize == capacity){
	            status = true;
	        }
	        return status;
	    }

	

	}



