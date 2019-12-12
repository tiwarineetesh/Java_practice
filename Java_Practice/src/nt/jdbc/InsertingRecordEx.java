/**
 * 
 */
package nt.jdbc;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author mapit
 *
 */
public class InsertingRecordEx {
	
	
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
	private InsertingRecordEx() {
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

	
	private void insertRecord(int eid, String empname, Date dob, String city, int salary) {
		try {
			System.out.println("Creating Connection....");
			connection = DriverManager.getConnection(dbURL, user, pass);
			String query = "INSERT INTO `employees`(`eid`, `empname`, `dob`, `city`, `salary`) VALUES (?,?,?,?,?)";
//			System.out.println("Query" + query);
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, eid);
			preparedStatement.setString(2, empname);
			preparedStatement.setDate(3, dob);
			preparedStatement.setString(4, city);
			preparedStatement.setInt(5, salary);
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
		InsertingRecordEx insertingRecordEx = new InsertingRecordEx();
		insertingRecordEx.registerDriver();
		try {
			
			insertingRecordEx.insertRecord(103, "Vikas Mishra", new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("1992-01-28")).getTime()), "Bhopal", 20000);
			insertingRecordEx.insertRecord(104, "Amit Tripathi", new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("1994-04-18")).getTime()), "Indore", 30000);
			insertingRecordEx.insertRecord(105, "Manish Sharma", new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("1993-10-08")).getTime()), "Indore", 30000);
			insertingRecordEx.insertRecord(106, "Abhishek Singh", new java.sql.Date((new SimpleDateFormat("yyyy-MM-dd").parse("1989-12-11")).getTime()), "Indore", 30000);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
