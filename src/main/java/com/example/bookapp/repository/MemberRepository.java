package com.example.bookapp.repository;

import com.example.bookapp.model.Member;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberRepository  extends PagingAndSortingRepository<Member ,Long> {

}
