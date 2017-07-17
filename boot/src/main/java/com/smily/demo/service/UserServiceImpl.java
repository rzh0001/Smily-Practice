package com.smily.demo.service;

import com.smily.demo.domain.User;
import com.smily.demo.repository.UserRepository;
import com.smily.demo.service.security.EncryptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
@Service
@Profile("springdatajpa")
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private EncryptionService encryptionService;
    
    @Override
    public List<?> listAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
    
    @Override
    public User getById(Integer id) {
        return userRepository.findOne(id);
    }
    
    @Override
    public User saveOrUpdate(User domianObject) {
        if (domianObject.getPassword() != null){
            domianObject.setEncryptedPassword(encryptionService.encryptString(domianObject.getPassword()));
        }
        return userRepository.save(domianObject);
    }
    
    @Override
    public void delete(Integer id) {
        userRepository.delete(id);
    }
    
    @Override
    public User findByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }
}
