package ch06_oracleJDBC;
import java.sql.Connection;
import java.sql.DriverManager;

public class OracleDBtest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.OracleDriver");	//oracle
			// Class.forName("oracle.mysql.jdbc.Driver");	//mysql
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@211.197.206.35:1521:xe","system","1234");
			System.out.println("Success");
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
