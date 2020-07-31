package com.giangnt.bookrestapi.service;

import com.giangnt.bookrestapi.domain.Book;

import java.util.Collection;

public interface BookService {
    Collection<Book> findAll();

    Book findById(Long id);

    Book save(Book book);

    Book update(Book book);

    Book delete(Long id);
}
