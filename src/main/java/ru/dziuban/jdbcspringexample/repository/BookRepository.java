package ru.dziuban.jdbcspringexample.repository;

import ru.dziuban.jdbcspringexample.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();

    Book getBookById(Long id);
}
