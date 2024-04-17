package com.moon.bm.service;


import com.moon.bm.dto.MemberDTO;
import com.moon.bm.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void inputSignup(MemberDTO memberDTO) {
        memberRepository.inputSignup(memberDTO);
    }
}
