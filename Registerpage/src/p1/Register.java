package p1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "register", urlPatterns = { "/register" })
public class Register extends HttpServlet {
	public void init(ServletConfig sc) {
		System.out.println("loginServlet-init()");
	}

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("TestServlet-Service()");
		String fn = req.getParameter("fname");
		String ln = req.getParameter("lname");
		String ph = req.getParameter("phone");
		String em = req.getParameter("email");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>3RI BookStore<h1>");
		out.println("<h2>hi<br>"+fn+"<br>"+ln+"<br> you are login has been completted successfull</h2>");
		out.println("</body");
		out.println("</html>");

	}

	public void destroy() {
		System.out.println("loginServlet destroy()");
	}

}
