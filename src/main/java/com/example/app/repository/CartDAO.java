package com.example.app.repository;

import com.example.app.domain.vo.CartVO;
import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.ProductVO;
import com.example.app.domain.vo.SerialVO;
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

}
