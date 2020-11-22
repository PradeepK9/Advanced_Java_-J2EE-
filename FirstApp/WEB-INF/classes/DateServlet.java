package com.bytecode.servlet;
import javax.servlet.*;
import java.io.*;
import java.util.*;

public class DateServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException ,IOException{
	// set response content type
	res.setContentType("text/html");
	//get PrintWriter
	PrintWriter pw=res.getWriter();

	//write b.logic or request processing logic
	Date d= new Date();
	pw.println("<body style='background-color:greenyellow;' ");
	//pw.print("<h1 style='color:green; text-align:center'></h1>");
	pw.println("<h1>The Current Date and Time is : </h1>");
	pw.println("<h2 style='color:red; text-align:center'>"+d+"</h2>");
	pw.println("</body>");

	//close stream
	pw.close();

	}// service(-,-)
}// class