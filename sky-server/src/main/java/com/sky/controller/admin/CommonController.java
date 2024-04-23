package com.sky.controller.admin;

import com.sky.result.Result;
import com.sky.utils.AmazonS3Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;


@RestController
@RequestMapping("/admin/common")
@Api(tags = "Common Controllers")
@Slf4j
public class CommonController {

    @Autowired
    private AmazonS3Util amazonS3Util;

    @PostMapping("/upload")
    @ApiOperation("File Upload")
    public Result<String> upload(MultipartFile file){
        log.info("Upload File: {}", file);
        try {
            String originalFileName = file.getOriginalFilename();
            String extension = originalFileName.substring(originalFileName.lastIndexOf('.'));
            String objectName = UUID.randomUUID().toString() + extension;
            String filePath = amazonS3Util.upload(file.getBytes(), objectName);
            return Result.success(filePath);
        } catch (IOException e) {
            log.error("Failed to Upload the File: {}" , e);

        }

        return null;
    }
}
