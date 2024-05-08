package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class ProductVO {

    private int proId;
    private String proCategoryId;
    private String proCode;
    private String proName;
    private int proInput;
    private int proOutput;
    private String proShowYN;
    private String proSellYN;
    private String proInDate;
    private String proSellDate;
    private String proSubTitle;
    private String proType;
    private int proStock;
    private String proDiscountPer;
    private String proDiscountYN;
    private int proDiscountPrice;

    public String getProInDate() {
        return proInDate;
    }

    public void setProInDate(String proInDate) {
        this.proInDate = proInDate;
    }
}