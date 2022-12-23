package com.example.app.mapper;

import com.example.app.domain.vo.BoardVO;
import com.example.app.domain.vo.InquiryVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
@Mapper
public interface BoardMapper {
//    추가
//    public void insert(BoardDTO boardDTO);

    // 조회
    public BoardVO select (Long boardNumber);

    // 문의글 추가(유저)
    public void insertInquiry(InquiryVO inquiryVO);

    // 문의글 조회
    public List<InquiryVO> selectAllInquiry(int inqProductId);
}
