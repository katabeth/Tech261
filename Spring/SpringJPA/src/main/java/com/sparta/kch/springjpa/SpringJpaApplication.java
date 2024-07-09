package com.sparta.kch.springjpa;

import com.sparta.kch.springjpa.entities.AuthorEntity;
import com.sparta.kch.springjpa.repositories.AuthorRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

@SpringBootApplication  // Tells where the main method is
                        // Meta Annotation
public class SpringJpaApplication {
    private static final Logger logger = Logger.getLogger(SpringBootApplication.class.getName());
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }


    // Bean -> AuthorRepo --> Class/CommandLineRunner --> Class/AuthorRepo --> object of both --> runner(repo)
    @Bean // Object that Spring will create
    public CommandLineRunner runner(AuthorRepo repo){
        return args -> { // Anonymous Inner Class
            logger.info("Hello from CommandLineRunner");
            logger.warning("Here is another line");
            // logger.info(repo.findAll().toString());
            // logger.info(repo.findById(1).orElseThrow().toString());
        };
    }
}
