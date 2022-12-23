package com.example.app.controller;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.InquiryVO;
import com.example.app.domain.vo.ReplyDTO;
import com.example.app.domain.vo.ReplyVO;
import com.example.app.service.BoardService;
import com.example.app.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/board/*")
public class BoardController {
    private final BoardService boardService;
    private final ReplyService replyService;

    //문의글 추가
    @PostMapping("/addInquiry")
    public String insertInquiry(@RequestBody InquiryVO inquiryVO){

        boardService.insertInq(inquiryVO);

        return "insert success";
    }
    // 문의글 조회
    @GetMapping("/readInquiry")
    public List<InquiryVO> readInquiry2(@RequestBody InquiryVO inquiryVO){
        return boardService.showAllInquiry(inquiryVO.getInqProductId());
    }


    // 문의글 조회
    @GetMapping("/readInquiry/{inqProductId}")
    public List<InquiryVO> readInquiry(@PathVariable("inqProductId") int inqProductId ){
        return boardService.showAllInquiry(inqProductId);
    }
    //    전체 조회
    @GetMapping("/list/{boardNumber}/{page}")
    public ReplyDTO list(@PathVariable("boardNumber") Long boardNumber, @PathVariable int page){
        return new ReplyDTO(replyService.showAll(boardNumber, new Criteria().create(page, 10)), replyService.count(boardNumber));
    }

    @PostMapping("/new")
    public String write(@RequestBody ReplyVO replyVO){
        replyService.register(replyVO);
        return "write success";
    }


}























