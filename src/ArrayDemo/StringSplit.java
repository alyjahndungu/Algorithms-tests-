/**
 *
 */
package ArrayDemo;

/**
 * @author snipper
 *
 */
public class StringSplit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
   char [] me={'E', 'L', 'I', 'J', 'A', 'H'};
   for(int i=0; i<=me.length;i++){
	   if(i<=2){
		   System.out.print(me[i]);
	   }
	   if(i==3){
		   System.out.print("-" +me[i]);
	   }
	   if(i==4){
		   System.out.print(me[i]);
	   }

	   if(i==5){
		   System.out.print( me[i]);
	   }
   }


	}

}
