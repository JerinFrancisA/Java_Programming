import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Insert() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/week10", "root", "");
			PreparedStatement ps = con.prepareStatement("INSERT INTO BOOK VALUES(?, ?, ?, ?, ?)");
			ps.setInt(1, Integer.parseInt(request.getParameter("id")));
			ps.setString(2, request.getParameter("name"));
			ps.setString(3, request.getParameter("author"));
			ps.setInt(4, Integer.parseInt(request.getParameter("edition")));
			ps.setInt(5, Integer.parseInt(request.getParameter("price")));
			ps.execute();
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			System.out.println("ERORR");
			e.printStackTrace();
		}
	}

}
