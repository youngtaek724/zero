package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class AddressVO {

    private int userNumber;
    private String memberAddress1;
    private String memberAddress2;
    private String memberAddress3;
    private String baseAddress;
}
