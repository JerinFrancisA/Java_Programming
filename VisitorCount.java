import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitorCount")
public class VisitorCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public VisitorCount() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter p = response.getWriter();
			response.setContentType("text/html");
			String un = request.getParameter("us");
			String pw = request.getParameter("pw");
			if(un.equals("ash") && pw.equals("123")) {
				p.println("SUCCSEESESE");
			}
			else {
				p.print("LOGIN SFAil");
			}
		} catch(Exception e) {}
	}
}
