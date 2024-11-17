package code.doston.service.product;

import code.doston.entity.Product;
import code.doston.exceptions.ProductNotFoundException;
import code.doston.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(" Product not found"));
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.findById(id).ifPresentOrElse(productRepository::delete,
                () -> {
                    throw new ProductNotFoundException("Product not found");
                });
    }

    @Override
    public void updateProduct(Product product, Long productId) {

    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductsByCategory(String category) {
        return productRepository.findAllByCategoryName(category);
    }

    @Override
    public List<Product> getAllProductsByBrand(String brand) {
        return productRepository.findAllByBrand(brand);
    }

    @Override
    public List<Product> getAllProductsByCategoryAndBrand(String category, String brand) {
        return productRepository.findAllByCategoryNameAndBrand(category, brand);
    }

    @Override
    public List<Product> getAllProductsByName(String name) {
        return productRepository.findAllByName(name);
    }

    @Override
    public List<Product> getAllProductsByBrandAndName(String brand, String name) {
        return productRepository.findAllByBrandAndName(brand, name);
    }

    @Override
    public Long countProductsByBrandAndName(String brand, String name) {
        return 0L;
    }
}
