package com.example.app.repository;

import com.example.app.domain.vo.AddressVO;
import com.example.app.domain.vo.BoardVO;
import com.example.app.domain.vo.InquiryVO;
import com.example.app.mapper.AddressMapper;
import com.example.app.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AddressDAO {
    private final AddressMapper addressMapper;

    // 배송지 추가
    public void insertAddress(AddressVO addressVO){addressMapper.insertAddress(addressVO);}

    // 배송지 조회
    public List<AddressVO> selectAll(int userNumber){return addressMapper.selectAll(userNumber);}

    // 배송지 초기화
    public void update(int userNumber){addressMapper.update(userNumber);}

}





















