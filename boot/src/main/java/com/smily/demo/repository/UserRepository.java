package com.smily.demo.repository;

import com.smily.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    User findUserByUsername(String username);
}
