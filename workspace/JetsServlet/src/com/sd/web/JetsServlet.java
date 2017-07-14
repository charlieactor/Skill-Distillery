package com.sd.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sd.data.Jet;
import com.sd.data.JetsDao;
import com.sd.data.StaticJetsDao;

@SuppressWarnings("serial")
public class JetsServlet extends HttpServlet {
	private JetsDao jetsDao;

	public JetsServlet() {
		jetsDao = new StaticJetsDao();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String idString = req.getParameter("id");
		int id = 0;
		List<Jet> jetsList = jetsDao.getJets();

		if (idString == null) {
			req.setAttribute("jets", jetsList);
			req.getRequestDispatcher("/results.jsp").forward(req, resp);
		} else {
			try {
			id = Integer.parseInt(idString);
			} catch (Exception e) {
				req.getRequestDispatcher("error.jsp").forward(req, resp);
			}
			if (id > 0 && id <= jetsList.size()) {
				List<Jet> single = new ArrayList<>();
				single.add(jetsList.get(id - 1));
				req.setAttribute("jets", single);
				req.getRequestDispatcher("/results.jsp").forward(req, resp);
			}
			else if (id == 0 || id > jetsList.size()) {
				req.getRequestDispatcher("/error.jsp").forward(req, resp);
			}
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setStatus(405);
	}

}
