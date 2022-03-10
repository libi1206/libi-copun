package org.libi.user.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/10/22 11:32 PM
 */
@SpringBootApplication
@MapperScan(basePackages = "org.libi.user.impl.dao")
@ComponentScan(basePackages = "org.libi")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }
}
