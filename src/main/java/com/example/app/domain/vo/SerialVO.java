package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class SerialVO {

    private String proCode;
    private String proSerial;
    private String proName;
    private int proInput;
    private int proOutput;
    private String proShowYN;
    private String proSellYN;
    private String proInDate;
    private String proOutDate;
    private String proDstatus;
    private String proQstatus;
    private String proSellDate;
    private String proSubTitle;
    private String proLocation;
    private String proType;
    private int proStock;
}