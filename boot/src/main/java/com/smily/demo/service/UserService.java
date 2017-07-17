package com.smily.demo.service;

import com.smily.demo.domain.User;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
public interface UserService extends CRUDService<User> {
    User findByUsername(String username);
}
