package com.sparta.kch.springjpa;

import com.sparta.kch.springjpa.entities.AuthorEntity;
import com.sparta.kch.springjpa.entities.BookEntity;
import com.sparta.kch.springjpa.repositories.AuthorRepo;
import com.sparta.kch.springjpa.repositories.BookRepo;
import com.sparta.kch.springjpa.service.LibraryService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
class SpringJpaApplicationTests {

        @Autowired
        AuthorRepo authorRepo;
        @Autowired
        BookRepo bookRepo;
    // Create
    // Read
    // Update
    // Delete
    @Test
    @DisplayName("Check that I can see all Authors")
    void checkThatICanSeeAllAuthors() {
        System.out.println(authorRepo.findAll());
    }

    @Test
    @DisplayName("Check that I can see all Books")
    void checkThatICanSeeAllBooks() {
        System.out.println(bookRepo.findAll());
    }

    @Test
    @DisplayName("Check I can find an author by name")
    void checkThatICanFindAuthorByName() {
        String test = authorRepo.findByFullName("Elizabeth").getFirst().getFullName();

        Assertions.assertEquals(test, "Elizabeth");
    }

    @Test
    @DisplayName("Test search by book title")
    void testSearchByBookTitle() {
        String test = bookRepo.findByTitle("The History of Me").getFirst().getTitle();
        Assertions.assertEquals(test, "The History of Me");
    }
    @Order(1)
    @Test
    @DisplayName("Test Adding Authors")
    void testAddingAuthors() {
        AuthorEntity kat = new AuthorEntity();
        kat.setFullName("Kat");
        authorRepo.save(kat);
        String test = authorRepo.findByFullName("Kat").getFirst().getFullName();
        Assertions.assertEquals(test, "Kat");
    }

    @Order(2)
    @Test
    @DisplayName("Test deleting authors")
    void testDeletingAuthors() {
        authorRepo.deleteAll(authorRepo.findByFullName("Kat"));
        Assertions.assertTrue(authorRepo.findByFullName("Kat").isEmpty());
    }

    @Test
    @DisplayName("Test I can search books by Author ID")
    @Transactional
    void testSearchByAuthorID() {
        String test = bookRepo.findBookEntityByAuthor_Id(1).getFirst().getTitle();
        Assertions.assertEquals(test, "The History of Me");
    }

    @Test
    @DisplayName("Test search books by author name")
    @Transactional
    void testSearchByAuthorName() {
        String test = bookRepo.findByAuthorName("Katherine").getFirst().getTitle();
        Assertions.assertEquals(test, "The History of Me");
    }

    @Test
    void testServiceLayer(){
        LibraryService.authorsWithOnly1Book();
    }

}
