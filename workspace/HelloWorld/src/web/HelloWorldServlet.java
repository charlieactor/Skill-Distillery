package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String outputText = "Hello " + firstname + " " + lastname;

		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Hello World</title><link rel='stylesheet' href='styles.css' /></head>");
		pw.println("  <body> <h3>" + outputText + "</h3></body>");
		pw.println("</html>");
		pw.close();
	}
	
}
