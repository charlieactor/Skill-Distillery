package com.skilldistillery.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LotteryServlet extends HttpServlet {
	LotteryBallDao dao;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int numBalls = Integer.parseInt(req.getParameter("numBalls"));
		int maxNum = Integer.parseInt(req.getParameter("maxNum"));
		
		dao = new LotteryBallDaoImpl();
		
		List<Ball> balls = dao.makeBalls(numBalls, maxNum);
		
		
		if (balls.size() > 0) {
			req.setAttribute("balls", balls);
			req.getRequestDispatcher("/results.jsp").forward(req, resp);
		}
		else {
			req.getRequestDispatcher("/error.jsp").forward(req, resp);
		}
		
	}
}
