package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserVO {
    private int userNumber;
    private String userType;
    private String userStatus;
    private String userName;
    private String userId;
    private String userPassword;
    private String userGender;
    private String userEmail;
    private String userPhone;
    private String userAddress;
    private String userDate;
    private String userRegiDate;
    private int r;
}
