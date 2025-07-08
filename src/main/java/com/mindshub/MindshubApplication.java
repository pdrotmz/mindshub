package com.mindshub;

import com.mindshub.utils.DotenvInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MindshubApplication {

    public static void main(String[] args) {
        DotenvInitializer.loadEnv();
        SpringApplication.run(MindshubApplication.class, args);
    }

}
