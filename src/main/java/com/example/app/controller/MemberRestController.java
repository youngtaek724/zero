package com.example.app.controller;

import com.example.app.domain.vo.*;
import com.example.app.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/login/*")
public class MemberRestController {
    private final ReplyService replyService;
    private final MemberService memberService;

    @PostMapping("/login")
    public int login(@RequestBody MemberVO memberVO){
        return memberService.login(memberVO);
    }
}























