package com.hendisantika.webapp;

import com.hendisantika.webapp.domain.Product;
import com.hendisantika.webapp.repositories.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by hendisantika on 7/13/17.
 */
@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {
    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(ProductLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product shirt = new Product();
        shirt.setDescription("Kotlin Shirt");
        shirt.setPrice(new BigDecimal("19.95"));
        shirt.setImageUrl("https://www.ptxstore.com/jetbrains/images/large/CUJB16S-M3.jpg?osCsid=b4b083806d6d674db7e2a51d97ab1eba");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        log.info("Saved Shirt - id: " + shirt.getId());

        Product mug = new Product();
        mug.setDescription("Kotlin Mug");
        mug.setPrice(new BigDecimal("15.00"));
        mug.setImageUrl("https://ih0.redbubble.net/image.349603711.0228/flat,800x800,075,f-c,0,75,800,331.jpg");
        mug.setProductId("168639393495335947");
        productRepository.save(mug);

        log.info("Saved Mug - id:" + mug.getId());
    }
}
