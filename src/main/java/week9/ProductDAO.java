package week9;

import java.util.List;

public interface ProductDAO {
    void create(Product product);

    void delete(String productCode);

    List<Product> findAll();

    List<Product> findAllByProductLine(String ProductLine);

    void update(String productCode, Product product);
}
