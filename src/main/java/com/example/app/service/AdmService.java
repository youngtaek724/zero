package com.example.app.service;

import com.example.app.domain.vo.*;
import com.example.app.repository.BoardDAO;
import com.example.app.repository.MenuDAO;
import com.example.app.repository.ProductDAO;
import com.example.app.repository.UserDAO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.awt.image.CropImageFilter;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AdmService {
    private final ProductDAO productDAO;
    private final MenuDAO menuDAO;
    private final UserDAO userDAO;
    private final BoardDAO boardDAO;

    // 회원 전체 조회
    public List<UserVO> findAllUser(Criteria criteria){
        List<UserVO> arr = userDAO.showAll(criteria);
        for(int i = 0; i<arr.size(); i++){
            if(arr.get(i).getUserRegidate()==null){
                arr.get(i).setUserRegidate("-");
            }
       }
        return arr;
    }

    // 회원 수 조회
    public int getTotal(){return userDAO.getTotal();}

    // Admin 페이지 전체 상품 조회
    public List<ProductVO> fintAllProduct(Criteria criteria){return productDAO.showAllProduct(criteria);}
    // Admin 페이지 전체 상품 조회
    public List<ProductVO> fintAllProduct2(Criteria criteria, String cmdCd, String text){
        switch (cmdCd) {
            case "전체" :
                cmdCd = "PRO_ID";
                break;
            case "카테고리":
                cmdCd = "PRO_CATEGORYID";
                break;
            case "상품명":
                cmdCd = "PRO_NAME";
                break;
            case "진열여부":
                cmdCd = "PRO_SHOWYN";
                break;
            case "타입":
                cmdCd = "PRO_TYPE";
                break;
            default:
                cmdCd = "PRO_ID";
        }
        if(text.equals("")) {
            return productDAO.showAllProduct2(criteria, cmdCd);
        }else{
            text = "%"+text+"%";
            return productDAO.showAllProduct3(criteria, cmdCd, text);
        }
    }

    // Admin 페이지 전체 상품 개수
    public int getProTotal(){return productDAO.getProTotal();}

    // Serial 전체 조회
    public List<SerialVO> showAllSerial(Criteria criteria){ return productDAO.showAllSerial(criteria); }

    // 댓글 test
    public BoardVO showBoard(Long boardNumber){return  boardDAO.findBoard(boardNumber);}
}
