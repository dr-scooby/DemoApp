package com.jah;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class SqServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out = res.getWriter();
		out.println("hello Sq");
		
		int number = (int) req.getAttribute("sum");
		int sqr = number * number;
		
		out.println("Square Root of  " + number + " is: " + sqr);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		doGet(req, res);
	}

}
