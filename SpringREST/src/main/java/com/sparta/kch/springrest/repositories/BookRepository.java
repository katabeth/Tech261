package com.sparta.kch.springrest.repositories;

import com.sparta.kch.springrest.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
