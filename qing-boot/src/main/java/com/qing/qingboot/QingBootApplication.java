package com.qing.qingboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.qing.qingboot.mapper")
public class QingBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(QingBootApplication.class, args);
    }

}
