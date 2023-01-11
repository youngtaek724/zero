package com.example.app.service;

import com.example.app.domain.vo.*;
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

    // 장바구니 목록 전체 조회
    public List<CartDTO> showAll(int userNumber){return cartDAO.showAll(userNumber);}

    // 카테고리 조회
    public List<CartDTO> showCategory(int userNumber){return cartDAO.selectCategory(userNumber);}

    // 장바구니 검사
    public int checkCart(int proId){return cartDAO.checkCart(proId);}

    // 장바구니 삭제
    public void deleteCart(CartVO cartVO){cartDAO.deleteCart(cartVO);}

}
