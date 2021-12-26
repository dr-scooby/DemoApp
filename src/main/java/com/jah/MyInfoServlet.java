package com.jah;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class MyInfoServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		// important to set the content type, otherwise can't use the html tags.
		res.setContentType("text/html"); 
		PrintWriter out = res.getWriter();
		
		ServletContext ctx = getServletContext();
		String name = ctx.getInitParameter("name");
		String email = ctx.getInitParameter("email");
		
		out.println("Getting info from the web.xml: <br>");
		out.println("<b>Name: " + name);
		out.println("<br>");
		out.println("<b>Email: " + email);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		doPost(req, res);
	}
}
