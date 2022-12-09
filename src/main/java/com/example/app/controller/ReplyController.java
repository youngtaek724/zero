package com.example.app.controller;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.ReplyVO;
import com.example.app.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reply/*")
public class ReplyController {
    private final ReplyService replyService;

//  추가
    @PostMapping("/new")
    public String write(@RequestBody ReplyVO replyVO){
        replyService.register(replyVO);
        return "write success";
    }

//  전체 조회
    @GetMapping("/{boardNumber}")
    public List<ReplyVO> list(@PathVariable("boardNumber") Long boardNumber, Criteria criteria){
        return replyService.showAll(boardNumber,criteria);
    }
}
