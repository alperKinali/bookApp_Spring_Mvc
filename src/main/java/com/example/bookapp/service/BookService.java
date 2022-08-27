package com.example.bookapp.service;

import com.example.bookapp.model.Book;
import com.example.bookapp.repository.BookRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public Page<Book> getPagesOfBooks(Pageable page) {
        return bookRepository.findAll(page);
    }

    public Optional<Book> getById(Long id) {
        return bookRepository.findById(id);
    }
}
