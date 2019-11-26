package ArrayDemo;

import java.util.Scanner;

public class EnumTest {

	public static void main(String[] args) {
       //  Planets p;
        // p=Planets.MERQURY;
//		System.out.println("please select a planet");
//		Scanner scan=new Scanner(System.in);
//		String enter=scan.nextLine();
Planets p[]=Planets.values();
 for(Planets pl: p){
	 System.out.println(pl);
 }


//         switch(p){
//        	 case EARTH:
//        		 System.out.println("Earth has life");
//        		 break;
//        	 case MARS:
//        		 System.out.println("MARS has no gravity");
//        		 break;
//        	 case NEPTUNE:
//        		 System.out.println("neptune is blue");
//        		 break;
//        	 case JUPITER:
//        		 System.out.println("Jupiter is the biggest");
//        		 break;
//        	 case MERQURY:
//        		 System.out.println("Merqury is the hottest");
//        		 break;
//        	 case VENUS:
//        		 System.out.println("Venus is the second one");
//        		 break;
//        	 case SATURN:
//        		 System.out.println("Saturn has a ring");
//        		 break;
//        	 case URANUS:
//        		 System.out.println("uranus has a funny name");
//        		 break;
//         }
	}

}
