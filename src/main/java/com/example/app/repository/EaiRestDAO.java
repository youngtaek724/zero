package com.example.app.repository;

import com.example.app.domain.vo.BoardVO;
import com.example.app.domain.vo.InquiryVO;
import com.example.app.domain.vo.eaiRest.InterfaceHistVO;
import com.example.app.mapper.BoardMapper;
import com.example.app.mapper.EaiRestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class EaiRestDAO {
    private final EaiRestMapper eaiRestMapper;
    // 유저 추가
    public void insertUser(String data1, String data2, String data3, String data4){eaiRestMapper.insertUser(data1,data2,data3,data4);}

    // 인터페이스 히스토리 추가(tb_adm_summary_by_trackingid)
    public void insertSummaryByTrackingId(InterfaceHistVO interfaceHistVO){
        eaiRestMapper.insertSummaryByTrackingId(interfaceHistVO);
    }
}





















