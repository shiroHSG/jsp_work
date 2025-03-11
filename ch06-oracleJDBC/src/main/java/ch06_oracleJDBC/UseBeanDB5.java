package ch06_oracleJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UseBeanDB5 {
	private final String JDBC_DRIVER = "oracle.jdbc.OracleDriver";
	private final String JDBC_URL = "jdbc:oracle:thin:@211.197.206.35:1521:xe";
	private final String USER = "tjoeun";
	private final String PASS = "1234";
	
	public UseBeanDB5() {
		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Bean2> getList() {
		ArrayList<Bean2> alist = new ArrayList<Bean2>();
		
		try {
			Connection con = DriverManager.getConnection(JDBC_URL, USER, PASS);
			Statement st = con.createStatement();
			String query = "select * from job";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				Bean2 bean = new Bean2();
				bean.setJob_code(rs.getString(1));
				bean.setJob_name(rs.getString(2));
				alist.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return alist;
	}
}
