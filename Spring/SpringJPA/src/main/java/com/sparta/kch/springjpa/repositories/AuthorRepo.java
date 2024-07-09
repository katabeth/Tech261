package com.sparta.kch.springjpa.repositories;

import com.sparta.kch.springjpa.entities.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Spring automatically implements interfaces
@Repository
public interface AuthorRepo extends JpaRepository<AuthorEntity, Integer> {

    // methods


}
