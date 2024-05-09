package Day_07;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee {

	private static Connection connection;
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		Employee emp = new Employee();

		try 
		{
			String url= "jdbc:mysql://localhost:3306/jdbc";
			String usr ="root";
			String pwd = "Sa123";
			String path = "com.mysql.cj.jdbc.Driver";

			/*Loading driver*/
			Class.forName(path);

			/*Establish connection*/
			connection = DriverManager.getConnection(url,usr,pwd);

			System.out.println("Press 1 for insert");
			System.out.println("Press 2 for selectRecordsById");
			System.out.println("Press 3 for sleectAllRecords");
			System.out.println("Press 4 for updateRecords");
			System.out.println("Press 5 for delete a records");
			System.out.println("Enter your choice :");

			int choice = s.nextInt();

			switch(choice) {

			case 1: {
				emp.insertRecord();
				break;
			}
			case 2:{
				emp.selectRecordsById();
				break;
			}

			case 3:{
				emp.selectAllRecords();
				break;
			}
			case 4:{
				emp.updateRecords();
				break;
			}
			case 5:{
				emp.deleteRecords();
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		}

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	/*Insert*/
	private void insertRecord() throws SQLException {
		String query ="insert into employee values(?,?,?,?)";
		PreparedStatement pstmt = connection.prepareStatement(query);

		while(true) {
			System.out.println("entre id :");
			pstmt.setInt(1,s.nextInt());

			System.out.println("enter name: ");
			pstmt.setString(2, s.next());

			System.out.println("enter Salary :");
			pstmt.setDouble(3, s.nextDouble());

			System.out.println("enter address :");
			pstmt.setString(4, s.next());

			int rows = pstmt.executeUpdate();

			System.out.println("wnat to continue :");
			String res = s.next();
			if(res.equalsIgnoreCase("no")) {
				System.out.println("Inserted Sucessfully");
				break;
			}
		}


	}

	/*GetBy ID*/
	private void selectRecordsById() throws SQLException{
		System.out.println("Enter the id to search :");
		int id = s.nextInt();

		String query ="select * from employee where id="+id;

		Statement stmt = connection.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		if(rs.next()) {
			int Emp_id = rs.getInt("id");
			String Emp_name = rs.getString("name");
			Double Emp_sal = rs.getDouble("sal");
			String Emp_address = rs.getString("dept");
			System.out.println("ID :"+ Emp_id +" " +"NAME :"+ Emp_name+" " +"SALARY :"+" " +Emp_sal+" "+ "ADDRESS :"+" " + Emp_address );
		}
		System.out.println("Query been executed");

	}

	/*GET All records*/
	private void selectAllRecords() throws SQLException{
		System.out.println("All table records");

		String query ="select * from employee";

		Statement stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			int Emp_id = rs.getInt("id");
			String Emp_name = rs.getString("name");
			Double Emp_sal = rs.getDouble("sal");
			String Emp_address = rs.getString("dept");
			System.out.println("ID :"+ Emp_id +" " +"NAME :"+ Emp_name+" " +"SALARY :"+" " +Emp_sal+" "+ "ADDRESS :"+" " + Emp_address );
		}
	}

	/*Update records*/
	private void updateRecords() throws SQLException{

		System.out.println("enter id to update :");
		int user_id = s.nextInt();
		String query ="select * from employee where id="+user_id;

		System.out.println("enter what you want to update : ");
		String updateQuery = "Update employee set";
		System.out.println("press 1 for name change");
		System.out.println("press 2 for salary change");
		System.out.println("press 3 for address change");

		int  keyEntered = s.nextInt();

		switch(keyEntered) {
		case 1:{
			System.out.println("enter name to update :");
			String newName = s.next();
			updateQuery = updateQuery+" name = ? where id="+user_id;
			PreparedStatement pstmt = connection.prepareStatement(updateQuery);
			pstmt.setString(1, newName);
			int res = pstmt.executeUpdate();

			if(res!=0) {
				System.out.println("updates sucessfully");
			}
			else {
				System.out.println("name need to update");
			}
			break;
		}
		case 2:{

			System.out.println("enter salary to update :");
			Double newSalary =  s.nextDouble();
			updateQuery = updateQuery+" sal = ? where id="+user_id;
			PreparedStatement pstmt = connection.prepareStatement(updateQuery);
			pstmt.setDouble(1, newSalary);
			int res = pstmt.executeUpdate();
			if(res!=0) {
				System.out.println("salary updates sucessfully");
			}
			else {
				System.out.println("salary need to update");
			}
			break;
		}
		case 3:
		{
			System.out.println("enter dept to update :");
			String newDept =  s.next();
			updateQuery = updateQuery+" dept = ? where id="+user_id;
			PreparedStatement pstmt = connection.prepareStatement(updateQuery);
			pstmt.setString(1, newDept);
			int res = pstmt.executeUpdate();
			if(res!=0) {
				System.out.println("dept updates sucessfully");
			}
			else {
				System.out.println("dept need to update");
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + keyEntered);
		}
	}

	private void deleteRecords() throws SQLException {
		
		String query ="select * from employee";

		Statement stmt = connection.createStatement();

		ResultSet rs = stmt.executeQuery(query);
		while(rs.next()) {
			int Emp_id = rs.getInt("id");
			String Emp_name = rs.getString("name");
			Double Emp_sal = rs.getDouble("sal");
			String Emp_address = rs.getString("dept");
			System.out.println("ID :"+ Emp_id +" " +"NAME :"+ Emp_name+" " +"SALARY :"+" " +Emp_sal+" "+ "ADDRESS :"+" " + Emp_address );
		}
		
		System.out.println("enter id to delete :");
		int del_id = s.nextInt();
		String deleteQuery = "delete from employee where id="+del_id;
		
		PreparedStatement pstmt = connection.prepareStatement(deleteQuery);
		
		
		int res =  pstmt.executeUpdate();
		if(res!=0) {
			System.out.println("deleted success");
		
		}
		else {
			System.out.println("not deleted");
		}
		
	}

}








