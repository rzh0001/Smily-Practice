package com.smily.demo.service.security;

/**
 * @author ruanzh
 * @since 2017/6/13
 */
public interface EncryptionService {
    String encryptString(String input);
    boolean checkPassword(String plainPassword, String encryptedPassword);
}
