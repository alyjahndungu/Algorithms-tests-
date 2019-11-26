/**
 *
 */
package demoTwo;

/**
 * @author snipper
 *
 */
public class Hirechy {

public static void main(String [] args){
	for(int i =1; i<30; i++){
		for(int j=1; (j-1)<i; j++ ){
			System.out.print(j);
		}
		System.out.println("\n");
	}
}

}