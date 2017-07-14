package data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

public class ProductDaoFileImpl implements ProductDao {

	Map<Integer, Product> inventory = new HashMap<>();

	@Override
	public Product getProductById(int id) {
		return inventory.get(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return new ArrayList<Product> (inventory.values());
	}

	public ProductDaoFileImpl(ServletContext context) {
		loadProductsFromFile(context, "WEB-INF/products.txt");
	}

	private void loadProductsFromFile(ServletContext context, String fileName) {
		InputStream is = context.getResourceAsStream(fileName);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader buf = new BufferedReader(isr);
		String line;
		try {
			while ((line = buf.readLine()) != null) {
				String[] stringArr = line.split(", ");
				int id = Integer.parseInt(stringArr[0]);
				double price = Double.parseDouble(stringArr[2]);
				String name = stringArr[1].substring(1, stringArr[1].length()-1);
				Product p = new Product(id, name, price);
				inventory.put(id, p);
			}
			buf.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
