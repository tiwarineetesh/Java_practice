package nt.jdbc;

import java.io.DataInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author mapit
 *
 */
public class EditRecordEx {
	/**
	 * 
	 */
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dbURL = "jdbc:mysql://localhost/java_practice_eclipse";

			Connection cn=DriverManager.getConnection(dbURL,"root","");

			Statement smt=cn.createStatement();

			DataInputStream KB=new DataInputStream(System.in);

			//input employee id by which we are going to edit record
			System.out.print("Enter Employee ID:");
			String eid=KB.readLine();

			//query to take data of a particular record from table employee
			String q="Select * from employees where eid='"+eid+"'";

			//to execute query
			ResultSet rs=smt.executeQuery(q);
			if(rs.next())
			{
				//to show the data
				System.out.println("Employee id:"+rs.getString(1));
				System.out.println("1.Employee Name:"+rs.getString(2));
				System.out.println("2.Employee DOB:"+rs.getString(3));
				System.out.println("3.Employee City:"+rs.getString(4));
				System.out.println("4.Employee Salary:"+rs.getString(5));
				System.out.println("5.Exit");
				System.out.println("Which Field U Want to Edit?");
				String ch=KB.readLine();
				String pat="";
				//cases to choose field you want to edit
				switch(ch)
				{ 
					case "1":
						System.out.print("Enter New Name:");
						String nn=KB.readLine();
						pat="empname='"+nn+"'";
						break;

					case "2":
						System.out.print("Enter New DOB:");
						String nd=KB.readLine();
						pat="dob='"+nd+"'";
						break;

					case "3":
						System.out.print("Enter New City:");
						String nc=KB.readLine();
						pat="city='"+nc+"'";
						break;

					case "4":
						System.out.print("Enter New Salary:");
						String ns=KB.readLine();
						pat="salary="+ns;
						break;

					case "5":
						System.out.println("Exit");
						break;

					default:
						System.out.println("Wrong Option");
						break;
				}
				if(!pat.equals(""))
				{
					//query to edit data of a particular record from table employee
					q="update employees set "+pat+" where eid='"+eid+"'";
					//to execute update
					smt.executeUpdate(q);
					System.out.println("Record Updated....");
				}
			}
			else
			{
				System.out.println("Record Not Found...");
			}
			cn.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
