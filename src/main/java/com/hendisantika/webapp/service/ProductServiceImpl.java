package com.hendisantika.webapp.service;

import com.hendisantika.webapp.domain.Product;
import com.hendisantika.webapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hendisantika on 7/14/17.
 */

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
