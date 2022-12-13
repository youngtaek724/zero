package com.example.app.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class CmdList {
    private String cmd0 = "전체";
    private String cmd1 = "카테고리";
    private String cmd2 = "상품명";
    private String cmd3 = "진열여부";
    private String cmd4 = "타입";
    private String text ;
    private String roomCnt;

    public String getRoomCnt() {
        return roomCnt;
    }

    public void setRoomCnt(String roomCnt) {
        this.roomCnt = roomCnt;
    }
}
