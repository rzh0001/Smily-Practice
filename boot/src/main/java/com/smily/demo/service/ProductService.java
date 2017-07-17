package com.smily.demo.service;

import com.smily.demo.domain.Product;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
public interface ProductService {
    Iterable<Product> listAllProducts();
    
    Product getProductById(Integer id);
    
    Product saveProduct(Product product);
}
