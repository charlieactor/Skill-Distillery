package com.skilldistillery.web;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.skilldistillery.data.President;
import com.skilldistillery.data.PresidentDAO;
import com.skilldistillery.data.PresidentDAOImpl;

public class PresidentsServlet extends HttpServlet {
	Map<Integer, President> presMap;
	PresidentDAO dao;
	Set<Integer> termNums;

	@Override
	public void init() throws ServletException {
		dao = new PresidentDAOImpl(this.getServletContext());
		presMap = dao.loadPresidentsFromFile();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String presNumString = req.getParameter("president1");

		String submit = req.getParameter("submit");

		if (presNumString == null) {
			if (req.getParameter("PrezByTerm") != null) {
				String prezByTermString = req.getParameter("PrezByTerm");
				int presByTerm = Integer.parseInt(prezByTermString);
				req.setAttribute("pres", presMap.get(presByTerm));
				req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);
			}
			else if (req.getParameter("PrezByParty") != null) {
				String prezByParty = req.getParameter("PrezByParty");
				Map<Integer, President> sortedPresMap = dao.sortByParty(prezByParty, presMap);
				req.setAttribute("pres", sortedPresMap);
				req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);
			}
			req.setAttribute("initialload", true);
			req.setAttribute("pres", presMap.get(1));
			req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);
		} else {
			if (submit != null && submit.equals("next")) {
				int presNum = Integer.parseInt(presNumString);
				presNum += 1;
				if (presNum > 45) {
					presNum = 1;
					req.setAttribute("pres", presMap.get(presNum));
					req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);
				}
				req.setAttribute("pres", presMap.get(presNum));
				req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);

			} else if (submit != null && submit.equals("prev")) {
				int presNum = Integer.parseInt(presNumString);
				presNum -= 1;
				if (presNum < 1) {
					presNum = 45;
					req.setAttribute("pres", presMap.get(presNum));
					req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);
				}
				req.setAttribute("pres", presMap.get(presNum));
				req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);
//			} else if (req.getParameter("PrezByTerm") != null) {
//				String prezByTermString = req.getParameter("PrezByTerm");
//				int presByTerm = Integer.parseInt(prezByTermString);
//				req.setAttribute("pres", presMap.get(presByTerm));
//				req.getRequestDispatcher("/TestPresidents2.jsp").forward(req, resp);
//			} else if (req.getParameter("PrezByParty") != null) {
//				String prezByParty = req.getParameter("PrezByParty");
//				Map<Integer, President> sortedPresMap = dao.sortByParty(prezByParty, presMap);
//				req.setAttribute("presByParty", sortedPresMap);
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
