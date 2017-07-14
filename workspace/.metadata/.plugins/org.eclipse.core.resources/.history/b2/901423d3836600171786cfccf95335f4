package com.skilldistillery.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.data.President;
import com.skilldistillery.data.PresidentDAO;
import com.skilldistillery.data.PresidentDAOImpl;

public class PresidentsServlet extends HttpServlet {
	Map<Integer, President> presMap;
	
	@Override public void init() throws ServletException {
		PresidentDAOImpl dao = new PresidentDAOImpl();
		presMap = dao.loadPresidentsFromFile();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String presNum = req.getParameter("president1");
		
		
		
		
		req.setAttribute("president", dao.getPresidentByID(ID)
		req.getRequestDispatcher("/select.jsp").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
	

}
