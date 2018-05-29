package br.com.JavaCRUD.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
	
	//Activating the drivers
	public BaseDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();			
		}
	}
	
	//Creating a method that connects to our database
	protected Connection getConnection() throws SQLException {
		
		//The protocol to our IP and our DataBase
		String url = "jdbc:mysql://localhost/plants";
		//Connects using our url, user and password
		Connection conn = DriverManager.getConnection(url, "user", "password");
		return conn;			
	}

	public static void main(String[] args) throws SQLException {
		BaseDAO db = new BaseDAO();
		Connection conn = db.getConnection();
		
		//Testing our connection:
		System.out.println(conn);
		conn.close();
	}
}
