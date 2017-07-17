package com.smily.demo.service.security;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
@Service
public class EncryptServiceImpl implements EncryptionService {
    
    @Autowired
    private StrongPasswordEncryptor strongPasswordEncryptor;
    
    @Override
    public String encryptString(String input) {
        return strongPasswordEncryptor.encryptPassword(input);
    }
    
    @Override
    public boolean checkPassword(String plainPassword, String encryptedPassword) {
        return strongPasswordEncryptor.checkPassword(plainPassword,encryptedPassword);
    }
}
