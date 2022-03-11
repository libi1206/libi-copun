package org.libi.evidence.impl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/11/22 11:26 PM
 */
@SpringBootApplication
@MapperScan(basePackages = "org.libi.evidence.impl.dao")
@ComponentScan(basePackages = "org.libi")
public class EvidenceApplication {
    public static void main(String[] args) {
        SpringApplication.run(EvidenceApplication.class, args);
    }
}
