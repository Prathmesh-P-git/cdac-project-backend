package milk_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import milk_api.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, String> {
}
