/**
 *
 */
package ArrayDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author snipper
 *
 */
public class addSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * adding values from another list to a hashset
                    List<String> l=new ArrayList<String>();
                    l.add("Elijah");
                    l.add("Edins");
                    l.add("kevin");
                    l.add("Collins");
                    l.add("John");

                    Set<String> s=new HashSet<String>();
                    s.addAll(l);
                    System.out.print(s);
                    */

		// adding elements from a hashset into another hashset
		Set<String> st=new HashSet<String>();

		st.add("Elijah");
        st.add("Edins");
        st.add("kevin");
        st.add("Collins");
        st.add("John");

        Set<String> s=new HashSet<String>();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.contains("kevin "));
        s.addAll(st);
        System.out.println(s);

       // st.removeAll(st);
       // System.out.println("after removing all>>>>>>" + st) ;
	}

}
