package com.project.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.project"})
public class ProjectBootstrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectBootstrapApplication.class, args);
    }

}
