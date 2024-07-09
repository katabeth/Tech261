package com.sparta.kch.springjpa;

import com.sparta.kch.springjpa.entities.AuthorEntity;
import com.sparta.kch.springjpa.repositories.AuthorRepo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class SpringJpaApplicationTests {

    @Autowired
    AuthorRepo repo;

    @Test
    @DisplayName("Check that I can see all Authors")
    void checkThatICanSeeAllAuthors() {
        System.out.println(repo.findAll());
    }
    @Bean
    public String katTime(AuthorRepo repo){
        AuthorEntity newAuthor = new AuthorEntity();
        newAuthor.setFullName("Pierce Brown");
        repo.save(newAuthor);
        repo.deleteById(4);
        return repo.findById(1).orElseThrow().toString();
    }



}
