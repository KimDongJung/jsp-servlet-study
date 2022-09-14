package com.newlecture.web.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.bcel.Const;

@WebServlet("/test")
public class test extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		// NOTE request.setCharacterEncoding("UTF-8"); // 毎回追記するのではなくサーブレットフィルターで実装した方が良い
		String utext = request.getParameter("utext");
		String result = "Result is " + utext;
		
		response.getWriter().println(result);
	}
}
