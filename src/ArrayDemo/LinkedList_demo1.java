/**
 *
 */
package ArrayDemo;

import java.util.LinkedList;
import java.util.List;

/**
 * @author snipper
 *
 */
public class LinkedList_demo1 {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		list.add("a");
		list.add("e");
		list.add("i");
		list.add("o");
		list.add("u");


		System.out.println("Before removal:" + list.size());
       list.remove("i");
       System.out.println("After removal:" + list.size());
       System.out.println("new list:" + list);
	}

}
