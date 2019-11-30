
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Delete() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week10", "root", "");
			Statement stmt = con.createStatement();
			stmt.execute("DELETE FROM BOOK WHERE id = " + request.getParameter("id") + "");
			pw.print("DELETED!<br><br><a href=\"index.jsp\">HOME</a>");
			
		} catch (Exception e) {
			System.out.println("ERORR");
			e.printStackTrace();
		}
	}

}
