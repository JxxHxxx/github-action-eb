package com.jxx.githubactioneb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GithubActionEbApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionEbApplication.class, args);
    }

}
