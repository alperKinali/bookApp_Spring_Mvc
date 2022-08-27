package com.example.bookapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private long id;

    @Column(unique = true)
    private String name;
    private int pageCount;
    private String authors;

    @ManyToMany(mappedBy = "books")
    private List<Reservation> reservations;



}
