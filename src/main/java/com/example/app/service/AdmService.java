package com.example.app.service;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.MenuVO;
import com.example.app.domain.vo.ProductVO;
import com.example.app.domain.vo.UserVO;
import com.example.app.repository.MenuDAO;
import com.example.app.repository.ProductDAO;
import com.example.app.repository.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.image.CropImageFilter;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdmService {
    private final ProductDAO productDAO;
    private final MenuDAO menuDAO;
    private final UserDAO userDAO;

    // 회원 전체 조회
    public List<UserVO> findAllUser(Criteria criteria){return userDAO.showAll(criteria);}

    // 회원 수 조회
    public int getTotal(){return userDAO.getTotal();}

    // Admin 페이지 전체 상품 조회
    public List<ProductVO> fintAllProduct(Criteria criteria){return productDAO.showAllProduct(criteria);}

    // Admin 페이지 전체 상품 개수
    public int getProTotal(){return productDAO.getProTotal();}
}
