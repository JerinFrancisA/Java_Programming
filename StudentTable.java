import java.sql.*;
import java.util.Scanner;

public class StudentTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
			Statement stmt = con.createStatement();
			stmt.execute("CREATE TABLE IF NOT EXISTS STUDENT(USN VARCHAR(10), FName VARCHAR(16), LName VARCHAR(16), Sub1_Marks INTEGER, Sub2_Marks INTEGER, Sub3_Marks INTEGER, Sub4_Marks INTEGER)");
			Scanner in = new Scanner(System.in);
			PreparedStatement ps = con.prepareStatement("INSERT INTO STUDENT VALUES (?, ?, ?, ?, ?, ?, ?)");
//			for(int i=0; i<5; i++) {
//				System.out.println("Enter usn, fname, lname, m1, m2, m3, m4");
//				ps.setString(1, in.next());
//				ps.setString(2, in.next());
//				ps.setString(3, in.next());
//				ps.setInt(4, in.nextInt());
//				ps.setInt(5, in.nextInt());
//				ps.setInt(6, in.nextInt());
//				ps.setInt(7, in.nextInt());
//				ps.execute();
//			}
			ResultSet rs = stmt.executeQuery("SELECT MAX(Sub1_Marks), MAX(Sub2_Marks), MAX(Sub3_Marks), MAX(Sub4_Marks) FROM STUDENT");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3) + " " + rs.getInt(4));
			}
			rs = stmt.executeQuery("SELECT MAX(Sub1_Marks), MIN(Sub1_Marks), AVG(Sub1_Marks) FROM STUDENT");
			System.out.println("\nSUB 1");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
			}
			rs = stmt.executeQuery("SELECT MAX(Sub2_Marks), MIN(Sub2_Marks), AVG(Sub2_Marks) FROM STUDENT");
			System.out.println("SUB 2");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
			}
			rs = stmt.executeQuery("SELECT MAX(Sub3_Marks), MIN(Sub3_Marks), AVG(Sub3_Marks) FROM STUDENT");
			System.out.println("SUB 3");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
			}
			rs = stmt.executeQuery("SELECT MAX(Sub4_Marks), MIN(Sub4_Marks), AVG(Sub4_Marks) FROM STUDENT");
			System.out.println("SUB 4");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getInt(3));
			}
			rs = stmt.executeQuery("SELECT COUNT(*) FROM STUDENT WHERE Sub1_Marks < 40");
			System.out.println("\nSUB 1 < 40");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
