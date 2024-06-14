package com.example.app.service;

import com.example.app.domain.vo.*;
import com.example.app.domain.vo.eaiRest.InterfaceHistVO;
import com.example.app.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EaiRestService {
    private final ProductDAO productDAO;
    private final MenuDAO menuDAO;
    private final UserDAO userDAO;
    private final BoardDAO boardDAO;
    private final EaiRestDAO eaiRestDAO;


    // 유저 추가
    public void insertUser(String data1, String data2, String data3, String data4){
        eaiRestDAO.insertUser(data1, data2, data3, data4);
    }

    public void insertSummaryByTrackingId(InterfaceHistVO interfaceHistVO){

    }
}
