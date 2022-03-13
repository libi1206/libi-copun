package org.libi.billing.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 10:23 PM
 */
@SpringBootApplication
@MapperScan(basePackages = "org.libi.billing.impl.dao")
@ComponentScan(basePackages = "org.libi")
public class BillingApplication {
    public static void main(String[] args) {
        SpringApplication.run(BillingApplication.class, args);
    }
}
