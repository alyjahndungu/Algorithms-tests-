/**
 *
 */
package ArrayDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author snipper ade caprio
 *
 */
public class map_DemoOne {

	/**
	 * @param <K>
	 * @param <V>
	 * @param args
	 * @param <MAX_VALUE
	 */
	public static void main(String[] args) {

  Map<Integer, String> m=new HashMap<>();

  m.put(1, "elijah");
  m.put(2,"john");
  m.put(3, "developers");
  m.put (4, "Oracle");
  m.put(5, "Nairobi");
  m.put(6, "westlands");

 System.out.println(m.get(4));  //displaying only one element
// System.out.println(m.containsKey(2));  //checks for the available key its boolean
// System.out.println(m.putIfAbsent(7, "jeremiah")); //checks the key if null it adds that element
// System.out.println(m.containsValue("Oracle")); //searching  whether the value is there
// System.out.println(m.size());//the size of the map
//
     for(Object nn : m.keySet()){//looping for the keys
		   System.out.println("Output for for each loop:" +nn);
     }
     System.out.println("");
     for(Object nn : m.values()){//looping for the values
		   System.out.println("Output for Values:" +nn);
   }
     System.out.println("");
     //loopting using the iterator
        Iterator<Integer> it=m.keySet().iterator();
           while(it.hasNext()){
        	   System.out.println("Iterator loop output is:: " +m.get(it.next()));
           }
           System.out.println("");
   //to loop for the values
           Iterator<String> it1=m.values().iterator();
           while(it1.hasNext()){
        	   System.out.println("Iterator loop output is:: " +it1.next());
           }

  Map<Integer, String> mp=new HashMap<>();
  //copy all elements from 'm' to 'mp'
     mp.putAll(m);
     System.out.println(mp);
	}

}
