/**
 *
 */
package ArrayDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author snipper
 *
 */
public class HashTable_Scores {
static Connection conn;
static ResultSet rs;
static Statement st;
static Map<Integer, Integer> map;
static String  tblScore;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Map<Integer, Integer> map=new HashMap<>();
//			 map.put(8840, 78);
//			 map.put(8841, 66);
//			 map.put(8843, 98);
//			 map.put(8882, 68);
//			 map.put(8822, 90);
//			 map.put(8452, 55);
//			 map.put(8930, 88);
//			 map.put(7892, 70);
//			 map.put(7293, 48);
//			 map.put(8673, 72);

//			 for(Object n : map.keySet())
//				 System.out.println(n);
//
//			 for(Object nm : map.values())
//				 System.out.println( "Your scored : " +nm);

		 map.put(8840, 78);
		 map.put(8841, 66);
		 map.put(8843, 98);
		 map.put(8882, 68);
		 map.put(8822, 90);
		 map.put(8452, 55);
		 map.put(8930, 88);
		 map.put(7892, 70);
		 map.put(7293, 48);
		 map.put(8673, 72);


		int size=map.size();
		   try {
			st=conn.createStatement();
	       int sql = st.executeUpdate("insert into" +tblScore);
			Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
			int counter = 1;
			while (it.hasNext()) {
			Map.Entry<?, Map<Integer, Integer>> pairs = (Map.Entry)it.next();
		pairs.setValue(map);
		CharSequence Val= pairs.getKey()+"="+pairs.getValue();

             System.out.print(Val +"="+ sql);
             System.out.println("Good trial");
			if(size > counter )
			counter++;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting....");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test" , "root", "");
			System.out.println("Connection successiful....");
           st=conn.createStatement();
          // int load=st.executeUpdate("insert into tblScore values ('"+ map.keySet()+"', '"+ map.values()+"')");

        } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//	public void insertData(Map<Integer, Integer> map, String  tblScore) {
//
//
//	}

}
