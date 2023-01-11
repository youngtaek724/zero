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
    private String addressTwo;
    private String addressThree;

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getMemberAddress1() {
        return memberAddress1;
    }

    public void setMemberAddress1(String memberAddress1) {
        this.memberAddress1 = memberAddress1;
    }

    public String getMemberAddress2() {
        return memberAddress2;
    }

    public void setMemberAddress2(String memberAddress2) {
        this.memberAddress2 = memberAddress2;
    }

    public String getMemberAddress3() {
        return memberAddress3;
    }

    public void setMemberAddress3(String memberAddress3) {
        this.memberAddress3 = memberAddress3;
    }

    public String getBaseAddress() {
        return baseAddress;
    }

    public void setBaseAddress(String baseAddress) {
        this.baseAddress = baseAddress;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getAddressThree() {
        return addressThree;
    }

    public void setAddressThree(String addressThree) {
        this.addressThree = addressThree;
    }
}
