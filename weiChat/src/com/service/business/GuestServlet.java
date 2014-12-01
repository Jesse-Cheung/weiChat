package com.service.business;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GuestServlet extends HttpServlet{

	private static final long serialVersionUID = 6829308280272684928L;

	@SuppressWarnings("unused")
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String	name	= request.getParameter("gName");
		String	phone	= request.getParameter("gPhone");
		
		super.service(request, response);
	}
	
}
