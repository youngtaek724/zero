package com.example.app.repository;

import com.example.app.domain.vo.BoardVO;
import com.example.app.domain.vo.ReplyVO;
import com.example.app.mapper.BoardMapper;
import com.example.app.mapper.ReplyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardDAO {
    private final BoardMapper boardMapper;

    public BoardVO findBoard(Long boardNumber){ return boardMapper.select(boardNumber);}
}





















