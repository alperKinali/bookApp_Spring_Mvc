package com.example.bookapp.controller.dto;

import com.example.bookapp.model.Member;
import lombok.Setter;

import java.time.LocalDate;

@Setter
public class MemberCreateDto {

    private String name;
    private String surname;
    private LocalDate birthDate;

    public Member toMember() {
        return Member.builder()
                .name(this.name)
                .surname(this.surname)
                .birthDate(this.birthDate)
                .build();
    }
}
