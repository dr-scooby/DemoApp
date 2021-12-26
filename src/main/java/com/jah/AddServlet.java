package com.jah;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class AddServlet extends HttpServlet{

		
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
			int num1 = Integer.parseInt( req.getParameter("num1") );
			int num2 = Integer.parseInt( req.getParameter("num2") );
			
			int sum = num1 + num2;
			PrintWriter out = res.getWriter();
			out.println("answer: " + sum);
			
			// set attribute, to pass to another servlet
			// send the data to the other servlet
			//req.setAttribute("sum", sum);
			
			
			// forward to another servlet to process
			//RequestDispatcher rd = req.getRequestDispatcher("sq");
			//rd.forward(req, res);
		}
		
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doPost(req, res);
	}
}
