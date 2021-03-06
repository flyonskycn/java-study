package com.flyonsky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author luowengang
 * @date 2020/4/6 8:28
 */
@SpringBootApplication
@MapperScan("com.flyonsky.mapper")
public class Application {

    public static void main(String... args){
        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
        builder.run(args);
    }
}
