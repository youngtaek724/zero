package com.example.app.service;

import com.example.app.domain.vo.AddressVO;
import com.example.app.domain.vo.MemberVO;
import com.example.app.repository.AddressDAO;
import com.example.app.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberDAO memberDAO;
    public MemberVO login(MemberVO memberVO){
        return memberDAO.login(memberVO);
    }

    public void updateLastLogin(int userNumber) { memberDAO.updateLastLogin(userNumber);}

}
