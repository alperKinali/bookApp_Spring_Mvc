package com.example.bookapp.controller.dto;

import com.example.bookapp.model.Book;
import com.example.bookapp.model.Member;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class ReservationDto {

    private long id;
    private LocalDate reservationOn;
    private MemberDto member;
    private List<BookDto> books;
}