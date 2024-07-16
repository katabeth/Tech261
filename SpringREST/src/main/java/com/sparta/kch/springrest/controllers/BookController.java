package com.sparta.kch.springrest.controllers;

import com.sparta.kch.springrest.entities.Author;
import com.sparta.kch.springrest.entities.Book;
import com.sparta.kch.springrest.exceptions.ResourceNotFoundException;
import com.sparta.kch.springrest.repositories.AuthorRepository;
import com.sparta.kch.springrest.repositories.BookRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepo;
    private final AuthorRepository authorRepo;
    public BookController(BookRepository bookRepo, AuthorRepository authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }
    @GetMapping
    public List<Book> getBooks(){
        return bookRepo.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookByID(@PathVariable Integer id){
        Book book = bookRepo.findById(id).orElse(null);
        if (book == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(book, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book, HttpServletRequest request) {
        if (book.getAuthor().getId() == null) {
            authorRepo.save(book.getAuthor());
        } else if (!authorRepo.existsById((book.getAuthor().getId()))) {
            //return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            throw new ResourceNotFoundException("Author with id "+book.getAuthor().getId()+" not found");
        }
        bookRepo.save(book);
        URI location = URI.create(request.getRequestURL().toString()+"/"+book.getId());
        return ResponseEntity.created(location).body(book);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Integer id, @RequestBody Book book){
        // Check two ids match
        if (!id.equals(book.getId())){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        // check book exists
        } else if (!bookRepo.existsById(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        // Check provided book has an author
        } else if (book.getAuthor() == null) {
            throw new ResourceNotFoundException("No Author Provided");
        // Check if the Author has an id and creates it if not
        } else if (book.getAuthor().getId() == null) {
            authorRepo.save(book.getAuthor());
        // Check the provided Author id exists
        } else if (!authorRepo.existsById((book.getAuthor().getId()))) {
            throw new ResourceNotFoundException("Author with id "+book.getAuthor().getId()+" not found");
        // Checks id vs name of author
        } else if (!authorRepo.findById(book.getAuthor().getId()).orElseThrow().getFullName().equals(book.getAuthor().getFullName())) {
            throw new ResourceNotFoundException("Author id doesnt match Name");
        }
        bookRepo.save(book);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
        // Find the book
        // If not found, return not found
        if (!bookRepo.existsById(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        bookRepo.deleteById(id);
        // Return No Content
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
