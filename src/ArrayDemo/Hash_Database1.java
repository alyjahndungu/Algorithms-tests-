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
import java.util.Map;

/**
 * @author snipper
 *
 */
public class Hash_Database1 {

	static Connection conn;
	static Statement stmt;
	static ResultSet rs;

	public static void main(String[] args) {
           try {
        	   Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Establishing connection...");
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			System.out.println("Connected successifully");
			  Map<Integer, String> mp=new HashMap<Integer, String>();

			  stmt = conn.createStatement();

				rs = stmt.executeQuery("select * from employees");

				while(rs.next()){
					int id=rs.getInt("idNo");
		             String fname=rs.getString("firstname");
		             String lname=rs.getString("lastname");
		             String sname=rs.getString("sirname");

		            mp.put(id, fname+"   " +lname+"   " +sname);

				}

	       System.out.print(mp);


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
