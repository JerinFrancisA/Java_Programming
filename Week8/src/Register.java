import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Register() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		if(request.getParameter("login").equals("abc") && 
		   request.getParameter("pw").equals(request.getParameter("rpw")) &&
		   request.getParameter("rpw").length() >= 8) {
			Date d = new Date();
			if(d.getHours() > 12) {
				pw.print("GOOD AFTERNOON !");
			} else {
				pw.print("GOOD MORNING !");
			}
		}
	}

}
