package com.hendisantika.webapp.repositories;

import com.hendisantika.webapp.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hendisantika on 7/13/17.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
