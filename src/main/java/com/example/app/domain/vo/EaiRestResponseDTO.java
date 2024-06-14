package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class EaiRestResponseDTO {
    private Request request;

    public static class Request {
        private Header header;
        private Payload payload;

        public static class Header {
            private String ifId;
            private String ifVer;
            private String ifSenderGrp;
            private String ifSender;
            private String ifReceiverGrp;
            private String ifReceiver;
            private String ifTrackingId;
            private String ifDateTime;

            // Getters and setters
            public String getIfId() { return ifId; }
            public void setIfId(String ifId) { this.ifId = ifId; }
            public String getIfVer() { return ifVer; }
            public void setIfVer(String ifVer) { this.ifVer = ifVer; }
            public String getIfSenderGrp() { return ifSenderGrp; }
            public void setIfSenderGrp(String ifSenderGrp) { this.ifSenderGrp = ifSenderGrp; }
            public String getIfSender() { return ifSender; }
            public void setIfSender(String ifSender) { this.ifSender = ifSender; }
            public String getIfReceiverGrp() { return ifReceiverGrp; }
            public void setIfReceiverGrp(String ifReceiverGrp) { this.ifReceiverGrp = ifReceiverGrp; }
            public String getIfReceiver() { return ifReceiver; }
            public void setIfReceiver(String ifReceiver) { this.ifReceiver = ifReceiver; }
            public String getIfTrackingId() { return ifTrackingId; }
            public void setIfTrackingId(String ifTrackingId) { this.ifTrackingId = ifTrackingId; }
            public String getIfDateTime() { return ifDateTime; }
            public void setIfDateTime(String ifDateTime) { this.ifDateTime = ifDateTime; }
        }

        public static class Payload {
            private String E_IFFAILMSG;
            private String E_RESULT;



            private List<TestTable> TestTable;

            public static class TestTable {
                private String data4 = "test";

                // Getters and setters
                public String getData4() { return data4; }

            }

            // Getters and setters
            public void setE_RESULT(String E_RESULT){this.E_RESULT=E_RESULT;}
            public void setE_IFFAILMSG(String E_IFFAILMSG){this.E_IFFAILMSG=E_IFFAILMSG;}
            public String getE_IFFAILMSG(){return E_IFFAILMSG;}
            public String getE_RESULT(){return E_RESULT;}
        }

        // Getters and setters
        public Header getHeader() { return header; }
        public void setHeader(Header header) { this.header = header; }
        public Payload getPayload() { return payload; }
        public void setPayload(Payload payload) { this.payload = payload; }
    }

    // Getters and setters
    public Request getRequest() { return request; }
    public void setRequest(Request request) { this.request = request; }
}
