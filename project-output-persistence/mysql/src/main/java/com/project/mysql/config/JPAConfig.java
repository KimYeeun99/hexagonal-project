package com.project.mysql.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.project.mysql"})
@EntityScan(basePackages = {"com.project.mysql"})
public class JPAConfig {
}