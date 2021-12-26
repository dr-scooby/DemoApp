package com.login;

import java.sql.*;

public class LoginDao {
	
	
	private String dburl = "jdbc:mysql://194.168.2.125:3306/Skyhawk";
	private String dbusername = "jah";
	private String dbpass = "123";
	
	public LoginDao() {
		
	}
	
	
	public boolean check(String uname, String pass) {
		boolean ok = false;
		
		try {
			String sql = "select * from login where uname=? and pass=? ";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dburl, dbusername, dbpass);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, uname);
			st.setString(2, pass);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				ok = true;
			}
			
			
			
		}catch(Exception e) {
			System.err.print(e);
			ok = false;
		}
		
		return ok;
	}

}
