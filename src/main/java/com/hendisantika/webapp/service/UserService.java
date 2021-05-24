package com.hendisantika.webapp.service;

import com.hendisantika.webapp.domain.User;
import org.springframework.stereotype.Repository;

/**
 * Created by hendisantika on 7/21/17.
 */
@Repository
public interface UserService extends CRUDService<User>{
    User findByUsername(String username);
}
