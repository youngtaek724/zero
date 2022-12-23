package com.example.app.mapper;

import com.example.app.domain.vo.AddressVO;
import com.example.app.domain.vo.BoardVO;
import com.example.app.domain.vo.InquiryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AddressMapper {

    // 주소 추가
    public void insertAddress(AddressVO addressVO);

    // 주소 조회
    public List<AddressVO> selectAll(int userNumber);

    // 배송지 N으로 변경
    public void update(int userNumber);
}
