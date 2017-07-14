package data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDaoMemoryImpl implements ProductDao {
	
	Map<Integer, Product> inventory = new HashMap<>();
	
	public ProductDaoMemoryImpl() {
		this.loadProducts();
	}

	@Override
	public Product getProductById(int id) {
		return inventory.get(id);
	}

	@Override
	public List<Product> getAllProducts() {
		return (List<Product>)inventory.values();
	}
	
	private void loadProducts() {
		inventory.put(1, new Product(1, "Apple", 1.09));
		inventory.put(2, new Product(2, "Orange", 2.99));
		inventory.put(3, new Product(3, "Pomegranate", 3.09));
		inventory.put(4, new Product(4, "Giraffe", 1209.23));
		inventory.put(5, new Product(5, "Frog", 15.09));
		inventory.put(6, new Product(6, "Bird", 31.09));
		inventory.put(7, new Product(7, "Maserati", 11111.09));
		inventory.put(8, new Product(8, "Fuji Apple", 1.99));
	}

}
