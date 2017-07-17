package com.smily.demo.service;

import com.smily.demo.domain.Product;
import com.smily.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
@Service
public class ProductServiceImpl implements ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public Iterable<Product> listAllProducts() {
        return productRepository.findAll();
    }
    
    @Override
    public Product getProductById(Integer id) {
        return productRepository.findOne(id);
    }
    
    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
