package jdbc;
import java.sql.*;
 import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcSetup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String URL = "jdbc:mysql://localhost:3306/sys";
		String uname = "root";
		String pwd = "SmithaRai@01";
try {
	Class.forName("com.mysql.jdbc.driver");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
Connection con = DriverManager.getConnection(URL,uname,pwd);
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select studentname from student where rollno = 3");

rs.next();
System.out.println(rs.getString("studentname"));

st.close();
rs.close();
	}

}
