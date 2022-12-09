package com.example.app.mapper;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {

    // user 전체 조회
    public List<UserVO> selectAll(Criteria criteria);

    // Admin User 전체 수
    public int getTotal();
}
