package com.giangnt.bookrestapi.service.impl;

import com.giangnt.bookrestapi.domain.Book;
import com.giangnt.bookrestapi.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    private Long bookId = 100L;
    private Map<Long, Book> bookMap = new HashMap<Long, Book>();

    {
        Book book = new Book();
        book.setId(bookId);
        book.setTitle("Lão Hạc");
        book.setAuthor("Nam Cao");
        book.setIsbnNumber(1234567890L);
        book.setCoverPhotoURL("");
        book.setPrice(13.500);
        book.setLanguage("Tiếng Việt");
        bookMap.put(book.getId(), book);
    }

    /*
    * Hàm trả về toàn bộ danh sách
    * */
    @Override
    public Collection<Book> findAll() {
        return bookMap.values();
    }

    /*
    * Hàm trả về đối tượng theo ID truyền vào
    * */
    @Override
    public Book findById(Long id) {
        return bookMap.get(id);
    }

    @Override
    public Book save(Book book) {
        Long newBookId = ++bookId;
        book.setId(newBookId);
        bookMap.put(book.getId(), book);
        return bookMap.get(newBookId);
    }

    @Override
    public Book update(Book book) {
        bookId = book.getId();
        if (bookMap.get(bookId) != null) {
            bookMap.put(bookId, book);
            return bookMap.get(bookId);
        }
        return null;
    }

    @Override
    public Book delete(Long id) {
        if (bookMap.get(id) != null) {
            return bookMap.remove(id);
        }
        return null;
    }
}
