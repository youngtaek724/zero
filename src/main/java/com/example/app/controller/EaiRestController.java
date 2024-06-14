package com.example.app.controller;

import com.example.app.common.util.HeaderUtil;
import com.example.app.domain.vo.EaiRestResponseDTO;
import com.example.app.domain.vo.eaiRest.UserTestDTO;
import com.example.app.service.EaiRestService;
import com.example.app.service.MemberService;
import com.example.app.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping("/eaiTest/*")
public class EaiRestController {
    private final ReplyService replyService;
    private final MemberService memberService;
    private final EaiRestService eaiRestService;
    private static final Logger LOG = LoggerFactory.getLogger(EaiRestController.class);
    public EaiRestResponseDTO setHeader(EaiRestResponseDTO eaiRestResponseDTO){

        return eaiRestResponseDTO;
    }

    @PostMapping("/insert")
    public EaiRestResponseDTO insertData(@RequestBody UserTestDTO request){
        EaiRestResponseDTO response = new EaiRestResponseDTO();
        EaiRestResponseDTO.Request responseRequest = new EaiRestResponseDTO.Request();

        EaiRestResponseDTO.Request.Header responseHeader = HeaderUtil.createResponseHeader(request.getRequest().getHeader());

        EaiRestResponseDTO.Request.Payload responsePayload = new EaiRestResponseDTO.Request.Payload();

        UserTestDTO.Request.Header requestHeader = request.getRequest().getHeader();
        LOG.info("[LOG.INFO]requestHeader : "+requestHeader);
        LOG.info("[LOG.INFO]requestHeader.class : "+requestHeader.getClass());


        try {
            UserTestDTO.Request.Payload payload = request.getRequest().getPayload();
            String data1 = payload.getData1();
            String data2 = payload.getData2();
            String data3 = payload.getData3();
            String data4 = payload.getData4();

            eaiRestService.insertUser(data1, data2, data3, data4);

            responsePayload.setE_RESULT("S");
            responsePayload.setE_IFFAILMSG("");

        } catch (Exception e) {
            responsePayload.setE_RESULT("F");
            responsePayload.setE_IFFAILMSG(e.getMessage());
        }

        responseRequest.setHeader(responseHeader);
        responseRequest.setPayload(responsePayload);
        response.setRequest(responseRequest);



        return response;
    }



    @PostMapping("/test")
    public EaiRestResponseDTO handleEaiTestRequest(@RequestBody EaiRestResponseDTO request) {
        // 요청 데이터 접근
        EaiRestResponseDTO.Request.Header header = request.getRequest().getHeader();

        // 요청 데이터 예제 출력
        if (header != null) {
            System.out.println("Header ifId: " + header.getIfId());
        }

        // 응답 생성
        EaiRestResponseDTO response = new EaiRestResponseDTO();
        EaiRestResponseDTO.Request responseRequest = new EaiRestResponseDTO.Request();
        // 설정된 값들로 응답 객체 빌드
        EaiRestResponseDTO.Request.Header responseHeader = new EaiRestResponseDTO.Request.Header();
        responseHeader.setIfId("return Data");
        responseHeader.setIfVer("return Data");
        responseHeader.setIfSenderGrp(header.getIfSenderGrp());
        responseHeader.setIfSender(header.getIfSender());
        responseHeader.setIfReceiverGrp(header.getIfReceiverGrp());
        responseHeader.setIfReceiver(header.getIfReceiver());
        responseHeader.setIfTrackingId(header.getIfTrackingId());
        responseHeader.setIfDateTime(header.getIfDateTime());

        EaiRestResponseDTO.Request.Payload responsePayload = new EaiRestResponseDTO.Request.Payload();
        ArrayList list = new ArrayList();
        list.add("test Data1");
        list.add("test Data2");

        responseRequest.setHeader(responseHeader);
        responseRequest.setPayload(responsePayload);
        response.setRequest(responseRequest);

        return response;
    }
}























