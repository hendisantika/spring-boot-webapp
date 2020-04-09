package com.hendisantika.webapp.service;

import com.hendisantika.webapp.domain.Product;

/**
 * Created by hendisantika on 7/14/17.
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
