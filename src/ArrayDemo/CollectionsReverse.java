package ArrayDemo;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverse {

	public static void main(String[] args) {
		ArrayList letters=new ArrayList();
		letters.add("A");
		letters.add("B");
		letters.add("C");
		letters.add("D");
		letters.add("E");
		letters.add("F");
		letters.add("G");
		letters.add("H");

		System.out.println("The normal order is:" + letters);

		Collections.reverse(letters);
		System.out.println("The reversed letters be like: " + letters);

	}

}
