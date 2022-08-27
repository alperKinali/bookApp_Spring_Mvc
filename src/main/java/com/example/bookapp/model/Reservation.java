package com.example.bookapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {


    @Id
    @GeneratedValue
    private long id;
    private LocalDate reservationOn;

    @ManyToOne
    @JoinColumn(name = "member_id",referencedColumnName = "id")
    private Member member;
    // birden fazla rezervasyonun bir üyesi olabilir.


    // birden fazla kitapın birden fazla rezervasyonu da olabilir.
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "reservation_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "book_id",referencedColumnName = "id") )
    private List<Book> books;

}
