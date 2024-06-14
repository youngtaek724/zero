package com.example.app.domain.vo.eaiRest;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.util.List;

@Component
@Data
@NoArgsConstructor
public class InterfaceHistVO {
    private String ifDate;
    private String ifId;
    private String ifVerNo;
    private String sendGrp;
    private String recvGrp;
    private String receiver;
    private String ifTrackingId;
    private Date eventTime;
    private String status;
    private Date procDt;
    private String bodyYn;
    private Double duration;
}
