package com.hendisantika.webapp.service;

import com.hendisantika.webapp.domain.User;

/**
 * Created by hendisantika on 7/21/17.
 */
public interface UserService extends CRUDService<User>{
    User findByUsername(String username);
}
