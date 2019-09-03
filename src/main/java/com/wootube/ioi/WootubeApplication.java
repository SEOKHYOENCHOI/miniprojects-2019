package com.wootube.ioi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

import java.util.TimeZone;

@SpringBootApplication
@PropertySource("classpath:email.properties")
public class WootubeApplication {
    public static void main(String[] args) {
        SpringApplication.run(WootubeApplication.class, args);
        TimeZone.setDefault(TimeZone.getTimeZone("KST"));
    }
}
