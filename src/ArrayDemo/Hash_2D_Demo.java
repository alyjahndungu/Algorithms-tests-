/**
 *
 */
package ArrayDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author snipper
 *
 */
public class Hash_2D_Demo {

	/**
	 * @param <rows>
	 * @param <cols>
	 * @param args
	 */
	public static  void main(String[] args) {
    String[][] scores={
    		{"Elijah", "94"},
    		{"Edins","98"},
    		{"Collins", "92"},
    		{"Kimani", "67"},
    		{"John" , "77"}
    };

 	Map map=new HashMap();
         for( int rows=0;rows<5; rows++){
        	 		 map.put(scores[rows][0], scores[rows][1]);
        	 	}

        	 	System.out.print(map);

         }
	}


