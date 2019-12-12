/**
 * 
 */
package nt.jdbc;

import java.sql.*;

/**
 * @author mapit
 *
 */
public class AddData {
	
	
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
	private AddData() {
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

	private void openAConn(String fname, String lname, int id, int age) {
		try {
			System.gc();
			System.out.println("Creating Connection....");
			connection = DriverManager.getConnection(dbURL, user, pass);
			statement = connection.createStatement();
			String query = "INSERT INTO `kunal_company_emloyees`(`ID`, `LastName`, `FirstName`, `Age`) VALUES ("+id+", '"+lname+"', '"+fname+"', "+age+")";
			System.out.println("Query" + query);
			System.out.println("Executing Query....");
			int flag = statement.executeUpdate(query);
			System.out.println("Result is....");
			System.out.println(flag);
//			System.out.println(resultSet.getMetaData());
			statement.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void openAConnPreparedStmt(String fname, String lname, int id, int age) {
		try {
			System.gc();
			System.out.println("Creating Connection....");
			connection = DriverManager.getConnection(dbURL, user, pass);
			String query = "INSERT INTO `kunal_company_emloyees`(`ID`, `LastName`, `FirstName`, `Age`) VALUES (?,?,?,?)";
//			System.out.println("Query" + query);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, lname);
			preparedStatement.setString(3, fname);
			preparedStatement.setInt(4, age);
			System.out.println("Executing Query....");
			int flag = preparedStatement.executeUpdate();
			System.out.println("Result is....");
			System.out.println(flag);
//			System.out.println(resultSet.getMetaData());
			preparedStatement.close();
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void deleteRecord(int id) {
		try {
			System.gc();
			System.out.println("Creating Connection....");
			connection = DriverManager.getConnection(dbURL, user, pass);
			statement = connection.createStatement();
			String query = "DELETE FROM `kunal_company_emloyees` WHERE `ID` = "+id;
			System.out.println("Query" + query);
			System.out.println("Executing Query....");
			int flag = statement.executeUpdate(query);
			System.out.println("Result is....");
			System.out.println(flag);
//			System.out.println(resultSet.getMetaData());
			connection.close();
			statement.close();
			
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
		System.gc();
		AddData addData = new AddData();
		addData.registerDriver();
		for (int x=0; x<30; x++) {
			int id = x+1;
			addData.openAConnPreparedStmt("Neetesh", "Tiwari", id, 34);		
		}
		
		
//		for (int x=0; x<=3000; x++) {
//			if(x % 500 != 0) {
////				System.out.println(" X: "+x);
//				addData.deleteRecord(x);
//			}
//			
//		}

		
//		addData.openAConn("Kunal", "Purohit", 002, 34);
//		addData.openAConn("Amit", "Tripathi", 003, 32);
//		addData.openAConn("Vikas", "Mishra", 004, 38);
//		addData.openAConn("Abhishek", "Pandey", 005, 30);
//		addData.openAConn("Manish", "Sharma", 006, 36);

	}

}
