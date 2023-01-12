package com.example.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class FileVO {

    private Long fileNumber;
    private String fileName;
    private String fileUploadPath;
    private String fileUuid;
    private boolean fileImageCheck;
    private int proId;
}
