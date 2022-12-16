package com.example.app.service;

import com.example.app.domain.vo.MenuVO;
import com.example.app.domain.vo.ProductVO;
import com.example.app.repository.MenuDAO;
import com.example.app.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductDAO productDAO;
    private final MenuDAO menuDAO;
    public List<ProductVO> showAll(){ return productDAO.showAll(); }

    // 메뉴
    public List<MenuVO> showMenu(){return menuDAO.showMenu();}

    //

}
