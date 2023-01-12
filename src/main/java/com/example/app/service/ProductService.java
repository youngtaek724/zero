package com.example.app.service;

import com.example.app.domain.vo.*;
import com.example.app.repository.BoardDAO;
import com.example.app.repository.FileDAO;
import com.example.app.repository.MenuDAO;
import com.example.app.repository.ProductDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductDAO productDAO;
    private final MenuDAO menuDAO;
    private final BoardDAO boardDAO;
    private final FileDAO fileDAO;

    public List<ProductVO> showAll(){ return productDAO.showAll(); }
    // 상품 등록
    public void save(ProductDTO productDTO){
        productDAO.save(productDTO);
        List<FileVO> files = productDTO.getFiles();
    // Optional : 검증
        Optional.ofNullable(files).ifPresent(fileList->{
            fileList.forEach(file->{
                file.setProId(productDTO.getProId());
                fileDAO.save((file));
            });
        });
    }
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

    // List 페이지 product 조건별 조회
    public List<ProductVO> showProductByCondition(String code){
        // 01 : 최신순 , 02 : 판매량 수,  03: 낮은 가격순, 04 : 높은 가격순
        String condition;
        switch (code){
            case "01" :
                condition = "PRO_INDATE DESC";
                break;
            case "02" :
                condition = "PRO_NAME";  // 판매량 순으로 수정
                break;
            case "03" :
                condition = "PRO_OUTPUT";
                break;
            case "04" :
                condition = "PRO_OUTPUT DESC";
                break;
            default:condition="PRO_INDATE DESC";
        }

        return productDAO.showProductByCondition(condition);
    }

    // 카테고리 가져오기
    public List<CategoryVO> showCategory(){
        return productDAO.showCategory();
    }

    // 상품 가져오기
    public int getProduct(){return productDAO.getCount();}
}
