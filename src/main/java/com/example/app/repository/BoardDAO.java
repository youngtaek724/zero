package com.example.app.repository;

import com.example.app.domain.vo.BoardVO;
import com.example.app.domain.vo.InquiryVO;
import com.example.app.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;

    public BoardVO findBoard(Long boardNumber){ return boardMapper.select(boardNumber);}

    // 문의글 추가
    public void insertInq(InquiryVO inquiryVO){
        boardMapper.insertInquiry(inquiryVO);
    }
    // 문의글 조회
    public List<InquiryVO> selectAllInquiry(int inqProductId){ return boardMapper.selectAllInquiry(inqProductId);}

}





















