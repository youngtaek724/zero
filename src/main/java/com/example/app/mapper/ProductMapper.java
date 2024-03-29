package com.example.app.mapper;

import com.example.app.domain.vo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
//    추가
//    public void insert(BoardDTO boardDTO);
// 전체 조회
    public List<ProductVO> showAll();
// 메뉴명 조회
    public List<MenuVO> showMenu();

// Admin 페이지 전체 상품 조회
    public List<ProductVO> showAllProduct(Criteria criteria);
// Admin 상품 전체 개수
    public int getProTotal();
    public List<ProductVO> showAllProduct2(Criteria criteria, String cmdCd);
    public List<ProductVO> showAllProduct3(Criteria criteria, String cmdCd, String text);
// Serial 전체 조회
    public List<SerialVO> selectAllSerial(Criteria criteria);
// Serial 전체 개수 조회
    public int getTotalSerial();
// product 상세 정보
    public ProductVO selectProduct(int proId);

// List 페이지 물품 전체(조건) 조회
    public List<ProductVO> selectIndate(String condition);

// 카테고리 이름 가져오기
    public List<CategoryVO> selectCategory();

// 상품 개수 가져오기
    public int countProudct();

// 상품 추가하기
    public void insertProduct(ProductDTO productDTO);

// 상품 삭제하기
    public void deleteProduct(int proId);
}
