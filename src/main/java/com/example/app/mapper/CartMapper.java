package com.example.app.mapper;

import com.example.app.domain.vo.CartVO;
import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CartMapper {

    // 상품 장바구니 담기
    public void insertCart(CartVO cartVO);
}
