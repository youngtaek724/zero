package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class BoardVO {

    private long boardNumber;
    private String boardTitle;
    private String boardContent;
    private long userNumber;
    private String boardRegisterDate;
    private String boardWriter;
    private String boardUpdateDate;
}