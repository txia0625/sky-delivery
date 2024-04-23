package com.sky.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sky.amazon-s3")
@Data
public class AmazonS3Properties {

    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;

}
