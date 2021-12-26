package com.jah;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowParam
 */
@WebServlet("/ShowParam")
public class ShowParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Request HTTP Parameters Sent</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Parameters sent with request:</p>");
		Enumeration enu = request.getParameterNames();
		while (enu.hasMoreElements()) {
		String pName = (String) enu.nextElement();
		String[] pValues = request.getParameterValues(pName);
		out.print("<b>"+pName + "</b>: ");
		for (int i=0;i<pValues.length;i++) {
		out.print(pValues[i]);
		}
		out.print("<br>");
		}
		out.println("</body>");
		out.println("</html>");
	}

}
