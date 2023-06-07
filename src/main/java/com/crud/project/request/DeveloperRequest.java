package com.crud.project.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeveloperRequest {

    private String name;
    private String location;
    private int fee;
    private MultipartFile file;
}
