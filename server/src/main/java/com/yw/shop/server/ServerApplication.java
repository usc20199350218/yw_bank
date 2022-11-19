package com.yw.shop.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author guyue
 */
@SpringBootApplication( scanBasePackages = "com.yw.shop" )
public class ServerApplication {

    public static void main( String[] args ) {
        SpringApplication.run( ServerApplication.class, args );
    }

}
