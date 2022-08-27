package com.example.bookapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Member {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private LocalDate birthDate;
    private  LocalDate membershipDate;

    @OneToMany(mappedBy = "member")
    private List<Reservation> reservations;
    // bir üyenin birden fazla rezervasyonu olabili .

    // member yaratırken bu rexervasyon kısmını dönmemeliyiz bu şekilde
    // bu circler dependency'e neden olur.
    // normalda oluşturulacak olan member api'sinden ihtiyaç  name surname birthdate yapılarıdır.
    // api'nin ihtiyacı neyse ona uygun bir dto yaratılmalı
    // ve entity return edilmeden önce o dto 'ya çevrilmeli sonra return edilmedi





}
