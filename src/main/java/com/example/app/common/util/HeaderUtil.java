package com.example.app.common.util;

import com.example.app.domain.vo.EaiRestResponseDTO;
import com.example.app.domain.vo.eaiRest.CommonHeader;

public class HeaderUtil {

    public static <T extends CommonHeader> EaiRestResponseDTO.Request.Header createResponseHeader(T requestHeader) {
        EaiRestResponseDTO.Request.Header responseHeader = new EaiRestResponseDTO.Request.Header();

        responseHeader.setIfId(requestHeader.getIfId());
        responseHeader.setIfTrackingId(requestHeader.getIfTrackingId());
        responseHeader.setIfVer(requestHeader.getIfVer());
        responseHeader.setIfReceiver(requestHeader.getIfReceiver());
        responseHeader.setIfSender(requestHeader.getIfSender());
        //responseHeader.setIfSenderGrp(requestHeader.getIfSenderGrp());
        responseHeader.setIfSenderGrp("HeaderUtil에서 생성된 Header");
        responseHeader.setIfReceiverGrp(requestHeader.getIfReceiverGrp());
        responseHeader.setIfDateTime(requestHeader.getIfDateTime()==""?TimeUtil.getCurrentTime():requestHeader.getIfDateTime());


        return responseHeader;
    }
}

