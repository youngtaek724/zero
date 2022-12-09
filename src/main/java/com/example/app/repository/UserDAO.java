package com.example.app.repository;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.ProductVO;
import com.example.app.domain.vo.UserVO;
import com.example.app.mapper.ProductMapper;
import com.example.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserDAO {
//    private final BoardMapper boardMapper;
    private final UserMapper userMapper;

    // Admin User 전체 조회
    public List<UserVO> showAll(Criteria criteria){ return userMapper.selectAll(criteria); }

    // Admin User 전체 수
    public int getTotal(){return  userMapper.getTotal(); }

}
