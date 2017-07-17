package com.smily.demo.service;

import com.smily.demo.domain.Role;
import com.smily.demo.repository.RoleRepository;
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
public class RoleServiceImpl implements RoleService {
    
    @Autowired
    private RoleRepository roleRepository;
    
    @Override
    public List<?> listAll() {
        List<Role> roles = new ArrayList<>();
        roleRepository.findAll().forEach(roles::add);
        return roles;
    }
    
    @Override
    public Role getById(Integer id) {
        return roleRepository.findOne(id);
    }
    
    @Override
    public Role saveOrUpdate(Role domianObject) {
        return roleRepository.save(domianObject);
    }
    
    @Override
    public void delete(Integer id) {
        roleRepository.delete(id);
    }
}
