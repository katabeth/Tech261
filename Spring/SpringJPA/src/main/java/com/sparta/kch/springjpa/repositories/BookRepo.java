package com.sparta.kch.springjpa.repositories;

import com.sparta.kch.springjpa.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}
