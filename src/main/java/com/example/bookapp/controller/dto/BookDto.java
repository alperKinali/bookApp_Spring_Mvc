package com.example.bookapp.controller.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Data
@Builder
public class BookDto {
    // buradaki dto'da hepsini al.
    private long id;
    private String name;
    private int pageCount;
    private String authors;

}
