package com.sparta.kch.springrest.repositories;

import com.sparta.kch.springrest.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
