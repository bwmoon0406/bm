package com.moon.bm.controller;

import com.moon.bm.dto.MemberDTO;
import com.moon.bm.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/basketballmanager")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/signup")
    public String signup() {
        return "signup";
    }

    @PostMapping("/signup")
    public String inputSignup(MemberDTO memberDTO){
        memberService.inputSignup(memberDTO);
        return "redirect:/home";
    }
}
