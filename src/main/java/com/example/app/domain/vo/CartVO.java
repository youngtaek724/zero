package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class CartVO {


    private int userNumber;
    private int proId;
    private int proCount;
    private int proPrice;
}
