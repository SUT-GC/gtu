package com.igouc;

import com.igouc.config.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@ComponentScan("com.igouc")
@SpringBootApplication
@Import(DataSourceConfig.class)
public class GtuApplication {

    public static void main(String[] args) {
        SpringApplication.run(GtuApplication.class, args);
    }
}
