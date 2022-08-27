package com.example.bookapp.controller.dto;

import com.example.bookapp.model.Book;
import lombok.Setter;

@Setter
public class BookCreateDto {

    // create etmek istediğimiz değere göre create edeilm.
    private String name;
    private int pageCount;
    private String authors;

    // buranın sorumluluğu gelen requestlerdeki datayı taşımak ve tutmak

    public Book toBook(){
        return Book.builder()
                .authors(this.authors)
                .pageCount(this.pageCount)
                .name(this.name)
                .build();

    }
}
