package com.operate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigCenterApplication {
	
	public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigCenterApplication.class).web(true).run(args);
    }

}
