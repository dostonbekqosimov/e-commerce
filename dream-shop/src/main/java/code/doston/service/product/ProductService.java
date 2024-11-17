package code.doston.service.product;

import code.doston.entity.Product;

import java.util.List;

public interface ProductService {
    Product addProduct(Product product);


    Product getProductById(Long id);

    void deleteProduct(Long id);

    void updateProduct(Product product, Long productId);

    List<Product> getAllProducts();

    List<Product> getAllProductsByCategory(String category);

    List<Product> getAllProductsByBrand(String brand);

    List<Product> getAllProductsByCategoryAndBrand(String category, String brand);

    List<Product> getAllProductsByName(String name);

    List<Product> getAllProductsByBrandAndName(String brand, String name);

    Long countProductsByBrandAndName(String brand, String name);


}
