package com.jah;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

// instead of configuring the web.xml and servlet mapping, can use this:
@WebServlet("/add3")
public class AddServlet3 extends HttpServlet{

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int num1 = Integer.parseInt( req.getParameter("num1") );
		int num2 = Integer.parseInt( req.getParameter("num2") );
		int sum = num1 + num2;
		
		// important to set the content type, otherwise can't use the html tags.
		res.setContentType("text/html"); 
		PrintWriter out = res.getWriter();
		
		out.println("<b>Sum: " + sum);
		out.println("<b>Square: " + sum*sum);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		doPost(req, res);
	}
}
