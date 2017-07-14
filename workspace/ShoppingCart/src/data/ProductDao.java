package data;

import java.util.List;

public interface ProductDao {
	
	Product getProductById(int id);
	List<Product> getAllProducts();
	
}
