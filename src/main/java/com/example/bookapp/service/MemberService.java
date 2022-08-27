package com.example.bookapp.service;

import com.example.bookapp.model.Member;
import com.example.bookapp.repository.MemberRepository;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member create(Member member) {
        return memberRepository.save(member);
    }

    public Optional<Member> getMemberById(long memberId) {
        return memberRepository.findById(memberId);
    }
}
