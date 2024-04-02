package com.santana.local_deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LocalDeploymentApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(LocalDeploymentApplication.class, args);
    }

}
