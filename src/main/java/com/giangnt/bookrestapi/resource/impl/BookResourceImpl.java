package com.giangnt.bookrestapi.resource.impl;

import com.giangnt.bookrestapi.domain.Book;
import com.giangnt.bookrestapi.resource.Resource;
import com.giangnt.bookrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/books")
public class BookResourceImpl implements Resource<Book> {
    @Autowired
    private BookService bookService;

    @Override
    public ResponseEntity<Collection<Book>> findAll() {
        return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> findById(Long id) {
        return new ResponseEntity<>(bookService.findById(id), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> save(Book book) {
        return new ResponseEntity<>(bookService.save(book), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Book> update(Book book) {
        return new ResponseEntity<>(bookService.update(book), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Book> delete(Long id) {
        return new ResponseEntity<>(bookService.delete(id), HttpStatus.OK);
    }
}
