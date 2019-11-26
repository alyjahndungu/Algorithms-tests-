package ArrayDemo;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class IteratorClass {
	public static void main(String[] args) {
		Set <String> s= new LinkedHashSet<String>();
		s.add("a");
		s.add("e");
		s.add("ï");
		s.add("o");
		s.add("u");

		s.remove("o");
		System.out.println("After removing one vowel:" + s);


		Iterator<String> it =s.iterator();
		while(it.hasNext()){
			   System.out.println("Value: "+it.next() + " ");
		}
	}

}
