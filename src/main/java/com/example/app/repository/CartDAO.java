package com.example.app.repository;

import com.example.app.domain.vo.*;
import com.example.app.mapper.CartMapper;
import com.example.app.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CartDAO {

    private final CartMapper cartMapper;
    // 장바구니 추가
    public void insertCart(CartVO cartVO){cartMapper.insertCart(cartVO);}

    // 장바구니 전체 조회
    public List<CartDTO> showAll(int userNumber){return cartMapper.selectAll(userNumber);}

    // 장바구니 카테고리
    public List<CartDTO> selectCategory(int userNumber){return  cartMapper.selectCategory(userNumber);}

    // 장바구니 검사
    public int checkCart(CartVO cartVO){return  cartMapper.checkCart(cartVO);}
    // 장바구니 삭제
    public void deleteCart(CartVO cartVO){cartMapper.deleteCart(cartVO);}
}
