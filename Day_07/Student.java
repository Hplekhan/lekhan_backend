package Day_07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		try {
			/*step-1 Loading driver*/
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded succesfully");
			
			/*Url, Username, Password*/
			String url= "jdbc:mysql://localhost:3306/jdbc";
			String usr ="root";
			String pwd = "Sa123";
			
			/*step-2 Establishing the connection*/
			Connection conncetion = DriverManager.getConnection(url,usr,pwd);
			System.out.println("connection done");
			
			String query ="insert into student values(1, 'John',89.02,'Bengaluru')";
			
			Statement stmt = conncetion.createStatement();
			int sucess = stmt.executeUpdate(query);
			System.out.println(sucess);
			System.out.println("update succesfully");
		}
		
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
