package com.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

import com.demo.service.ChildException;

@WebServlet(name = "CrashServlet", value = "/CrashServlet")
public class CrashServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
		ServletException,
		IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Hello Crash Servlet!</h3>");

		ChildException childException = new ChildException("Exception!");
		try {
			childException.triggerChildException();
		} catch (Exception e) {
			out.println("Error message : " + e.getMessage());
			out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
		ServletException,
		IOException {

	}
}
