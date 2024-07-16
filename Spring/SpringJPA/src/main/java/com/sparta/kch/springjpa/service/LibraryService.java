package com.sparta.kch.springjpa.service;

import com.sparta.kch.springjpa.entities.AuthorEntity;
import com.sparta.kch.springjpa.entities.BookEntity;
import com.sparta.kch.springjpa.repositories.AuthorRepo;
import com.sparta.kch.springjpa.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class LibraryService {

    private AuthorRepo authorRepo;
    private BookRepo bookRepo;

    @Autowired
    public LibraryService(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    // SQL -> Heavy Repositories
    // SPeL -> Heavy Repositories
    // Service Layers
    // Write a method to find a list of all authors which only have 1 book

//    public List<String> authorsWithOnly1Book() {
//        List<String> books = new List();
//        books = bookRepo.findAll().stream().filter() // AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
//                .distinct().collection(toList);
//        return books;
//    }
        // get book.author_id's that are only used once
        // Loop through all books. Adds author ID
        // If author ID is present only once then remember




}
