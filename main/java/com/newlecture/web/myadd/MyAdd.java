package com.newlecture.web.myadd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myadd")
public class MyAdd extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		
		String temp_x = req.getParameter("x");
		String temp_y = req.getParameter("y");
		int x = 0;
		int y = 0;
		if (temp_x != null && temp_y != null) {
			if (!temp_x.equals("") && !temp_y.equals("")) {
				x = Integer.parseInt(temp_x);
				y = Integer.parseInt(temp_y);
			}
		}
		out.println("Result is " + (x + y));
	}
}
