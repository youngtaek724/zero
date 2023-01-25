package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class ProductDTO {

    private int proId;
    private String proCategoryId;
    private String proCode;
    private String proName;
    private int proInput;
    private int proOutput;
    private String proShowYN;
    private String proSellYN;
    private String proInDate;
    private String proInYear;
    private String proInMonth;
    private String proInDay;
    private String proSellDate;
    private String proSubTitle;
    private String proType;
    private int proStock;
    private String proDiscountPer;
    private String proDiscountYN;

    public String getProDiscountPer() {
        return proDiscountPer;
    }

    public void setProDiscountPer(String proDiscountPer) {
        this.proDiscountPer = proDiscountPer;
    }



    public String getProDiscountYN() {
        return proDiscountYN;
    }

    public void setProDiscountYN(String proDiscountYN) {
        this.proDiscountYN = proDiscountYN;
    }

    private List<FileVO> files;
}