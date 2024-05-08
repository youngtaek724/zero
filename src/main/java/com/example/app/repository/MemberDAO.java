package com.example.app.repository;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.MemberVO;
import com.example.app.domain.vo.UserVO;
import com.example.app.mapper.MemberMapper;
import com.example.app.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
//    private final BoardMapper boardMapper;
    private final MemberMapper memberMapper;


    public MemberVO login(MemberVO memberVO){
        return memberMapper.login(memberVO);
    }

    public void updateLastLogin(int userNumber) { memberMapper.updateLastLogin(userNumber);}

}
