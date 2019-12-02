import java.util.Scanner;

import java.sql.*; 

/*
 
1. Write a java program to create Employee table with fields like ID, Name, Age and
Salary. Insert the data to the table using prepared statement. Your program should be
able to do the following operations.
a. Create an Updateable ResulSet to update a Salary in the current row.
b. Move the Cursor to the 2nd row of ResulSet and update the name.
c. Insert a row with new values using insertRow().
d. Delete a row with ID = 10.

*/
public class Week7Q1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week7", "root", "");
			PreparedStatement ps = con.prepareStatement("insert into emp values(?, ?)");
			int c=0;
			System.out.println("how many inserts ? ");
			Scanner in = new Scanner(System.in);
			c = in.nextInt();
			for(int i=0; i<c; i++) {
				System.out.println("enter name and age : ");
				ps.setInt(1, in.nextInt());
				ps.setInt(2, in.nextInt());
				ps.execute();
			}
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from emp");
			System.out.println("choice ? U:1 MnU:2 I:3 D:4 :");
			c = in.nextInt();
			switch(c) {
			case 1: rs.next();
					rs.updateInt(2, 14);
					rs.updateRow();
					break;
			case 2: rs.absolute(2);
					rs.updateInt(1, 3);
					rs.updateInt(2, 7);
					rs.updateRow();
					break;
			case 3: rs.moveToInsertRow();
					rs.updateInt(1, 10);
					rs.updateInt(2, 55);
					rs.insertRow();
					break;
			case 4: while(rs.next()) {
						if(rs.getInt(2) == 55) {
							rs.deleteRow();
						}
					}
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 