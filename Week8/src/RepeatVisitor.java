import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RepeatVisitor")
public class RepeatVisitor extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public RepeatVisitor() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		Cookie[] ck = request.getCookies();
		boolean n = false;
		if(ck != null) {
			for(int i=0; i<ck.length; i++) {
				if(ck[i].getName().equals("repeat") && ck[i].getValue().equals("y"))
					n = true;
			}
			if(n) {
				pw.print("WELCOME BACK BOSS !!");
			}
		}
		else {
			pw.print("WELCOME !!");
			Cookie ckk = new Cookie("repeat", "y");
			ckk.setMaxAge(60*60*60);
			response.addCookie(ckk);
		}
		
	}

}
