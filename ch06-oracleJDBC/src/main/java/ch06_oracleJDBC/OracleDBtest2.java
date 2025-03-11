package ch06_oracleJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleDBtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");	//oracle
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@211.197.206.35:1521:xe","tjoeun","1234");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from department");
			
			while(rs.next()) {
				String deptId = rs.getString(1);
				String deptTitle = rs.getString(2);
				String location = rs.getString(3);
				System.out.println(deptId + ", " + deptTitle + ", " + location);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
