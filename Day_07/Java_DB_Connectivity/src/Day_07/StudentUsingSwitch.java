package Day_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentUsingSwitch {

	private static Connection connection;
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		StudentUsingSwitch sws = new StudentUsingSwitch();

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
			System.out.println("Press 2 for selectRecords");
			System.out.println("Enter your choice :");

			int choice = s.nextInt();
			
			switch(choice) {
			
			case 1: {
				sws.insertRecord();
				break;
			}
			case 2:{
				sws.selectRecords();
			}
				
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
			
		}

		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	void insertRecord() throws SQLException {
		String query ="insert into student values(?,?,?,?)";
		PreparedStatement pstmt = connection.prepareStatement(query);

		System.out.println("entre id :");
		pstmt.setInt(1,s.nextInt());

		System.out.println("enter name: ");
		pstmt.setString(2, s.next());

		System.out.println("enter percentage :");
		pstmt.setDouble(3, s.nextDouble());

		System.out.println("enter address :");
		pstmt.setString(4, s.next());

		int rows = pstmt.executeUpdate();

		if(rows!=0) {
			System.out.println("inserted sucessfully");
		}
	
	}
	
	public void selectRecords() throws SQLException{
		System.out.println("Enter the id to search :");
		int id = s.nextInt();
		
		String query ="select * from student where id="+id;
		
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



}
