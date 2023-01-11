package com.example.app.mapper;

import com.example.app.domain.vo.MemberVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
    public Integer selectId(MemberVO memberVO);

    public void join(MemberVO memberVO);

    public int login(MemberVO memberVO);
}
