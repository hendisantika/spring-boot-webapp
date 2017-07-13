package com.hendisantika.webapp.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by hendisantika on 7/13/17.
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.hendisantika.webapp.domain"})
@EnableJpaRepositories(basePackages = {"com.hendisantika.webapp.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
