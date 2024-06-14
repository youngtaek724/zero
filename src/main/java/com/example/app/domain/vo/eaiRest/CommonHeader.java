package com.example.app.domain.vo.eaiRest;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public interface CommonHeader {
    String getIfId();
    String getIfVer();
    String getIfSenderGrp();
    String getIfSender();
    String getIfReceiverGrp();
    String getIfReceiver();
    String getIfTrackingId();
    String getIfDateTime();

    void setIfId(String ifId);
    void setIfVer(String ifVer);
    void setIfSenderGrp(String ifSenderGrp);
    void setIfSender(String ifSender);
    void setIfReceiverGrp(String ifReceiverGrp);
    void setIfReceiver(String ifReceiver);
    void setIfTrackingId(String ifTrackingId);
    void setIfDateTime(String ifDateTime);
}
