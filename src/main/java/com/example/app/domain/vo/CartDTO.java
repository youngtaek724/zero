package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class CartDTO {
    private int userNumber;
    private int proId;
    private int proCount;
    private int proOutput;
    private int proPrice;
    private String categoryName;
    private String categoryName2;
    private String proName;
}
