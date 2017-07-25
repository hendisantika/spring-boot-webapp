package com.hendisantika.webapp.service.security;

import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 7/23/17
 * Time: 8:31 PM
 * To change this template use File | Settings | File Templates.
 */

@Service
public class EncryptionServiceImpl {
    private StrongPasswordEncryptor strongEncryptor;

    @Autowired
    public void setStrongEncryptor(StrongPasswordEncryptor strongEncryptor) {
        this.strongEncryptor = strongEncryptor;
    }

    public String encryptString(String input){
        return strongEncryptor.encryptPassword(input);
    }

    public boolean checkPassword(String plainPassword, String encryptedPassword){
        return strongEncryptor.checkPassword(plainPassword, encryptedPassword);
    }

}
