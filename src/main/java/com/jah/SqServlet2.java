package com.jah;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class SqServlet2 extends HttpServlet{
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int num = 0;
		
		// get the cookies from the servlet request, get all data
		Cookie[] cookies = req.getCookies();
		
		for(int i=0; i<cookies.length; i++) {
			Cookie c = cookies[i];
			if(c.getName().equals("sum"))
				num = Integer.parseInt( c.getValue() );
		}
		
		PrintWriter out = res.getWriter();
		num = num * num;
		out.println("square root: " + num);
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doPost(req, res);
	}

}
