/**
 *
 */
package ArrayDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author snipper
 *
 */
public class arrayList {
	/*
	   * add those objects to an array using toArray();
	   * the remove(); is used to remove elents from list
	   * the contains(); is used to check whether an element is available
	   * the set(); is being used to replace a certain index with a new value
	   *
	   */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List <String>al=new ArrayList<String>();
     al.add("a");
     al.add("e");
     al.add("i");
     al.add("o");
     al.add("u");
     System.out.println(al);
  //   al.remove("a");

//  System.out.println(  al.get(0));

Object[] vowels=al.toArray();
  for(Object p: vowels){
	  System.out.println(p);
  }
 System.out.println(al.contains("a"));
 //setting an element in the list
 al.set(4, "f");
 System.out.println(al);

	}

}
