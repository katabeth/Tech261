package com.sparta.kch.springjpa.repositories;

import com.sparta.kch.springjpa.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//Spring automatically implements interfaces
@Repository
public interface AuthorRepo extends JpaRepository<AuthorEntity, Integer> {

    // methods
    @Query(value = "select * from library.authors where authors.full_name like ?1", nativeQuery = true)
    List<AuthorEntity> findByFullName(String name);  //Optional<entitytype> or List

    //JPQL
    //@Query(value = "select a from AuthorEntity where a.full_name = ?1", nativeQuery = false)
    //List<AuthorEntity> findByPartialName(String name);

    //Spring's expression language - SPEL
    List<AuthorEntity> findAuthorEntitiesByFullNameIgnoreCase(String fullName);
}
