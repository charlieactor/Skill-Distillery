package com.skilldistillery.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorServlet extends HttpServlet {
	MathDao dao;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double num1 = Integer.parseInt(req.getParameter("firstNum"));
		double num2 = Integer.parseInt(req.getParameter("secondNum"));
		String math = req.getParameter("math");
		
		dao = new MathDaoImpl();
		
		double result = dao.doMath(num1, num2, math);
		
		req.setAttribute("calculation", result);
		req.getRequestDispatcher("/results.jsp").forward(req, resp);
		
	}

}
