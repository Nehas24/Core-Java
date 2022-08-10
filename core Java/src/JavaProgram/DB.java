package JavaProgram;
import java.sql.*;
public class DB {




	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sonali","root","root");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("SELECT id, name FROM students");
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		System.out.println("Students Table Created Successfully");
		
		System.out.println("Row inserted successfully");
		st.close();

	}

}


