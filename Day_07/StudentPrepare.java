package Day_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentPrepare {
	public static void main(String[] args) {

		/*Url, Username, Password*/
		String url= "jdbc:mysql://localhost:3306/jdbc";
		String usr ="root";
		String pwd = "Sa123";
		String path = "com.mysql.cj.jdbc.Driver";


		try {
			/*Loadingf driver*/
			
			Class.forName(path);
			System.out.println("driver loaded succesfully");

			/*Establishing connection*/
			Connection conncetion = DriverManager.getConnection(url,usr,pwd);
			System.out.println("connection done");

			/*create Statement*/
			String query ="insert into student values(?,?,?,?)";

			PreparedStatement pstmt = conncetion.prepareStatement(query);

			Scanner s = new Scanner(System.in);
			System.out.println("entyer id:");
			pstmt.setString(1, s.next());

			System.out.println("enter the name: ");
			pstmt.setString(2, s.next());

			System.out.println("enter the percentage :");
			pstmt.setDouble(3, s.nextDouble());

			System.out.println("enter the address :");
			pstmt.setString(4,s.next());
			
			pstmt.executeUpdate();
			System.out.println("query is executed");


		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
