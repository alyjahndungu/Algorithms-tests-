package ArrayDemo;

import java.util.EnumMap;

public class EnumMapDemo {

	public enum Numbers{
		ONE, TWO, THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN;
	};

	public static void main(String[] args) {
   EnumMap<Numbers, String> map1=new EnumMap<Numbers, String>(Numbers.class);
   EnumMap<Numbers, String> map2=new EnumMap<Numbers, String>(Numbers.class);

   //associate values in map1
   map1.put(Numbers.ONE, "1");
   map1.put(Numbers.TWO, "2");
   map1.put(Numbers.THREE, "3");
   map1.put(Numbers.FOUR, "4");
   map1.put(Numbers.FIVE, "5");
   map1.put(Numbers.SIX, "6");
   map1.put(Numbers.SEVEN, "7");
   map1.put(Numbers.EIGHT, "8");
   map1.put(Numbers.NINE, "9");
   map1.put(Numbers.TEN, "10");

   //print the maps.
   System.out.println("Map1 elements are:" + map1);

   //put all mappings from map1 to map2
map2.putAll(map1);

System.out.println("Map2 elements are: " +map2);

	}

}
