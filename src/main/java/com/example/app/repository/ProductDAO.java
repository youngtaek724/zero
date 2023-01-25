package com.example.app.repository;

import com.example.app.domain.vo.*;
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

    // Serial 전체 조회
    public List<SerialVO> showAllSerial(Criteria criteria){ return productMapper.selectAllSerial(criteria); }

    // Serial 전체 개수 조회
    public int getTotalSerial(){return productMapper.getTotalSerial();}

    // product 상세 조회
    public ProductVO findProductDetail(int proId){return  productMapper.selectProduct(proId);}

    // List product 조건 조회
    public List<ProductVO> showProductByCondition(String condition){return productMapper.selectIndate(condition);}

    // 카테고리 가져오기
    public List<CategoryVO> showCategory(){return productMapper.selectCategory();}

    // 상품 개수 가져오기
    public int getCount(){return productMapper.countProudct();}

    // 상품 등록하기
    public void save(ProductDTO productDTO){productMapper.insertProduct(productDTO);}

    // 상품 삭제하기
    public void delete(int proId){productMapper.deleteProduct(proId);}
}
