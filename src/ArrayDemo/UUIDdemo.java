/**
 *
 */
package ArrayDemo;

import java.util.UUID;

/**
 * @author snipper
 *
 */
public class UUIDdemo {

	/**
	 * using the UUIDFromBytes(byte[] name) method
	 *
	 */

	public static void main(String[] args) {
		// initialize the byte
		byte[] nbyte={07,41,86,20};
     //create the UUID method
		UUID uid= UUID.nameUUIDFromBytes(nbyte);

		//print the nbyte first
		System.out.println("The hashcode for the byte is:"  +nbyte.hashCode());
		//print the UUID name
		System.out.println("The UUID name is:" +uid);

	}

}
