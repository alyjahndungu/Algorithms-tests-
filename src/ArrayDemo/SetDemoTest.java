/**
 *
 */
package ArrayDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author snipper
 *
 */
public class SetDemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int scores[]= {45,67,24,56,89,57,90,55,88,98};
		//using the hashset class
		   Set <Integer> se=new HashSet<Integer>();

//		     for(int i=0;i<9;i++){
//		    	 se.add(scores[i]);
//
//		     }
		     for(int ss : scores){
		    	 se.add(ss);
            System.out.println("Display after looping in hashSet:" + se);
		     }


             //  System.out.println("This is hashset result:>>>>" +se);

               //using the tree set class
               TreeSet<Integer> sorted=new TreeSet<Integer>(se);
               System.out.println("This is the sorted set elements:>>>" +sorted);

               //display the first value on the sorted list using First()
               System.out.println("The First element of the set is: "+
                       (Integer)sorted.first());
               //display the last value of the sorted list using Last()
               System.out.println("The last element of the set is: "+
                     (Integer)sorted.last());

               //linked list
               LinkedHashSet<Integer> ll=new LinkedHashSet<Integer>(se);
                 for(int lst : scores){
                	 ll.add(lst);

                	  System.out.println("This is the linkedHash class set elements:>>>" +ll);
                	  break;

                 }


	}

}
