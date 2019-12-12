/**
 * 
 */
package nt.jdbc;

import java.sql.*;

/**
 * @author mapit
 *
 */
public class CreateTableEx {
	
	
	private static String driver = "";
	private static String dbURL = "";
	private static String user = "";
	private static String pass = "";
	
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	

	/**
	 * 
	 */
	private CreateTableEx() {
		// TODO Auto-generated constructor stub
		
		driver = "com.mysql.jdbc.Driver";
		dbURL = "jdbc:mysql://localhost/java_practice_eclipse";
		user = "root";
		pass = "";
		
	}
	
	
	private void registerDriver() {
		try {
			System.out.println("Registering Driver....");
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void openAConn() {
		try {
			System.out.println("Creating Connection....");
			connection = DriverManager.getConnection(dbURL, user, pass);
			statement = connection.createStatement();
			String query = "CREATE TABLE kunal_company_emloyees (ID int NOT NULL, LastName varchar(255) NOT NULL, FirstName varchar(255), Age int, PRIMARY KEY (ID) )";
			System.out.println("Executing Query....");
			boolean flag = statement.execute(query);
			System.out.println("Result is....");
			System.out.println(flag);
//			System.out.println(resultSet.getMetaData());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void extractData() {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateTableEx createTableEx = new CreateTableEx();
		createTableEx.registerDriver();
		createTableEx.openAConn();

	}

}
