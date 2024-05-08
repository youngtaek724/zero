package com.example.app.mapper;

import com.example.app.domain.vo.CartDTO;
import com.example.app.domain.vo.CartVO;
import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface CartMapper {

    // 상품 장바구니 담기
    public void insertCart(CartVO cartVO);

    // 장바구니 전체 조회
    public List<CartDTO> selectAll(int userNumber);

    // 장바구니 카테고리 목록
    public List<CartDTO> selectCategory(int userNumber);

    // 장바구니 검사
    public int checkCart(CartVO cartVO);
    // 장바구니 삭제
    public void deleteCart(CartVO cartVO);
}
