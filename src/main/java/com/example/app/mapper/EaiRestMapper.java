package com.example.app.mapper;

import com.example.app.domain.vo.Criteria;
import com.example.app.domain.vo.UserVO;
import com.example.app.domain.vo.eaiRest.InterfaceHistVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface EaiRestMapper {

    // user 전체 조회
    public List<UserVO> selectAll(Criteria criteria);

    // user Insert
    public void insertUser(String data1, String data2, String data3, String data4);
    public void insertSummaryByTrackingId(InterfaceHistVO interfaceHistVO);
}
