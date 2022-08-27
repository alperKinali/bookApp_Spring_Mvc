package com.example.bookapp.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Setter
@Getter
public class ReservationCreateDto {

    private Long memberId;
    private Set<Long> bookIds;
    // rezervasyonu create ederken bunlarla create ederim.

    // 1)bu dto'yu reservation'a dönüştürmem gerekiyor(Reservation Entitiy si üretilmesi gerek.)
    // 2) buradaki gönderilen id'lerin var olup olmadığını kontrol ettirmemiz gerekiyor.
}
