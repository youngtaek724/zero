package com.example.app.service;

import com.example.app.domain.vo.InquiryVO;
import com.example.app.repository.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.List;
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardDAO boardDAO;

    // 문의글 추가
    public void insertInq(InquiryVO inquiryVO){
        String text = inquiryVO.getInqContent();
        System.out.println(text);
        System.out.println(text.replaceAll("\r\n","<BR>"));
        boardDAO.insertInq(inquiryVO);
    }
    // 문의글 조회
    public List<InquiryVO> showAllInquiry(int inqProductId){
        return boardDAO.selectAllInquiry(inqProductId);
    }
}
