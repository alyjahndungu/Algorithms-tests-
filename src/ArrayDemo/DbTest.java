package ArrayDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class DbTest {
	Connection con;
	Statement st;
	ResultSet rs;

	public DbTest() {
		 Map<Integer, String> mp=new HashMap<Integer, String>();


		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

			st = con.createStatement();

			rs = st.executeQuery("select * from employees");

			while(rs.next()){
				int id=rs.getInt(1);
	             String fname=rs.getString(3);
	             String lname=rs.getString(4);
	             String sname=rs.getString(5);

	            mp.put(id, fname+"   " +lname+"   " +sname);

			}

       System.out.print(mp);



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

	public static void main(String[] args) {
	new DbTest();

	}

}
