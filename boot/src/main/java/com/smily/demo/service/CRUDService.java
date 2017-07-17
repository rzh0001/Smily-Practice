package com.smily.demo.service;

import java.util.List;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
public interface CRUDService<T> {
    List<?> listAll();
    
    T getById(Integer id);
    
    T saveOrUpdate(T domianObject);
    
    void delete(Integer id);
}
