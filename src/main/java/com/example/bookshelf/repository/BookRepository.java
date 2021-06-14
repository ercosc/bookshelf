package com.example.bookshelf.repository;

import com.example.bookshelf.model.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, String>{
    Book findBookByBookId(long id);
    
}
