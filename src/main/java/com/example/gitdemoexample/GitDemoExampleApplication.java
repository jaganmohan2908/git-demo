package com.example.gitdemoexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(GitDemoExampleApplication.class, args);
    }

    public static void addData(String data) {
        if (data.equals("test")) {
            System.out.println("data .." + data);
        } else {
            System.out.println("added  .else block.");

        }
    }
}
