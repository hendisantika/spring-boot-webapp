package com.hendisantika.webapp.repositories;

import com.hendisantika.webapp.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by hendisantika on 7/20/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
}
