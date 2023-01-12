package com.example.app.mapper;

import com.example.app.domain.vo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {
// 파일 추가
    public void insert(FileVO fileVO);

// 파일 삭제
    public void delete(int proId);

// 파일 조회
    public List<FileVO> selectAll(int proId);
}
