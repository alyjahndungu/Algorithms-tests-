/**
 *
 */
package ArrayDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author snipper
 *
 */
public class matchRegex {
       private static Pattern twoart =Pattern.compile("(\\d+)-(\\d+)");

	public static void checkString(String s) {
	  Matcher m=twoart.matcher(s);
	    if(m.matches()){
	    	System.out.println(s + "Matches; first part is " + m.group(1)  + ", second part is: " + m.group(2) + ".");
	    }else{
	    	System.out.println(s + "does not match");
	    }

	}
        public static void main(String [] args){
        new	matchRegex();
        }
}
