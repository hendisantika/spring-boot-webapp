package com.hendisantika.webapp.service.security;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 7/23/17
 * Time: 8:30 PM
 * To change this template use File | Settings | File Templates.
 */
public interface EncryptionService {
    String encryptString(String input);
    boolean checkPassword(String plainPassword, String encryptedPassword);
}
