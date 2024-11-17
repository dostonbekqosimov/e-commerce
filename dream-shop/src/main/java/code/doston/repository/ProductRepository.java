package code.doston.repository;

import code.doston.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {


    List<Product> findAllByCategoryName(String category);

    List<Product> findAllByBrand(String brand);

    List<Product> findAllByCategoryNameAndBrand(String category, String brand);

    List<Product> findAllByName(String name);


    List<Product> findAllByBrandAndName(String brand, String name);
}
