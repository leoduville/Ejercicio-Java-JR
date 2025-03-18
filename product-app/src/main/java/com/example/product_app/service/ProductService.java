package com.example.product_app.service;

import com.example.product_app.model.Product;
import com.example.product_app.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createProduct(Product product) {
        return repository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        return repository.findById(id)
                .map(product -> {
                    product.setName(productDetails.getName());
                    product.setDescription(productDetails.getDescription());
                    product.setPrice(productDetails.getPrice());
                    product.setQuantity(productDetails.getQuantity());
                    return repository.save(product);
                }).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public Optional<Product> getProductById(Long id) {
        return repository.findById(id);
    }

    public Optional<Product> getProductByName(String name) {
        return repository.findByName(name);
    }

    public List<Product> getAllProductsSortedByPrice() {
        return repository.findAllByOrderByPriceAsc();
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
