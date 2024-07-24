package com.sparta.kch.springweb.repositories;

import com.sparta.kch.springweb.entites.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
