import java.sql.*;
import java.util.Scanner;

public class EmployeeDB {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
			Statement stmt = con.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS EMPLOYEE (ID INTEGER, FName VARCHAR(16), LName VARCHAR(16), Project VARCHAR(16), Salary INTEGER)");
			Scanner in = new Scanner(System.in);
			PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE VALUES (?, ?, ?, ?, ?)");
//			for(int i=0; i<5; i++) {
//				System.out.println("Enter id, fname, lname, proj, salary");
//				ps.setInt(1, in.nextInt());
//				ps.setString(2, in.next());
//				ps.setString(3, in.next());
//				ps.setString(4, in.next());
//				ps.setInt(5, in.nextInt());
//				ps.execute();
//			}
			System.out.println("ALL RECORDS : ");
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
			while(rs.next()) {
				System.out.println("id: " + rs.getInt(1));
				System.out.println("fname: " + rs.getString(2));
				System.out.println("lname: " + rs.getString(3));
				System.out.println("proj: " + rs.getString(4));
				System.out.println("salary: " + rs.getInt(5));
				System.out.println("");
			}
			rs = stmt.executeQuery("SELECT * FROM EMPLOYEE WHERE PROJECT = 'WebDev'");
			while(rs.next()) {
				System.out.println("id: " + rs.getInt(1));
				System.out.println("fname: " + rs.getString(2));
				System.out.println("lname: " + rs.getString(3));
				System.out.println("proj: " + rs.getString(4));
				System.out.println("salary: " + rs.getInt(5));
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
