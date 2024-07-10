package com.sparta.kch.springjpa.repositories;

import com.sparta.kch.springjpa.entities.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepo extends JpaRepository<BookEntity, Integer> {


    @Query(value = "select * from library.books where books.title like ?1", nativeQuery = true)
    List<BookEntity> findByTitle(String name);

    @Query(value = "select books.* from library.books join library.authors on authors.author_id = books.author_id where library.authors.full_name like ?1 ", nativeQuery = true)
    List<BookEntity> findByAuthorName(String author);


    //List<BookEntity> findByAuthorID(int id);
    List<BookEntity> findBookEntityByAuthor_Id(int id);
    //List<BookEntity> updateBookByTitle(String title);
}
