package com.example.app.repository;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.ProductVO;
import com.example.app.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDAO {
//    private final BoardMapper boardMapper;
    private final ProductMapper productMapper;

    public List<ProductVO> showAll(){ return productMapper.showAll(); }

    // Admin 페이지 전체 상품 조회
    public List<ProductVO> showAllProduct3(Criteria criteria, String cmdCd, String text){ return productMapper.showAllProduct3(criteria, cmdCd, text);}
    // Admin 페이지 전체 상품 조회
    public List<ProductVO> showAllProduct(Criteria criteria){ return productMapper.showAllProduct(criteria);}
    // Admin 페이지 전체 상품 조회
    public List<ProductVO> showAllProduct2(Criteria criteria, String cmdCd){ return productMapper.showAllProduct2(criteria, cmdCd);}

    // Admin 페이지 전체 상품 개수
    public int getProTotal() {return  productMapper.getProTotal();}
}
