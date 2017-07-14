package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.Product;
import data.ProductDao;
import data.ProductDaoFileImpl;

public class CartServlet extends HttpServlet {
	ProductDao dao;
//	List<Product> cart = new ArrayList<>();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String prodIDString = req.getParameter("productId");
		List<Product> cart;
		HttpSession session = req.getSession();
		cart = (List<Product>) session.getAttribute("cart");
		Product prod = null;
		if (cart == null) {
			cart = new ArrayList<>();
			session.setAttribute("cart", cart);
		}
		if (req.getParameter("clear") != null) {
			cart.clear();
		}
		else if (prodIDString != null) {
			prod = dao.getProductById(Integer.parseInt(prodIDString));
			if (prod != null) {
				cart.add(prod);
			}
		}

		req.setAttribute("product", prod);
		req.setAttribute("inventory", dao.getAllProducts());
		req.setAttribute("cart", cart);

		this.getServletContext().getRequestDispatcher("/WEB-INF/cart.jsp").forward(req, resp);

	}

	@Override
	public void init() {
		// dao = new ProductDaoMemoryImpl();
//		cart = Collections.synchronizedList(new ArrayList<>());
		dao = new ProductDaoFileImpl(this.getServletContext());
	}

}
