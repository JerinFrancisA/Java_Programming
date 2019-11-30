
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Update() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week10", "root", "");
			Statement stmt = con.createStatement();
			stmt.execute("UPDATE BOOK SET id = " + request.getParameter("newid") + " WHERE id = " + request.getParameter("oldid"));
			pw.print("UPDATED !<br><br><a href=\"index.jsp\">HOME</a>");
		} catch (Exception e) {
			System.out.println("ERORR");
			e.printStackTrace();
		}
	}

}
