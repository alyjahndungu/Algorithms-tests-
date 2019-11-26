/**
 *
 */
package ArrayDemo;

import java.util.Queue;
import java.util.Stack;

/**
 * @author Leigh Marc
 *
 */
public class stack_Demo {

	/**
	 * do all this in the main method
	 * use push() to put data into your stack
	 * the pop() method
	 * removes the element from your stack
	 * i used the search() method to display the element number as they were entered
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
Stack<String> st=new Stack<String>();

			  st.push("elijah");
			  st.push("ndungu");
			  st.push("software");
			  st.push("engineer");

			  System.out.println(st.search("software"));

			  System.out.println(st);
			  st.pop();
              System.out.println("after pop" +st);

st.clear();

	}

}
