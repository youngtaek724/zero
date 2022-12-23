package com.example.app.service;

import com.example.app.domain.vo.CartVO;
import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.ReplyVO;
import com.example.app.domain.vo.SerialVO;
import com.example.app.repository.CartDAO;
import com.example.app.repository.ReplyDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CartService {
    private final CartDAO cartDAO;

    // 장바구니 추가
    public void insertCart(CartVO cartVO){ cartDAO.insertCart(cartVO);}

}
