package com.example.app.service;

import com.example.app.domain.vo.AddressVO;
import com.example.app.domain.vo.InquiryVO;
import com.example.app.repository.AddressDAO;
import com.example.app.repository.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService {
    private final AddressDAO addressDAO;

    // 배송지 추가
    public void insertAddress(AddressVO addressVO){
        // 나중에 세션에서 아이디 값 가져오기
        if(addressVO.getBaseAddress().equals("Y")){addressDAO.update(2);}
        addressDAO.insertAddress(addressVO);
    }

    // 배송지 조회
    public List<AddressVO> showAll(int userNumber){return addressDAO.selectAll(userNumber);}

    // 배송지 초기화
    public void update(int userNumber){addressDAO.update(userNumber);}

    // 초기 배송지 조회
    public AddressVO findBase(int userNumber){ return addressDAO.findBase(userNumber); }

    // 배송지 삭제
    public void remove(int userNumber, String memberAddress3){addressDAO.deleteAddress(userNumber, memberAddress3);}
}
