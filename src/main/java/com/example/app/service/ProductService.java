package com.example.app.service;

import com.example.app.domain.vo.MenuVO;
import com.example.app.domain.vo.ProductVO;
import com.example.app.repository.MenuDAO;
import com.example.app.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductDAO productDAO;
    private final MenuDAO menuDAO;
    public List<ProductVO> showAll(){ return productDAO.showAll(); }

    // 메뉴
    public List<MenuVO> showMenu(){return menuDAO.showMenu();}

    // 상품 세부정보
    public ProductVO showProductDetail(int proId) throws ParseException {
        ProductVO productVO = productDAO.findProductDetail(proId);
        String date = productVO.getProInDate();
        String year = date.substring(2,4);
        String month = date.substring(5,7);

        if(month.charAt(0)=='0'){
            month = month.substring(1,2);
        }

        productVO.setProInDate(year+"년 "+month+"월");
        return productVO;
    }

}
