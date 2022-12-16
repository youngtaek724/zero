package com.example.app.mapper;

import com.example.app.domain.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
//    추가
//    public void insert(BoardDTO boardDTO);

    // 조회
    public BoardVO select (Long boardNumber);
}
