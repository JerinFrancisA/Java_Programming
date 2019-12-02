import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/View")
public class View extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public View() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week8", "root", "");
			String type = request.getParameter("type");
			if(type.equals("ALL")) {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from student");
				while(rs.next()) {
					pw.print(rs.getRow()+") "+rs.getInt(1)+" "+rs.getString(2)+" "
							+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getInt(5)+" "+rs.getInt(6)+"<br><br>");
				}
			} else if(type.equals("JAVA")) {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select sub1 from student");
				while(rs.next()) {
					pw.print(rs.getRow()+") "+rs.getInt(1)+"<br><br>");
				}
			} else {
				pw.print("WRONG VALUE");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
