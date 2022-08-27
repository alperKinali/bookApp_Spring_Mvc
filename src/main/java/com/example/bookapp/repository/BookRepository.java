package com.example.bookapp.repository;

import com.example.bookapp.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository  extends PagingAndSortingRepository<Book,Long> {
}
