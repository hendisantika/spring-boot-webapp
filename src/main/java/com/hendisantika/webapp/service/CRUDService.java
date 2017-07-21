package com.hendisantika.webapp.service;

import java.util.List;

/**
 * Created by hendisantika on 7/21/17.
 */
public interface CRUDService<T> {
    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);
}
