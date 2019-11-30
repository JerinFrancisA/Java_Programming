
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Display() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter pw = response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week10", "root", "");
			Statement stmt = con.createStatement();
			String id = request.getParameter("id")==""?"999":request.getParameter("id");
			ResultSet rs = stmt.executeQuery("SELECT * FROM BOOK WHERE id = " + id + " OR name = \"" + request.getParameter("name") +"\"");
			while(rs.next()) {
				pw.print(rs.getInt("id")+"<br>");
				pw.print(rs.getString("name")+"<br>");
				pw.print(rs.getString("author")+"<br>");
				pw.print(rs.getInt("edition")+"<br>");
				pw.print(rs.getInt("price")+"<br>");
			}
			pw.print("<a href=\"index.jsp\">HOME</a>");
		} catch (Exception e) {
			System.out.println("ERORR");
			e.printStackTrace();
		}
	}

}
