package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor @NoArgsConstructor
public class CartVO {
    private int inqNumber;
    private int inqProductId;
    private int inqWriter;
    private String writer;
    private String inqDate;
    private String inqAnswerYN;
    private String inqTitel;
    private String inqContent;
    private String inqAlertYN;
}
