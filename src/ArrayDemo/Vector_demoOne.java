/**
 *
 */
package ArrayDemo;

import java.util.Vector;

/**
 * @author snipper
 *
 */
public class Vector_demoOne {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector vc=new Vector();
//         vc.add("Edins");
//         vc.add("Elijah");
//         vc.add("Collins");
//         vc.add("Kelvin");
//         System.out.println(vc);

         //adding elements using the index
         vc.add(0, "Elijah");
         vc.add(1, "Edins");
         vc.add(2, "kelvin");
         vc.add(3, "collins");
         System.out.println(vc);
	}

}
