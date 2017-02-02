package com.example.initialization;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.example.domain.model.Product;
import com.example.domain.repository.ProductRepository;

import java.math.BigDecimal;

/**
 * Loads the data to database
 */

@Component
public class DatabaseLoader implements ApplicationListener<ContextRefreshedEvent> {

    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(DatabaseLoader.class);

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product designer_mug = new Product();
        designer_mug.setDescription("Designer Mug");
        designer_mug.setPrice(new BigDecimal("20.95"));
        designer_mug.setImageUrl("http://galaxy.agh.edu.pl/~marekko/wat/store/bc93c37e51b613a87e3750c65b72b6db.jpg");
        designer_mug.setProductId("235268845711068308");
        productRepository.save(designer_mug);

        log.info("Saved Designer Mug - id: " + designer_mug.getId());

        Product funny_mug = new Product();
        funny_mug.setDescription("Funny Mug");
        funny_mug.setImageUrl("http://galaxy.agh.edu.pl/~marekko/wat/store/mug_thumnail.jpg");
        funny_mug.setProductId("168639393495335947");
        funny_mug.setPrice(new BigDecimal("15.95"));
        productRepository.save(funny_mug);

        log.info("Saved Funny Mug - id:" + funny_mug.getId());

        Product shirt = new Product();
        shirt.setDescription("Funny Mug");
        shirt.setImageUrl("http://galaxy.agh.edu.pl/~marekko/wat/store/THIS_IS_A_DESIGNER_TSHIRT_AA_TEE.jpg");
        shirt.setProductId("16863939343462247");
        shirt.setPrice(new BigDecimal("18.7"));
        productRepository.save(shirt);

        log.info("Saved Shirt - id:" + shirt.getId());
    }
}