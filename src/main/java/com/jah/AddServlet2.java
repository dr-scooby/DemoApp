package com.jah;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class AddServlet2 extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
	{
		int num1 = Integer.parseInt( req.getParameter("num1") );
		int num2 = Integer.parseInt( req.getParameter("num2") );
		int sum = num1 + num2;
		
		// send data using cookies
		// set the cookie to the data
		Cookie cookie = new Cookie("sum", sum+""); // this is how to pass int as string
		res.addCookie(cookie);
		
		// now re-direct to the Servlet
		res.sendRedirect("sq2");
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		doPost(req, res);
	}

}
