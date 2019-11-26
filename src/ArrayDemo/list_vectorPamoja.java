/**
 *
 */
package ArrayDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * @author snipper
 *
 */
public class list_vectorPamoja {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a new list
		List ls=new LinkedList();
		 ls.add(0, "Elijah");
         ls.add(1, "Edins");
         ls.add(2, "kelvin");
         ls.add(3, "collins");
//adding the list values to the vector object
         Vector vc=new Vector();
         vc.addAll(ls);
	System.out.println(vc);
	}
}

