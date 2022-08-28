package com.pado.selfspringbatchpractice;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableBatchProcessing
@SpringBootApplication
public class SelfSpringbatchPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelfSpringbatchPracticeApplication.class, args);
    }

}
