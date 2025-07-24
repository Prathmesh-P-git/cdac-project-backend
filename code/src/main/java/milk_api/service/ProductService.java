package milk_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import milk_api.entity.Products;
import milk_api.repository.ProductsRepository;

@Service
public class ProductService {

    private final ProductsRepository productRepository;

    public ProductService(ProductsRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Products> getProductById(String id) {
        return productRepository.findById(id);
    }

    public Products saveProduct(Products product) {
        return productRepository.save(product);
    }

    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
