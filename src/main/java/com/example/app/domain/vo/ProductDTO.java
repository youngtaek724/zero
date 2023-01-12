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
    private String proSellDate;
    private String proSubTitle;
    private String proType;
    private int proStock;
    private String proDiscountPer;
    private String proDiscountYN;

    private List<FileVO> files;
}