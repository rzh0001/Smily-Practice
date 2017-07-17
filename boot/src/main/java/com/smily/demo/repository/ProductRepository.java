package com.smily.demo.repository;

import com.smily.demo.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
public interface ProductRepository extends CrudRepository<Product, Integer>{
}
