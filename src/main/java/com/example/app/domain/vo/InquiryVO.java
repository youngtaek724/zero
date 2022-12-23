package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class InquiryVO {
    private int inqNumber;

    public int getInqNumber() {
        return inqNumber;
    }

    public void setInqNumber(int inqNumber) {
        this.inqNumber = inqNumber;
    }

    public int getInqProductId() {
        return inqProductId;
    }

    public void setInqProductId(int inqProductId) {
        this.inqProductId = inqProductId;
    }

    public int getInqWriter() {
        return inqWriter;
    }

    public void setInqWriter(int inqWriter) {
        this.inqWriter = inqWriter;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getInqDate() {
        return inqDate;
    }

    public void setInqDate(String inqDate) {
        this.inqDate = inqDate;
    }

    public String getInqAnswerYN() {
        return inqAnswerYN;
    }

    public void setInqAnswerYN(String inqAnswerYN) {
        this.inqAnswerYN = inqAnswerYN;
    }

    public String getInqTitle() {
        return inqTitle;
    }

    public void setInqTitle(String inqTitle) {
        this.inqTitle = inqTitle;
    }

    public String getInqSecreatYN() {
        return inqSecreatYN;
    }

    public void setInqSecreatYN(String inqSecreatYN) {
        this.inqSecreatYN = inqSecreatYN;
    }

    public String getInqContent() {
        return inqContent;
    }

    public void setInqContent(String inqContent) {
        this.inqContent = inqContent;
    }

    public String getInqAlertYN() {
        return inqAlertYN;
    }

    public void setInqAlertYN(String inqAlertYN) {
        this.inqAlertYN = inqAlertYN;
    }

    private int inqProductId;
    private int inqWriter;
    private String writer;
    private String inqDate;
    private String inqAnswerYN;
    private String inqTitle;
    private String inqSecreatYN;
    private String inqContent;
    private String inqAlertYN;
}
