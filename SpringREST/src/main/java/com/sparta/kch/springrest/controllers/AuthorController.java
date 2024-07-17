package com.sparta.kch.springrest.controllers;

import com.sparta.kch.springrest.entities.Author;
import com.sparta.kch.springrest.repositories.AuthorRepository;
import com.sparta.kch.springrest.repositories.BookRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    private final AuthorRepository authorRepo;
    private final BookRepository bookRepo;

    public AuthorController(@Autowired AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepo = authorRepository;
        this.bookRepo = bookRepository;
    }

    @GetMapping
    public List<Author> getAuthors(){
        return authorRepo.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Author> getAuthorByID(@PathVariable Integer id){
        Author author = authorRepo.findById(id).orElse(null);
        if (author == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(author, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody @Valid Author author, HttpServletRequest request){
        if (authorRepo.existsById(author.getId())){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        authorRepo.save(author);

        URI location = URI.create(request.getRequestURL().toString() + "/" +author.getId());
        return ResponseEntity.created(location).body(author);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Author> updateAuthor(@PathVariable Integer id, @RequestBody Author author){
        // Check if id is the same as the id of the json we're putting in the body
        // If not, return bad request
        if (!id.equals(author.getId())){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        // Find the author
        // If not found, return not Found
        if (!authorRepo.existsById(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        // Replace existing author in the database with the putted author
        authorRepo.save(author);
        // Return No Content
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable Integer id){
        // Find the author
        // If not found, return not found
        if (!authorRepo.existsById(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        // If author has books, return CONFLICT
//        bookRepo.findAll().stream()
//                .filter(book -> book.getAuthor().equals(authorRepo.findById(id).orElseThrow()))
//                .forEach(bookRepo::delete);
        if (bookRepo.findAll().stream().anyMatch(book -> book.getAuthor().equals(authorRepo.findById(id).orElseThrow()))){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        authorRepo.deleteById(id);
        // Return No Content
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
