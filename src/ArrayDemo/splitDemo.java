/**
 *
 */
package ArrayDemo;


/**
 * @author snipper
 *
 */
public class splitDemo {

	/**
	 * splitting a string and joining it together
	 */

	public static void main(String[] args) {
	     String Str = new String(("25474-186-2008"));
	     String [] clip=Str.split("-", 0);
	     String part1=clip[0];
          String part2=clip[1];
          String part3=clip[2];
	      System.out.println("Return Value :show me original order" );
	      for (String retl: Str.split(part1, 1)){
	         System.out.println(retl);
	      }
	     System.out.println("");
	      System.out.println("Return Value : split mara ya kwanza hapa" );
	      for (String ret: Str.split(part2, 2)){
	         System.out.print(ret);
	      }
	      System.out.println("");
	      System.out.println("Return Value : split mara ya pili" );
	      for (String ret: Str.split(part3, 3)){
	         System.out.println(ret);
	      }
	      System.out.println("");
	      System.out.println("Return Value :join splits unipee last output" );
	      for (String ret: Str.split(part1 + "" + part2 + "" +part3)){
	         System.out.print(ret);
	      }

	}
	}


